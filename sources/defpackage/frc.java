package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class frc extends HorizontalScrollView implements fiv {
    public final fjw a;
    public int b;
    public int c;
    public boolean d;
    public ValueAnimator e;
    public mmk f;
    public fqm g;
    public abh h;
    private int i;
    private heg j;

    public frc(Context context) {
        super(context);
        this.d = true;
        this.i = 0;
        fjw fjwVar = new fjw(context);
        this.a = fjwVar;
        addView(fjwVar);
    }

    @Override // defpackage.fiv
    public final void a(List list) {
        list.add(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b A[PHI: r5
      0x003b: PHI (r5v3 boolean) = (r5v1 boolean), (r5v4 boolean) binds: [B:10:0x0039, B:6:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    final int b(View view, Rect rect) {
        boolean z;
        int scrollX = getScrollX();
        int width = getWidth() + scrollX;
        int left = view.getLeft() + rect.left;
        int left2 = view.getLeft() + rect.right;
        int top = view.getTop() + rect.top;
        int i = this.i;
        this.i = top;
        int i2 = left - scrollX;
        boolean zC = c();
        int width2 = getWidth();
        boolean z2 = false;
        if (left < scrollX) {
            z = !zC;
            if (top >= i) {
                z2 = true;
            }
        } else {
            if (left2 <= width) {
                return 0;
            }
            z = !zC;
            if (top >= i) {
                z2 = true;
            }
        }
        int i3 = left2 - left;
        int i4 = left2 - width;
        if (i3 > width2) {
            if (true != z) {
                if (true != z2) {
                    return i2;
                }
            } else if (true == z2) {
                return i2;
            }
        } else if (true != z) {
            if (true != z2) {
                if (i2 > 0) {
                    return i2;
                }
            } else if (i4 >= 0) {
                return i2;
            }
        } else if (true != z2) {
            if (i4 >= 0) {
                return i2;
            }
        } else if (i2 > 0) {
            return i2;
        }
        return i4;
    }

    final boolean c() {
        return getLayoutDirection() == 1 || getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // android.widget.HorizontalScrollView
    protected final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        return !fna.N ? super.computeScrollDeltaToGetChildRectOnScreen(rect) : b(this.a, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        heg hegVar = this.j;
        if (hegVar != null) {
            hegVar.h(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        fqm fqmVar = this.g;
        if (fqmVar != null) {
            fqmVar.a(this);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
        fqm fqmVar = this.g;
        if (fqmVar != null) {
            fqmVar.d();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        frc frcVar;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.h != null) {
            mmk mmkVar = this.f;
            if (mmkVar != null) {
                int scrollX = getScrollX();
                int i5 = this.h.a;
                View childAt = getChildAt(0);
                CommandOuterClass$Command commandOuterClass$CommandX = mmkVar.d.x();
                aihf aihfVarCreateBuilder = asob.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                asob asobVar = (asob) aihfVarCreateBuilder.instance;
                asobVar.b |= 1;
                float f = mmkVar.c;
                asobVar.c = scrollX / f;
                asob asobVar2 = (asob) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = ason.a.createBuilder();
                float measuredHeight = childAt.getMeasuredHeight();
                aihfVarCreateBuilder2.copyOnWrite();
                ason asonVar = (ason) aihfVarCreateBuilder2.instance;
                asonVar.b |= 2;
                asonVar.d = measuredHeight / f;
                float measuredWidth = childAt.getMeasuredWidth();
                aihfVarCreateBuilder2.copyOnWrite();
                ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
                asonVar2.b |= 1;
                asonVar2.c = measuredWidth / f;
                ason asonVar3 = (ason) aihfVarCreateBuilder2.build();
                nry nryVar = mmkVar.a;
                nsl nslVar = mmkVar.b;
                frcVar = this;
                ket.N(frcVar, nryVar, commandOuterClass$CommandX, nslVar.x, nslVar.t, asobVar2, asonVar3, f);
            } else {
                frcVar = this;
            }
            frcVar.h.a = frcVar.getScrollX();
        } else {
            frcVar = this;
        }
        fqm fqmVar = frcVar.g;
        if (fqmVar != null) {
            fqmVar.b(frcVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d) {
            return false;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        fqm fqmVar = this.g;
        if (fqmVar != null) {
            fqmVar.c(this, motionEvent);
        }
        return zOnTouchEvent;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!fna.N) {
            return super.performAccessibilityAction(i, bundle);
        }
        if (this.d) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int iMax = Math.max(0, this.a.getWidth() - width);
            boolean zC = c();
            if (i != 4096) {
                if (i == 8192 || i == 16908345) {
                    int iMin = zC ? Math.min(getScrollX() + width, iMax) : Math.max(0, getScrollX() - width);
                    if (iMin != getScrollX()) {
                        smoothScrollTo(iMin, 0);
                        return true;
                    }
                } else if (i != 16908347) {
                    return super.performAccessibilityAction(i, bundle);
                }
            }
            int iMax2 = zC ? Math.max(0, getScrollX() - width) : Math.min(getScrollX() + width, iMax);
            if (iMax2 != getScrollX()) {
                smoothScrollTo(iMax2, 0);
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (!fna.N) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        int iB = b(view, rect);
        if (iB == 0) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        if (z) {
            scrollBy(iB, 0);
        } else {
            smoothScrollBy(iB, 0);
        }
        return true;
    }

    @Override // defpackage.fit
    public final heg x() {
        return this.j;
    }

    @Override // defpackage.fit
    public final void y(heg hegVar) {
        this.j = hegVar;
    }
}
