package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aik implements awut {
    public static final awou a = new ahg();
    private final awou b;
    private final awou c;
    private final Object d = this;
    private volatile awou e;

    public aik(awou awouVar, awou awouVar2) {
        this.b = awouVar;
        this.c = awouVar2;
    }

    @Override // defpackage.awut
    public final awou b() {
        awou awouVarPlus = this.e;
        if (awouVarPlus == null || awouVarPlus == a) {
            awou awouVar = this.b;
            awou aijVar = ((akh) awouVar.get(akh.a)) != null ? new aij(CoroutineExceptionHandler.c) : awov.a;
            synchronized (this.d) {
                awou awouVar2 = this.e;
                if (awouVar2 == null) {
                    awouVarPlus = awouVar.plus(new awwf((awwd) awouVar.get(awwd.d))).plus(this.c).plus(aijVar);
                } else if (awouVar2 == a) {
                    awwf awwfVar = new awwf((awwd) awouVar.get(awwd.d));
                    awwfVar.p(new aht());
                    awouVarPlus = awouVar.plus(awwfVar).plus(this.c).plus(aijVar);
                } else {
                    awouVarPlus = awouVar2;
                }
                this.e = awouVarPlus;
            }
        }
        awouVarPlus.getClass();
        return awouVarPlus;
    }
}
