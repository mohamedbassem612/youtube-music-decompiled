package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abpr extends ept {
    public final ListenableFuture a;
    public final long b;
    public final boolean c;

    public abpr(ListenableFuture listenableFuture, long j, boolean z) {
        this.a = listenableFuture;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abpr)) {
            return false;
        }
        abpr abprVar = (abpr) obj;
        return this.c == abprVar.c && this.b == abprVar.b && Objects.equals(this.a, abprVar.a);
    }

    public final int hashCode() {
        return (((a.aj(this.c) * 31) + a.ak(this.b)) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Long.valueOf(this.b), Boolean.valueOf(this.c)};
        String[] strArrSplit = "responseFuture;timeToLiveMs;isPrefetch".split(";");
        StringBuilder sb = new StringBuilder("abpr[");
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
