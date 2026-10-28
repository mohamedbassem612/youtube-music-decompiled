package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wlz {
    public final MessageLite a;
    public final alop b;
    public final long c;
    public final int d;
    public final aigj e;

    public wlz(MessageLite messageLite, alop alopVar, long j, int i, aigj aigjVar) {
        this.a = messageLite;
        this.b = alopVar;
        this.c = j;
        this.d = i;
        this.e = aigjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wlz) {
            wlz wlzVar = (wlz) obj;
            if (awrc.c(this.a, wlzVar.a) && awrc.c(this.b, wlzVar.b) && this.c == wlzVar.c && this.d == wlzVar.d && awrc.c(this.e, wlzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aigj aigjVar = this.e;
        return (((((iHashCode * 31) + a.ak(this.c)) * 31) + this.d) * 31) + (aigjVar == null ? 0 : aigjVar.hashCode());
    }

    public final String toString() {
        return "ParseNetworkResponseProtoResult(proto=" + this.a + ", responseContext=" + this.b + ", protoParsingTimeMillis=" + this.c + ", byteSize=" + this.d + ", serverEventId=" + this.e + ')';
    }
}
