package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hfe extends hfc {
    public hfe(ttm ttmVar, huf hufVar, hpy hpyVar, hpb hpbVar, khn khnVar, tbt tbtVar, awmd awmdVar, Executor executor, vxz vxzVar, vxz vxzVar2, awkv awkvVar, awkv awkvVar2, ajwo ajwoVar, Map map) {
        super(awmdVar, ttmVar, hpbVar, hpyVar, khnVar, hufVar, ajwoVar, map, tbtVar, executor, vxzVar, vxzVar2, awkvVar, awkvVar2);
    }

    @Override // defpackage.tnh
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void a(alri alriVar) {
        String str;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwo ajwoVar = this.d;
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        amla amlaVar = (amla) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        e();
        fhz.x(amlaVar.h, alriVar != null ? alriVar.c : agpi.a, this.e, (vxe) this.a.io(), this.i);
        if (this.j.l(213, 45745584L, false)) {
            d(amlaVar, amlg.DISLIKE);
            return;
        }
        tbt tbtVar = this.f;
        if (f(ajwoVar)) {
            amlh amlhVar = amlaVar.g;
            if (amlhVar == null) {
                amlhVar = amlh.a;
            }
            str = amlhVar.d;
        } else {
            amlh amlhVar2 = amlaVar.g;
            if (amlhVar2 == null) {
                amlhVar2 = amlh.a;
            }
            str = amlhVar2.c;
        }
        amlg amlgVar = amlg.DISLIKE;
        tbtVar.e(new gsg(str, amlgVar));
        d(amlaVar, amlgVar);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.k.h(this.b.b(toeVar));
    }
}
