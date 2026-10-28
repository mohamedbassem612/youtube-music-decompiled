package defpackage;

import android.util.SparseArray;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class des implements dem {
    final /* synthetic */ deu a;
    private final dqp b = new dqp(new byte[4], (byte[]) null);

    public des(deu deuVar) {
        this.a = deuVar;
    }

    @Override // defpackage.dem
    public final void a(bwb bwbVar) {
        if (bwbVar.n() != 0 || (bwbVar.n() & SemanticState.Focused) == 0) {
            return;
        }
        bwbVar.Q(6);
        int iD = bwbVar.d() / 4;
        for (int i = 0; i < iD; i++) {
            dqp dqpVar = this.b;
            bwbVar.T(dqpVar, 4);
            int i2 = dqpVar.i(16);
            dqpVar.s(3);
            if (i2 == 0) {
                dqpVar.s(13);
            } else {
                int i3 = dqpVar.i(13);
                deu deuVar = this.a;
                SparseArray sparseArray = deuVar.b;
                if (sparseArray.get(i3) == null) {
                    sparseArray.put(i3, new den(new det(deuVar, i3)));
                    deuVar.f++;
                }
            }
        }
        this.a.b.remove(0);
    }

    @Override // defpackage.dem
    public final void b(nzd nzdVar, cvk cvkVar, dev devVar) {
    }
}
