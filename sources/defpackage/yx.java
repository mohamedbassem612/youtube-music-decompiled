package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yx {
    public Object a;

    public yx(abvn abvnVar, avlh avlhVar) {
        int i = 1;
        int i2 = 15;
        avlhVar.i(new abwr(i)).al(new hva(this, 5), new hmd(i2));
        abvnVar.N().i(new abwr(i)).al(new hva(this, 6), new hmd(i2));
    }

    public final void a() {
        this.a = null;
    }

    public final hmx b() {
        Object obj = this.a;
        if (obj != null) {
            return new hnb((String) obj, null);
        }
        throw new IllegalStateException("Missing required properties: uri");
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null uri");
        }
        this.a = str;
    }

    public yx() {
    }
}
