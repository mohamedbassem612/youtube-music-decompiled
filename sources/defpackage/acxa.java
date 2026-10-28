package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acxa implements adzv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acxa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adzv
    public final Map a() {
        if (this.$cid != 0) {
            HashMap map = new HashMap();
            sui suiVar = (sui) this.a;
            map.put("pause_subscription_resume_time_ms_key", Long.valueOf(((aqxa) suiVar.j.d.get(suiVar.k)).e));
            return map;
        }
        acxb acxbVar = (acxb) this.a;
        Object obj = acxbVar.f;
        if (obj != null) {
            return xhd.h(obj, true);
        }
        return acxbVar.j.l(194, 45857927L, false) ? agkj.j(xhd.c, Boolean.TRUE) : agpn.b;
    }
}
