package j$.util.stream;

import java.security.AccessController;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c5 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new j$.nio.file.i((byte) 3))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(j$.desugar.sun.nio.fs.i.a(String.valueOf(cls), " tripwire tripped but logging not supported: ", str));
    }
}
