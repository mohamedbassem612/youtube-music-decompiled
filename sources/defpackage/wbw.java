package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import io.grpc.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wbw extends FaultObserver {
    private final WeakReference a;

    public wbw(FaultObserver faultObserver) {
        this.a = new WeakReference(faultObserver);
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final Status storeDidFault(ByteStore byteStore, String str) {
        FaultObserver faultObserver = (FaultObserver) this.a.get();
        return faultObserver != null ? faultObserver.storeDidFault(byteStore, str) : Status.OK;
    }
}
