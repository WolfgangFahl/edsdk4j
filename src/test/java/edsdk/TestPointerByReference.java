package edsdk;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.PointerByReference;

import edsdk.bindings.EdSdkLibrary.EdsCameraListRef;

public class TestPointerByReference {

	@Test
	public void testPointerByReference() {
		EdsCameraListRef listRef = new EdsCameraListRef();
		Class<? extends EdsCameraListRef> clazz = listRef.getClass();
		String className = clazz.getName();
		assertTrue(listRef instanceof PointerType);
		System.out.println(className);
	}

}
