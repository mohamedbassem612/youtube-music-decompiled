package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class noz extends FaultObserver {
    final /* synthetic */ npb a;

    public noz(npb npbVar) {
        this.a = npbVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final Status storeDidFault(ByteStore byteStore, String str) {
        aihf aihfVarCreateBuilder = assh.a.createBuilder();
        aijp aijpVarB = npi.b();
        aihfVarCreateBuilder.copyOnWrite();
        assh asshVar = (assh) aihfVarCreateBuilder.instance;
        aijpVarB.getClass();
        asshVar.e = aijpVarB;
        asshVar.b |= 1;
        aihf aihfVarCreateBuilder2 = asse.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asse asseVar = (asse) aihfVarCreateBuilder2.instance;
        str.getClass();
        asseVar.b |= 1;
        asseVar.c = str;
        asse asseVar2 = (asse) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        assh asshVar2 = (assh) aihfVarCreateBuilder.instance;
        asseVar2.getClass();
        asshVar2.d = asseVar2;
        asshVar2.c = 8;
        ((DebuggerClient) this.a.d.io()).sendTimelineEvent(((assh) aihfVarCreateBuilder.build()).toByteArray());
        return Status.OK;
    }
}
