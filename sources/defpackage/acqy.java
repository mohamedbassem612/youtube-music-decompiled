package defpackage;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class acqy {
    public final int a;
    public final boolean b;
    public final Object c;

    public acqy(Context context, osd osdVar) {
        this.a = context.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600 ? 1 : 2;
        this.b = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
        this.c = osdVar;
    }

    public acqy(int i, boolean z) {
        this.a = i;
        this.c = null;
        boolean z2 = true;
        if (!z && i != 4) {
            z2 = false;
        }
        this.b = z2;
    }
}
