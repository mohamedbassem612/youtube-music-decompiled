package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trk {
    public static final qci a = new qci("NA");
    public final String b;
    public final qci c;

    public trk(String str, qci qciVar) {
        this.b = str;
        this.c = qciVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trk) {
            trk trkVar = (trk) obj;
            if (this.b.equals(trkVar.b) && this.c.equals(trkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "TaskStringId{id=" + this.b + ", traceName=" + this.c.a + '}';
    }

    public trk() {
        throw null;
    }
}
