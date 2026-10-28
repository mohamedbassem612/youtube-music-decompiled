package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xrg {
    public final xyv a;
    public final Optional b;
    public final amyv c;

    public xrg(xyv xyvVar, Optional optional, amyv amyvVar) {
        this.a = xyvVar;
        this.b = optional;
        this.c = amyvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xrg) {
            xrg xrgVar = (xrg) obj;
            xyv xyvVar = this.a;
            if (xyvVar != null ? xyvVar.equals(xrgVar.a) : xrgVar.a == null) {
                if (this.b.equals(xrgVar.b)) {
                    amyv amyvVar = this.c;
                    if (amyvVar == null) {
                        if (xrgVar.c == null) {
                            return true;
                        }
                    } else if (amyvVar.equals(xrgVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xyv xyvVar = this.a;
        int iHashCode = (((xyvVar == null ? 0 : xyvVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        amyv amyvVar = this.c;
        return (iHashCode * 1000003) ^ (amyvVar != null ? amyvVar.hashCode() : 0);
    }

    public final String toString() {
        amyv amyvVar = this.c;
        Optional optional = this.b;
        return "SelectedRouteProperties{initialPlaybackDescriptor=" + String.valueOf(this.a) + ", optionalTransferSessionState=" + String.valueOf(optional) + ", mdxSessionSource=" + String.valueOf(amyvVar) + '}';
    }

    public xrg() {
        throw null;
    }
}
