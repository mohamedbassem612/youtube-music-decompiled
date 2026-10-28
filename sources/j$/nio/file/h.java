package j$.nio.file;

import j$.nio.file.attribute.w0;
import j$.nio.file.attribute.x0;
import java.io.IOException;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h extends java.nio.file.FileSystem {
    public final /* synthetic */ FileSystem a;

    public /* synthetic */ h(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ java.nio.file.FileSystem a(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof g ? ((g) fileSystem).a : new h(fileSystem);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof h) {
            obj = ((h) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return p.h(this.a.getPath(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        w wVarB = this.a.b(str);
        if (wVarB == null) {
            return null;
        }
        return wVarB instanceof u ? ((u) wVarB).a : new v(wVarB);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new s(this.a.c());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.d();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.desugar.sun.nio.fs.g gVarE = this.a.e();
        int i = x0.b;
        if (gVarE == null) {
            return null;
        }
        return gVarE instanceof w0 ? ((w0) gVarE).a : new x0(gVarE);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.f();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        return p0.a(this.a.g());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.c cVarH = this.a.h();
        int i = j$.nio.file.spi.b.b;
        if (cVarH == null) {
            return null;
        }
        return cVarH instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) cVarH).b : new j$.nio.file.spi.b(cVarH);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.i();
    }
}
