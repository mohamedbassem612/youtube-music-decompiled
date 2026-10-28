package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ukt implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ukt(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return new ukx((usd) obj, (auhs) this.b, this.a);
        }
        if (i == 1) {
            return Boolean.valueOf(((qnf) this.b).f(this.a, ahnm.FILE));
        }
        if (i == 2) {
            return ((aapa) this.b).i((abpw) obj, this.a);
        }
        if (i == 3) {
            return ((aapa) this.b).i((abpw) obj, this.a);
        }
        if (i == 4) {
            return ((aapa) this.b).i((abpw) obj, this.a);
        }
        atpt atptVar = (atpt) obj;
        aihf builder = atptVar.toBuilder();
        String str = (String) this.b;
        aihf builder2 = abfv.u(atptVar, str).toBuilder();
        builder2.copyOnWrite();
        atps atpsVar = (atps) builder2.instance;
        atpsVar.b |= 2;
        atpsVar.d = this.a;
        builder.cP(str, (atps) builder2.build());
        return (atpt) builder.build();
    }
}
