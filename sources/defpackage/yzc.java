package defpackage;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yzc {
    public yzo d;
    private final Executor f;
    private final zjr g;
    private final yyv i;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public wgt e = wgt.NONE;
    private boolean h = true;

    public yzc(Executor executor, yyv yyvVar, zjr zjrVar) {
        this.f = executor;
        this.i = yyvVar;
        this.g = zjrVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    private final void f(wiu wiuVar, boolean z, boolean z2, wgt wgtVar) {
        boolean z3;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        zjr zjrVar = this.g;
        boolean z4 = zjrVar.S().l;
        boolean z5 = true;
        this.a = z && z4;
        if (z2 && z4) {
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (akwmVar.ay) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        this.b = z3;
        this.e = wgtVar;
        Set setV = wiuVar.V();
        Set setW = wiuVar.W();
        agkj agkjVarB = wiuVar.B();
        if (zjrVar.ar()) {
            zjrVar.F = setV;
            zjrVar.G = setW;
            zjrVar.H = agkjVarB;
            zBooleanValue = ((Boolean) zjrVar.I.io()).booleanValue();
        } else {
            zBooleanValue = zjrVar.fA(setV, setW, agkjVarB);
        }
        Set setV2 = wiuVar.V();
        Set setW2 = wiuVar.W();
        agkj agkjVarB2 = wiuVar.B();
        if (zjrVar.ar()) {
            zjrVar.F = setV2;
            zjrVar.G = setW2;
            zjrVar.H = agkjVarB2;
            zBooleanValue2 = ((Boolean) zjrVar.J.io()).booleanValue();
        } else {
            zBooleanValue2 = zjrVar.fo(setV2, setW2, agkjVarB2);
        }
        akwm akwmVar2 = wiuVar.d.f;
        if (akwmVar2 == null) {
            akwmVar2 = akwm.b;
        }
        if (!akwmVar2.aC || (!zBooleanValue && !zBooleanValue2)) {
            z5 = false;
        }
        this.c = z5;
    }

    public final void a(ByteBuffer byteBuffer, long j) {
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return;
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining + 1];
        bArr[0] = 0;
        byteBuffer.get(bArr, 1, iRemaining);
        this.f.execute(new laz(this, bArr, j, 11));
    }

    public final void b() {
        zkf.d(this.d);
        if (this.h && this.a && this.d.p()) {
            this.d.n(zlo.GL_CARDBOARD);
            this.b = true;
            this.h = false;
            this.i.h.n = null;
        }
    }

    public final void c() {
        this.a = false;
        this.b = false;
        this.e = wgt.NONE;
        zkf.d(this.d);
        this.d.m(true, new byte[0], 0L);
        this.h = true;
    }

    public final void d(zcf zcfVar) {
        wgt wgtVar;
        zcp zcpVarE;
        wgt wgtVar2;
        wiu wiuVar = zcfVar.y;
        zcd zcdVar = zcfVar.C;
        int iOrdinal = zcdVar.b().ordinal();
        if (iOrdinal == 0) {
            yod yodVar = zcdVar.a().a;
            boolean zL = yodVar.l();
            wgs wgsVar = yodVar.d;
            boolean z = wgsVar != null && wgsVar.Q();
            if (wgsVar == null) {
                wgtVar = wgt.NONE;
            } else if (wir.d().contains(Integer.valueOf(wgsVar.e()))) {
                wgtVar = wgt.AV1;
            } else {
                wgtVar = wir.C().contains(Integer.valueOf(wgsVar.e())) ? wgt.VP9 : wgt.NONE;
            }
            f(wiuVar, zL, z, wgtVar);
            return;
        }
        if (iOrdinal != 1 || (zcpVarE = zcfVar.e()) == null) {
            return;
        }
        wgs wgsVar2 = ((zbv) zcpVarE).c;
        boolean zT = wgsVar2.T();
        boolean zQ = wgsVar2.Q();
        if (wgsVar2.T() && wgsVar2.D()) {
            wgtVar2 = wgt.AV1;
        } else {
            wgtVar2 = (wgsVar2.T() && wgsVar2.E()) ? wgt.VP9 : wgt.NONE;
        }
        f(wiuVar, zT, zQ, wgtVar2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public final void e(zcf zcfVar) {
        int iAm;
        int iAm2;
        zkf.d(this.d);
        if (this.d.p()) {
            yib yibVar = yib.c;
            int iOrdinal = zcfVar.C.b().ordinal();
            if (iOrdinal != 0) {
                iAm = 3;
                if (iOrdinal != 1) {
                    iAm2 = 3;
                } else {
                    zcp zcpVarE = zcfVar.e();
                    if (zcpVarE == null) {
                        return;
                    }
                    wgs wgsVar = ((zbv) zcpVarE).c;
                    if (wgsVar.E()) {
                        iAm = wgsVar.am();
                        iAm2 = 3;
                    } else if (wgsVar.D()) {
                        iAm2 = wgsVar.am();
                    } else {
                        iAm2 = 3;
                    }
                }
            } else {
                iAm = zcfVar.A.M;
                iAm2 = zcfVar.A.N;
            }
            if (iAm == 17 || iAm2 == 17) {
                yibVar = yib.a;
            } else if (iAm == 19 || iAm2 == 19) {
                yibVar = yib.b;
            }
            yzo yzoVar = this.d;
            boolean z = this.a;
            zlm zlmVar = yzoVar.b.l;
            if (zlmVar != null) {
                zlmVar.y(z, yibVar);
            }
        }
    }
}
