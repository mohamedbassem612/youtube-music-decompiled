package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wcc extends FaultObserver {
    final /* synthetic */ wcd a;

    public wcc(wcd wcdVar) {
        this.a = wcdVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final Status storeDidFault(ByteStore byteStore, String str) {
        wcd wcdVar = this.a;
        wcd.q(wcdVar.d, wcdVar.e.b(str)).kk(str);
        return Status.OK;
    }
}
