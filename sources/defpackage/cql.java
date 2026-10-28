package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cql extends bts {
    public static final cql K = new cql(new cqk());
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final SparseArray aa;
    public final SparseBooleanArray ab;

    static {
        int i = bwp.a;
    }

    public cql(cqk cqkVar) {
        super(cqkVar);
        this.L = cqkVar.w;
        this.M = false;
        this.N = cqkVar.x;
        this.O = false;
        this.P = cqkVar.y;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = cqkVar.z;
        this.V = cqkVar.A;
        this.W = cqkVar.B;
        this.X = false;
        this.Y = cqkVar.C;
        this.Z = false;
        this.aa = cqkVar.D;
        this.ab = cqkVar.E;
    }

    @Override // defpackage.bts
    public final /* synthetic */ btr a() {
        return new cqk(this);
    }

    public final boolean b(int i) {
        return this.ab.get(i);
    }

    @Override // defpackage.bts
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cql cqlVar = (cql) obj;
            if (super.equals(cqlVar) && this.L == cqlVar.L && this.N == cqlVar.N && this.P == cqlVar.P && this.U == cqlVar.U && this.V == cqlVar.V && this.W == cqlVar.W && this.Y == cqlVar.Y) {
                SparseBooleanArray sparseBooleanArray = this.ab;
                SparseBooleanArray sparseBooleanArray2 = cqlVar.ab;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.aa;
                    SparseArray sparseArray2 = cqlVar.aa;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        coy coyVar = (coy) entry.getKey();
                                        if (!map2.containsKey(coyVar) || !Objects.equals(entry.getValue(), map2.get(coyVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bts
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.L ? 1 : 0)) * 961) + (this.N ? 1 : 0)) * 961) + (this.P ? 1 : 0)) * 28629151) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 961) + (this.Y ? 1 : 0)) * 31;
    }
}
