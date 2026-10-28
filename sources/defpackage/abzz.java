package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abzz extends acii {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/stats/playbacklistener/QoeStatsPlaybackListener");
    public final mbc b;
    public final abmt c;
    public final Map d;
    public aaxo e;
    private final zgm f;
    private final vyo g;
    private final tqj h;
    private final avlh i;
    private boolean j;
    private int k;
    private int l;

    public abzz(zgm zgmVar, avlh avlhVar, adws adwsVar, avlh avlhVar2, mbc mbcVar, vyo vyoVar, tqj tqjVar, abmt abmtVar) {
        boolean zK;
        boolean zK2;
        super(1);
        zgmVar.getClass();
        this.f = zgmVar;
        this.b = mbcVar;
        this.i = avlhVar2;
        this.g = vyoVar;
        this.h = tqjVar;
        this.c = abmtVar;
        this.d = new ConcurrentHashMap();
        avmm avmmVar = new avmm();
        avlhVar = abmtVar.bY() ? avlhVar.W(new ablh(10)) : avlhVar;
        avmmVar.c(avlhVar.p().W(new vvb(new abhg(20), 8)).al(new abwz(this, 15), new abeq(18)));
        avmmVar.c(avlhVar.p().W(new vvb(new abzy(1), 8)).al(new abwz(this, 16), new abeq(18)));
        avmmVar.c(adwsVar.b().ak(new abwz(this, 17)));
        int i = tqr.a;
        if (tqjVar.k(1073808352)) {
            zK = tqjVar.k(69164);
        } else {
            ajdf ajdfVar = z().q;
            zK = (ajdfVar == null ? ajdf.a : ajdfVar).b;
        }
        if (zK) {
            avmmVar.c(adwsVar.a().ak(new abwz(this, 18)));
        }
        if (tqjVar.k(1073808352)) {
            zK2 = tqjVar.k(69165);
        } else {
            ajdf ajdfVar2 = z().q;
            zK2 = (ajdfVar2 == null ? ajdf.a : ajdfVar2).h;
        }
        if (zK2) {
            avmmVar.c(avlhVar2.ak(new abwz(this, 19)));
        }
        avmmVar.c(avlhVar.p().W(new vvb(new abzy(0), 8)).al(new abwz(this, 20), new abeq(18)));
        avmmVar.c(avlhVar.p().W(new vvb(new abzy(2), 8)).al(new acae(this, 1), new abeq(18)));
        avmmVar.c(avlhVar.p().W(new vvb(new abzy(3), 8)).al(new abwz(this, 13), new abeq(18)));
        avmmVar.c(avlhVar.p().W(new vvb(new abhg(19), 8)).M(aawt.class).al(new abwz(this, 14), new abeq(18)));
    }

    private final boolean A() {
        int i = tqr.a;
        tqj tqjVar = this.h;
        if (tqjVar.k(1073808352)) {
            return tqjVar.k(69168);
        }
        ajdf ajdfVar = z().q;
        if (ajdfVar == null) {
            ajdfVar = ajdf.a;
        }
        return ajdfVar.g;
    }

    private final boolean B() {
        alik alikVarB;
        vyo vyoVar = this.g;
        if (vyoVar == null || (alikVarB = vyoVar.b()) == null) {
            return false;
        }
        anew anewVar = alikVarB.j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        ajbv ajbvVar = anewVar.g;
        if (ajbvVar == null) {
            ajbvVar = ajbv.a;
        }
        return ajbvVar.i;
    }

    private final void C(String str, String str2, wja wjaVar, wjm wjmVar, wiu wiuVar, aigj aigjVar, boolean z) {
        Map map = this.d;
        zgj zgjVar = (zgj) map.get(str2);
        if (zgjVar != null) {
            if (zgjVar.t) {
                return;
            }
            zgjVar.f(wjmVar, str2, "", null, str, wjaVar, wiuVar, aigjVar, z);
            return;
        }
        zgm zgmVar = this.f;
        boolean z2 = this.j;
        boolean z3 = false;
        if (this.c.aL() && z) {
            z3 = true;
        }
        zgj zgjVarB = zgmVar.b(wjmVar, str2, null, "", null, str, wjaVar, z2, wiuVar, aigjVar, z3);
        if (zgjVarB != null) {
            map.put(str2, zgjVarB);
            if (A()) {
                y(zgjVarB, this.e);
            }
        }
    }

    public static void y(zgj zgjVar, aaxo aaxoVar) {
        if (aaxoVar != null) {
            abnr abnrVar = aaxoVar.a;
            int i = aaxoVar.d;
            zgjVar.i(abnrVar.i, abnrVar.b(), aaxoVar.c, i);
            zgjVar.G(false);
        }
    }

    private final apbx z() {
        vyo vyoVar = this.g;
        if (vyoVar == null || vyoVar.b() == null) {
            return apbx.b;
        }
        anew anewVar = vyoVar.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        apbx apbxVar = anewVar.d;
        return apbxVar == null ? apbx.b : apbxVar;
    }

    @Override // defpackage.acii
    public final void W(arfb arfbVar, String str, aipc aipcVar) {
        if (str != null) {
            Map map = this.d;
            if (map.containsKey(str)) {
                ((zgj) map.get(str)).E(arfbVar, aipcVar);
            }
        }
    }

    @Override // defpackage.acii
    public final void b(String str) {
        zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
        if (zgjVar != null) {
            if (B()) {
                zgjVar.t("dedi", new abzw(this, 0));
            }
            zgjVar.z();
        }
    }

    @Override // defpackage.acii
    public final void e(String str) {
        Map map = this.d;
        zgj zgjVar = (zgj) map.get(str);
        if (zgjVar != null) {
            if (this.c.bU()) {
                zgjVar.M("mhbrc", Integer.toString(this.l), 2);
                zgjVar.M("hbcrc", Integer.toString(this.k), 2);
            }
            zgjVar.e();
            map.remove(str);
        }
    }

    @Override // defpackage.acii
    public final void f(aazj aazjVar) {
        afvn afvnVarB = aawb.b(aazjVar, "QSPL");
        try {
            abob abobVar = aazjVar.a;
            wjf wjfVar = aazjVar.b;
            String str = aazjVar.g;
            wjf wjfVar2 = aazjVar.c;
            String str2 = aazjVar.h;
            int iOrdinal = abobVar.ordinal();
            if (iOrdinal == 4 || iOrdinal == 5) {
                if (wjfVar2 != null && wjfVar != null && str2 != null) {
                    this.j = false;
                    C(wjfVar2.G(), str2, wjfVar.g(), wjfVar2.h().e, wjfVar2.f(), wjfVar.h().b(), wjfVar2.Z());
                }
            } else if ((iOrdinal == 7 || iOrdinal == 8) && wjfVar != null && str != null) {
                C(wjfVar.G(), str, wjfVar.g(), wjfVar.h().e, wjfVar.f(), wjfVar.h().b(), wjfVar.Z());
                this.j = false;
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.acii
    public final void g(aazk aazkVar) {
        afvx afvxVarAd = tym.ad(trx.QOE_VIDEO_TIME_EVENT);
        try {
            String str = aazkVar.i;
            zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
            if (zgjVar != null) {
                zgjVar.F(aazkVar.h, aazkVar.a, aazkVar.e);
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.acii
    public final void h(aazn aaznVar) {
        afvx afvxVarAd = tym.ad(trx.QOE_YOUTUBE_PLAYER_STATE_EVENT);
        try {
            String str = aaznVar.b;
            zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
            if (zgjVar != null) {
                switch (aaznVar.a) {
                    case 2:
                        zgjVar.B();
                        break;
                    case 3:
                        zgjVar.x();
                        break;
                    case 4:
                        if (this.c.g.l(441, 45801777L, false)) {
                            zgjVar.x();
                        }
                        break;
                    case 5:
                        zgjVar.p();
                        break;
                    case 6:
                        zgjVar.y();
                        break;
                    case 7:
                        zgjVar.r();
                        break;
                    case 9:
                    case 10:
                        zgjVar.C();
                        break;
                }
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acii
    public final void j(yvu yvuVar, String str) {
        zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
        if (zgjVar != null) {
            zgjVar.s(yvuVar);
        }
    }

    @Override // defpackage.acii
    public final void k(yvu yvuVar, String str) {
        j(yvuVar, str);
    }

    @Override // defpackage.acii
    public final void l() {
        this.k++;
    }

    @Override // defpackage.acii
    public final void m(arfb arfbVar, String str) {
        if (str != null) {
            Map map = this.d;
            if (map.containsKey(str)) {
                ((zgj) map.get(str)).u(arfbVar);
            }
        }
    }

    @Override // defpackage.acii
    public final void n(String str, String str2) {
        if (str != null) {
            Map map = this.d;
            if (map.containsKey(str)) {
                ((zgj) map.get(str)).n(str2);
            }
        }
    }

    @Override // defpackage.acii
    public final void o(String str, long j, long j2) {
        zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
        if (zgjVar != null) {
            if (this.c.as()) {
                zgjVar.v(zgh.LIVE_STREAM_END_SOURCE_HEARTBEAT, -1L, j, j2);
            } else {
                zgjVar.v(zgh.LIVE_STREAM_END_SOURCE_HEARTBEAT, -1L, -1L, -1L);
            }
        }
    }

    @Override // defpackage.acii
    public final void p(zhz zhzVar, String str) {
        zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
        if (zgjVar != null) {
            zgjVar.w(zhzVar);
        }
    }

    @Override // defpackage.acii
    public final void q() {
        this.l++;
    }

    @Override // defpackage.acii
    public final void r(aony aonyVar, String str) {
        v("hrps", Integer.toString(aonyVar.k), true, str);
    }

    @Override // defpackage.acii
    public final void s(String str, abnl abnlVar) {
        afvx afvxVarAd = tym.ad(trx.QOE_PLAYBACK_CONTEXT_CREATED);
        try {
            Map map = this.d;
            if (!map.containsKey(str)) {
                tqj tqjVar = this.h;
                int i = tqr.a;
                if (tqjVar.k(1073808352) ? tqjVar.k(69167) : z().d) {
                    zgm zgmVar = this.f;
                    arie arieVar = null;
                    String strW = abnlVar == null ? null : abnlVar.w();
                    if (abnlVar != null && (arieVar = abnlVar.i().c) == null) {
                        arieVar = arie.a;
                    }
                    zgj zgjVarA = zgmVar.a(str, strW, arieVar, false, false);
                    if (zgjVarA != null) {
                        map.put(str, zgjVarA);
                        if (A()) {
                            y(zgjVarA, this.e);
                        }
                    }
                }
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.acii
    public final void t(String str) {
        zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
        if (zgjVar != null) {
            if (B()) {
                zgjVar.t("dedi", new abzw(this, 1));
            }
            zgjVar.z();
        }
    }

    @Override // defpackage.acii
    public final void u(aboe aboeVar) {
        String str = aboeVar.b;
        zgj zgjVar = str != null ? (zgj) this.d.get(str) : null;
        if (zgjVar != null) {
            tqj tqjVar = this.h;
            int i = tqr.a;
            if (tqjVar.k(1073808352) ? tqjVar.k(69166) : z().e) {
                int i2 = aboeVar.j - 1;
                if (i2 == 3) {
                    zgjVar.A(aboeVar.h, aboeVar.g);
                } else if (i2 == 16) {
                    zgjVar.G(true);
                }
            }
        }
    }

    @Override // defpackage.acii
    public final void v(String str, final String str2, boolean z, String str3) {
        zgj zgjVar;
        afvx afvxVarAd = tym.ad(trx.QOE_STRING_KEY_VALUE_EVENT);
        if (str3 != null) {
            try {
                zgjVar = (zgj) this.d.get(str3);
            } catch (Throwable th) {
                try {
                    afvxVarAd.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            zgjVar = null;
        }
        if (zgjVar != null) {
            if (z) {
                zgjVar.t(str, new zgg() { // from class: abzx
                    @Override // defpackage.zgg
                    public final String a(long j) {
                        long jB = this.a.b.b() - j;
                        int i = typ.a;
                        return "rt." + (jB / 1000.0d) + ';' + typ.c(str2);
                    }
                });
            } else {
                zgjVar.M(str, str2, 2);
            }
        }
        afvxVarAd.close();
    }

    @Override // defpackage.acii
    public final void w() {
        this.j = true;
    }

    @Override // defpackage.acii
    public final void x(String str, String str2) {
        zgj zgjVar = str2 != null ? (zgj) this.d.get(str2) : null;
        if (zgjVar != null) {
            zgjVar.k(str);
        }
    }
}
