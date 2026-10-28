package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abfy {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/overlay/base/LazyPlayerOverlayViewHelper");
    public final Context b;
    public View d;
    public int e;
    public tss f;
    public final abfx g;
    private int m;
    private final tuv n;
    private Handler o;
    private final StringBuilder l = new StringBuilder(140);
    private final Runnable p = new yas(this, 16, null);
    public final long c = 250;
    private final long h = 250;
    private final boolean i = true;
    private final boolean j = true;
    private final boolean k = true;

    public abfy(Context context, abfx abfxVar, tuv tuvVar) {
        this.b = context;
        this.g = abfxVar;
        this.n = tuvVar;
        getClass().getSimpleName();
    }

    private final void i(boolean z) {
        if (!z) {
            this.p.run();
            return;
        }
        if (f(1)) {
            View view = this.d;
            Runnable runnable = this.p;
            int i = bac.a;
            view.postOnAnimation(runnable);
        } else {
            Handler handler = this.o;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.o = handler;
            }
            handler.post(this.p);
        }
        e(32);
    }

    public final void a(int i) {
        this.m &= ~i;
    }

    public final void b() {
        if (f(4)) {
            a(28);
        }
    }

    public final void c() {
        if (f(1)) {
            return;
        }
        e(1);
        abfx abfxVar = this.g;
        Context context = this.b;
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.default_ad_overlay, frameLayout);
        AdProgressTextView adProgressTextView = (AdProgressTextView) frameLayout.findViewById(R.id.ad_progress_text);
        spg spgVar = abfxVar.e;
        spgVar.b(adProgressTextView);
        View viewFindViewById = frameLayout.findViewById(R.id.skip_ad_button);
        ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).bottomMargin += abfxVar.d;
        abfxVar.f.b(new syn(context, viewFindViewById, (TextView) viewFindViewById.findViewById(R.id.skip_ad_text), (ImageView) viewFindViewById.findViewById(R.id.skip_ad_icon)));
        frameLayout.getWidth();
        ((AdProgressTextView) spgVar.b).setOnClickListener(new hxg(abfxVar, 10));
        viewFindViewById.setOnClickListener(new hxg(abfxVar, 11));
        viewFindViewById.setOnTouchListener(new jot(abfxVar, 3));
        this.d = frameLayout;
        tss tssVar = new tss(this.d);
        this.f = tssVar;
        tssVar.d = this.h;
        tssVar.c = this.c;
        tssVar.h(false, false);
        tuv tuvVar = this.n;
        if (tuvVar != null) {
            this.f.d(tuvVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            r0 = 32
            boolean r0 = r3.f(r0)
            if (r0 != 0) goto L4a
            r0 = 4
            boolean r0 = r3.f(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L27
            r0 = 8
            boolean r0 = r3.f(r0)
            if (r0 == 0) goto L1e
            boolean r0 = r3.j
            if (r0 != 0) goto L23
            goto L22
        L1e:
            boolean r0 = r3.i
            if (r0 != 0) goto L23
        L22:
            r1 = r2
        L23:
            r3.i(r1)
            goto L4a
        L27:
            abfx r0 = r3.g
            boolean r0 = r0.f()
            if (r0 != 0) goto L35
            boolean r0 = r3.g()
            if (r0 != 0) goto L36
        L35:
            r1 = r2
        L36:
            r0 = 2
            boolean r0 = r3.f(r0)
            if (r0 != 0) goto L40
            if (r1 == 0) goto L4a
            goto L45
        L40:
            if (r1 != 0) goto L45
            boolean r0 = r3.k
            goto L47
        L45:
            boolean r0 = r3.i
        L47:
            r3.i(r0)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abfy.d():void");
    }

    public final void e(int i) {
        this.m |= i;
    }

    public final boolean f(int i) {
        return (this.m & i) == i;
    }

    public final boolean g() {
        tss tssVar = this.f;
        return tssVar != null && tssVar.b();
    }

    public final boolean h(int i) {
        return (this.e & i) == i;
    }

    public final String toString() {
        StringBuilder sb = this.l;
        sb.setLength(0);
        sb.append("Lazy@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" view:");
        sb.append(this.d);
        sb.append(" status: ");
        tss tssVar = this.f;
        char c = '.';
        sb.append(true != f(64) ? '.' : 'L');
        sb.append(true != f(32) ? '.' : 'P');
        sb.append(true != f(16) ? '.' : 'A');
        sb.append(true != f(8) ? '.' : 'V');
        sb.append(true != f(4) ? '.' : 'R');
        sb.append(true != f(2) ? '.' : 'D');
        sb.append(true != f(1) ? '.' : 'C');
        if (this.e != 0) {
            sb.append(" user: ");
            for (int i = 7; i >= 0; i--) {
                sb.append(true != h(1 << i) ? '.' : 'x');
                if (i % 4 == 0 && i > 0) {
                    sb.append(' ');
                }
            }
        }
        sb.append(" {");
        abfx abfxVar = this.g;
        char c2 = (abfxVar == null || !abfxVar.f()) ? '.' : (char) 10003;
        boolean z = tssVar != null;
        sb.append(c2);
        sb.append((z && this.f.b()) ? 'v' : '.');
        if (z && this.f.a()) {
            c = 'h';
        }
        sb.append(c);
        sb.append('}');
        return sb.toString();
    }
}
