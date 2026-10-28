package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axbj extends axbi {
    public final awzc d;

    public axbj(awzc awzcVar, awou awouVar, int i, int i2) {
        super(awouVar, i, i2);
        this.d = awzcVar;
    }

    @Override // defpackage.axbi
    public final Object a(awyp awypVar, awoq awoqVar) {
        Object objC = c(new axce(awypVar), awoqVar);
        return objC != awox.a ? awmy.a : objC;
    }

    public abstract Object c(awzd awzdVar, awoq awoqVar);

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.axbi, defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) throws Throwable {
        Object objD;
        if (this.b == -3) {
            awou context = awoqVar.getContext();
            awou awouVarA = awup.a(context, this.a);
            if (awrc.c(awouVarA, context)) {
                Object objC = c(awzdVar, awoqVar);
                if (objC == awox.a) {
                    return objC;
                }
            } else {
                ahx ahxVar = awor.j;
                if (awrc.c(awouVarA.get(ahxVar), context.get(ahxVar))) {
                    awou context2 = awoqVar.getContext();
                    Objects.checkIndex(0, 3);
                    if (awzdVar == null || (!(awzdVar instanceof axce) && !(awzdVar instanceof axbz))) {
                        awzdVar = new axch(awzdVar, context2);
                    }
                    Object objN = avkz.n(awouVarA, awzdVar, axea.a(awouVarA), new dmr(this, (awoq) null, 4), awoqVar);
                    if (objN == awox.a) {
                        return objN;
                    }
                } else {
                    objD = axbi.d(this, awzdVar, awoqVar);
                    if (objD == awox.a) {
                        return objD;
                    }
                }
            }
        } else {
            objD = axbi.d(this, awzdVar, awoqVar);
            if (objD == awox.a) {
                return objD;
            }
        }
        return awmy.a;
    }

    @Override // defpackage.axbi
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
