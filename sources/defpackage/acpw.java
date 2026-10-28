package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpw {
    public final String a;
    public boolean b;
    public long c;

    public acpw(String str, boolean z, long j) {
        this.a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acpw) {
            acpw acpwVar = (acpw) obj;
            if (awrc.c(this.a, acpwVar.a) && this.b == acpwVar.b && this.c == acpwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.aj(this.b)) * 31) + a.ak(this.c);
    }

    public final String toString() {
        return "InternalHistoryItem(videoId=" + this.a + ", wasShown=" + this.b + ", shownTimestampMs=" + this.c + ')';
    }
}
