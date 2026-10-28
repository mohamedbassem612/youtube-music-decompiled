package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hj {
    private static final Executor h = new wh(1, (byte[]) null);
    public final ht a;
    public List d;
    public int f;
    public final zf g;
    public final List c = new CopyOnWriteArrayList();
    public List e = Collections.EMPTY_LIST;
    public final Executor b = h;

    public hj(ht htVar, zf zfVar) {
        this.a = htVar;
        this.g = zfVar;
    }

    public final void a() {
        for (ed edVar : this.c) {
        }
    }
}
