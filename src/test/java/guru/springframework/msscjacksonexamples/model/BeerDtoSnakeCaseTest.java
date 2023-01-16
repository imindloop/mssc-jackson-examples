package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;


/**
 * When we define a resource file with name "application-something.properties"
 * that something is a profile name that can be applied to a test suite by using
 * @ActiveProfiles(something)
 */

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeCaseTest extends BaseTest{

    @Autowired
    ObjectMapper mapper;

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto = getDto();

        String json = mapper.writeValueAsString(dto);

        System.out.println(json);


    }
}
