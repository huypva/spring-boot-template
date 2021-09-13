package io.codebyexample.helloworld.dataprovider.id;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Component
public class RandomIdProvider implements IdProvider {

  @Override
  public int genId() {
    return new Random().nextInt();
  }
}
