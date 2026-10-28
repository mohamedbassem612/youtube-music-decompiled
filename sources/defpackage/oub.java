package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oub implements ThreadFactory {
    static final ExecutorService a = Executors.newFixedThreadPool(2, new oub());

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        oua ouaVar = new oua(runnable);
        ouaVar.setName("RenderNext Critical Image");
        return ouaVar;
    }
}
