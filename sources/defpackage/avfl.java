package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfl implements avjv {
    @Override // defpackage.avjv
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(avfp.f("grpc-default-executor-%d"));
    }

    @Override // defpackage.avjv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
