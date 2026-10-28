package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyx {
    public final Optional a;
    public final Optional b;

    public adyx(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adyx) {
            adyx adyxVar = (adyx) obj;
            if (this.a.equals(adyxVar.a) && this.b.equals(adyxVar.b)) {
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
        return "LoggerArgs{screenVe=" + String.valueOf(this.a) + ", command=" + String.valueOf(optional) + '}';
    }

    public adyx() {
        throw null;
    }
}
