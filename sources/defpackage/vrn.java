package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vrn {
    public final awmd a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    private final Object h;
    private final Object i;
    private final Object j;

    public vrn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.h = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        this.a = awmdVar5;
        this.i = awmdVar6;
        this.e = awmdVar7;
        awmdVar8.getClass();
        this.f = awmdVar8;
        awmdVar9.getClass();
        this.g = awmdVar9;
        this.j = awmdVar10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    public final vrm a(LoadingFrameLayout loadingFrameLayout, xgn xgnVar) {
        Context context = (Context) this.b.io();
        context.getClass();
        cf cfVar = (cf) this.h.io();
        cfVar.getClass();
        zwb zwbVar = (zwb) this.c.io();
        zwbVar.getClass();
        vxe vxeVar = (vxe) this.d.io();
        vxeVar.getClass();
        xit xitVar = (xit) this.g.io();
        xitVar.getClass();
        loadingFrameLayout.getClass();
        xgnVar.getClass();
        return new vrm(context, cfVar, zwbVar, vxeVar, this.a, this.i, this.e, this.f, xitVar, loadingFrameLayout, xgnVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, vxe] */
    public final spx b(snz snzVar, String str, smc smcVar, Long l, slm slmVar) {
        sga sgaVarT = ((ayq) this.e).T();
        ((zzj) this.j).c(sgaVarT);
        if (smcVar.l()) {
            sgaVarT.d = TimeUnit.SECONDS.toMillis(smcVar.a());
        }
        Object obj = this.i;
        sgv sgvVar = (sgv) obj;
        return new spz(sgvVar, snzVar, smcVar, str, ((abnc) this.g).c(), (adws) this.f, c(smcVar), sgaVarT, sgvVar.a, this.d, l, slmVar, (vyo) this.b);
    }

    public final zdj c(smc smcVar) {
        amkq amkqVarD = smcVar.n.D();
        if (!amkqVarD.b) {
            return null;
        }
        ofe ofeVar = new ofe();
        boolean z = amkqVarD.d;
        boolean z2 = amkqVarD.e;
        ofeVar.b = amkqVarD.f;
        ofeVar.c = amkqVarD.g;
        ofeVar.d = amkqVarD.h;
        ofeVar.e = amkqVarD.i;
        return ((ruk) this.h).f(smcVar.aw(), ofeVar);
    }

    public vrn(abnc abncVar, adws adwsVar, ruk rukVar, ayq ayqVar, zzj zzjVar, sgv sgvVar, vxe vxeVar, vyo vyoVar, awmd awmdVar, abmt abmtVar) {
        this.g = abncVar;
        this.f = adwsVar;
        this.e = ayqVar;
        this.h = rukVar;
        this.j = zzjVar;
        this.i = sgvVar;
        this.d = vxeVar;
        this.b = vyoVar;
        this.a = awmdVar;
        this.c = abmtVar;
    }
}
