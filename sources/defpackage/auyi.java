package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auyi implements auyh {
    private static final qmc a;
    private static final qmc b;
    private static final qmc c;
    private static final qmc d;

    static {
        omm ommVar = auws.b;
        int i = 16;
        a = ommVar.x("45800021", new auuu(i), "EOgHGAQ");
        b = ommVar.w("45800022", false);
        c = ommVar.w("45776518", true);
        d = ommVar.x("10", new auuu(i), "EOgHGAQ");
    }

    @Override // defpackage.auyh
    public final axhi a(Context context) {
        return (axhi) a.ip(context);
    }

    @Override // defpackage.auyh
    public final axhi b(Context context) {
        return (axhi) d.ip(context);
    }

    @Override // defpackage.auyh
    public final boolean c(Context context) {
        return ((Boolean) b.ip(context)).booleanValue();
    }

    @Override // defpackage.auyh
    public final boolean d(Context context) {
        return ((Boolean) c.ip(context)).booleanValue();
    }
}
