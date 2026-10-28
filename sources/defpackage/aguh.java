package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aguh extends aguu {
    public static final aguh a = new aguh(aguw.a);
    public final AtomicReference b;

    public aguh(aguu aguuVar) {
        this.b = new AtomicReference(aguuVar);
    }

    @Override // defpackage.aguu
    public final agta a() {
        return ((aguu) this.b.get()).a();
    }

    @Override // defpackage.aguu
    public final agva b() {
        return ((aguu) this.b.get()).b();
    }

    @Override // defpackage.aguu
    public final void c(String str, Level level, boolean z) {
        ((aguu) this.b.get()).c(str, level, z);
    }
}
