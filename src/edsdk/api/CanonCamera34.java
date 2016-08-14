package edsdk.api;

import com.sun.jna.Native;

import edsdk.bindings34.EdSdkLibrary;
/**
 * this class is a EDSDK Version 3.4 implementation that should work on MacOSX
 * @author wf
 *
 */
public class CanonCamera34 extends BaseCanonCamera {
 // This gives you direct access to the EDSDK
    public static EdSdkLibrary EDSDK = null;

    static {
        initLibrary();
        EDSDK = (EdSdkLibrary) Native.loadLibrary( edsdkDllLoc, EdSdkLibrary.class, options );
    }
}
