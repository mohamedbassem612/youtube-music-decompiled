package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpf implements cvk {
    private static final qha j = new qha();
    public bse[] a;
    private final cvi b;
    private final int c;
    private final bse d;
    private final SparseArray e = new SparseArray();
    private boolean f;
    private cph g;
    private long h;
    private cvz i;

    public cpf(cvi cviVar, int i, bse bseVar) {
        this.b = cviVar;
        this.c = i;
        this.d = bseVar;
    }

    public final cuz a() {
        cvz cvzVar = this.i;
        if (cvzVar instanceof cuz) {
            return (cuz) cvzVar;
        }
        if (cvzVar instanceof cza) {
            return ((cza) cvzVar).a;
        }
        return null;
    }

    public final void b(cph cphVar, long j2, long j3) {
        this.g = cphVar;
        this.h = j3;
        boolean z = this.f;
        cvi cviVar = this.b;
        if (!z) {
            cviVar.b(this);
            if (j2 != -9223372036854775807L) {
                cviVar.d(0L, j2);
            }
            this.f = true;
            return;
        }
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        cviVar.d(0L, j2);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.e;
            if (i >= sparseArray.size()) {
                return;
            }
            ((cpe) sparseArray.valueAt(i)).h(cphVar, j3);
            i++;
        }
    }

    public final void c() {
        this.b.c();
    }

    public final boolean d(cvj cvjVar) {
        int iG = this.b.g(cvjVar, j);
        ahno.O(iG != 1);
        return iG == 0;
    }

    @Override // defpackage.cvk
    public final cwj s(int i, int i2) {
        SparseArray sparseArray = this.e;
        cpe cpeVar = (cpe) sparseArray.get(i);
        if (cpeVar != null) {
            return cpeVar;
        }
        ahno.O(this.a == null);
        cpe cpeVar2 = new cpe(i, i2, i2 == this.c ? this.d : null);
        cpeVar2.h(this.g, this.h);
        sparseArray.put(i, cpeVar2);
        return cpeVar2;
    }

    @Override // defpackage.cvk
    public final void t() {
        SparseArray sparseArray = this.e;
        bse[] bseVarArr = new bse[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            bse bseVar = ((cpe) sparseArray.valueAt(i)).a;
            bseVar.getClass();
            bseVarArr[i] = bseVar;
        }
        this.a = bseVarArr;
    }

    @Override // defpackage.cvk
    public final void z(cvz cvzVar) {
        this.i = cvzVar;
    }
}
