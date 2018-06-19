import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class JacksonObjectMapper {

    void processJSONFile(String jsonFile) {
        openJSONFile(jsonFile);
    }

    /*
    * Open the JSON File with ObjectMapper readTree() and look for fields to validate
    * Trowing an Error
    * */
    private void openJSONFile(String jsonFile) {

        ObjectMapper objectMapper = new ObjectMapper();

        // Is needed to initialize here if we return
        //byte[] jsonData = new byte[0];

        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(jsonFile));
            System.out.println("jsonData = " + new String(jsonData));
            JsonNode rootNode = objectMapper.readTree(jsonData);
            JsonNode nameNode = rootNode.path("name");
            JsonNode ageNode = rootNode.path("age");
            System.out.println("nameNode.asText() = " + nameNode.asText());
            System.out.println("ageNode.asInt() = " + ageNode.asInt());

        } catch (IOException io) {
            System.err.println("Error: cannot open JSON file: " + jsonFile);
            io.printStackTrace();

        }
    }

    // If I put exception handling here I have to do this for all invoking methods also...¿ It's a good practice?
    // Q: If I am handling exception (try/catch) inside the method OpenJSONFile why I should to use it here also?

    //public void processJSONFile(String jsonFile) throws IOException {
    /*ObjectMapper objectMapper = new ObjectMapper();

        // If I put throws IOException in method
        //JsonNode rootNode = objectMapper.readTree(openJSONFile(jsonFile));

        // Or I have to use a try/catch
        try {
            JsonNode rootNode = objectMapper.readTree(openJSONFile(jsonFile));
            JsonNode nameNode = rootNode.path("name");
            JsonNode ageNode = rootNode.path("age");
            System.out.println("nameNode.asText() = " + nameNode.asText());
            System.out.println("ageNode.asInt() = " + ageNode.asInt());

        } catch (IOException e) {
            System.err.println("Error: cannot open file: " + jsonFile);
            io.printStackTrace();
        }
    }*/


}