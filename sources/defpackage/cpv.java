package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cpv implements cps {
    private final ArrayList a = new ArrayList();

    private final int g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((abnx) arrayList.get(i)).a) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.cps
    public final long a(long j) {
        long j2;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((abnx) arrayList.get(0)).a) {
            return ((abnx) arrayList.get(0)).a;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            j2 = ((abnx) arrayList.get(i)).a;
            if (j < j2) {
                long j3 = ((abnx) arrayList.get(i - 1)).c;
                if (j3 != -9223372036854775807L && j3 > j && j3 < j2) {
                    return j3;
                }
                return j2;
            }
        }
        j2 = ((abnx) aguu.K(arrayList)).c;
        if (j2 == -9223372036854775807L || j >= j2) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // defpackage.cps
    public final long b(long j) {
        long j2;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((abnx) arrayList.get(0)).a) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            j2 = ((abnx) arrayList.get(i)).a;
            if (j != j2) {
                if (j < j2) {
                    abnx abnxVar = (abnx) arrayList.get(i - 1);
                    j2 = abnxVar.c;
                    if (j2 == -9223372036854775807L || j2 > j) {
                        return abnxVar.a;
                    }
                }
            }
            return j2;
        }
        abnx abnxVar2 = (abnx) aguu.K(arrayList);
        j2 = abnxVar2.c;
        if (j2 == -9223372036854775807L || j < j2) {
            return abnxVar2.a;
        }
        return j2;
    }

    @Override // defpackage.cps
    public final agke c(long j) {
        int iG = g(j);
        if (iG == 0) {
            return agpi.a;
        }
        abnx abnxVar = (abnx) this.a.get(iG - 1);
        long j2 = abnxVar.c;
        return (agke) ((j2 == -9223372036854775807L || j < j2) ? abnxVar.d : agpi.a);
    }

    @Override // defpackage.cps
    public final void d() {
        this.a.clear();
    }

    @Override // defpackage.cps
    public final void e(long j) {
        int iG = g(j);
        if (iG != 0) {
            ArrayList arrayList = this.a;
            int i = iG - 1;
            long j2 = ((abnx) arrayList.get(i)).c;
            if (j2 == -9223372036854775807L || j2 >= j) {
                iG = i;
            }
            arrayList.subList(0, iG).clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // defpackage.cps
    public final boolean f(abnx abnxVar, long j) {
        boolean z;
        long j2 = abnxVar.a;
        ahno.F(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = abnxVar.c;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.add(0, abnxVar);
                break;
            }
            if (j2 >= ((abnx) arrayList.get(size)).a) {
                arrayList.add(size + 1, abnxVar);
                break;
            }
            z &= ((abnx) arrayList.get(size)).a > j;
        }
        return z;
    }
}
