package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulk {
    public final boolean a;
    public final audb b;
    private final boolean c;

    public ulk(boolean z, boolean z2, audb audbVar) {
        this.a = z;
        this.c = z2;
        this.b = audbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulk) {
            ulk ulkVar = (ulk) obj;
            if (this.a == ulkVar.a && this.c == ulkVar.c && this.b.equals(ulkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PlaybackControllerConfig{shouldPlayAfterInitialization=" + this.a + ", forcePreviewFrameResolutionToMatchSource=" + this.c + ", mediaEngineClient=" + String.valueOf(this.b) + '}';
    }

    public ulk() {
        throw null;
    }
}
