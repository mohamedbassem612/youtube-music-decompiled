package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bew extends awpk implements awqg {
    int a;
    int b;
    final /* synthetic */ bfp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bew(bfp bfpVar, awoq awoqVar) {
        super(1, awoqVar);
        this.c = bfpVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bew(this.c, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bew) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        int i;
        Throwable th;
        bgg bggVar;
        awox awoxVar = awox.a;
        int i2 = this.b;
        if (i2 == 0) {
            atqp.j(obj);
            bfp bfpVar = this.c;
            if (bfpVar.e.b()) {
                ayq ayqVarN = bfpVar.n();
                this.b = 1;
                obj = ayqVarN.h();
                if (obj == awoxVar) {
                    return awoxVar;
                }
                iIntValue = ((Number) obj).intValue();
                bggVar = this.c.f;
                this.a = iIntValue;
                this.b = 4;
                if (bggVar.a(this) == awoxVar) {
                    return awoxVar;
                }
                return awmy.a;
            }
            this.b = 2;
            obj = null;
            bfp bfpVar2 = this.c;
            bev bevVar = new bev(bfpVar2, (dqy) obj, (awoq) null, 0);
            this.b = 3;
            obj = awro.p(((axcw) bfpVar2.c).a, bevVar, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            iIntValue = ((Number) obj).intValue();
            bggVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (bggVar.a(this) == awoxVar) {
                return awoxVar;
            }
            return awmy.a;
        }
        if (i2 == 1) {
            atqp.j(obj);
            iIntValue = ((Number) obj).intValue();
            bggVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (bggVar.a(this) == awoxVar) {
                return awoxVar;
            }
            return awmy.a;
        }
        if (i2 == 2) {
            atqp.j(obj);
            bfp bfpVar3 = this.c;
            bev bevVar2 = new bev(bfpVar3, (dqy) obj, (awoq) null, 0);
            this.b = 3;
            obj = awro.p(((axcw) bfpVar3.c).a, bevVar2, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            iIntValue = ((Number) obj).intValue();
            bggVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (bggVar.a(this) == awoxVar) {
                return awoxVar;
            }
            return awmy.a;
        }
        if (i2 != 3) {
            i = this.a;
            try {
                atqp.j(obj);
                return awmy.a;
            } catch (Throwable th2) {
                th = th2;
                this.c.g.i(new bge(th, i));
                throw th;
            }
        }
        atqp.j(obj);
        iIntValue = ((Number) obj).intValue();
        try {
            bggVar = this.c.f;
            this.a = iIntValue;
            this.b = 4;
            if (bggVar.a(this) == awoxVar) {
                return awoxVar;
            }
            return awmy.a;
        } catch (Throwable th3) {
            i = iIntValue;
            th = th3;
            this.c.g.i(new bge(th, i));
            throw th;
        }
    }
}
