package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class noy extends Observer {
    final /* synthetic */ npb a;

    public noy(npb npbVar) {
        this.a = npbVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        aihf aihfVarG = npb.g(transactionRecord.endState(), transactionRecord.keys());
        aihfVarG.copyOnWrite();
        asrx asrxVar = (asrx) aihfVarG.instance;
        asrx asrxVar2 = asrx.a;
        asrxVar.b |= 2;
        asrxVar.d = true;
        aijp aijpVarB = npi.b();
        aihfVarG.copyOnWrite();
        asrx asrxVar3 = (asrx) aihfVarG.instance;
        aijpVarB.getClass();
        asrxVar3.e = aijpVarB;
        asrxVar3.b |= 4;
        this.a.e((asrx) aihfVarG.build());
        return Status.OK;
    }
}
