package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfn extends awpk implements awqg {
    Object a;
    int b;
    final /* synthetic */ awrk c;
    final /* synthetic */ bfp d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    final /* synthetic */ bft g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfn(awrk awrkVar, bfp bfpVar, bft bftVar, Object obj, boolean z, awoq awoqVar) {
        super(1, awoqVar);
        this.c = awrkVar;
        this.d = bfpVar;
        this.g = bftVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bfn(this.c, this.d, this.g, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bfn) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        int iHashCode;
        awox awoxVar = awox.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                atqp.j(obj);
            } else {
                obj2 = this.a;
                atqp.j(obj);
            }
            if (this.f) {
                bfp bfpVar = this.d;
                obj3 = this.e;
                if (obj3 != null) {
                    iHashCode = obj3.hashCode();
                } else {
                    iHashCode = 0;
                }
                bfpVar.g.i(new bdw(obj3, iHashCode, this.c.a));
            }
            return awmy.a;
        }
        atqp.j(obj);
        obj2 = this.c;
        ayq ayqVarN = this.d.n();
        this.a = obj2;
        this.b = 1;
        Integer num = new Integer(((AtomicInteger) ((ci) ayqVarN.a).a).incrementAndGet());
        if (num == awoxVar) {
            return awoxVar;
        }
        obj = num;
        ((awrk) obj2).a = ((Number) obj).intValue();
        bft bftVar = this.g;
        Object obj4 = this.e;
        this.a = null;
        this.b = 2;
        bftVar.b();
        Object objE = azu.e(bftVar.a, new bga(bftVar, obj4, null), this);
        if (objE != awoxVar) {
            objE = awmy.a;
        }
        if (objE == awoxVar) {
            return awoxVar;
        }
        if (this.f) {
            bfp bfpVar2 = this.d;
            obj3 = this.e;
            if (obj3 != null) {
                iHashCode = obj3.hashCode();
            } else {
                iHashCode = 0;
            }
            bfpVar2.g.i(new bdw(obj3, iHashCode, this.c.a));
        }
        return awmy.a;
    }
}
