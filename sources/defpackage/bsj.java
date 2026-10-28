package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsj {
    public long a;
    public long b;
    public boolean c;

    public bsj(bsk bskVar) {
        this.a = bskVar.a;
        this.b = bskVar.b;
        this.c = bskVar.f;
    }

    public final void a(long j) {
        boolean z = true;
        if (j != Long.MIN_VALUE && j < 0) {
            z = false;
        }
        ahno.F(z);
        this.b = j;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public final void b(long j) {
        ahno.F(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        this.a = j;
    }

    public final void c(long j) {
        a(bwp.y(j));
    }

    public final void d(long j) {
        b(bwp.y(j));
    }

    public bsj() {
        this.b = Long.MIN_VALUE;
    }
}
