package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owo extends View {
    public own a;
    final Rect b;
    final Rect c;
    public final int[] d;
    public final ArrayList e;
    public final Rect f;
    public final Rect g;
    public final Rect h;
    public final Rect i;
    public boolean j;
    public boolean k;
    private final int[] l;
    private final int m;
    private final PointF n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owo(Context context, own ownVar) {
        super(context);
        context.getClass();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new int[2];
        this.l = new int[2];
        this.e = new ArrayList(2);
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.n = new PointF();
        this.a = ownVar;
        this.m = Math.round(context.getResources().getDisplayMetrics().density * 3.0f);
    }

    public static void a(Rect rect, Drawable drawable, float f, float f2, boolean z) {
        if (drawable == null) {
            rect.setEmpty();
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() > 0 ? drawable.getIntrinsicWidth() : 50;
        int intrinsicHeight = drawable.getIntrinsicHeight() > 0 ? drawable.getIntrinsicHeight() : 50;
        int i = (int) f2;
        int i2 = (int) (f - (intrinsicWidth * (true != z ? 0.25f : 0.75f)));
        rect.set(i2, i, intrinsicWidth + i2, intrinsicHeight + i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    private final void c(MotionEvent motionEvent, own ownVar) {
        float lineBottom;
        CharSequence text;
        View viewA = ownVar.a();
        if (viewA != null) {
            int[] iArr = this.l;
            viewA.getLocationOnScreen(iArr);
            int[] iArr2 = this.d;
            getLocationOnScreen(iArr2);
            float x = iArr2[0] + motionEvent.getX();
            float f = iArr[0];
            oxe oxeVar = (oxe) ownVar;
            owy owyVar = oxeVar.d;
            int iA = owyVar.s + ((int) owyVar.a());
            PointF pointF = this.n;
            float f2 = ((x - f) - iA) - pointF.x;
            Layout layoutG = ownVar.g();
            if (layoutG != null) {
                int lineForOffset = oxeVar.u;
                if (lineForOffset < 0 || lineForOffset >= layoutG.getLineCount()) {
                    if (oxeVar.B == 2) {
                        Layout layoutG2 = oxeVar.g();
                        if (layoutG2 != null) {
                            lineForOffset = layoutG2.getLineForOffset(oxeVar.e);
                        } else {
                            lineForOffset = -1;
                        }
                    } else {
                        Layout layoutG3 = oxeVar.g();
                        if (layoutG3 == null) {
                            lineForOffset = -1;
                        } else {
                            lineForOffset = layoutG3.getLineForOffset(oxeVar.f);
                        }
                    }
                }
                int iMax = Math.max(0, Math.min(lineForOffset, layoutG.getLineCount() - 1));
                lineBottom = layoutG.getLineBottom(iMax) - layoutG.getLineTop(iMax);
            } else {
                Drawable drawable = oxeVar.q;
                Drawable drawable2 = oxeVar.r;
                int intrinsicHeight = 50;
                if (oxeVar.B == 2) {
                    if (drawable != null) {
                        intrinsicHeight = drawable.getIntrinsicHeight();
                    }
                } else if (drawable2 != null) {
                    intrinsicHeight = drawable2.getIntrinsicHeight();
                }
                lineBottom = intrinsicHeight;
                if (lineBottom <= 0.0f) {
                    lineBottom = 50.0f;
                }
            }
            float f3 = lineBottom * 0.5f;
            float y = ((iArr2[1] + motionEvent.getY()) - iArr[1]) - pointF.y;
            int iD = owyVar.t + ((int) owyVar.d());
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(f2, (y - f3) - iD);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                oxeVar.p = f2;
                oxeVar.n = oxeVar.B == 2 ? oxeVar.e : oxeVar.f;
                oxeVar.u = -1;
                if (oxeVar.k()) {
                    oxeVar.A = 3;
                    oxeVar.y();
                    oxeVar.p = motionEventObtain.getX();
                    oxeVar.A(true);
                    oxeVar.E(viewA, motionEventObtain.getX(), oxeVar.r(motionEventObtain.getX(), motionEventObtain.getY(), oxeVar.u));
                }
            } else if (actionMasked == 1) {
                oxeVar.A = 4;
                oxeVar.v();
                oxeVar.A(false);
                oxeVar.n = -1;
                View viewA2 = oxeVar.a();
                if (viewA2 != null) {
                    oxeVar.F(viewA2);
                }
            } else if (actionMasked == 2) {
                float x2 = motionEventObtain.getX();
                float y2 = motionEventObtain.getY();
                Layout layoutG4 = oxeVar.g();
                if (layoutG4 != null && (text = layoutG4.getText()) != null) {
                    int length = text.length();
                    int i = oxeVar.B;
                    if (i == 2) {
                        int iMax2 = Math.max(0, Math.min(oxeVar.r(x2, y2, oxeVar.u), oxeVar.f - 1));
                        int i2 = oxeVar.n;
                        if (i2 < 0) {
                            i2 = oxeVar.e;
                            oxeVar.n = i2;
                        }
                        if (iMax2 != i2) {
                            int iMax3 = Math.max(0, Math.min(iMax2 < i2 ? oxeVar.C.f(text, iMax2)[0] : iMax2, oxeVar.f - 1));
                            if (iMax3 != oxeVar.e) {
                                oxeVar.D(oxeVar.f, iMax3);
                            }
                            oxeVar.n = iMax2;
                        }
                    } else if (i == 3) {
                        int iMax4 = Math.max(oxeVar.e + 1, Math.min(oxeVar.r(x2, y2, oxeVar.u), length));
                        int i3 = oxeVar.n;
                        if (i3 < 0) {
                            i3 = oxeVar.f;
                            oxeVar.n = i3;
                        }
                        if (iMax4 != i3) {
                            int iMax5 = Math.max(oxeVar.e + 1, Math.min(iMax4 > i3 ? oxeVar.C.f(text, iMax4)[1] : iMax4, length));
                            if (iMax5 != oxeVar.f) {
                                oxeVar.D(oxeVar.e, iMax5);
                            }
                            oxeVar.n = iMax4;
                        }
                    }
                }
                oxeVar.c.b(motionEventObtain.getX(), oxeVar.r(motionEventObtain.getX(), motionEventObtain.getY(), oxeVar.u), oxeVar.B, oxeVar.e, oxeVar.f, oxeVar.a());
                oxeVar.p = motionEventObtain.getX();
            } else if (actionMasked == 3) {
                oxeVar.A = 4;
                oxeVar.v();
                oxeVar.A(false);
                oxeVar.n = -1;
                View viewA3 = oxeVar.a();
                if (viewA3 != null) {
                    oxeVar.F(viewA3);
                }
            }
            motionEventObtain.recycle();
        }
    }

    public final boolean b(Rect rect, float f, float f2) {
        if (rect.isEmpty()) {
            return false;
        }
        int i = rect.left;
        int i2 = this.m;
        return f >= ((float) (i - i2)) && f <= ((float) (rect.right + i2)) && f2 >= ((float) (rect.top - i2)) && f2 <= ((float) (rect.bottom + i2));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        own ownVar = this.a;
        if (ownVar == null || !ownVar.k() || ownVar.i() || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        oxe oxeVar = (oxe) ownVar;
        boolean z2 = false;
        if (oxeVar.B == 1 || this.b.isEmpty() || this.c.isEmpty()) {
            z = false;
        } else {
            boolean zJ = ownVar.j(oxeVar.p, true);
            z = ownVar.j(oxeVar.p, false);
            z2 = zJ;
        }
        Drawable drawable = this.j ? oxeVar.q : oxeVar.r;
        if (!z2 && drawable != null) {
            Rect rect = this.b;
            if (!rect.isEmpty()) {
                drawable.setTint(oxeVar.v);
                drawable.setBounds(rect);
                drawable.draw(canvas);
            }
        }
        Drawable drawable2 = this.k ? oxeVar.q : oxeVar.r;
        if (z || drawable2 == null) {
            return;
        }
        Rect rect2 = this.c;
        if (rect2.isEmpty()) {
            return;
        }
        drawable2.setTint(oxeVar.v);
        drawable2.setBounds(rect2);
        drawable2.draw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oxe oxeVar;
        own ownVar = this.a;
        if (ownVar == null || !ownVar.k()) {
            return false;
        }
        ownVar.h();
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            Rect rect = this.b;
            if (b(rect, x, y)) {
                ((oxe) ownVar).B = 2;
                this.n.set(x - (rect.left + (rect.width() * (true == this.j ? 0.75f : 0.25f))), y - rect.top);
            } else {
                Rect rect2 = this.c;
                if (!b(rect2, x, y)) {
                    ((oxe) ownVar).B = 1;
                    this.n.set(0.0f, 0.0f);
                    return false;
                }
                ((oxe) ownVar).B = 3;
                this.n.set(x - (rect2.left + (rect2.width() * (true == this.k ? 0.75f : 0.25f))), y - rect2.top);
            }
            if (((oxe) ownVar).B == 1) {
                actionMasked = 0;
                oxeVar = (oxe) ownVar;
                if (oxeVar.B != 1) {
                    return false;
                }
                c(motionEvent, ownVar);
                if (actionMasked != 1 || actionMasked == 3) {
                    oxeVar.B = 1;
                    this.n.set(0.0f, 0.0f);
                }
            } else {
                c(motionEvent, ownVar);
            }
        } else {
            oxeVar = (oxe) ownVar;
            if (oxeVar.B != 1) {
                return false;
            }
            c(motionEvent, ownVar);
            if (actionMasked != 1) {
                oxeVar.B = 1;
                this.n.set(0.0f, 0.0f);
            } else {
                oxeVar.B = 1;
                this.n.set(0.0f, 0.0f);
            }
        }
        return true;
    }
}
