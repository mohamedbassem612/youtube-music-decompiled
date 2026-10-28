package com.google.android.libraries.youtube.mdx.mediaroute;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.abvk;
import defpackage.acfw;
import defpackage.adul;
import defpackage.aihf;
import defpackage.akuc;
import defpackage.amdd;
import defpackage.amdg;
import defpackage.ameb;
import defpackage.aunn;
import defpackage.auom;
import defpackage.awlo;
import defpackage.awrc;
import defpackage.cc;
import defpackage.cf;
import defpackage.dd;
import defpackage.dfo;
import defpackage.dii;
import defpackage.dij;
import defpackage.hed;
import defpackage.kjc;
import defpackage.klo;
import defpackage.klt;
import defpackage.kou;
import defpackage.koy;
import defpackage.kro;
import defpackage.lpa;
import defpackage.mag;
import defpackage.mda;
import defpackage.taq;
import defpackage.tuk;
import defpackage.tzm;
import defpackage.vor;
import defpackage.vxz;
import defpackage.wjf;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xhb;
import defpackage.xmi;
import defpackage.xmj;
import defpackage.xmr;
import defpackage.xpk;
import defpackage.xpn;
import defpackage.xpq;
import defpackage.xqm;
import defpackage.xqn;
import defpackage.xrn;
import defpackage.xrq;
import defpackage.xsa;
import defpackage.xsf;
import defpackage.xsh;
import defpackage.xuo;
import defpackage.xup;
import defpackage.yco;
import defpackage.ycp;
import defpackage.zik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class MdxMediaRouteButton extends dfo {
    public final awlo i;
    public aunn j;
    public aunn k;
    public aunn l;
    public xmi m;
    public xmj n;
    public xsh o;
    public xqm p;
    public boolean q;
    public ycp r;
    public vxz s;
    public xrq t;
    public adul u;
    public hed v;

    public MdxMediaRouteButton(Context context) {
        super(context);
        this.i = new awlo();
        this.q = false;
    }

    private final Activity d() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.dfo, android.view.View
    public final boolean performClick() {
        boolean z;
        aunn aunnVar;
        Object objM;
        int i;
        taq.d();
        if (!this.q || this.v == null || this.r == null || this.l == null || this.j == null || this.k == null || this.m == null || this.n == null || this.u == null || this.o == null || this.s == null || this.p == null) {
            awlo awloVar = this.i;
            if (awloVar.f()) {
                awloVar.kk(tzm.a);
                return true;
            }
        } else {
            xrq xrqVar = this.t;
            if (xrqVar != null) {
                xrn xrnVar = (xrn) xrqVar.a;
                xrnVar.g.c.x = xrnVar.a();
                xgn xgnVarA = xrnVar.a();
                ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar = new xgj(xhb.b(11208));
                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
                amdgVar.c = 0;
                amdgVar.b |= 1;
                ycp ycpVar = xrnVar.s;
                int iBU = zik.bU(ycpVar.b);
                aihfVarCreateBuilder2.copyOnWrite();
                amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.instance;
                amdgVar2.d = iBU - 1;
                amdgVar2.b |= 4;
                vxz vxzVar = xrnVar.u;
                int i2 = ycpVar.b;
                xuo xuoVar = xrnVar.p;
                int i3 = 5;
                if (!vxzVar.l(164, 45673420L, false) && !vxzVar.l(244, 45823676L, false) && xuoVar != xuo.c) {
                    if (xuoVar == xuo.d) {
                        i = 6;
                    } else if (i2 == 0) {
                        i3 = 4;
                    } else if (i2 != 1) {
                        i = 3;
                    } else {
                        i3 = 2;
                    }
                    i3 = i;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                amdg amdgVar3 = (amdg) aihfVarCreateBuilder2.instance;
                amdgVar3.g = i3 - 1;
                amdgVar3.b |= 32;
                aihfVarCreateBuilder.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                amdg amdgVar4 = (amdg) aihfVarCreateBuilder2.build();
                amdgVar4.getClass();
                amddVar.f = amdgVar4;
                amddVar.b |= 4;
                xgnVarA.o(amebVar, xgjVar, (amdd) aihfVarCreateBuilder.build());
            }
            xmj xmjVar = this.n;
            if (xmjVar == null || xmjVar.a()) {
                dij.b(getContext());
                dii diiVarJ = dij.j();
                if (this.r.e == null && (aunnVar = this.l) != null && ((((xsa) aunnVar.io()).d(diiVarJ) || xsa.h(diiVarJ)) && !this.s.l(42, 45383916L, false))) {
                    dij.o(1);
                }
                xmi xmiVar = this.m;
                if (xmiVar != null && !xmiVar.e()) {
                    xmiVar.b();
                }
                hed hedVar = this.v;
                if (hedVar != null) {
                    acfw acfwVarI = ((abvk) hedVar.b.io()).i();
                    wjf wjfVarC = acfwVarI != null ? acfwVarI.c() : null;
                    if (wjfVarC != null && wjfVarC.S()) {
                        String str = ((xmr) hedVar.c.io()).a;
                        dd supportFragmentManager = ((cf) hedVar.a).getSupportFragmentManager();
                        xup xupVar = new xup();
                        xupVar.gT(supportFragmentManager, xupVar.getClass().getCanonicalName());
                        return true;
                    }
                }
                if (this.s.l(164, 45673420L, false) || this.s.l(244, 45823676L, false)) {
                    xqn xqnVar = (xqn) this.p;
                    if (awrc.c(xqnVar.a.a, "m")) {
                        vor vorVarB = xqnVar.b.b(akuc.ENGAGEMENT_PANEL_SURFACE_NATIVE_ALL);
                        vorVarB.getClass();
                        if (xqnVar.b(vorVarB, "PAmedia_hub_music")) {
                            return true;
                        }
                        xqnVar.a("PAmedia_hub_music");
                        return true;
                    }
                    vor vorVarB2 = xqnVar.b.b(akuc.ENGAGEMENT_PANEL_SURFACE_NATIVE_ALL);
                    vorVarB2.getClass();
                    if (xqnVar.b(vorVarB2, "PAmedia_hub_watch_companion")) {
                        return true;
                    }
                    xqnVar.a("PAmedia_hub_watch_companion");
                    return true;
                }
                if (!this.s.l(201, 45738960L, false) || ((xpn) this.j.io()).a()) {
                    z = true;
                } else {
                    yco ycoVar = this.r.e;
                    if (ycoVar != null) {
                        z = true;
                        if (ycoVar.b() != 1) {
                        }
                    } else {
                        z = true;
                    }
                    Activity activityD = d();
                    if (activityD != null && activityD.getResources().getConfiguration().orientation != 2) {
                        dd supportFragmentManager2 = ((xpq) this.k.io()).a.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        if (supportFragmentManager2.g("LnpPermissionPromptFragment") != null) {
                            return z;
                        }
                        xpk xpkVar = new xpk();
                        auom.f(xpkVar);
                        xpkVar.h(supportFragmentManager2, "LnpPermissionPromptFragment");
                        return z;
                    }
                }
                if (this.s.l(42, 45383916L, false)) {
                    xsh xshVar = this.o;
                    dd supportFragmentManager3 = xshVar.i.getSupportFragmentManager();
                    if (tuk.s(supportFragmentManager3)) {
                        cc ccVarG = supportFragmentManager3.g("DevicePickerDialogFragment");
                        if (ccVarG == null) {
                            xsf xsfVar = new xsf();
                            xsfVar.S = xshVar.k;
                            xsfVar.h(supportFragmentManager3, "DevicePickerDialogFragment");
                            return z;
                        }
                        if (!(ccVarG instanceof xsf)) {
                            return z;
                        }
                        xsf xsfVar2 = (xsf) ccVarG;
                        if (xsfVar2.isAdded()) {
                            return z;
                        }
                        xsfVar2.S = xshVar.k;
                        xsfVar2.h(supportFragmentManager3, "DevicePickerDialogFragment");
                        return z;
                    }
                }
                if (super.performClick()) {
                    return z;
                }
            } else {
                Activity activityD2 = d();
                if (activityD2 != null) {
                    klt kltVar = this.n.c;
                    kro.f("makeGooglePlayServicesAvailable must be called from the main thread");
                    int iM = kltVar.m(activityD2, 202100000);
                    if (iM == 0) {
                        objM = mda.m(null);
                    } else {
                        kou kouVarM = koy.m(activityD2);
                        koy koyVar = (koy) kouVarM.b("GmsAvailabilityHelper", koy.class);
                        if (koyVar == null) {
                            koyVar = new koy(kouVarM);
                        } else if (((lpa) koyVar.d.a).i()) {
                            koyVar.d = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
                        }
                        koyVar.a(new klo(1, iM, null, null, null, null), 0);
                        objM = koyVar.d.a;
                    }
                    ((lpa) objM).p(new mag(2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dfo, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable);
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new awlo();
        this.q = false;
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new awlo();
        this.q = false;
    }
}
