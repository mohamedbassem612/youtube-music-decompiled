package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xlc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/background/DefaultMdxBackgroundPlaybackController");
    public final Context b;
    public final xru c;
    public final mbc e;
    public final Intent f;
    public xlg g;
    public long h;
    public boolean i;
    public xzc j;
    public boolean k;
    public final xlj m;
    public final ycp n;
    public final abxv o;
    public final elq p;
    private final xxj q = new xxj(this);
    public final xzf l = new xol(this, 1);
    public final Handler d = new Handler(Looper.getMainLooper());

    public xlc(Context context, xru xruVar, abxv abxvVar, mbc mbcVar, xlj xljVar, ycp ycpVar, Intent intent, elq elqVar) {
        this.b = context;
        this.c = xruVar;
        this.o = abxvVar;
        this.e = mbcVar;
        this.m = xljVar;
        this.n = ycpVar;
        this.f = intent;
        this.p = elqVar;
    }

    public final void a() {
        this.d.removeCallbacksAndMessages(null);
        this.n.d(this.l);
        this.c.I(this);
        this.g = null;
        this.k = false;
        this.j = null;
    }

    public final void b() {
        xzc xzcVar = this.j;
        if (xzcVar != null) {
            this.k = true;
            xzcVar.J();
            elq elqVar = this.p;
            xlg xlgVar = this.g;
            elqVar.z(7, xlgVar.e, this.i, xlgVar.d.g);
        }
        a();
    }

    public final void c(int i, xzc xzcVar) {
        xlg xlgVar = this.g;
        xlgVar.getClass();
        xlj xljVar = this.m;
        xljVar.d();
        xljVar.d = xlgVar;
        xgn xgnVar = xljVar.e.g;
        xgnVar.b(xlh.b, null, null);
        xgnVar.l(new xgj(xlh.e));
        xgnVar.l(new xgj(xlh.f));
        xgt xgtVarA = xgnVar.a();
        atr atrVarB = xljVar.b(false, xgtVarA);
        Context context = xljVar.c;
        atrVarB.l(context.getResources().getString(R.string.mdx_background_playback_error_title, xlgVar.b));
        atrVarB.k(context.getResources().getString(R.string.mdx_background_playback_error_text));
        Intent intentA = xljVar.a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY", xgtVarA);
        Optional optional = xljVar.f;
        optional.isPresent();
        ((sxn) optional.get()).b(intentA, xljVar.getClass());
        atrVarB.h = qof.a(context, 0, intentA, 1275068416, 0);
        atrVarB.g(aag.h(null, atr.c(context.getResources().getString(R.string.mdx_background_playback_error_help)), qof.a(context, 0, xljVar.a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP", xgtVarA), 1275068416, 0), new Bundle(), null));
        int i2 = 6;
        xljVar.b.b(null, 6, atrVarB.a());
        agrx agrxVar = agso.a;
        if (i == 0) {
            i2 = 2;
        } else if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(a.bR(i, "Invalid error value "));
            }
            xzcVar.getClass();
            i2 = 4;
        }
        elq elqVar = this.p;
        xlg xlgVar2 = this.g;
        elqVar.z(i2, xlgVar2.e, this.i, xlgVar2.d.g);
        a();
    }

    public final void d(xlg xlgVar, boolean z) {
        this.i = z;
        xxj xxjVar = this.q;
        xxjVar.getClass();
        xlj xljVar = this.m;
        xljVar.g = xxjVar;
        xljVar.d();
        xljVar.d = null;
        xgn xgnVar = xljVar.e.g;
        xgnVar.b(xlh.b, null, null);
        xgnVar.l(new xgj(xlh.c));
        xgnVar.l(new xgj(xlh.d));
        xgt xgtVarA = xgnVar.a();
        atr atrVarB = xljVar.b(true, xgtVarA);
        Context context = xljVar.c;
        atrVarB.l(context.getString(R.string.mdx_background_playback_connecting, xlgVar.b));
        atrVarB.l = 1;
        atrVarB.g(aag.h(null, atr.c(context.getResources().getString(R.string.mdx_background_playback_cancel)), qof.a(context, 0, xljVar.a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL", xgtVarA), 1275068416, 0), new Bundle(), null));
        int i = 6;
        xljVar.b.b(null, 6, atrVarB.a());
        if (xlgVar.c <= 0) {
            xlf xlfVar = new xlf(xlgVar);
            xlfVar.b(10);
            xlgVar = xlfVar.a();
        }
        this.h = this.e.f().toEpochMilli();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.N(this);
        } else {
            this.d.post(new xfd(this, i));
        }
        this.g = xlgVar;
        Handler handler = this.d;
        handler.removeCallbacksAndMessages(null);
        handler.post(new xfd(this, 7, null));
    }
}
