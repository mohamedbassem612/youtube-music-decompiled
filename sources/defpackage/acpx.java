package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpx extends awpk implements awqk {
    final /* synthetic */ zwa a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ acsj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acpx(acsj acsjVar, zwa zwaVar, String str, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.d = acsjVar;
        this.a = zwaVar;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new acpx(this.d, this.a, this.b, this.c, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((acpx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        this.d.f(this.a, this.b, this.c);
        return awmy.a;
    }
}
