package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.youtube.music.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class mb extends ListView {
    public boolean a;
    mc b;
    private final Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private lz i;
    private final boolean j;
    private boolean k;
    private bcx l;

    public mb(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.j = z;
        setCacheColorHint(0);
    }

    private final void c(boolean z) {
        lz lzVar = this.i;
        if (lzVar != null) {
            lzVar.a = z;
        }
    }

    private final void d() {
        Drawable selector = getSelector();
        if (selector != null && this.k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    public final boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        boolean zIsSelectedChildViewEnabled;
        boolean z3;
        View childAt;
        View childAt2;
        bcx bcxVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
            } else {
                z = false;
            }
            if (z || z4) {
                this.k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.h - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            bcxVar = this.l;
            if (z) {
                if (bcxVar == null) {
                    bcxVar = new bcx(this);
                    this.l = bcxVar;
                }
                bcxVar.c(true);
                this.l.onTouch(this, motionEvent);
            } else if (bcxVar != null) {
                bcxVar.c(false);
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.k = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.h;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.h = iPointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector == null) {
                    z2 = false;
                } else if (iPointToPosition != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                    iPointToPosition = -1;
                }
                int i3 = iPointToPosition;
                if (z2) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.c;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.d;
                rect.top -= this.e;
                rect.right += this.f;
                rect.bottom += this.g;
                if (Build.VERSION.SDK_INT >= 33) {
                    zIsSelectedChildViewEnabled = isSelectedChildViewEnabled();
                } else {
                    Field field = ma.a;
                    if (field != null) {
                        try {
                            zIsSelectedChildViewEnabled = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zIsSelectedChildViewEnabled = false;
                        }
                    } else {
                        zIsSelectedChildViewEnabled = false;
                    }
                }
                if (childAt3.isEnabled() != zIsSelectedChildViewEnabled) {
                    boolean z5 = !zIsSelectedChildViewEnabled;
                    if (Build.VERSION.SDK_INT >= 33) {
                        setSelectedChildViewEnabled(z5);
                    } else {
                        Field field2 = ma.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (i3 != -1) {
                        refreshDrawableState();
                    }
                }
                if (z2) {
                    Rect rect2 = this.c;
                    float fExactCenterX = rect2.exactCenterX();
                    float fExactCenterY = rect2.exactCenterY();
                    z3 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                } else {
                    z3 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                c(z3);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z4 = false;
            }
        }
        if (z) {
            this.k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        bcxVar = this.l;
        if (z) {
            if (bcxVar == null) {
                bcxVar = new bcx(this);
                this.l = bcxVar;
            }
            bcxVar.c(true);
            this.l.onTouch(this, motionEvent);
        } else if (bcxVar != null) {
            bcxVar.c(false);
        }
        return z;
    }

    public final int b(int i, int i2) {
        int listPaddingTop = getListPaddingTop() + getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            int i3 = 0;
            View view = null;
            for (int i4 = 0; i4 < count; i4++) {
                int itemViewType = adapter.getItemViewType(i4);
                if (itemViewType != i3) {
                    view = null;
                    i3 = itemViewType;
                }
                view = adapter.getView(i4, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : 0);
                view.forceLayout();
                if (i4 > 0) {
                    listPaddingTop += dividerHeight;
                }
                listPaddingTop += view.getMeasuredHeight();
                if (listPaddingTop >= i2) {
                    return i2;
                }
            }
        }
        return listPaddingTop;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.c;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            c(true);
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.j && this.a) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.b == null) {
                mc mcVar = new mc(this, 1);
                this.b = mcVar;
                ((mb) mcVar.a).post(mcVar);
            }
            actionMasked = 10;
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !ly.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        Method method = ly.a;
                        Integer numValueOf = Integer.valueOf(iPointToPosition);
                        method.invoke(this, numValueOf, childAt, Boolean.FALSE, -1, -1);
                        ly.b.invoke(this, numValueOf);
                        ly.c.invoke(this, numValueOf);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            d();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        mc mcVar = this.b;
        if (mcVar != null) {
            mb mbVar = (mb) mcVar.a;
            mbVar.b = null;
            mbVar.removeCallbacks(mcVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        lz lzVar = drawable != null ? new lz(drawable) : null;
        this.i = lzVar;
        super.setSelector(lzVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
