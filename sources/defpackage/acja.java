package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acja extends ept {
    public final Boolean a;
    public final Long b;
    public final acjc c;

    public acja(Boolean bool, Long l, acjc acjcVar) {
        this.a = bool;
        this.b = l;
        this.c = acjcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acja)) {
            return false;
        }
        acja acjaVar = (acja) obj;
        return Objects.equals(this.a, acjaVar.a) && Objects.equals(this.b, acjaVar.b) && Objects.equals(this.c, acjaVar.c);
    }

    public final int hashCode() {
        return a.A(this.a, this.b, this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "forceLoadFirst;syncToTimeMillis;triggerType".split(";");
        StringBuilder sb = new StringBuilder("acja[");
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
