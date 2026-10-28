package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ukj implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ukj(auhs auhsVar, ula ulaVar, xsc xscVar, auhs auhsVar2, int i) {
        this.$cid = i;
        this.a = auhsVar;
        this.b = ulaVar;
        this.c = xscVar;
        this.d = auhsVar2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r6v5, types: [awqk, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        if (this.$cid != 0) {
            aawr.a(this.d, new acgt(((aret) obj).c, this.b, 4, (acgv) this.a, ((ieq) this.c).e));
            return awmy.a;
        }
        agke agkeVar = (agke) obj;
        agkeVar.getClass();
        boolean zIsEmpty = agkeVar.isEmpty();
        Object obj2 = this.a;
        if (zIsEmpty) {
            return obj2;
        }
        Object obj3 = this.d;
        Object obj4 = this.c;
        ula ulaVar = (ula) this.b;
        ulaVar.g.n(true);
        return ((xsc) obj4).U(ulaVar, (auhs) obj2, (auhs) obj3, agkeVar);
    }

    public /* synthetic */ ukj(wjf wjfVar, acgv acgvVar, ieq ieqVar, awqk awqkVar, int i) {
        this.$cid = i;
        this.b = wjfVar;
        this.a = acgvVar;
        this.c = ieqVar;
        this.d = awqkVar;
    }
}
