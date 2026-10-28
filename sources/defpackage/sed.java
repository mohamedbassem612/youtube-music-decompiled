package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sed {
    public final long a;
    public final String b;
    public final String c;
    public final ListenableFuture d;

    public sed(long j, String str, String str2, ListenableFuture listenableFuture) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = listenableFuture;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sed) {
            sed sedVar = (sed) obj;
            if (this.a == sedVar.a && awrc.c(this.b, sedVar.b) && awrc.c(this.c, sedVar.c) && awrc.c(this.d, sedVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + iHashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AdSignalsCacheEntry(timestamp=" + this.a + ", identityId=" + this.b + ", adSignals=" + this.c + ", advertisingIdInfo=" + this.d + ')';
    }
}
