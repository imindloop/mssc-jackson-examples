package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper mapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        //deserializing java object into a String object.
        String jsonString = mapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws IOException {
        String json = "{\"id\":\"2c3ccbbe-8f31-48ba-9fa5-40955558d26f\",\"beerName\":\"Estrellita\",\"beerStyle\":\"PALE ALE\",\"upc\":30005816545,\"price\":11.50,\"createdDate\":\"2023-01-16T09:27:24.749071-07:00\",\"lastUpdatedDate\":\"2023-01-16T09:27:24.750125-07:00\"}\n";

        BeerDto beerDto = mapper.readValue(json, BeerDto.class);

        System.out.println(beerDto.getBeerName());
    }

}