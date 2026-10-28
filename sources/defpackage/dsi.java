package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dsi extends dsa {
    private int A;
    private dsa[] B;
    ArrayList w;
    int x;
    boolean y;
    private boolean z;

    public dsi(byte[] bArr) {
        this();
        P(1);
        O(new drp(2));
        O(new drn());
        O(new drp(1));
    }

    private final void S(dsa dsaVar) {
        this.w.add(dsaVar);
        dsaVar.f = this;
    }

    private final void T(dsa[] dsaVarArr) {
        Arrays.fill(dsaVarArr, (Object) null);
        this.B = dsaVarArr;
    }

    private final dsa[] U() {
        dsa[] dsaVarArr = this.B;
        this.B = null;
        if (dsaVarArr == null) {
            dsaVarArr = new dsa[this.w.size()];
        }
        return (dsa[]) this.w.toArray(dsaVarArr);
    }

    @Override // defpackage.dsa
    public final boolean A() {
        for (int i = 0; i < this.w.size(); i++) {
            if (((dsa) this.w.get(i)).A()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dsa
    public final /* bridge */ /* synthetic */ void G(View view) {
        for (int i = 0; i < this.w.size(); i++) {
            ((dsa) this.w.get(i)).G(view);
        }
        super.G(view);
    }

    @Override // defpackage.dsa
    public final /* bridge */ /* synthetic */ void H(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.w) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dsa) this.w.get(i)).H(j);
        }
    }

    @Override // defpackage.dsa
    public final void J() {
        this.A |= 2;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((dsa) this.w.get(i)).J();
        }
    }

    @Override // defpackage.dsa
    public final /* synthetic */ void K(long j) {
        this.a = j;
    }

    @Override // defpackage.dsa
    public final void L(wg wgVar) {
        this.s = wgVar;
        this.A |= 8;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((dsa) this.w.get(i)).L(wgVar);
        }
    }

    @Override // defpackage.dsa
    public final void M(wg wgVar) {
        super.M(wgVar);
        this.A |= 4;
        if (this.w != null) {
            for (int i = 0; i < this.w.size(); i++) {
                ((dsa) this.w.get(i)).M(wgVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // defpackage.dsa
    public final void N(ViewGroup viewGroup, kwq kwqVar, kwq kwqVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j;
        long j2 = this.a;
        int size = this.w.size();
        int i = 0;
        while (i < size) {
            dsa dsaVar = (dsa) this.w.get(i);
            if (j2 > 0) {
                if (this.z) {
                    j = dsaVar.a;
                    if (j > 0) {
                        dsaVar.K(j + j2);
                    } else {
                        dsaVar.K(j2);
                    }
                } else if (i == 0) {
                    i = 0;
                    j = dsaVar.a;
                    if (j > 0) {
                        dsaVar.K(j + j2);
                    } else {
                        dsaVar.K(j2);
                    }
                }
            }
            dsaVar.N(viewGroup, kwqVar, kwqVar2, arrayList, arrayList2);
            i++;
        }
    }

    public final void O(dsa dsaVar) {
        S(dsaVar);
        long j = this.b;
        if (j >= 0) {
            dsaVar.H(j);
        }
        if ((this.A & 1) != 0) {
            dsaVar.I(this.c);
        }
        if ((this.A & 2) != 0) {
            dsaVar.J();
        }
        if ((this.A & 4) != 0) {
            dsaVar.M(this.t);
        }
        if ((this.A & 8) != 0) {
            dsaVar.L(this.s);
        }
    }

    public final void P(int i) {
        this.z = i == 0;
    }

    @Override // defpackage.dsa
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void E(View view) {
        for (int i = 0; i < this.w.size(); i++) {
            ((dsa) this.w.get(i)).E(view);
        }
        super.E(view);
    }

    @Override // defpackage.dsa
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void I(TimeInterpolator timeInterpolator) {
        this.A |= 1;
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dsa) this.w.get(i)).I(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.dsa
    public final void b(dsk dskVar) {
        if (C(dskVar.b)) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dsa dsaVar = (dsa) arrayList.get(i);
                if (dsaVar.C(dskVar.b)) {
                    dsaVar.b(dskVar);
                    dskVar.c.add(dsaVar);
                }
            }
        }
    }

    @Override // defpackage.dsa
    public final void c(dsk dskVar) {
        if (C(dskVar.b)) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dsa dsaVar = (dsa) arrayList.get(i);
                if (dsaVar.C(dskVar.b)) {
                    dsaVar.c(dskVar);
                    dskVar.c.add(dsaVar);
                }
            }
        }
    }

    @Override // defpackage.dsa
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // defpackage.dsa
    public final boolean d() {
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            if (!((dsa) this.w.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.w.size();
    }

    public final dsa g(int i) {
        if (i < 0 || i >= this.w.size()) {
            return null;
        }
        return (dsa) this.w.get(i);
    }

    @Override // defpackage.dsa
    /* JADX INFO: renamed from: i */
    public final dsa clone() {
        dsi dsiVar = (dsi) super.clone();
        dsiVar.w = new ArrayList();
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            dsiVar.S(((dsa) this.w.get(i)).clone());
        }
        return dsiVar;
    }

    @Override // defpackage.dsa
    public final String m(String str) {
        String strM = super.m(str);
        for (int i = 0; i < this.w.size(); i++) {
            strM = strM + '\n' + ((dsa) this.w.get(i)).m(str.concat("  "));
        }
        return strM;
    }

    @Override // defpackage.dsa
    public final void n() {
        super.n();
        dsa[] dsaVarArrU = U();
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            dsaVarArrU[i].n();
        }
        T(dsaVarArrU);
    }

    @Override // defpackage.dsa
    public final void o(dsk dskVar) {
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((dsa) this.w.get(i)).o(dskVar);
        }
    }

    @Override // defpackage.dsa
    public final void t(View view) {
        super.t(view);
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((dsa) this.w.get(i)).t(view);
        }
    }

    @Override // defpackage.dsa
    public final void u() {
        this.p = 0L;
        dsg dsgVar = new dsg(this);
        for (int i = 0; i < this.w.size(); i++) {
            dsa dsaVar = (dsa) this.w.get(i);
            dsaVar.D(dsgVar);
            dsaVar.u();
            long j = dsaVar.p;
            boolean z = this.z;
            long j2 = this.p;
            if (z) {
                this.p = Math.max(j2, j);
            } else {
                dsaVar.r = j2;
                this.p = j2 + j;
            }
        }
    }

    @Override // defpackage.dsa
    public final void v() {
        for (int i = 0; i < this.w.size(); i++) {
            ((dsa) this.w.get(i)).v();
        }
    }

    @Override // defpackage.dsa
    public final void w(View view) {
        super.w(view);
        dsa[] dsaVarArrU = U();
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            dsaVarArrU[i].w(view);
        }
        T(dsaVarArrU);
    }

    @Override // defpackage.dsa
    protected final void x() {
        ArrayList arrayList;
        if (this.w.isEmpty()) {
            z();
            r();
            return;
        }
        dsh dshVar = new dsh(this);
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((dsa) arrayList2.get(i)).D(dshVar);
        }
        this.x = this.w.size();
        if (this.z) {
            ArrayList arrayList3 = this.w;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((dsa) arrayList3.get(i2)).x();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.w.size();
            arrayList = this.w;
            if (i3 >= size3) {
                break;
            }
            ((dsa) arrayList.get(i3 - 1)).D(new dsf((dsa) this.w.get(i3)));
            i3++;
        }
        dsa dsaVar = (dsa) arrayList.get(0);
        if (dsaVar != null) {
            dsaVar.x();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean, int] */
    @Override // defpackage.dsa
    public final void y(long j, long j2) {
        long j3;
        int size;
        long j4 = this.p;
        long j5 = 0;
        if (this.f != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        ?? r10 = i >>> 31;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.l = false;
            super.s(this, drz.a, r10);
        }
        if (!this.z) {
            int i2 = 1;
            while (true) {
                int size2 = this.w.size();
                ArrayList arrayList = this.w;
                if (i2 >= size2) {
                    j3 = j5;
                    size = arrayList.size() - 1;
                    break;
                }
                j3 = j5;
                if (((dsa) arrayList.get(i2)).r > j2) {
                    size = i2 - 1;
                    break;
                } else {
                    i2++;
                    j5 = j3;
                }
            }
            if (i < 0) {
                while (size >= 0) {
                    dsa dsaVar = (dsa) this.w.get(size);
                    long j6 = dsaVar.r;
                    long j7 = j - j6;
                    dsaVar.y(j7, j2 - j6);
                    if (j7 >= j3) {
                        break;
                    } else {
                        size--;
                    }
                }
            } else {
                while (size < this.w.size()) {
                    dsa dsaVar2 = (dsa) this.w.get(size);
                    long j8 = dsaVar2.r;
                    long j9 = j - j8;
                    if (j9 < j3) {
                        break;
                    }
                    dsaVar2.y(j9, j2 - j8);
                    size++;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.w.size(); i3++) {
                ((dsa) this.w.get(i3)).y(j, j2);
            }
            j3 = 0;
        }
        if (this.f != null) {
            if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                return;
            }
            if (j > j4) {
                this.l = true;
            }
            super.s(this, drz.b, r10);
        }
    }

    public dsi() {
        this.w = new ArrayList();
        this.z = true;
        this.y = false;
        this.A = 0;
    }
}
