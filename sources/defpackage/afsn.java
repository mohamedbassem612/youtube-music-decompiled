package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afsn {
    public final afso a;
    public final ListenableFuture b;

    public afsn(afso afsoVar, ListenableFuture listenableFuture) {
        this.a = afsoVar;
        this.b = listenableFuture;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afsn) {
            afsn afsnVar = (afsn) obj;
            if (this.a.equals(afsnVar.a) && this.b.equals(afsnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ListenableFuture listenableFuture = this.b;
        return "MonitorReport{monitor=" + this.a.toString() + ", startReport=" + String.valueOf(listenableFuture) + '}';
    }

    public afsn() {
        throw null;
    }
}
