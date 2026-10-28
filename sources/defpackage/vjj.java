package defpackage;

import android.app.Activity;
import android.util.Log;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vjj implements vjk {
    public static final String c = "vjj";
    private final List a = new ArrayList();
    public final Activity d;
    public final Optional e;
    public final zf f;
    protected final xpl g;

    public vjj(Activity activity, xpl xplVar, zf zfVar, Optional optional) {
        this.d = activity;
        this.g = xplVar;
        this.f = zfVar;
        this.e = optional;
    }

    public final void f(Consumer consumer) {
        List list = this.a;
        if (list.isEmpty()) {
            Log.w(c, "flow closed while one wasn't open");
        }
        Iterable$EL.forEach(list, consumer);
        list.clear();
    }

    public final void g(boolean z) {
        f(new uvu(z, 2));
    }

    public final void h(Throwable th) {
        f(new usf(th, 16));
    }

    @Override // defpackage.vio
    public /* synthetic */ void jb(uxi uxiVar) {
        throw null;
    }
}
