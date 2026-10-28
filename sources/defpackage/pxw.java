package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pxw implements pxs {
    private final agom a;
    private final Map b;

    public pxw(agom agomVar, Map map) {
        this.a = agomVar;
        this.b = map;
    }

    @Override // defpackage.pxs
    public final /* synthetic */ Map a() {
        agkh agkhVar = new agkh(4);
        b(agkhVar);
        return agkhVar.d(true);
    }

    @Override // defpackage.pxs
    public final void b(agkh agkhVar) {
        agom agomVar = this.a;
        if (!agomVar.w()) {
            for (Object obj : agomVar.q()) {
                obj.getClass();
                String str = (String) obj;
                agkhVar.e(new pxo(str), new pxj(atqq.aw(((aghk) agomVar).c(str)), null));
            }
        }
        Map map = this.b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                pxm pxmVar = (pxm) entry.getValue();
                agkhVar.e(new pxl(str2), new pxj(pxmVar.a, pxmVar.b));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pxw) {
            pxw pxwVar = (pxw) obj;
            if (awrc.c(this.a, pxwVar.a) && awrc.c(this.b, pxwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "GnpSignedInRegistrationData(gaiaAccounts=" + this.a + ", delegatedGaiaAccounts=" + this.b + ')';
    }
}
