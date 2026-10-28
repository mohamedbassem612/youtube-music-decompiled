package defpackage;

import app.rive.ViewModelInstance;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqf extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqf(adqh adqhVar, ViewModelInstance viewModelInstance, String str, int i, awoq awoqVar, int i2) {
        super(2, awoqVar);
        this.$cid = i2;
        this.d = adqhVar;
        this.e = viewModelInstance;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        Object obj2 = this.d;
        if (i != 0) {
            return new adqf((pqe) obj2, (plx) this.e, this.c, this.b, awoqVar, 1);
        }
        return new adqf((adqh) obj2, (ViewModelInstance) this.e, this.b, this.c, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((adqf) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((adqf) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid == 0) {
            awox awoxVar = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i == 0) {
                Object obj2 = this.d;
                Object obj3 = this.e;
                String str = this.b;
                int i2 = this.c;
                this.a = 1;
                if (adqh.b((adqh) obj2, (ViewModelInstance) obj3, str, i2, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        awox awoxVar2 = awox.a;
        int i3 = this.a;
        atqp.j(obj);
        if (i3 == 0) {
            Object obj4 = this.d;
            Object obj5 = this.e;
            int i4 = this.c;
            String strAr = qnl.ar((plx) obj5, i4, this.b);
            pqe pqeVar = (pqe) obj4;
            pqeVar.a.getApplicationContext().getPackageName();
            new Integer(i4);
            this.a = 1;
            if (pqeVar.b.a(strAr, this) == awoxVar2) {
                return awoxVar2;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqf(pqe pqeVar, plx plxVar, int i, String str, awoq awoqVar, int i2) {
        super(2, awoqVar);
        this.$cid = i2;
        this.d = pqeVar;
        this.e = plxVar;
        this.c = i;
        this.b = str;
    }
}
