package defpackage;

import com.google.android.libraries.elements.interfaces.TransactionCallback;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mfn extends TransactionCallback {
    final /* synthetic */ SettableFuture a;

    public mfn(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    @Override // com.google.android.libraries.elements.interfaces.TransactionCallback
    public final void accept(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionRecord transactionRecord) {
        this.a.set(aigv.a);
    }
}
