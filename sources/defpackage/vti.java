package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vti extends ept {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public vti(boolean z, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vti)) {
            return false;
        }
        vti vtiVar = (vti) obj;
        return this.a == vtiVar.a && this.c == vtiVar.c && this.d == vtiVar.d && this.b == vtiVar.b;
    }

    public final int hashCode() {
        return (((((a.aj(this.a) * 31) + a.aj(this.c)) * 31) + a.aj(this.d)) * 31) + this.b;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)};
        String[] strArrSplit = "canBeDraggedToResize;slidingOrientation;isBeingResized;isSeamless".split(";");
        StringBuilder sb = new StringBuilder("vti[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
