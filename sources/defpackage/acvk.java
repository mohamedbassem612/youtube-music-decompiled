package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvk extends ept implements acvm {
    private final List a;

    public acvk(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acvk) && Objects.equals(this.a, ((acvk) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "commands".split(";");
        StringBuilder sb = new StringBuilder("acvk[");
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
