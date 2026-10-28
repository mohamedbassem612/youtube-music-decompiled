package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pob {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public pob(cdr[] cdrVarArr, cqs[] cqsVarArr, btu btuVar, Object obj) {
        int length = cdrVarArr.length;
        if (length != cqsVarArr.length) {
            throw new IllegalArgumentException();
        }
        this.d = cdrVarArr;
        this.e = (cqs[]) cqsVarArr.clone();
        this.b = btuVar;
        this.c = obj;
        this.a = length;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, pun] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, pwl] */
    public final pnz a(Throwable th) {
        return new poc(this.b, null, null, th, (pls) this.c, this.a, this.d, this.e);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, pun] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, pwl] */
    public final pnz b(ahyy ahyyVar) {
        return new poc(this.b, null, ahyyVar, null, (pls) this.c, this.a, this.d, this.e);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, pun] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, pwl] */
    public final pnz c(ahzv ahzvVar) {
        return new poc(this.b, ahzvVar, null, null, (pls) this.c, this.a, this.d, this.e);
    }

    public final boolean d(int i) {
        return ((cdr[]) this.d)[i] != null;
    }

    public final boolean e(pob pobVar, int i) {
        return pobVar != null && Objects.equals(((cdr[]) this.d)[i], ((cdr[]) pobVar.d)[i]) && Objects.equals(((cqs[]) this.e)[i], ((cqs[]) pobVar.e)[i]);
    }

    public pob(mbc mbcVar, pls plsVar, int i, pun punVar, pwl pwlVar) {
        mbcVar.getClass();
        plsVar.getClass();
        punVar.getClass();
        pwlVar.getClass();
        this.b = mbcVar;
        this.c = plsVar;
        this.a = i;
        this.d = punVar;
        this.e = pwlVar;
    }
}
