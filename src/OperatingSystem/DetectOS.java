//http://memorynotfound.com/detect-os-name-version-java/
package OperatingSystem;

import java.io.IOException;
import java.util.Locale;

class OSInfo {

    public enum OS {
        WINDOWS, UNIX, POSIX_UNIX, MAC, OTHER;

        private String version;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

    private static OS os = OS.OTHER;

    static {
        try {
            String osName = System.getProperty("os.name");
            if (osName == null) {
                throw new IOException("os.name not found");
            }
            osName = osName.toLowerCase(Locale.ENGLISH);
            if (osName.contains("windows")) {
                os = OS.WINDOWS;
            } else if (osName.contains("linux") || osName.contains("mpe/ix") || osName.contains("freebsd")
                    || osName.contains("irix") || osName.contains("digital unix") || osName.contains("unix")) {
                os = OS.UNIX;
            } else if (osName.contains("mac os")) {
                os = OS.MAC;
            } else if (osName.contains("sun os") || osName.contains("sunos") || osName.contains("solaris")) {
                os = OS.POSIX_UNIX;
            } else if (osName.contains("hp-ux") || osName.contains("aix")) {
                os = OS.POSIX_UNIX;
            } else {
                os = OS.OTHER;
            }

        } catch (Exception ex) {
            os = OS.OTHER;
        } finally {
            os.setVersion(System.getProperty("os.version"));
        }
    }

    public static OS getOs() {
        return os;
    }
}

public class DetectOS {

    public static void main(String... args) {
        System.out.println("OS: " + OSInfo.getOs());
        System.out.println("OS version: " + OSInfo.getOs().getVersion());
        System.out.println("Is mac? " + OSInfo.OS.MAC.equals(OSInfo.getOs()));
    }
}
