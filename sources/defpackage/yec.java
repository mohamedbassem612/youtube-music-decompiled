package defpackage;

import java.util.Enumeration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yec extends awpj implements awqk {
    int a;
    final /* synthetic */ Enumeration b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yec(Enumeration enumeration, awoq awoqVar) {
        super(2, awoqVar);
        this.b = enumeration;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        yec yecVar = new yec(this.b, awoqVar);
        yecVar.c = obj;
        return yecVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((yec) create((awsz) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awsz awszVar;
        Object objNextElement;
        awox awoxVar = awox.a;
        if (this.a != 0) {
            awszVar = (awsz) this.c;
            atqp.j(obj);
        } else {
            atqp.j(obj);
            awszVar = (awsz) this.c;
        }
        do {
            Enumeration enumeration = this.b;
            if (!enumeration.hasMoreElements()) {
                return awmy.a;
            }
            objNextElement = enumeration.nextElement();
            this.c = awszVar;
            this.a = 1;
        } while (awszVar.a(objNextElement, this) != awoxVar);
        return awoxVar;
    }
}
