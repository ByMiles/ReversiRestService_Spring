package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Rest-Service-ReversiByMiles ;-)");
        frame.setSize(300, 100);
        frame.add(new JLabel("close me to quit server-service!"));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        SpringApplication.run(Application.class, args);
    }
}