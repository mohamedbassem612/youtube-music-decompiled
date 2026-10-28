package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zym implements zyh {
    public final syp a;
    public final mbc b;
    private final zyh c;
    private final long d;

    protected zym(syp sypVar, zyh zyhVar, mbc mbcVar, long j) {
        this.a = sypVar;
        this.c = zyhVar;
        this.b = mbcVar;
        this.d = j;
    }

    public static zym b(syp sypVar, zyh zyhVar, mbc mbcVar, long j) {
        sypVar.getClass();
        mbcVar.getClass();
        if (j < 0 || j > 2592000000L) {
            throw new IllegalArgumentException("time to live must be >=0 and <= 2592000000");
        }
        return new zym(sypVar, zyhVar, mbcVar, j);
    }

    @Override // defpackage.zyh
    public final void a(Object obj, sxu sxuVar) {
        long j = this.d;
        if (j > 0) {
            zrr zrrVar = (zrr) this.a.a(obj);
            long epochMilli = this.b.f().toEpochMilli();
            if (zrrVar != null) {
                long j2 = zrrVar.b;
                if (epochMilli >= j2 && j2 + j >= epochMilli) {
                    sxuVar.b(obj, zrrVar.a);
                    return;
                }
            }
        }
        this.c.a(obj, new zyl(this, sxuVar));
    }
}
