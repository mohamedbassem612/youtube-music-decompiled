package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfp extends acii {
    public final aunn a;
    public final avlh b;
    final mbc c;
    public float d;
    public boolean e;
    public final vxu f;
    private final wis g;
    private long h;

    public acfp(aunn aunnVar, wis wisVar, mbc mbcVar, avlh avlhVar, vxu vxuVar) {
        super(0);
        this.a = aunnVar;
        this.g = wisVar;
        this.c = mbcVar;
        this.h = -1L;
        this.d = 1.0f;
        this.e = false;
        this.b = avlhVar;
        this.f = vxuVar;
    }

    public final void A() {
        this.h = this.c.b();
    }

    @Override // defpackage.acii
    public final void X(aaxh aaxhVar, int i) {
        if (i == 0) {
            this.d = aaxhVar.c;
        }
    }

    @Override // defpackage.acii
    public final void b(String str) {
        A();
    }

    @Override // defpackage.acii
    public final void f(aazj aazjVar) {
        afvn afvnVarB = aawb.b(aazjVar, "PRC");
        try {
            int iOrdinal = aazjVar.a.ordinal();
            if (iOrdinal == 2) {
                boolean z = aazjVar.i;
                this.e = z;
                if (z && this.d > 1.0f) {
                    z();
                }
                ((abvk) this.a.io()).J(this.d);
            } else if (iOrdinal == 9) {
                A();
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acii
    public final void g(aazk aazkVar) {
        if (aazkVar.h && this.e) {
            long j = aazkVar.a;
            float f = this.d;
            if ((f <= 1.0f || aazkVar.d - j >= 500) && (f >= 1.0f || j - aazkVar.c >= 500)) {
                return;
            }
            z();
            ((abvk) this.a.io()).J(this.d);
        }
    }

    @Override // defpackage.acii
    public final void h(aazn aaznVar) {
        int i = aaznVar.a;
        if (i == 3) {
            A();
            return;
        }
        if (i == 2) {
            mbc mbcVar = this.c;
            wis wisVar = this.g;
            long jB = mbcVar.b();
            arbm arbmVar = wisVar.io().d.s;
            if (arbmVar == null) {
                arbmVar = arbm.a;
            }
            int i2 = arbmVar.c * 1000;
            long j = this.h;
            if (j != -1 && i2 > 0 && jB - j > i2) {
                this.d = 1.0f;
            }
            this.h = -1L;
            ((abvk) this.a.io()).J(this.d);
        }
    }

    public final void z() {
        this.h = -1L;
        this.d = 1.0f;
    }
}
