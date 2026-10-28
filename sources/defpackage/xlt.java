package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xlt implements yeb {
    final /* synthetic */ yeb a;
    final /* synthetic */ xly b;

    public xlt(xly xlyVar, yeb yebVar) {
        this.a = yebVar;
        this.b = xlyVar;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        this.a.a(iOException);
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        if (tgoVar.a == 200) {
            this.b.k++;
        }
        this.a.b(tgoVar);
    }
}
