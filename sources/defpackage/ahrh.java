package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahrh {
    public final String a;
    public final List b;

    public ahrh(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahrh) {
            ahrh ahrhVar = (ahrh) obj;
            if (this.a.equals(ahrhVar.a) && this.b.equals(ahrhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b.toString() + '}';
    }

    public ahrh() {
        throw null;
    }
}
