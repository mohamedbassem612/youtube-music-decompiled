package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgv {
    public final boolean a;
    private final ListenableFuture b;

    public rgv(boolean z, ListenableFuture listenableFuture) {
        this.a = z;
        this.b = listenableFuture;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgv) {
            rgv rgvVar = (rgv) obj;
            if (this.a == rgvVar.a && this.b.equals(rgvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "UpdateResult{shouldFlush=" + this.a + ", updateFuture=" + String.valueOf(this.b) + '}';
    }

    public rgv() {
        throw null;
    }
}
