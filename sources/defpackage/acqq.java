package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqq extends ept {
    public final List a;
    public final agkz b;

    public acqq(List list, agkz agkzVar) {
        this.a = list;
        this.b = agkzVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acqq)) {
            return false;
        }
        acqq acqqVar = (acqq) obj;
        return Objects.equals(this.a, acqqVar.a) && Objects.equals(this.b, acqqVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "savedCommands;trimmedCommandIds".split(";");
        StringBuilder sb = new StringBuilder("acqq[");
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
