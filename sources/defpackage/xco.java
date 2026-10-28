package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xco implements vnx {
    private RelativeLayout a;
    private final wxl b;
    private xci c;

    public xco(Context context, wwq wwqVar, xcn xcnVar, xcj xcjVar, xgn xgnVar) {
        this.b = wwqVar;
        if (this.a == null) {
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.live_chat_action_panel_classic, (ViewGroup) null, false);
            this.a = relativeLayout;
            relativeLayout.setId(R.id.live_chat_action_panel);
        }
        if (this.c == null) {
            RelativeLayout relativeLayout2 = this.a;
            Context context2 = (Context) xcjVar.a.io();
            context2.getClass();
            ((Context) xcjVar.b.io()).getClass();
            Activity activity = (Activity) xcjVar.c.io();
            activity.getClass();
            adhv adhvVar = (adhv) xcjVar.e.io();
            adhvVar.getClass();
            ((advb) xcjVar.f.io()).getClass();
            aduv aduvVar = (aduv) xcjVar.g.io();
            aduvVar.getClass();
            vxe vxeVar = (vxe) xcjVar.h.io();
            vxeVar.getClass();
            wyz wyzVar = (wyz) xcjVar.i.io();
            wyzVar.getClass();
            wys wysVar = (wys) xcjVar.j.io();
            wysVar.getClass();
            tza tzaVar = (tza) xcjVar.k.io();
            tzaVar.getClass();
            aeiv aeivVar = (aeiv) xcjVar.l.io();
            aeivVar.getClass();
            aeaq aeaqVar = (aeaq) xcjVar.m.io();
            aeaqVar.getClass();
            zs zsVar = (zs) xcjVar.n.io();
            zsVar.getClass();
            ci ciVar = (ci) xcjVar.p.io();
            ciVar.getClass();
            aefv aefvVar = (aefv) xcjVar.q.io();
            aefvVar.getClass();
            yno ynoVar = (yno) xcjVar.r.io();
            ynoVar.getClass();
            xsc xscVar = (xsc) xcjVar.s.io();
            xscVar.getClass();
            awmd awmdVar = xcjVar.t;
            acyx acyxVar = (acyx) xcjVar.u.io();
            acyxVar.getClass();
            vxz vxzVar = (vxz) xcjVar.v.io();
            vxzVar.getClass();
            vxz vxzVar2 = (vxz) xcjVar.w.io();
            vxzVar2.getClass();
            abte abteVar = (abte) xcjVar.x.io();
            abteVar.getClass();
            mbc mbcVar = (mbc) xcjVar.y.io();
            mbcVar.getClass();
            tun tunVar = (tun) xcjVar.z.io();
            tunVar.getClass();
            wxh wxhVar = (wxh) xcjVar.A.io();
            wxhVar.getClass();
            aeda aedaVar = (aeda) xcjVar.B.io();
            aedaVar.getClass();
            Context context3 = (Context) xcjVar.C.io();
            context3.getClass();
            ((Context) xcjVar.D.io()).getClass();
            vxz vxzVar3 = (vxz) xcjVar.E.io();
            vxzVar3.getClass();
            vxz vxzVar4 = (vxz) xcjVar.F.io();
            vxzVar4.getClass();
            vxz vxzVar5 = (vxz) xcjVar.G.io();
            vxzVar5.getClass();
            relativeLayout2.getClass();
            xgnVar.getClass();
            xci xciVar = new xci(context2, activity, adhvVar, aduvVar, vxeVar, wyzVar, wysVar, tzaVar, aeivVar, aeaqVar, zsVar, ciVar, aefvVar, ynoVar, xscVar, awmdVar, acyxVar, vxzVar, vxzVar2, abteVar, mbcVar, tunVar, wxhVar, aedaVar, context3, vxzVar3, vxzVar4, vxzVar5, wwqVar, xcnVar, relativeLayout2, xgnVar);
            this.c = xciVar;
            wwqVar.jl(xciVar);
        }
    }

    @Override // defpackage.vnx
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.vox
    public final void b() {
        this.a.setVisibility(8);
    }

    @Override // defpackage.vox
    public final void c() {
        this.a.removeAllViews();
        this.a.setVisibility(8);
    }

    @Override // defpackage.vox
    public final void d() {
        this.a.setVisibility(8);
    }

    @Override // defpackage.vox
    public final void f() {
        this.a.setVisibility(0);
    }

    @Override // defpackage.vnx
    public final /* bridge */ /* synthetic */ void g(Object obj, adwq adwqVar, adxd adxdVar) {
        if (obj != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(amod.b);
            aihi aihiVar = (aihi) obj;
            aihiVar.c(aihlVarCheckIsLite);
            Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
            amqj amqjVar = ((amod) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
            if (amqjVar == null) {
                amqjVar = amqj.a;
            }
            this.b.f(amqjVar);
        }
    }

    @Override // defpackage.vnx
    public final boolean h(apji apjiVar) {
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(amod.b);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vox
    public final /* synthetic */ void e() {
    }
}
