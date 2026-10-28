package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xlr extends ept {
    static final Duration a = Duration.ofSeconds(5);
    public final xvu b;
    public final xvy c;
    public final Instant d;
    public final aqi e;

    public xlr(xvu xvuVar, xvy xvyVar, Instant instant, aqi aqiVar) {
        this.b = xvuVar;
        this.c = xvyVar;
        this.d = instant;
        this.e = aqiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xlr)) {
            return false;
        }
        xlr xlrVar = (xlr) obj;
        return Objects.equals(this.b, xlrVar.b) && Objects.equals(this.c, xlrVar.c) && Objects.equals(this.d, xlrVar.d) && Objects.equals(this.e, xlrVar.e);
    }

    public final int hashCode() {
        return yno.E(this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        return this.b.aA + '(' + String.valueOf(this.c) + ')';
    }
}
