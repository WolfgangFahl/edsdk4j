package edsdk;

import static org.junit.Assert.*;

import org.junit.Test;

import edsdk.utils.CanonConstants;
import edsdk.utils.CanonConstants.EdsAEMode;

/**
 * check that all constants are ok
 * @author wf
 *
 */
public class TestCanonConstants {

  @Test
  public void testConstants() {
    CanonConstants.verifyAllConstants();
    EdsAEMode[] aemodes = CanonConstants.EdsAEMode.values();
    assertEquals(42,aemodes.length);
  }

}
