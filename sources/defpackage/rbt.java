package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rbt extends clg {
    private final Set a;
    private final AtomicBoolean b;

    public rbt(clk clkVar, Set set) {
        super(clkVar);
        this.b = new AtomicBoolean(false);
        this.a = set;
    }

    @Override // defpackage.clg, defpackage.clk
    public final void i() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.remove(this);
        super.i();
    }
}
