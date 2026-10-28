package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suq extends suc implements svp {
    public sul k;
    DialogInterface.OnDismissListener l;
    public xgm m;
    public vxe n;
    public vwt o;
    public wjr p;
    public xsc q;
    private Context r;
    private amaz s;
    private boolean t;

    private final boolean m() {
        amaz amazVar = this.s;
        if (amazVar == null) {
            return false;
        }
        apji apjiVar = amazVar.c == 15 ? (apji) amazVar.d : apji.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arql.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        apji apjiVar2 = ((arqk) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        ajwo ajwoVar = ((ajnf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).q;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arom.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(alkk.b);
        ajwoVar.c(aihlVarCheckIsLite4);
        return !ajwoVar.j.n(aihlVarCheckIsLite4.d);
    }

    @Override // defpackage.svp
    public final /* synthetic */ void P() {
        super.iQ(true, false, false);
    }

    public final void k() {
        super.iQ(true, false, false);
        sul sulVar = this.k;
        if (sulVar != null) {
            sulVar.d();
        }
    }

    public final void l() {
        if (this.t) {
            super.iQ(true, false, false);
        }
    }

    @Override // defpackage.suc, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.r = context;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        sul sulVar = this.k;
        if (sulVar != null) {
            sulVar.d();
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (getArguments().containsKey("get_cart_response")) {
            this.s = (amaz) this.p.D(getArguments().getByteArray("get_cart_response"), amaz.a);
        }
        iO(0, 0);
        if (m()) {
            this.o.W(this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [awmd, java.lang.Object] */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        alkk alkkVar;
        arqk arqkVar;
        layoutInflater.getClass();
        if (this.s == null) {
            super.iQ(true, false, false);
            sul sulVar = this.k;
            if (sulVar == null || this.f != null) {
                return null;
            }
            sulVar.e(null);
            return null;
        }
        this.f.setCanceledOnTouchOutside(true);
        View viewInflate = layoutInflater.inflate(R.layout.upgrade_dialog_wrapper, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.upgrade_dialog_view);
        amaz amazVar = this.s;
        int i = 15;
        apji apjiVar = amazVar.c == 15 ? (apji) amazVar.d : apji.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arql.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        aihf builder = ((arqk) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toBuilder();
        arqk arqkVar2 = (arqk) builder.build();
        apji apjiVar2 = arqkVar2.f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        ajwo ajwoVar = ((ajnf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).q;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(alkk.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            apji apjiVar3 = arqkVar2.f;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
            apjiVar3.c(aihlVarCheckIsLite4);
            Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
            ajwo ajwoVar2 = ((ajnf) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).q;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(alkk.b);
            ajwoVar2.c(aihlVarCheckIsLite5);
            Object objK4 = ajwoVar2.j.k(aihlVarCheckIsLite5.d);
            alkkVar = (alkk) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4));
        } else {
            alkkVar = null;
        }
        HashMap map = new HashMap();
        if (alkkVar != null) {
            this.t = true;
            vxe vxeVar = this.n;
            ajwo ajwoVar3 = alkkVar.d;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new sup(vxeVar, ajwoVar3, this.k));
            aihf builder2 = alkkVar.toBuilder();
            builder2.copyOnWrite();
            alkk alkkVar2 = (alkk) builder2.instance;
            alkkVar2.d = null;
            alkkVar2.c &= -2;
            alkk alkkVar3 = (alkk) builder2.build();
            arqk arqkVar3 = (arqk) builder.instance;
            if ((arqkVar3.b & 4) != 0) {
                apji apjiVar4 = arqkVar3.f;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajnp.a);
                apjiVar4.c(aihlVarCheckIsLite6);
                Object objK5 = apjiVar4.j.k(aihlVarCheckIsLite6.d);
                ajnf ajnfVar = (ajnf) (objK5 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK5));
                ajwo ajwoVar4 = ajnfVar.q;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                aihh aihhVar = (aihh) ajwoVar4.toBuilder();
                aihhVar.e(alkk.b, alkkVar3);
                ajwo ajwoVar5 = (ajwo) aihhVar.build();
                aihh aihhVar2 = (aihh) ajnfVar.toBuilder();
                aihhVar2.copyOnWrite();
                ajnf ajnfVar2 = (ajnf) aihhVar2.instance;
                ajwoVar5.getClass();
                ajnfVar2.q = ajwoVar5;
                ajnfVar2.b |= SemanticState.Modal;
                ajnf ajnfVar3 = (ajnf) aihhVar2.build();
                apji apjiVar5 = ((arqk) builder.instance).f;
                if (apjiVar5 == null) {
                    apjiVar5 = apji.a;
                }
                aihh aihhVar3 = (aihh) apjiVar5.toBuilder();
                aihhVar3.e(ajnp.a, ajnfVar3);
                builder.copyOnWrite();
                arqk arqkVar4 = (arqk) builder.instance;
                apji apjiVar6 = (apji) aihhVar3.build();
                apjiVar6.getClass();
                arqkVar4.f = apjiVar6;
                arqkVar4.b |= 4;
                arqkVar = (arqk) builder.build();
            } else {
                arqkVar = (arqk) builder.build();
            }
            builder = arqkVar.toBuilder();
            aihf builder3 = this.s.toBuilder();
            amaz amazVar2 = this.s;
            aihh aihhVar4 = (aihh) (amazVar2.c == 15 ? (apji) amazVar2.d : apji.a).toBuilder();
            aihhVar4.e(arql.a, (arqk) builder.build());
            builder3.copyOnWrite();
            amaz amazVar3 = (amaz) builder3.instance;
            apji apjiVar7 = (apji) aihhVar4.build();
            apjiVar7.getClass();
            amazVar3.d = apjiVar7;
            amazVar3.c = 15;
            this.s = (amaz) builder3.build();
        } else {
            this.t = false;
            map.put("PostTransactionCallback", this);
        }
        xsc xscVar = this.q;
        Context context = this.r;
        rxn rxnVar = new rxn(this, i);
        rxn rxnVar2 = new rxn(this, 16);
        context.getClass();
        vxe vxeVar2 = (vxe) xscVar.c.io();
        vxeVar2.getClass();
        afip afipVar = (afip) xscVar.a.io();
        afipVar.getClass();
        aciz acizVar = (aciz) xscVar.b.io();
        acizVar.getClass();
        svs svsVar = new svs(context, vxeVar2, afipVar, acizVar, rxnVar, rxnVar2, map);
        frameLayout.addView(svsVar.c);
        adly adlyVar = new adly();
        adlyVar.a(this.m.hB());
        this.l = svsVar;
        svsVar.hU(adlyVar, (arqk) builder.build());
        return viewInflate;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        if (m()) {
            this.o.X(this);
        }
    }

    @Override // defpackage.svp
    public final void v() {
        super.iQ(true, false, false);
    }

    @Override // defpackage.svp
    public final void x(amax amaxVar) {
        super.iQ(true, false, false);
        sul sulVar = this.k;
        if (sulVar != null) {
            sulVar.f(amaxVar);
        }
    }
}
