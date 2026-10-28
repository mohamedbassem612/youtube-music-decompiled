package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byh {
    public Uri a;
    public long b;
    public String c;
    public int d;
    public byte[] e;
    public Map f;
    public long g;
    public long h;
    public String i;
    public int j;
    public Object k;

    public byh(byi byiVar) {
        this.a = byiVar.a;
        this.c = byiVar.c;
        this.b = byiVar.b;
        this.d = byiVar.d;
        this.e = byiVar.e;
        this.f = byiVar.f;
        this.g = byiVar.h;
        this.h = byiVar.i;
        this.i = byiVar.j;
        this.j = byiVar.k;
        this.k = byiVar.l;
    }

    public final byi a() {
        this.a.getClass();
        return new byi(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void b(String str) {
        this.a = Uri.parse(str);
    }

    public byh() {
        this.d = 1;
        this.f = Collections.EMPTY_MAP;
        this.h = -1L;
    }
}
