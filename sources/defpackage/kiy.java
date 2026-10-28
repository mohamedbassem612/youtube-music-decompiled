package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kiy {
    public final Instant a;

    public kiy(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null eventTime");
        }
        this.a = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kiy) {
            return this.a.equals(((kiy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogSamplerProperties{eventTime=" + this.a.toString() + '}';
    }

    public kiy() {
        throw null;
    }
}
