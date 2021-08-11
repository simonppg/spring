package com.testing.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationsTest {
  @Mock
  DataService dataServiceMock;

  @InjectMocks
  SomeBusinessImpl businessImpl;

  @Test
  public void testFindTheGreatestFromAllData() {
    when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 24, 15, 3 });
    assertEquals(24, businessImpl.findTheGreatestFromAllData());
  }

  @Test
  public void testFindTheGreatestFromAllData_ForOneValue() {
    when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 15 });
    assertEquals(15, businessImpl.findTheGreatestFromAllData());
  }

  @Test
  public void testFindTheGreatestFromAllData_NotValues() {
    when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
    assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
  }
}
