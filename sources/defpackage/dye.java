package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dye implements dyd {
    public static final dye a = new dye();

    @Override // defpackage.dyd
    public final float a(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
