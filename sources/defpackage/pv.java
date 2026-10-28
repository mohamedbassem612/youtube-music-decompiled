package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class pv extends qa implements nr {
    private List A;
    private List B;
    private pq C;
    private final nt D;
    final List a;
    public oh b;
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    int i;
    public final pp j;
    int k;
    public final List l;
    public RecyclerView m;
    public final Runnable n;
    VelocityTracker o;
    View p;
    GestureDetector q;
    public Rect r;
    public long s;
    private final float[] v;
    private float w;
    private float x;
    private int y;
    private int z;

    public pv(pp ppVar) {
        super((byte[]) null);
        this.a = new ArrayList();
        this.v = new float[2];
        this.b = null;
        this.i = -1;
        this.y = 0;
        this.l = new ArrayList();
        this.n = new bq(this, 20, null);
        this.p = null;
        this.D = new pn(this);
        this.j = ppVar;
    }

    private final int N(oh ohVar, int i) {
        if ((i & 12) != 0) {
            int i2 = this.e > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.x);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                int i3 = xVelocity <= 0.0f ? 4 : 8;
                float fAbs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.w && fAbs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.m.getWidth() * this.j.a(ohVar);
            if ((i & i2) != 0 && Math.abs(this.e) > width) {
                return i2;
            }
        }
        return 0;
    }

    private final int O(oh ohVar, int i) {
        if ((i & 3) != 0) {
            int i2 = this.f > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.x);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                int i3 = yVelocity <= 0.0f ? 1 : 2;
                float fAbs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.w && fAbs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.m.getHeight() * this.j.a(ohVar);
            if ((i & i2) != 0 && Math.abs(this.f) > height) {
                return i2;
            }
        }
        return 0;
    }

    private final void P(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private final void Q() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private static boolean R(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.nr
    public final void b(View view) {
        t(view);
        oh ohVarJ = this.m.j(view);
        if (ohVarJ != null) {
            oh ohVar = this.b;
            if (ohVar != null && ohVarJ == ohVar) {
                u(null, 0);
                return;
            }
            q(ohVarJ, false);
            if (this.a.remove(ohVarJ.a)) {
                this.j.d(this.m, ohVarJ);
            }
        }
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        rect.setEmpty();
    }

    @Override // defpackage.qa
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            float[] fArr = this.v;
            P(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        pp ppVar = this.j;
        oh ohVar = this.b;
        List list = this.l;
        int i = this.y;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            ps psVar = (ps) list.get(i2);
            float f4 = psVar.d;
            float f5 = psVar.f;
            if (f4 == f5) {
                psVar.l = psVar.h.a.getTranslationX();
            } else {
                psVar.l = f4 + (psVar.p * (f5 - f4));
            }
            float f6 = psVar.e;
            float f7 = psVar.g;
            if (f6 == f7) {
                psVar.m = psVar.h.a.getTranslationY();
            } else {
                psVar.m = f6 + (psVar.p * (f7 - f6));
            }
            int iSave = canvas.save();
            oh ohVar2 = psVar.h;
            float f8 = psVar.l;
            float f9 = psVar.m;
            int i3 = psVar.i;
            pp ppVar2 = ppVar;
            ppVar2.e(canvas, recyclerView, ohVar2, f8, f9, i3, false);
            canvas.restoreToCount(iSave);
            i2++;
            ppVar = ppVar2;
        }
        pp ppVar3 = ppVar;
        if (ohVar != null) {
            int iSave2 = canvas.save();
            ppVar3.e(canvas, recyclerView, ohVar, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    final View m(MotionEvent motionEvent) {
        ps psVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        oh ohVar = this.b;
        if (ohVar != null) {
            float f = this.g + this.e;
            float f2 = this.h + this.f;
            View view2 = ohVar.a;
            if (R(view2, x, y, f, f2)) {
                return view2;
            }
        }
        List list = this.l;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return this.m.m(x, y);
            }
            psVar = (ps) list.get(size);
            view = psVar.h.a;
        } while (!R(view, x, y, psVar.l, psVar.m));
        return view;
    }

    @Override // defpackage.qa
    public final void n(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            P(this.v);
        }
        pp ppVar = this.j;
        oh ohVar = this.b;
        List list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ps psVar = (ps) list.get(i);
            int iSave = canvas.save();
            oh ohVar2 = psVar.h;
            float f = psVar.l;
            float f2 = psVar.m;
            int i2 = psVar.i;
            ppVar.p(ohVar2);
            canvas.restoreToCount(iSave);
        }
        if (ohVar != null) {
            int iSave2 = canvas.save();
            ppVar.p(ohVar);
            canvas.restoreToCount(iSave2);
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ps psVar2 = (ps) list.get(size);
            if (!psVar2.o) {
                z = true;
            } else if (!psVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public void o(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.aH(this);
                this.m.Z(this.D);
                this.m.Y(this);
                List list = this.l;
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ps psVar = (ps) list.get(0);
                    psVar.a();
                    this.j.d(this.m, psVar.h);
                }
                list.clear();
                this.p = null;
                Q();
                pq pqVar = this.C;
                if (pqVar != null) {
                    pqVar.a = false;
                    this.C = null;
                }
                if (this.q != null) {
                    this.q = null;
                }
            }
            this.m = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.w = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.x = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.z = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
                this.m.aJ(this);
                this.m.w(this.D);
                this.m.v(this);
                this.C = new pq(this);
                this.q = new GestureDetector(this.m.getContext(), this.C);
            }
        }
    }

    final void p(int i, MotionEvent motionEvent, int i2) {
        View viewM;
        if (this.b == null && i == 2 && this.y != 2) {
            pp ppVar = this.j;
            ppVar.k();
            RecyclerView recyclerView = this.m;
            if (recyclerView.F != 1) {
                np npVar = recyclerView.n;
                int i3 = this.i;
                oh ohVarJ = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.c;
                    float y = motionEvent.getY(iFindPointerIndex) - this.d;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.z;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !npVar.canScrollHorizontally()) && ((fAbs2 <= fAbs || !npVar.canScrollVertically()) && (viewM = m(motionEvent)) != null))) {
                        ohVarJ = this.m.j(viewM);
                    }
                }
                if (ohVarJ != null) {
                    int iC = ppVar.c(this.m, ohVarJ) >> 8;
                    if ((iC & 255) != 0) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f2 = x2 - this.c;
                        float f3 = y2 - this.d;
                        float fAbs3 = Math.abs(f2);
                        float fAbs4 = Math.abs(f3);
                        float f4 = this.z;
                        if (fAbs3 >= f4 || fAbs4 >= f4) {
                            if (fAbs3 > fAbs4) {
                                if (f2 < 0.0f && (iC & 4) == 0) {
                                    return;
                                }
                                if (f2 > 0.0f && (iC & 8) == 0) {
                                    return;
                                }
                            } else {
                                if (f3 < 0.0f && (iC & 1) == 0) {
                                    return;
                                }
                                if (f3 > 0.0f && (iC & 2) == 0) {
                                    return;
                                }
                            }
                            this.f = 0.0f;
                            this.e = 0.0f;
                            this.i = motionEvent.getPointerId(0);
                            u(ohVarJ, 1);
                        }
                    }
                }
            }
        }
    }

    final void q(oh ohVar, boolean z) {
        ps psVar;
        List list = this.l;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                psVar = (ps) list.get(size);
            }
        } while (psVar.h != ohVar);
        psVar.n |= z;
        if (!psVar.o) {
            psVar.a();
        }
        list.remove(size);
    }

    public final void r(oh ohVar) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int i;
        if (this.m.isLayoutRequested() || this.y != 2) {
            return;
        }
        pp ppVar = this.j;
        ppVar.n(ohVar);
        float f = this.g + this.e;
        float f2 = this.h + this.f;
        View view = ohVar.a;
        int i2 = (int) f2;
        int i3 = (int) f;
        if (Math.abs(i2 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i3 - view.getLeft()) >= view.getWidth() * 0.5f) {
            List list = this.A;
            if (list == null) {
                this.A = new ArrayList();
                this.B = new ArrayList();
            } else {
                list.clear();
                this.B.clear();
            }
            int iRound = Math.round(this.g + this.e);
            int iRound2 = Math.round(this.h + this.f);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i4 = (iRound + width) / 2;
            int i5 = (iRound2 + height) / 2;
            np npVar = this.m.n;
            int childCount = npVar.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = npVar.getChildAt(i6);
                int i7 = i6;
                if (childAt != view && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                    oh ohVarJ = this.m.j(childAt);
                    int iAbs5 = Math.abs(i4 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int i8 = iAbs5 * iAbs5;
                    int iAbs6 = Math.abs(i5 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i9 = iAbs6 * iAbs6;
                    int size = this.A.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        i = i8 + i9;
                        if (i10 >= size) {
                            break;
                        }
                        int i12 = size;
                        if (i <= ((Integer) this.B.get(i10)).intValue()) {
                            break;
                        }
                        i11++;
                        i10++;
                        size = i12;
                    }
                    this.A.add(i11, ohVarJ);
                    this.B.add(i11, Integer.valueOf(i));
                }
                i6 = i7 + 1;
                i3 = i3;
                iRound = iRound;
                view = view;
                i2 = i2;
            }
            int i13 = i3;
            View view2 = view;
            int i14 = i2;
            List list2 = this.A;
            if (list2.size() != 0) {
                int width2 = i13 + view2.getWidth();
                int height2 = i14 + view2.getHeight();
                int left = i13 - view2.getLeft();
                int top = i14 - view2.getTop();
                int size2 = list2.size();
                int i15 = -1;
                oh ohVar2 = null;
                for (int i16 = 0; i16 < size2; i16++) {
                    oh ohVar3 = (oh) list2.get(i16);
                    if (left > 0) {
                        View view3 = ohVar3.a;
                        int right = view3.getRight() - width2;
                        if (right < 0 && view3.getRight() > view2.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                            ohVar2 = ohVar3;
                            i15 = iAbs4;
                        }
                    }
                    if (left < 0) {
                        View view4 = ohVar3.a;
                        int left2 = view4.getLeft() - i13;
                        if (left2 > 0 && view4.getLeft() < view2.getLeft() && (iAbs3 = Math.abs(left2)) > i15) {
                            ohVar2 = ohVar3;
                            i15 = iAbs3;
                        }
                    }
                    if (top < 0) {
                        View view5 = ohVar3.a;
                        int top2 = view5.getTop() - i14;
                        if (top2 > 0 && view5.getTop() < view2.getTop() && (iAbs2 = Math.abs(top2)) > i15) {
                            ohVar2 = ohVar3;
                            i15 = iAbs2;
                        }
                    }
                    if (top > 0) {
                        View view6 = ohVar3.a;
                        int bottom = view6.getBottom() - height2;
                        if (bottom < 0 && view6.getBottom() > view2.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                            ohVar2 = ohVar3;
                            i15 = iAbs;
                        }
                    }
                }
                if (ohVar2 == null) {
                    this.A.clear();
                    this.B.clear();
                    return;
                }
                int iA = ohVar2.a();
                int iA2 = ohVar.a();
                if (ppVar.h(this.m, ohVar, ohVar2)) {
                    ppVar.f(this.m, ohVar, iA2, ohVar2, iA, i13, i14);
                }
            }
        }
    }

    final void s() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    final void t(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    final void u(oh ohVar, int i) {
        boolean z;
        int i2;
        float fSignum;
        float fSignum2;
        int iO;
        if (ohVar == this.b && i == this.y) {
            return;
        }
        this.s = Long.MIN_VALUE;
        int i3 = this.y;
        q(ohVar, true);
        this.y = i;
        if (i == 2) {
            if (ohVar == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.p = ohVar.a;
        }
        int i4 = 1 << ((i << 3) + 8);
        oh ohVar2 = this.b;
        boolean z2 = false;
        if (ohVar2 != null) {
            View view = ohVar2.a;
            if (view.getParent() != null) {
                if (i3 == 2 || this.y == 2) {
                    i2 = 0;
                } else {
                    int i5 = this.j.i(ohVar2);
                    int iM = (pp.m(i5, this.m.getLayoutDirection()) >> 8) & 255;
                    if (iM != 0) {
                        int i6 = (i5 >> 8) & 255;
                        if (Math.abs(this.e) > Math.abs(this.f)) {
                            iO = N(ohVar2, iM);
                            if (iO <= 0) {
                                iO = O(ohVar2, iM);
                                if (iO <= 0) {
                                    i2 = 0;
                                }
                            } else if ((i6 & iO) == 0) {
                                iO = pp.b(iO, this.m.getLayoutDirection());
                            }
                            i2 = iO;
                        } else {
                            iO = O(ohVar2, iM);
                            if (iO <= 0) {
                                iO = N(ohVar2, iM);
                                if (iO <= 0) {
                                    i2 = 0;
                                } else if ((i6 & iO) == 0) {
                                    iO = pp.b(iO, this.m.getLayoutDirection());
                                }
                            }
                            i2 = iO;
                        }
                    } else {
                        i2 = 0;
                    }
                }
                Q();
                char c = 4;
                if (i2 == 1 || i2 == 2) {
                    fSignum = Math.signum(this.f) * this.m.getHeight();
                    fSignum2 = 0.0f;
                } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                    fSignum2 = Math.signum(this.e) * this.m.getWidth();
                    fSignum = 0.0f;
                } else {
                    fSignum2 = 0.0f;
                    fSignum = 0.0f;
                }
                if (i3 == 2) {
                    c = '\b';
                } else if (i2 > 0) {
                    c = 2;
                }
                float[] fArr = this.v;
                P(fArr);
                char c2 = c;
                z = false;
                po poVar = new po(this, ohVar2, i3, fArr[0], fArr[1], fSignum2, fSignum, i2, ohVar2);
                nl nlVar = this.m.E;
                long j = 250;
                if (nlVar == null) {
                    if (c2 == '\b') {
                        j = 200;
                    }
                } else if (c2 != '\b') {
                    j = nlVar.i;
                }
                ValueAnimator valueAnimator = poVar.j;
                valueAnimator.setDuration(j);
                this.l.add(poVar);
                poVar.h.n(false);
                valueAnimator.start();
                z2 = true;
            } else {
                z = false;
                t(view);
                this.j.d(this.m, ohVar2);
                z2 = false;
            }
            this.b = null;
        } else {
            z = false;
        }
        if (ohVar != null) {
            this.k = (this.j.c(this.m, ohVar) & (i4 - 1)) >> (this.y << 3);
            View view2 = ohVar.a;
            this.g = view2.getLeft();
            this.h = view2.getTop();
            this.b = ohVar;
            if (i == 2) {
                ohVar.a.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.m.getParent();
        if (parent != null) {
            if (this.b != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.m.n.requestSimpleAnimationsInNextLayout();
        }
        this.j.q(this.b);
        this.m.invalidate();
    }

    public final void v(oh ohVar) {
        if (!this.j.g(this.m, ohVar)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (ohVar.a.getParent() != this.m) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        s();
        this.f = 0.0f;
        this.e = 0.0f;
        u(ohVar, 2);
    }

    final void w(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.c;
        this.e = fMax;
        this.f = y - this.d;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.e = fMax;
        }
        if ((i & 8) == 0) {
            this.e = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if ((i & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }

    @Override // defpackage.nr
    public final void hO(View view) {
    }
}
