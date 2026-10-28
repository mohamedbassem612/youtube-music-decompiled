package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface ahex extends ExecutorService {
    ListenableFuture i(Runnable runnable);

    ListenableFuture j(Callable callable);

    ListenableFuture k(Runnable runnable, Object obj);
}
