package junit.org.rapidpm.vaadin.devday2017.frp.ui.components.demo03.v001;

import org.junit.Ignore;
import org.junit.Test;
import org.rapidpm.vaadin.devday2017.frp.ui.components.demo03.DemoIDComponent;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;

/**
 *
 */
public class DemoIDComponentTest extends TestBenchTestCase {


  @Ignore
  @Test // junit 4
  public void test001() throws Exception {
    $(ButtonElement.class)
        .id(DemoIDComponent.BTN_ID);
  }
}
