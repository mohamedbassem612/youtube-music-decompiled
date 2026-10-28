package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avvw extends avnb {
    public static final /* synthetic */ int f = 0;
    public final avlh b;
    final AtomicReference c;
    public final int d;
    final axso e;

    public avvw(axso axsoVar, avlh avlhVar, AtomicReference atomicReference, int i) {
        this.e = axsoVar;
        this.b = avlhVar;
        this.c = atomicReference;
        this.d = i;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        this.e.aq(axspVar);
    }

    @Override // defpackage.avnb
    public final void e(avni avniVar) {
        avvv avvvVar;
        while (true) {
            AtomicReference atomicReference = this.c;
            avvvVar = (avvv) atomicReference.get();
            if (avvvVar != null && !avvvVar.f()) {
                break;
            }
            avvv avvvVar2 = new avvv(atomicReference, this.d);
            if (a.av(atomicReference, avvvVar, avvvVar2)) {
                avvvVar = avvvVar2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = avvvVar.f;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            avniVar.a(avvvVar);
            if (z) {
                this.b.ap(avvvVar);
            }
        } catch (Throwable th) {
            avkz.a(th);
            throw awkh.b(th);
        }
    }
}
