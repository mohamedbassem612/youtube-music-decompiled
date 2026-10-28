package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tc {
    private final String a;
    private afx b = new afx(0);
    private boolean c = false;

    public tc(String str) {
        this.a = str;
    }

    public final td a() {
        this.c = true;
        return new td(this.a, new ArrayList(this.b));
    }

    public final void b(Collection collection) {
        azs.l(collection);
        if (this.c) {
            this.b = new afx(this.b);
            this.c = false;
        }
        this.b.addAll(collection);
    }
}
