package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vpj implements adxa {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vpj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, voa] */
    @Override // defpackage.adxa
    public final void a(acjx acjxVar) {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i != 0) {
            r1.ac(acjxVar);
            return;
        }
        voa voaVar = ((vpk) r1).h;
        voaVar.getClass();
        voaVar.ac(acjxVar);
    }
}
