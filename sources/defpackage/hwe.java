package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwe {
    public final /* synthetic */ Object a;

    public hwe(Object obj) {
        this.a = obj;
    }

    public final void a() {
        Object obj = this.a;
        synchronized (((qso) obj).h) {
            int i = ((qso) obj).k;
            ahno.Q(i > 0, "Refcount went negative!", i);
            ((qso) obj).k--;
            ((qso) obj).c();
        }
    }

    public final void b() {
        Object obj = this.a;
        synchronized (((qso) obj).h) {
            int i = ((qso) obj).k;
            if (i == 0) {
                throw new CancellationException("database is closed");
            }
            ahno.Q(i > 0, "Refcount went negative!", i);
            ((qso) obj).k++;
        }
    }

    @tcc
    public void handleMdxSessionStatusEvent(xzh xzhVar) {
        ((hwg) this.a).h();
    }
}
