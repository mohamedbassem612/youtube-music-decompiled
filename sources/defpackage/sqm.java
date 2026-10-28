package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sqm {
    public final aipr a;
    public final boolean b;
    public final Optional c;

    public sqm(aipr aiprVar, boolean z, Optional optional) {
        if (aiprVar == null) {
            throw new NullPointerException("Null aboutThisAdEndpoint");
        }
        this.a = aiprVar;
        this.b = z;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sqm) {
            sqm sqmVar = (sqm) obj;
            if (this.a.equals(sqmVar.a) && this.b == sqmVar.b && this.c.equals(sqmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "AboutThisAdWebViewListenerData{aboutThisAdEndpoint=" + this.a.toString() + ", isAdAlreadyPaused=" + this.b + ", hideEnclosingEvent=" + optional.toString() + '}';
    }

    public sqm() {
        throw null;
    }
}
