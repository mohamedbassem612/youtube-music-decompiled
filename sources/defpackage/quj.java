package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class quj implements qud {
    public final int a;
    private final UUID b;

    public quj(UUID uuid, int i) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.b = uuid;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof quj) {
            quj qujVar = (quj) obj;
            if (this.b.equals(qujVar.b) && this.a == qujVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String str;
        int i = this.a;
        String string = this.b.toString();
        if (i == 1) {
            str = "SOURCE_ERROR";
        } else if (i != 2) {
            str = i != 3 ? "OPEN_GL_ERROR" : "FAILED_TO_APPLY_TRANSITION_ON_FRAME";
        } else {
            str = "INIT_FAILURE";
        }
        return a.ch((byte) 125, str, string, "TransitionContext{uuid=", ", errorType=");
    }

    public quj() {
        throw null;
    }
}
