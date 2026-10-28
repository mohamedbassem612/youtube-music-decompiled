package defpackage;

import j$.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rsv implements wny {
    private final vyo a;
    private final ruv b;

    public rsv(ruv ruvVar, vyo vyoVar) {
        this.b = ruvVar;
        this.a = vyoVar;
    }

    @Override // defpackage.wny
    public final void a(wnz wnzVar) {
        aigj aigjVar;
        if (afxw.e(this.a).cx) {
            String str = wnzVar.b;
            ruv ruvVar = this.b;
            Boolean bool = null;
            if (ahno.aa(str)) {
                rmp rmpVar = ruvVar.e;
                rmp.n(null, "Failed to get AdsFeedMutationContext for empty cpn");
                aigjVar = aigj.d;
            } else {
                aigjVar = (aigj) ConcurrentMap.EL.getOrDefault(ruvVar.a, str, aigj.d);
            }
            if (ahno.aa(str)) {
                rmp rmpVar2 = ruvVar.e;
                rmp.n(null, "Failed to get isTopFeedAnAdOverride for empty cpn");
            } else {
                bool = (Boolean) ruvVar.b.get(str);
            }
            if (!aigjVar.E()) {
                aigjVar.getClass();
                wnzVar.P = aigjVar;
            }
            if (bool != null) {
                wnzVar.Q = bool;
            }
        }
    }
}
