package defpackage;

import j$.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yap extends ept {
    public final yar a;
    public final Set b;

    public yap(yar yarVar, Set set) {
        this.a = yarVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yap)) {
            return false;
        }
        yap yapVar = (yap) obj;
        return Objects.equals(this.a, yapVar.a) && Objects.equals(this.b, yapVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "monitor;toRemove".split(";");
        StringBuilder sb = new StringBuilder("yap[");
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
