/**
 * 
 */
package edsdk;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jna.NativeLong;

import edsdk.api.BaseCanonCamera;
import edsdk.api.CanonCamera;
import edsdk.api.CanonCamera34;
import edsdk.bindings.EdSdkLibrary;

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
        NativeLong callResult = edsdk.EdsInitializeSDK();
        int result = edsdk.EdsInitializeSDK().intValue();
        check( result );
    }
    

    @Test
    public void testInitializationCanonCamera() {
        BaseCanonCamera.debug=true;
        EdSdkLibrary edsdk = CanonCamera.EDSDK;
        assertNotNull(edsdk);
        System.out.println(edsdk.getClass().getName());
        NativeLong callResult = edsdk.EdsInitializeSDK();
        int result = edsdk.EdsInitializeSDK().intValue();
        check( result );
    }

}
