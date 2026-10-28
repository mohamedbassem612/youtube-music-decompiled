package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zai extends cpb {
    protected long o;
    protected byi p;
    protected long q;
    protected long r;

    public zai(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, long j2, long j3, long j4) {
        super(byeVar, byiVar, bseVar, i, obj, j == -9223372036854775807L ? 0L : j, j2 == -9223372036854775807L ? 0L : j2, j3, -9223372036854775807L, j4);
        this.p = this.f;
        this.o = j4;
        this.q = j;
        this.r = j2;
    }

    public final synchronized long i() {
        return this.r;
    }

    public final synchronized long k() {
        return this.o;
    }

    public final synchronized long l() {
        return this.q;
    }

    public final synchronized byi m() {
        return this.p;
    }
}
