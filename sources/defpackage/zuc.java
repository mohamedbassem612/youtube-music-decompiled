package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zuc extends ept {
    public final int[] a;
    public final aigj b;

    public zuc(int[] iArr, aigj aigjVar) {
        this.a = iArr;
        this.b = aigjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zuc)) {
            return false;
        }
        zuc zucVar = (zuc) obj;
        return Objects.equals(this.a, zucVar.a) && Objects.equals(this.b, zucVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "events;custom".split(";");
        StringBuilder sb = new StringBuilder("zuc[");
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
