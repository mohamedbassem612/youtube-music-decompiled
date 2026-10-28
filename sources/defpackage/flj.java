package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flj extends flp {
    final ArrayList a = new ArrayList();
    public flm b = flp.j;
    public fve c;
    public nyc d;
    public nyc e;
    public aero f;
    aero g;

    public flj(Object obj) {
        this.g = new aero(obj, (byte[]) null);
    }

    public final ArrayList a() {
        b();
        return this.a;
    }

    public final void b() {
        if (this.f != null) {
            this.a.add(new flo(new gev(this.g, this.f), this.b, this.d, this.e, this.c));
            this.f = null;
            this.b = flp.j;
            this.d = null;
            this.e = null;
            this.c = null;
        }
    }

    public flj() {
    }
}
