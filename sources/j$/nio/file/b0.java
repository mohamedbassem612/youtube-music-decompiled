package j$.nio.file;

import java.security.AccessController;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b0 {
    public static final Path a;
    public static final boolean b;
    public static final SecureRandom c;

    static {
        String property;
        if (System.getSecurityManager() == null) {
            property = System.getProperty("java.io.tmpdir");
        } else {
            j$.sun.security.action.a aVar = new j$.sun.security.action.a();
            aVar.b = "java.io.tmpdir";
            property = (String) AccessController.doPrivileged(aVar);
        }
        a = Path.CC.of(property, new String[0]);
        b = FileSystems.getDefault().i().contains("posix");
        c = new SecureRandom();
    }

    public static Path a(String str, String str2, Path path) {
        String str3;
        long jNextLong = c.nextLong();
        if (jNextLong == 0) {
            str3 = "0";
        } else if (jNextLong > 0) {
            str3 = Long.toString(jNextLong, 10);
        } else {
            char[] cArr = new char[64];
            long j = (jNextLong >>> 1) / 5;
            int i = 63;
            cArr[63] = Character.forDigit((int) (jNextLong - (j * 10)), 10);
            while (j > 0) {
                i--;
                cArr[i] = Character.forDigit((int) (j % 10), 10);
                j /= 10;
            }
            str3 = new String(cArr, i, 64 - i);
        }
        Path path2 = path.getFileSystem().getPath(j$.desugar.sun.nio.fs.i.a(str, str3, str2), new String[0]);
        if (path2.getParent() == null) {
            return path.i(path2);
        }
        j$.time.g.a("Invalid prefix or suffix");
        return null;
    }
}
