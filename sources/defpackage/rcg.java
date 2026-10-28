package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rcg {
    private final Uri a;
    private final Duration b;
    private final float c;
    private final boolean d;

    public rcg(Uri uri, Duration duration, float f, boolean z) {
        this.a = uri;
        if (duration == null) {
            throw new NullPointerException("Null alignmentStartTime");
        }
        this.b = duration;
        this.c = f;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rcg) {
            rcg rcgVar = (rcg) obj;
            if (this.a.equals(rcgVar.a) && this.b.equals(rcgVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(rcgVar.c) && this.d == rcgVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        Duration duration = this.b;
        return "MergedVideoSegmentKey{sourceUri=" + this.a.toString() + ", alignmentStartTime=" + duration.toString() + ", playbackRate=" + this.c + ", shouldUseDataSourceFactoryProcessor=false, applyEffectsAfterCrop=" + this.d + '}';
    }

    public rcg() {
        throw null;
    }
}
