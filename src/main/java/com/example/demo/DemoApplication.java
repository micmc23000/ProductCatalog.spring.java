package com.example.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //
        //  Press anykey to quit
        //
        System.out.println("Press Enter to exit.");
        var scanner = new Scanner(System.in);
        var key = scanner.nextLine();
        System.exit(-1);
    }

}
