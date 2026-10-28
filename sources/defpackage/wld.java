package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wld extends ept {
    public final agke a;

    public wld(agke agkeVar) {
        this.a = agkeVar;
    }

    public static wld t() {
        return new wld(agpi.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wld) && Objects.equals(this.a, ((wld) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "validationFailures".split(";");
        StringBuilder sb = new StringBuilder("wld[");
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

    private wld() {
        this(agpi.a);
    }
}
