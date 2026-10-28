package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hze {
    public final hzd a;
    public final hyz b;

    public hze(hzd hzdVar, hyz hyzVar) {
        this.a = hzdVar;
        this.b = hyzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hze) {
            hze hzeVar = (hze) obj;
            if (this.a == hzeVar.a && awrc.c(this.b, hzeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlaybackItemRendererUpdatedEvent(eventType=" + this.a + ", playbackItem=" + this.b + ')';
    }
}
