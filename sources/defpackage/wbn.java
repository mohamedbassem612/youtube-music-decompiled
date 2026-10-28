package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ContextObserver;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wbn extends ContextObserver {
    final /* synthetic */ ContextObserver a;
    final /* synthetic */ wbo b;

    public wbn(wbo wboVar, ContextObserver contextObserver) {
        this.a = contextObserver;
        this.b = wboVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ContextObserver
    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext) {
        this.b.a = transactionRecord.endState();
        return this.a.storeDidUpdate(byteStore, transactionRecord, transactionContextOuterClass$TransactionContext);
    }
}
