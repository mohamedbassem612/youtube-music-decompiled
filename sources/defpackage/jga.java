package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jga implements adme {
    private final /* synthetic */ int $cid;
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final awmd i;

    public jga(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, int i, byte[] bArr) {
        this.$cid = i;
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.i = awmdVar2;
        awmdVar3.getClass();
        this.h = awmdVar3;
        awmdVar4.getClass();
        this.f = awmdVar4;
        this.a = awmdVar5;
        this.e = awmdVar6;
        awmdVar7.getClass();
        this.d = awmdVar7;
        awmdVar8.getClass();
        this.g = awmdVar8;
        this.c = awmdVar9;
    }

    @Override // defpackage.adme
    public final /* synthetic */ adma a(ViewGroup viewGroup) {
        if (this.$cid != 0) {
            Activity activity = (Activity) this.b.io();
            activity.getClass();
            adhv adhvVar = (adhv) this.i.io();
            adhvVar.getClass();
            afip afipVar = (afip) this.h.io();
            afipVar.getClass();
            vxe vxeVar = (vxe) this.f.io();
            vxeVar.getClass();
            lqa lqaVar = (lqa) this.a.io();
            lqaVar.getClass();
            swh swhVar = (swh) this.e.io();
            swhVar.getClass();
            xgm xgmVar = (xgm) this.d.io();
            xgmVar.getClass();
            adrv adrvVar = (adrv) this.g.io();
            adrvVar.getClass();
            elq elqVar = (elq) this.c.io();
            elqVar.getClass();
            return new swc(activity, adhvVar, afipVar, vxeVar, lqaVar, swhVar, elqVar, xgmVar, adrvVar, viewGroup);
        }
        Context context = (Context) this.a.io();
        context.getClass();
        vxe vxeVar2 = (vxe) this.b.io();
        vxeVar2.getClass();
        viewGroup.getClass();
        izr izrVar = (izr) this.c.io();
        izrVar.getClass();
        jfr jfrVar = (jfr) this.d.io();
        jfrVar.getClass();
        admh admhVar = (admh) this.e.io();
        admhVar.getClass();
        aekn aeknVar = (aekn) this.f.io();
        aeknVar.getClass();
        adhv adhvVar2 = (adhv) this.g.io();
        adhvVar2.getClass();
        ahgb ahgbVar = (ahgb) this.h.io();
        ahgbVar.getClass();
        ((kro) this.i.io()).getClass();
        return new jfz(context, vxeVar2, viewGroup, izrVar, jfrVar, admhVar, aeknVar, adhvVar2, ahgbVar);
    }

    public jga(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, int i) {
        this.$cid = i;
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
        this.h = awmdVar8;
        this.i = awmdVar9;
    }
}
