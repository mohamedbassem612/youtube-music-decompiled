package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abim {
    public final String a;
    public final boolean b;
    public final long c;

    public abim(String str, boolean z, long j) {
        this.a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abim) {
            abim abimVar = (abim) obj;
            if (awrc.c(this.a, abimVar.a) && this.b == abimVar.b && this.c == abimVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.aj(this.b)) * 31) + a.ak(this.c);
    }

    public final String toString() {
        return "VideoPlayerStateAndTimeInfo(cpn=" + this.a + ", isPlaying=" + this.b + ", elapsedTimeMillis=" + this.c + ')';
    }

    public abim() {
        this("", false, 0L);
    }
}
