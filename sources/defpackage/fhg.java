package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhg {
    public Canvas a;
    public int b;
    public int c;
    public final /* synthetic */ ComponentHost d;

    public fhg(ComponentHost componentHost) {
        this.d = componentHost;
    }

    public final void a() {
        if (this.a != null) {
            int i = this.b;
            ComponentHost componentHost = this.d;
            ahb ahbVar = componentHost.a;
            int iC = ahbVar == null ? 0 : ahbVar.c();
            while (i < iC) {
                int i2 = i + 1;
                fvi fviVar = (fvi) componentHost.a.d(i);
                Object obj = fviVar.a;
                if (obj instanceof View) {
                    this.b = i2;
                    return;
                }
                if (fviVar.c) {
                    if (fna.w) {
                        ((fjr) fviVar.d.b).b.c.c();
                    }
                    ((Drawable) obj).draw(this.a);
                } else {
                    componentHost.r++;
                }
                i = i2;
            }
            this.b = this.c;
        }
    }

    public final boolean b() {
        return this.a != null && this.b < this.c;
    }
}
