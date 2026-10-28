package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jdg implements adme {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;
    private final Object c;

    public jdg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, int i) {
        this.$cid = i;
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v6, types: [adhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [adhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, rpr] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, rpq] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [advb, java.lang.Object] */
    @Override // defpackage.adme
    public final /* synthetic */ adma a(ViewGroup viewGroup) {
        adma rpeVar;
        int i = this.$cid;
        if (i == 0) {
            aczl aczlVar = (aczl) this.a;
            Context context = (Context) aczlVar.c.io();
            context.getClass();
            inn innVar = (inn) aczlVar.e.io();
            innVar.getClass();
            iwe iweVar = (iwe) aczlVar.g.io();
            iweVar.getClass();
            vxz vxzVar = (vxz) aczlVar.b.io();
            vxzVar.getClass();
            hef hefVar = (hef) aczlVar.a.io();
            hefVar.getClass();
            jin jinVar = (jin) aczlVar.f.io();
            jinVar.getClass();
            adxj adxjVar = (adxj) aczlVar.d.io();
            adxjVar.getClass();
            return new jdh(context, innVar, iweVar, vxzVar, hefVar, this.b, jinVar, adxjVar, (View) this.c);
        }
        if (i == 1) {
            Context context2 = (Context) this.a.io();
            context2.getClass();
            adhv adhvVar = (adhv) this.b.io();
            adhvVar.getClass();
            vxe vxeVar = (vxe) this.c.io();
            vxeVar.getClass();
            viewGroup.getClass();
            return new jbx(context2, adhvVar, vxeVar, viewGroup);
        }
        if (i == 2) {
            ?? r11 = this.a;
            rpeVar = new rpe((Context) this.c, this.b, r11, 0);
        } else {
            if (i != 3) {
                Object obj = this.c;
                return new aemz((Context) obj, (aekx) this.b, this.a);
            }
            ?? r12 = this.a;
            rpeVar = new rpg((Context) this.c, this.b, r12, 0);
        }
        return rpeVar;
    }

    public jdg(Context context, aekx aekxVar, adhv adhvVar, int i) {
        this.$cid = i;
        this.c = context;
        this.b = aekxVar;
        this.a = adhvVar;
    }

    public jdg(Context context, ttm ttmVar, rpr rprVar, int i) {
        this.$cid = i;
        context.getClass();
        this.c = context;
        ttmVar.getClass();
        this.b = ttmVar;
        this.a = rprVar;
    }

    public jdg(aczl aczlVar, advb advbVar, View view, int i) {
        this.$cid = i;
        this.a = aczlVar;
        this.b = advbVar;
        this.c = view;
    }

    public jdg(Context context, adhv adhvVar, xgn xgnVar, rpq rpqVar, int i) {
        this.$cid = i;
        context.getClass();
        this.c = context;
        adhvVar.getClass();
        this.b = adhvVar;
        xgnVar.getClass();
        this.a = rpqVar;
    }
}
