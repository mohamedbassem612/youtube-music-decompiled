package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class spf {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d = false;

    public spf(Object obj) {
        this.a = obj;
    }

    public abstract void a(Object obj, boolean z);

    public final void b(Object obj) {
        this.d = true;
        this.b = obj;
        c();
        Object obj2 = this.a;
        if (obj2 != null) {
            d(obj2, this.c);
        }
    }

    public abstract void c();

    public final void d(Object obj, boolean z) {
        if (this.d) {
            a(obj, z);
        }
        this.a = obj;
        this.c = z;
    }
}
