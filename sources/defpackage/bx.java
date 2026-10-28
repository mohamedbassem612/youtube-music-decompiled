package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bx implements vx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public bx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.vx
    public final /* synthetic */ Object a(Object obj) {
        if (this.$cid == 0) {
            return this.a;
        }
        cc ccVar = (cc) this.a;
        Object obj2 = ccVar.mHost;
        return obj2 instanceof rh ? ((rh) obj2).getActivityResultRegistry() : ccVar.requireActivity().getActivityResultRegistry();
    }
}
