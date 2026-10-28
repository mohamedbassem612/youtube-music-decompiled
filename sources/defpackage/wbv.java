package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ContextObserver;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import io.grpc.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wbv extends ContextObserver {
    private final WeakReference a;

    public wbv(ContextObserver contextObserver) {
        this.a = new WeakReference(contextObserver);
    }

    @Override // com.google.android.libraries.elements.interfaces.ContextObserver
    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext) {
        ContextObserver contextObserver = (ContextObserver) this.a.get();
        return contextObserver != null ? contextObserver.storeDidUpdate(byteStore, transactionRecord, transactionContextOuterClass$TransactionContext) : Status.OK;
    }
}
