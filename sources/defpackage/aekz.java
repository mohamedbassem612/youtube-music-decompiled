package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekz implements acwn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/share/controller/UnifiedSharePanelController");
    private final admh A;
    private final admh B;
    private final admo C;
    private final admo D;
    private final SharedPreferences E;
    private boolean F;
    private final ci G;
    public final ajwo b;
    public final ttm c;
    public final ExecutorService d;
    public final tbt e;
    public final ajdl f;
    public final Context g;
    public final aeky h;
    public final List i;
    public final tmo j;
    public final aekq k;
    public Future l;
    public boolean m;
    public alhq n;
    public View o;
    public boolean p;
    public final abfv q;
    public final aend r;
    public final aepb s;
    private final Executor t;
    private final ahex u;
    private final xgn v;
    private final adhv w;
    private final vxe x;
    private final aduv y;
    private final aekh z;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    public aekz(ajwo ajwoVar, aend aendVar, xgn xgnVar, ttm ttmVar, ExecutorService executorService, tbt tbtVar, adhv adhvVar, ajdl ajdlVar, Context context, vxe vxeVar, aduv aduvVar, aeky aekyVar, aekh aekhVar, aepb aepbVar, tmo tmoVar, abfv abfvVar, aekq aekqVar, SharedPreferences sharedPreferences, ahek ahekVar, ci ciVar, int i, int i2, Executor executor, ahex ahexVar) {
        ajwoVar.getClass();
        this.b = ajwoVar;
        executor.getClass();
        this.t = executor;
        this.u = ahexVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apte.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aendVar.getClass();
        this.r = aendVar;
        xgnVar.getClass();
        this.v = xgnVar;
        ttmVar.getClass();
        this.c = ttmVar;
        executorService.getClass();
        this.d = executorService;
        tbtVar.getClass();
        this.e = tbtVar;
        adhvVar.getClass();
        this.w = adhvVar;
        ajdlVar.getClass();
        this.f = ajdlVar;
        context.getClass();
        this.g = context;
        vxeVar.getClass();
        this.x = vxeVar;
        aduvVar.getClass();
        this.y = aduvVar;
        this.h = aekyVar;
        this.z = aekhVar;
        aepbVar.getClass();
        this.s = aepbVar;
        tmoVar.getClass();
        this.j = tmoVar;
        ciVar.getClass();
        this.G = ciVar;
        this.i = new ArrayList();
        adlg adlgVar = new adlg();
        this.A = adlgVar;
        this.C = ahekVar.d(adlgVar);
        adlg adlgVar2 = new adlg();
        this.B = adlgVar2;
        admo admoVarD = ahekVar.d(adlgVar2);
        this.D = admoVarD;
        admoVarD.jR(new adli(i, i2));
        abfvVar.getClass();
        this.q = abfvVar;
        aekqVar.getClass();
        this.k = aekqVar;
        sharedPreferences.getClass();
        this.E = sharedPreferences;
        taq.d();
        aepbVar.a.clear();
        Iterator it = aepbVar.c.iterator();
        while (it.hasNext()) {
            ((aemq) it.next()).kc(aepbVar);
        }
    }

    @Override // defpackage.acwn
    public final void a() {
        ((aemn) this.h).dismiss();
    }

    public final List b() {
        try {
            return (List) this.l.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            zvp.b(zvn.a, zvm.p, "Error retrieving share-capable activities.", e);
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/share/controller/UnifiedSharePanelController", "getShareCapableActivities", (char) 534, "UnifiedSharePanelController.java")).t("Error retrieving share-capable activities.");
            return new ArrayList();
        }
    }

    public final void c() {
        alhq alhqVar;
        View view;
        if (!this.p || (alhqVar = this.n) == null || (view = this.o) == null) {
            return;
        }
        aekh aekhVar = this.z;
        aepb aepbVar = this.s;
        aemn aemnVar = (aemn) aekhVar;
        if (aemnVar.l != null) {
            ((aekn) aemnVar.z.io()).b(alhqVar, view, aepbVar, aemnVar.m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, java.util.List] */
    public final void d(wpd wpdVar) {
        adlq adlqVar;
        Object obj;
        adly adlyVar;
        aeks aekvVar;
        ajnf ajnfVar;
        aihh aihhVar;
        ajnf ajnfVar2;
        if (this.m) {
            return;
        }
        if (wpdVar.c == null) {
            almt almtVar = wpdVar.a;
            akfl akflVar = almtVar.d;
            if (akflVar == null) {
                akflVar = akfl.a;
            }
            if ((akflVar.b & 1) != 0) {
                akfl akflVar2 = almtVar.d;
                if (akflVar2 == null) {
                    akflVar2 = akfl.a;
                }
                aqsu aqsuVar = akflVar2.c;
                if (aqsuVar == null) {
                    aqsuVar = aqsu.a;
                }
                wpdVar.c = new zdj(aqsuVar);
            }
        }
        zdj zdjVar = wpdVar.c;
        if (zdjVar == null) {
            if (wpdVar.b == null) {
                almt almtVar2 = wpdVar.a;
                if ((almtVar2.b & 4) != 0) {
                    ajwo ajwoVar = almtVar2.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    wpdVar.b = ajwoVar;
                }
            }
            ajwo ajwoVar2 = wpdVar.b;
            if (ajwoVar2 != null) {
                this.x.c(ajwoVar2, agkj.j("com.google.android.libraries.youtube.logging.interaction_logger", this.v));
            } else {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/share/controller/UnifiedSharePanelController", "setSharePanel", 459, "UnifiedSharePanelController.java")).t("Unified share panel not returned.");
                this.c.c(R.string.common_error_generic);
            }
            ((aemn) this.h).dismiss();
            return;
        }
        zdjVar.b();
        aqsu aqsuVar2 = (aqsu) zdjVar.a;
        aqse aqseVar = aqsuVar2.e;
        if (aqseVar == null) {
            aqseVar = aqse.a;
        }
        this.F = aqseVar.b == 133836655;
        xgn xgnVar = this.v;
        adly adlyVar2 = null;
        xgnVar.b(xhb.a(21760), this.b, null);
        xgnVar.d(new xgj(wpdVar.a()));
        wpdVar.a();
        xgnVar.w(new xgj(wpdVar.a()), null);
        aqsj aqsjVarA = zdjVar.a();
        if (aqsjVarA != null) {
            aekr aekrVar = new aekr(aqsjVarA, this.g, this.x);
            this.i.add(aekrVar);
            aekrVar.c(this.A);
            this.C.D(aekrVar.a, null);
        }
        adlq adlqVar2 = new adlq(false);
        if (zdjVar.b == null) {
            zdjVar.b = new ArrayList();
            aqsm aqsmVar = aqsuVar2.h;
            if (aqsmVar == null) {
                aqsmVar = aqsm.a;
            }
            if ((aqsmVar.b & 1) != 0) {
                ?? r2 = zdjVar.b;
                aqsm aqsmVar2 = aqsuVar2.h;
                if (aqsmVar2 == null) {
                    aqsmVar2 = aqsm.a;
                }
                aqsl aqslVar = aqsmVar2.c;
                if (aqslVar == null) {
                    aqslVar = aqsl.a;
                }
                r2.add(aqslVar);
            }
            for (aqsn aqsnVar : aqsuVar2.d) {
                int i = aqsnVar.b;
                if ((i & 2) != 0) {
                    ?? r12 = zdjVar.b;
                    aqsa aqsaVar = aqsnVar.c;
                    if (aqsaVar == null) {
                        aqsaVar = aqsa.a;
                    }
                    zdjVar.b();
                    r12.add(new yno(aqsaVar));
                } else if ((i & 4) != 0) {
                    ?? r13 = zdjVar.b;
                    aqsf aqsfVar = aqsnVar.d;
                    if (aqsfVar == null) {
                        aqsfVar = aqsf.a;
                    }
                    r13.add(aqsfVar);
                } else if ((i & 16) != 0) {
                    ?? r14 = zdjVar.b;
                    aqst aqstVar = aqsnVar.e;
                    if (aqstVar == null) {
                        aqstVar = aqst.a;
                    }
                    r14.add(aqstVar);
                } else if ((i & SemanticState.Focused) != 0) {
                    ?? r15 = zdjVar.b;
                    aqrw aqrwVar = aqsnVar.g;
                    if (aqrwVar == null) {
                        aqrwVar = aqrw.a;
                    }
                    r15.add(aqrwVar);
                } else if ((i & 32) != 0) {
                    ?? r16 = zdjVar.b;
                    aqss aqssVar = aqsnVar.f;
                    if (aqssVar == null) {
                        aqssVar = aqss.a;
                    }
                    r16.add(aqssVar);
                }
            }
            aqse aqseVar2 = aqsuVar2.e;
            if ((aqseVar2 == null ? aqse.a : aqseVar2).b == 133836655) {
                ?? r4 = zdjVar.b;
                if (aqseVar2 == null) {
                    aqseVar2 = aqse.a;
                }
                r4.add(aqseVar2.b == 133836655 ? (aqsd) aqseVar2.c : aqsd.a);
            }
        }
        ?? r3 = zdjVar.b;
        aqsj aqsjVarA2 = zdjVar.a();
        if (aqsjVarA2 != null) {
            aqsp aqspVar = aqsjVarA2.c;
            if (aqspVar == null) {
                aqspVar = aqsp.a;
            }
            if (aqspVar.b == 133737618) {
                aqsp aqspVar2 = aqsjVarA2.c;
                if (aqspVar2 == null) {
                    aqspVar2 = aqsp.a;
                }
                r3.add(0, aqspVar2.b == 133737618 ? (aqsq) aqspVar2.c : aqsq.a);
            }
            aqsi aqsiVar = aqsjVarA2.b;
            if (aqsiVar == null) {
                aqsiVar = aqsi.a;
            }
            if ((aqsiVar.b & 1) != 0) {
                aqsi aqsiVar2 = aqsjVarA2.b;
                if (aqsiVar2 == null) {
                    aqsiVar2 = aqsi.a;
                }
                aqry aqryVar = aqsiVar2.c;
                if (aqryVar == null) {
                    aqryVar = aqry.a;
                }
                r3.add(0, aqryVar);
            }
        }
        for (Object obj2 : r3) {
            if (obj2 instanceof aqst) {
                adlqVar = adlqVar2;
                aekvVar = new aekx((aqst) obj2, this.g, this.x, this.f, b(), this.h, this.e, this.w, this.s, xgnVar, this.F, this.t, this.u);
                adlyVar = null;
                obj = obj2;
            } else {
                adlq adlqVar3 = adlqVar2;
                if (obj2 instanceof aqsq) {
                    adlqVar = adlqVar3;
                    aekvVar = new aeku((aqsq) obj2, this.g, this.x);
                    obj = obj2;
                    adlyVar = null;
                } else if (obj2 instanceof aqsl) {
                    obj = obj2;
                    aekvVar = new aeko((aqsl) obj2, this.g, this.w, this.x, this.y, this.E);
                    adlyVar = null;
                    adlqVar = adlqVar3;
                } else if (obj2 instanceof aqry) {
                    adlqVar = adlqVar3;
                    obj = obj2;
                    adlyVar = null;
                    aekvVar = new aeki((aqry) obj2, this.g, this.x, this.G, xgnVar, this.h, this);
                } else {
                    adlqVar = adlqVar3;
                    obj = obj2;
                    adlyVar = null;
                    aekvVar = obj instanceof aqss ? new aekv((aqss) obj, this.g, this.h, this.y, this.x) : null;
                }
            }
            if (aekvVar != null) {
                this.i.add(aekvVar);
                aekvVar.c(this.B);
                adlqVar.m(-1, aekvVar.a(), true);
            } else if (obj instanceof aqsd) {
                aqsd aqsdVar = (aqsd) obj;
                aepb aepbVar = this.s;
                ajng ajngVar = aqsdVar.b;
                if (ajngVar == null) {
                    ajngVar = ajng.a;
                }
                if ((ajngVar.b & 1) != 0) {
                    ajng ajngVar2 = aqsdVar.b;
                    if (ajngVar2 == null) {
                        ajngVar2 = ajng.a;
                    }
                    ajnf ajnfVar3 = ajngVar2.c;
                    ajnfVar = ajnfVar3;
                    if (ajnfVar3 == null) {
                        ajnfVar2 = ajnf.a;
                    }
                } else {
                    ajnfVar = adlyVar;
                }
                if (ajnfVar == 0 || (ajnfVar.b & SemanticState.Modal) == 0) {
                    ajnfVar = ajnfVar2;
                    ajnfVar = ajnfVar2;
                    if (aepbVar.d == null) {
                        aihhVar = (aihh) ajwo.a.createBuilder();
                        aihhVar.e(appp.b, appp.a);
                    }
                } else {
                    ajwo ajwoVar3 = ajnfVar.q;
                    if (ajwoVar3 == null) {
                        ajnfVar = ajnfVar2;
                        ajwoVar3 = ajwo.a;
                    }
                    ajnfVar = ajnfVar2;
                    aihhVar = (aihh) ajwoVar3.toBuilder();
                }
                aihf builder = ((appp) aihhVar.b(appp.b)).toBuilder();
                if ((((appp) builder.instance).c & 1) == 0) {
                    almy almyVar = almy.a;
                    builder.copyOnWrite();
                    appp apppVar = (appp) builder.instance;
                    almyVar.getClass();
                    apppVar.d = almyVar;
                    apppVar.c |= 1;
                }
                if ((((appp) builder.instance).c & 2) == 0) {
                    almx almxVar = almx.a;
                    builder.copyOnWrite();
                    appp apppVar2 = (appp) builder.instance;
                    almxVar.getClass();
                    apppVar2.e = almxVar;
                    apppVar2.c |= 2;
                }
                aihhVar.e(appp.b, (appp) builder.build());
                aepbVar.d = (ajwo) aihhVar.build();
            }
            adlyVar2 = adlyVar;
            adlqVar2 = adlqVar;
        }
        admo admoVar = this.D;
        admoVar.D(adlqVar2, adlyVar2);
        tbt tbtVar = this.e;
        admoVar.a();
        tbtVar.c(new aelc());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        List list = this.i;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((aeks) it.next()).b(arrayList);
        }
        aekq aekqVar = this.k;
        for (Object obj3 : arrayList) {
            if (obj3 instanceof aekx) {
                aekqVar.a.add((aekx) obj3);
            }
        }
        agkj agkjVarK = agkj.k("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar, "com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        Iterator it2 = aqsuVar2.g.iterator();
        while (it2.hasNext()) {
            this.x.c((ajwo) it2.next(), agkjVarK);
        }
        aeky aekyVar = this.h;
        admo admoVar2 = this.C;
        aemn aemnVar = (aemn) aekyVar;
        aemnVar.q.setAlpha(0.0f);
        aemnVar.q.setVisibility(0);
        aemnVar.q.setTranslationY(100.0f);
        aemnVar.q.animate().setListener(new aemh(aemnVar)).alpha(1.0f).translationY(0.0f).start();
        aemnVar.r.ad(admoVar2);
        aemnVar.s.ad(admoVar);
        aemnVar.q.getViewTreeObserver().addOnGlobalLayoutListener(new aemi(aemnVar, String.valueOf(aekyVar.getClass().getSimpleName()).concat("-Content")));
    }

    @tcc
    void handleAddToToastEvent(vvr vvrVar) {
        ajnf ajnfVar;
        String string;
        alay alayVar;
        aemn aemnVar = (aemn) this.h;
        mbc mbcVar = aemnVar.K;
        Snackbar snackbar = aemnVar.t;
        long j = aemn.k;
        aeni aeniVar = new aeni(0);
        agev agevVar = vvrVar.a;
        int i = 2;
        Spanned spanned = (Spanned) agevVar.a(aeniVar).a(new aeni(i)).f();
        int i2 = 3;
        byte[] bArr = null;
        if (TextUtils.isEmpty(spanned) || !agevVar.g()) {
            agev agevVar2 = vvrVar.b;
            if (!agevVar2.g()) {
                return;
            }
            aocd aocdVar = (aocd) agevVar2.c();
            alay alayVar2 = aocdVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar2, null, false);
            if (TextUtils.isEmpty(spannedK)) {
                return;
            }
            ajng ajngVar = aocdVar.d;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            if ((ajngVar.b & 1) != 0) {
                ajng ajngVar2 = aocdVar.d;
                if (ajngVar2 == null) {
                    ajngVar2 = ajng.a;
                }
                ajnfVar = ajngVar2.c;
                if (ajnfVar == null) {
                    ajnfVar = ajnf.a;
                }
            } else {
                ajnfVar = null;
            }
            if (ajnfVar != null) {
                if ((ajnfVar.b & 64) != 0) {
                    alay alayVar3 = ajnfVar.m;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    string = ackj.k(null, alayVar3, null, false).toString();
                } else {
                    string = null;
                }
                if (ajnfVar.s == null) {
                    ajwo ajwoVar = ajwo.a;
                }
                snackbar.b(spannedK, string, new aems(vvrVar, snackbar, i2));
            } else {
                snackbar.b(spannedK, null, null);
            }
        } else {
            aoda aodaVar = (aoda) agevVar.c();
            int i3 = aodaVar.b;
            if ((i3 & 4) != 0) {
                if ((i3 & 2) != 0) {
                    alayVar = aodaVar.d;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                String string2 = ackj.k(null, alayVar, null, false).toString();
                if (aodaVar.e == null) {
                    ajwo ajwoVar2 = ajwo.a;
                }
                snackbar.b(spanned, string2, new aems(vvrVar, snackbar, i2));
            } else {
                snackbar.b(spanned, null, null);
            }
        }
        Handler handler = snackbar.getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(snackbar);
            rbm rbmVar = snackbar.a;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(snackbar, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", snackbar.getHeight(), 0.0f));
            objectAnimatorOfPropertyValuesHolder.addListener(new qoc(snackbar));
            rbmVar.d();
            if (((Snackbar) rbmVar.a).c()) {
                rbmVar.b = objectAnimatorOfPropertyValuesHolder;
                ((Animator) rbmVar.b).start();
            }
            snackbar.getClass();
            handler.postAtTime(new aemk(snackbar, i, bArr), snackbar, mbcVar.e().toMillis() + j);
        }
    }

    @tcc
    public void handleShareCompletedEvent(aelb aelbVar) {
        ((aemn) this.h).dismiss();
    }
}
