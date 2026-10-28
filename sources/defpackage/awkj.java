package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awkj implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;

    public awkj(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awkj) {
            return a.ae(this.a, ((awkj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + String.valueOf(this.a) + ']';
    }
}
