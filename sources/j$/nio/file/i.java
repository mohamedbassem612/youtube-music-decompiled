package j$.nio.file;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements PrivilegedAction {
    public final /* synthetic */ byte a;

    public /* synthetic */ i(byte b) {
        this.a = b;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                j$.nio.file.spi.c cVar = j$.adapter.b.a;
                String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
                if (property == null) {
                    return cVar;
                }
                for (String str : property.split(",")) {
                    try {
                        cVar = (j$.nio.file.spi.c) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.c.class).newInstance(cVar);
                        if (!cVar.l().equals("file")) {
                            throw new Error("Default provider must use scheme 'file'");
                        }
                    } catch (Exception e) {
                        throw new Error(e);
                    }
                }
                return cVar;
            case 1:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 2:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
