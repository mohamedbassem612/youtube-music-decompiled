package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acxx {
    public final avmr a = new avmr();
    public final avmb b;
    public final nuc c;
    public final aunn d;
    ViewGroup e;
    WeakReference f;
    public acyb g;
    xgn h;
    aeeq i;
    public int j;
    public final abte k;
    private final Context l;
    private final aunn m;
    private final acyc n;
    private avmm o;
    private fjw p;
    private aeeq q;
    private final aeda r;
    private final Optional s;
    private final acyz t;
    private final vxz u;
    private final afip v;
    private final aeod w;
    private final abhh x;
    private final ci y;

    public acxx(Context context, avmb avmbVar, aunn aunnVar, aunn aunnVar2, nuc nucVar, acyz acyzVar, vxz vxzVar, aeod aeodVar, ci ciVar, acyc acycVar, abhh abhhVar, afip afipVar, abte abteVar, aeda aedaVar, Optional optional) {
        this.l = context;
        this.b = avmbVar;
        this.m = aunnVar;
        this.d = aunnVar2;
        this.c = nucVar;
        this.t = acyzVar;
        this.u = vxzVar;
        this.w = aeodVar;
        this.n = acycVar;
        this.y = ciVar;
        this.x = abhhVar;
        this.v = afipVar;
        this.k = abteVar;
        this.r = aedaVar;
        this.s = optional;
    }

    public static ajwo a(nrv nrvVar) {
        if (nrvVar != null) {
            Object obj = nrvVar.d;
            if (obj instanceof adaq) {
                return ((adaq) obj).d;
            }
        }
        return null;
    }

    public static Optional c(nrv nrvVar) {
        if (nrvVar != null) {
            Object obj = nrvVar.d;
            if (obj instanceof adaq) {
                return Optional.ofNullable(((adaq) obj).a);
            }
        }
        return Optional.empty();
    }

    public static final xgn j(nrv nrvVar) {
        return (xgn) aecm.z(nrvVar).f();
    }

    private final void m(acyb acybVar) {
        acybVar.k = new acxw(this, acybVar, 0);
    }

    private final boolean n() {
        return this.u.l(94, 45696801L, false);
    }

    private final boolean o(int i) {
        return adzb.h(this.l, this.u, i);
    }

    public final ajwo b(nrv nrvVar) {
        akrn akrnVar;
        vxz vxzVar = this.u;
        ajwo ajwoVarA = a(nrvVar);
        if (!vxzVar.l(188, 45849369L, false)) {
            return ajwoVarA;
        }
        if (ajwoVarA != null && !ajwoVarA.c.E()) {
            return ajwoVarA;
        }
        Optional optionalC = c(nrvVar);
        if (true == optionalC.isPresent()) {
            Object obj = optionalC.get();
            if (obj instanceof akrn) {
                akrnVar = (akrn) obj;
            } else {
                akrnVar = obj instanceof acxm ? ((acxm) obj).a : null;
            }
            optionalC = Optional.ofNullable(akrnVar);
        }
        akrn akrnVar2 = (akrn) optionalC.orElse(null);
        if (akrnVar2 == null || akrnVar2.d.E()) {
            return ajwoVarA;
        }
        aihh aihhVar = ajwoVarA != null ? (aihh) ajwoVarA.toBuilder() : (aihh) ajwo.a.createBuilder();
        aigj aigjVar = akrnVar2.d;
        aihhVar.copyOnWrite();
        ajwo ajwoVar = (ajwo) aihhVar.instance;
        aigjVar.getClass();
        ajwoVar.b |= 1;
        ajwoVar.c = aigjVar;
        return (ajwo) aihhVar.build();
    }

    public final String d() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            aczw aczwVar = (aczw) weakReference.get();
            if (aczwVar != null) {
                return aczwVar.s();
            }
            return null;
        }
        acyb acybVar = this.g;
        if (acybVar != null) {
            return (String) acybVar.a().orElse(null);
        }
        return null;
    }

    public final void e() {
        aeeq aeeqVar = this.q;
        if (aeeqVar != null) {
            this.t.a(aeeqVar);
            this.q = null;
        }
        aeeq aeeqVar2 = this.i;
        if (aeeqVar2 != null) {
            this.t.a(aeeqVar2);
            this.i = null;
        }
        f(Optional.empty());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(Optional optional) {
        if (this.r.w()) {
            this.s.isPresent();
        }
        if (optional.isPresent()) {
            if (!((String) optional.get()).equals(d())) {
                return;
            }
        }
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            aczw aczwVar = (aczw) weakReference.get();
            if (aczwVar != null && aczwVar.getActivity() != null && tuk.r(aczwVar.getActivity())) {
                aczwVar.dismiss();
            }
            this.f = null;
        }
        ci ciVar = this.y;
        while (true) {
            ?? r1 = ciVar.a;
            if (r1.isEmpty()) {
                break;
            } else {
                ((adzd) r1.remove(r1.size() - 1)).c();
            }
        }
        this.g = null;
        this.h = null;
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            fjw fjwVar = this.p;
            if (fjwVar != null) {
                viewGroup.removeView(fjwVar);
                this.p = null;
            }
            this.e.setVisibility(8);
            this.e = null;
        }
        avmm avmmVar = this.o;
        if (avmmVar != null) {
            avmmVar.dispose();
            this.o = null;
        }
        this.a.a(avns.a);
    }

    public final void g(byte[] bArr, String str) {
        xgn xgnVarM;
        String strD = d();
        if (strD == null || str == null || !str.contentEquals(strD)) {
            return;
        }
        if (n()) {
            WeakReference weakReference = this.f;
            xgnVarM = null;
            if (weakReference != null) {
                aczw aczwVar = (aczw) weakReference.get();
                if (aczwVar != null) {
                    xgnVarM = aczwVar.m();
                }
            } else {
                acyb acybVar = this.g;
                if (acybVar != null) {
                    xgnVarM = acybVar.a;
                }
            }
        } else {
            xgnVarM = this.h;
        }
        if (xgnVarM != null) {
            xgnVarM.d(new xgj(bArr));
        }
    }

    public final void h(acxd acxdVar) {
        aczw aczwVar;
        if (this.r.w()) {
            this.s.isPresent();
        }
        acyb acybVar = this.g;
        if (acybVar == null || !acybVar.b.g()) {
            WeakReference weakReference = this.f;
            if (weakReference != null && (aczwVar = (aczw) weakReference.get()) != null && (acxdVar.b & 1) != 0) {
                String strS = aczwVar.s();
                if (acxdVar.c.contentEquals("testSheetId") || (strS != null && acxdVar.c.contentEquals(strS))) {
                    aczwVar.u(acxdVar);
                }
            }
        } else {
            Optional optionalA = acybVar.a();
            if ((acxdVar.b & 1) != 0 && (acxdVar.c.contentEquals("testSheetId") || (optionalA.isPresent() && acxdVar.c.contentEquals((CharSequence) optionalA.get())))) {
                boolean z = acybVar.j;
                if (!z) {
                    acybVar.i = true;
                }
                boolean z2 = acxdVar.f.isEmpty() && (acxdVar.b & 16) != 0;
                List listQ = z2 ? agke.q(acxdVar.h) : acxdVar.f;
                int i = acxdVar.b;
                acybVar.c(listQ, (i & 4) != 0 ? acxdVar.e : null, (i & 8) != 0 ? acxdVar.g : null, acybVar.n.l(134, 45752948L, false) && z2);
                if (!z) {
                    acybVar.i = false;
                }
            }
        }
        if ((acxdVar.b & 1) != 0) {
            this.k.e(new xfh(2, 31), alai.FLOW_TYPE_ACTION_SHEET, acxdVar.c);
        }
    }

    public final void i(aczw aczwVar) {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f = new WeakReference(aczwVar);
    }

    public final void k(acxd acxdVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, int i, adzc adzcVar) {
        aczv aczvVar;
        xgt xgtVarA;
        adzd adzdVarAb = this.y.ab();
        View viewA = adzdVarAb != null ? adzdVarAb.a() : (View) optional3.orElse(null);
        if (!optional9.isPresent() || !((Boolean) optional9.get()).booleanValue()) {
            e();
        }
        aihf aihfVarCreateBuilder = airs.a.createBuilder();
        if (optional2.isPresent() && (xgtVarA = ((xgn) optional2.get()).a()) != null) {
            aihfVarCreateBuilder.copyOnWrite();
            airs airsVar = (airs) aihfVarCreateBuilder.instance;
            airsVar.b |= 1;
            airsVar.c = xgtVarA.f;
        }
        ahgr ahgrVar = new ahgr(null, null);
        if (optional.isPresent()) {
            ahgrVar.a = Optional.of(Integer.valueOf(((apmn) optional.get()).c));
        }
        if (optional6.isPresent()) {
            ahgrVar.d((ajwo) optional6.get());
        }
        adyy adyyVarB = this.w.b(ahgrVar.c());
        if (!n()) {
            this.h = adyyVarB.d();
        }
        if (this.r.w()) {
            this.s.isPresent();
        }
        boolean z = false;
        if (viewA == null || !o(i)) {
            Object objOrElse = optional4.orElse(null);
            xgn xgnVarD = n() ? adyyVarB.d() : this.h;
            vxz vxzVar = this.u;
            if (vxzVar.l(94, 45696801L, false)) {
                acxdVar.getClass();
                Optional optionalEmpty = Optional.empty();
                Optional optionalEmpty2 = Optional.empty();
                xgnVarD.getClass();
                aczvVar = aczv.r(acxdVar, null, optionalEmpty, optionalEmpty2, objOrElse, optional5, xgnVarD, null);
                aczvVar.S = vxzVar;
            } else {
                aczvVar = new aczv();
                acxdVar.getClass();
                Bundle bundle = new Bundle();
                ahng.aG(bundle, "MODEL_BOTTOM_SHEET_FRAGMENT_KEY", acxdVar);
                aczvVar.setArguments(bundle);
                aczvVar.H = true;
                aczv.t(aczvVar, objOrElse, xgnVarD, null, optional5);
                aczvVar.S = vxzVar;
            }
            if (acxdVar.d > 0) {
                aczvVar.C = (adbm) optional7.orElse(new adbm(this, aczvVar, acxdVar));
            }
            if (optional8.isPresent()) {
                aczvVar.I = ((Boolean) optional8.get()).booleanValue();
                if (((Boolean) optional8.get()).booleanValue()) {
                    aczvVar.H = false;
                }
            }
            aczvVar.x(adyyVarB);
            cf cfVar = (cf) this.l;
            if (!cfVar.getLifecycle().a().a(bob.e)) {
                return;
            }
            aczvVar.h(cfVar.getSupportFragmentManager(), aczvVar.getTag());
            if (!n()) {
                this.f = new WeakReference(aczvVar);
            }
        } else {
            acyb acybVarA = this.n.a(viewA, optional4.orElse(null), (Map) optional5.orElse(null), adyyVarB.d(), null, adzcVar);
            acxdVar.getClass();
            if ((acxdVar.b & 1) != 0) {
                acybVarA.h = acxdVar.c;
            }
            boolean z2 = acxdVar.f.isEmpty() && (acxdVar.b & 16) != 0;
            List listQ = z2 ? agke.q(acxdVar.h) : acxdVar.f;
            int i2 = acxdVar.b;
            aigj aigjVar = (i2 & 4) != 0 ? acxdVar.e : null;
            aigj aigjVar2 = (i2 & 8) != 0 ? acxdVar.g : null;
            if (acybVarA.n.l(134, 45752948L, false) && z2) {
                z = true;
            }
            acybVarA.c(listQ, aigjVar, aigjVar2, z);
            acybVarA.b(adyyVarB);
            m(acybVarA);
            acybVarA.d();
            this.g = acybVarA;
        }
        if ((acxdVar.b & 1) != 0) {
            abte abteVar = this.k;
            xfh xfhVar = new xfh(1, 31);
            aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
            airs airsVar2 = (airs) aihfVarCreateBuilder.build();
            aihfVarCreateBuilder2.copyOnWrite();
            akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
            airsVar2.getClass();
            akzkVar.l = airsVar2;
            akzkVar.b |= 8388608;
            xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
            abteVar.e(xfhVar, alai.FLOW_TYPE_ACTION_SHEET, acxdVar.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Type inference failed for: r1v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [awmd, java.lang.Object] */
    public final void l(asmv asmvVar, int i, assl asslVar, nrv nrvVar, xgn xgnVar, int i2, akrn akrnVar, adzr adzrVar) {
        adfx adfxVarE;
        xgn xgnVarD;
        aczv aczvVarR;
        xgn xgnVar2 = xgnVar;
        adzd adzdVarAb = this.y.ab();
        asst asstVar = null;
        View viewA = adzdVarAb != null ? adzdVarAb.a() : null;
        e();
        this.o = new avmm();
        int i3 = i - 1;
        if (i3 == 2) {
            Context context = this.l;
            ViewGroup viewGroup = (ViewGroup) ((Activity) context).getWindow().findViewById(R.id.interstitials_container);
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                avmm avmmVar = this.o;
                if (avmmVar != null) {
                    fjw fjwVar = new fjw(context);
                    fhd fhdVar = fjwVar.y;
                    mlo mloVar = (mlo) this.m.io();
                    nsk nskVarB = nsl.b();
                    nskVarB.b(fjwVar);
                    nskVarB.p(false);
                    if (xgnVar2 != null) {
                        adfxVarE = this.v.e(xgnVar2);
                    } else {
                        xgnVar2 = null;
                        adfxVarE = null;
                    }
                    nskVarB.n(adfxVarE);
                    fhm fhmVarC = ComponentTree.c(fhdVar, mloVar.a(fhdVar, nskVarB.a(), asmvVar.toByteArray(), xgnVar2 != null ? new adat(xgnVar2) : null, avmmVar), null);
                    fhmVarC.d = false;
                    fjwVar.K(fhmVarC.a(), true);
                    fjwVar.setBackgroundColor(tzk.i(context, R.attr.ytBrandBackgroundSolid));
                    this.p = fjwVar;
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.bottom_sheet_container);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                frameLayout.setClickable(true);
                fjw fjwVar2 = this.p;
                if (fjwVar2 != null) {
                    frameLayout.addView(fjwVar2, layoutParams2);
                }
                frameLayout.setImportantForAccessibility(2);
                viewGroup.addView(frameLayout, layoutParams);
                viewGroup.setVisibility(0);
                this.e = viewGroup;
                return;
            }
            return;
        }
        if (i3 == 3) {
            acyz acyzVar = this.t;
            aeep aeepVarC = acyz.c();
            acxi acxiVar = (acxi) aeepVarC;
            acxiVar.a = asmvVar;
            acxiVar.d(this.j);
            acxiVar.b(1);
            acxiVar.d = nrvVar;
            abhh abhhVar = this.x;
            Optional optionalEmpty = Optional.empty();
            xgn xgnVar3 = (xgn) abhhVar.a.io();
            xgnVar3.getClass();
            xgm xgmVar = (xgm) abhhVar.b.io();
            xgmVar.getClass();
            adzs adzsVar = new adzs(xgnVar3, xgmVar, optionalEmpty);
            acxiVar.c = adzsVar;
            acxiVar.b = adzsVar.a;
            aeeq aeeqVarA = aeepVarC.a();
            this.q = aeeqVarA;
            acyzVar.b(aeeqVarA);
            return;
        }
        if (i3 == 5) {
            ajwo ajwoVarA = a(nrvVar);
            aigj aigjVar = aigj.d;
            if (ajwoVarA != null) {
                aigjVar = ajwoVarA.c;
            }
            acyz acyzVar2 = this.t;
            aeep aeepVarC2 = acyz.c();
            acxi acxiVar2 = (acxi) aeepVarC2;
            acxiVar2.a = asmvVar;
            acxiVar2.d(this.j);
            acxiVar2.b(2);
            acxiVar2.b = xgnVar2;
            acxiVar2.c(aigjVar);
            acxiVar2.e(i2);
            acxiVar2.d = nrvVar;
            aeeq aeeqVarA2 = aeepVarC2.a();
            this.i = aeeqVarA2;
            acyzVar2.b(aeeqVarA2);
            return;
        }
        boolean z = i == 5;
        ahgr ahgrVar = new ahgr(null, null);
        ajwo ajwoVarB = b(nrvVar);
        if (ajwoVarB != null) {
            ahgrVar.d(ajwoVarB);
        }
        adyy adyyVarB = this.w.b(ahgrVar.c());
        Optional optionalOfNullable = Optional.ofNullable(nrvVar);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((nrv) optionalOfNullable.get()).b());
        }
        if ((viewA != null || optionalOfNullable.isPresent()) && o(2)) {
            acyc acycVar = this.n;
            if (viewA == null) {
                viewA = (View) optionalOfNullable.get();
            }
            acyb acybVarA = acycVar.a(viewA, c(nrvVar).orElse(null), null, xgnVar2 == null ? adyyVarB.d() : xgnVar2, akrnVar, new adzc(false, 1, null));
            asmvVar.getClass();
            acybVarA.c(agke.q(asmvVar.toByteString()), null, null, acybVarA.n.l(134, 45752948L, false));
            acybVarA.b(adyyVarB);
            if (adzrVar != null) {
                acybVarA.b(adzrVar);
            }
            m(acybVarA);
            acybVarA.d();
            this.g = acybVarA;
            return;
        }
        if (this.r.w()) {
            this.s.isPresent();
        }
        Object objOrElse = c(nrvVar).orElse(null);
        if (xgnVar2 == null) {
            xgnVarD = adyyVarB.d();
        } else {
            ajwo ajwoVarA2 = a(nrvVar);
            if (ajwoVarA2 != null) {
                aihl aihlVar = akrx.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                ajwoVarA2.c(aihlVarCheckIsLite);
                Object objK = ajwoVarA2.j.k(aihlVarCheckIsLite.d);
                CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                aihl aihlVar2 = asst.b;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar2);
                commandOuterClass$Command.c(aihlVarCheckIsLite2);
                if (commandOuterClass$Command.j.n(aihlVarCheckIsLite2.d)) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                    ajwoVarA2.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVarA2.j.k(aihlVarCheckIsLite3.d);
                    CommandOuterClass$Command commandOuterClass$Command2 = (CommandOuterClass$Command) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                    commandOuterClass$Command2.c(aihlVarCheckIsLite4);
                    Object objK3 = commandOuterClass$Command2.j.k(aihlVarCheckIsLite4.d);
                    asstVar = (asst) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
                }
            }
            if (asstVar == null || !asstVar.h) {
                xgnVarD = xgnVar2;
            } else {
                xgnVarD = adyyVarB.d();
            }
        }
        vxz vxzVar = this.u;
        if (vxzVar.l(94, 45696801L, false)) {
            asmvVar.getClass();
            aczvVarR = aczv.r(null, asmvVar, Optional.of(asslVar), Optional.of(Integer.valueOf(i2)), objOrElse, Optional.empty(), xgnVarD, akrnVar);
            aczvVarR.S = vxzVar;
        } else {
            aczv aczvVar = new aczv();
            asmvVar.getClass();
            Bundle bundle = new Bundle();
            ahng.aG(bundle, "ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY", asmvVar);
            aczvVar.setArguments(bundle);
            aczv.t(aczvVar, objOrElse, xgnVarD, akrnVar, Optional.empty());
            aczvVar.J = asslVar;
            aczvVar.K = i2;
            aczvVar.H = true;
            aczvVar.S = vxzVar;
            aczvVarR = aczvVar;
        }
        aczvVarR.H = false;
        aczvVarR.I = z;
        aczvVarR.x(adyyVarB);
        if (adzrVar != null) {
            aczvVarR.x(adzrVar);
        }
        aczvVarR.h(((cf) this.l).getSupportFragmentManager(), aczvVarR.getTag());
        if (n()) {
            return;
        }
        this.f = new WeakReference(aczvVarR);
    }
}
