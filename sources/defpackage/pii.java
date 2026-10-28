package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pii extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ pit b;
    final /* synthetic */ pig c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pii(pit pitVar, pig pigVar, String str, int i, int i2, int i3, awoq awoqVar, int i4) {
        super(2, awoqVar);
        this.$cid = i4;
        this.b = pitVar;
        this.c = pigVar;
        this.d = str;
        this.g = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new pii(this.b, this.c, this.d, this.e, this.f, this.g, awoqVar, 1, null) : new pii(this.b, this.c, this.d, this.g, this.e, this.f, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((pii) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pii) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid != 0) {
            awox awoxVar = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i != 0) {
                return obj;
            }
            pit pitVar = this.b;
            pig pigVar = this.c;
            String str = this.d;
            int i2 = this.e;
            int i3 = this.f;
            int i4 = this.g;
            this.a = 1;
            Object objL = pitVar.l(pigVar.a, str, i2, i3, pigVar.c, pigVar.b, i4, this);
            return objL == awoxVar ? awoxVar : objL;
        }
        awox awoxVar2 = awox.a;
        int i5 = this.a;
        atqp.j(obj);
        if (i5 == 0) {
            pit pitVar2 = this.b;
            pig pigVar2 = this.c;
            pij pijVar = new pij(pitVar2, pigVar2, this.d, this.e, this.f, (awoq) null, 1);
            this.a = 1;
            obj = pit.j(pigVar2.c, pigVar2.b, pijVar, this);
            if (obj == awoxVar2) {
                return awoxVar2;
            }
        }
        pit pitVar3 = this.b;
        pky pkyVar = (pky) obj;
        String packageName = pitVar3.b.getPackageName();
        packageName.getClass();
        pitVar3.p(packageName, this.d, this.g, pkyVar.i(), "FILE");
        return pkyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pii(pit pitVar, pig pigVar, String str, int i, int i2, int i3, awoq awoqVar, int i4, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i4;
        this.b = pitVar;
        this.c = pigVar;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }
}
