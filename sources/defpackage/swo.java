package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swo implements adme {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    private final Object f;

    public swo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, int i, byte[] bArr) {
        this.$cid = i;
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
        this.f = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
        this.b = awmdVar6;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.adme
    public final /* synthetic */ adma a(ViewGroup viewGroup) {
        int i = this.$cid;
        if (i == 0) {
            Context context = (Context) this.a.io();
            context.getClass();
            adhv adhvVar = (adhv) this.b.io();
            adhvVar.getClass();
            vxe vxeVar = (vxe) this.c.io();
            vxeVar.getClass();
            aduv aduvVar = (aduv) this.d.io();
            aduvVar.getClass();
            afip afipVar = (afip) this.e.io();
            afipVar.getClass();
            ((tsv) this.f.io()).getClass();
            viewGroup.getClass();
            return new swp(context, adhvVar, vxeVar, aduvVar, afipVar, viewGroup);
        }
        ?? r1 = this.c;
        if (i != 1) {
            ?? r4 = this.a;
            Object obj = this.d;
            return new aemr((Context) r1, r4, (ci) obj, this.f, (aeki) this.b, this.e);
        }
        cf cfVar = (cf) r1.io();
        cfVar.getClass();
        afip afipVar2 = (afip) this.e.io();
        afipVar2.getClass();
        vxe vxeVar2 = (vxe) this.a.io();
        vxeVar2.getClass();
        aduv aduvVar2 = (aduv) this.f.io();
        aduvVar2.getClass();
        adhv adhvVar2 = (adhv) this.d.io();
        adhvVar2.getClass();
        adyr adyrVar = (adyr) this.b.io();
        adyrVar.getClass();
        viewGroup.getClass();
        return new swn(cfVar, afipVar2, vxeVar2, aduvVar2, adhvVar2, adyrVar, viewGroup);
    }

    public swo(Context context, vxe vxeVar, ci ciVar, xgn xgnVar, Runnable runnable, aeki aekiVar, int i) {
        this.$cid = i;
        this.c = context;
        this.a = vxeVar;
        this.d = ciVar;
        this.f = xgnVar;
        this.e = runnable;
        this.b = aekiVar;
    }

    public swo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, int i) {
        this.$cid = i;
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        this.f = awmdVar6;
    }
}
