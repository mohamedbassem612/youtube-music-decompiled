package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class acyx implements adwp {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final acxn b;

    public acyx(Executor executor, boolean z, acxn acxnVar) {
        if (a.compareAndSet(false, true)) {
            ahxh.e = z;
            int i = meg.a;
            executor.execute(new gkz(4));
        }
        this.b = acxnVar;
    }

    protected abstract akrn a(Object obj);

    @Override // defpackage.adwp
    public final agex b() {
        return new adaz(this, 1);
    }

    public final acxm c(akrn akrnVar) {
        return this.b.a(akrnVar);
    }

    @Override // defpackage.adwp
    public final void e(Object obj, abgb abgbVar) {
        akrn akrnVarA = a(obj);
        if (akrnVarA != null) {
            abgbVar.b(this.b.a(akrnVarA));
        }
    }

    @Override // defpackage.adwp
    public final /* synthetic */ void d() {
    }
}
