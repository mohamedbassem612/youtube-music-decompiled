package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.CopyOption;
import j$.nio.file.FileSystem;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.j;
import j$.nio.file.attribute.j0;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.k0;
import j$.nio.file.attribute.l;
import j$.nio.file.attribute.q0;
import j$.nio.file.attribute.r0;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.w;
import j$.nio.file.attribute.x;
import j$.nio.file.attribute.y;
import j$.nio.file.m;
import j$.nio.file.o;
import j$.nio.file.p;
import j$.nio.file.r;
import j$.nio.file.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a extends c {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ a(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.b.setAttribute(p.h(path), str, j$.nio.file.a.k(obj), z.k(linkOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(Path path, j$.nio.file.b[] bVarArr) throws IOException {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = p.h(path);
        AccessMode[] accessModeArr = null;
        if (bVarArr != null) {
            int length = bVarArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                j$.nio.file.b bVar = bVarArr[i];
                if (bVar == null) {
                    accessMode = null;
                } else if (bVar == j$.nio.file.b.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = bVar == j$.nio.file.b.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathH, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.copy(p.h(path), p.h(path2), g.G(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(Path path, FileAttribute[] fileAttributeArr) throws IOException {
        this.b.createDirectory(p.h(path), g.H(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(p.h(path), p.h(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(Path path, Path path2, FileAttribute[] fileAttributeArr) throws IOException {
        this.b.createSymbolicLink(p.h(path), p.h(path2), g.H(fileAttributeArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof a) {
            obj = ((a) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void f(Path path) throws IOException {
        this.b.delete(p.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(p.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ x h(Path path, Class cls, LinkOption[] linkOptionArr) {
        x vVar;
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(p.h(path), j$.nio.file.a.h(cls), z.k(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof w) {
            return ((w) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof f) {
                return ((f) basicFileAttributeView).a;
            }
            if (basicFileAttributeView instanceof DosFileAttributeView) {
                DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
                if (dosFileAttributeView instanceof l) {
                    return ((l) dosFileAttributeView).a;
                }
                vVar = new k(dosFileAttributeView);
            } else if (basicFileAttributeView instanceof PosixFileAttributeView) {
                PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) basicFileAttributeView;
                if (posixFileAttributeView instanceof k0) {
                    return ((k0) posixFileAttributeView).a;
                }
                vVar = new j0(posixFileAttributeView);
            } else {
                vVar = new e(basicFileAttributeView);
            }
        } else if (fileAttributeView instanceof FileOwnerAttributeView) {
            FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
            if (fileOwnerAttributeView instanceof j$.nio.file.attribute.z) {
                return ((j$.nio.file.attribute.z) fileOwnerAttributeView).a;
            }
            if (fileOwnerAttributeView instanceof AclFileAttributeView) {
                AclFileAttributeView aclFileAttributeView = (AclFileAttributeView) fileOwnerAttributeView;
                if (aclFileAttributeView instanceof j$.nio.file.attribute.b) {
                    return ((j$.nio.file.attribute.b) aclFileAttributeView).a;
                }
                vVar = new j$.nio.file.attribute.a(aclFileAttributeView);
            } else if (fileOwnerAttributeView instanceof PosixFileAttributeView) {
                PosixFileAttributeView posixFileAttributeView2 = (PosixFileAttributeView) fileOwnerAttributeView;
                if (posixFileAttributeView2 instanceof k0) {
                    return ((k0) posixFileAttributeView2).a;
                }
                vVar = new j0(posixFileAttributeView2);
            } else {
                vVar = new y(fileOwnerAttributeView);
            }
        } else if (fileAttributeView instanceof UserDefinedFileAttributeView) {
            UserDefinedFileAttributeView userDefinedFileAttributeView = (UserDefinedFileAttributeView) fileAttributeView;
            if (userDefinedFileAttributeView instanceof r0) {
                return ((r0) userDefinedFileAttributeView).a;
            }
            vVar = new q0(userDefinedFileAttributeView);
        } else {
            vVar = new v(fileAttributeView);
        }
        return vVar;
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ z i(Path path) throws IOException {
        FileStore fileStore = this.b.getFileStore(p.h(path));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof j$.nio.file.f ? ((j$.nio.file.f) fileStore).a : new j$.nio.file.e(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileSystem j(URI uri) {
        return j$.nio.file.g.j(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path k(URI uri) {
        return o.h(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(p.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(p.h(path), p.h(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.move(p.h(path), p.h(path2), g.G(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(p.h(path), j$.nio.file.a.l(set), executorService, g.H(fileAttributeArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return asynchronousFileChannelNewAsynchronousFileChannel instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelNewAsynchronousFileChannel).a : new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.b.newByteChannel(p.h(path), j$.nio.file.a.l(set), g.H(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, h hVar) {
        return new r(this.b.newDirectoryStream(p.h(path), new h((byte) 1, hVar)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileChannel s(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.b.newFileChannel(p.h(path), j$.nio.file.a.l(set), g.H(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileSystem t(Path path, Map map) {
        return j$.nio.file.g.j(this.b.newFileSystem(p.h(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileSystem u(URI uri, Map map) {
        return j$.nio.file.g.j(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InputStream v(Path path, m[] mVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = p.h(path);
        if (mVarArr == null) {
            openOptionArr = null;
        } else {
            int length = mVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.l.a(mVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathH, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ OutputStream w(Path path, m[] mVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = p.h(path);
        if (mVarArr == null) {
            openOptionArr = null;
        } else {
            int length = mVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.l.a(mVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathH, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return j$.nio.file.attribute.h.a(this.b.readAttributes(p.h(path), j$.nio.file.a.i(cls), z.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Map y(Path path, String str, LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.b.readAttributes(p.h(path), str, z.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path z(Path path) {
        return o.h(this.b.readSymbolicLink(p.h(path)));
    }
}
