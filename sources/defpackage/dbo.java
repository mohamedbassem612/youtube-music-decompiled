package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dbo implements cvk {
    private final cvk a;
    private final dbl b;
    private final SparseArray c = new SparseArray();
    private boolean d;

    public dbo(cvk cvkVar, dbl dblVar) {
        this.a = cvkVar;
        this.b = dblVar;
    }

    @Override // defpackage.cvk
    public final cwj s(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.d = true;
        }
        if (i2 != 3) {
            return this.a.s(i, i2);
        }
        SparseArray sparseArray = this.c;
        dbq dbqVar = (dbq) sparseArray.get(i);
        if (dbqVar != null) {
            return dbqVar;
        }
        dbq dbqVar2 = new dbq(this.a.s(i, 3), this.b);
        sparseArray.put(i, dbqVar2);
        return dbqVar2;
    }

    @Override // defpackage.cvk
    public final void t() {
        this.a.t();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ((dbq) sparseArray.valueAt(i)).d = true;
            i++;
        }
    }

    @Override // defpackage.cvk
    public final void z(cvz cvzVar) {
        this.a.z(cvzVar);
    }
}
