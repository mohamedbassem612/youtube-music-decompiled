package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class quh implements qud {
    public final UUID a;
    public final int b;

    public quh(UUID uuid, int i) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.a = uuid;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof quh) {
            quh quhVar = (quh) obj;
            if (this.a.equals(quhVar.a) && this.b == quhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        int i = this.b;
        String string = this.a.toString();
        if (i == 1) {
            str = "SOURCE_ERROR";
        } else if (i != 2) {
            str = i != 3 ? "OPEN_GL_ERROR" : "FAILED_TO_APPLY_EFFECT_ON_FRAME";
        } else {
            str = "FAILED_TO_UPDATE_EFFECT";
        }
        return a.ch((byte) 125, str, string, "SegmentContext{uuid=", ", errorType=");
    }

    public quh() {
        throw null;
    }
}
