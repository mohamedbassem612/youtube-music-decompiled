package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zgp {
    public final Duration a;

    public zgp(Duration duration) {
        this.a = duration;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zgp) && awrc.c(this.a, ((zgp) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CrossfadeTransition(overlapDuration=" + this.a + ')';
    }
}
