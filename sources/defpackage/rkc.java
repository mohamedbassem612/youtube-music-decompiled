package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rkc implements syk {
    private final zwb a;
    private final rmc b;
    private final vxz c;

    public rkc(zwb zwbVar, rmc rmcVar, vxz vxzVar) {
        this.a = zwbVar;
        this.b = rmcVar;
        this.c = vxzVar;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        if (this.c.l(2, 45357991L, false)) {
            taq.c();
            zwa zwaVarE = this.a.e();
            if (zwaVarE instanceof rlt) {
                rmc rmcVar = this.b;
                rlt rltVar = (rlt) zwaVarE;
                if (rmcVar.j(rltVar.a, false) == null) {
                    rmcVar.d(rltVar);
                }
            }
        }
        return 0;
    }
}
