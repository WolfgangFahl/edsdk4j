package edsdk.api;

import com.sun.jna.Native;
import com.sun.jna.Library;
import com.sun.jna.Function;
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
        // options.put(Library.OPTION_CALLING_CONVENTION, Function.ALT_CONVENTION);
        // options.put(Library.OPTION_CALLING_CONVENTION, Function.C_CONVENTION);
        EDSDK = (EdSdkLibrary) Native.loadLibrary( edsdkDllLoc, EdSdkLibrary.class, options );
    }
}
