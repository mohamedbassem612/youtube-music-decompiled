package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agbb {
    public final Optional a;
    public final Optional b;

    public agbb(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agbb) {
            agbb agbbVar = (agbb) obj;
            if (this.a.equals(agbbVar.a) && this.b.equals(agbbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "RequestContinuationOptions{continuationData=" + String.valueOf(this.a) + ", formData=" + String.valueOf(optional) + '}';
    }

    public agbb() {
        throw null;
    }
}
