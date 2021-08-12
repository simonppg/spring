package com.spring.basics.tutorial.cdi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeCdiBusinessTest {

  @InjectMocks
  SomeCdiBusiness business;

  @Mock
  SomeCdiDao daoMock;

  @Test
  public void testBasicScenario() {
    when(daoMock.getData()).thenReturn(new int[]{2, 4});
    assertEquals(4, business.findGreatest());
  }

  @Test
  public void testBasicScenario_NoElements() {
    when(daoMock.getData()).thenReturn(new int[]{});
    assertEquals(Integer.MIN_VALUE, business.findGreatest());
  }

  @Test
  public void testBasicScenario_EqualElemtents() {
    when(daoMock.getData()).thenReturn(new int[]{2,2});
    assertEquals(2, business.findGreatest());
  }
}

