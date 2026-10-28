package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hil {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public hil(gro groVar) {
        this.c = groVar.a;
        this.d = groVar.d;
        this.b = groVar.b;
        this.a = groVar.c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [adma, java.lang.Object] */
    public final gro a() {
        Object obj = this.c;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: browseModel");
        }
        return new gro((heh) obj, (grt) this.d, this.b, (RecyclerView) this.a);
    }

    public final void b(heh hehVar) {
        if (hehVar == null) {
            throw new NullPointerException("Null browseModel");
        }
        this.c = hehVar;
    }
}
