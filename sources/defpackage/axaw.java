package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axaw {
    public static final axdy a = new axdy("NONE");
    public static final axdy b = new axdy("PENDING");

    public static final axaf a(Object obj) {
        if (obj == null) {
            obj = axca.a;
        }
        return new axav(obj);
    }

    public static final awzc b(axat axatVar, awou awouVar, int i, int i2) {
        boolean z = awuv.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? axal.c(axatVar, awouVar, i, i2) : axatVar;
    }
}
