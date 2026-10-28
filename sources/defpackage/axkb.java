package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.base.task.TaskRunnerImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axkb extends TaskRunnerImpl implements axjy {
    public axkb(int i) {
        super(i, "UiThreadTaskRunner", 2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected final void d() {
        PostTask.c(this.b);
        ThreadUtils.a().post(this.e);
    }
}
