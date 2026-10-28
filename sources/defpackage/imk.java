package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imk {
    public final Optional a;
    public final int b;

    public imk(int i, Optional optional) {
        this.b = i;
        this.a = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imk) {
            imk imkVar = (imk) obj;
            int i = this.b;
            int i2 = imkVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a.equals(imkVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bj(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "DisplayContext{displaySurface=" + hmy.am(this.b) + ", displayLocation=" + String.valueOf(this.a) + '}';
    }

    public imk() {
        throw null;
    }
}
