package defpackage;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dba implements dbd {
    public static final /* synthetic */ int a = 0;
    private static final Comparator b = Comparator$CC.comparingLong(new cpt(4));
    private final agke c;
    private final long[] d;

    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    public dba(List list) {
        int i = ((agpi) list).d;
        if (i == 1) {
            abnx abnxVar = (abnx) aguu.M(list);
            long jD = d(abnxVar.a);
            if (abnxVar.b == -9223372036854775807L) {
                this.c = agke.q(abnxVar.d);
                this.d = new long[]{jD};
                return;
            } else {
                this.c = agke.r(abnxVar.d, agpi.a);
                this.d = new long[]{jD, abnxVar.b + jD};
                return;
            }
        }
        long[] jArr = new long[i << 1];
        this.d = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        agke agkeVarB = agke.B(b, list);
        int i2 = 0;
        for (int i3 = 0; i3 < ((agpi) agkeVarB).d; i3++) {
            abnx abnxVar2 = (abnx) agkeVarB.get(i3);
            long jD2 = d(abnxVar2.a);
            long j = abnxVar2.b + jD2;
            if (i2 != 0) {
                int i4 = i2 - 1;
                long j2 = this.d[i4];
                if (j2 < jD2) {
                    this.d[i2] = jD2;
                    arrayList.add(abnxVar2.d);
                    i2++;
                } else if (j2 == jD2 && ((agke) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, abnxVar2.d);
                } else {
                    bvx.e("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.d[i4] = jD2;
                    arrayList.set(i4, abnxVar2.d);
                }
            } else {
                this.d[i2] = jD2;
                arrayList.add(abnxVar2.d);
                i2++;
            }
            if (abnxVar2.b != -9223372036854775807L) {
                this.d[i2] = j;
                arrayList.add(agpi.a);
                i2++;
            }
        }
        this.c = agke.n(arrayList);
    }

    public static long d(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.dbd
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.dbd
    public final int b(long j) {
        agke agkeVar = this.c;
        int iAl = bwp.al(this.d, j, false);
        if (iAl >= agkeVar.size()) {
            return -1;
        }
        return iAl;
    }

    @Override // defpackage.dbd
    public final long c(int i) {
        ahno.F(i < this.c.size());
        return this.d[i];
    }

    @Override // defpackage.dbd
    public final /* bridge */ /* synthetic */ List e(long j) {
        int iAn = bwp.an(this.d, j, false);
        return iAn == -1 ? agpi.a : (agke) this.c.get(iAn);
    }
}
