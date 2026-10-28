package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abuk extends ept {
    public static final abuk a = t().a();
    public final abuj b;
    public final boolean c;

    public abuk(abuj abujVar, boolean z) {
        abujVar.getClass();
        this.b = abujVar;
        this.c = z;
    }

    public static abui t() {
        abui abuiVar = new abui();
        abuiVar.b = abuj.a;
        abuiVar.b(false);
        return abuiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abuk)) {
            return false;
        }
        abuk abukVar = (abuk) obj;
        return this.c == abukVar.c && Objects.equals(this.b, abukVar.b);
    }

    public final int hashCode() {
        return (a.aj(this.c) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b, Boolean.valueOf(this.c)};
        String[] strArrSplit = "prefetchPolicy;wrappedSequence".split(";");
        StringBuilder sb = new StringBuilder("abuk[");
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
