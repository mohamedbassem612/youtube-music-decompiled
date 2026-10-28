package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class yzy {
    public final cqs a;
    public final int b;
    public final cdr c;

    public yzy(cqs cqsVar, int i, cdr cdrVar) {
        this.a = cqsVar;
        this.b = i;
        this.c = cdrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yzy) {
            yzy yzyVar = (yzy) obj;
            if (this.a.equals(yzyVar.a) && this.b == yzyVar.b && this.c.equals(yzyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        cdr cdrVar = this.c;
        return "AudioTrackSelectionResult{audioTrackSelection=" + String.valueOf(this.a) + ", rendererIndex=" + this.b + ", offloadSupportConfiguration=" + cdrVar.toString() + '}';
    }

    public yzy() {
        throw null;
    }
}
