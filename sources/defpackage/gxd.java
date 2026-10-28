package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxd extends gut {
    private final awmd a;
    private final awmd b;

    public gxd(awmd awmdVar, awmd awmdVar2) {
        this.a = awmdVar;
        this.b = awmdVar2;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Long l;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apcb apcbVar = (apcb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (apcbVar.g.size() > 0) {
            ((vwx) this.b.io()).d(apcbVar.g, map);
        }
        if (map == null || !(map.get("local_queue_item_uid") instanceof Long) || (l = (Long) map.get("local_queue_item_uid")) == null) {
            return;
        }
        ico icoVar = (ico) this.a.io();
        long jLongValue = l.longValue();
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            agrx agrxVar = agso.a;
            ahng.x(icoVar.p.e(ajwoVar, MoreExecutors.directExecutor()), afwl.g(new iec(icoVar, jLongValue, 1)), icoVar.b);
        }
    }
}
