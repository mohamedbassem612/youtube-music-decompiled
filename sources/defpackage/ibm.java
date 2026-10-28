package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ibm {
    public final aayw a;
    public final boolean b;

    public ibm(aayw aaywVar, boolean z) {
        if (aaywVar == null) {
            throw new NullPointerException("Null sequencerStageEvent");
        }
        this.a = aaywVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibm) {
            ibm ibmVar = (ibm) obj;
            if (this.a.equals(ibmVar.a) && this.b == ibmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "StageEventInfo{sequencerStageEvent=" + this.a.toString() + ", preferAudioModeForPodcasts=" + this.b + '}';
    }

    public ibm() {
        throw null;
    }
}
