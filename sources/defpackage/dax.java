package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class dax {
    public cwj c;
    public cvk d;
    public dau e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public boolean o;
    public final das b = new das();
    public isw p = new isw();

    protected abstract long a(bwb bwbVar);

    protected void b(boolean z) {
        int i;
        if (z) {
            this.p = new isw();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.k = i;
        this.f = -1L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
    }

    protected abstract boolean c(bwb bwbVar, long j, isw iswVar);

    protected byte[] e(long j) {
        return null;
    }

    protected final long f(long j) {
        return (j * 1000000) / ((long) this.l);
    }

    protected final long g(long j) {
        return (((long) this.l) * j) / 1000000;
    }

    protected void h(long j) {
        this.h = j;
        this.i = j;
        this.j = 0L;
    }
}
