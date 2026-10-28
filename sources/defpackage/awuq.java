package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awuq extends awom implements awor {
    public static final awon k = new awon(awor.j, new xzn(16));

    public awuq() {
        super(awor.j);
    }

    public abstract void a(awou awouVar, Runnable runnable);

    public awuq e(int i) {
        awrc.ab(i);
        return new axdl(this, i);
    }

    @Override // defpackage.awor
    public final awoq f(awoq awoqVar) {
        return new axda(this, awoqVar);
    }

    public boolean fX(awou awouVar) {
        return true;
    }

    @Override // defpackage.awor
    public final void g(awoq awoqVar) {
        awtr awtrVar = ((axda) awoqVar).f;
        while (awtrVar.a == axdb.b) {
        }
        Object obj = awtrVar.a;
        awud awudVar = obj instanceof awud ? (awud) obj : null;
        if (awudVar != null) {
            awudVar.u();
        }
    }

    @Override // defpackage.awom, defpackage.awos, defpackage.awou
    public final /* bridge */ awos get(awot awotVar) {
        awotVar.getClass();
        if (awotVar instanceof awon) {
            awon awonVar = (awon) awotVar;
            if (awonVar.b(getKey())) {
                awos awosVarA = awonVar.a(this);
                if (awosVarA instanceof awos) {
                    return awosVarA;
                }
            }
        } else if (awor.j == awotVar) {
            return this;
        }
        return null;
    }

    public void i(awou awouVar, Runnable runnable) throws awve {
        try {
            a(awouVar, runnable);
        } catch (Throwable th) {
            throw new awve(th, this, awouVar);
        }
    }

    @Override // defpackage.awom, defpackage.awou
    public final /* bridge */ awou minusKey(awot awotVar) {
        awotVar.getClass();
        if (awotVar instanceof awon) {
            awon awonVar = (awon) awotVar;
            if (!awonVar.b(getKey()) || awonVar.a(this) == null) {
                return this;
            }
        } else if (awor.j != awotVar) {
            return this;
        }
        return awov.a;
    }

    public String toString() {
        return awuw.a(this) + '@' + awuw.b(this);
    }
}
