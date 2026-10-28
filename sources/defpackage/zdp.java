package defpackage;

import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zdp extends zdl {
    wja b;
    wiu c;
    boolean d;
    zdo e;
    private final zjr f;
    private final zdo[] g;
    private zlm h;

    public zdp(zjr zjrVar, zdo... zdoVarArr) {
        super(zdoVarArr[0]);
        this.f = zjrVar;
        this.g = zdoVarArr;
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void C() {
        ((zdo) this.a).C();
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void D(ywn ywnVar) {
        ((zdo) this.a).D(ywnVar);
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void G() {
        ((zdo) this.a).G();
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void H(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource, boolean z) {
        for (int i = 0; i < 2; i++) {
            zdo zdoVar = this.g[i];
            if (zdoVar.V()) {
                zdoVar.H(restartPrefetchEvaluationSource, z);
            }
        }
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void K(zlm zlmVar) {
        this.h = zlmVar;
        super.K(zlmVar);
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void P(boolean z) {
        for (int i = 0; i < 2; i++) {
            zdo zdoVar = this.g[i];
            if (zdoVar.V()) {
                zdoVar.P(z);
            }
        }
    }

    @Override // defpackage.zdl, defpackage.zew
    public final boolean T(wja wjaVar, wiu wiuVar) {
        boolean z = true;
        if (!wjaVar.v.isEmpty() && !wiuVar.aR()) {
            z = false;
        }
        return s(wjaVar, wiuVar, z, ywn.b).T(wjaVar, wiuVar);
    }

    @Override // defpackage.zdl, defpackage.zew
    public final zsf Y(ywk ywkVar) {
        agfp agfpVarB = agfp.b(agdd.a);
        zdo zdoVarS = s(ywkVar.d, ywkVar.i, ywkVar.s(8), ywkVar.a);
        t(zdoVarS);
        zhq zhqVar = zhq.ABR;
        zdoVarS.getClass().getSimpleName();
        zsf zsfVarY = zdoVarS.Y(ywkVar);
        ywkVar.a.l("llv", Long.toString(agfpVarB.a(TimeUnit.MILLISECONDS)));
        return zsfVarY;
    }

    @Override // defpackage.zdl, defpackage.zcg
    public final zcf aF(ywk ywkVar) {
        boolean z = true;
        if (!ywkVar.s(8) && !ywkVar.d.v.isEmpty() && !ywkVar.i.aR()) {
            z = false;
        }
        zdo zdoVarS = s(ywkVar.d, ywkVar.i, z, ywkVar.a);
        if (zdoVarS instanceof zcg) {
            return ((zcg) zdoVarS).aF(ywkVar);
        }
        return null;
    }

    @Override // defpackage.zdl, defpackage.zcg
    public final zsf aG(zcf zcfVar, cno cnoVar, ywk ywkVar) {
        boolean z = true;
        if (!ywkVar.s(8) && !ywkVar.d.v.isEmpty() && !ywkVar.i.aR()) {
            z = false;
        }
        zdo zdoVarS = s(ywkVar.d, ywkVar.i, z, ywkVar.a);
        t(zdoVarS);
        if (zdoVarS instanceof zcg) {
            return ((zcg) zdoVarS).aG(zcfVar, cnoVar, ywkVar);
        }
        return null;
    }

    @Override // defpackage.zdl, defpackage.zew
    public final int b(wja wjaVar, wiu wiuVar) {
        return s(wjaVar, wiuVar, false, ywn.b).b(wjaVar, wiuVar);
    }

    @Override // defpackage.zdl, defpackage.zew
    public final yod m(wja wjaVar, wiu wiuVar, boolean z, yoc yocVar, int i) {
        boolean z2 = true;
        if (!z && (yocVar == null || !yocVar.c(32))) {
            z2 = false;
        }
        return s(wjaVar, wiuVar, z2, ywn.b).m(wjaVar, wiuVar, z, yocVar, i);
    }

    @Override // defpackage.zdl
    public final zcj q() {
        zcj zcjVarQ;
        for (int i = 0; i < 2; i++) {
            Object obj = this.g[i];
            if (obj instanceof zcj) {
                return (zcj) obj;
            }
            if ((obj instanceof zdl) && (zcjVarQ = ((zdl) obj).q()) != null) {
                return zcjVarQ;
            }
        }
        return super.q();
    }

    final zdo s(wja wjaVar, wiu wiuVar, boolean z, ywn ywnVar) {
        zdo zdoVar = this.e;
        if (zdoVar != null && this.b == wjaVar && this.c == wiuVar && this.d == z) {
            return zdoVar;
        }
        zdo[] zdoVarArr = this.g;
        for (int i = 0; i < 2; i++) {
            zdo zdoVar2 = zdoVarArr[i];
            if (zdoVar2.U(wjaVar, wiuVar, z)) {
                this.b = wjaVar;
                this.c = wiuVar;
                this.d = z;
                this.e = zdoVar2;
                return zdoVar2;
            }
        }
        if (this.f.i.m(333, 45754395L)) {
            zhv zhvVar = new zhv("invalid.parameter");
            zhvVar.b = zhw.a;
            zhvVar.e = false;
            zhvVar.f("itags", wjaVar.q());
            zhvVar.f("playbackType", wjaVar.s());
            ywnVar.k(zhvVar.a());
        }
        ywnVar.l("adpf", "");
        return zdoVarArr[0];
    }

    final synchronized void t(zdo zdoVar) {
        zew zewVar = this.a;
        if (zdoVar == zewVar) {
            return;
        }
        zewVar.aa(false, 20);
        if (this.f.dp()) {
            ajvs ajvsVar = ajvs.CODEC_INIT_REASON_PLAYER_SWITCH;
            zewVar.J(false, ajvsVar);
            zdoVar.J(true, ajvsVar);
        }
        if (this.h != null) {
            zewVar.K(null);
            zdoVar.K(this.h);
        }
        this.a = zdoVar;
    }

    @Override // defpackage.zdl, defpackage.zew
    public final void w(boolean z) {
        for (int i = 0; i < 2; i++) {
            zdo zdoVar = this.g[i];
            if (zdoVar.V()) {
                zdoVar.w(z);
            }
        }
    }
}
