package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wle extends ept {
    private final int a;
    private final String b;

    public wle(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wle)) {
            return false;
        }
        wle wleVar = (wle) obj;
        return this.a == wleVar.a && Objects.equals(this.b, wleVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), this.b};
        String[] strArrSplit = "futExtensionId;errorMessage".split(";");
        StringBuilder sb = new StringBuilder("wle[");
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
