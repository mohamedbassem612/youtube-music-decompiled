package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avwk extends avnb implements avnu {
    public static final /* synthetic */ int e = 0;
    final avlh b;
    final AtomicReference c;
    final axso d;

    public avwk(axso axsoVar, avlh avlhVar, AtomicReference atomicReference) {
        this.d = axsoVar;
        this.b = avlhVar;
        this.c = atomicReference;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        this.d.aq(axspVar);
    }

    @Override // defpackage.avnb
    public final void e(avni avniVar) {
        avwi avwiVar;
        while (true) {
            AtomicReference atomicReference = this.c;
            avwiVar = (avwi) atomicReference.get();
            if (avwiVar != null && !avwiVar.f()) {
                break;
            }
            try {
                avwi avwiVar2 = new avwi(new avwj());
                if (a.av(atomicReference, avwiVar, avwiVar2)) {
                    avwiVar = avwiVar2;
                    break;
                }
            } catch (Throwable th) {
                avkz.a(th);
                throw awkh.b(th);
            }
        }
        AtomicBoolean atomicBoolean = avwiVar.e;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            avniVar.a(avwiVar);
            if (z) {
                this.b.ap(avwiVar);
            }
        } catch (Throwable th2) {
            if (z) {
                avwiVar.e.compareAndSet(true, false);
            }
            avkz.a(th2);
            throw awkh.b(th2);
        }
    }

    @Override // defpackage.avnu
    public final void kr(avmn avmnVar) {
        a.av(this.c, (avwi) avmnVar, null);
    }
}
