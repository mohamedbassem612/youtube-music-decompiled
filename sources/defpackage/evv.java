package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class evv {
    final Executor a;
    final fed b;

    public evv(fed fedVar, Executor executor) {
        this.b = fedVar;
        this.a = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof evv) {
            return this.b.equals(((evv) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
