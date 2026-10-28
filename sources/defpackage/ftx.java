package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftx extends Drawable implements TextContent, Drawable.Callback, fli {
    public static final /* synthetic */ int q = 0;
    private static final Point[] r = {new Point(0, 0), new Point(0, -12), new Point(-12, -12), new Point(-12, 0), new Point(-12, 12), new Point(0, 12), new Point(12, 12), new Point(12, 0), new Point(12, -12), new Point(0, -24), new Point(-24, -24), new Point(-24, 0), new Point(-24, 24), new Point(0, 24), new Point(24, 24), new Point(24, 0), new Point(24, -24)};
    public Layout a;
    public float c;
    public boolean d;
    public boolean e;
    public CharSequence f;
    public ColorStateList g;
    public int h;
    public int i;
    public ImageSpan[] j;
    public ftw k;
    public boolean l;
    public Handler m;
    public String n;
    public int o;
    public heg p;
    private int s;
    private int t;
    private Path u;
    private boolean v;
    private Paint w;
    private ftv x;

    private final int b(int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int lineForVertical = this.a.getLineForVertical(i2);
        Layout.Alignment alignment = this.a.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = this.a;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = this.a.getLineRight(lineForVertical);
        } else {
            boolean z = layout.getParagraphDirection(lineForVertical) == -1;
            Layout layout2 = this.a;
            if (z) {
                paragraphLeft = layout2.getWidth() - this.a.getLineMax(lineForVertical);
                lineMax = this.a.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = layout2.getParagraphLeft(lineForVertical);
                lineMax = this.a.getLineMax(lineForVertical);
            }
        }
        float f = i;
        if (f < paragraphLeft || f > lineMax) {
            return -1;
        }
        try {
            return this.a.getOffsetForHorizontal(lineForVertical, f);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    private final ClickableSpan c(int i, int i2) {
        ClickableSpan[] clickableSpanArr;
        int iB = b(i, i2);
        if (iB < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.f).getSpans(iB, iB, ClickableSpan.class)) == null || clickableSpanArr.length <= 0) {
            return null;
        }
        return clickableSpanArr[0];
    }

    private final void f() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacks(this.x);
            this.x = null;
        }
        this.l = false;
    }

    private static boolean g(Rect rect, MotionEvent motionEvent) {
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private final boolean h(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = true;
        } else if (actionMasked == 0) {
            actionMasked = 0;
            z = true;
        } else {
            z = false;
        }
        return (this.e && g(getBounds(), motionEvent) && z) || actionMasked == 3;
    }

    private final boolean i(MotionEvent motionEvent) {
        return (!this.e || this.m == null || motionEvent.getAction() == 0) ? false : true;
    }

    public final void a(int i, int i2) {
        if (Color.alpha(this.i) != 0) {
            if (this.s == i && this.t == i2) {
                return;
            }
            this.s = i;
            this.t = i2;
            Paint paint = this.w;
            if (paint == null) {
                Paint paint2 = new Paint();
                this.w = paint2;
                paint2.setColor(this.i);
            } else {
                paint.setColor(this.i);
            }
            this.v = true;
            invalidateSelf();
        }
    }

    @Override // defpackage.fli
    public final boolean d(MotionEvent motionEvent, View view) {
        ClickableSpan clickableSpanC;
        Object obj;
        if (!h(motionEvent) && !i(motionEvent)) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            a(0, 0);
            f();
            return false;
        }
        if (actionMasked == 2) {
            if (!this.l && this.x != null) {
                Rect bounds = getBounds();
                if (!g(bounds, motionEvent)) {
                    f();
                } else if (this.x.a != c(((int) motionEvent.getX()) - bounds.left, ((int) motionEvent.getY()) - bounds.top)) {
                    f();
                }
            }
            actionMasked = 2;
        }
        boolean z = this.l;
        int i = 1;
        if (actionMasked == 1) {
            f();
            actionMasked = 1;
        }
        Rect bounds2 = getBounds();
        if (!g(bounds2, motionEvent)) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - bounds2.left;
        int y = ((int) motionEvent.getY()) - bounds2.top;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
            Point[] pointArr = r;
            int length = pointArr.length;
            int i2 = 0;
            ClickableSpan clickableSpan = null;
            loop0: while (true) {
                if (i2 < 17) {
                    Point point = pointArr[i2];
                    heg hegVar = this.p;
                    if (hegVar != null && (obj = hegVar.a) != null) {
                        int i3 = 0;
                        while (true) {
                            mrr[] mrrVarArr = (mrr[]) obj;
                            if (i3 < mrrVarArr.length) {
                                if (!mrrVarArr[i3].e(x, y)) {
                                    i3++;
                                }
                            }
                        }
                    }
                    int i4 = point.x + x;
                    int i5 = point.y + y;
                    ClickableSpan clickableSpanC2 = c(i4, i5);
                    if (clickableSpanC2 != null) {
                        clickableSpanC = clickableSpanC2;
                        break;
                    }
                    int iB = b(i4, i5);
                    if (((fur[]) ((Spanned) this.f).getSpans(iB, iB, fur.class)).length > 0) {
                        clickableSpanC = null;
                        break;
                    }
                    i2++;
                    clickableSpan = clickableSpanC2;
                }
                clickableSpanC = clickableSpan;
                break;
            }
        }
        clickableSpanC = c(x, y);
        if (clickableSpanC == null) {
            a(0, 0);
            return false;
        }
        if (actionMasked == 1) {
            a(0, 0);
            if (!z) {
                if (fna.F) {
                    view.post(new fuc(clickableSpanC, view, i));
                } else {
                    clickableSpanC.onClick(view);
                }
            }
        } else if (actionMasked == 0) {
            if (clickableSpanC instanceof frp) {
                ftv ftvVar = new ftv(this, (frp) clickableSpanC, view);
                this.x = ftvVar;
                this.m.postDelayed(ftvVar, ViewConfiguration.getLongPressTimeout());
            }
            Spanned spanned = (Spanned) this.f;
            a(spanned.getSpanStart(clickableSpanC), spanned.getSpanEnd(clickableSpanC));
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer;
        if (this.a != null) {
            int iSave = canvas.save();
            Rect bounds = getBounds();
            if (this.d) {
                canvas.clipRect(bounds);
            }
            canvas.translate(bounds.left, bounds.top + this.c);
            heg hegVar = this.p;
            Path path = null;
            if (hegVar != null) {
                iSaveLayer = hegVar.w() ? canvas.saveLayer(new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()), null) : 0;
                this.p.u(canvas);
            } else {
                iSaveLayer = 0;
            }
            try {
                Layout layout = this.a;
                if (this.s != this.t && Color.alpha(this.i) != 0) {
                    if (this.v) {
                        Path path2 = this.u;
                        if (path2 == null) {
                            path2 = new Path();
                            this.u = path2;
                        }
                        this.a.getSelectionPath(this.s, this.t, path2);
                        this.v = false;
                    }
                    path = this.u;
                }
                layout.draw(canvas, path, this.w, 0);
            } catch (IndexOutOfBoundsException e) {
                try {
                    String string = this.a.getText().toString();
                    StaticLayout.Builder.obtain(string, 0, string.length(), this.a.getPaint(), this.a.getWidth()).setAlignment(this.a.getAlignment()).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().draw(canvas);
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append(" [");
                    sb.append(this.n);
                    sb.append("] ");
                    CharSequence charSequence = this.f;
                    if (charSequence instanceof SpannableStringBuilder) {
                        Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                        sb.append("spans: ");
                        for (Object obj : spans) {
                            sb.append(obj.getClass().getSimpleName());
                            sb.append(", ");
                        }
                    }
                    sb.append("ellipsizedWidth: ");
                    sb.append(this.a.getEllipsizedWidth());
                    sb.append(", lineCount: ");
                    sb.append(this.a.getLineCount());
                    Log.w("TextDrawable", "Fallback drawing triggered due to IndexOutOfBoundsException: " + message + sb.toString());
                } catch (Exception e2) {
                    Log.e("TextDrawable", "Fallback drawing also failed: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            heg hegVar2 = this.p;
            if (hegVar2 != null) {
                hegVar2.t(canvas);
                if (this.p.w()) {
                    canvas.restoreToCount(iSaveLayer);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.fli
    public final boolean e(MotionEvent motionEvent) {
        return h(motionEvent) || i(motionEvent);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        CharSequence charSequence = this.f;
        return charSequence != null ? Collections.singletonList(charSequence) : Collections.EMPTY_LIST;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.g != null;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Layout layout;
        if (this.g != null && (layout = this.a) != null) {
            int color = layout.getPaint().getColor();
            int colorForState = this.g.getColorForState(iArr, this.h);
            if (colorForState != color) {
                this.a.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
