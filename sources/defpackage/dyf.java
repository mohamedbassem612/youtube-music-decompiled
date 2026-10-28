package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyf implements dyd {
    public static final dyf a = new dyf();

    @Override // defpackage.dyd
    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
