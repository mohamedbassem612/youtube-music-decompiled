package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agtp extends agtr {
    public final int[] a;
    public final int b;
    private final agta c;
    private final agta d;

    public agtp(agta agtaVar, agta agtaVar2) {
        int iH;
        this.c = agtaVar;
        this.d = agtaVar2;
        int iB = agtaVar2.b();
        if (iB > 28) {
            throw new IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[iB];
        this.a = iArr;
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            agrx agrxVarE = e(i);
            long j2 = agrxVarE.d | j;
            if (j2 != j || (iH = h(agrxVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = agrxVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(agrx agrxVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (agrxVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.agtr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.agtr
    public final Object b(agrx agrxVar) {
        aguu.f(!agrxVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(agrxVar, iArr, this.b);
        if (iH >= 0) {
            return agrxVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.agtr
    public final Set c() {
        return new agtn(this);
    }

    @Override // defpackage.agtr
    public final void d(agth agthVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            agrx agrxVarE = e(i2 & 31);
            if (agrxVarE.b) {
                agthVar.b(agrxVarE, new agto(this, agrxVarE, i2), obj);
            } else {
                agthVar.a(agrxVarE, agrxVarE.c(f(i2)), obj);
            }
        }
    }

    public final agrx e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
