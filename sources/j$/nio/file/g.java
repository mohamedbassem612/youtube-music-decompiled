package j$.nio.file;

import j$.nio.file.attribute.w0;
import j$.nio.file.attribute.x0;
import java.io.IOException;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g extends FileSystem {
    public final /* synthetic */ java.nio.file.FileSystem a;

    public g(java.nio.file.FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ FileSystem j(java.nio.file.FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof h ? ((h) fileSystem).a : new g(fileSystem);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Iterable a() {
        return this.a.getFileStores();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ w b(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof v ? ((v) pathMatcher).a : new u(pathMatcher);
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable c() {
        return new s(this.a.getRootDirectories());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ String d() {
        return this.a.getSeparator();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.desugar.sun.nio.fs.g e() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof x0 ? ((x0) userPrincipalLookupService).a : new w0(userPrincipalLookupService);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.FileSystem fileSystem = this.a;
        if (obj instanceof g) {
            obj = ((g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean f() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ q0 g() {
        return o0.a(this.a.newWatchService());
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return o.h(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.nio.file.spi.c h() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = j$.nio.file.spi.a.c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Set i() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }
}
