package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hot extends hor {
    public static final agrf ae = agrf.h("com/google/android/apps/youtube/music/offline/browse/OfflinePlaylistDetailPageFragment");
    public Executor af;
    public Executor ag;
    public xit ah;
    public aunn ai;
    public aunn aj;
    public aunn ak;
    public hvh al;
    mba am;
    public xir an;

    private static int J(heh hehVar) {
        ajwo ajwoVar = hehVar.f;
        if (ajwoVar == null) {
            return 64424;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return 64424;
        }
        ajwo ajwoVar2 = hehVar.f;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
        ajwoVar2.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
        ajmh ajmhVar = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
        if (ajmhVar == null) {
            ajmhVar = ajmh.a;
        }
        ajmg ajmgVar = ajmhVar.c;
        if (ajmgVar == null) {
            ajmgVar = ajmg.a;
        }
        int iJ = atqp.J(ajmgVar.c);
        if (iJ == 0) {
            iJ = 1;
        }
        int i = iJ - 1;
        if (i != 1) {
            return i == 24 ? 278306 : 64424;
        }
        return 64423;
    }

    public final void I(Throwable th) {
        agrx agrxVar = agso.a;
        cf activity = getActivity();
        if (activity == null || !jku.c(activity)) {
            return;
        }
        if (!(th instanceof huj)) {
            j((heh) this.H, th);
        } else {
            jki jkiVar = this.j;
            jkiVar.g(jkiVar.b());
        }
    }

    @Override // defpackage.gms
    protected final int a() {
        return J((heh) this.H);
    }

    @Override // defpackage.gms
    protected final Optional hE() {
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awut, java.lang.Object] */
    @Override // defpackage.gms
    protected final /* bridge */ /* synthetic */ void hF(hej hejVar) throws Throwable {
        ajwo ajwoVar;
        String strSubstring;
        final hfw hfwVar;
        heh hehVar = (heh) hejVar;
        if (hehVar == null || (ajwoVar = hehVar.f) == null) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            hei heiVar = hehVar.g;
            hei heiVar2 = hei.b;
            if (heiVar != heiVar2) {
                E();
                hehVar.k(heiVar2);
                k(hehVar);
                ajwo ajwoVar2 = hehVar.f;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                String str = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
                gmj gmjVar = (gmj) this.ai.io();
                ListenableFuture listenableFutureAg = awrc.ag(gmjVar.c, awov.a, new gmc(gmjVar, gmjVar.a.e(), (awoq) null, 2, (byte[]) null));
                if (!str.contains("MPED")) {
                    if (str.startsWith("VL")) {
                        strSubstring = str.substring(2);
                    } else if (str.startsWith("MPED")) {
                        strSubstring = str.substring(4);
                    } else if (str.equals("FEoffline_mixtape")) {
                        strSubstring = "PPOM";
                    } else if (str.equals("FEoffline_songs")) {
                        strSubstring = "PPSV";
                    } else {
                        if (!str.equals("FEoffline_nma_tracks")) {
                            throw new IllegalArgumentException(a.bT(str, "BrowseId:", " should refer to a playlist"));
                        }
                        strSubstring = "PPSE";
                    }
                    aihf aihfVarCreateBuilder = ascb.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ascb ascbVar = (ascb) aihfVarCreateBuilder.instance;
                    strSubstring.getClass();
                    ascbVar.b |= 1;
                    ascbVar.c = strSubstring;
                    hfwVar = new hfw((ascb) aihfVarCreateBuilder.build(), 13);
                } else {
                    if (!str.startsWith("MPED")) {
                        throw new IllegalArgumentException(a.bT(str, "BrowseId:", " should refer to a video"));
                    }
                    String strSubstring2 = str.substring(4);
                    aihf aihfVarCreateBuilder2 = ascc.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ascc asccVar = (ascc) aihfVarCreateBuilder2.instance;
                    strSubstring2.getClass();
                    asccVar.b |= 1;
                    asccVar.c = strSubstring2;
                    hfwVar = new hfw((ascc) aihfVarCreateBuilder2.build(), 12);
                }
                taf.k(this, ahno.ar(listenableFutureAg, new agek() { // from class: hos
                    @Override // defpackage.agek
                    public final Object apply(Object obj) {
                        mba mbaVar = (mba) hfwVar.apply((afyl) obj);
                        hot hotVar = this.a;
                        hotVar.am = mbaVar;
                        hotVar.am.a(new gmk(hotVar, 19), new gmk(hotVar, 20));
                        return null;
                    }
                }, this.ag), new glm(this, 16), new gnx(20));
            }
        }
    }

    @Override // defpackage.gms
    protected final /* synthetic */ void l(hej hejVar) {
        Optional optionalEmpty;
        heh hehVar = (heh) hejVar;
        Object obj = hehVar.h;
        int iU = 0;
        if (obj == null || ((wfy) obj).f() == null || ((wfy) hehVar.h).f().isEmpty() || ((wfy) hehVar.h).f().get(0) == null) {
            isi isiVar = this.X;
            if (isiVar != null) {
                isiVar.n(hehVar.f, hehVar.n);
            }
        } else {
            apji apjiVar = null;
            this.g.b(xhb.a(J(hehVar)), this.K ? hehVar.f : null, null);
            almd almdVar = ((wfy) hehVar.h).a;
            if (almdVar == null || (almdVar.b & 2) == 0) {
                optionalEmpty = Optional.empty();
            } else {
                allx allxVar = almdVar.d;
                if (allxVar == null) {
                    allxVar = allx.a;
                }
                optionalEmpty = Optional.ofNullable(yno.ev(allxVar));
            }
            Toolbar toolbar = this.y;
            if (toolbar != null && toolbar.f() != null && ((vxz) this.ak.io()).l(62, 45829826L, false)) {
                ((hkq) this.aj.io()).d(hehVar);
                ((hkq) this.aj.io()).b(this.y.f());
            }
            hge hgeVar = new hge(this, 9);
            if (true == optionalEmpty.isPresent()) {
                ((gms) hgeVar.a).p(optionalEmpty.get());
            }
            n(((wfy) hehVar.h).f());
            Optional optionalD = d();
            iU = optionalD.isPresent() ? ((jav) optionalD.get()).u() : 0;
            isi isiVar2 = this.X;
            if (isiVar2 != null) {
                isiVar2.m();
            }
            almd almdVar2 = ((wfy) hehVar.h).a;
            if ((almdVar2.b & 1073741824) != 0 && (apjiVar = almdVar2.q) == null) {
                apjiVar = apji.a;
            }
            o(apjiVar);
        }
        xir xirVar = this.an;
        if (xirVar != null) {
            xirVar.n("ol");
            xir xirVar2 = this.an;
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            String strZ = ahno.Z(((heh) this.H).b());
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.c |= 64;
            amiuVar.B = strZ;
            aihf aihfVarCreateBuilder2 = amjd.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amjd amjdVar = (amjd) aihfVarCreateBuilder2.instance;
            amjdVar.b |= 8;
            amjdVar.e = true;
            aihfVarCreateBuilder2.copyOnWrite();
            amjd amjdVar2 = (amjd) aihfVarCreateBuilder2.instance;
            amjdVar2.b |= 16;
            amjdVar2.f = iU;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
            amjd amjdVar3 = (amjd) aihfVarCreateBuilder2.build();
            amjdVar3.getClass();
            amiuVar2.Y = amjdVar3;
            amiuVar2.e |= SemanticState.Focused;
            xirVar2.h((amiu) aihfVarCreateBuilder.build());
        }
        Map map = hehVar.m;
        if (map == null || !map.containsKey("remove_previous_fragment_from_back_stack")) {
            return;
        }
        this.j.g((cc) hehVar.m.get("remove_previous_fragment_from_back_stack"));
    }

    @Override // defpackage.gms, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.an = this.ah.p(12);
        tbt tbtVar = this.d;
        if (tbtVar != null) {
            tbtVar.c(new haj());
        }
        xir xirVar = this.an;
        if (xirVar != null) {
            xirVar.f(tau.BROWSE_REQUEST_SENT);
        }
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
    }

    @Override // defpackage.gms, defpackage.cc
    public final void onDestroy() {
        mba mbaVar = this.am;
        if (mbaVar != null) {
            mbaVar.close();
        }
        super.onDestroy();
    }

    @Override // defpackage.gms, defpackage.cc
    public final void onDestroyView() {
        Toolbar toolbar;
        if (((vxz) this.ak.io()).l(62, 45829826L, false) && (toolbar = this.y) != null && toolbar.f() != null) {
            ((hkq) this.aj.io()).c(this.y.f());
        }
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        if ("FEoffline_nma_tracks".equals(((heh) this.H).b())) {
            this.al.c();
        }
    }
}
