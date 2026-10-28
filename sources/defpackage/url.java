package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class url {
    public final agke a;
    public final agke b;

    public url(agke agkeVar, agke agkeVar2) {
        this.a = agkeVar;
        this.b = agkeVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof url) {
            url urlVar = (url) obj;
            if (aguu.v(this.a, urlVar.a) && aguu.v(this.b, urlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.b;
        return "HorizontalVerticalTranslationGuidelineState{horizontalGuidelineStates=" + String.valueOf(this.a) + ", verticalGuidelineStates=" + String.valueOf(agkeVar) + '}';
    }

    public url() {
        throw null;
    }
}
