package es.joseluisgs.dam.blog.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserDTO {
    private Long id;
    private String nombre;
    private String email;
    private LocalDate fechaRegistro;
    private String password;

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        return prettyGson.toJson(this);
    }

    public static CategoryDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return  gson.fromJson(json, CategoryDTO.class);
    }
}