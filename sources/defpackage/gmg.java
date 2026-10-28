package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gmg implements awqg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ gmj a;
    final /* synthetic */ zwa b;
    final /* synthetic */ awqk c;

    public gmg(gmj gmjVar, zwa zwaVar, awqk awqkVar, int i) {
        this.$cid = i;
        this.a = gmjVar;
        this.b = zwaVar;
        this.c = awqkVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.$cid != 0) {
            obj.getClass();
            awqk awqkVar = this.c;
            zwa zwaVar = this.b;
            gmj gmjVar = this.a;
            return new afkb(afwl.c(new gmf(gmjVar, zwaVar, awqkVar, 1)), gmjVar.d);
        }
        obj.getClass();
        awqk awqkVar2 = this.c;
        zwa zwaVar2 = this.b;
        gmj gmjVar2 = this.a;
        return new afkb(afwl.c(new gmf(gmjVar2, zwaVar2, awqkVar2, 0)), gmjVar2.d);
    }
}
