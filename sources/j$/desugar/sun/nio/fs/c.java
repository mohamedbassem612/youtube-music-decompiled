package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.f0;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements j$.nio.file.attribute.j {
    public final f0 a;
    public final f0 b;
    public final f0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Integer i;

    public c(f0 f0Var, f0 f0Var2, f0 f0Var3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = f0Var;
        this.b = f0Var2;
        this.c = f0Var3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.j
    public final f0 creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.j
    public final Object fileKey() {
        return this.i;
    }

    @Override // j$.nio.file.attribute.j
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.j
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.j
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.j
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.j
    public final f0 lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.j
    public final f0 lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.j
    public final long size() {
        return this.h;
    }
}
