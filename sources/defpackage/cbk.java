package defpackage;

import android.media.RouteDiscoveryPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cbk implements bvb {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ qcb a;

    public /* synthetic */ cbk(qcb qcbVar, int i) {
        this.$cid = i;
        this.a = qcbVar;
    }

    @Override // defpackage.bvb
    public final void a(Object obj, Object obj2) {
        if (this.$cid == 0) {
            this.a.L(((Boolean) obj2).booleanValue());
        } else {
            RouteDiscoveryPreference routeDiscoveryPreference = cbj.a;
            this.a.L(((Boolean) obj2).booleanValue());
        }
    }
}
