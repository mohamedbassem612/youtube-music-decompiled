package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dwk extends dwj {
    private final Object a;
    private final int b;

    public dwk(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // defpackage.dwj
    public final dwj a(String str, awqg awqgVar) {
        Object obj = this.a;
        return !((Boolean) awqgVar.invoke(obj)).booleanValue() ? new dwi(obj, str, this.b) : this;
    }

    @Override // defpackage.dwj
    public final Object b() {
        return this.a;
    }
}
