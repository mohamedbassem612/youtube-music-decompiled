package defpackage;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adsy {
    public TextView a;
    public TextView b;
    public View c;
    private int d;
    private int e;
    private int f;
    private byte g = 15;

    public adsy(adsz adszVar) {
        this.a = adszVar.a;
        this.b = adszVar.b;
        this.c = adszVar.c;
        this.d = adszVar.d;
        this.e = adszVar.e;
        this.f = adszVar.f;
    }

    public final adsz a() {
        if (this.g == 15) {
            return new adsz(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" fallbackBackgroundColor");
        }
        if ((this.g & 2) == 0) {
            sb.append(" fallbackTitleColor");
        }
        if ((this.g & 4) == 0) {
            sb.append(" fallbackBodyColor");
        }
        if ((this.g & 8) == 0) {
            sb.append(" fallbackLinkColor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.a = null;
        f(0);
        this.b = null;
        e(0);
        d(0);
        this.c = null;
        c();
    }

    public final void c() {
        this.g = (byte) (this.g | 1);
    }

    public final void d(int i) {
        this.f = i;
        this.g = (byte) (this.g | 8);
    }

    public final void e(int i) {
        this.e = i;
        this.g = (byte) (this.g | 4);
    }

    public final void f(int i) {
        this.d = i;
        this.g = (byte) (this.g | 2);
    }
}
