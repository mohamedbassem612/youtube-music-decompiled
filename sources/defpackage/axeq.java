package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axeq implements axsp {
    private final long a;
    private axsq b;
    private final awye c;

    public axeq(int i, int i2, long j) {
        this.a = j;
        this.c = awuw.h(i == 0 ? 1 : i, i2, 4);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.c.u(th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(awoq awoqVar) throws Throwable {
        axep axepVar;
        Object objE;
        if (awoqVar instanceof axep) {
            axepVar = (axep) awoqVar;
            int i = axepVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                axepVar.c = i - Integer.MIN_VALUE;
            } else {
                axepVar = new axep(this, awoqVar);
            }
        } else {
            axepVar = new axep(this, awoqVar);
        }
        Object obj = axepVar.a;
        awox awoxVar = awox.a;
        int i2 = axepVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            awye awyeVar = this.c;
            axepVar.c = 1;
            objE = awyeVar.e(axepVar);
            if (objE == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            objE = ((awyi) obj).b;
        }
        Object obj2 = objE;
        Throwable thA = awyi.a(obj2);
        if (thA != null) {
            throw thA;
        }
        if (!(obj2 instanceof awyh)) {
            return obj2;
        }
        awyi.a(obj2);
        return null;
    }

    @Override // defpackage.axsp
    public final void e(axsq axsqVar) {
        this.b = axsqVar;
        g();
    }

    public final void f() {
        axsq axsqVar = this.b;
        if (axsqVar == null) {
            awrc.b("subscription");
            axsqVar = null;
        }
        axsqVar.kj();
    }

    public final void g() {
        axsq axsqVar = this.b;
        if (axsqVar == null) {
            awrc.b("subscription");
            axsqVar = null;
        }
        axsqVar.ko(this.a);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        awye awyeVar = this.c;
        if (awyeVar.j(obj) instanceof awyh) {
            throw new IllegalArgumentException(a.bZ(awyeVar, obj, "Element ", " was not added to channel because it was full, "));
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.c.u(null);
    }
}
