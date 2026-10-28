package defpackage;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zsy extends ept {
    public final Runnable a;
    public final IntConsumer b;

    public zsy(Runnable runnable, IntConsumer intConsumer) {
        this.a = runnable;
        this.b = intConsumer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zsy)) {
            return false;
        }
        zsy zsyVar = (zsy) obj;
        return Objects.equals(this.a, zsyVar.a) && Objects.equals(this.b, zsyVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "batchIncrementer;eventAdder".split(";");
        StringBuilder sb = new StringBuilder("zsy[");
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
