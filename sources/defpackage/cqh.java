package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqh extends cqp implements Comparable {
    private final int e;
    private final boolean f;
    private final String g;
    private final cql h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private final int o;
    private final int p;
    private final boolean q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final boolean v;
    private final boolean w;
    private final boolean x;

    public cqh(int i, bto btoVar, int i2, cql cqlVar, int i3, boolean z, Predicate predicate) {
        int i4;
        int iB;
        int i5;
        int iB2;
        boolean z2;
        int iHashCode;
        super(i, btoVar, i2);
        this.h = cqlVar;
        int i6 = 1;
        int i7 = true != cqlVar.U ? 16 : 24;
        boolean z3 = cqlVar.Q;
        this.g = cqr.e(this.d.d);
        this.i = aub.e(i3, false);
        int i8 = 0;
        while (true) {
            agke agkeVar = cqlVar.r;
            int i9 = ((agpi) agkeVar).d;
            i4 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i8 >= i9) {
                iB = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iB = cqr.b(this.d, (String) agkeVar.get(i8), false);
                if (iB > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.k = i8;
        this.j = iB;
        int i10 = this.d.f;
        int i11 = cqlVar.t;
        this.l = cqr.c(i10, 0);
        this.m = cqr.a(this.d, cqlVar.s);
        bse bseVar = this.d;
        int i12 = bseVar.f;
        this.n = i12 == 0 || (i12 & 1) != 0;
        this.q = 1 == (bseVar.e & 1);
        String str = bseVar.q;
        this.x = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        this.r = bseVar.I;
        this.s = bseVar.K;
        this.t = bseVar.k;
        int i13 = bseVar.k;
        this.f = (i13 == -1 || i13 <= cqlVar.v) && ((i5 = bseVar.I) == -1 || i5 <= cqlVar.u) && predicate.test(bseVar);
        int i14 = bwp.a;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            strArrSplit[i15] = bwp.R(strArrSplit[i15]);
        }
        int i16 = 0;
        while (true) {
            if (i16 >= strArrSplit.length) {
                iB2 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iB2 = cqr.b(this.d, strArrSplit[i16], false);
                if (iB2 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.o = i16;
        this.p = iB2;
        int i17 = 0;
        while (true) {
            agke agkeVar2 = cqlVar.w;
            if (i17 >= ((agpi) agkeVar2).d) {
                break;
            }
            String str2 = this.d.q;
            if (str2 != null && str2.equals(agkeVar2.get(i17))) {
                i4 = i17;
                break;
            }
            i17++;
        }
        this.u = i4;
        this.v = (i3 & 384) == 128;
        this.w = (i3 & 64) == 64;
        cql cqlVar2 = this.h;
        if (aub.e(i3, cqlVar2.W) && ((z2 = this.f) || cqlVar2.P)) {
            int i18 = cqlVar2.x.b;
            if (aub.e(i3, false) && z2 && this.d.k != -1) {
                boolean z4 = cqlVar2.H;
                boolean z5 = cqlVar2.G;
                if ((cqlVar2.Y || !z) && (i3 & i7) != 0) {
                    i6 = 2;
                }
            }
        } else {
            i6 = 0;
        }
        this.e = i6;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cqh cqhVar) {
        boolean z = this.f;
        Comparator comparatorReversed = (z && this.i) ? cqr.a : Comparator$EL.reversed(cqr.a);
        agil agilVarD = agil.b.e(this.i, cqhVar.i).d(Integer.valueOf(this.k), Integer.valueOf(cqhVar.k), Comparator$CC.reverseOrder()).b(this.j, cqhVar.j).b(this.l, cqhVar.l).d(Integer.valueOf(this.m), Integer.valueOf(cqhVar.m), Comparator$CC.reverseOrder()).e(this.q, cqhVar.q).e(this.n, cqhVar.n).d(Integer.valueOf(this.o), Integer.valueOf(cqhVar.o), Comparator$CC.reverseOrder()).b(this.p, cqhVar.p).e(z, cqhVar.f).d(Integer.valueOf(this.u), Integer.valueOf(cqhVar.u), Comparator$CC.reverseOrder());
        boolean z2 = this.h.G;
        agil agilVarD2 = agilVarD.e(this.v, cqhVar.v).e(this.w, cqhVar.w).e(this.x, cqhVar.x).d(Integer.valueOf(this.r), Integer.valueOf(cqhVar.r), comparatorReversed).d(Integer.valueOf(this.s), Integer.valueOf(cqhVar.s), comparatorReversed);
        if (Objects.equals(this.g, cqhVar.g)) {
            agilVarD2 = agilVarD2.d(Integer.valueOf(this.t), Integer.valueOf(cqhVar.t), comparatorReversed);
        }
        return agilVarD2.a();
    }

    @Override // defpackage.cqp
    public final int b() {
        return this.e;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean c(cqp cqpVar) {
        String str;
        cql cqlVar = this.h;
        cqh cqhVar = (cqh) cqpVar;
        boolean z = cqlVar.S;
        bse bseVar = this.d;
        int i = bseVar.I;
        if (i != -1) {
            bse bseVar2 = cqhVar.d;
            if (i == bseVar2.I && (str = bseVar.q) != null && TextUtils.equals(str, bseVar2.q)) {
                boolean z2 = cqlVar.R;
                int i2 = bseVar.K;
                if (i2 != -1 && i2 == bseVar2.K) {
                    boolean z3 = cqlVar.T;
                    if (this.v == cqhVar.v && this.w == cqhVar.w) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
