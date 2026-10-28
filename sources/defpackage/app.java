package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class app extends awpk implements awqk {
    int a;
    final /* synthetic */ apq b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public app(apq apqVar, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.b = apqVar;
        this.c = j;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new app(this.b, this.c, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((app) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            apq apqVar = this.b;
            this.a = 1;
            if (apqVar.l.b(this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
