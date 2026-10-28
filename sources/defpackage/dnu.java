package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnu extends awpk implements awqg {
    int a;
    final /* synthetic */ dnv b;
    final /* synthetic */ dmz c;
    final /* synthetic */ awqk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnu(dnv dnvVar, dmz dmzVar, awqk awqkVar, awoq awoqVar) {
        super(1, awoqVar);
        this.b = dnvVar;
        this.c = dmzVar;
        this.d = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new dnu(this.b, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((dnu) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        dnv dnvVar = this.b;
        dmz dmzVar = this.c;
        awqk awqkVar = this.d;
        this.a = 1;
        Object objC = dnvVar.c(dmzVar, awqkVar, this);
        return objC == awoxVar ? awoxVar : objC;
    }
}
