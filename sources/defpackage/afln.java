package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface afln {
    ListenableFuture a(WorkerParameters workerParameters);

    ListenableFuture b(WorkerParameters workerParameters);

    void c(Supplier supplier);

    void d();
}
