package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwt {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final awmd e;
    public final awmd f;
    public amqm g;
    public wwu h;
    public xck i;
    private final wyz j;
    private final xpl k;

    public wwt(Context context, wyz wyzVar, tbt tbtVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, xpl xplVar) {
        this.a = awmdVar;
        this.b = awmdVar3;
        this.c = awmdVar4;
        this.d = awmdVar5;
        this.e = awmdVar6;
        this.j = wyzVar;
        this.f = awmdVar2;
        this.k = xplVar;
        adsj.b(context);
        tbtVar.f(this);
    }

    public final void a(xck xckVar) {
        int width;
        int i;
        if (xckVar != null) {
            Context context = xckVar.getContext();
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            boolean zV = twm.v(context);
            wyz wyzVar = this.j;
            if (wyzVar.c) {
                int[] iArr = {displayMetrics.heightPixels, displayMetrics.widthPixels, resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_purchase_dialog_container_max_width)};
                width = iArr[0];
                i = 1;
                for (int i2 = 1; i2 < 3; i2++) {
                    int i3 = iArr[i2];
                    if (i3 < width) {
                        width = i3;
                    }
                }
            } else if (zV) {
                width = xckVar.getWidth();
                i = 8388693;
            } else {
                width = -1;
                i = 87;
            }
            wyzVar.a = width;
            wyzVar.b = i;
            Iterator it = wyzVar.d.iterator();
            while (it.hasNext()) {
                ((wyy) it.next()).b();
            }
        }
    }

    public final void b() {
        this.g = null;
        if (this.h != null) {
            ((wwk) this.f.io()).g();
            wxo wxoVar = ((wws) this.c.io()).a;
            if (wxoVar != null && ((xbw) wxoVar).u) {
                wxoVar.b(false, true, false);
            }
            wwp wwpVar = (wwp) this.e.io();
            wwpVar.b = null;
            wwn wwnVar = (wwn) this.a.io();
            wwnVar.r.n(wwpVar);
            this.h.a().d();
            if (this.h.b() != wwnVar.f()) {
                this.h.b().k();
            } else {
                wwnVar.v();
                wwnVar.w();
            }
        }
    }

    @tcc
    public void handlePlayerGeometryEvent(aaxo aaxoVar) {
        abnr abnrVar = aaxoVar.a;
        abnr abnrVar2 = abnr.FULLSCREEN;
        if (abnrVar == abnrVar2 || abnrVar == abnr.DEFAULT) {
            this.j.c = abnrVar == abnrVar2;
            if (abnrVar == abnrVar2) {
                this.k.g();
            }
            a(this.i);
        }
    }
}
