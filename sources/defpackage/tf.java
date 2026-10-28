package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tf {
    private final String e;
    public vm d = null;
    public th a = new th(0, 0);
    public th b = new th(-1, -1);
    public th c = new th(0, 0);

    public tf(String str) {
        azs.l(str);
        this.e = str;
    }

    public final tg a() {
        vm vmVar = this.d == null ? new vm((byte[]) null) : null;
        th thVar = this.a;
        int i = thVar.a;
        int i2 = thVar.b;
        th thVar2 = this.b;
        int i3 = thVar2.a;
        int i4 = thVar2.b;
        th thVar3 = this.c;
        return new tg(i, i2, i3, i4, thVar3.a, thVar3.b, vmVar, this.d);
    }
}
