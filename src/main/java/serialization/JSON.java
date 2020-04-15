package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Category;
import dto.Pet;
import dto.Tag;

import java.io.File;
import java.io.IOException;

public class JSON {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String photoUrls[] = new String[0];
        Tag tag = new Tag("First tag", "999");
        Tag tags[] = new Tag[1];
        tags[0] = tag;
        Category category = new Category("Dog", "888");


        Pet pet = new Pet(photoUrls, "Geisha", "231134124312", category, tags, "200");
        objectMapper.writeValue(new File("./FileWriterJSON.json"), pet);

        Pet readValue = objectMapper.readValue(new File("./FileWriterJSON.json"), Pet.class);
        System.out.println(readValue);
    }
}
