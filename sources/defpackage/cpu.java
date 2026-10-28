package defpackage;

import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cpu implements cps {
    public static final /* synthetic */ int a = 0;
    private static final Comparator b = Comparator$EL.thenComparing(Comparator$CC.comparingLong(new cpt(1)), Comparator$EL.reversed(Comparator$CC.comparingLong(new cpt(0))));
    private final List c = new ArrayList();

    @Override // defpackage.cps
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                break;
            }
            long j2 = ((abnx) list.get(i)).a;
            long j3 = ((abnx) list.get(i)).c;
            if (j < j2) {
                if (jMin == -9223372036854775807L) {
                    jMin = j2;
                    break;
                }
                jMin = Math.min(jMin, j2);
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.cps
    public final long b(long j) {
        List list = this.c;
        if (!list.isEmpty()) {
            if (j >= ((abnx) list.get(0)).a) {
                long jMax = ((abnx) list.get(0)).a;
                for (int i = 0; i < list.size(); i++) {
                    long j2 = ((abnx) list.get(i)).a;
                    long j3 = ((abnx) list.get(i)).c;
                    if (j3 <= j) {
                        jMax = Math.max(jMax, j3);
                    } else {
                        if (j2 > j) {
                            return jMax;
                        }
                        jMax = Math.max(jMax, j2);
                    }
                }
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.cps
    public final agke c(long j) {
        List list = this.c;
        if (!list.isEmpty()) {
            if (j >= ((abnx) list.get(0)).a) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    abnx abnxVar = (abnx) list.get(i);
                    long j2 = abnxVar.a;
                    if (j >= j2 && j < abnxVar.c) {
                        arrayList.add(abnxVar);
                    }
                    if (j < j2) {
                        break;
                    }
                }
                agke agkeVarB = agke.B(b, arrayList);
                agjz agjzVar = new agjz(4);
                for (int i2 = 0; i2 < ((agpi) agkeVarB).d; i2++) {
                    agjzVar.j(((abnx) agkeVarB.get(i2)).d);
                }
                return agjzVar.g();
            }
        }
        return agpi.a;
    }

    @Override // defpackage.cps
    public final void d() {
        this.c.clear();
    }

    @Override // defpackage.cps
    public final void e(long j) {
        int i = 0;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                return;
            }
            long j2 = ((abnx) list.get(i)).a;
            if (j > j2 && j > ((abnx) list.get(i)).c) {
                list.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.cps
    public final boolean f(abnx abnxVar, long j) {
        long j2 = abnxVar.a;
        ahno.F(j2 != -9223372036854775807L);
        ahno.F(abnxVar.b != -9223372036854775807L);
        boolean z = j2 <= j && j < abnxVar.c;
        List list = this.c;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                list.add(0, abnxVar);
            }
            return z;
        } while (j2 < ((abnx) list.get(size)).a);
        list.add(size + 1, abnxVar);
        return z;
    }
}
