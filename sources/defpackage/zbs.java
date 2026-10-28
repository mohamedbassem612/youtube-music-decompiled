package defpackage;

import android.util.SparseIntArray;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbs extends cqb {
    private final cqs e;
    private final aghp f;

    public zbs(cqs cqsVar, int[] iArr, int[] iArr2) {
        int length;
        bse[] bseVarArr = new bse[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bseVarArr[i] = cqsVar.d().b(iArr[i]);
        }
        bto btoVar = new bto("", bseVarArr);
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            sparseIntArray.put(iArr[i2], i2);
        }
        int[] iArr3 = new int[iArr2.length];
        int i3 = 0;
        while (true) {
            length = iArr2.length;
            if (i3 >= length) {
                break;
            }
            iArr3[i3] = sparseIntArray.get(iArr2[i3]);
            i3++;
        }
        super(btoVar, iArr3);
        zkf.a(length > 0);
        boolean z = length <= cqsVar.q();
        zkf.b(z, "length." + length + ";parent." + cqsVar.q());
        this.e = cqsVar;
        this.f = new agjo(length);
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            int iP = cqsVar.p(iArr2[i4]);
            if (iP == -1) {
                throw new IllegalArgumentException("trackNotInParent." + iArr2[i4]);
            }
            aghp aghpVar = this.f;
            Integer numValueOf = Integer.valueOf(iP);
            if (aghpVar.containsKey(numValueOf)) {
                throw new IllegalArgumentException("duplicate." + iArr2[i4]);
            }
            ((agjo) this.f).g(numValueOf, Integer.valueOf(i4), false);
        }
    }

    private final int i(int i) {
        aghp aghpVar = this.f;
        Integer num = (Integer) aghpVar.a().get(Integer.valueOf(i));
        aghpVar.a();
        num.getClass();
        return num.intValue();
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final int e(long j, List list) {
        return this.e.e(j, list);
    }

    @Override // defpackage.cqs
    public final int f() {
        Integer num = (Integer) this.f.get(Integer.valueOf(this.e.f()));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.cqs
    public final int g() {
        return this.e.g();
    }

    @Override // defpackage.cqs
    public final Object h() {
        return this.e.h();
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final void l(float f) {
        this.e.l(f);
    }

    @Override // defpackage.cqs
    public final void m(long j, long j2, long j3, List list, cpq[] cpqVarArr) {
        this.e.m(j, j2, j3, list, cpqVarArr);
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final boolean r(int i, long j) {
        try {
            return this.e.r(i(i), j);
        } catch (NullPointerException e) {
            zvp.b(zvn.b, zvm.f, "Illegal index in SplitTrackSelection.excludeTrack.", e);
            return false;
        }
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final boolean s(int i, long j) {
        try {
            return this.e.s(i(i), j);
        } catch (NullPointerException e) {
            zvp.b(zvn.b, zvm.f, "Illegal index in SplitTrackSelection.isTrackExcluded.", e);
            return true;
        }
    }
}
