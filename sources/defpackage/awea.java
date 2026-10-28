package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awea extends AtomicReference implements Runnable, avni {
    private static final long serialVersionUID = -4552101107598366241L;
    final awec a;
    avmn b;
    long c;
    boolean d;
    boolean e;

    public awea(awec awecVar) {
        this.a = awecVar;
    }

    @Override // defpackage.avni
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        avmn avmnVar = (avmn) obj;
        avnr.g(this, avmnVar);
        awec awecVar = this.a;
        synchronized (awecVar) {
            if (this.e) {
                ((avnu) awecVar.a).kr(avmnVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this);
    }
}
