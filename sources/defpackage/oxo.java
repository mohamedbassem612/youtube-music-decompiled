package defpackage;

import android.content.Context;
import com.google.android.libraries.multiplatform.elements.ElementsException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oxo implements owj {
    public final Set b = ahng.aj();
    private final boolean c;

    public oxo(boolean z) {
        this.c = z;
    }

    @Override // defpackage.owj
    public final void a(Context context, atiq atiqVar, atiq atiqVar2, atiq atiqVar3, kjc kjcVar, int i, int i2, oxp oxpVar, oui ouiVar) {
        otx otxVarD;
        try {
            otxVarD = oty.d(context, atiqVar, atiqVar2, atiqVar3, kjcVar, i, i2, this.c);
        } catch (ElementsException e) {
            ouiVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, "Error creating image request.", e);
            otxVarD = null;
        }
        if (otxVarD != null) {
            oxm oxmVar = new oxm(atiqVar, oxpVar, i, i2, oty.b(atiqVar.aX()), ouiVar);
            otxVarD.a.q(oxmVar);
            fdx fdxVar = oxmVar.c;
            if (fdxVar == null) {
                ouiVar.a(aslh.LOG_TYPE_INTERNAL_ERROR, "Unexpected null requester");
            } else {
                this.b.add(fdxVar);
            }
        }
    }
}
