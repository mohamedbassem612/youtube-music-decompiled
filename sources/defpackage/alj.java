package defpackage;

import android.graphics.Paint;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alj {
    public static final alj a = new alj();

    public final void a(Paint paint, long j) {
        int i;
        float[] fArr = alq.a;
        amb ambVar = alq.h;
        int i2 = ambVar.c;
        long j2 = 63 & j;
        int i3 = (int) j2;
        if (i3 == i2 || i3 == (i = alq.k.c) || i3 == alq.f.c || i3 == alq.g.c) {
            j = alf.e(j, alq.e);
        } else if (j == aav.a(0.0f, 0.0f, 0.0f, 0.0f, ambVar)) {
            j = 0;
        } else if (i3 > 15) {
            j = (i3 == i2 || ((i3 == alq.i.c || i3 == alq.j.c) && Build.VERSION.SDK_INT < 34) || (i3 == i && Build.VERSION.SDK_INT < 36)) ? alf.e(j, alq.e) : (j & (-64)) | (j2 - 1);
        }
        paint.setColor(j);
    }
}
