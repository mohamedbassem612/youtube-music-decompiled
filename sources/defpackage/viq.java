package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class viq {
    public agke a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private byte h;

    public final vir a() {
        agke agkeVar;
        if (this.h == 63 && (agkeVar = this.a) != null) {
            return new vir(this.b, this.c, this.d, this.e, this.f, this.g, agkeVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" chipLayoutWidthId");
        }
        if ((this.h & 2) == 0) {
            sb.append(" chipLayoutHeightId");
        }
        if ((this.h & 4) == 0) {
            sb.append(" chipBorderColorId");
        }
        if ((this.h & 8) == 0) {
            sb.append(" chipBorderWidthId");
        }
        if ((this.h & 16) == 0) {
            sb.append(" chipHorizontalPaddingId");
        }
        if ((this.h & 32) == 0) {
            sb.append(" chipFooterPaddingOffsetDp");
        }
        if (this.a == null) {
            sb.append(" themePages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.d = R.color.text_color_chip_stroke_color;
        this.h = (byte) (this.h | 4);
    }

    public final void c() {
        this.e = R.dimen.text_color_chip_stroke_width;
        this.h = (byte) (this.h | 8);
    }

    public final void d(int i) {
        this.g = i;
        this.h = (byte) (this.h | 32);
    }

    public final void e(int i) {
        this.f = i;
        this.h = (byte) (this.h | 16);
    }

    public final void f(int i) {
        this.c = i;
        this.h = (byte) (this.h | 2);
    }

    public final void g(int i) {
        this.b = i;
        this.h = (byte) (this.h | 1);
    }
}
