package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgx {
    public final String a;
    public final boolean b;

    public pgx(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pgx) {
            pgx pgxVar = (pgx) obj;
            if (this.a.equals(pgxVar.a) && this.b == pgxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ChimeNotificationChannelGroup{id=" + this.a + ", blocked=" + this.b + '}';
    }

    public pgx() {
        throw null;
    }
}
