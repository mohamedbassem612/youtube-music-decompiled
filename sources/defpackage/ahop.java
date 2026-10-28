package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahop implements ahrs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ahop(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ahrs
    public final Object a() {
        int i = this.$cid;
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return ahno.d((String) this.a);
        }
        Object obj = ahrv.a;
        return new ahse((ahnr) this.a);
    }
}
