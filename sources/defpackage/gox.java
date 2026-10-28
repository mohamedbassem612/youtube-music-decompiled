package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class gox extends gok {
    public static final /* synthetic */ int aq = 0;
    private static final Duration ar = Duration.ofSeconds(5);
    public Executor ae;
    public ScheduledExecutorService af;
    public jnj ag;
    public hpb ah;
    public hpy ai;
    public xeu aj;
    public aaou ak;
    public hkq al;
    public boolean am = false;
    public vxz an;
    public isi ao;
    public jnm ap;

    private final boolean K() {
        int iJ = J();
        if (iJ == 3 || iJ == 6 || iJ == 4 || iJ == 2 || iJ == 30) {
            return true;
        }
        if ((this.Q.m(257, 45823344L) || this.Q.l(SemanticState.Hidden, 45820150L, false)) && iJ == 25) {
            return true;
        }
        return this.Q.l(SemanticState.Hidden, 45820150L, false) && iJ == 15;
    }

    @Override // defpackage.gms
    protected final boolean C() {
        hej hejVar = this.H;
        return hejVar != null && TextUtils.equals("FEmusic_listening_review", ((heh) hejVar).b());
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, xir] */
    @Override // defpackage.gms
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void hF(heh hehVar) {
        gox goxVar;
        Optional optionalEmpty;
        heh hehVar2;
        ajwo ajwoVar;
        if (hehVar == null || !kro.ak(hehVar.f)) {
            return;
        }
        E();
        hei heiVar = hehVar.g;
        hei heiVar2 = hei.b;
        int i = 0;
        if (heiVar != heiVar2) {
            hehVar.k(heiVar2);
            k(hehVar);
            ListenableFuture listenableFutureH = this.h.h(this.ap.x(hehVar.f), MoreExecutors.directExecutor());
            hej hejVar = this.H;
            if (hejVar == null || (ajwoVar = ((heh) hejVar).f) == null) {
                optionalEmpty = Optional.empty();
            } else {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                ajmh ajmhVar = ajmfVar.g;
                if (ajmhVar == null) {
                    ajmhVar = ajmh.a;
                }
                if ((ajmhVar.b & 16) != 0) {
                    ajmh ajmhVar2 = ajmfVar.g;
                    if (ajmhVar2 == null) {
                        ajmhVar2 = ajmh.a;
                    }
                    ajmg ajmgVar = ajmhVar2.c;
                    if (ajmgVar == null) {
                        ajmgVar = ajmg.a;
                    }
                    String str = ajmgVar.e;
                    optionalEmpty = TextUtils.isEmpty(str) ? Optional.empty() : Optional.of(str);
                } else {
                    optionalEmpty = Optional.empty();
                }
            }
            if (optionalEmpty.isPresent()) {
                aaou aaouVar = this.ak;
                Object obj = optionalEmpty.get();
                boolean zL = this.an.l(50, 45783721L, false);
                hpb hpbVar = this.ah;
                ListenableFuture listenableFutureAr = zL ? ahno.ar(this.ai.a(kro.aq()), new hnd(obj, 4), hpbVar.d) : hpbVar.o(this.ai, (String) obj);
                goxVar = this;
                hehVar2 = hehVar;
                taf.i(aaouVar.b(listenableFutureH, ahno.ar(listenableFutureAr, new cbs(6), this.ae), ar.toMillis(), this.af, agkz.q(gow.class, tni.class)), this.ae, new gou(this, hehVar, i), new gsu(goxVar, optionalEmpty, hehVar2, 1, (byte[]) null), null);
            } else {
                goxVar = this;
                hehVar2 = hehVar;
                taf.i(listenableFutureH, goxVar.ae, new gou(goxVar, hehVar2, 2), new gov(goxVar, hehVar2, i), null);
            }
            if (goxVar.R.l(14, 45680269L, false)) {
                Optional optional = hehVar2.c.b;
                if (true == optional.isPresent()) {
                    optional.get().f(tau.BROWSE_REQUEST_SENT);
                }
            }
            goxVar.d.c(new hal());
        } else {
            goxVar = this;
        }
        goxVar.am = false;
    }

    public final int J() {
        ajwo ajwoVar;
        hej hejVar = this.H;
        ajmf ajmfVar = null;
        if (hejVar != null && (ajwoVar = ((heh) hejVar).f) != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        }
        if (ajmfVar != null) {
            ajmh ajmhVar = ajmfVar.g;
            if (ajmhVar == null) {
                ajmhVar = ajmh.a;
            }
            if ((ajmhVar.b & 16) != 0) {
                ajmh ajmhVar2 = ajmfVar.g;
                if (ajmhVar2 == null) {
                    ajmhVar2 = ajmh.a;
                }
                ajmg ajmgVar = ajmhVar2.c;
                if (ajmgVar == null) {
                    ajmgVar = ajmg.a;
                }
                int iJ = atqp.J(ajmgVar.c);
                if (iJ == 0) {
                    return 1;
                }
                return iJ;
            }
        }
        return 0;
    }

    @Override // defpackage.gms
    protected final int a() {
        int iJ = J();
        if (iJ == 0) {
            return 6827;
        }
        int i = iJ - 1;
        if (i == 1) {
            return 44098;
        }
        if (i == 2) {
            return 44099;
        }
        if (i == 3) {
            return 63349;
        }
        if (i == 5) {
            return 83113;
        }
        if (i == 25) {
            return 223033;
        }
        if (i == 27) {
            return 257268;
        }
        if (i == 29) {
            return 277848;
        }
        if (i == 22) {
            return 173689;
        }
        if (i == 23) {
            return 170215;
        }
        switch (i) {
            case 8:
                return 97346;
            case 9:
                return 118051;
            case 10:
                return 134104;
            case 11:
                return 134103;
            default:
                return 6827;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, xir] */
    @Override // defpackage.gms
    protected final Optional hE() {
        if (this.R.l(14, 45680269L, false)) {
            Optional optional = ((heh) this.H).c.b;
            if (true == optional.isPresent()) {
                optional.get().f(tau.BROWSE_RESPONSE_RECEIVED);
            }
        }
        return this.R.l(17, 45680971L, false) ? Optional.empty() : Optional.of(new ham());
    }

    @tcc
    public void handleNavigateBackAndHideEntryEvent(hcn hcnVar) {
        if (kro.M(this) || !TextUtils.equals(((heh) this.H).f(), hcnVar.a)) {
            return;
        }
        Map map = ((heh) this.H).m;
        if (map != null && map.containsKey("com.google.android.libraries.youtube.innertube.endpoint.tag")) {
            this.d.c(new vvt(((heh) this.H).m.get("com.google.android.libraries.youtube.innertube.endpoint.tag")));
        }
        View view = this.t;
        if (view != null) {
            tuk.i(view.findFocus());
        }
        this.j.g(this);
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, xir] */
    @Override // defpackage.gms
    protected final /* synthetic */ void l(hej hejVar) {
        apji apjiVar;
        heh hehVar = (heh) hejVar;
        Object obj = hehVar.h;
        if (obj == null || ((wfy) obj).f() == null || ((wfy) hehVar.h).f().isEmpty() || ((wfy) hehVar.h).f().get(0) == null) {
            ((heh) this.H).k(hei.d);
            String string = requireActivity().getResources().getString(R.string.entity_failed);
            heh hehVar2 = (heh) this.H;
            hehVar2.i = string;
            hehVar2.n = hehVar.n;
            isi isiVar = this.X;
            if (isiVar != null) {
                isiVar.n(hehVar2.f, hehVar2.n);
            }
        } else {
            h();
            this.g.d(new xgj(((wfy) hehVar.h).d()));
            n(((wfy) hehVar.h).f());
            allx allxVar = ((wfy) hehVar.h).a.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            p(yno.ev(allxVar));
            isi isiVar2 = this.X;
            if (isiVar2 != null) {
                isiVar2.m();
            }
            Optional optionalD = d();
            HashMap map = new HashMap();
            gfi gfiVar = new gfi(map, 13);
            if (true == optionalD.isPresent()) {
                gfiVar.a.put("sectionListController", (jav) optionalD.get());
            }
            this.k.d(((wfy) hehVar.h).a.m, map);
            this.k.d(((wfy) hehVar.h).a.n, map);
            this.ao.b(((wfy) hehVar.h).a);
            almd almdVar = ((wfy) hehVar.h).a;
            if ((almdVar.b & 1073741824) != 0) {
                apjiVar = almdVar.q;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
            } else {
                apjiVar = null;
            }
            o(apjiVar);
            almd almdVar2 = ((wfy) hehVar.h).a;
            if ((almdVar2.b & SemanticState.Hidden) != 0) {
                alma almaVar = almdVar2.h;
                if (almaVar == null) {
                    almaVar = alma.a;
                }
                if (almaVar.b == 96907215 && !this.ag.c()) {
                    this.ag.d(almaVar.b == 96907215 ? (amzh) almaVar.c : amzh.a);
                }
            }
            alop alopVar = ((wfy) hehVar.h).a.c;
            if (alopVar == null) {
                alopVar = alop.a;
            }
            aqcn aqcnVar = alopVar.i;
            if (aqcnVar == null) {
                aqcnVar = aqcn.a;
            }
            aiie aiieVar = aqcnVar.b;
            String tag = getTag();
            if (tag != null) {
                this.e.a.put(tag, new kyr(aiieVar, new glm(this, 4), (char[]) null));
            }
        }
        if (this.R.l(14, 45680269L, false)) {
            Optional optional = hehVar.c.b;
            if (true == optional.isPresent()) {
                optional.get().f(tau.BROWSE_PAGE_LOADED);
            }
        }
        if (this.R.l(17, 45680971L, false)) {
            this.p.kk(gnk.a);
        } else {
            this.a.postAtFrontOfQueue(new gnc(this, 10));
        }
    }

    @Override // defpackage.gms, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.d.f(this);
    }

    @Override // defpackage.gms, defpackage.cc
    public void onDestroy() {
        super.onDestroy();
        String tag = getTag();
        if (tag != null) {
            this.e.a.remove(tag);
        }
        this.d.l(this);
    }

    @Override // defpackage.gms, defpackage.cc
    public void onDestroyView() {
        Toolbar toolbar;
        if (!this.R.l(46, 45824499L, false) && (toolbar = this.y) != null && toolbar.f() != null) {
            this.al.c(this.y.f());
        }
        super.onDestroyView();
    }

    @Override // defpackage.gms, defpackage.cc
    public void onResume() {
        super.onResume();
        if (this.am) {
            hF((heh) this.H);
        }
    }

    @Override // defpackage.gms
    protected void q(Object obj, Map map) {
        almd almdVar;
        Toolbar toolbar;
        if (K()) {
            this.al.d((heh) this.H);
        }
        Object obj2 = ((heh) this.H).h;
        if (obj2 != null && (almdVar = ((wfy) obj2).a) != null && (almdVar.b & 2) != 0) {
            allx allxVar = almdVar.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            if (allxVar.b == 361650780 && K()) {
                Toolbar toolbar2 = this.y;
                if (toolbar2 != null) {
                    this.al.b(toolbar2.f());
                }
            } else if (allxVar.b == 173690432 && K() && (toolbar = this.y) != null) {
                this.al.b(toolbar.f());
            }
        }
        super.q(obj, map);
    }
}
