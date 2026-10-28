package defpackage;

import j$.time.Duration;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class syx {
    public final int a;
    public final String b;
    public final Duration c;

    public syx(int i, String str, Duration duration) {
        duration.getClass();
        this.a = i;
        this.b = str;
        this.c = duration;
        if (i != 1 && i != 3) {
            throw new IllegalArgumentException("Only INTERNAL_DATA and INTERNAL_CACHE directories can be swept: 2");
        }
        if (str.length() <= 0) {
            throw new IllegalArgumentException("path must not be empty");
        }
        if (duration.isNegative() || duration.isZero()) {
            Objects.toString(duration);
            throw new IllegalArgumentException("ttl must be positive: ".concat(duration.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof syx) {
            syx syxVar = (syx) obj;
            if (this.a == syxVar.a && awrc.c(this.b, syxVar.b) && awrc.c(this.c, syxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TtlDiskCacheDirectory(location=" + this.a + ", path=" + this.b + ", ttl=" + this.c + ')';
    }
}
