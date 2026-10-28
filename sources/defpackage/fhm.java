package defpackage;

import com.facebook.litho.ComponentTree;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhm {
    public final fhd a;
    public boolean b = true;
    public fgy c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public fkz h;
    public boolean i;
    public fhq j;
    public boolean k;
    public fim l;
    public boolean m;
    public String n;
    public fjl o;
    public boolean p;
    public omj q;

    public fhm(fhd fhdVar) {
        boolean z = fna.a;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = true;
        this.i = false;
        this.k = false;
        this.l = fic.a;
        this.m = fna.h;
        this.p = false;
        this.a = fhdVar;
    }

    public final ComponentTree a() {
        if (this.c == null) {
            fhd fhdVar = this.a;
            int i = fks.g;
            this.c = new fkr(fhdVar, new fks()).a;
        }
        if (this.q != null && this.n == null) {
            this.n = this.c.c();
        }
        return new ComponentTree(this);
    }

    public final void b(fgy fgyVar) {
        if (fgyVar == null) {
            throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
        }
        this.c = fgyVar;
    }
}
