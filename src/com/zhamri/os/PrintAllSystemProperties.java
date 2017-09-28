//https://alvinalexander.com/blog/post/java/how-determine-application-running-mac-os-x-osx-version

package com.zhamri.os;

import java.util.Properties;

public class PrintAllSystemProperties {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.list(System.out);
	}
}
