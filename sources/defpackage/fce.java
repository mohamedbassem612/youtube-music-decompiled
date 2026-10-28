package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fce extends Drawable implements Animatable {
    public final fcd a;
    public boolean b;
    public int c;
    public List e;
    private boolean f;
    private boolean g;
    private boolean i;
    private Paint j;
    private Rect k;
    private boolean h = true;
    public int d = -1;

    public fce(fcd fcdVar) {
        this.a = fcdVar;
    }

    private final Paint e() {
        Paint paint = this.j;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(2);
        this.j = paint2;
        return paint2;
    }

    private final Rect f() {
        Rect rect = this.k;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = new Rect();
        this.k = rect2;
        return rect2;
    }

    private final void g() {
        gzj.bJ(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        fcj fcjVar = this.a.a;
        if (fcjVar.a() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f) {
            return;
        }
        this.f = true;
        if (fcjVar.f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        List list = fcjVar.b;
        if (list.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = list.isEmpty();
        list.add(this);
        if (zIsEmpty && !fcjVar.d) {
            fcjVar.d = true;
            fcjVar.f = false;
            fcjVar.b();
        }
        invalidateSelf();
    }

    private final void h() {
        this.f = false;
        fcj fcjVar = this.a.a;
        List list = fcjVar.b;
        list.remove(this);
        if (list.isEmpty()) {
            fcjVar.f();
        }
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final ByteBuffer b() {
        return ((ete) this.a.a.a).a.asReadOnlyBuffer();
    }

    public final void c(dta dtaVar) {
        if (dtaVar != null) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(dtaVar);
        }
    }

    public final void d() {
        this.d = 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            return;
        }
        if (this.i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.i = false;
        }
        fcj fcjVar = this.a.a;
        fci fciVar = fcjVar.e;
        canvas.drawBitmap(fciVar != null ? fciVar.b : fcjVar.h, (Rect) null, f(), e());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        e().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        e().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        gzj.bJ(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.h = z;
        if (!z) {
            h();
        } else if (this.g) {
            g();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.g = true;
        this.c = 0;
        if (this.h) {
            g();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.g = false;
        h();
    }
}
