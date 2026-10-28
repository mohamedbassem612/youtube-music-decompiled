package j$.nio.file;

import j$.lang.Iterable$EL;
import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p implements java.nio.file.Path {
    public final /* synthetic */ Path a;

    public /* synthetic */ p(Path path) {
        this.a = path;
    }

    public static /* synthetic */ java.nio.file.Path h(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof o ? ((o) path).a : new p(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.a.compareTo(a.g(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.a.o(o.h(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof p) {
            obj = ((p) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return h(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.FileSystem getFileSystem() {
        return h.a(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i) {
        return h(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return h(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return h(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this.a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return h(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return m0.a(this.a.c(o0.a(watchService), z.i(kindArr), z.j(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return h(this.a.u(o.h(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return h(this.a.i(o.h(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return h(this.a.q(o.h(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<java.nio.file.Path> spliterator() {
        return j$.util.l0.a(Iterable$EL.spliterator(this.a));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.a.n(o.h(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i, int i2) {
        return h(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return h(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return h(this.a.j(z.h(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.a.compareTo(o.h(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return h(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return h(this.a.resolveSibling(str));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return m0.a(this.a.f(o0.a(watchService), z.i(kindArr)));
    }
}
