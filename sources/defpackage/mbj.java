package defpackage;

import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mbj implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ StrictMode.ThreadPolicy.Builder b;
    public final /* synthetic */ kjc c;

    public /* synthetic */ mbj(kjc kjcVar, ThreadFactory threadFactory, StrictMode.ThreadPolicy.Builder builder) {
        this.c = kjcVar;
        this.a = threadFactory;
        this.b = builder;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.a.newThread(new dzn((Object) this.c, (Object) this.b, (Object) runnable, 7, (byte[]) null));
    }
}
