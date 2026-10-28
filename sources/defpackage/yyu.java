package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlayer;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yyu extends zik {
    public final zcf a;
    zlm b;
    public float c;
    public final cdv d;
    public final ywj e;
    public float f;
    public Optional g;
    public final cno h;
    public final /* synthetic */ yyv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyu(yyv yyvVar, ywk ywkVar, zcf zcfVar, boolean z, cno cnoVar) {
        super((byte[]) null);
        this.i = yyvVar;
        this.b = yyvVar.h.l;
        this.c = ywkVar.m;
        this.e = ywkVar.b;
        this.g = Optional.of(Boolean.valueOf(ywkVar.u));
        yvw yvwVar = ywkVar.e;
        this.a = zcfVar;
        if (z && zcfVar.g != yvwVar.a) {
            zcfVar.i = 0;
        }
        zcfVar.m(yvwVar.a, appa.SEEK_SOURCE_START_PLAYBACK);
        this.d = new cdv(bwp.y(yvwVar.b), yyvVar.h.d.i.l(499, 45839360L, false) ? bwp.y(yvwVar.c) : 0L);
        this.f = ywkVar.l;
        this.h = cnoVar;
    }

    public final void g(boolean z, Optional optional) {
        yyv yyvVar = this.i;
        zjr zjrVar = yyvVar.h.d;
        int iIntValue = 2;
        if (zjrVar.ej()) {
            yyk yykVar = new yyk(this, iIntValue);
            if (true == optional.isPresent()) {
                ((yyu) yykVar.a).i.h.c().l("aact", Integer.toString(((Integer) optional.get()).intValue()));
            }
        }
        int i = true != z ? 1 : 4;
        if (i != yyvVar.F) {
            ExoPlayer exoPlayer = yyvVar.f;
            if (zjrVar.ej() && !optional.isEmpty()) {
                iIntValue = ((Integer) optional.get()).intValue();
            }
            brq brqVar = new brq(iIntValue, i);
            ccm ccmVar = (ccm) exoPlayer;
            ccmVar.ae();
            if (!ccmVar.y) {
                if (!Objects.equals(ccmVar.v, brqVar)) {
                    ccmVar.v = brqVar;
                    ccmVar.Y(1, 3, brqVar);
                    ccmVar.F.e(20, new cbv(brqVar, 6));
                }
                ccmVar.f.g(ccmVar.v);
                ccmVar.F.d();
            }
            yyvVar.F = i;
        }
    }

    @Override // defpackage.zik
    public final void jr() {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        yyv yyvVar = this.i;
        if (looperMyLooper == mainLooper) {
            yyvVar.h.d.u.g();
        } else {
            yyvVar.L.execute(afwl.i(new ywt(this, 5)));
        }
    }

    @Override // defpackage.zik
    public final void js(zlm zlmVar) {
        this.b = zlmVar;
    }

    @Override // defpackage.zik
    public final void jt(cdy cdyVar, long j, long j2, int i) {
        int i2;
        yyv yyvVar = this.i;
        int iN = yyvVar.f.n();
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        zcf zcfVar = this.a;
        zcf zcfVar2 = zcfVar.m;
        zcf zcfVarC = null;
        ywk ywkVar = zcfVar2 != null ? zcfVar2.ag : null;
        yyvVar.an(zcfVar);
        if (zcfVar2 == null || ywkVar == null) {
            btn btnVar = cdyVar.b;
            if (!btnVar.n() && (i2 = cdyVar.c) < btnVar.c()) {
                btm btmVar = new btm();
                btnVar.e(i2, btmVar, 0L);
                zcfVarC = zce.c(btmVar);
            }
            String strCa = a.ca(zcfVar2 != null ? zcfVar2.a : "null", zcfVarC != null ? zcfVarC.a : "null", "eventTimeCpn:", ";queuedPlaybackCpn.");
            zhr.e(zhq.EXO, "%s", strCa);
            zhv zhvVar = new zhv("player.fatalexception");
            zhvVar.e(yyvVar.e());
            zhvVar.c = strCa;
            zhz zhzVarA = zhvVar.a();
            if (yyvVar.h.d.i.m(45, 45389058L)) {
                zhzVarA.p();
            }
            yyvVar.k.post(new yts(this, zhzVarA, 14));
            return;
        }
        if (zcfVar2.P) {
            ((ytp) yyvVar.C.io()).r(zcfVar2, this.b != null);
        } else {
            yyvVar.aC(zcfVar2.Z);
        }
        long j3 = jCurrentTimeMillis + cdyVar.a;
        yyvVar.i.d();
        yye yyeVar = yyvVar.h;
        zjr zjrVar = yyeVar.d;
        zjrVar.E.c(zcfVar2.a, zcfVar2.h());
        zcfVar.b.A(j, j2, ywkVar, 1 == (i ^ 1), j3, zgr.a);
        if (ywkVar.e.a != zjrVar.v() && Math.abs(j2 - ywkVar.e.a) > 500) {
            zcfVar2.Z.l("ttwp", "np." + j2 + ";sp." + ywkVar.e.a);
        }
        if (zjrVar.eC()) {
            zcm zcmVar = zcfVar2.d;
            zcmVar.f(cdyVar, true);
            zcmVar.b(cdyVar, iN);
        } else {
            zcfVar2.d.c(cdyVar, true, iN);
        }
        if (iN == 3) {
            zcfVar2.b.s(j3);
        }
        yyu yyuVar = new yyu(yyvVar, new ywk(ywkVar), zcfVar2, true, null);
        yyeVar.k = true;
        zcfVar2.i = 2;
        yyeVar.e(zcfVar2);
        yyvVar.g.l(zcfVar2.y, zcfVar2.Z);
        yyvVar.d.q(zcfVar.Z, zjrVar.dy(), zcfVar.y);
        yyeVar.i = true;
        yyvVar.Q(yyuVar);
        agfp agfpVar = (agfp) zcfVar2.ah.c;
        agfpVar.d();
        agfpVar.e();
        if (zjrVar.j.l(79, 45381672L, false)) {
            zcfVar.m = null;
        }
    }
}
