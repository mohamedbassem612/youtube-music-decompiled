package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeqw implements aeqv {
    private final awmd b;

    public aeqw(awmd awmdVar) {
        this.b = awmdVar;
    }

    private final void e(Consumer consumer) {
        Iterator it = ((Set) this.b.io()).iterator();
        while (it.hasNext()) {
            consumer.accept((aeqv) it.next());
        }
    }

    @Override // defpackage.aeqv
    public final void a() {
        e(new aavj(8));
    }

    @Override // defpackage.aeqv
    public final void b() {
        e(new aavj(6));
    }

    @Override // defpackage.aeqv
    public final void c() {
        e(new aavj(7));
    }

    @Override // defpackage.aeqv
    public final void d() {
        e(new aavj(9));
    }
}
