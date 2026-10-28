package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cpg implements crm {
    public final long e = cnd.a();
    public final byi f;
    public final int g;
    public final bse h;
    public final int i;
    public final Object j;
    public final long k;
    public final long l;
    protected final bze m;

    public cpg(bye byeVar, byi byiVar, int i, bse bseVar, int i2, Object obj, long j, long j2) {
        this.m = new bze(byeVar);
        this.f = byiVar;
        this.g = i;
        this.h = bseVar;
        this.i = i2;
        this.j = obj;
        this.k = j;
        this.l = j2;
    }

    public final long e() {
        return this.m.a;
    }

    public final Uri f() {
        return this.m.b;
    }

    public final Map g() {
        return this.m.c;
    }
}
