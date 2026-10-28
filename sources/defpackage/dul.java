package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dul extends qa {
    public int a;
    public int b;
    public final duk c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public azw h;
    private final ViewPager2 i;
    private final RecyclerView j;
    private final LinearLayoutManager k;
    private boolean l;
    private boolean m;

    public dul(ViewPager2 viewPager2) {
        super((byte[]) null);
        this.i = viewPager2;
        RecyclerView recyclerView = viewPager2.d;
        this.j = recyclerView;
        this.k = (LinearLayoutManager) recyclerView.n;
        this.c = new duk();
        q();
    }

    private final void v(int i, float f, int i2) {
        azw azwVar = this.h;
        if (azwVar != null) {
            azwVar.v(i, f, i2);
        }
    }

    private final boolean w() {
        int i = this.a;
        return i == 1 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.m = true;
        s();
        if (this.l) {
            this.l = false;
            if (i2 > 0 || (i2 == 0 && (i >>> 31) == this.i.k())) {
                duk dukVar = this.c;
                if (dukVar.c != 0) {
                    i3 = dukVar.a + 1;
                } else {
                    i3 = this.c.a;
                }
            } else {
                i3 = this.c.a;
            }
            this.e = i3;
            if (this.d != i3) {
                o(i3);
            }
        } else if (this.a == 0) {
            int i4 = this.c.a;
            if (i4 == -1) {
                i4 = 0;
            }
            o(i4);
        }
        duk dukVar2 = this.c;
        int i5 = dukVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        v(i5, dukVar2.b, dukVar2.c);
        int i6 = dukVar2.a;
        int i7 = this.e;
        if ((i6 == i7 || i7 == -1) && dukVar2.c == 0 && this.b != 1) {
            p(0);
            q();
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (!(this.a == 1 && this.b == 1) && i == 1) {
            r(false);
            return;
        }
        if (w() && i == 2) {
            if (this.m) {
                p(2);
                this.l = true;
                return;
            }
            return;
        }
        if (w() && i == 0) {
            s();
            boolean z = this.m;
            duk dukVar = this.c;
            if (!z) {
                int i2 = dukVar.a;
                if (i2 != -1) {
                    v(i2, 0.0f, 0);
                }
            } else if (dukVar.c == 0) {
                int i3 = this.d;
                int i4 = dukVar.a;
                if (i3 != i4) {
                    o(i4);
                }
            }
            p(0);
            q();
        }
        if (this.a == 2 && i == 0 && this.f) {
            s();
            duk dukVar2 = this.c;
            if (dukVar2.c == 0) {
                int i5 = this.e;
                int i6 = dukVar2.a;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    o(i6);
                }
                p(0);
                q();
            }
        }
    }

    public final double m() {
        s();
        duk dukVar = this.c;
        return ((double) dukVar.a) + ((double) dukVar.b);
    }

    public final void o(int i) {
        azw azwVar = this.h;
        if (azwVar != null) {
            azwVar.w(i);
        }
    }

    public final void p(int i) {
        if ((this.a == 3 && this.b == 0) || this.b == i) {
            return;
        }
        this.b = i;
        azw azwVar = this.h;
        if (azwVar != null) {
            azwVar.u(i);
        }
    }

    public final void q() {
        this.a = 0;
        this.b = 0;
        this.c.a();
        this.d = -1;
        this.e = -1;
        this.l = false;
        this.m = false;
        this.g = false;
        this.f = false;
    }

    public final void r(boolean z) {
        this.g = z;
        this.a = true != z ? 1 : 4;
        int i = this.e;
        if (i != -1) {
            this.d = i;
            this.e = -1;
        } else if (this.d == -1) {
            this.d = this.k.findFirstVisibleItemPosition();
        }
        p(1);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128 A[LOOP:2: B:58:0x011c->B:61:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x012b A[SYNTHETIC] */
    public final void s() {
        int i;
        int top;
        int childCount;
        int i2;
        int top2;
        int i3;
        int bottom;
        int i4;
        duk dukVar = this.c;
        LinearLayoutManager linearLayoutManager = this.k;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        dukVar.a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            dukVar.a();
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            dukVar.a();
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth;
        if (linearLayoutManager.getOrientation() == 0) {
            i = width + rightDecorationWidth;
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.j.getPaddingLeft();
            if (this.i.k()) {
                top = -top;
            }
        } else {
            i = height + bottomDecorationHeight;
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.j.getPaddingTop();
        }
        int i5 = -top;
        dukVar.c = i5;
        if (i5 >= 0) {
            dukVar.b = i == 0 ? 0.0f : i5 / i;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = duf.a;
        int childCount2 = linearLayoutManager.getChildCount();
        if (childCount2 != 0) {
            boolean z = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount2, 2);
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt = linearLayoutManager.getChildAt(i6);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : duf.a;
                int[] iArr2 = iArr[i6];
                if (z) {
                    top2 = childAt.getLeft();
                    i3 = marginLayoutParams3.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i3 = marginLayoutParams3.topMargin;
                }
                iArr2[0] = top2 - i3;
                int[] iArr3 = iArr[i6];
                if (z) {
                    bottom = childAt.getRight();
                    i4 = marginLayoutParams3.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i4 = marginLayoutParams3.bottomMargin;
                }
                iArr3[1] = bottom + i4;
            }
            Arrays.sort(iArr, new aqv(4));
            int i7 = 1;
            while (true) {
                if (i7 >= childCount2) {
                    int[] iArr4 = iArr[0];
                    int i8 = iArr4[1];
                    int i9 = iArr4[0];
                    int i10 = i8 - i9;
                    if (i9 <= 0 && iArr[childCount2 - 1][1] >= i10) {
                        if (linearLayoutManager.getChildCount() <= 1) {
                        }
                    }
                } else if (iArr[i7 - 1][1] == iArr[i7][0]) {
                    i7++;
                }
                childCount = linearLayoutManager.getChildCount();
                for (i2 = 0; i2 < childCount; i2++) {
                    if (!duf.a(linearLayoutManager.getChildAt(i2))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.getChildCount() <= 1) {
            childCount = linearLayoutManager.getChildCount();
            while (i2 < childCount) {
                if (!duf.a(linearLayoutManager.getChildAt(i2))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(dukVar.c)));
    }

    public final boolean t() {
        return this.b == 1;
    }

    public final boolean u() {
        return this.b == 0;
    }
}
