package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vzu {
    public final int a;
    public final int b;
    public final Optional c;

    public vzu(int i, int i2, Optional optional) {
        this.a = i;
        this.b = i2;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vzu) {
            vzu vzuVar = (vzu) obj;
            if (this.a == vzuVar.a && this.b == vzuVar.b && this.c.equals(vzuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Config{maxPermits=" + this.a + ", maxWaitQueueSize=" + this.b + ", oauthIdentity=" + String.valueOf(this.c) + '}';
    }

    public vzu() {
        throw null;
    }
}
