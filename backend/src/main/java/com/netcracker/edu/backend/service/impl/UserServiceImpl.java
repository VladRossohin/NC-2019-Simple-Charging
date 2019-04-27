package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.repository.UserRepository;
import com.netcracker.edu.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<Users> findAll(Pageable pageable) {
        return (Page<Users>) userRepository.findAll(pageable);
    }

    @Override
    public List<Users> findAll(Sort sort) {
        return userRepository.findAll(sort);
    }
    /*
    @Override
    public List<User> findAll(Sort sort) {
        return userRepository.findAll(sort.);
    }*/

    /*

        @Override
        public Page<User> findAll(int page, int count, String sort) {
            String[] parameters = sort.split(",");
            if (parameters[1].equals("asc")) {

                Pageable pageRequest = PageRequest.of(page, count, Sort.by(parameters[0]).ascending());
                return userRepository.findAll(pageRequest);
            }

            Pageable pageRequest = PageRequest.of(page, count, Sort.by(parameters[0]).descending());
            return userRepository.findAll(pageRequest);
        }

    */
    @Override
    public Optional<Users> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public Users findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public Users save(Users user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
