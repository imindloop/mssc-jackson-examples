package guru.springframework.msscjacksonexamples.model;

import org.assertj.core.data.Offset;
import org.springframework.aop.target.AbstractBeanFactoryBasedTargetSource;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto() {

        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Estrellita")
                .beerStyle("PALE ALE")
                .price(new BigDecimal("11.50"))
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .upc(30005816545L)
                .build();
    }

}
