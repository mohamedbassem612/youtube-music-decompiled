package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tup {
    public final Rect a = new Rect();
    private final Rect b = new Rect();

    public tup() {
        b();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf A[SYNTHETIC] */
    public static void a(tup tupVar, View view, View view2) {
        int scrollY;
        Rect rect;
        Object tag;
        tupVar.getClass();
        tupVar.b();
        if (view == null || view2 == null || !tuk.q(view2, view)) {
            return;
        }
        Rect rect2 = tupVar.a;
        rect2.set(0, 0, view.getWidth(), view.getHeight());
        boolean z = false;
        while (view != view2 && view != null) {
            View view3 = (View) view.getParent();
            int left = view.getLeft() + ((int) view.getTranslationX());
            int top = view.getTop() + ((int) view.getTranslationY());
            if (view3 instanceof duc) {
                duc ducVar = (duc) view3;
                left -= ducVar.getScrollX();
                scrollY = ducVar.getScrollY();
            } else {
                if (view3 instanceof HorizontalScrollView) {
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view3;
                    left -= horizontalScrollView.getScrollX();
                    scrollY = horizontalScrollView.getScrollY();
                }
                rect2.offset(left, top);
                if (z) {
                    int width = view3.getWidth();
                    int height = view3.getHeight();
                    rect = tupVar.b;
                    rect.left = Math.max(rect.left + left, 0);
                    rect.top = Math.max(rect.top + top, 0);
                    rect.right = Math.min(rect.right + left, width);
                    rect.bottom = Math.min(rect.bottom + top, height);
                    tag = view3.getTag(R.id.view_position_clip_supplier_tag);
                    if (tag instanceof tuo) {
                        Rect rect3 = (Rect) ((tuo) tag).io();
                        rect.left = Math.max(rect.left, rect3.left);
                        rect.top = Math.max(rect.top, rect3.top);
                        rect.right = Math.min(rect.right, rect3.right);
                        rect.bottom = Math.min(rect.bottom, rect3.bottom);
                    }
                }
                z = true;
                view = view3;
            }
            top -= scrollY;
            rect2.offset(left, top);
            if (z) {
                int width2 = view3.getWidth();
                int height2 = view3.getHeight();
                rect = tupVar.b;
                rect.left = Math.max(rect.left + left, 0);
                rect.top = Math.max(rect.top + top, 0);
                rect.right = Math.min(rect.right + left, width2);
                rect.bottom = Math.min(rect.bottom + top, height2);
                tag = view3.getTag(R.id.view_position_clip_supplier_tag);
                if (tag instanceof tuo) {
                    Rect rect4 = (Rect) ((tuo) tag).io();
                    rect.left = Math.max(rect.left, rect4.left);
                    rect.top = Math.max(rect.top, rect4.top);
                    rect.right = Math.min(rect.right, rect4.right);
                    rect.bottom = Math.min(rect.bottom, rect4.bottom);
                }
            }
            z = true;
            view = view3;
        }
    }

    public final void b() {
        this.a.set(0, 0, 0, 0);
        this.b.set(0, 0, 1073741823, 1073741823);
    }

    public final boolean c() {
        Rect rect = this.b;
        Rect rect2 = this.a;
        if (Math.max(Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left), 0) > 0) {
            return Math.max(Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top), 0) > 0;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tup) {
            tup tupVar = (tup) obj;
            if (this.a.equals(tupVar.a) && this.b.equals(tupVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
