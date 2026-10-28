package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auxw implements auxv {
    private static final qmc a;
    private static final qmc b;

    static {
        omm ommVar = auws.b;
        a = ommVar.w("45738533", true);
        b = ommVar.x("12", new auuu(12), "EAAYAg");
    }

    @Override // defpackage.auxv
    public final axhi a(Context context) {
        return (axhi) b.ip(context);
    }

    @Override // defpackage.auxv
    public final boolean b(Context context) {
        return ((Boolean) a.ip(context)).booleanValue();
    }
}
