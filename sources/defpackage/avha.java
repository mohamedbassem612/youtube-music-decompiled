package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avha {
    final Object a = new Object();
    Collection b = new HashSet();
    Status c;
    final /* synthetic */ avhb d;

    public avha(avhb avhbVar) {
        this.d = avhbVar;
    }

    final void a(Status status) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = status;
            boolean zIsEmpty = this.b.isEmpty();
            if (zIsEmpty) {
                this.d.A.e(status);
            }
        }
    }
}
