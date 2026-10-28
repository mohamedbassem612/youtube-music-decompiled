package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abik {
    public final String a;
    public final long b;

    public abik(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abik) {
            abik abikVar = (abik) obj;
            if (awrc.c(this.a, abikVar.a) && this.b == abikVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.ak(this.b);
    }

    public final String toString() {
        return "PlayingStateWallClockTimeEvent(cpn=" + this.a + ", playingStateElapsedWallClockMillis=" + this.b + ')';
    }
}
