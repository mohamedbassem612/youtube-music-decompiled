package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class apo extends awpk implements awqk {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ apq c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apo(boolean z, apq apqVar, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.b = z;
        this.c = apqVar;
        this.d = j;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new apo(this.b, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((apo) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            boolean z = this.b;
            apq apqVar = this.c;
            if (z) {
                this.a = 2;
                obj = apqVar.l.a(this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                long j = ((apk) obj).a;
            } else {
                this.a = 1;
                obj = apqVar.l.a(this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                long j2 = ((apk) obj).a;
            }
        } else if (i != 1) {
            long j3 = ((apk) obj).a;
        } else {
            long j4 = ((apk) obj).a;
        }
        return awmy.a;
    }
}
