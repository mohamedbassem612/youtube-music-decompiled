package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class czn implements cwd {
    public final int a;
    public final long b;
    public final int c;

    public czn(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final String toString() {
        return "AtomSizeTooSmall{type=" + bwp.S(this.a) + ", size=" + this.b + ", minHeaderSize=" + this.c + '}';
    }
}
