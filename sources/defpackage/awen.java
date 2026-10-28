package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awen extends awko implements avnu {
    static final awee a = new awel(0);
    final avlu b;
    final AtomicReference c;
    final awee d;
    final avlu e;

    private awen(avlu avluVar, avlu avluVar2, AtomicReference atomicReference, awee aweeVar) {
        this.e = avluVar;
        this.b = avluVar2;
        this.c = atomicReference;
        this.d = aweeVar;
    }

    public static awko b(avlu avluVar, awee aweeVar) {
        AtomicReference atomicReference = new AtomicReference();
        awen awenVar = new awen(new awej(atomicReference, aweeVar), avluVar, atomicReference, aweeVar);
        avnn avnnVar = atqp.m;
        return awenVar;
    }

    public static awko c(avlu avluVar) {
        return b(avluVar, a);
    }

    @Override // defpackage.awko
    public final void a(avni avniVar) {
        awei aweiVar;
        while (true) {
            AtomicReference atomicReference = this.c;
            aweiVar = (awei) atomicReference.get();
            if (aweiVar != null && !aweiVar.f()) {
                break;
            }
            awei aweiVar2 = new awei(this.d.a());
            if (a.av(atomicReference, aweiVar, aweiVar2)) {
                aweiVar = aweiVar2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = aweiVar.f;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            avniVar.a(aweiVar);
            if (z) {
                this.b.ak(aweiVar);
            }
        } catch (Throwable th) {
            if (z) {
                aweiVar.f.compareAndSet(true, false);
            }
            avkz.a(th);
            throw awkh.b(th);
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        this.e.ak(avlwVar);
    }

    @Override // defpackage.avnu
    public final void kr(avmn avmnVar) {
        a.av(this.c, (awei) avmnVar, null);
    }
}
