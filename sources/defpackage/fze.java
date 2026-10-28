package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fze {
    public final List a = new ArrayList();

    protected fze() {
    }

    public abstract fyy a(String str, kwq kwqVar, List list);

    final fyy b(String str) {
        if (this.a.contains(fxw.d(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
