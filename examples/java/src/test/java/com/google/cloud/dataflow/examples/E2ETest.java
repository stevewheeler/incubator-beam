package com.google.cloud.dataflow.examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 * Base class for all end-to-end tests for Apache Beam.
 */
public abstract class E2ETest {
  /**
   * @return String with a unique test identifier based on the current date, time, and a random int.
   */
  protected String generateTestIdentifier() {
    int random = new Random().nextInt(10000);
    DateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
    Calendar cal = Calendar.getInstance();
    String now = dateFormat.format(cal.getTime());    
    return now + random;
  }
}

