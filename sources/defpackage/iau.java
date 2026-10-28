package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iau {
    public final boolean a;
    public final Optional b;
    public final hth c;

    public iau(boolean z, Optional optional, hth hthVar) {
        this.a = z;
        this.b = optional;
        if (hthVar == null) {
            throw new NullPointerException("Null firstTrackOfflinePlaybackData");
        }
        this.c = hthVar;
    }

    static iau a(boolean z) {
        return new iau(z, Optional.empty(), new htg().a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iau) {
            iau iauVar = (iau) obj;
            if (this.a == iauVar.a && this.b.equals(iauVar.b) && this.c.equals(iauVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        hth hthVar = this.c;
        return "ListPlayabilityAndFirstTrackData{hasPlayableContent=" + this.a + ", firstTrackVideoId=" + this.b.toString() + ", firstTrackOfflinePlaybackData=" + hthVar.toString() + '}';
    }

    public iau() {
        throw null;
    }
}
