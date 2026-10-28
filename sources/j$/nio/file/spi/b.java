package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.attribute.a0;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.i;
import j$.nio.file.attribute.j0;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.k0;
import j$.nio.file.attribute.l;
import j$.nio.file.attribute.l0;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.q0;
import j$.nio.file.attribute.r0;
import j$.nio.file.attribute.s0;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.w;
import j$.nio.file.attribute.x;
import j$.nio.file.attribute.y;
import j$.nio.file.h;
import j$.nio.file.o;
import j$.nio.file.p;
import j$.nio.file.r;
import j$.nio.file.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        j$.nio.file.b[] bVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathH = o.h(path);
        if (accessModeArr == null) {
            bVarArr = null;
        } else {
            int length = accessModeArr.length;
            j$.nio.file.b[] bVarArr2 = new j$.nio.file.b[length];
            for (int i = 0; i < length; i++) {
                bVarArr2[i] = j$.nio.file.a.a(accessModeArr[i]);
            }
            bVarArr = bVarArr2;
        }
        cVar.a(pathH, bVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathH = o.h(path);
        j$.nio.file.Path pathH2 = o.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(o.h(path), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(o.h(path), o.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(o.h(path), o.h(path2), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(o.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(o.h(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView wVar;
        x xVarH = this.a.h(o.h(path), j$.nio.file.a.h(cls), z.h(linkOptionArr));
        if (xVarH == null) {
            return null;
        }
        if (xVarH instanceof v) {
            return ((v) xVarH).a;
        }
        if (xVarH instanceof j$.nio.file.attribute.g) {
            j$.nio.file.attribute.g gVar = (j$.nio.file.attribute.g) xVarH;
            if (gVar instanceof e) {
                return ((e) gVar).a;
            }
            if (gVar instanceof m) {
                m mVar = (m) gVar;
                if (mVar instanceof k) {
                    return ((k) mVar).a;
                }
                wVar = new l(mVar);
            } else if (gVar instanceof l0) {
                l0 l0Var = (l0) gVar;
                if (l0Var instanceof j0) {
                    return ((j0) l0Var).a;
                }
                wVar = new k0(l0Var);
            } else {
                wVar = new f(gVar);
            }
        } else if (xVarH instanceof a0) {
            a0 a0Var = (a0) xVarH;
            if (a0Var instanceof y) {
                return ((y) a0Var).a;
            }
            if (a0Var instanceof j$.nio.file.attribute.c) {
                j$.nio.file.attribute.c cVar = (j$.nio.file.attribute.c) a0Var;
                if (cVar instanceof j$.nio.file.attribute.a) {
                    return ((j$.nio.file.attribute.a) cVar).a;
                }
                wVar = new j$.nio.file.attribute.b(cVar);
            } else if (a0Var instanceof l0) {
                l0 l0Var2 = (l0) a0Var;
                if (l0Var2 instanceof j0) {
                    return ((j0) l0Var2).a;
                }
                wVar = new k0(l0Var2);
            } else {
                wVar = new j$.nio.file.attribute.z(a0Var);
            }
        } else if (xVarH instanceof s0) {
            s0 s0Var = (s0) xVarH;
            if (s0Var instanceof q0) {
                return ((q0) s0Var).a;
            }
            wVar = new r0(s0Var);
        } else {
            wVar = new w(xVarH);
        }
        return wVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        z zVarI = this.a.i(o.h(path));
        int i = j$.nio.file.f.b;
        if (zVarI == null) {
            return null;
        }
        return zVarI instanceof j$.nio.file.e ? ((j$.nio.file.e) zVarI).e : new j$.nio.file.f(zVarI);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return h.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return p.h(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(o.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(o.h(path), o.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathH = o.h(path);
        j$.nio.file.Path pathH2 = o.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.c cVarP = this.a.p(o.h(path), j$.nio.file.a.l(set), executorService, g.F(fileAttributeArr));
        int i = j$.nio.channels.b.b;
        if (cVarP == null) {
            return null;
        }
        return cVarP instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarP).a : new j$.nio.channels.b(cVarP);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(o.h(path), j$.nio.file.a.l(set), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new r(this.a.r(o.h(path), new j$.desugar.sun.nio.fs.h((byte) 1, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(o.h(path), j$.nio.file.a.l(set), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return h.a(this.a.t(o.h(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.m[] mVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathH = o.h(path);
        if (openOptionArr == null) {
            mVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.m[] mVarArr2 = new j$.nio.file.m[length];
            for (int i = 0; i < length; i++) {
                mVarArr2[i] = j$.nio.file.k.a(openOptionArr[i]);
            }
            mVarArr = mVarArr2;
        }
        return cVar.v(pathH, mVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.m[] mVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathH = o.h(path);
        if (openOptionArr == null) {
            mVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.m[] mVarArr2 = new j$.nio.file.m[length];
            for (int i = 0; i < length; i++) {
                mVarArr2[i] = j$.nio.file.k.a(openOptionArr[i]);
            }
            mVarArr = mVarArr2;
        }
        return cVar.w(pathH, mVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return i.a(this.a.x(o.h(path), j$.nio.file.a.i(cls), z.h(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return p.h(this.a.z(o.h(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(o.h(path), str, j$.nio.file.a.k(obj), z.h(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return h.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.a.y(o.h(path), str, z.h(linkOptionArr)));
    }
}
