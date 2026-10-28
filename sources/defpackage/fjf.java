package defpackage;

import android.app.ActivityManager;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjf {
    public final int a;
    public final int b;
    public final int c;

    public fjf(exl exlVar) {
        int i = true != exlVar.a.isLowRamDevice() ? 4194304 : 2097152;
        this.a = i;
        ActivityManager activityManager = exlVar.a;
        int iRound = Math.round((activityManager.getMemoryClass() << 20) * (true != activityManager.isLowRamDevice() ? 0.4f : exlVar.d));
        float f = (((DisplayMetrics) exlVar.e.a).widthPixels * ((DisplayMetrics) exlVar.e.a).heightPixels) << 2;
        int iRound2 = Math.round(exlVar.c * f);
        int iRound3 = Math.round(f * exlVar.b);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.c = iRound3;
            this.b = iRound2;
            return;
        }
        float f2 = exlVar.c;
        float f3 = exlVar.b;
        float f4 = i2 / (f2 + f3);
        this.c = Math.round(f3 * f4);
        this.b = Math.round(f4 * exlVar.c);
    }

    public fjf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
