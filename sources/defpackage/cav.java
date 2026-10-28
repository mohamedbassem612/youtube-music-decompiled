package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cav implements cdp, cdq {
    public int a;
    public int b;
    public coo c;
    public long d;
    public long e;
    public boolean g;
    public cnm i;
    private final int l;
    private cdr n;
    private cfd o;
    private bvd p;
    private bse[] q;
    private boolean r;
    private cqr s;
    private final Object k = new Object();
    private final ccu m = new ccu();
    public long f = Long.MIN_VALUE;
    public btn h = btn.a;
    public long j = -9223372036854775807L;

    public cav(int i) {
        this.l = i;
    }

    private final void go() {
        cnm cnmVar;
        int iA;
        if (this.h.n() || (cnmVar = this.i) == null || (iA = this.h.a(cnmVar.a)) == -1) {
            this.j = -9223372036854775807L;
            return;
        }
        btl btlVarD = this.h.d(iA, new btl(), false);
        this.j = btlVarD.d;
        int i = cnmVar.b;
        if (i != -1) {
            this.j = btlVarD.h.a(i).f[cnmVar.c];
            return;
        }
        int i2 = cnmVar.e;
        if (i2 != -1) {
            long j = btlVarD.h.a(i2).a;
            this.j = 0L;
        }
    }

    @Override // defpackage.cdp
    public final void B(int i, cfd cfdVar, bvd bvdVar) {
        this.a = i;
        this.o = cfdVar;
        this.p = bvdVar;
        F();
    }

    @Override // defpackage.cdp
    public final void C() {
        coo cooVar = this.c;
        cooVar.getClass();
        cooVar.gu();
    }

    public final void I() {
        cqr cqrVar;
        synchronized (this.k) {
            cqrVar = this.s;
        }
        if (cqrVar != null) {
            boolean z = cqrVar.c.Z;
        }
    }

    @Override // defpackage.cdp
    public final void N() {
        ahno.O(this.b == 0);
        H();
    }

    @Override // defpackage.cdp
    public final void O(bse[] bseVarArr, coo cooVar, long j, long j2, cnm cnmVar) {
        ahno.O(!this.g);
        this.c = cooVar;
        this.i = cnmVar;
        go();
        if (this.f == Long.MIN_VALUE) {
            this.f = j;
        }
        this.q = bseVarArr;
        this.d = j2;
        M(bseVarArr, j, j2, cnmVar);
    }

    @Override // defpackage.cdp
    public final void P() {
        ahno.O(this.b == 0);
        this.m.a();
        J();
    }

    @Override // defpackage.cdp
    public final void Q(long j, boolean z) {
        R(j, false, z);
    }

    public final void R(long j, boolean z, boolean z2) {
        this.g = false;
        this.e = j;
        this.f = j;
        if (!z2) {
            z2 = l(j) != 0;
        }
        G(j, z, z2);
    }

    @Override // defpackage.cdp
    public final void S() {
        this.g = true;
    }

    @Override // defpackage.cdp
    public final void U(btn btnVar) {
        if (Objects.equals(this.h, btnVar)) {
            return;
        }
        this.h = btnVar;
        go();
        ae();
    }

    @Override // defpackage.cdp
    public final void V() {
        ahno.O(this.b == 1);
        this.b = 2;
        K();
    }

    @Override // defpackage.cdp
    public final void W() {
        ahno.O(this.b == 2);
        this.b = 1;
        L();
    }

    @Override // defpackage.cdp
    public final boolean X() {
        return this.f == Long.MIN_VALUE;
    }

    @Override // defpackage.cdp
    public final boolean Y() {
        return this.g;
    }

    protected final boolean Z() {
        if (X()) {
            return this.g;
        }
        coo cooVar = this.c;
        cooVar.getClass();
        return cooVar.f();
    }

    @Override // defpackage.cdp
    public /* synthetic */ boolean aa(long j) {
        return false;
    }

    protected final bse[] ab() {
        bse[] bseVarArr = this.q;
        bseVarArr.getClass();
        return bseVarArr;
    }

    @Override // defpackage.cdq
    public final void ac(cqr cqrVar) {
        synchronized (this.k) {
            this.s = cqrVar;
        }
    }

    @Override // defpackage.cdp
    public final void ad(cdr cdrVar, bse[] bseVarArr, coo cooVar, boolean z, boolean z2, long j, long j2, cnm cnmVar) {
        ahno.O(this.b == 0);
        this.n = cdrVar;
        this.i = cnmVar;
        this.b = 1;
        E(z, z2);
        O(bseVarArr, cooVar, j, j2, cnmVar);
        R(j, z, true);
    }

    @Override // defpackage.cdp
    public final int i() {
        return this.b;
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final int j() {
        return this.l;
    }

    public final int k(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        coo cooVar = this.c;
        cooVar.getClass();
        int iB = cooVar.b(ccuVar, decoderInputBuffer, i);
        if (iB != -4) {
            if (iB != -5) {
                return iB;
            }
            Object obj = ccuVar.b;
            obj.getClass();
            bse bseVar = (bse) obj;
            long j = bseVar.v;
            if (j != Long.MAX_VALUE) {
                bsd bsdVar = new bsd(bseVar);
                bsdVar.t = j + this.d;
                ccuVar.b = new bse(bsdVar);
            }
            return -5;
        }
        int i2 = i & 1;
        if (decoderInputBuffer.isEndOfStream()) {
            if (i2 == 0) {
                this.f = Long.MIN_VALUE;
            }
            if (!this.g) {
                return -3;
            }
        } else {
            long j2 = decoderInputBuffer.timeUs + this.d;
            decoderInputBuffer.timeUs = j2;
            if (i2 != 0) {
                return iB;
            }
            this.f = Math.max(this.f, j2);
        }
        return -4;
    }

    protected final int l(long j) {
        coo cooVar = this.c;
        cooVar.getClass();
        return cooVar.c(j - this.d);
    }

    @Override // defpackage.cdq
    public int m() {
        return 0;
    }

    @Override // defpackage.cdp
    public /* synthetic */ long n(long j, long j2) {
        return aub.f(this);
    }

    @Override // defpackage.cdp
    public final long o() {
        return this.f;
    }

    protected final bvd p() {
        bvd bvdVar = this.p;
        bvdVar.getClass();
        return bvdVar;
    }

    public final cbo q(Throwable th, bse bseVar, boolean z, int i) {
        int iC;
        if (bseVar == null || this.r) {
            iC = 4;
        } else {
            this.r = true;
            try {
                iC = c(bseVar) & 7;
                this.r = false;
            } catch (cbo unused) {
                this.r = false;
                iC = 4;
            } catch (Throwable th2) {
                this.r = false;
                throw th2;
            }
        }
        return new cbo(1, th, null, i, f(), this.a, bseVar, bseVar == null ? 4 : iC, this.i, z);
    }

    protected final ccu r() {
        ccu ccuVar = this.m;
        ccuVar.a();
        return ccuVar;
    }

    @Override // defpackage.cdp
    public ccz s() {
        return null;
    }

    protected final cdr u() {
        cdr cdrVar = this.n;
        cdrVar.getClass();
        return cdrVar;
    }

    protected final cfd v() {
        cfd cfdVar = this.o;
        cfdVar.getClass();
        return cfdVar;
    }

    @Override // defpackage.cdp
    public final coo w() {
        return this.c;
    }

    @Override // defpackage.cdq
    public final void x() {
        synchronized (this.k) {
            this.s = null;
        }
    }

    @Override // defpackage.cdp
    public final void y() {
        ahno.O(this.b == 1);
        this.m.a();
        this.b = 0;
        this.c = null;
        this.q = null;
        this.g = false;
        D();
        this.i = null;
        this.j = -9223372036854775807L;
    }

    protected void D() {
    }

    protected void F() {
    }

    protected void H() {
    }

    protected void J() {
    }

    protected void K() {
    }

    protected void L() {
    }

    protected void ae() {
    }

    @Override // defpackage.cdp
    public final cdq t() {
        return this;
    }

    @Override // defpackage.cdp
    public /* synthetic */ void z() {
    }

    @Override // defpackage.cdm
    public void A(int i, Object obj) {
    }

    protected void E(boolean z, boolean z2) {
    }

    @Override // defpackage.cdp
    public /* synthetic */ void T(float f, float f2) {
    }

    protected void G(long j, boolean z, boolean z2) {
    }

    protected void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
    }
}
