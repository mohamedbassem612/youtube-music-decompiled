package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import j$.util.Optional;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adgy implements adhe {
    public final acxt a;
    public final adhg b;
    public final LinearLayout c;
    public boolean d;
    public final vxz e;
    private final aunn f;
    private final Optional g;
    private final xgn h;
    private final Optional i;
    private final Context j;
    private LinearProgressIndicator k;
    private Optional l;
    private Optional m;
    private Optional n;
    private final Optional o;
    private boolean p;
    private final vry q;
    private final vry r;
    private final adif s;

    public adgy(Context context, aunn aunnVar, acxt acxtVar, adhg adhgVar, vxz vxzVar, adif adifVar, akzv akzvVar, vry vryVar, vry vryVar2, Optional optional, xgn xgnVar) {
        apji apjiVar;
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = false;
        this.j = context;
        this.f = aunnVar;
        this.a = acxtVar;
        this.q = vryVar;
        this.r = vryVar2;
        this.g = optional;
        this.h = xgnVar;
        this.b = adhgVar;
        this.e = vxzVar;
        akzu akzuVar = null;
        if ((akzvVar.b & 2) != 0) {
            apjiVar = akzvVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
        } else {
            apjiVar = null;
        }
        this.i = Optional.ofNullable(apjiVar);
        if ((akzvVar.b & SemanticState.LiveRegion) != 0 && (akzuVar = akzvVar.i) == null) {
            akzuVar = akzu.a;
        }
        this.l = Optional.ofNullable(akzuVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        this.d = false;
        this.s = adifVar;
        if ((akzvVar.b & SemanticState.Modal) != 0) {
            this.p = akzvVar.j;
        }
        this.n = optionalEmpty;
        optionalEmpty2.isPresent();
    }

    private final boolean f() {
        return !this.p;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x035b  */
    /* JADX WARN: Type inference failed for: r1v55, types: [awmd, java.lang.Object] */
    @Override // defpackage.adhe
    public final void a(alae alaeVar) {
        ajwo ajwoVar;
        adgz adgzVar;
        xhc xhcVarA;
        apji apjiVar = alaeVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optional = this.o;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            if (f()) {
                optional.isPresent();
                return;
            }
            return;
        }
        Optional optional2 = this.g;
        optional2.isPresent();
        ((vry) optional2.get()).p();
        if (f()) {
            ajwo ajwoVar2 = ajwo.a;
            if (this.m.isPresent()) {
                xgt xgtVarA = ((adgz) this.m.get()).a.a();
                aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                if (xgtVarA != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                    aoarVar.b |= 2;
                    aoarVar.d = xgtVarA.f;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                    String str = xgtVarA.a;
                    str.getClass();
                    aoarVar2.b |= 1;
                    aoarVar2.c = str;
                }
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
                ajwoVar = (ajwo) aihhVar.build();
                ((adgz) this.m.get()).a.t();
            } else {
                this.n.isPresent();
                aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
                aihhVar2.e(aoaq.b, aoar.a);
                ajwoVar = (ajwo) aihhVar2.build();
            }
            e();
            apji apjiVar2 = alaeVar.d;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            if (apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
                adif adifVar = this.s;
                acyx acyxVar = (acyx) this.f.io();
                acxt acxtVar = this.a;
                xgn xgnVar = (xgn) adifVar.a.io();
                xgnVar.getClass();
                acyxVar.getClass();
                adgzVar = new adgz(xgnVar, acyxVar, acxtVar);
            } else {
                adgzVar = (adgz) optional.get();
            }
            apji apjiVar3 = alaeVar.d;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
            apjiVar3.c(aihlVarCheckIsLite3);
            Object objK = apjiVar3.j.k(aihlVarCheckIsLite3.d);
            akrn akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
            apmn apmnVar = alaeVar.k;
            if (apmnVar == null) {
                apmnVar = apmn.a;
            }
            if ((apmnVar.b & 1) != 0) {
                apmn apmnVar2 = alaeVar.k;
                if (apmnVar2 == null) {
                    apmnVar2 = apmn.a;
                }
                xhcVarA = xhb.a(apmnVar2.c);
            } else {
                xhcVarA = xhb.a(232113);
            }
            xgn xgnVar2 = adgzVar.a;
            xgnVar2.b(xhcVarA, ajwoVar, null);
            apji apjiVar4 = alaeVar.d;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
            apjiVar4.c(aihlVarCheckIsLite4);
            Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
            xgnVar2.d(new xgj(((akrn) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).d, (amud) null));
            adly adlyVar = new adly();
            adlyVar.a(xgnVar2);
            adgzVar.d = adgzVar.b.c(akrnVar);
            adgzVar.c.h(adlyVar, adgzVar.d, false, false);
            this.m = Optional.of(adgzVar);
        } else {
            xgn xgnVar3 = this.h;
            apji apjiVar5 = alaeVar.d;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
            apjiVar5.c(aihlVarCheckIsLite5);
            Object objK3 = apjiVar5.j.k(aihlVarCheckIsLite5.d);
            xgnVar3.d(new xgj(((akrn) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).d, (amud) null));
            adly adlyVar2 = new adly();
            adlyVar2.a(xgnVar3);
            acxt acxtVar2 = this.a;
            acyx acyxVar2 = (acyx) this.f.io();
            apji apjiVar6 = alaeVar.d;
            if (apjiVar6 == null) {
                apjiVar6 = apji.a;
            }
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akrs.a);
            apjiVar6.c(aihlVarCheckIsLite6);
            Object objK4 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
            acxtVar2.h(adlyVar2, acyxVar2.c((akrn) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4))), false, false);
        }
        if ((alaeVar.b & 4) != 0) {
            apji apjiVar7 = alaeVar.e;
            if (apjiVar7 == null) {
                apjiVar7 = apji.a;
            }
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(alah.a);
            apjiVar7.c(aihlVarCheckIsLite7);
            if (apjiVar7.j.n(aihlVarCheckIsLite7.d)) {
                vry vryVar = this.q;
                apji apjiVar8 = alaeVar.e;
                if (apjiVar8 == null) {
                    apjiVar8 = apji.a;
                }
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(alah.a);
                apjiVar8.c(aihlVarCheckIsLite8);
                Object objK5 = apjiVar8.j.k(aihlVarCheckIsLite8.d);
                vryVar.x((alag) (objK5 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK5)));
            } else {
                apji apjiVar9 = alaeVar.e;
                if (apjiVar9 == null) {
                    apjiVar9 = apji.a;
                }
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(akrs.a);
                apjiVar9.c(aihlVarCheckIsLite9);
                if (apjiVar9.j.n(aihlVarCheckIsLite9.d)) {
                    vry vryVar2 = this.q;
                    apji apjiVar10 = alaeVar.e;
                    if (apjiVar10 == null) {
                        apjiVar10 = apji.a;
                    }
                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(akrs.a);
                    apjiVar10.c(aihlVarCheckIsLite10);
                    Object objK6 = apjiVar10.j.k(aihlVarCheckIsLite10.d);
                    vryVar2.w((akrn) (objK6 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK6)));
                }
            }
        } else {
            Optional optional3 = this.i;
            if (optional3.isPresent()) {
                apji apjiVar11 = (apji) optional3.get();
                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(alah.a);
                apjiVar11.c(aihlVarCheckIsLite11);
                if (apjiVar11.j.n(aihlVarCheckIsLite11.d)) {
                    vry vryVar3 = this.q;
                    apji apjiVar12 = (apji) optional3.get();
                    aihl aihlVarCheckIsLite12 = aihn.checkIsLite(alah.a);
                    apjiVar12.c(aihlVarCheckIsLite12);
                    Object objK7 = apjiVar12.j.k(aihlVarCheckIsLite12.d);
                    vryVar3.x((alag) (objK7 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK7)));
                } else {
                    apji apjiVar13 = (apji) optional3.get();
                    aihl aihlVarCheckIsLite13 = aihn.checkIsLite(akrs.a);
                    apjiVar13.c(aihlVarCheckIsLite13);
                    if (apjiVar13.j.n(aihlVarCheckIsLite13.d)) {
                        vry vryVar4 = this.q;
                        apji apjiVar14 = (apji) optional3.get();
                        aihl aihlVarCheckIsLite14 = aihn.checkIsLite(akrs.a);
                        apjiVar14.c(aihlVarCheckIsLite14);
                        Object objK8 = apjiVar14.j.k(aihlVarCheckIsLite14.d);
                        vryVar4.w((akrn) (objK8 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK8)));
                    }
                }
            }
        }
        if ((alaeVar.b & 8) == 0) {
            this.r.u(null);
        } else {
            apji apjiVar15 = alaeVar.f;
            if (apjiVar15 == null) {
                apjiVar15 = apji.a;
            }
            aihl aihlVarCheckIsLite15 = aihn.checkIsLite(akrs.a);
            apjiVar15.c(aihlVarCheckIsLite15);
            if (apjiVar15.j.n(aihlVarCheckIsLite15.d)) {
                vry vryVar5 = this.r;
                vryVar5.u(null);
                apji apjiVar16 = alaeVar.f;
                if (apjiVar16 == null) {
                    apjiVar16 = apji.a;
                }
                aihl aihlVarCheckIsLite16 = aihn.checkIsLite(akrs.a);
                apjiVar16.c(aihlVarCheckIsLite16);
                Object objK9 = apjiVar16.j.k(aihlVarCheckIsLite16.d);
                vryVar5.u((akrn) (objK9 == null ? aihlVarCheckIsLite16.b : aihlVarCheckIsLite16.c(objK9)));
            } else {
                this.r.u(null);
            }
        }
        vxz vxzVar = this.e;
        if (vxzVar.l(31, 45412668L, false) && this.l.isPresent() && (alaeVar.b & SemanticState.LiveRegion) != 0) {
            adhg adhgVar = this.b;
            akzu akzuVar = (akzu) this.l.get();
            alad aladVar = alaeVar.l;
            if (aladVar == null) {
                aladVar = alad.a;
            }
            if (aladVar != null) {
                int i = akzuVar.b;
                if ((i & 1) != 0 && (i & 2) != 0) {
                    int i2 = aladVar.b;
                    if ((i2 & 1) != 0) {
                        int i3 = aladVar.c;
                        int iN = atqp.N(akzuVar.c);
                        if (iN == 0) {
                            iN = 1;
                        }
                        xfh xfhVar = new xfh(i3, iN);
                        if ((i2 & 2) != 0) {
                            akzk akzkVar = aladVar.d;
                            if (akzkVar == null) {
                                akzkVar = akzk.a;
                            }
                            xfhVar.a = akzkVar;
                        }
                        alai alaiVarA = alai.a(akzuVar.d);
                        if (alaiVarA == null) {
                            alaiVarA = alai.FLOW_TYPE_UNKNOWN;
                        }
                        if ((akzuVar.b & 4) != 0) {
                            ((abte) adhgVar.b).e(xfhVar, alaiVarA, akzuVar.e);
                        } else if (adhgVar.a) {
                            ((abte) adhgVar.b).b(xfhVar, alaiVarA);
                        } else {
                            ((abte) adhgVar.b).d(xfhVar, alaiVarA);
                            adhgVar.a = true;
                        }
                    }
                }
            }
        }
        if (vxzVar.l(32, 45412673L, false)) {
            if ((alaeVar.b & 16) == 0) {
                LinearProgressIndicator linearProgressIndicator = this.k;
                if (linearProgressIndicator != null) {
                    linearProgressIndicator.setVisibility(8);
                    return;
                }
                return;
            }
            float f = alaeVar.g * 100.0f;
            if (this.k == null) {
                Context context = this.j;
                LinearProgressIndicator linearProgressIndicator2 = new LinearProgressIndicator(context);
                this.k = linearProgressIndicator2;
                int[] iArr = {tzk.i(context, R.attr.ytTextSecondary)};
                aezc aezcVar = linearProgressIndicator2.a;
                if (!Arrays.equals(aezcVar.e, iArr)) {
                    aezcVar.e = iArr;
                    linearProgressIndicator2.getIndeterminateDrawable().b.b();
                    linearProgressIndicator2.invalidate();
                }
                ((afah) linearProgressIndicator2.a).b();
                this.k.setIndeterminate(false);
                this.c.addView(this.k, 0);
            }
            this.k.setProgress((int) f);
            LinearProgressIndicator linearProgressIndicator3 = this.k;
            int i4 = linearProgressIndicator3.c;
            if (i4 <= 0) {
                linearProgressIndicator3.h.run();
                return;
            }
            Runnable runnable = linearProgressIndicator3.h;
            linearProgressIndicator3.removeCallbacks(runnable);
            linearProgressIndicator3.postDelayed(runnable, i4);
        }
    }

    @Override // defpackage.adhe
    public final void b() {
        Optional optional = this.g;
        optional.isPresent();
        ((vry) optional.get()).p();
    }

    @Override // defpackage.adhe
    public final void c() {
        Optional optional = this.g;
        optional.isPresent();
        ((vry) optional.get()).d.Y();
    }

    public final void e() {
        acxm acxmVar;
        Optional optional = this.m;
        if (true != optional.isPresent() || (acxmVar = ((adgz) optional.get()).d) == null) {
            return;
        }
        acxmVar.d();
    }

    @Override // defpackage.adhe
    public final void d(ajwo ajwoVar) {
    }
}
