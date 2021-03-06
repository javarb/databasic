package co.org.osso.databasic;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JacksonObjectMapper {


    /**
     * Processing JSON file
     * @param jsonFile The file provided in path
     */
    public void processJSONFile (String jsonFile) {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = null;

        try {
             rootNode = objectMapper.readTree(openJSONFile(jsonFile));

        } catch (IOException e) {
            throw new RuntimeException(e);
            /*System.err.println("Error: cannot open file: " + jsonFile);
            e.printStackTrace();
            return;*/
        }
        /*Por el momento lo unico que hace es abrir el archivo e imprimir esto*/
        JsonNode personNode = rootNode.path("person");
        System.out.println("personNode = " + personNode);

        /*JsonNode nameNode = rootNode.path("name");
        JsonNode ageNode = rootNode.path("age");
        System.out.println("nameNode.asText() = " + nameNode.asText());
        System.out.println("ageNode.asInt() = " + ageNode.asInt());
        */
    }

    /**
     * Open the JSON File with ObjectMapper readTree() and look for fields to validate
     * @param jsonFile The file provided in path
     * @return the JSON data
     */
    private byte[] openJSONFile(String jsonFile) {

        byte[] jsonData = new byte[0];
        //ObjectMapper objectMapper = new ObjectMapper();

        try {
            jsonData = Files.readAllBytes(Paths.get(jsonFile));

        } catch (IOException io) {
            throw new RuntimeException("Error: Cannot open JSON file: " + jsonFile, io);
            /*System.err.println("Error: cannot open JSON file: " + jsonFile);
            io.printStackTrace();*/

        }
        
        return jsonData;
    }

}