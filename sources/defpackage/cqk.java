package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqk extends btr {
    public boolean A;
    public boolean B;
    public boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public cqk(cql cqlVar) {
        super(cqlVar);
        this.w = cqlVar.L;
        boolean z = cqlVar.M;
        this.x = cqlVar.N;
        boolean z2 = cqlVar.O;
        this.y = cqlVar.P;
        boolean z3 = cqlVar.Q;
        boolean z4 = cqlVar.R;
        boolean z5 = cqlVar.S;
        boolean z6 = cqlVar.T;
        this.z = cqlVar.U;
        this.A = cqlVar.V;
        this.B = cqlVar.W;
        boolean z7 = cqlVar.X;
        this.C = cqlVar.Y;
        boolean z8 = cqlVar.Z;
        SparseArray sparseArray = cqlVar.aa;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.D = sparseArray2;
        this.E = cqlVar.ab.clone();
    }

    @Override // defpackage.btr
    public final /* synthetic */ bts a() {
        return new cql(this);
    }

    protected final void d(bts btsVar) {
        super.b(btsVar);
    }

    public cqk() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
