package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjp extends awpk implements awqg {
    int a;
    final /* synthetic */ pjv b;
    final /* synthetic */ pot c;
    final /* synthetic */ pcv d;
    final /* synthetic */ String e;
    final /* synthetic */ atr f;
    final /* synthetic */ pzp g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjp(pjv pjvVar, pot potVar, pcv pcvVar, String str, atr atrVar, pzp pzpVar, boolean z, awoq awoqVar) {
        super(1, awoqVar);
        this.b = pjvVar;
        this.c = potVar;
        this.d = pcvVar;
        this.e = str;
        this.f = atrVar;
        this.g = pzpVar;
        this.h = z;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pjp(this.b, this.c, this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pjp) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        pjv pjvVar = this.b;
        pot potVar = this.c;
        pcv pcvVar = this.d;
        String str = this.e;
        atr atrVar = this.f;
        pzp pzpVar = this.g;
        boolean z = this.h;
        this.a = 1;
        Object objN = pjvVar.n(potVar, pcvVar, str, atrVar, pzpVar, z, this);
        return objN == awoxVar ? awoxVar : objN;
    }
}
