package meirs.topologymonitor.util.strings;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.BeforeClass;
import org.junit.Test;
import rti.dds.monitoring.DataReaderEntityStatistics;
import rti.dds.monitoring.DataWriterEntityMatchedSubscriptionStatistics;
import rti.dds.monitoring.DataWriterEntityStatistics;

/**
 * Created by Meir Shalev on 22/08/16.
 */
//All tests make sure that the serialization is done without exceptions.
public class StatisticsToJsonTest {

    private static ObjectMapper objectMapper;

    @BeforeClass
    public static void setUp() {
        ObjectMapperFactory mapperFactory = new ObjectMapperFactory();
        objectMapper = mapperFactory.createObjectMapper();
    }

    @Test
    public void testMatchedSubscription() throws Exception {
        DataWriterEntityMatchedSubscriptionStatistics entity = new DataWriterEntityMatchedSubscriptionStatistics();
        objectMapper.writeValueAsString(entity);
    }

    @Test
    public void testWrtierStatistics() throws Exception {
        DataWriterEntityStatistics entity = new DataWriterEntityStatistics();
        objectMapper.writeValueAsString(entity);
    }

    @Test
    public void testReaderStatistics() throws Exception {
        DataReaderEntityStatistics entity = new DataReaderEntityStatistics();
        objectMapper.writeValueAsString(entity);
    }
}
