package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.watchpage.ui.PlayerBottomSheet;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class joc implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ joc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:229:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b9  */
    @Override // defpackage.avni
    public final void a(Object obj) {
        jod jodVar;
        PlayerBottomSheet playerBottomSheet;
        View view;
        int i = 8;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                alvt alvtVar = (alvt) obj;
                int i2 = alvtVar.c & 64;
                Object obj2 = this.a;
                if (i2 == 0) {
                    jodVar = (jod) obj2;
                    if (!jodVar.c) {
                        jodVar.b = null;
                        jodVar.a.kk(Optional.empty());
                        jodVar.b();
                    }
                } else {
                    apji apjiVar = alvtVar.F;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(anie.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        apji apjiVar2 = alvtVar.F;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anie.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        if ((((anid) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b & 1) != 0) {
                            apji apjiVar3 = alvtVar.F;
                            if (apjiVar3 == null) {
                                apjiVar3 = apji.a;
                            }
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anie.a);
                            apjiVar3.c(aihlVarCheckIsLite3);
                            Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite3.d);
                            Object objC = objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2);
                            jod jodVar2 = (jod) obj2;
                            jodVar2.b = (anid) objC;
                            if (!jodVar2.d) {
                                Optional optionalOf = Optional.of(jod.d(jodVar2.b));
                                awku awkuVar = jodVar2.a;
                                if (!optionalOf.equals(awkuVar.aD())) {
                                    awkuVar.kk(Optional.of(jod.d(jodVar2.b)));
                                    jodVar2.c();
                                }
                            }
                        } else {
                            jodVar = (jod) obj2;
                            if (!jodVar.c) {
                                jodVar.b = null;
                                jodVar.a.kk(Optional.empty());
                                jodVar.b();
                            }
                        }
                    } else {
                        jodVar = (jod) obj2;
                        if (!jodVar.c) {
                            jodVar.b = null;
                            jodVar.a.kk(Optional.empty());
                            jodVar.b();
                        }
                    }
                }
                ((jod) obj2).c = false;
                return;
            case 1:
                jny jnyVar = (jny) ((jnd) this.a).a;
                iwl iwlVar = jnyVar.k;
                jnyVar.e.kk(iwlVar);
                jnyVar.a(iwlVar);
                return;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                jod jodVar3 = (jod) this.a;
                jodVar3.d = zBooleanValue;
                if (zBooleanValue) {
                    jodVar3.a.kk(Optional.empty());
                    jodVar3.b();
                    return;
                }
                anid anidVar = jodVar3.b;
                if (anidVar != null) {
                    jodVar3.a.kk(Optional.of(jod.d(anidVar)));
                    jodVar3.c();
                    return;
                }
                return;
            case 3:
                jol jolVar = (jol) this.a;
                idd iddVar = (idd) obj;
                if (jolVar.J.l(69, 45728267L, false) || !iddVar.g()) {
                    return;
                }
                jon jonVar = jolVar.p;
                adly adlyVar = new adly();
                Optional optionalF = iddVar.f();
                icj icjVar = jolVar.t;
                jonVar.b(adlyVar, optionalF, icjVar.h(), icjVar.n(), icjVar.v);
                return;
            case 4:
                ((jol) this.a).h((hww) obj);
                return;
            case 5:
                ((jol) this.a).k();
                return;
            case 6:
                jol jolVar2 = (jol) this.a;
                jolVar2.A = false;
                if (((aaxk) obj).a) {
                    return;
                }
                jolVar2.o = -1;
                return;
            case 7:
                int iOrdinal = ((idf) obj).a.ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 1) {
                    ((jol) obj3).A = true;
                    return;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        ((jol) obj3).A = false;
                        return;
                    }
                    return;
                } else {
                    jol jolVar3 = (jol) obj3;
                    if (jolVar3.A) {
                        jolVar3.F.postDelayed(new ixe(obj3, 11), 20L);
                        return;
                    }
                    return;
                }
            case 8:
                switch (((hww) obj).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                        return;
                    case 3:
                    case 4:
                    case 9:
                        ((jon) this.a).o.a();
                        return;
                    default:
                        throw new RuntimeException(null, null);
                }
            case 9:
                iwl iwlVar2 = (iwl) obj;
                if (iwlVar2 != null) {
                    ((joz) this.a).w(iwlVar2, 450L);
                    return;
                }
                return;
            case 10:
                ((joz) this.a).x.e();
                return;
            case 11:
                idd iddVar2 = (idd) obj;
                iddVar2.g();
                iddVar2.e();
                joz jozVar = (joz) this.a;
                if (((hfn) jozVar.M.io()).x() == hww.a) {
                    jozVar.p.N();
                }
                boolean z2 = iddVar2.g() || (iddVar2.e() && ((abvn) jozVar.e.io()).o().U());
                if (jozVar.aw.l(134, 45849000L, false) && !((axfd) jozVar.f.io()).ah().isPresent()) {
                    z = false;
                }
                if (!z2 || !z) {
                    jozVar.s();
                    return;
                }
                tqj tqjVar = (tqj) jozVar.ad.io();
                int i3 = tqr.a;
                if (tqjVar.k(1073830358)) {
                    jozVar.r(null);
                }
                jozVar.q();
                return;
            case 12:
                Optional optional = (Optional) obj;
                joz jozVar2 = (joz) this.a;
                if (jozVar2.au.equals(optional)) {
                    return;
                }
                jozVar2.au = optional;
                jozVar2.r(null);
                return;
            case 13:
                ((vor) ((joz) this.a).X.io()).A();
                return;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                joz jozVar3 = (joz) this.a;
                vxz vxzVar = jozVar3.aw;
                if (vxzVar.l(90, 45756531L, false)) {
                    WatchWhileLayout watchWhileLayout = jozVar3.p;
                    if (watchWhileLayout.bx != zBooleanValue2) {
                        watchWhileLayout.bx = zBooleanValue2;
                        watchWhileLayout.G();
                    }
                }
                if (!vxzVar.l(97, 45764568L, false)) {
                    ImageView imageView = jozVar3.w;
                    if (zBooleanValue2) {
                        imageView.setAlpha(jozVar3.Q);
                        imageView.setEnabled(false);
                    } else {
                        imageView.setAlpha(1.0f);
                        imageView.setEnabled(true);
                    }
                }
                jozVar3.r(null);
                return;
            case 15:
                hww hwwVar = (hww) obj;
                joz jozVar4 = (joz) this.a;
                jozVar4.w(jozVar4.ap, 0L);
                jozVar4.n(hwwVar);
                jozVar4.o(hwwVar);
                aunn aunnVar = jozVar4.X;
                if (((vor) aunnVar.io()).I() && ((vor) aunnVar.io()).i != null && (((vor) aunnVar.io()).i.getParent() instanceof View)) {
                    ((View) ((vor) aunnVar.io()).i.getParent()).setVisibility(true != hwwVar.b(hww.b, hww.h) ? 0 : 8);
                }
                ImageView imageView2 = jozVar4.C;
                if (jozVar4.D && hwwVar.d()) {
                    i = 0;
                }
                imageView2.setVisibility(i);
                if (jozVar4.aw.l(118, 45823962L, false)) {
                    if (!hwwVar.b(hww.b, hww.i, hww.l)) {
                        jozVar4.A.setBackground(null);
                        return;
                    }
                    GradientDrawable gradientDrawable = jozVar4.aj;
                    View view2 = jozVar4.A;
                    if (gradientDrawable.equals(view2.getBackground())) {
                        return;
                    }
                    view2.setBackground(gradientDrawable);
                    return;
                }
                return;
            case 16:
                WatchWhileLayout watchWhileLayout2 = ((joz) this.a).p;
                watchWhileLayout2.bD = (ibh) obj;
                watchWhileLayout2.G();
                return;
            case 17:
                int i4 = ((aazn) obj).a;
                Object obj4 = this.a;
                if (i4 == 2) {
                    ((joz) obj4).ar = new abgi(abgh.b, false);
                } else if (i4 == 3 || i4 == 4) {
                    ((joz) obj4).ar = new abgi(abgh.c, false);
                } else if (i4 == 7) {
                    ((joz) obj4).ar = new abgi(abgh.f, false);
                } else if (i4 == 8) {
                    ((joz) obj4).ar = new abgi(abgh.d, false);
                }
                joz jozVar5 = (joz) obj4;
                if (jozVar5.ar.a == abgh.d) {
                    jozVar5.v.setVisibility(4);
                    return;
                } else {
                    jozVar5.v.setVisibility(0);
                    jozVar5.j.a(jozVar5.ar);
                    return;
                }
            case 18:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                WatchWhileLayout watchWhileLayout3 = (WatchWhileLayout) this.a;
                watchWhileLayout3.bI = iIntValue;
                float fP = watchWhileLayout3.p(num.intValue(), watchWhileLayout3.X() ? ((vor) watchWhileLayout3.l.io()).d.c.b() : ((vor) watchWhileLayout3.l.io()).d.c.a());
                if (watchWhileLayout3.ai()) {
                    if (watchWhileLayout3.aa() && (view = watchWhileLayout3.aH) != null) {
                        view.setVisibility(8);
                    }
                    if (watchWhileLayout3.bU.l(132, 45845054L, false) && watchWhileLayout3.ak() && (playerBottomSheet = watchWhileLayout3.ae) != null) {
                        playerBottomSheet.e(Math.max(0.0f, 1.0f - fP));
                        return;
                    }
                    return;
                }
                if (!watchWhileLayout3.bU.l(105, 45795183L, false) || watchWhileLayout3.bE.e()) {
                    if (watchWhileLayout3.ag() && watchWhileLayout3.bU.l(105, 45795183L, false)) {
                        float fQ = watchWhileLayout3.q();
                        if (fP >= fQ) {
                            watchWhileLayout3.by = null;
                        } else {
                            fP = fQ;
                        }
                    }
                    if (fP == 0.0f && !watchWhileLayout3.ag() && watchWhileLayout3.bE.a()) {
                        watchWhileLayout3.I(hww.c, 0.0f);
                        return;
                    }
                    if (fP == 1.0f) {
                        watchWhileLayout3.O(hww.f);
                        return;
                    }
                    if (watchWhileLayout3.X() && fP == watchWhileLayout3.q()) {
                        watchWhileLayout3.I(hww.g, fP);
                        return;
                    } else {
                        if (fP <= 0.0f || fP >= 1.0f || watchWhileLayout3.bE == hww.b) {
                            return;
                        }
                        watchWhileLayout3.I(hww.k, fP);
                        return;
                    }
                }
                return;
            case 19:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                jqo jqoVar = (jqo) this.a;
                jqoVar.u = zBooleanValue3;
                jqoVar.a();
                return;
            default:
                jqo jqoVar2 = (jqo) this.a;
                jqoVar2.v = (aboe) obj;
                jqoVar2.a();
                return;
        }
    }
}
