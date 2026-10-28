package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qjf implements qjd {
    private final awmd b;
    private final mbc c;
    private final Object a = new Object();
    private int d = 0;
    private long e = 0;

    public qjf(awmd awmdVar, mbc mbcVar) {
        this.b = awmdVar;
        this.c = mbcVar;
    }

    @Override // defpackage.qjd
    public final void a() {
        Object obj = this.a;
        long jB = this.c.b();
        synchronized (obj) {
            this.d++;
            if (jB - this.e > 1000) {
                this.d = 0;
                this.e = jB;
            }
        }
    }

    @Override // defpackage.qjd
    public final boolean b() {
        int iIntValue = ((Integer) this.b.io()).intValue();
        if (iIntValue == 0) {
            return true;
        }
        if (iIntValue != Integer.MAX_VALUE) {
            synchronized (this.a) {
                if (this.d >= iIntValue) {
                    long j = this.e;
                    if (this.c.b() - j <= 1000) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
