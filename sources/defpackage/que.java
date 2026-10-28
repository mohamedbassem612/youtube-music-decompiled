package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class que implements qud {
    private final UUID a;

    public que(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof que) && this.a.equals(((que) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1;
    }

    public final String toString() {
        return "EffectContext{uuid=" + this.a.toString() + ", errorType=FAILED_TO_LOAD}";
    }

    public que() {
        throw null;
    }
}
