package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upd extends ept {
    public final AtomicBoolean a;
    public final ListenableFuture b;

    public upd(AtomicBoolean atomicBoolean, ListenableFuture listenableFuture) {
        this.a = atomicBoolean;
        this.b = listenableFuture;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof upd)) {
            return false;
        }
        upd updVar = (upd) obj;
        return Objects.equals(this.a, updVar.a) && Objects.equals(this.b, updVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "isCancelled;editingRequestFuture".split(";");
        StringBuilder sb = new StringBuilder("upd[");
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
