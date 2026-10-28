package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iqp {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/utils/DataSavingSettingsHelper");
    public final Context b;
    public final bog c;
    public final jkp d;
    private final zwb e;
    private final Executor f;
    private final syn g;

    public iqp(Context context, bog bogVar, syn synVar, zwb zwbVar, Executor executor, jkp jkpVar) {
        this.b = context;
        this.c = bogVar;
        this.g = synVar;
        this.e = zwbVar;
        this.f = executor;
        this.d = jkpVar;
    }

    public final ListenableFuture a() {
        return taf.a(this.c, afxd.f(this.g.n(this.e.e())), new iii(this, 11));
    }

    public final ListenableFuture b() {
        return taf.a(this.c, afxd.f(a()).h(new gpr(9), this.f), new iqj(10));
    }
}
