package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lcr extends gdb implements lcs {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ lff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcr(lff lffVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.a = atomicReference;
        this.b = lffVar;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        lfn lfnVar = (lfn) gdc.a(parcel, lfn.CREATOR);
        gdc.b(parcel);
        a(lfnVar);
        return true;
    }

    @Override // defpackage.lcs
    public final void a(lfn lfnVar) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            this.b.aT().k.b("[sgtm] Got upload batches from service. count", Integer.valueOf(lfnVar.a.size()));
            atomicReference.set(lfnVar);
            atomicReference.notifyAll();
        }
    }
}
