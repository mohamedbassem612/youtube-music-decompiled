package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sea {
    public final long a;
    public final String b;
    public final ListenableFuture c;
    public final ListenableFuture d;

    public sea(long j, String str, ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        listenableFuture2.getClass();
        this.a = j;
        this.b = str;
        this.c = listenableFuture;
        this.d = listenableFuture2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sea) {
            sea seaVar = (sea) obj;
            if (this.a == seaVar.a && awrc.c(this.b, seaVar.b) && awrc.c(this.c, seaVar.c) && awrc.c(this.d, seaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((((a.ak(this.a) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AdSignalsCacheEntry(timestamp=" + this.a + ", identityId=" + this.b + ", adSignals=" + this.c + ", advertisingIdInfo=" + this.d + ')';
    }
}
