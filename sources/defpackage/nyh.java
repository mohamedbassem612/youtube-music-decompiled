package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyh extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Boolean a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxw b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public mqd d;

    public nyh() {
        super("LazilyConvertedElement");
    }

    public static nyf aE(fhd fhdVar) {
        return new nyf(fhdVar, new nyh());
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        nyg nygVar = (nyg) fhdVar.i().c;
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        nygVar.b = atomicReference;
        nygVar.a = atomicReference2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        nyg nygVar = (nyg) fhdVar.i().c;
        Boolean bool = this.a;
        mqd mqdVar = this.d;
        AtomicReference atomicReference = nygVar.b;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        atomicReference.set(null);
        if (mqdVar != null) {
            Object obj = mqdVar.b;
            ?? r1 = mqdVar.a;
            synchronized (r1) {
                avmm avmmVar = (avmm) r1.remove(obj);
                if (avmmVar != null) {
                    avmmVar.dispose();
                }
            }
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        nyg nygVar = (nyg) fkyVar;
        nyg nygVar2 = (nyg) fkyVar2;
        nygVar2.a = nygVar.a;
        nygVar2.b = nygVar.b;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        nyg nygVar = (nyg) fhdVar.i().c;
        nxw nxwVar = this.b;
        nsl nslVar = this.c;
        AtomicReference atomicReference = nygVar.b;
        AtomicReference atomicReference2 = nygVar.a;
        if (atomicReference2.get() == null || ((WeakReference) atomicReference2.get()).get() != nxwVar) {
            atomicReference2.set(new WeakReference(nxwVar));
            atomicReference.set(null);
        }
        fgy fgyVar = (fgy) atomicReference.get();
        if (fgyVar != null) {
            return fgyVar;
        }
        fgy fgyVarA = nxwVar.a(fhdVar, nslVar);
        atomicReference.set(fgyVarA);
        return fgyVarA;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new nyg();
    }
}
