package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sel {
    public final Context a;
    public volatile String b;
    private final Executor c;

    public sel(Executor executor, Context context) {
        this.c = executor;
        this.a = context;
    }

    public final void a() {
        this.c.execute(afwl.i(new syd(this, 1)));
    }
}
