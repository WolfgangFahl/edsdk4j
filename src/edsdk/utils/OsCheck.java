package edsdk.utils;

import java.util.Locale;
/**
 * Copyright (C) 2013 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 */

/**
 * helper class to check the operating system this Java VM runs in
 * http://stackoverflow.com/questions/228477/how-do-i-programmatically-determine-operating-system-in-java
 * compare to http://svn.terracotta.org/svn/tc/dso/tags/2.6.4/code/base/common/src/com/tc/util/runtime/Os.java
 * http://www.docjar.com/html/api/org/apache/commons/lang/SystemUtils.java.html
 */
public final class OsCheck {
	/**
	 * types of Operating Systems
	 */
	public enum OSType {
		Windows, MacOS, Linux, Other
	};

	public static OsCheck.OSType detectedOS;
	
	
	/**
	 * get the OS Name
	 * @return
	 */
	public static String getOSName() {
	  String osname=System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
	  return osname;
	}

	/**
	 * detected the operating system from the os.name System property and cache
	 * the result
	 * 
	 * @returns - the operating system detected
	 */
	public static OsCheck.OSType getOperatingSystemType() {
		if (detectedOS == null) {
			String OS = getOSName();
			if (OS.indexOf("win") >= 0) {
				detectedOS = OSType.Windows;
			} else if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
				detectedOS = OSType.MacOS;
			} else if (OS.indexOf("nux") >= 0) {
				detectedOS = OSType.Linux;
			} else {
				detectedOS = OSType.Other;
			}
		}
		return detectedOS;
	}
}