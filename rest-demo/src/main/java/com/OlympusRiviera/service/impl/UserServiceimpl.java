//package com.OlympusRiviera.service.impl;
//
//import com.OlympusRiviera.repository.User.UserRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceimpl implements UserDetailsService {
//
//    private final UserRepository repository
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return null;
//    }
//
////    UserRepository userRepository;
////
////    public UserServiceimpl(UserRepository userRepository) {
////        this.userRepository = userRepository;
////    }
////
////    @Override
////    public String createUser(User user) {
////        userRepository.save(user);
////        return "Success";
////    }
////
////    @Override
////    public String updateUser(User cloudVentor) {
//////        more logic
////        userRepository.save(cloudVentor);
////        return "Updated sUCCESS";
////    }
////
////    @Override
////    public String deleteUser(String cloudVentorId) {
////        userRepository.deleteById(cloudVentorId);
////        return "Deleted SSucces";
////    }
////
////    @Override
////    public User getUser(String cloudVendorId) {
////
////        return userRepository.findById(cloudVendorId).get();
////    }
////
////    @Override
////    public List<User> getAllUsers() {
////        return userRepository.findAll();
////    }
//}
