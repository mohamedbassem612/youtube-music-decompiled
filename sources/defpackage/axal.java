package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axal {
    public static final axdy a = new axdy("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final awzc c(axah axahVar, awou awouVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? axahVar : new axbk(axahVar, awouVar, i, i2);
    }

    public static final axae d(int i, int i2, int i3) {
        if (i > 0 || i2 > 0 || i3 == 1) {
            return new axak(i, i2 + i, i3);
        }
        awuw.i(i3);
        throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(awuw.i(i3)));
    }

    public static /* synthetic */ axae e(int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return d((i2 & 1) ^ 1, 0, i);
    }
}
