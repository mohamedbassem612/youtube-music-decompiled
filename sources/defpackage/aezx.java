package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aezx {
    protected aezy j;
    protected final List k = new ArrayList();

    protected aezx(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new aezv());
        }
    }

    protected static final float h(int i, int i2, int i3) {
        return ast.b((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(dta dtaVar);

    public abstract void d();

    public abstract void f();

    public abstract void g();
}
