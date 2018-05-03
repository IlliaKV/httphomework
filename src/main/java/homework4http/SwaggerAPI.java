package homework4http;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SwaggerAPI {
    public static final String API_KEY = "AIzaSyCrVQPr-LRlFYQkpipjrY0x1HGYAwoP7E8";

    public static String postPet(String content) throws UnirestException {
        HttpResponse<String> response = Unirest.post("http://petstore.swagger.io/v2/pet")
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .queryString("Content-Type", "application/json")
                .body(content)
                .asString();
        return response.getBody();
    }

    public static String putPet(String content) throws UnirestException {
        HttpResponse<String> response = Unirest.put("http://petstore.swagger.io/v2/pet")
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .queryString("Content-Type", "application/json")
                .body(content)
                .asString();
        return response.getBody();
    }

    public static String getPetFindByStatus() throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://petstore.swagger.io/v2/pet/findByStatus?status=sold")
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .asString();
        return response.getBody();
    }

    public static String getPetById(int id) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://petstore.swagger.io/v2/pet/" + id)
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .asString();
        return response.getBody();
    }

    public static String deletePetById(int id) throws UnirestException {
        HttpResponse<String> response = Unirest.delete("http://petstore.swagger.io/v2/pet/" + id)
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .asString();
        return String.valueOf(response.getStatus());
    }

    public static String getStoreInventory() throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://petstore.swagger.io/v2/store/inventory")
                .queryString("accept", "application/json")
                .queryString("api_key", API_KEY)
                .asString();
        return response.getBody();
    }

    public static String postStoreOder(String content) throws UnirestException {
        HttpResponse<String> response = Unirest.post("http://petstore.swagger.io/v2/pet")
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .queryString("Content-Type", "application/json")
                .body(content)
                .asString();
        return response.getBody();
    }

    public static String getStoreOrderById(int id) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://petstore.swagger.io/v2/store/order/" + id)
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .asString();
        return response.getBody();
    }

    public static String deleteStoreOrderById(int id) throws UnirestException {
        HttpResponse<String> response = Unirest.delete("http://petstore.swagger.io/v2/store/order/" + id)
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .asString();
        return String.valueOf(response.getStatus());
    }

    public static String postUser(String content) throws UnirestException {
        HttpResponse<String> response = Unirest.post("http://petstore.swagger.io/v2/user")
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .queryString("Content-Type", "application/json")
                .body(content)
                .asString();
        return response.getBody();
    }

    public static String getUserByUsername(String username) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://petstore.swagger.io/v2/user/" + username)
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .asString();
        return response.getBody();
    }

    public static String putUserByUsername(String username, String content) throws UnirestException {
        HttpResponse<String> response = Unirest.put("http://petstore.swagger.io/v2/user/" + username)
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .queryString("Content-Type", "application/json")
                .body(content)
                .asString();
        return String.valueOf(response.getStatus());
    }

    public static String deleteUserByUsername(String username) throws UnirestException {
        HttpResponse<String> response = Unirest.delete("http://petstore.swagger.io/v2/store/order/" + username)
                .queryString("api_key", API_KEY)
                .queryString("accept", "application/json")
                .asString();
        return String.valueOf(response.getStatus());
    }
}
