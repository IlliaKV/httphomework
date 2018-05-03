package homework4http;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws UnirestException {
        App app = new App();
        //String response = null;


        /*String bodyUpdate = "{ \"id\": 666, \"category\": { \"id\": 666, \"name\": \"string\" }, \"name\": \"bohich\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 666, \"name\": \"string\" } ], \"status\": \"available\" }";
        response = SwaggerAPI.putPet(bodyUpdate);*/
        //response = SwaggerAPI.getPetFindByStatus();
        //response = SwaggerAPI.getPetById(666);
        //response = SwaggerAPI.deletePetById(666);

        //String storeBody = "{ \"id\": 666, \"petId\": 666, \"quantity\": 0, \"shipDate\": \"2018-05-03T17:32:35.679Z\", \"status\": \"placed\", \"complete\": false }";

        //String userBody = "{ \"id\": 666, \"username\": \"string\", \"firstName\": \"string\", \"lastName\": \"string\", \"email\": \"string\", \"password\": \"string\", \"phone\": \"string\", \"userStatus\": 0 }";

        //System.out.println(response);

        while (true){
            System.out.println("Menu\n" +
                    "\n" +
                    "1.1 postPet(String content)\n" +
                    "1.2 putPet(String content)\n" +
                    "1.3 getPetFindByStatus()\n" +
                    "1.4 getPetById(int id)\n" +
                    "1.5 deletePetById(int id)\n" +
                    "\n" +
                    "2.1 getStoreInventory()\n" +
                    "2.2 postStoreOder(String content)\n" +
                    "2.3 getStoreOrderById(int id)\n" +
                    "2.4 deleteStoreOrderById(int id)\n" +
                    "\n" +
                    "3.1 postUser(String content)\n" +
                    "3.2 getUserByUsername(String username)\n" +
                    "3.3 putUserByUsername(String username, String content)\n" +
                    "3.4 deleteUserByUsername(String username)\n" +
                    "\n" +
                    "4 - Exit");
            Scanner scan = new Scanner(System.in);
            String number = scan.next();

            switch (number){
                case "1.1": {
                    System.out.println("\n1.1 postPet(String content)\n");
                    String body = "{ \"id\": 666, \"category\": { \"id\": 666, \"name\": \"string\" }, \"name\": \"doggie\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 666, \"name\": \"string\" } ], \"status\": \"available\" }";
                    String response = SwaggerAPI.postPet(body);
                    System.out.println(response);
                    break;
                }
                case "1.2": {
                    System.out.println("\n1.2 putPet(String content)\n");
                    String bodyUpdate = "{ \"id\": 666, \"category\": { \"id\": 666, \"name\": \"string\" }, \"name\": \"bohich\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 666, \"name\": \"string\" } ], \"status\": \"available\" }";
                    String response = SwaggerAPI.putPet(bodyUpdate);
                    System.out.println(response);
                    break;
                }
                case "1.3": {
                    System.out.println("\n1.3 getPetFindByStatus()\n");
                    String response = SwaggerAPI.getPetFindByStatus();
                    System.out.println(response);
                    break;
                }
                case "1.4": {
                    System.out.println("\n1.4 getPetById(int id)\n");
                    String response = SwaggerAPI.getPetById(666);
                    System.out.println(response);
                    break;
                }
                case "1.5": {
                    System.out.println("\ndeletePetById(int id)\n");
                    String response = SwaggerAPI.deletePetById(666);
                    System.out.println(response);
                    break;
                }
                case "2.1": {
                    System.out.println("\n2.1 getStoreInventory()\n\n");
                    String response = SwaggerAPI.getStoreInventory();
                    System.out.println(response);
                    break;
                }
                case "2.2": {
                    System.out.println("\n2.2 postStoreOder(String content)\n\n");
                    String storeBody = "{ \"id\": 666, \"petId\": 666, \"quantity\": 0, \"shipDate\": \"2018-05-03T17:32:35.679Z\", \"status\": \"placed\", \"complete\": false }";
                    String response = SwaggerAPI.postStoreOder(storeBody);
                    System.out.println(response);
                    break;
                }
                case "2.3": {
                    System.out.println("\n2.3 getStoreOrderById(int id)\n");
                    String response = SwaggerAPI.getStoreOrderById(666);
                    System.out.println(response);
                    break;
                }
                case "2.4": {
                    System.out.println("\n2.4 deleteStoreOrderById(int id)\n\n");
                    String response = SwaggerAPI.deleteStoreOrderById(666);
                    System.out.println(response);
                    break;
                }

/**/
                case "3.1": {
                    System.out.println("\n3.1 postUser(String content)\n");
                    String userBody = "{ \"id\": 666, \"username\": \"string\", \"firstName\": \"string\", \"lastName\": \"string\", \"email\": \"string\", \"password\": \"string\", \"phone\": \"string\", \"userStatus\": 0 }";
                    String response = SwaggerAPI.postUser(userBody);
                    System.out.println(response);
                    break;
                }
                case "3.2": {
                    System.out.println("\n3.2 getUserByUsername(String username)\n");
                    String username = "string";
                    String response = SwaggerAPI.getUserByUsername(username);
                    System.out.println(response);
                    break;
                }
                case "3.3": {
                    System.out.println("\n3.3 putUserByUsername(String username, String content)\n");
                    String username = "string";
                    String userBody = "{ \"id\": 666, \"username\": \"Abes\", \"firstName\": \"string\", \"lastName\": \"string\", \"email\": \"string\", \"password\": \"string\", \"phone\": \"string\", \"userStatus\": 0 }";
                    String response = SwaggerAPI.putUserByUsername(username, userBody);
                    System.out.println(response);
                    break;
                }
                case "3.4": {
                    System.out.println("\n3.4 deleteUserByUsername(String username)\n\n");
                    String username = "Abes";
                    String response = SwaggerAPI.deleteUserByUsername(username);
                    System.out.println(response);
                    break;
                }
                case "4": {
                    System.exit(0);
                }
            }
        }
    }
}