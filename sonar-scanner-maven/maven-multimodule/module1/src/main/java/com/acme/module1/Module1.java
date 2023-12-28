package com.acme.module1;

import java.util.logging.Logger;

public class Module1 {

  Logger logger = Logger.getLogger(getClass().getName());

  public void coveredByUnitTest() {
    logger.info("This method is covered by unit test");
  }

  public void coveredByIntegrationTest() {
    logger.info("This Module1 method is covered by integration test");
  }

  public void covered() {
    logger.info("This method is now covered");
  }

}
