package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihr implements acdp, ihn, ihm, abdz, iiq {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/widget/controllers/MusicWidgetController");
    private static final agke j = agke.u(xhb.b(79498), xhb.b(79497), xhb.b(79495), xhb.b(79494), xhb.b(79500));
    public final Context b;
    public final acdq c;
    public AppWidgetManager d;
    public final Set e;
    public final Map f;
    public final Executor g;
    public boolean h;
    public boolean i;
    private SharedPreferences k;
    private final avlh l;
    private final avlh m;
    private final ihs n;
    private final abea o;
    private final xgn p;
    private final iir q;
    private final iio r;
    private boolean s;
    private boolean t;
    private final avmb u;
    private final awkx v = new awkx();

    public ihr(Context context, acdq acdqVar, avlh avlhVar, avlh avlhVar2, ihs ihsVar, xgn xgnVar, abea abeaVar, Set set, Map map, iir iirVar, iio iioVar, Executor executor, avmb avmbVar) {
        context.getClass();
        this.b = context;
        acdqVar.getClass();
        this.c = acdqVar;
        this.l = avlhVar;
        this.m = avlhVar2;
        this.n = ihsVar;
        this.o = abeaVar;
        this.p = xgnVar;
        this.e = set;
        this.f = map;
        this.q = iirVar;
        this.r = iioVar;
        this.g = executor;
        avmbVar.getClass();
        this.u = avmbVar;
    }

    public static int f(int i) {
        switch (i) {
            case 2:
            case 5:
            case 9:
                return 1;
            case 3:
            case 6:
            case 10:
                return 2;
            case 4:
            default:
                return 0;
            case 7:
                return 3;
            case 8:
                return 6;
        }
    }

    private final void g(int i, Bundle bundle) {
        if (this.d != null) {
            this.v.kk(new aero(i, bundle));
        }
    }

    private final void h(int i, Bundle bundle) {
        if (i != 5) {
            acdq acdqVar = this.c;
            bundle.putCharSequence("title", acdqVar.u());
            bundle.putCharSequence("byline", acdqVar.t());
            bundle.putBoolean("hasNext", acdqVar.B());
            bundle.putBoolean("hasPrev", acdqVar.C());
            bundle.putInt("likeState", this.n.b.f);
            bundle.putBoolean("isSeekFocusedVideo", acdqVar.D());
        }
        acdq acdqVar2 = this.c;
        ahng.aG(bundle, "thumbnails_proto", acdqVar2.L().l());
        this.q.a(bundle);
        agrx agrxVar = agso.a;
        hashCode();
        acdqVar2.u();
        g(i, bundle);
    }

    @Override // defpackage.ihm
    public final void a() {
        if (!this.s) {
            c();
        }
        agrx agrxVar = agso.a;
        this.h = true;
        Bundle bundle = new Bundle();
        this.q.a(bundle);
        hashCode();
        g(5, bundle);
    }

    @Override // defpackage.ihm
    public final void c() {
        if (this.s) {
            return;
        }
        agrx agrxVar = agso.a;
        int i = 1;
        this.s = true;
        Context context = this.b;
        this.d = AppWidgetManager.getInstance(context);
        this.c.w(this);
        this.n.a = this;
        iir iirVar = this.q;
        iirVar.d = this;
        this.l.i(new abwr(i)).al(new icy(this, 20), new ihp(i));
        this.m.i(new abwr(i)).x(new jna(i)).al(new iho(this, i), new ihp(i));
        int i2 = 0;
        this.k = context.getSharedPreferences("PlaybackWidgetPreferences", 0);
        this.o.e(this);
        this.v.aa(500L, TimeUnit.MILLISECONDS, this.u, false).al(new iho(this, i2), new ihp(i2));
        iirVar.b();
        iio iioVar = this.r;
        if (iioVar.b.a()) {
            return;
        }
        ListenableFuture listenableFuture = iioVar.f;
        if ((listenableFuture == null || listenableFuture.isDone()) && (iioVar.d.io() instanceof hwm)) {
            iioVar.f = ((ibg) iioVar.c.io()).a();
            ListenableFuture listenableFuture2 = iioVar.f;
            iin iinVar = new iin(iioVar, 0);
            Executor executor = iioVar.e;
            long j2 = afwl.a;
            listenableFuture2.addListener(new ahei(listenableFuture2, new afwj(afty.c(false), iinVar, 0)), executor);
        }
    }

    @Override // defpackage.ihm
    public final void d() {
        if (this.h) {
            return;
        }
        if (!this.s) {
            c();
        }
        this.i = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isPlaybackEnded", this.t);
        this.q.a(bundle);
        agrx agrxVar = agso.a;
        hashCode();
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r2 != false) goto L26;
     */
    @Override // defpackage.ihm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r6 = this;
            android.appwidget.AppWidgetManager r0 = r6.d
            if (r0 != 0) goto L7
            agrx r6 = defpackage.agso.a
            goto L6c
        L7:
            acdq r0 = r6.c
            int r1 = r0.b()
            int r1 = f(r1)
            boolean r2 = r6.h
            if (r2 != 0) goto L61
            r2 = 1
            if (r1 == r2) goto L41
            java.lang.CharSequence r3 = r0.u()
            r4 = 0
            if (r3 == 0) goto L2b
            java.lang.CharSequence r3 = r0.u()
            int r3 = r3.length()
            if (r3 == 0) goto L2b
            r3 = r4
            goto L2c
        L2b:
            r3 = r2
        L2c:
            java.lang.CharSequence r5 = r0.t()
            if (r5 == 0) goto L3d
            java.lang.CharSequence r0 = r0.t()
            int r0 = r0.length()
            if (r0 == 0) goto L3d
            r2 = r4
        L3d:
            if (r3 == 0) goto L41
            if (r2 != 0) goto L61
        L41:
            boolean r0 = r6.i
            if (r0 == 0) goto L58
            agrx r0 = defpackage.agso.a
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r1 = r6.t
            java.lang.String r2 = "isPlaybackEnded"
            r0.putBoolean(r2, r1)
            r1 = 4
            r6.h(r1, r0)
            goto L6c
        L58:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r6.h(r1, r0)
            goto L6c
        L61:
            agrx r0 = defpackage.agso.a
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 5
            r6.h(r1, r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihr.e():void");
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((i & 262499) != 0) {
            agrx agrxVar = agso.a;
            int iF = f(this.c.b());
            if (iF != 0) {
                this.t = iF == 3;
                this.h = false;
                this.i = false;
                e();
            }
        }
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        if (this.k.getBoolean("IsWidgetEnabled", false) && abdy.b.equals(abdyVar)) {
            if (this.k == null) {
                c();
            }
            agke agkeVar = j;
            int i = ((agpi) agkeVar).d;
            for (int i2 = 0; i2 < i; i2++) {
                this.p.l(new xgj((xhc) agkeVar.get(i2)));
            }
            this.p.l(new xgj(this.t ? xhb.b(79499) : xhb.b(79496)));
        }
    }
}
