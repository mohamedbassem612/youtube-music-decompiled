package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uc implements Closeable {
    public final tv a;
    public final Executor b;
    public final String c;
    public final String d;
    public final String e;
    public final tl f;
    public long g;
    public final tw j;
    public boolean h = true;
    public boolean i = false;
    public int k = 3;

    public uc(tv tvVar, Executor executor, String str, String str2, tl tlVar, tw twVar) {
        this.a = tvVar;
        this.b = executor;
        azs.l(str);
        this.c = str;
        new uu(str);
        this.d = "ytoffline_appsearch";
        azs.l(str2);
        this.e = str2;
        this.f = tlVar;
        this.j = twVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        if (this.g == 0) {
            this.i = true;
        } else {
            ed.l(this.b, new ub(this, 0));
        }
    }
}
