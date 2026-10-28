package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehm extends Drawable implements Drawable.Callback, Animatable {
    private static final List s = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    private static final Executor t = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new enf());
    private Rect A;
    private RectF B;
    private Paint C;
    private Rect D;
    private Rect E;
    private RectF F;
    private RectF G;
    private Matrix H;
    private Matrix I;
    private boolean J;
    private final ValueAnimator.AnimatorUpdateListener K;
    private final Runnable L;
    private float M;
    public egy a;
    public final eng b;
    public boolean c;
    public final ArrayList d;
    public ejq e;
    public String f;
    public egr g;
    public String h;
    public boolean i;
    public boolean j;
    public elf k;
    public boolean l;
    public boolean m;
    public final Semaphore n;
    public int o;
    public int p;
    public int q;
    eol r;
    private boolean u;
    private ejp v;
    private int w;
    private final Matrix x;
    private Bitmap y;
    private Canvas z;

    public ehm() {
        eng engVar = new eng();
        this.b = engVar;
        this.u = true;
        this.c = false;
        this.o = 1;
        this.d = new ArrayList();
        this.j = true;
        this.w = 255;
        this.l = false;
        this.p = 1;
        this.m = false;
        this.x = new Matrix();
        this.J = false;
        gga ggaVar = new gga(this, 1);
        this.K = ggaVar;
        this.n = new Semaphore(1);
        this.L = new px(this, 12);
        this.M = -3.4028235E38f;
        engVar.addUpdateListener(ggaVar);
    }

    private final boolean D() {
        return this.u || this.c;
    }

    private static final void E(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final boolean A() {
        eng engVar = this.b;
        if (engVar == null) {
            return false;
        }
        return engVar.k;
    }

    public final boolean B(egy egyVar) {
        if (this.a == egyVar) {
            return false;
        }
        this.J = true;
        k();
        this.a = egyVar;
        j();
        eng engVar = this.b;
        egy egyVar2 = engVar.j;
        engVar.j = egyVar;
        if (egyVar2 == null) {
            engVar.k(Math.max(engVar.h, egyVar.j), Math.min(engVar.i, egyVar.k));
        } else {
            engVar.k((int) egyVar.j, (int) egyVar.k);
        }
        float f = engVar.f;
        engVar.f = 0.0f;
        engVar.e = 0.0f;
        engVar.j((int) f);
        engVar.b();
        v(engVar.getAnimatedFraction());
        ArrayList arrayList = this.d;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            ehl ehlVar = (ehl) it.next();
            if (ehlVar != null) {
                ehlVar.a();
            }
            it.remove();
        }
        arrayList.clear();
        qa qaVar = egyVar.o;
        l();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void C(eol eolVar) {
        this.r = eolVar;
        ejp ejpVar = this.v;
        if (ejpVar != null) {
            ejpVar.f = eolVar;
        }
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.c;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x015b A[Catch: all -> 0x0236, InterruptedException -> 0x0252, TryCatch #2 {InterruptedException -> 0x0252, all -> 0x0236, blocks: (B:6:0x000a, B:8:0x0013, B:10:0x002d, B:11:0x0034, B:13:0x0039, B:16:0x0041, B:18:0x0050, B:19:0x0076, B:55:0x0220, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:25:0x00cb, B:27:0x00fc, B:29:0x010f, B:31:0x0149, B:33:0x0153, B:36:0x0174, B:39:0x0190, B:41:0x0195, B:43:0x019b, B:45:0x01a3, B:47:0x01ab, B:51:0x01d2, B:53:0x01d6, B:54:0x0210, B:49:0x01b3, B:50:0x01c3, B:35:0x015b, B:28:0x010b), top: B:71:0x000a }] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float fC;
        elf elfVar = this.k;
        if (elfVar != null) {
            boolean z = z();
            if (z) {
                try {
                    this.n.acquire();
                    egy egyVar = this.a;
                    if (egyVar != null) {
                        float f2 = this.M;
                        eng engVar = this.b;
                        float fC2 = engVar.c();
                        this.M = fC2;
                        if (Math.abs(fC2 - f2) * egyVar.a() >= 50.0f) {
                            v(engVar.c());
                        }
                    }
                } catch (InterruptedException unused) {
                    if (!z) {
                        return;
                    } else {
                        if ((f > fC ? 1 : (f == fC ? 0 : -1)) == 0) {
                            return;
                        }
                    }
                } finally {
                    if (z) {
                        this.n.release();
                        if (elfVar.j != this.b.c()) {
                            t.execute(this.L);
                        }
                    }
                }
            }
            if (!this.m) {
                elf elfVar2 = this.k;
                egy egyVar2 = this.a;
                if (elfVar2 != null && egyVar2 != null) {
                    Matrix matrix = this.x;
                    matrix.reset();
                    Rect bounds = getBounds();
                    if (!bounds.isEmpty()) {
                        matrix.preScale(bounds.width() / egyVar2.i.width(), bounds.height() / egyVar2.i.height());
                        matrix.preTranslate(bounds.left, bounds.top);
                    }
                    elfVar2.b(canvas, matrix, this.w);
                }
            } else if (this.a != null) {
                if (this.z == null) {
                    this.z = new Canvas();
                    this.G = new RectF();
                    this.H = new Matrix();
                    this.I = new Matrix();
                    this.A = new Rect();
                    this.B = new RectF();
                    this.C = new ehy();
                    this.D = new Rect();
                    this.E = new Rect();
                    this.F = new RectF();
                }
                canvas.getMatrix(this.H);
                canvas.getClipBounds(this.A);
                Rect rect = this.A;
                this.B.set(rect.left, rect.top, rect.right, rect.bottom);
                this.H.mapRect(this.B);
                E(this.B, this.A);
                boolean z2 = this.j;
                RectF rectF = this.G;
                if (z2) {
                    rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
                } else {
                    elfVar.c(rectF, null, false);
                }
                this.H.mapRect(this.G);
                Rect bounds2 = getBounds();
                float fWidth = bounds2.width() / getIntrinsicWidth();
                float fHeight = bounds2.height() / getIntrinsicHeight();
                RectF rectF2 = this.G;
                rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
                Drawable.Callback callback = getCallback();
                if (callback instanceof View) {
                    ViewParent parent = ((View) callback).getParent();
                    if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                        this.G.intersect(this.A.left, this.A.top, this.A.right, this.A.bottom);
                    }
                } else {
                    this.G.intersect(this.A.left, this.A.top, this.A.right, this.A.bottom);
                }
                int iCeil = (int) Math.ceil(this.G.width());
                int iCeil2 = (int) Math.ceil(this.G.height());
                if (iCeil > 0 && iCeil2 > 0) {
                    Bitmap bitmap = this.y;
                    if (bitmap == null || bitmap.getWidth() < iCeil || this.y.getHeight() < iCeil2) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                        this.y = bitmapCreateBitmap;
                        this.z.setBitmap(bitmapCreateBitmap);
                        this.J = true;
                    } else if (this.y.getWidth() > iCeil || this.y.getHeight() > iCeil2) {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.y, 0, 0, iCeil, iCeil2);
                        this.y = bitmapCreateBitmap2;
                        this.z.setBitmap(bitmapCreateBitmap2);
                        this.J = true;
                    }
                    if (this.J) {
                        Matrix matrix2 = this.x;
                        matrix2.set(this.H);
                        matrix2.preScale(fWidth, fHeight);
                        matrix2.postTranslate(-this.G.left, -this.G.top);
                        this.y.eraseColor(0);
                        elfVar.b(this.z, matrix2, this.w);
                        this.H.invert(this.I);
                        this.I.mapRect(this.F, this.G);
                        E(this.F, this.E);
                    }
                    this.D.set(0, 0, iCeil, iCeil2);
                    canvas.drawBitmap(this.y, this.D, this.E, this.C);
                }
            }
            this.J = false;
        }
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final ejp f() {
        if (getCallback() == null) {
            return null;
        }
        if (this.v == null) {
            ejp ejpVar = new ejp(getCallback(), this.r);
            this.v = ejpVar;
            String str = this.h;
            if (str != null) {
                ejpVar.e = str;
            }
        }
        return this.v;
    }

    public final void g(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        egy egyVar = this.a;
        if (egyVar == null) {
            return -1;
        }
        return egyVar.i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        egy egyVar = this.a;
        if (egyVar == null) {
            return -1;
        }
        return egyVar.i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.addUpdateListener(animatorUpdateListener);
    }

    public final void i(final ejv ejvVar, final Object obj, final enp enpVar) {
        List list;
        if (this.k == null) {
            this.d.add(new ehl() { // from class: ehh
                @Override // defpackage.ehl
                public final void a() {
                    this.a.i(ejvVar, obj, enpVar);
                }
            });
            return;
        }
        if (ejvVar == ejv.a) {
            this.k.a(obj, enpVar);
        } else {
            ejw ejwVar = ejvVar.b;
            if (ejwVar != null) {
                ejwVar.a(obj, enpVar);
            } else {
                if (this.k == null) {
                    ene.a("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.k.e(ejvVar, 0, arrayList, new ejv(new String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((ejv) list.get(i)).b.a(obj, enpVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == ehr.E) {
            v(c());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.J) {
            return;
        }
        this.J = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return A();
    }

    public final void j() {
        egy egyVar = this.a;
        if (egyVar != null) {
            int i = emj.a;
            Rect rect = egyVar.i;
            elf elfVar = new elf(this, new elh(Collections.EMPTY_LIST, egyVar, "__container", -1L, 1, -1L, null, Collections.EMPTY_LIST, new ekj(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.EMPTY_LIST, 1, null, false, null, null, 1), egyVar.h, egyVar);
            this.k = elfVar;
            elfVar.k = this.j;
        }
    }

    public final void k() {
        eng engVar = this.b;
        if (engVar.k) {
            engVar.cancel();
            if (!isVisible()) {
                this.o = 1;
            }
        }
        this.a = null;
        this.k = null;
        this.e = null;
        this.M = -3.4028235E38f;
        engVar.j = null;
        engVar.h = -2.1474836E9f;
        engVar.i = 2.1474836E9f;
        invalidateSelf();
    }

    public final void l() {
        egy egyVar = this.a;
        if (egyVar != null) {
            int i = this.p - 1;
            int i2 = Build.VERSION.SDK_INT;
            boolean z = egyVar.m;
            int i3 = egyVar.n;
            boolean z2 = false;
            if (i != 1 && (i == 2 || ((z && i2 < 28) || i3 > 4))) {
                z2 = true;
            }
            this.m = z2;
        }
    }

    public final void m() {
        this.d.clear();
        eng engVar = this.b;
        engVar.h(true);
        Iterator it = engVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(engVar);
        }
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void n() {
        if (this.k == null) {
            this.d.add(new ehl() { // from class: ehj
                @Override // defpackage.ehl
                public final void a() {
                    this.a.n();
                }
            });
            return;
        }
        l();
        if (D() || e() == 0) {
            if (isVisible()) {
                eng engVar = this.b;
                engVar.k = true;
                Set set = engVar.a;
                boolean zL = engVar.l();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(engVar, zL);
                }
                engVar.j((int) (engVar.l() ? engVar.d() : engVar.e()));
                engVar.d = 0L;
                engVar.g = 0;
                engVar.g();
                this.o = 1;
            } else {
                this.o = 2;
            }
        }
        if (D()) {
            return;
        }
        qjb qjbVar = null;
        for (String str : s) {
            egy egyVar = this.a;
            int size = egyVar.e.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    qjbVar = null;
                    break;
                }
                qjb qjbVar2 = (qjb) egyVar.e.get(i);
                String str2 = (String) qjbVar2.b;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    qjbVar = qjbVar2;
                    break;
                }
                i++;
            }
            if (qjbVar != null) {
                break;
            }
        }
        if (qjbVar != null) {
            r((int) qjbVar.a);
        } else {
            r((int) (d() < 0.0f ? b() : a()));
        }
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void o() {
        this.b.removeAllListeners();
    }

    public final void p() {
        eng engVar = this.b;
        engVar.removeAllUpdateListeners();
        engVar.addUpdateListener(this.K);
    }

    public final void q() {
        if (this.k == null) {
            this.d.add(new ehl() { // from class: ehi
                @Override // defpackage.ehl
                public final void a() {
                    this.a.q();
                }
            });
            return;
        }
        l();
        if (D() || e() == 0) {
            if (isVisible()) {
                eng engVar = this.b;
                engVar.k = true;
                engVar.g();
                engVar.d = 0L;
                if (engVar.l() && engVar.f == engVar.e()) {
                    engVar.j(engVar.d());
                } else if (!engVar.l() && engVar.f == engVar.d()) {
                    engVar.j(engVar.e());
                }
                Iterator it = engVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(engVar);
                }
                this.o = 1;
            } else {
                this.o = 3;
            }
        }
        if (D()) {
            return;
        }
        r((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void r(final int i) {
        if (this.a == null) {
            this.d.add(new ehl() { // from class: ehe
                @Override // defpackage.ehl
                public final void a() {
                    this.a.r(i);
                }
            });
        } else {
            this.b.j(i);
        }
    }

    public final void s(egr egrVar) {
        this.g = egrVar;
        ejq ejqVar = this.e;
        if (ejqVar != null) {
            ejqVar.c = egrVar;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.w = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ene.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.o;
            if (i == 2) {
                n();
            } else if (i == 3) {
                q();
            }
        } else if (this.b.k) {
            m();
            this.o = 3;
        } else if (zIsVisible) {
            this.o = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        n();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.clear();
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void t(final int i, final int i2) {
        if (this.a == null) {
            this.d.add(new ehl() { // from class: ehg
                @Override // defpackage.ehl
                public final void a() {
                    this.a.t(i, i2);
                }
            });
        } else {
            this.b.k(i, i2 + 0.99f);
        }
    }

    public final void u(final float f, final float f2) {
        egy egyVar = this.a;
        if (egyVar == null) {
            this.d.add(new ehl() { // from class: ehf
                @Override // defpackage.ehl
                public final void a() {
                    this.a.u(f, f2);
                }
            });
            return;
        }
        float f3 = egyVar.j;
        float f4 = egyVar.k;
        int i = enh.a;
        float f5 = f3 + (f * (f4 - f3));
        egy egyVar2 = this.a;
        float f6 = egyVar2.j;
        t((int) f5, (int) (f6 + (f2 * (egyVar2.k - f6))));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(final float f) {
        egy egyVar = this.a;
        if (egyVar == null) {
            this.d.add(new ehl() { // from class: ehk
                @Override // defpackage.ehl
                public final void a() {
                    this.a.v(f);
                }
            });
            return;
        }
        eng engVar = this.b;
        float f2 = egyVar.j;
        float f3 = egyVar.k;
        int i = enh.a;
        engVar.j(f2 + (f * (f3 - f2)));
    }

    public final void w(int i) {
        this.b.setRepeatCount(i);
    }

    public final void x(float f) {
        this.b.c = f;
    }

    public final void y(Boolean bool) {
        this.u = bool.booleanValue();
    }

    public final boolean z() {
        int i = this.q;
        return i != 0 && i == 2;
    }
}
