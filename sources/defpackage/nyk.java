package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nyk extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Boolean a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nxw b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nsl c;

    public nyk() {
        super("LazilyConvertedElementSize");
    }

    private static final nyj aE(fhd fhdVar) {
        return (nyj) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        nyj nyjVarAE = aE(fhdVar);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        nyjVarAE.b = atomicReference;
        nyjVarAE.a = atomicReference2;
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        nyj nyjVarAE = aE(fhdVar);
        Boolean bool = this.a;
        AtomicReference atomicReference = nyjVarAE.b;
        if (bool != null) {
            bool.booleanValue();
            atomicReference.set(null);
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        nyj nyjVar = (nyj) fkyVar;
        nyj nyjVar2 = (nyj) fkyVar2;
        nyjVar2.a = nyjVar.a;
        nyjVar2.b = nyjVar.b;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
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
    protected final fgy aD(fhd fhdVar, int i, int i2) {
        nyj nyjVarAE = aE(fhdVar);
        nxw nxwVar = this.b;
        nsl nslVar = this.c;
        AtomicReference atomicReference = nyjVarAE.b;
        AtomicReference atomicReference2 = nyjVarAE.a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (atomicReference2.get() == null || ((WeakReference) atomicReference2.get()).get() != nxwVar) {
            atomicReference2.set(new WeakReference(nxwVar));
            atomicReference.set(null);
        }
        fgy fgyVar = (fgy) atomicReference.get();
        if (fgyVar != null) {
            return fgyVar;
        }
        nsk nskVar = new nsk(nslVar);
        nskVar.a = Integer.valueOf(size);
        nskVar.b = Integer.valueOf(size2);
        fgy fgyVarA = nxwVar.a(fhdVar, nskVar.a());
        atomicReference.set(fgyVarA);
        return fgyVarA;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new nyj();
    }
}
