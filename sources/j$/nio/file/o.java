package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ o(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path h(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof p ? ((p) path).a : new o(path);
    }

    @Override // j$.nio.file.Path, j$.nio.file.t0
    public final /* synthetic */ n0 c(q0 q0Var, e0[] e0VarArr, h0[] h0VarArr) {
        return l0.b(this.a.register(p0.a(q0Var), z.l(e0VarArr), z.m(h0VarArr)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(a.g(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof o) {
            obj = ((o) obj).a;
        }
        return path.equals(obj);
    }

    @Override // j$.nio.file.Path, j$.nio.file.t0
    public final /* synthetic */ n0 f(q0 q0Var, e0[] e0VarArr) {
        return l0.b(this.a.register(p0.a(q0Var), z.l(e0VarArr)));
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return h(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return g.j(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return h(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return h(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return h(this.a.getRoot());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path i(Path path) {
        return h(this.a.resolve(p.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path j(LinkOption[] linkOptionArr) {
        return h(this.a.toRealPath(z.k(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(p.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean n(Path path) {
        return this.a.startsWith(p.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return h(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean o(Path path) {
        return this.a.endsWith(p.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path q(Path path) {
        return h(this.a.resolveSibling(p.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return h(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return h(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.k0.a(this.a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return h(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return h(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path u(Path path) {
        return h(this.a.relativize(p.h(path)));
    }
}
