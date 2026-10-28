package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ody extends kwc {
    private final obk b;

    public ody(Context context, Executor executor, obk obkVar) {
        super(context, executor, (lpa) new kjc((byte[]) null, (byte[]) null, (byte[]) null).a, false);
        this.b = obkVar;
    }

    private static void f() {
        new kjc((byte[]) null, (byte[]) null, (byte[]) null).v(Boolean.TRUE);
    }

    @Override // defpackage.kwc
    public final void b(int i, String str) {
        this.b.b(i, -1L, null, str);
        f();
    }

    @Override // defpackage.kwc
    public final void c(int i, long j, Exception exc) {
        this.b.b(i, j, exc, null);
        f();
    }

    @Override // defpackage.kwc
    public final void d(int i, long j) {
        this.b.b(i, j, null, null);
        f();
    }
}
