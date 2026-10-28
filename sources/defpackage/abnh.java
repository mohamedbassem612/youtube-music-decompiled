package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abnh {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public abnh(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abnh) {
            abnh abnhVar = (abnh) obj;
            if (this.a.equals(abnhVar.a) && this.b.equals(abnhVar.b) && this.c.equals(abnhVar.c) && this.d.equals(abnhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "ClientDrivenWatchNextParameters{formData=" + String.valueOf(this.a) + ", priority=" + String.valueOf(optional3) + ", watchNextType=" + String.valueOf(optional2) + ", isReloadWatchNextRequest=" + String.valueOf(optional) + '}';
    }

    public abnh() {
        throw null;
    }
}
