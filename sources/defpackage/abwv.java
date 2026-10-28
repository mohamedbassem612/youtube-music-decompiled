package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abwv {
    public String a;
    private final awku b;
    private final awkv c;
    private final aunn d;
    private final awmd e;
    private final Executor f;
    private Optional g;
    private final abhh h;

    public abwv(awku awkuVar, awkv awkvVar, aunn aunnVar, awmd awmdVar, Executor executor, abhh abhhVar) {
        this.b = awkuVar;
        this.c = awkvVar;
        this.d = aunnVar;
        this.e = awmdVar;
        this.f = executor;
        this.h = abhhVar;
    }

    public final ListenableFuture a() {
        aunn aunnVar;
        Optional optional = this.g;
        if (optional != null) {
            this.b.kk(optional);
            boolean zIsPresent = optional.isPresent();
            abhh abhhVar = this.h;
            if (zIsPresent) {
                abhhVar.d(((Boolean) optional.get()).booleanValue());
            } else {
                abhhVar.b();
            }
        }
        String str = this.a;
        if (str != null) {
            boolean zIsEmpty = str.isEmpty();
            awkv awkvVar = this.c;
            if (zIsEmpty) {
                awkvVar.kk(Optional.empty());
                this.h.c();
            } else {
                awkvVar.kk(Optional.of(str));
                this.h.e(str);
            }
        }
        if (!((abmt) this.e.io()).bv() || ((optional == null && str == null) || (aunnVar = this.d) == null)) {
            return aher.a;
        }
        afxd afxdVarF = afxd.f(((acqf) aunnVar.io()).c());
        aaoq aaoqVar = new aaoq(optional, str, 6, null);
        Executor executor = this.f;
        return afxdVarF.h(aaoqVar, executor).g(new abfb(16), executor);
    }

    public final void b(Boolean bool) {
        this.g = Optional.ofNullable(bool);
    }
}
