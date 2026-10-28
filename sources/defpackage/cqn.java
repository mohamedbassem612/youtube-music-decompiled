package defpackage;

import j$.util.Comparator$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cqn extends cqp implements Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;

    public cqn(int i, bto btoVar, int i2, cql cqlVar, int i3, String str, String str2) {
        int iB;
        int i4;
        boolean z;
        super(i, btoVar, i2);
        int i5 = 0;
        this.f = aub.e(i3, false);
        int i6 = this.d.e;
        int i7 = cqlVar.D;
        this.g = 1 == (i6 & 1);
        this.h = (i6 & 2) != 0;
        agke agkeVarQ = str2 != null ? agke.q(str2) : cqlVar.z.isEmpty() ? agke.q("") : cqlVar.z;
        int i8 = 0;
        while (true) {
            if (i8 >= ((agpi) agkeVarQ).d) {
                iB = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            bse bseVar = this.d;
            String str3 = (String) agkeVarQ.get(i8);
            boolean z2 = cqlVar.E;
            iB = cqr.b(bseVar, str3, false);
            if (iB > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.i = i8;
        this.j = iB;
        if (str2 != null) {
            i4 = 1088;
        } else {
            int i9 = cqlVar.B;
            i4 = 0;
        }
        int iC = cqr.c(this.d.f, i4);
        this.k = iC;
        bse bseVar2 = this.d;
        this.n = (bseVar2.f & 1088) != 0;
        int iA = cqr.a(bseVar2, cqlVar.A);
        this.l = iA;
        int iB2 = cqr.b(this.d, str, cqr.e(str) == null);
        this.m = iB2;
        if (iB > 0 || ((cqlVar.z.isEmpty() && iC > 0) || ((cqlVar.z.isEmpty() && iA != Integer.MAX_VALUE) || this.g || (this.h && iB2 > 0)))) {
            z = true;
        } else {
            boolean z3 = cqlVar.y;
            z = false;
        }
        if (aub.e(i3, cqlVar.W) && z) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cqn cqnVar) {
        agil agilVarD = agil.b.e(this.f, cqnVar.f).d(Integer.valueOf(this.i), Integer.valueOf(cqnVar.i), Comparator$CC.reverseOrder());
        int i = this.j;
        agil agilVarB = agilVarD.b(i, cqnVar.j);
        int i2 = this.k;
        agil agilVarB2 = agilVarB.b(i2, cqnVar.k).d(Integer.valueOf(this.l), Integer.valueOf(cqnVar.l), Comparator$CC.reverseOrder()).e(this.g, cqnVar.g).d(Boolean.valueOf(this.h), Boolean.valueOf(cqnVar.h), i == 0 ? Comparator$CC.naturalOrder() : Comparator$CC.reverseOrder()).b(this.m, cqnVar.m);
        if (i2 == 0) {
            agilVarB2 = agilVarB2.f(this.n, cqnVar.n);
        }
        return agilVarB2.a();
    }

    @Override // defpackage.cqp
    public final int b() {
        return this.e;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean c(cqp cqpVar) {
        return false;
    }
}
