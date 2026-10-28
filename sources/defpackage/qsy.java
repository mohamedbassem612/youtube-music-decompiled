package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qsy {
    static final Object[] a;
    static final qsy b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new qsy(objArr);
    }

    public qsy(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qsy) {
            qsy qsyVar = (qsy) obj;
            if (this.d == qsyVar.d && Arrays.equals(this.c, qsyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
