package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukn extends ept {
    public final ugc a;
    public final boolean b;

    public ukn(ugc ugcVar, boolean z) {
        this.a = ugcVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ukn)) {
            return false;
        }
        ukn uknVar = (ukn) obj;
        return this.b == uknVar.b && Objects.equals(this.a, uknVar.a);
    }

    public final int hashCode() {
        return (a.aj(this.b) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Boolean.valueOf(this.b)};
        String[] strArrSplit = "tool;wasPreviouslyPlaying".split(";");
        StringBuilder sb = new StringBuilder("ukn[");
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
