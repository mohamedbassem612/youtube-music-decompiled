package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zaf implements agrg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ zaf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.agrg
    public final Object a() {
        int i = this.$cid;
        Object obj = this.a;
        return i != 0 ? Integer.valueOf(System.identityHashCode(obj) % 100) : yvq.c(((zah) obj).c);
    }
}
