/**
 * 
 */
package edsdk;

import static org.junit.Assert.*;

import org.junit.Test;

import edsdk.api.BaseCanonCamera;
import edsdk.api.CanonCamera34;
import edsdk.bindings34.EdSdkLibrary;

/**
 * test the generated EDSDK files
 * @author wf
 *
 */
public class TestEDSDK extends EDSDKBaseTest {

    @Test
    public void testInitialization() {
        BaseCanonCamera.debug=true;
        EdSdkLibrary edsdk = CanonCamera34.EDSDK;
        assertNotNull(edsdk);
        System.out.println(edsdk.getClass().getName());
        int result = edsdk.EdsInitializeSDK().intValue();
        check( result );
    }

}
