package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.SparseIntArray;
import app.rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aceo implements acdp, acek, aceu {
    private static final SparseIntArray f;
    public volatile fg a;
    public awmd b;
    public volatile fi c;
    public Object d;
    public volatile ek e;
    private final Context g;
    private final Handler h;
    private final awmd i;
    private final awmd j;
    private final awku k;
    private final int l;
    private final boolean m;
    private acdq n;
    private acep o;
    private boolean p;
    private final Runnable q = new acem(this, 1);
    private final Runnable r = new acem(this, 0);
    private final abxv s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f = sparseIntArray;
        sparseIntArray.put(2, 3);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(5, 6);
        sparseIntArray.put(6, 6);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(8, 7);
        sparseIntArray.put(9, 3);
        sparseIntArray.put(10, 2);
    }

    public aceo(Context context, Handler handler, awmd awmdVar, acdq acdqVar, awmd awmdVar2, awmd awmdVar3, acep acepVar, abxv abxvVar, abmt abmtVar) {
        this.g = context;
        handler.getClass();
        this.h = handler;
        awmdVar.getClass();
        this.b = awmdVar;
        acdqVar.getClass();
        this.n = acdqVar;
        awmdVar2.getClass();
        this.j = awmdVar2;
        this.i = awmdVar3;
        this.o = acepVar;
        this.m = abmtVar.e.l(357, 45801799L, false);
        this.s = true != abmtVar.g.l(313, 45740757L, false) ? null : abxvVar;
        this.k = new awku(acen.b);
        this.l = Build.VERSION.SDK_INT < 30 ? 8 : 0;
    }

    private final fi k() {
        fi fiVar = new fi();
        for (acel acelVar : this.o.e()) {
            acelVar.g(this);
            if (acelVar.h()) {
                String strE = acelVar.e();
                String string = this.g.getString(acelVar.c());
                int iB = acelVar.b();
                if (TextUtils.isEmpty(strE)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (iB == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                acelVar.j();
                fiVar.b(new PlaybackStateCompat.CustomAction(strE, string, iB, null));
            }
        }
        Bundle bundleC = this.o.c(this.n);
        bundleC.putInt("android.media.session.extra.LEGACY_STREAM_TYPE", this.n.b.B() == jrj.AUDIO_ROUTE_ALARM ? 4 : 3);
        fiVar.c = bundleC;
        return fiVar;
    }

    private final void l(int i) {
        if (this.a == null || (140776 & i) == 0) {
            return;
        }
        if (this.s != null) {
            this.e = n();
            this.q.run();
            return;
        }
        long j = 0;
        if (this.n.p() == null && (i & SemanticState.Focused) != 0) {
            j = 500;
        }
        Handler handler = this.h;
        Runnable runnable = this.q;
        handler.removeCallbacks(runnable);
        this.e = n();
        handler.postDelayed(runnable, j);
    }

    private final void m() {
        if (this.c != null) {
            if (this.s != null) {
                this.r.run();
                return;
            }
            Handler handler = this.h;
            Runnable runnable = this.r;
            handler.removeCallbacks(runnable);
            if (this.p) {
                handler.postDelayed(runnable, 1000L);
            } else {
                runnable.run();
            }
        }
    }

    private final ek n() {
        String string = this.n.t().toString();
        ek ekVar = new ek();
        ekVar.e("android.media.metadata.ARTIST", string);
        ekVar.e("android.media.metadata.ALBUM_ARTIST", string);
        ekVar.e("android.media.metadata.TITLE", this.n.u().toString());
        ekVar.c("android.media.metadata.DURATION", this.n.n());
        ekVar.c("com.google.android.youtube.MEDIA_METADATA_VIDEO_HEIGHT_PX", this.n.b.v());
        ekVar.c("com.google.android.youtube.MEDIA_METADATA_VIDEO_WIDTH_PX", this.n.b.w());
        Bitmap bitmapP = this.n.p();
        if (bitmapP != null) {
            ekVar.b("android.media.metadata.ALBUM_ART", bitmapP);
        }
        this.o.h(ekVar, this.n);
        return ekVar;
    }

    @Override // defpackage.acek
    public final void a() {
        fg fgVar = this.a;
        if (fgVar != null) {
            fg fgVar2 = (fg) fgVar.a;
            if (fgVar2.o() == null || fgVar2.o().a != 7) {
                g(SemanticState.Modal);
            }
        }
    }

    public final fg c() {
        fg fgVar = this.a;
        if (fgVar != null) {
            return fgVar;
        }
        abmx.a(abmw.MEDIASESSION, "MediaSession created");
        fg fgVar2 = (fg) this.j.io();
        fgVar2.i(3);
        Executor executor = taf.a;
        taf.o(afwl.i(new wdd(this, fgVar2, 17, (byte[]) null)));
        fi fiVarK = k();
        fiVarK.e(0, 0L, 1.0f);
        fiVarK.a = this.o.f();
        fgVar2.k(fiVarK.a());
        ((fb) fgVar2.c).h();
        this.a = fgVar2;
        return fgVar2;
    }

    public final void d() {
        if (this.m) {
            if (this.n.p() == null && this.n.q() == null) {
                return;
            }
            this.n.k(null, null);
        }
    }

    @Override // defpackage.aceu
    public final void e(boolean z) {
        if (this.s == null) {
            this.p = z;
            m();
        }
    }

    public final void f() {
        abxv abxvVar = this.s;
        if (abxvVar != null) {
            abxvVar.R(this);
        } else {
            this.n.w(this);
        }
        Iterator it = this.o.e().iterator();
        while (it.hasNext()) {
            ((acel) it.next()).g(this);
        }
    }

    public final void g(int i) {
        fg fgVar = this.a;
        if (fgVar == null || (391703 & i) == 0) {
            return;
        }
        if (i == 16) {
            acdq acdqVar = this.n;
            fg fgVar2 = (fg) fgVar.a;
            if (fgVar2.o() != null && Math.abs(acdqVar.o() - fgVar2.o().b) <= 2000) {
                return;
            }
        }
        long j = true != this.n.z() ? 0L : 6L;
        if (this.n.C()) {
            j |= 16;
        }
        if (this.n.B()) {
            j |= 32;
        }
        if (this.n.A()) {
            j |= 256;
        }
        int i2 = f.get(this.n.b(), this.l);
        fi fiVarK = k();
        fiVarK.e(i2, this.n.o(), this.n.a());
        fiVarK.a = this.o.a(this.n, j);
        fiVarK.b = this.o.b();
        acdr acdrVar = this.n.b;
        if (acdrVar.N()) {
            fiVarK.c(acdrVar.b(), acdrVar.F());
        }
        this.c = fiVarK;
        fgVar.h(this.o.d());
        m();
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if (this.s != null) {
            l(i);
            g(i);
        } else {
            g(i);
            l(i);
        }
    }

    public final void h(acer acerVar) {
        this.o = acerVar.b;
        abxv abxvVar = this.s;
        if (abxvVar != null) {
            abxvVar.S(this);
        } else {
            this.n.y(this);
        }
        acdq acdqVar = acerVar.a;
        this.n = acdqVar;
        if (abxvVar != null) {
            abxvVar.R(this);
        } else {
            acdqVar.w(this);
        }
        acerVar.getClass();
        this.b = new oqe(acerVar, 18);
        fg fgVar = (fg) this.j.io();
        Executor executor = taf.a;
        taf.o(afwl.i(new abwl(this, fgVar, 10)));
    }

    public final void i() {
        fg fgVarC = this.a;
        if (fgVarC == null) {
            fgVarC = c();
        }
        if (fgVarC.m()) {
            return;
        }
        abmx.a(abmw.MEDIASESSION, "MediaSession setActive(true)");
        fgVarC.l((PendingIntent) this.i.io());
        fgVarC.f(true);
        fgVarC.j(n().a());
        this.k.kk(acen.a);
    }

    public final void j(boolean z) {
        fg fgVar = this.a;
        if (fgVar != null) {
            this.e = null;
            this.c = null;
            if ((!txz.g(this.g) && Build.VERSION.SDK_INT < 33) || z) {
                abmx.a(abmw.MEDIASESSION, "MediaSession setActive(false)");
                fgVar.f(false);
            }
            fi fiVarK = k();
            fiVarK.e(1, 0L, 1.0f);
            fiVarK.a = this.o.g();
            fgVar.k(fiVarK.a());
            if (z) {
                fgVar.j(null);
                d();
            }
            this.k.kk(acen.b);
        }
    }
}
