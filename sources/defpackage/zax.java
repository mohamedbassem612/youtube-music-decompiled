package defpackage;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zax extends zbb {
    final Set a;
    final zaw b;

    public zax(Set set, zaw zawVar) {
        this.a = set;
        this.b = zawVar;
    }

    @Override // defpackage.zbb, defpackage.cwj
    public final void c(bwb bwbVar, int i) {
        try {
            Set set = this.a;
            cxt cxtVarC = cxu.c(bwbVar);
            ywx ywxVar = (set.isEmpty() || set.contains(cxtVarC.a)) ? new ywx(cxtVarC.a, ywx.e(new bwb(cxtVarC.e))) : null;
            if (ywxVar != null) {
                this.b.j(ywxVar);
            }
        } catch (IOException e) {
            this.b.k(e);
        }
    }
}
