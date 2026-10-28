package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mej {
    public static final /* synthetic */ int a = 0;
    private static final agke b = agke.r("Failed to lookup loading progress of resource", "Dropping call to function TextFieldController_handleBlur");

    public static int a(int i, int i2, int i3) {
        return i > 0 ? Math.min(i3 - i2, i) : Math.max(i, -i2);
    }

    public static Rect b(View view) {
        return new Rect(0, 0, view.getWidth(), view.getHeight());
    }

    public static boolean c(boolean z, Throwable th) {
        return z && Collection.EL.stream(b).anyMatch(new jmy(ahno.Z(th.getMessage()), 3));
    }

    public static void d(View view) {
        View childAt;
        int iA;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        if (view.getGlobalVisibleRect(rect) && rect.height() == view.getHeight() && rect2.contains(rect)) {
            return;
        }
        Rect rectB = b(view);
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = parent;
                if (rpi.x(view2)) {
                    Rect rectV = rpi.v(rectB, view, view2);
                    Rect rectB2 = b(view2);
                    rectB2.set(rectB2.left + view2.getPaddingLeft(), rectB2.top + view2.getPaddingTop(), rectB2.right - view2.getPaddingRight(), rectB2.bottom - view2.getPaddingBottom());
                    int iHeight = (rectV.top - rectB2.top) - ((int) ((rectB2.height() - rectV.height()) * 0.75f));
                    if (view2 instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view2;
                        iA = a(iHeight, recyclerView.computeVerticalScrollOffset(), recyclerView.computeVerticalScrollRange());
                    } else {
                        iA = (((view2 instanceof ScrollView) || (view2 instanceof NestedScrollView)) && (childAt = ((ViewGroup) view2).getChildAt(0)) != null) ? a(iHeight, view2.getScrollY(), Math.max(0, childAt.getHeight() - ((view2.getHeight() - view2.getPaddingBottom()) - view2.getPaddingTop()))) : 0;
                    }
                    rpi.w(view2, iA);
                    Rect rect3 = new Rect(rectV);
                    rect3.offset(0, -iA);
                    view = view2;
                    rectB = rect3;
                }
            }
        }
    }
}
