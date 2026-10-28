package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohb {
    public final CopyOnWriteArrayList a;
    public final aha b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public final ogu g;
    private final nsa h;

    public ohb(ogy... ogyVarArr) {
        ogz ogzVar = new ogz(this);
        this.h = ogzVar;
        this.g = new oha(this);
        this.a = new CopyOnWriteArrayList(ogyVarArr);
        aha ahaVar = new aha(1);
        this.b = ahaVar;
        this.c = 1;
        ogyVarArr[0].e(ogzVar);
        ahaVar.put(ogyVarArr[0], Boolean.TRUE);
    }

    public final void a() {
        if (this.f || !this.e || this.c == 0) {
            return;
        }
        this.f = true;
        ogw.c().a(this.g);
    }
}
