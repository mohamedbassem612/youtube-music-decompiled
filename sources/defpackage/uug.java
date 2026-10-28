package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uug implements utu {
    private final /* synthetic */ int $cid;
    private final Object a;

    public uug(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.utu
    public final utv a(auhs auhsVar) {
        if (this.$cid == 0) {
            return new uus(this.a, 1);
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, utv] */
    @Override // defpackage.utu
    public final /* synthetic */ utv b(auhs auhsVar) {
        return this.$cid != 0 ? this.a : a(auhsVar);
    }
}
