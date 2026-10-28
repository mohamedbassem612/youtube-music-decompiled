package defpackage;

import android.os.SystemClock;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yxx extends cqb implements cdm {
    private final zee e;
    private final zec f;
    private final zco g;
    private List h;
    private long i;
    private final long j;
    private final Set k;
    private final zed[] l;

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    public yxx(zee zeeVar, bto btoVar, zco zcoVar, boolean z, long j, int... iArr) {
        Stream stream;
        super(btoVar, iArr);
        this.h = agpi.a;
        this.i = -9223372036854775807L;
        this.e = zeeVar;
        this.f = new zec();
        this.g = zcoVar;
        this.j = j;
        HashSet hashSet = new HashSet();
        this.k = hashSet;
        int[] iArr2 = this.d;
        zed[] zedVarArr = new zed[iArr2.length];
        for (int i = 0; i < iArr2.length; i++) {
            if (btoVar.b(iArr2[i]) != null) {
                bse bseVarB = btoVar.b(iArr2[i]);
                bse bseVarB2 = btoVar.b(iArr2[i]);
                if (z) {
                    stream = Collection.EL.stream(zcoVar.a.A.u);
                } else {
                    yoe yoeVar = zcoVar.b;
                    if (yoeVar instanceof yod) {
                        stream = DesugarArrays.stream(((yod) yoeVar).c);
                    } else {
                        stream = Collection.EL.stream(zcoVar.a.A.u);
                    }
                }
                zed zedVar = new zed(bseVarB, stream.anyMatch(new xdo(bseVarB2, 10)));
                zedVarArr[i] = zedVar;
                if (zedVar.a) {
                    hashSet.add(zedVar.c());
                }
            }
        }
        Arrays.sort(zedVarArr, new aqv(7));
        this.l = zedVarArr;
    }

    private static long i(cpo cpoVar) {
        return cpoVar instanceof zai ? ((zai) cpoVar).i() : cpoVar.l;
    }

    private static long u(cpo cpoVar) {
        return cpoVar instanceof zai ? ((zai) cpoVar).l() : cpoVar.k;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    private final void v(long j, long j2, List list) {
        long j3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (list.isEmpty() && this.h.isEmpty()) {
            j3 = this.i;
            if (j3 != -9223372036854775807L) {
                return;
            }
        } else if (list.size() == this.h.size() && u((cpo) list.get(0)) == ((aawx) this.h.get(0)).a) {
            long jI = i((cpo) list.get(list.size() - 1));
            List list2 = this.h;
            if (jI == ((aawx) list2.get(list2.size() - 1)).b) {
                j3 = this.i;
                if (j3 != -9223372036854775807L && jElapsedRealtime - j3 <= this.j) {
                    return;
                }
            }
        }
        zec zecVar = this.f;
        zecVar.a = list.size();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cpo cpoVar = (cpo) it.next();
            bse bseVar = cpoVar.h;
            zed zedVar = new zed(bseVar, this.k.contains(bseVar.a));
            long jU = u(cpoVar);
            long jI2 = i(cpoVar);
            byi byiVar = cpoVar.f;
            cpoVar.h();
            arrayList.add(new aawx(zedVar, jU, jI2));
        }
        this.h = arrayList;
        this.i = jElapsedRealtime;
        this.e.a(arrayList, j, j2, this.l, zecVar);
    }

    @Override // defpackage.cdm
    public final void A(int i, Object obj) {
        if (obj != null) {
            if (i == 10001) {
                this.e.e((zkj) obj);
                return;
            }
            if (i == 10002) {
                this.e.d((yog) obj);
            } else if (i == 10003) {
                this.e.c(((Float) obj).floatValue());
            } else if (i == 10005) {
                this.e.b((wiu) obj);
            }
        }
    }

    @Override // defpackage.cqb, defpackage.cqs
    public final int e(long j, List list) {
        long jMax = 0;
        if (!list.isEmpty()) {
            jMax = Math.max(0L, i((cpo) list.get(list.size() - 1)) - Math.max(j, u((cpo) list.get(0))));
        }
        v(j, jMax, list);
        return this.f.a;
    }

    @Override // defpackage.cqs
    public final int f() {
        bse bseVar;
        zed zedVar = this.f.c;
        if (zedVar instanceof zed) {
            bse bseVar2 = zedVar.c;
            bseVar = zedVar.b;
        } else {
            bseVar = null;
        }
        if (bseVar != null) {
            return a(bseVar);
        }
        return 0;
    }

    @Override // defpackage.cqs
    public final int g() {
        return this.f.b;
    }

    @Override // defpackage.cqs
    public final Object h() {
        yus yusVar = this.f.d;
        if (yusVar == null) {
            yusVar = yus.a;
        }
        return this.g.a(yusVar);
    }

    @Override // defpackage.cqs
    public final void m(long j, long j2, long j3, List list, cpq[] cpqVarArr) {
        v(j, j2, list);
    }
}
