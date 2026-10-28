package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface Path extends Comparable<Path>, Iterable<Path>, t0 {

    /* JADX INFO: renamed from: j$.nio.file.Path$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class CC {
        public static Path of(String str, String... strArr) {
            return FileSystems.getDefault().getPath(str, strArr);
        }
    }

    n0 c(q0 q0Var, e0[] e0VarArr, h0... h0VarArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    n0 f(q0 q0Var, e0... e0VarArr);

    Path getFileName();

    FileSystem getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    int hashCode();

    Path i(Path path);

    boolean isAbsolute();

    Iterator iterator();

    Path j(LinkOption... linkOptionArr);

    int m(Path path);

    boolean n(Path path);

    Path normalize();

    boolean o(Path path);

    Path q(Path path);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    Path u(Path path);
}
