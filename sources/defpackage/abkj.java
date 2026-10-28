package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abkj {
    public final Duration a;
    private final Optional b;

    public abkj(Duration duration, Optional optional) {
        if (duration == null) {
            throw new NullPointerException("Null seekDuration");
        }
        this.a = duration;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abkj) {
            abkj abkjVar = (abkj) obj;
            if (this.a.equals(abkjVar.a) && this.b.equals(abkjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 385623362) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        Optional optional = this.b;
        return "ChapterSeekResult{isSeekingToChapterStart=false, seekDuration=" + this.a.toString() + ", seekText=" + optional.toString() + ", isOverlayCentered=false}";
    }

    public abkj() {
        throw null;
    }
}
