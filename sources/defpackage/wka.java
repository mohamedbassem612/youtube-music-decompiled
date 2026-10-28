package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wka implements Executor {
    private final Executor c;
    public boolean b = false;
    public List a = new ArrayList();

    public wka(Executor executor) {
        this.c = executor;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.a.add(runnable);
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.execute(afwl.i(new vlj(this, 17)));
    }
}
