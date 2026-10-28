package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jkk extends ept {
    public final String a;
    public final String b;
    public final boolean c;

    public jkk(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jkk)) {
            return false;
        }
        jkk jkkVar = (jkk) obj;
        return this.c == jkkVar.c && Objects.equals(this.a, jkkVar.a) && Objects.equals(this.b, jkkVar.b);
    }

    public final int hashCode() {
        return (((a.aj(this.c) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Boolean.valueOf(this.c)};
        String[] strArrSplit = "label;reloadContinuation;isSelected".split(";");
        StringBuilder sb = new StringBuilder("jkk[");
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
