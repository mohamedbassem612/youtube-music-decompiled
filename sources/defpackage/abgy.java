package defpackage;

import android.util.Pair;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgy implements sxu, abha {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/overlay/subtitles/CabrSubtitleTrackHandler");
    private final acaq b;
    private final acag c;
    private final Executor d;
    private final twi e;
    private acaj f;
    private sxw g;
    private final abhe h;

    public abgy(acaq acaqVar, acag acagVar, Executor executor, abhe abheVar, twi twiVar) {
        this.b = acaqVar;
        this.c = acagVar;
        this.d = executor;
        this.h = abheVar;
        this.e = twiVar;
    }

    private final void i(acaj acajVar) {
        acaj acajVar2 = this.f;
        if (acajVar2 != null && acajVar2 != acajVar) {
            acajVar2.b();
        }
        this.f = acajVar;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        acap acapVar = (acap) obj;
        acbn acbnVar = (acbn) obj2;
        this.g = null;
        if (acbnVar == null) {
            d();
            return;
        }
        agkj agkjVarD = this.h.d();
        acca accaVar = acapVar.a;
        acga acgaVar = (acga) agkjVarD.get(accaVar.d);
        if (acgaVar != null) {
            acag acagVar = this.c;
            i(new acah(acbnVar, acgaVar, this.e, new acac(60000L, 60000L), new acad(acagVar, accaVar), acagVar.f, acagVar.g, acagVar.h));
        }
    }

    @Override // defpackage.abha
    public final void c() {
        acaj acajVar = this.f;
        if (acajVar != null) {
            acajVar.a();
        }
    }

    public final void d() {
        this.h.e();
        g();
    }

    @Override // defpackage.abha
    public final void e(aazk aazkVar) {
        acaj acajVar = this.f;
        if (acajVar != null) {
            acajVar.c(aazkVar.a);
        }
    }

    @Override // defpackage.abha
    public final void f(long j, float f) {
        acaj acajVar = this.f;
        if (acajVar != null) {
            acajVar.d(j, f);
        }
    }

    @Override // defpackage.abha
    public final void g() {
        i(null);
        sxw sxwVar = this.g;
        if (sxwVar != null) {
            sxwVar.c();
            this.g = null;
        }
        agqr it = this.h.d().values().iterator();
        while (it.hasNext()) {
            ((acga) it.next()).p(acbl.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [aunn] */
    @Override // defpackage.abha
    public final void h(acca accaVar) {
        wgs wgsVarD;
        Long lValueOf;
        ablm ablmVar;
        axsp axspVar;
        d();
        if (accaVar == null || accaVar.g()) {
            return;
        }
        int i = accaVar.e;
        if (i != wgq.DASH_FMP4_TT_WEBVTT.ep && i != wgq.DASH_FMP4_TT_FMT3.ep) {
            this.g = new sxw(this);
            this.b.a(new acap(accaVar), this.g);
            return;
        }
        abhe abheVar = this.h;
        acga acgaVar = (acga) abheVar.d().get(accaVar.d);
        if (acgaVar != null) {
            String str = abheVar.h;
            acag acagVar = this.c;
            twi twiVar = this.e;
            wjf wjfVar = acagVar.p;
            acam acamVar = null;
            if (wjfVar != null && (wgsVarD = aawo.d(wjfVar, accaVar)) != null) {
                wiu wiuVarF = acagVar.p.f();
                Long lT = wiuVarF.T();
                if (lT != null) {
                    lValueOf = wiuVarF.R();
                } else {
                    long jAk = wgsVarD.ak();
                    Long lValueOf2 = Long.valueOf(jAk);
                    lValueOf2.getClass();
                    lT = jAk < 0 ? null : lValueOf2;
                    long jAj = wgsVarD.aj();
                    lValueOf = Long.valueOf(jAj);
                    lValueOf.getClass();
                    if (jAj < 0) {
                        lValueOf = null;
                    }
                }
                Pair pair = new Pair(lT, lValueOf);
                wjf wjfVar2 = acagVar.p;
                if (wjfVar2 == null || wjfVar2.f() == null || !acagVar.p.f().ag()) {
                    ablmVar = null;
                    axspVar = null;
                } else {
                    ablmVar = (ablm) acagVar.j.io();
                    axspVar = null;
                }
                ScheduledExecutorService scheduledExecutorService = acagVar.d;
                axsp axspVar2 = axspVar;
                String str2 = acagVar.e;
                ablm ablmVar2 = ablmVar;
                acip acipVar = acagVar.q;
                axsp axspVarAx = (acipVar == null || !acipVar.au().equals(str)) ? axspVar2 : acagVar.q.ax();
                Long l = (Long) pair.first;
                Long l2 = (Long) pair.second;
                axsp axspVar3 = axspVarAx;
                acac acacVar = new acac(600000L, 600000L);
                Object obj = axspVar2;
                acad acadVar = new acad(acagVar, accaVar);
                abmt abmtVar = acagVar.i;
                if (abmtVar.bF()) {
                    obj = acagVar.u;
                }
                acamVar = new acam(str, scheduledExecutorService, wgsVarD, str2, acgaVar, twiVar, ablmVar2, axspVar3, l, l2, acacVar, acadVar, obj, new aasz(acagVar, 9), abmtVar.bz(), abmtVar);
            }
            i(acamVar);
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        this.g = null;
        ((agrc) ((agrc) ((agrc) a.b()).j(exc)).k("com/google/android/libraries/youtube/player/features/overlay/subtitles/CabrSubtitleTrackHandler", "onError", (char) 136, "CabrSubtitleTrackHandler.java")).t("error retrieving subtitle");
        if (a.x()) {
            d();
        } else {
            this.d.execute(afwl.i(new abbj(this, 9)));
        }
    }
}
