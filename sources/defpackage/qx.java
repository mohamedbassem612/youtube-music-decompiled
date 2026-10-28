package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qx {
    public final int a;
    public final int b;
    public final Object c;

    public qx(int i, int i2, awqg awqgVar) {
        this.a = i;
        this.b = i2;
        this.c = awqgVar;
    }

    public final int a(boolean z) {
        return z ? this.b : this.a;
    }

    public qx(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    public qx(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
    }
}
