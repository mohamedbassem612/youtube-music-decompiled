package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class accp {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public accp(CaptioningManager.CaptionStyle captionStyle, vxz vxzVar) {
        if (vxzVar.l(272, 45763354L, false)) {
            this.a = captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : -1291845632;
        } else {
            this.a = captionStyle.backgroundColor;
        }
        this.c = captionStyle.edgeColor;
        if (Build.VERSION.SDK_INT == 26) {
            this.d = 0;
        } else {
            this.d = captionStyle.edgeType;
        }
        this.e = captionStyle.foregroundColor;
        this.b = captionStyle.windowColor;
        this.f = 7;
    }

    public static final String a(int i) {
        return String.format(Locale.US, "#%06X", Integer.valueOf(i & 16777215));
    }

    public static final String b(int i) {
        double dAlpha = ((double) Color.alpha(i)) / 255.0d;
        return dAlpha < 0.0d ? "0.0" : String.format(Locale.US, "%.2f", Double.valueOf(dAlpha));
    }

    public accp(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }
}
