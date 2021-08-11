package com.testing.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SomeBusinessStubTest {

  @Test
  public void testFindTheGreatestFromAllData() {
    SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
    int greatest = businessImpl.findTheGreatestFromAllData();
    assertEquals(24, greatest);
  }
}

class DataServiceStub implements DataService {
	@Override
	public int[] retriveAllData() {
		return new int[]{ 24, 6, 15 };
	}
}
