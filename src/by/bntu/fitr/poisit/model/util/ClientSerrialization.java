package by.bntu.fitr.poisit.model.util;

import by.bntu.fitr.poisit.view.Console;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;

public class ClientSerrialization {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private String clientFile;

    public ClientSerrialization(String clientFile) {
        this.clientFile = clientFile;
    }

    public void save(Client client){
        try{
            String clients;
            clients = GSON.toJson(client);
            FileWriter fileWriter = new FileWriter(clientFile, false);
            fileWriter.write(clients);
            fileWriter.flush();
            fileWriter.close();
        }catch (IOException ex){

        }
    }

    public Client read(){
        try{
            String clients = "";
            FileReader fileReader = new FileReader(clientFile);
            Scanner in = new Scanner(fileReader);
            while (in.hasNext())
                clients += in.nextLine() + "\r\n";
            in.close();

            Client client = GSON.fromJson(clients, Client.class);
            return client;
        }
        catch (Exception ex){
            return null;
        }
    }
}
