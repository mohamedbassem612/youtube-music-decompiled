package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addw extends mhp {
    private final xeu a;

    public addw(xeu xeuVar) {
        this.a = xeuVar;
    }

    @Override // defpackage.mhp
    public final aigw a() {
        return amtr.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        boolean zB;
        try {
            alou alouVar = ((amtr) aihn.parseFrom(amtr.a, bArr, ExtensionRegistryLite.a)).c;
            if (alouVar == null) {
                alouVar = alou.a;
            }
            xeu xeuVar = this.a;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(alouVar, alot.a(alouVar.c));
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                zB = true;
            } else {
                zB = xeuVar.b(alouVar);
            }
            aihf aihfVarCreateBuilder = amts.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amts amtsVar = (amts) aihfVarCreateBuilder.instance;
            amtsVar.b |= 1;
            amtsVar.c = zB;
            return StatusOr.fromValue(((amts) aihfVarCreateBuilder.build()).toByteArray());
        } catch (aiik e) {
            return StatusOr.fromStatus(Status.d.c(e));
        }
    }
}
