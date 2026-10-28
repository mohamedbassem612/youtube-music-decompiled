package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jqu extends ept {
    public final hww a;
    public final boolean b;

    public jqu(hww hwwVar, boolean z) {
        this.a = hwwVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jqu)) {
            return false;
        }
        jqu jquVar = (jqu) obj;
        return this.b == jquVar.b && Objects.equals(this.a, jquVar.a);
    }

    public final int hashCode() {
        return (a.aj(this.b) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Boolean.valueOf(this.b)};
        String[] strArrSplit = "playerViewMode;isFullBleed".split(";");
        StringBuilder sb = new StringBuilder("jqu[");
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
