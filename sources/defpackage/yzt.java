package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.view.Surface;
import androidx.car.app.model.Alert;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yzt extends ctb {
    private static final wgq n = wgq.DASH_WEBM_VP9_720P;
    private boolean H;
    private boolean I;
    private long J;
    private final long K;
    private final float L;
    private final yye M;
    private final boolean N;
    private yxu O;
    private final zeo o;
    private boolean p;
    private boolean q;

    public yzt(Context context, cty ctyVar, yye yyeVar, Handler handler, yzl yzlVar, zeo zeoVar, long j, cli cliVar) {
        cta ctaVar = new cta(context);
        ctaVar.d = cliVar;
        ctaVar.c = yzlVar;
        ctaVar.e = 5000L;
        ctaVar.f = false;
        ctaVar.g = handler;
        ctaVar.h = ctyVar;
        ctaVar.i = 10;
        ctaVar.j = true != yyeVar.d.ez() ? 30.0f : 0.0f;
        ctaVar.k = 15000L;
        long jM = yyeVar.d.M();
        if (jM > 0) {
            ctaVar.l = jM;
        }
        super(ctaVar);
        this.p = false;
        this.M = yyeVar;
        this.N = yyeVar.d.dC();
        this.o = zeoVar;
        this.I = yyeVar.d.fl();
        this.K = j;
        this.O = yxu.a;
        this.L = yyeVar.d.H() > 0 ? yyeVar.d.H() : 999.0f;
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) {
        if (i != 1) {
            if (i != 10001) {
                if (i != 10003) {
                    super.A(i, obj);
                    return;
                } else {
                    aK();
                    return;
                }
            }
            yxu yxuVar = (yxu) obj;
            if (yxuVar == null) {
                yxuVar = yxu.a;
            }
            this.O = yxuVar;
            return;
        }
        yye yyeVar = this.M;
        if (!yyeVar.d.be()) {
            super.A(i, obj);
            return;
        }
        Object objY = hna.Y(obj);
        if (obj instanceof juu) {
            long jW = hna.W(obj);
            ywn ywnVarC = yyeVar.c();
            if (ywnVarC != null) {
                ywnVarC.w("ecdi", a.bS(jW, "mc_vr.unpacked_payload;tok."));
            }
        }
        super.A(i, objY);
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cav
    protected final void E(boolean z, boolean z2) {
        super.E(z, z2);
        this.O.a();
        this.q = this.M.c.c;
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        super.G(j, z, z2);
        this.J = 0L;
    }

    @Override // defpackage.ctb, defpackage.cav
    public final void K() {
        this.H = this.M.a().Z();
        super.K();
        this.O.d();
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final void aG(DecoderInputBuffer decoderInputBuffer) {
        super.aG(decoderInputBuffer);
        this.O.b();
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final boolean aN(DecoderInputBuffer decoderInputBuffer) {
        if (this.N) {
            return false;
        }
        return super.aN(decoderInputBuffer);
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final boolean aP(clo cloVar) {
        Surface surface = ((ctb) this).l;
        yye yyeVar = this.M;
        if (yyeVar.d.aw() && surface != null && !surface.isValid()) {
            this.p = true;
            this.o.r(surface, zsf.c, false, yyeVar.c());
            return false;
        }
        if (this.p) {
            this.p = false;
            this.o.r(surface, zsf.c, true, yyeVar.c());
        }
        return super.bb(cloVar);
    }

    @Override // defpackage.ctb
    protected final void aW(clk clkVar, Surface surface) throws Exception {
        try {
            clkVar.l(surface);
            this.o.j(zsf.c, surface, null);
        } catch (Exception e) {
            this.o.j(zsf.c, surface, e);
            this.I = true;
            taf.j(this.M.d.eS(true), new xwk(10));
            throw e;
        }
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cdp
    public final boolean ah() {
        if (!super.ah()) {
            return false;
        }
        this.O.c();
        return true;
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final caz aj(clo cloVar, bse bseVar, bse bseVar2, boolean z) {
        return this.M.d.dr() ? super.aj(cloVar, bseVar, bseVar2, z) : new caz(cloVar.b, bseVar, bseVar2, 0, 4);
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final void am(DecoderInputBuffer decoderInputBuffer) {
        if (this.q) {
            super.am(decoderInputBuffer);
            return;
        }
        long jAA = aA();
        this.M.c.a(decoderInputBuffer.supplementalData, jAA != -9223372036854775807L ? decoderInputBuffer.timeUs - jAA : decoderInputBuffer.timeUs);
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final void ax(String str, gmj gmjVar, long j, long j2) {
        super.ax(str, gmjVar, j, j2);
        zcf zcfVar = this.M.m;
        if (zcfVar != null) {
            zcfVar.Z.h(zhc.a(this.x));
        }
    }

    @Override // defpackage.ctb
    protected final boolean ba(String str) {
        int iEM = this.M.d.eM() - 1;
        if (iEM == 2) {
            return true;
        }
        if (iEM != 3) {
            if (iEM != 4) {
                return super.ba(str);
            }
            if (this.I || super.ba(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctb
    protected final boolean bc(long j, boolean z) {
        if (!this.H) {
            return super.bc(j, z);
        }
        int iL = l(j);
        if (iL == 0) {
            return false;
        }
        cay cayVar = this.D;
        if (z) {
            cayVar.d += iL;
            return false;
        }
        cayVar.j++;
        aY(iL, 0);
        return false;
    }

    @Override // defpackage.ctb
    protected final boolean bd(long j, long j2, boolean z) {
        if (this.H) {
            return true;
        }
        return super.bd(j, j2, z);
    }

    @Override // defpackage.ctb
    protected final boolean bf(long j, long j2, boolean z) {
        long j3 = this.K;
        if ((j3 <= 0 || j2 - this.J <= j3) && super.bf(j, j2, z)) {
            return true;
        }
        this.J = j2;
        return false;
    }

    @Override // defpackage.ctb
    protected final boolean bi(clo cloVar) {
        return false;
    }

    @Override // defpackage.ctb
    protected final aamu bl(clo cloVar, bse bseVar, bse[] bseVarArr) {
        int iIntValue;
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = cloVar.e;
        int iIntValue2 = Alert.DURATION_SHOW_INDEFINITELY;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            iIntValue = Integer.MAX_VALUE;
        } else {
            iIntValue2 = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
            iIntValue = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
        }
        aamu aamuVarBl = super.bl(cloVar, bseVar, bseVarArr);
        int i3 = aamuVarBl.c;
        int i4 = aamuVarBl.b;
        boolean z = i3 >= i4;
        wgq wgqVar = n;
        if (z) {
            i = wgqVar.er;
            i2 = wgqVar.es;
        } else {
            i = wgqVar.es;
            i2 = wgqVar.er;
        }
        int iMin = Math.min(Math.max(i3, i), iIntValue2);
        int iMin2 = Math.min(Math.max(i4, i2), iIntValue);
        if (this.M.d.am()) {
            iMin = Math.max(i3, Math.min(i, iIntValue2));
            iMin2 = Math.max(i4, Math.min(i2, iIntValue));
        }
        bsd bsdVar = new bsd();
        bsdVar.u = iMin;
        bsdVar.v = iMin2;
        bsdVar.e(bseVar.q);
        return new aamu(iMin, iMin2, b(cloVar, new bse(bsdVar)), (char[]) null);
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final float e(float f, bse bseVar, bse[] bseVarArr) {
        int i;
        int i2;
        yye yyeVar = this.M;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.cL()) {
            return -1.0f;
        }
        float fD = zjrVar.D();
        if (fD > 0.0f) {
            float fMin = Math.min(fD, this.L);
            clo cloVar = this.x;
            if (cloVar != null && (i = bseVar.w) != -1 && (i2 = bseVar.x) != -1) {
                float fA = cloVar.a(i, i2);
                if (fA > 0.0f) {
                    return Math.min(fMin, fA);
                }
            }
            return fMin;
        }
        if (zjrVar.bi()) {
            return Math.min(super.e(f, bseVar, bseVarArr), this.L);
        }
        zcf zcfVar = yyeVar.m;
        if (zcfVar == null) {
            return Math.min(super.e(f, bseVar, bseVarArr), this.L);
        }
        float fA2 = zcfVar.c().a();
        if (fA2 <= 0.0f) {
            fA2 = 30.0f;
        }
        return Math.min(fA2 * f, this.L);
    }
}
