package com.robb1e.simplebdd;

import java.lang.reflect.Method;

public class SimpleBdd {

  public void given(String behavior) throws Exception {
    behave(behavior);
  }

  public void when(String behavior) throws Exception {
    behave(behavior);
  }

  public void then(String behavior) throws Exception {
    behave(behavior);
  }

  private void behave(String behavior) throws Exception {
    Method method = getClass().getMethod(behavior);
    method.invoke(this);
  }

}
