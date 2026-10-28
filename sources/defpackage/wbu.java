package defpackage;

import com.google.android.libraries.elements.interfaces.TransactionCallback;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wbu extends TransactionCallback {
    final /* synthetic */ avpr a;

    public wbu(avpr avprVar) {
        this.a = avprVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.TransactionCallback
    public final void accept(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionRecord transactionRecord) {
        this.a.a();
    }
}
