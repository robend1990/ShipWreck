package com.shipwreck;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.shipwreck.controller.ShipwreckController;
import com.shipwreck.model.Shipwreck;
import com.shipwreck.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	ShipwreckController shipwreckController;
	
	@Mock
	ShipwreckRepository shipwreckRepository;
	
	//looks through passed testClass for @injectsMocks and @Mock to see if
	//they need to be pushed together. Repository is Autowired in 
	//controller so it will be setted by mockito much like spring would do it
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testGet() {
		Shipwreck wreckStub = new Shipwreck();
		wreckStub.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(wreckStub);
		
		Shipwreck wreck = shipwreckController.get(1l);
		verify(shipwreckRepository).findOne(1l);
		//assert with Junit
		assertEquals(1l, wreck.getId().longValue());
		//assert with Hamcrest
		assertThat(wreck.getId(), is(1l));
	}
}
