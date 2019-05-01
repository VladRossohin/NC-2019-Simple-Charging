package com.netcracker.edu.backend.dto;

import com.netcracker.edu.backend.entity.*;
import com.netcracker.edu.backend.repository.BillingAccountRepository;
import com.netcracker.edu.backend.repository.RoleRepository;
import com.netcracker.edu.backend.repository.ServiceRepository;
import com.netcracker.edu.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Converter {
    private static UserRepository userRepository;
    private static ServiceRepository serviceRepository;
    private static BillingAccountRepository billingAccountRepository;
    private static RoleRepository roleRepository;

    @Autowired
    public Converter (
            UserRepository userRepository,
            ServiceRepository serviceRepository,
            BillingAccountRepository billingAccountRepository,
            RoleRepository roleRepository
    ){
        Converter.userRepository = userRepository;
        Converter.serviceRepository = serviceRepository;
        Converter.billingAccountRepository = billingAccountRepository;
        Converter.roleRepository = roleRepository;
    }


    public static Users fromDto(UserDto userDto) {
        return new Users(
                userDto.getLogin(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPassword(),
                roleRepository.findByRole(userDto.getRole())
        );
    }

    public static UserDto toDto(Users user) {
        return new UserDto(
          user.getLogin(),
          user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getRolesByRoleId().getRole()
        );
    }

    public static Services fromDto(ServiceDto serviceDto) {
        return new Services(
                serviceDto.getName(),
                serviceDto.getDescription(),
                serviceDto.getCost(),
                serviceDto.getCreateDate(),
                userRepository.findByLogin(serviceDto.getUserLogin())
                );
    }

    public static ServiceDto toDto(Services service) {

        return new ServiceDto(
                service.getId(),
                service.getName(),
                service.getDescription(),
                service.getUsersByUserId().getLogin(),
                service.getCost(),
                service.getCreateDate()
        );
    }

    public static BillingAccounts fromDto(BillingAccountDto billingAccountDto) {
        return new BillingAccounts(
          billingAccountDto.getType(),
          billingAccountDto.getNumber(),
          billingAccountDto.getMoney(),
          userRepository.findByLogin(billingAccountDto.getUserLogin())
        );
    }

    public static BillingAccountDto toDto(BillingAccounts billingAccount) {
        return new BillingAccountDto(
                billingAccount.getType(),
                billingAccount.getNumber(),
                billingAccount.getMoney(),
                billingAccount.getUsersByUserId().getLogin()
        );
    }

    public static Subscribes fromDto(SubscribeDto subscribeDto) {
        return new Subscribes(
                subscribeDto.getCreateDate(),
                subscribeDto.getPeriod(),
                userRepository.findByLogin(subscribeDto.getUserLogin()),
                billingAccountRepository.findByNumber(subscribeDto.getBillingAccountsNumber()),
                serviceRepository.findByName(subscribeDto.getServicesName())
        );
    }

    public static SubscribeDto toDto(Subscribes subscribe) {
        return new SubscribeDto(
                subscribe.getUsersByUserId().getLogin(),
                subscribe.getBillingAccountsByBaId().getNumber(),
                subscribe.getServicesByServiceId().getName(),
                subscribe.getDate(),
                subscribe.getPeriod()
        );
    }
}

