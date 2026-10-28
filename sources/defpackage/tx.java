package defpackage;

import java.io.Closeable;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class tx implements Closeable {
    public final tv a;
    public final String b;
    public final String c;
    public final File d;
    public final Set e;
    public final tw f;
    public int g = 0;

    public tx(tv tvVar, String str, Set set, tw twVar) {
        this.a = tvVar;
        azs.l(str);
        this.b = str;
        this.c = "ytoffline_appsearch";
        azs.l(set);
        this.d = File.createTempFile("appsearch", null);
        this.e = new afx(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.e.add(((sl) it.next()).a);
        }
        this.f = twVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.delete();
    }
}
