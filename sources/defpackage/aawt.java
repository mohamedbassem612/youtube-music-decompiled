package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawt implements aawu {
    public final long a;
    public final String b;

    public aawt(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aawt) {
            aawt aawtVar = (aawt) obj;
            if (this.a == aawtVar.a && awrc.c(this.b, aawtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.ak(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LiveCaptionParsingError(segmentSequenceNumber=" + this.a + ", cpn=" + this.b + ')';
    }
}
