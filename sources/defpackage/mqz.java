package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mqz extends Observer {
    final /* synthetic */ avls a;
    final /* synthetic */ String b;

    public mqz(avls avlsVar, String str) {
        this.a = avlsVar;
        this.b = str;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        this.a.c(agev.h(transactionRecord.endState().find(this.b)));
        return Status.OK;
    }
}
