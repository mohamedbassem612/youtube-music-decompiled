package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.desugar.sun.nio.fs.i;
import j$.nio.file.CopyOption;
import j$.nio.file.FileSystem;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.j;
import j$.nio.file.m;
import j$.nio.file.x;
import j$.nio.file.z;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final Set a = g.D(new Object[]{x.CREATE, x.TRUNCATE_EXISTING, x.WRITE});

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    public abstract void a(Path path, j$.nio.file.b... bVarArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, FileAttribute... fileAttributeArr);

    public void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    public void e(Path path, Path path2, FileAttribute... fileAttributeArr) {
        throw new UnsupportedOperationException();
    }

    public abstract void f(Path path);

    public boolean g(Path path) {
        return path.toFile().delete();
    }

    public j$.nio.file.attribute.x h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == j$.nio.file.attribute.g.class) {
            return (j$.nio.file.attribute.x) cls.cast(new j$.desugar.sun.nio.fs.b(path));
        }
        return null;
    }

    public z i(Path path) {
        throw new SecurityException("getFileStore");
    }

    public abstract FileSystem j(URI uri);

    public abstract Path k(URI uri);

    public String l() {
        return "file";
    }

    public boolean m(Path path) {
        return path.toFile().isHidden();
    }

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, FileAttribute... fileAttributeArr) {
        throw new UnsupportedOperationException();
    }

    public abstract SeekableByteChannel q(Path path, Set set, FileAttribute... fileAttributeArr);

    public abstract DirectoryStream r(Path path, h hVar);

    public abstract FileChannel s(Path path, Set set, FileAttribute... fileAttributeArr);

    public FileSystem t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract FileSystem u(URI uri, Map map);

    public InputStream v(Path path, m... mVarArr) {
        Set hashSet;
        if (mVarArr.length > 0) {
            for (m mVar : mVarArr) {
                if (mVar == x.APPEND || mVar == x.WRITE) {
                    throw new UnsupportedOperationException(i.a("'", String.valueOf(mVar), "' not allowed"));
                }
            }
        }
        int i = Files.a;
        if (mVarArr.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet();
            Collections.addAll(hashSet, mVarArr);
        }
        return Channels.newInputStream(Files.b(path).q(path, hashSet, new FileAttribute[0]));
    }

    public OutputStream w(Path path, m... mVarArr) {
        Set set;
        if (mVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (m mVar : mVarArr) {
                if (mVar == x.READ) {
                    j$.time.g.a("READ not allowed");
                    return null;
                }
                hashSet.add(mVar);
            }
            hashSet.add(x.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new FileAttribute[0]));
    }

    public abstract j x(Path path, Class cls, LinkOption... linkOptionArr);

    public Map y(Path path, String str, LinkOption... linkOptionArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException(i.a("Requested attribute type for: ", strSubstring, " is not available."));
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        j$.desugar.sun.nio.fs.b bVar = new j$.desugar.sun.nio.fs.b(path);
        HashSet hashSet = j$.desugar.sun.nio.fs.b.b;
        j$.desugar.sun.nio.fs.a aVar = new j$.desugar.sun.nio.fs.a();
        aVar.a = new HashSet();
        aVar.b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                aVar.c = true;
            } else {
                if (!hashSet.contains(str2)) {
                    j$.time.g.a(i.a("'", str2, "' not recognized"));
                    return null;
                }
                aVar.a.add(str2);
            }
        }
        j attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a(Long.valueOf(((j$.desugar.sun.nio.fs.c) attributes).h), "size");
        }
        if (aVar.b("creationTime")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).c, "creationTime");
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).b, "lastAccessTime");
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).a, "lastModifiedTime");
        }
        if (aVar.b("fileKey")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).i, "fileKey");
        }
        if (aVar.b("isDirectory")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).e), "isDirectory");
        }
        if (aVar.b("isRegularFile")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).d), "isRegularFile");
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).f), "isSymbolicLink");
        }
        if (aVar.b("isOther")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).g), "isOther");
        }
        return DesugarCollections.unmodifiableMap(aVar.b);
    }

    public abstract Path z(Path path);
}
