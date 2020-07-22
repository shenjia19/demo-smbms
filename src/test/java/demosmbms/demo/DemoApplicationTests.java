package demosmbms.demo;

import demosmbms.demo.dao.ProviderDao;
import demosmbms.demo.service.ProviderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    ProviderDao providerDao;
    @Autowired
    ProviderServiceImpl providerService;

    @Test
    void contextLoads() {
        System.out.println(providerDao.getAllProvider());
        System.out.println(providerService.providerGetAll());
    }

}
