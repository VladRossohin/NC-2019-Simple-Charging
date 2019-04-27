package com.netcracker.edu.backend.dto;

import com.netcracker.edu.backend.entity.*;
import com.netcracker.edu.backend.repository.BillingAccountRepository;
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

    @Autowired
    public Converter (
            UserRepository userRepository,
            ServiceRepository serviceRepository,
            BillingAccountRepository billingAccountRepository){
        Converter.userRepository = userRepository;
        Converter.serviceRepository = serviceRepository;
        Converter.billingAccountRepository = billingAccountRepository;

    }


    /*public Users fromDto(UserDto userDto) {
        return new Users(
                userDto.getLogin(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),

        );
    }*/

    public static UserDto toDto(Users user) {
        return new UserDto(
          user.getLogin(),
          user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getRolesByRoleId().getRole()
        );
    }

    public static ServiceDto toDto(Services service) {

        return new ServiceDto(
                service.getName(),
                service.getDescription(),
                service.getUsersByUserId().getLogin(),
                service.getCost(),
                service.getCreateDate()
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

