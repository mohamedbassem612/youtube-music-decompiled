package defpackage;

import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mfo extends Observer {
    final /* synthetic */ asoz a;
    final /* synthetic */ mbb b;

    public mfo(asoz asozVar, mbb mbbVar) {
        this.a = asozVar;
        this.b = mbbVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        byte[] bArrFindNoCopy = transactionRecord.endState().findNoCopy(this.a.b);
        if (bArrFindNoCopy != null) {
            mbb mbbVar = this.b;
            aihf aihfVarCreateBuilder = aspa.a.createBuilder();
            aigj aigjVarV = aigj.v(bArrFindNoCopy);
            aihfVarCreateBuilder.copyOnWrite();
            aspa aspaVar = (aspa) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            aspaVar.b |= 1;
            aspaVar.c = aigjVarV;
            if (!mbbVar.d((aspa) aihfVarCreateBuilder.build())) {
                ((RuntimeStreamWriter) mbbVar).close();
            }
        }
        return Status.OK;
    }
}
