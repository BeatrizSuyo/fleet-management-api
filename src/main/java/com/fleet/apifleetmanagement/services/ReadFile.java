package com.fleet.apifleetmanagement.services;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;
@Service
public class ReadFile{

        public static String readFile(String path ) {
            StringBuilder content = new StringBuilder();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();
            } catch (IOException ignored) {

            }
            return content.toString();
        }


}