package com.shipwreck;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shipwreck.model.Shipwreck;
import com.shipwreck.repository.ShipwreckRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShipwreckRepositoryIntegrationTest {

	@Autowired
	ShipwreckRepository shipwreckRepository;
	
	@Test
	public void testFindAll() {
		List<Shipwreck> wrecks = shipwreckRepository.findAll();
		assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
	}
}
