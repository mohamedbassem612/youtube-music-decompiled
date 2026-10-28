package defpackage;

import com.google.android.libraries.elements.interfaces.ResponseHydrationDelegate;
import io.grpc.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbg extends ResponseHydrationDelegate {
    private final nuc a;
    private final boolean b;

    public adbg(nuc nucVar, boolean z) {
        this.a = nucVar;
        this.b = z;
    }

    @Override // com.google.android.libraries.elements.interfaces.ResponseHydrationDelegate
    public final void onHydrationErrorWithIdentifiers(ArrayList arrayList, String str) {
        if (this.b) {
            String strS = arrayList.isEmpty() ? "no identifiers" : a.S(arrayList);
            nuc nucVar = this.a;
            aihf aihfVarCreateBuilder = asnc.a.createBuilder();
            aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
            asncVar.d = aslhVar.I;
            asncVar.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
            asncVar2.b |= 32;
            asncVar2.i = strS;
            nucVar.b((asnc) aihfVarCreateBuilder.build(), str, new Object[0]);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ResponseHydrationDelegate
    public final void onHydrationErrorWithStatus(Status status, String str) {
        if (this.b) {
            aihf aihfVarCreateBuilder = asnb.a.createBuilder();
            int iValue = status.getCode().value();
            aihfVarCreateBuilder.copyOnWrite();
            asnb asnbVar = (asnb) aihfVarCreateBuilder.instance;
            asnbVar.b |= 1;
            asnbVar.c = iValue;
            if (!ahno.aa(status.getDescription())) {
                String description = status.getDescription();
                aihfVarCreateBuilder.copyOnWrite();
                asnb asnbVar2 = (asnb) aihfVarCreateBuilder.instance;
                description.getClass();
                asnbVar2.b |= 2;
                asnbVar2.d = description;
            }
            nuc nucVar = this.a;
            aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
            aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
            aihfVarCreateBuilder2.copyOnWrite();
            asnc asncVar = (asnc) aihfVarCreateBuilder2.instance;
            asncVar.d = aslhVar.I;
            asncVar.b |= 2;
            asnb asnbVar3 = (asnb) aihfVarCreateBuilder.build();
            aihfVarCreateBuilder2.copyOnWrite();
            asnc asncVar2 = (asnc) aihfVarCreateBuilder2.instance;
            asnbVar3.getClass();
            asncVar2.j = asnbVar3;
            asncVar2.b |= 64;
            nucVar.b((asnc) aihfVarCreateBuilder2.build(), str, new Object[0]);
        }
    }
}
