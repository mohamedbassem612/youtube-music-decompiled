package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqn {
    public final auak a;
    public final int b;

    public uqn(auak auakVar, int i) {
        if (auakVar == null) {
            throw new NullPointerException("Null line");
        }
        this.a = auakVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqn) {
            uqn uqnVar = (uqn) obj;
            if (this.a.equals(uqnVar.a) && this.b == uqnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "TranslationGuidelineState{line=" + this.a.toString() + ", snapDistance=" + this.b + '}';
    }

    public uqn() {
        throw null;
    }
}
