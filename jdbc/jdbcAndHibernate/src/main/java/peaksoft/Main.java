package peaksoft;

import peaksoft.config.Config;
import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        //***************** реализуйте алгоритм здесь  ****************************
        //Config.getSession();
        //service.dropUsersTable();
        //service.saveUser(new User("Arlan","Zaurov",(byte)21));
        //service.removeUserById(20L);
       // service.getAllUsers();
        System.out.println(service.getAllUsers());
    }
}
