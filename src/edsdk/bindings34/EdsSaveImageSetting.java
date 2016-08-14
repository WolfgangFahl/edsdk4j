package edsdk.bindings34;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;
import edsdk.bindings34.EdSdkLibrary.EdsStreamRef;
/**
 * <i>native declaration : EDSDK/Header/EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsSaveImageSetting extends Structure {
	/// C type : EdsUInt32
	public NativeLong JPEGQuality;
	/// C type : EdsStreamRef
	public EdsStreamRef iccProfileStream;
	/// C type : EdsUInt32
	public NativeLong reserved;
	public EdsSaveImageSetting() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"JPEGQuality", "iccProfileStream", "reserved"});
	}
	/**
	 * @param JPEGQuality C type : EdsUInt32<br>
	 * @param iccProfileStream C type : EdsStreamRef<br>
	 * @param reserved C type : EdsUInt32
	 */
	public EdsSaveImageSetting(NativeLong JPEGQuality, EdsStreamRef iccProfileStream, NativeLong reserved) {
		super();
		this.JPEGQuality = JPEGQuality;
		this.iccProfileStream = iccProfileStream;
		this.reserved = reserved;
		initFieldOrder();
	}
	public static class ByReference extends EdsSaveImageSetting implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsSaveImageSetting implements Structure.ByValue {
		
	};
}
