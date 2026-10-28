package defpackage;

import android.util.Size;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qww {
    public final Size a;
    private final Duration b;
    private final Duration c;
    private final long d;

    public qww(Size size, Duration duration, Duration duration2, long j) {
        this.a = size;
        if (duration == null) {
            throw new NullPointerException("Null frameDelta");
        }
        this.b = duration;
        if (duration2 == null) {
            throw new NullPointerException("Null totalDuration");
        }
        this.c = duration2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qww) {
            qww qwwVar = (qww) obj;
            Size size = this.a;
            if (size != null ? size.equals(qwwVar.a) : qwwVar.a == null) {
                if (this.b.equals(qwwVar.b) && this.c.equals(qwwVar.c) && this.d == qwwVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Size size = this.a;
        int iHashCode = (((((size == null ? 0 : size.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        Duration duration = this.c;
        Duration duration2 = this.b;
        return "SkottieMetadata{frameSize=" + String.valueOf(this.a) + ", frameDelta=" + duration2.toString() + ", totalDuration=" + duration.toString() + ", frameRate=" + this.d + '}';
    }

    public qww() {
        throw null;
    }
}
