package org.pattern.strategy;


import org.pattern.strategy.auth.UserChecker;
import org.pattern.strategy.strategy.DBAuth;
import org.pattern.strategy.strategy.FileAuth;

import java.io.File;



public class  Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
