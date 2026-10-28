package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axcv implements awws {
    public final awtr a;
    public final long b;
    private final awtr c;
    private final awtp d;

    public axcv(long j, axcv axcvVar, int i) {
        awts awtsVar = awts.a;
        this.a = new awtr(null, awtsVar);
        this.c = new awtr(axcvVar, awtsVar);
        this.b = j;
        this.d = new awtp(i << 16, awtsVar);
    }

    public abstract int a();

    public abstract void k(int i);

    public final Object l() {
        return this.a.a;
    }

    public final axcv m() {
        Object objL = l();
        if (objL == axcu.a) {
            return null;
        }
        return (axcv) objL;
    }

    public final axcv n() {
        return (axcv) this.c.a;
    }

    public final void o() {
        this.c.b(null);
    }

    public final void p() {
        Object obj;
        axcv axcvVarM;
        boolean z = awuv.a;
        if (q()) {
            return;
        }
        while (true) {
            axcv axcvVarN = n();
            while (axcvVarN != null && axcvVarN.t()) {
                axcvVarN = (axcv) axcvVarN.c.a;
            }
            axcv axcvVarM2 = m();
            axcvVarM2.getClass();
            while (axcvVarM2.t() && (axcvVarM = axcvVarM2.m()) != null) {
                axcvVarM2 = axcvVarM;
            }
            awtr awtrVar = axcvVarM2.c;
            do {
                obj = awtrVar.a;
            } while (!awtrVar.d(obj, ((axcv) obj) == null ? null : axcvVarN));
            if (axcvVarN != null) {
                axcvVarN.a.c(axcvVarM2);
            }
            if (!axcvVarM2.t() || axcvVarM2.q()) {
                if (axcvVarN == null || !axcvVarN.t()) {
                    return;
                }
            }
        }
    }

    public final boolean q() {
        return m() == null;
    }

    public final void r() {
        if (this.d.b() == a()) {
            p();
        }
    }

    public final boolean s() {
        return awtp.a.addAndGet(this.d, -65536) == a() && !q();
    }

    public final boolean t() {
        return this.d.b == a() && !q();
    }

    public final boolean u() {
        awtp awtpVar;
        int i;
        do {
            awtpVar = this.d;
            i = awtpVar.b;
            if (i == a() && !q()) {
                return false;
            }
        } while (!awtpVar.c(i, 65536 + i));
        return true;
    }
}
