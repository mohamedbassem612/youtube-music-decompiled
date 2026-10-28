package j$.desugar.sun.nio.fs;

import app.rive.semantics.SemanticState;
import j$.nio.channels.DesugarChannels;
import j$.nio.file.CopyOption;
import j$.nio.file.FileSystem;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.f0;
import j$.nio.file.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends j$.nio.file.spi.c {
    public final String b;
    public volatile j c;

    public n(String str) {
        this.b = str;
    }

    public static void B(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            j$.time.g.a("URI does not match this provider");
            return;
        }
        if (uri.getRawAuthority() != null) {
            j$.time.g.a("Authority component present");
            return;
        }
        String path = uri.getPath();
        if (path == null) {
            j$.time.g.a("Path component is undefined");
            return;
        }
        if (!path.equals("/")) {
            j$.time.g.a("Path component should be '/'");
        } else if (uri.getRawQuery() != null) {
            j$.time.g.a("Query component present");
        } else if (uri.getRawFragment() != null) {
            j$.time.g.a("Fragment component present");
        }
    }

    public static boolean C(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.c
    public final void A(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException(i.a("Requested attribute type for: ", strSubstring, " is not available."));
            }
            str = str.substring(iIndexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((f0) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (f0) obj, null);
        } else if (str.equals("creationTime")) {
        } else {
            j$.time.g.a(i.a("'basic:", str, "' not recognized"));
        }
    }

    @Override // j$.nio.file.spi.c
    public final void a(Path path, j$.nio.file.b... bVarArr) throws IOException {
        boolean zCanRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (j$.nio.file.b bVar : bVarArr) {
            int i = k.a[bVar.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i != 2) {
                if (i == 3) {
                    zCanRead = file.canExecute();
                }
            } else {
                zCanRead = file.canWrite();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.c
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.exists(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[SemanticState.Multiline];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, SemanticState.Multiline);
                    if (i < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    @Override // j$.nio.file.spi.c
    public final void c(Path path, FileAttribute... fileAttributeArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !Files.exists(path.getParent(), new LinkOption[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final void f(Path path) throws NoSuchFileException {
        try {
            a(path, new j$.nio.file.b[0]);
            g(path);
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final FileSystem j(URI uri) {
        B(uri);
        j jVar = this.c;
        if (jVar == null) {
            synchronized (this) {
                jVar = this.c;
                if (jVar == null) {
                    jVar = new j(this, this.b);
                    this.c = jVar;
                }
            }
        }
        return jVar;
    }

    @Override // j$.nio.file.spi.c
    public final Path k(URI uri) {
        byte bA;
        j jVar = this.c;
        String str = this.b;
        char[] cArr = q.c;
        if (!uri.isAbsolute()) {
            j$.time.g.a("URI is not absolute");
            return null;
        }
        if (uri.isOpaque()) {
            j$.time.g.a("URI is not hierarchical");
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            j$.time.g.a("URI scheme is not \"file\"");
            return null;
        }
        if (uri.getRawAuthority() != null) {
            j$.time.g.a("URI has an authority component");
            return null;
        }
        if (uri.getRawFragment() != null) {
            j$.time.g.a("URI has a fragment component");
            return null;
        }
        if (uri.getRawQuery() != null) {
            j$.time.g.a("URI has a query component");
            return null;
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            j$.time.g.a("URI path component is empty");
            return null;
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i + 2;
                i += 3;
                bA = (byte) ((q.a(rawPath.charAt(i3)) << 4) | q.a(rawPath.charAt(i4)));
                if (bA == 0) {
                    j$.time.g.a("Nul character not allowed");
                    return null;
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    j$.time.g.a("Bad escape");
                    return null;
                }
                bA = (byte) cCharAt;
                i = i3;
            }
            bArrCopyOf[i2] = bA;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
        }
        return new p(jVar, new String(bArrCopyOf, r.a), str, "/");
    }

    @Override // j$.nio.file.spi.c
    public final boolean n(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new j$.nio.file.b[0]);
        a(path2, new j$.nio.file.b[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final void o(Path path, Path path2, CopyOption... copyOptionArr) throws FileAlreadyExistsException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.exists(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final SeekableByteChannel q(Path path, Set set, FileAttribute... fileAttributeArr) {
        return s(path, set, fileAttributeArr);
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, h hVar) {
        l lVar = new l();
        lVar.a = new m(this, path, hVar);
        return lVar;
    }

    @Override // j$.nio.file.spi.c
    public final FileChannel s(Path path, Set set, FileAttribute... fileAttributeArr) throws IOException {
        String str;
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j$.nio.file.m) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(x.CREATE_NEW) && set.contains(x.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(x.CREATE) && !set.contains(x.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(x.READ) && set.contains(x.APPEND)) {
            j$.time.g.a("READ + APPEND not allowed");
            return null;
        }
        x xVar = x.APPEND;
        if (set.contains(xVar) && set.contains(x.TRUNCATE_EXISTING)) {
            j$.time.g.a("APPEND + TRUNCATE_EXISTING not allowed");
            return null;
        }
        File file = path.toFile();
        x xVar2 = x.WRITE;
        if (!set.contains(xVar2) && !set.contains(xVar)) {
            str = "r";
        } else if (set.contains(x.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(x.DSYNC) ? "rwd" : "rw";
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        if (set.contains(x.TRUNCATE_EXISTING) && set.contains(xVar2)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(xVar) && !set.contains(x.DELETE_ON_CLOSE)) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof e) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((e) fileChannelConvertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new e(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(x.DELETE_ON_CLOSE), set.contains(xVar), path);
    }

    @Override // j$.nio.file.spi.c
    public final FileSystem u(URI uri, Map map) {
        B(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.attribute.j x(Path path, Class cls, LinkOption... linkOptionArr) {
        if (cls == j$.nio.file.attribute.j.class) {
            return (j$.nio.file.attribute.j) cls.cast(((j$.nio.file.attribute.g) h(path, j$.nio.file.attribute.g.class, linkOptionArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final Path z(Path path) {
        return new p(this.c, path.toFile().getCanonicalPath(), this.b, "/");
    }
}
