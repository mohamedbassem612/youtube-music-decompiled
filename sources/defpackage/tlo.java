package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tlo implements tks {
    private final Executor a;
    private final tns b;

    public tlo(Executor executor, tns tnsVar) {
        executor.getClass();
        this.a = executor;
        this.b = tnsVar;
    }

    @Override // defpackage.tks
    public final void a(tns tnsVar, tnx tnxVar) {
        if (tnsVar.D()) {
            return;
        }
        this.a.execute(afwl.i(new tln(tnsVar, tnxVar, 0)));
    }

    @Override // defpackage.tks
    public final boolean c() {
        return this.b.D();
    }

    @Override // defpackage.tks
    public final void d() {
        this.b.w();
    }

    @Override // defpackage.tks
    public final /* synthetic */ void b(UrlRequest urlRequest) {
    }
}
