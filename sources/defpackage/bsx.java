package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsx {
    public final bsw[] a;
    public final long b;

    public bsx(List list) {
        this(-9223372036854775807L, (bsw[]) list.toArray(new bsw[0]));
    }

    private static final bsw g(bsw bswVar, Class cls, agex agexVar) {
        if (cls.isAssignableFrom(bswVar.getClass())) {
            bsw bswVar2 = (bsw) cls.cast(bswVar);
            if (agexVar.a(bswVar2)) {
                return bswVar2;
            }
        }
        return null;
    }

    public final int a() {
        return this.a.length;
    }

    public final bsw b(int i) {
        return this.a[i];
    }

    public final bsw c(Class cls, agex agexVar) {
        for (bsw bswVar : this.a) {
            bsw bswVarG = g(bswVar, cls, agexVar);
            if (bswVarG != null) {
                return bswVarG;
            }
        }
        return null;
    }

    public final bsx d(bsw... bswVarArr) {
        int length = bswVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.b;
        bsw[] bswVarArr2 = this.a;
        int i = bwp.a;
        int length2 = bswVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(bswVarArr2, length2 + length);
        System.arraycopy(bswVarArr, 0, objArrCopyOf, length2, length);
        return new bsx(j, (bsw[]) objArrCopyOf);
    }

    public final bsx e(bsx bsxVar) {
        return bsxVar != null ? d(bsxVar.a) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bsx bsxVar = (bsx) obj;
            if (Arrays.equals(this.a, bsxVar.a) && this.b == bsxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final agke f(Class cls, agex agexVar) {
        agjz agjzVar = new agjz(4);
        for (bsw bswVar : this.a) {
            bsw bswVarG = g(bswVar, cls, agexVar);
            if (bswVarG != null) {
                agjzVar.h(bswVarG);
            }
        }
        return agjzVar.g();
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + a.ak(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "entries=" + Arrays.toString(this.a) + (j == -9223372036854775807L ? "" : a.bS(j, ", presentationTimeUs="));
    }

    public bsx(long j, bsw... bswVarArr) {
        this.b = j;
        this.a = bswVarArr;
    }
}
