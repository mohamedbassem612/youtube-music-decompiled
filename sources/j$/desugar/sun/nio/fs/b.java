package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.attribute.f0;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements j$.nio.file.attribute.g {
    public static final HashSet b;
    public final Path a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = r.a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.g
    public final void a(f0 f0Var, f0 f0Var2, f0 f0Var3) {
        long jConvert;
        if (f0Var == null && f0Var2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().h().a(path, j$.nio.file.b.WRITE);
        File file = path.toFile();
        f0Var.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.a(timeUnit, "unit");
        if (timeUnit != null) {
            jConvert = f0Var.a;
        } else {
            jConvert = timeUnit.convert(f0Var.b.getEpochSecond(), TimeUnit.SECONDS);
            if (jConvert != Long.MIN_VALUE && jConvert != Long.MAX_VALUE) {
                long nano = ((long) f0Var.b.getNano()) / 1000000;
                long j = jConvert + nano;
                if (((jConvert ^ j) & (nano ^ j)) < 0) {
                    jConvert = jConvert < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
                } else {
                    jConvert = j;
                }
            }
        }
        if (!file.setLastModified(jConvert)) {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.d
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.g
    public final j$.nio.file.attribute.j readAttributes() {
        boolean z;
        Path path = this.a;
        path.getFileSystem().h().a(path, new j$.nio.file.b[0]);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        Objects.a(TimeUnit.MILLISECONDS, "unit");
        f0 f0Var = new f0(jLastModified);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new c(f0Var, f0Var, f0Var, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
