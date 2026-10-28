package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adza extends ept {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public adza(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adza)) {
            return false;
        }
        adza adzaVar = (adza) obj;
        return this.a == adzaVar.a && this.b == adzaVar.b && this.c == adzaVar.c;
    }

    public final int hashCode() {
        return (((a.aj(this.a) * 31) + a.aj(this.b)) * 31) + a.aj(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)};
        String[] strArrSplit = "enableOffscreenFix;enableOffscreenFixV2;enableMainstageContextualSheets".split(";");
        StringBuilder sb = new StringBuilder("adza[");
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
