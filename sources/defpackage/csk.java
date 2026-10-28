package defpackage;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class csk implements crk {
    private final qcb a;

    public csk(qcb qcbVar) {
        this.a = qcbVar;
    }

    @Override // defpackage.crk
    public final yvt gs(crm crmVar, long j, long j2, IOException iOException, int i) {
        this.a.I(iOException);
        return crp.d;
    }

    @Override // defpackage.crk
    public final void gv(crm crmVar, long j, long j2) {
        boolean zB = csm.b();
        qcb qcbVar = this.a;
        if (zB) {
            qcbVar.J();
        } else {
            qcbVar.I(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // defpackage.crk
    public final void gq(crm crmVar, long j, long j2, boolean z) {
    }

    @Override // defpackage.crk
    public final /* synthetic */ void gr(crm crmVar, long j, long j2, int i) {
    }
}
