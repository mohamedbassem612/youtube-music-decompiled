package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acld implements acko {
    private final ijt a = new ijt(16);

    @Override // defpackage.acko
    public final int a() {
        return 1;
    }

    @Override // defpackage.acko
    public final /* synthetic */ String b() {
        return aavv.u(this);
    }

    @Override // defpackage.acko
    public final Typeface c(Context context, int i, int i2) {
        Typeface typefaceA;
        int i3 = 400;
        int i4 = 1;
        int iH = i <= 0 ? 400 : awro.h(i, 1, 1000);
        if (iH != 400) {
            i3 = iH;
        } else if ((i2 & 1) != 0) {
            i3 = 700;
        }
        int i5 = i2 & 2;
        int i6 = i5 == 0 ? 0 : 2;
        long jT = aavv.t(i3, i6, null);
        acla aclaVar = (acla) this.a.a;
        Typeface typeface = (Typeface) aclaVar.a(jT);
        if (typeface == null) {
            boolean z = i5 != 0;
            String str = "sans-serif";
            if (Build.VERSION.SDK_INT >= 28) {
                typefaceA = ackp.b(context, "sans-serif", i3, z);
            } else {
                if (i3 > 0 && i3 < 251) {
                    str = "sans-serif-thin";
                } else if (i3 >= 251 && i3 < 351) {
                    str = "sans-serif-light";
                } else if (i3 >= 451 && i3 < 551) {
                    str = "sans-serif-medium";
                } else if (i3 >= 851 && i3 < 1001) {
                    str = "sans-serif-black";
                }
                if (i3 < 551 || i3 >= 851) {
                    i4 = i6;
                } else if (z) {
                    i4 = 3;
                }
                typefaceA = ackp.a(context, str, i4);
            }
            typeface = typefaceA;
            typeface.getClass();
            aclaVar.b(jT, typeface);
        }
        return typeface;
    }
}
