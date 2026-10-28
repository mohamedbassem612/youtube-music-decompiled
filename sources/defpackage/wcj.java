package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wcj extends FaultObserver {
    final /* synthetic */ wck a;

    public wcj(wck wckVar) {
        this.a = wckVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final Status storeDidFault(ByteStore byteStore, String str) {
        byteStore.getClass();
        str.getClass();
        wck wckVar = this.a;
        wck.q(wckVar.e, wckVar.f.b(str)).kk(str);
        Status status = Status.OK;
        status.getClass();
        return status;
    }
}
