package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auyf implements auye {
    private static final qmc a;
    private static final qmc b;

    static {
        omm ommVar = auws.b;
        a = ommVar.w("45782874", true);
        b = ommVar.x("9", new auuu(15), "EOgHGAQ");
    }

    @Override // defpackage.auye
    public final axhi a(Context context) {
        return (axhi) b.ip(context);
    }

    @Override // defpackage.auye
    public final boolean b(Context context) {
        return ((Boolean) a.ip(context)).booleanValue();
    }
}
