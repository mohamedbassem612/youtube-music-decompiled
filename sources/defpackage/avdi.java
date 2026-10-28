package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdi extends avfh {
    public final AtomicInteger a = new AtomicInteger(-2147483647);
    private final avef b;
    private volatile Status c;
    private Status d;

    public avdi(avef avefVar, String str) {
        this.b = avefVar;
        str.getClass();
    }

    @Override // defpackage.avfh, defpackage.avdx
    public final avdu a(avbh avbhVar, avbe avbeVar, auyq auyqVar, auyw[] auywVarArr) {
        return this.a.get() >= 0 ? new avfb(this.c, auywVarArr) : this.b.a(avbhVar, avbeVar, auyqVar, auywVarArr);
    }

    @Override // defpackage.avfh
    protected final avef d() {
        return this.b;
    }

    @Override // defpackage.avfh, defpackage.avhm
    public final void e(Status status) {
        status.getClass();
        synchronized (this) {
            AtomicInteger atomicInteger = this.a;
            if (atomicInteger.get() < 0) {
                this.c = status;
                atomicInteger.addAndGet(Alert.DURATION_SHOW_INDEFINITELY);
                if (atomicInteger.get() != 0) {
                    return;
                }
                super.e(status);
            }
        }
    }

    @Override // defpackage.avfh, defpackage.avhm
    public final void f(Status status) {
        status.getClass();
        synchronized (this) {
            AtomicInteger atomicInteger = this.a;
            if (atomicInteger.get() < 0) {
                this.c = status;
                atomicInteger.addAndGet(Alert.DURATION_SHOW_INDEFINITELY);
            } else if (this.d != null) {
                return;
            }
            if (atomicInteger.get() != 0) {
                this.d = status;
            } else {
                super.f(status);
            }
        }
    }
}
