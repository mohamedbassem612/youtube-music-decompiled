package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class the {
    public Collection a = agpi.a;
    private boolean b;

    public final synchronized void a(Collection collection) {
        this.a = collection;
        this.b = true;
    }

    public final synchronized boolean b() {
        return this.b;
    }
}
