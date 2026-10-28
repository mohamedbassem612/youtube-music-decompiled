package defpackage;

import j$.util.Spliterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agyx {
    public final agyu a = new agyu();
    public final agyu b = new agyu();
    public final Spliterator c;
    public final Spliterator d;
    final /* synthetic */ agyy e;

    public agyx(agyy agyyVar) {
        this.e = agyyVar;
        this.c = agyyVar.a.spliterator();
        this.d = agyyVar.b.spliterator();
    }

    public final boolean a() {
        return this.c.tryAdvance(this.a) && this.d.tryAdvance(this.b);
    }
}
