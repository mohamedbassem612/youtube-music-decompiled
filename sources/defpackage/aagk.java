package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aagk {
    public final SparseArray a;
    public final String b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ aagn e;
    private aamm f;

    public aagk(aagn aagnVar, aaml aamlVar, aaml aamlVar2) {
        String strG;
        this.e = aagnVar;
        SparseArray sparseArray = new SparseArray();
        this.a = sparseArray;
        ahno.G((aamlVar == null && aamlVar2 == null) ? false : true, "One stream pair cannot hold a pair of null streams");
        if (aamlVar != null) {
            sparseArray.put(aamlVar.a(), aamlVar);
        }
        if (aamlVar2 != null) {
            sparseArray.put(aamlVar2.a(), aamlVar2);
            strG = aamlVar2.g();
        } else {
            aguu.ak(aamlVar);
            strG = aamlVar.g();
        }
        this.b = strG;
        this.c = true;
        this.d = false;
    }

    public final aaml a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return null;
            }
            aaml aamlVar = (aaml) sparseArray.valueAt(i);
            if (aamlVar.d) {
                return aamlVar;
            }
            i++;
        }
    }

    public final aaml b(int i) {
        return (aaml) this.a.get(i);
    }

    public final aaml c() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return null;
            }
            aaml aamlVar = (aaml) sparseArray.valueAt(i);
            if (!aamlVar.d) {
                return aamlVar;
            }
            i++;
        }
    }

    public final aamm d() {
        synchronized (this.e.k) {
            aamm aammVar = this.f;
            if (aammVar == null) {
                aaml aamlVarC = c();
                aaml aamlVarA = a();
                if (aamlVarC == null && aamlVarA == null) {
                    return null;
                }
                aamm aammVar2 = new aamm(aamlVarC, aamlVarA, this.c, this.d);
                this.f = aammVar2;
                aammVar = aammVar2;
            }
            return aammVar;
        }
    }

    public final void e() {
        this.f = null;
    }

    public final void f(String str) {
        aagl aaglVar = (aagl) this.e.b.get(str);
        if (aaglVar != null) {
            aaglVar.g();
        }
    }

    public final void g(aaml aamlVar) {
        synchronized (this.e.k) {
            this.a.put(aamlVar.a(), aamlVar);
            e();
            f(this.b);
        }
    }
}
