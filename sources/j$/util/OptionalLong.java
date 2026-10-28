package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class OptionalLong {
    public static final OptionalLong c = new OptionalLong();
    public final boolean a;
    public final long b;

    public OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public static OptionalLong empty() {
        return c;
    }

    public static OptionalLong of(long j) {
        return new OptionalLong(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OptionalLong) {
            OptionalLong optionalLong = (OptionalLong) obj;
            boolean z = optionalLong.a;
            boolean z2 = this.a;
            if (z2 && z) {
                if (this.b == optionalLong.b) {
                    return true;
                }
            } else if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    public long getAsLong() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public boolean isPresent() {
        return this.a;
    }

    public long orElse(long j) {
        return this.a ? this.b : j;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    public OptionalLong(long j) {
        this.a = true;
        this.b = j;
    }
}
