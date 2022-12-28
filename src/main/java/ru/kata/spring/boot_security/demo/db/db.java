//package ru.kata.spring.boot_security.demo.db;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import ru.kata.spring.boot_security.demo.models.Role;
//import ru.kata.spring.boot_security.demo.models.User;
//import ru.kata.spring.boot_security.demo.services.RoleService;
//import ru.kata.spring.boot_security.demo.services.UserService;
//
//import javax.annotation.PostConstruct;
//import java.util.HashSet;
//import java.util.Set;
//@Component
//public class db {
//    private final UserService userService;
//    private final RoleService roleService;
//
//    @Autowired
//      public db(UserService userService, RoleService roleService) {
//        this.userService = userService;
//        this.roleService = roleService;
//    }
//
//
//    @PostConstruct
//    public void initDB() {
//        Role roleAdmin = new Role(1L, "ROLE_ADMIN");
//        Role roleUser = new Role(2L, "ROLE_USER");
//        Set<Role> adminSet = new HashSet<>();
//        Set<Role> userSet = new HashSet<>();
//
//        roleService.addRole(roleAdmin);
//        roleService.addRole(roleUser);
//
//        adminSet.add(roleAdmin);
//        adminSet.add(roleUser);
//        userSet.add(roleUser);
//
//        User admin = new User("admin", "admin",
//                "Messi", "Leonel", 35,
//                "u1@e1.ru", adminSet);
//        admin.setId(1L);
//
//        User user = new User("user", "user",
//                "Anhel", "DiMaria", 33,
//                "u2@e1.ru", userSet);
//        user.setId(2L);
//
////        roleAdmin.setUsers(new HashSet<>(Collections.singleton(admin)));
////        roleUser.setUsers(new HashSet<>(List.of(admin, user)));
//
//        userService.saveUser(admin);
//        userService.saveUser(user);
//
//    }
//}
