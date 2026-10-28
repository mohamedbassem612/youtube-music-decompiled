package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btc {
    public static final /* synthetic */ int a = 0;

    static {
        aerz aerzVar = new aerz(null, null);
        aerzVar.j(16, 17, 18, 21, 22, 23, 28, 30);
        aerzVar.h();
        aerz aerzVar2 = new aerz(null, null);
        aerzVar2.j(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32);
        aerzVar2.h();
    }

    public static final btd a(aerz aerzVar) {
        return new btd(aerzVar.h());
    }

    public static final void b(btd btdVar, aerz aerzVar) {
        int i = btd.b;
        bsb bsbVar = btdVar.a;
        for (int i2 = 0; i2 < bsbVar.b(); i2++) {
            aerzVar.i(bsbVar.a(i2));
        }
    }

    public static final void c(int i, boolean z, aerz aerzVar) {
        if (z) {
            aerzVar.i(i);
        }
    }
}
