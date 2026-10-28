package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.FileAttribute;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.InvalidPathException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class Files {
    public static final /* synthetic */ int a = 0;

    static {
        j$.desugar.sun.nio.fs.g.D(new Object[]{x.CREATE_NEW, x.WRITE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        inputStream.getClass();
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption != null) {
                    throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
                }
                throw new NullPointerException("options contains 'null'");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                deleteIfExists(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamW = path.getFileSystem().h().w(path, x.CREATE_NEW, x.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamW);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamW);
                }
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
            } catch (Throwable th) {
                if (outputStreamW != null) {
                    try {
                        outputStreamW.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    public static j$.nio.file.spi.c b(Path path) {
        return path.getFileSystem().h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long copy(Path path, OutputStream outputStream) throws IOException {
        outputStream.getClass();
        InputStream inputStreamV = b(path).v(path, new m[0]);
        try {
            long jTransferTo = inputStreamV instanceof InputStreamRetargetInterface ? ((InputStreamRetargetInterface) inputStreamV).transferTo(outputStream) : DesugarInputStream.transferTo(inputStreamV, outputStream);
            if (inputStreamV != 0) {
                inputStreamV.close();
            }
            return jTransferTo;
        } catch (Throwable th) {
            if (inputStreamV != 0) {
                try {
                    inputStreamV.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Path createDirectory(Path path, FileAttribute<?>... fileAttributeArr) {
        b(path).c(path, fileAttributeArr);
        return path;
    }

    public static Path createTempDirectory(Path path, String str, FileAttribute<?>... fileAttributeArr) {
        path.getClass();
        Path path2 = b0.a;
        if (str == null) {
            str = "";
        }
        if (b0.b && path.getFileSystem() == FileSystems.getDefault()) {
            if (fileAttributeArr.length != 0) {
                int i = 0;
                while (true) {
                    if (i >= fileAttributeArr.length) {
                        int length = fileAttributeArr.length;
                        FileAttribute<?>[] fileAttributeArr2 = new FileAttribute[length + 1];
                        System.arraycopy(fileAttributeArr, 0, fileAttributeArr2, 0, fileAttributeArr.length);
                        fileAttributeArr2[length] = a0.a;
                        fileAttributeArr = fileAttributeArr2;
                        break;
                    }
                    if (fileAttributeArr[i].name().equals("posix:permissions")) {
                        break;
                    }
                    i++;
                }
            } else {
                fileAttributeArr = new FileAttribute[]{a0.a};
            }
        }
        SecurityManager securityManager = System.getSecurityManager();
        while (true) {
            try {
                try {
                    return createDirectory(b0.a(str, "", path), fileAttributeArr);
                } catch (SecurityException e) {
                    if (path != path2 || securityManager == null) {
                        throw e;
                    }
                    throw new SecurityException("Unable to create temporary file or directory");
                } catch (FileAlreadyExistsException unused) {
                }
            } catch (InvalidPathException e2) {
                if (securityManager == null) {
                    throw e2;
                }
                j$.time.g.a("Invalid prefix or suffix");
                return null;
            }
        }
    }

    public static void delete(Path path) {
        b(path).f(path);
    }

    public static boolean deleteIfExists(Path path) {
        return b(path).g(path);
    }

    public static boolean exists(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            b(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                b(path).a(path, new b[0]);
            } else {
                b(path).x(path, j$.nio.file.attribute.j.class, LinkOption.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isSymbolicLink(Path path) {
        try {
            return b(path).x(path, j$.nio.file.attribute.j.class, LinkOption.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) {
        j$.nio.file.spi.c cVarB = b(path);
        if (b(path2).equals(cVarB)) {
            cVarB.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException(j$.desugar.sun.nio.fs.i.a("'", String.valueOf(copyOption2), "' is not a recognized copy option"));
                }
                z3 = true;
            }
        }
        j$.nio.file.attribute.j jVarX = b(path).x(path, j$.nio.file.attribute.j.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (jVarX.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            deleteIfExists(path2);
        } else if (exists(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (jVarX.isDirectory()) {
            createDirectory(path2, new FileAttribute[0]);
        } else {
            InputStream inputStreamV = path.getFileSystem().h().v(path, new m[0]);
            try {
                a(inputStreamV, path2, new CopyOption[0]);
                inputStreamV.close();
            } catch (Throwable th) {
                if (inputStreamV != null) {
                    try {
                        inputStreamV.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((j$.nio.file.attribute.g) path2.getFileSystem().h().h(path2, j$.nio.file.attribute.g.class, new LinkOption[0])).a(jVarX.lastModifiedTime(), jVarX.lastAccessTime(), jVarX.creationTime());
            } catch (Throwable th3) {
                try {
                    delete(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        delete(path);
        return path2;
    }
}
