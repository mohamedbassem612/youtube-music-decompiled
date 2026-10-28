package defpackage;

import java.lang.ref.WeakReference;
import org.chromium.base.task.TaskRunnerImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axka extends WeakReference {
    public final long a;

    public axka(TaskRunnerImpl taskRunnerImpl) {
        super(taskRunnerImpl, TaskRunnerImpl.a);
        this.a = taskRunnerImpl.d;
    }
}
