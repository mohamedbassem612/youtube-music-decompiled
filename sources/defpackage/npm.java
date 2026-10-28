package defpackage;

import com.google.android.libraries.elements.interfaces.Closure;
import com.google.android.libraries.elements.interfaces.TaskQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npm extends TaskQueue {
    private final Executor a;

    public npm(Executor executor) {
        this.a = new ahfg(executor);
    }

    @Override // com.google.android.libraries.elements.interfaces.TaskQueue
    public final void submit(Closure closure) {
        if (closure != null) {
            this.a.execute(new mga(closure, 9));
        }
    }
}
