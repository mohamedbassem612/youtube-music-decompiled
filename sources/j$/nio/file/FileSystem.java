package j$.nio.file;

import java.io.Closeable;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class FileSystem implements Closeable {
    public abstract Iterable a();

    public abstract w b(String str);

    public abstract Iterable c();

    public abstract String d();

    public abstract j$.desugar.sun.nio.fs.g e();

    public abstract boolean f();

    public abstract q0 g();

    public abstract Path getPath(String str, String... strArr);

    public abstract j$.nio.file.spi.c h();

    public abstract Set i();

    public abstract boolean isOpen();
}
