package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afex extends afbe implements aeyj {
    private CharSequence A;
    private final Paint.FontMetrics B;
    private final Rect C;
    private int D;
    public final Context m;
    public final aeyk n;
    public final View.OnLayoutChangeListener o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public afex(Context context, int i) {
        super(new afbk(afbk.j(context, null, 0, i)));
        this.B = new Paint.FontMetrics();
        aeyk aeykVar = new aeyk(this);
        this.n = aeykVar;
        this.o = new jfx(this, 13, null);
        this.C = new Rect();
        this.v = 1.0f;
        this.w = 1.0f;
        this.x = 0.5f;
        this.y = 0.5f;
        this.z = 1.0f;
        this.m = context;
        aeykVar.a.density = context.getResources().getDisplayMetrics().density;
        aeykVar.a.setTextAlign(Paint.Align.CENTER);
    }

    private final float D() {
        int i;
        Rect rect = this.C;
        if (((rect.right - getBounds().right) - this.D) - this.s < 0) {
            i = ((rect.right - getBounds().right) - this.D) - this.s;
        } else {
            if (((rect.left - getBounds().left) - this.D) + this.s <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.D) + this.s;
        }
        return i;
    }

    public final afba A() {
        float f = -D();
        float fWidth = (float) ((((double) getBounds().width()) - (((double) this.u) * 1.4142135623730951d)) / 2.0d);
        return new afbf(new afbb(this.u), Math.min(Math.max(f, -fWidth), fWidth));
    }

    public final void B(CharSequence charSequence) {
        if (TextUtils.equals(this.A, charSequence)) {
            return;
        }
        this.A = charSequence;
        this.n.d = true;
        invalidateSelf();
    }

    public final void C(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.D = iArr[0];
        view.getWindowVisibleDisplayFrame(this.C);
    }

    @Override // defpackage.aeyj
    public final void a() {
        invalidateSelf();
    }

    @Override // defpackage.afbe, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fD = D();
        int i = this.u;
        canvas.scale(this.v, this.w, getBounds().left + (getBounds().width() * this.x), getBounds().top + (getBounds().height() * this.y));
        canvas.translate(fD, (float) (-((((double) i) * 1.4142135623730951d) - i)));
        super.draw(canvas);
        if (this.A == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            aeyk aeykVar = this.n;
            Paint.FontMetrics fontMetrics = this.B;
            TextPaint textPaint = aeykVar.a;
            textPaint.getFontMetrics(fontMetrics);
            float f = fontMetrics.descent + fontMetrics.ascent;
            if (aeykVar.f != null) {
                textPaint.drawableState = getState();
                aeykVar.f.c(this.m, textPaint, aeykVar.b);
                textPaint.setAlpha((int) (this.z * 255.0f));
            }
            CharSequence charSequence = this.A;
            float f2 = (int) (fCenterY - (f / 2.0f));
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), f2, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.n.a.getTextSize(), this.r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.p << 1;
        CharSequence charSequence = this.A;
        float f = 0.0f;
        if (charSequence != null) {
            aeyk aeykVar = this.n;
            String string = charSequence.toString();
            if (aeykVar.d) {
                aeykVar.c = string != null ? aeykVar.a.measureText((CharSequence) string, 0, string.length()) : 0.0f;
                if (string != null) {
                    float f2 = aeykVar.a.getFontMetrics().ascent;
                }
                aeykVar.d = false;
                f = aeykVar.c;
            } else {
                f = aeykVar.c;
            }
        }
        return (int) Math.max(i + f, this.q);
    }

    @Override // defpackage.afbe, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.t) {
            afli afliVar = new afli(l());
            afliVar.l = A();
            d(new afbk(afliVar));
        }
    }

    @Override // defpackage.afbe, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
