package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeqf {
    public Supplier a;
    public Optional b = Optional.empty();
    private xgn c;

    public final aeqg a() {
        xgn xgnVar = this.c;
        if (xgnVar != null) {
            return new aeqg(xgnVar, this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: interactionLogger");
    }

    public final void b(xgn xgnVar) {
        if (xgnVar == null) {
            throw new NullPointerException("Null interactionLogger");
        }
        this.c = xgnVar;
    }
}
