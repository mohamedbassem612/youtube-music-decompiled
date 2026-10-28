package defpackage;

import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fss {
    public frj b;
    public fhd d;
    public boolean e;
    public int f;
    public boolean g;
    public List h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public fjl p;
    public boolean q;
    public fsk r;
    public boolean s;
    public boolean t;
    public abgn u;
    public float a = 4.0f;
    public fna c = fna.P;

    public fss() {
        Field field = fsy.a;
        this.f = 0;
        this.i = true;
        this.j = false;
        this.k = fna.h;
        this.l = -1;
        this.m = fna.g;
        this.n = true;
        this.o = false;
        this.q = fna.t;
        this.s = false;
        this.t = false;
    }

    public final fsy a(fhd fhdVar) {
        ComponentTree componentTree;
        ComponentTree componentTree2;
        this.d = fhd.e(fhdVar);
        if (this.p == null) {
            String str = ComponentTree.a;
            ComponentTree componentTree3 = fhdVar.g;
            this.p = componentTree3 == null ? null : componentTree3.c;
        }
        boolean z = false;
        this.i = this.i && ((componentTree2 = fhdVar.g) == null || componentTree2.k);
        boolean z2 = fna.a;
        if (this.n && ((componentTree = fhdVar.g) == null || componentTree.l)) {
            z = true;
        }
        this.n = z;
        if (this.b == null) {
            this.b = new frl(fhdVar.a, 1);
        }
        return new fsy(this);
    }

    public final void b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Estimated viewport count must be > 0: 0");
        }
        this.l = i;
    }
}
