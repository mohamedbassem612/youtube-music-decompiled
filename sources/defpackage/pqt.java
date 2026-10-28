package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class pqt extends awpk implements awqg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ pqu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqt(pqu pquVar, awoq awoqVar) {
        super(1, awoqVar);
        this.d = pquVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pqt(this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pqt) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object awrmVar;
        Object obj2;
        Object obj3;
        awox awoxVar = awox.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                obj3 = this.a;
                atqp.j(obj);
            } else {
                Object obj4 = this.b;
                Object obj5 = this.a;
                atqp.j(obj);
                obj2 = obj4;
                awrmVar = obj5;
            }
            return ((awrm) obj3).a;
        }
        atqp.j(obj);
        awrmVar = new awrm();
        pqu pquVar = this.d;
        this.a = awrmVar;
        this.b = awrmVar;
        this.c = 1;
        obj = pquVar.c(this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        obj2 = awrmVar;
        String str = ((pym) obj).k;
        str.getClass();
        ((awrm) obj2).a = str;
        awrm awrmVar2 = (awrm) awrmVar;
        if (((CharSequence) awrmVar2.a).length() == 0) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            awrmVar2.a = string;
            bec becVar = (bec) this.d.b.io();
            pbs pbsVar = new pbs(awrmVar2, (awoq) null, 2);
            this.a = awrmVar;
            this.b = null;
            this.c = 2;
            if (becVar.a(pbsVar, this) == awoxVar) {
                return awoxVar;
            }
        }
        obj3 = awrmVar;
        return ((awrm) obj3).a;
    }
}
