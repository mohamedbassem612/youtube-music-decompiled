package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axew extends awvv implements Executor {
    public static final axew a = new axew();
    private static final awuq b = axfc.a.e(awrc.Z("kotlinx.coroutines.io.parallelism", awro.f(64, axdz.a), Alert.DURATION_SHOW_INDEFINITELY));

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        b.a(awouVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        return axfc.a.e(1);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(awov.a, runnable);
    }

    @Override // defpackage.awuq
    public final void i(awou awouVar, Runnable runnable) throws awve {
        b.i(awouVar, runnable);
    }

    @Override // defpackage.awuq
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.awvv
    public final Executor h() {
        return this;
    }
}
