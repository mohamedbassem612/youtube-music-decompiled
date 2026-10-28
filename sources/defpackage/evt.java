package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evt implements ffw {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public evt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [axr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [axr, java.lang.Object] */
    @Override // defpackage.ffw
    public final /* synthetic */ Object a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            tgr tgrVar = (tgr) obj;
            return new evl((kmm) tgrVar.c, tgrVar.b);
        }
        jnj jnjVar = (jnj) obj;
        Object obj2 = jnjVar.a;
        Object obj3 = jnjVar.f;
        Object obj4 = jnjVar.b;
        Object obj5 = jnjVar.c;
        return new evx((exs) obj2, (exs) obj3, (exs) obj4, (aerj) obj5, (aerj) jnjVar.e, jnjVar.d);
    }
}
