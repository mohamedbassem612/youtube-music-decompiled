package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class axfg implements awql {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ axfg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [awqg, java.lang.Object] */
    @Override // defpackage.awql
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            boolean z = awuv.a;
            axfi axfiVar = (axfi) this.a;
            axfiVar.a.c(null);
            axfiVar.c();
            return awmy.a;
        }
        if (i == 1) {
            this.a.invoke((Throwable) obj);
            return awmy.a;
        }
        ((axfm) this.a).h();
        return awmy.a;
    }
}
