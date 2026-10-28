package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceListener;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mjn extends DataSourceListener {
    final /* synthetic */ nro a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ nsl c;
    final /* synthetic */ nuc d;
    final /* synthetic */ avmm e;
    final /* synthetic */ AtomicBoolean f;
    final /* synthetic */ AtomicBoolean g;

    public mjn(nro nroVar, AtomicReference atomicReference, nsl nslVar, nuc nucVar, avmm avmmVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.a = nroVar;
        this.b = atomicReference;
        this.c = nslVar;
        this.d = nucVar;
        this.e = avmmVar;
        this.f = atomicBoolean;
        this.g = atomicBoolean2;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onDataChanged() {
        nro nroVar = this.a;
        boolean z = nroVar.e;
        AtomicReference atomicReference = this.b;
        if (z) {
            fof fofVar = (fof) atomicReference.get();
            nsl nslVar = this.c;
            nuc nucVar = this.d;
            avmm avmmVar = this.e;
            int i = mjl.z;
            if (fofVar.A() != null) {
                fofVar.x(new aero(0, new Object[]{nslVar, nucVar, nroVar, avmmVar}), "updateState:DataDrivenCollectionSection.onDataChangedStateUpdate");
            }
        } else {
            fof fofVar2 = (fof) atomicReference.get();
            nsl nslVar2 = this.c;
            nuc nucVar2 = this.d;
            avmm avmmVar2 = this.e;
            int i2 = mjl.z;
            if (fofVar2.A() != null) {
                fofVar2.z(new aero(0, new Object[]{nslVar2, nucVar2, nroVar, avmmVar2}), "updateState:DataDrivenCollectionSection.onDataChangedStateUpdate");
            }
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onError(Status status) {
        this.f.set(false);
        if (this.g.compareAndSet(true, false)) {
            fof fofVar = (fof) this.b.get();
            status.asException();
            foh.l(fofVar, 4);
        }
        this.d.f(aslh.LOG_TYPE_INTERNAL_ERROR, this.c, status.asException(), "Error loading data from CollectionDataSource.", new Object[0]);
        return Status.OK;
    }
}
