package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hts {
    public final String a;
    public final boolean b;
    public final boolean c;

    public hts(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hts) {
            hts htsVar = (hts) obj;
            if (awrc.c(this.a, htsVar.a) && this.b == htsVar.b && this.c == htsVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.aj(this.b)) * 31) + a.aj(this.c);
    }

    public final String toString() {
        return "ProgressNotificationState(status=" + this.a + ", ongoing=" + this.b + ", autoCancel=" + this.c + ')';
    }
}
