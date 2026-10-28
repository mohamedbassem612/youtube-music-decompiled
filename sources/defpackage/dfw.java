package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.OverlayListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dfw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ dge b;

    public dfw(dge dgeVar, boolean z) {
        this.b = dgeVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iH;
        HashMap map;
        HashMap map2;
        Bitmap bitmap;
        dge dgeVar = this.b;
        dgeVar.h.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dgeVar.N) {
            dgeVar.O = true;
            return;
        }
        boolean z = this.a;
        int i = dge.i(dgeVar.k);
        dge.p(dgeVar.k, -1);
        dgeVar.u(dgeVar.v());
        View decorView = dgeVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dgeVar.getWindow().getAttributes().width, 1073741824), 0);
        dge.p(dgeVar.k, i);
        if (!(dgeVar.i.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dgeVar.i.getDrawable()).getBitmap()) == null) {
            iH = 0;
        } else {
            iH = dgeVar.h(bitmap.getWidth(), bitmap.getHeight());
            dgeVar.i.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iJ = dgeVar.j(dgeVar.v());
        int size = dgeVar.p.size();
        int size2 = dgeVar.x() ? dgeVar.x * dgeVar.d.f().size() : 0;
        if (size > 0) {
            size2 += dgeVar.z;
        }
        int iMin = Math.min(size2, dgeVar.y);
        if (true != dgeVar.M) {
            iMin = 0;
        }
        int iMax = Math.max(iH, iMin) + iJ;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (dgeVar.g.getMeasuredHeight() - dgeVar.h.getMeasuredHeight());
        if (iH <= 0 || iMax > iHeight) {
            if (dge.i(dgeVar.n) + dgeVar.k.getMeasuredHeight() >= dgeVar.h.getMeasuredHeight()) {
                dgeVar.i.setVisibility(8);
            }
            iMax = iMin + iJ;
            iH = 0;
        } else {
            dgeVar.i.setVisibility(0);
            dge.p(dgeVar.i, iH);
        }
        if (!dgeVar.v() || iMax > iHeight) {
            dgeVar.l.setVisibility(8);
        } else {
            dgeVar.l.setVisibility(0);
        }
        dgeVar.u(dgeVar.l.getVisibility() == 0);
        int iJ2 = dgeVar.j(dgeVar.l.getVisibility() == 0);
        int iMax2 = Math.max(iH, iMin) + iJ2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        dgeVar.k.clearAnimation();
        dgeVar.n.clearAnimation();
        dgeVar.h.clearAnimation();
        if (z) {
            dgeVar.k(dgeVar.k, iJ2);
            dgeVar.k(dgeVar.n, iMin);
            dgeVar.k(dgeVar.h, iHeight);
        } else {
            dge.p(dgeVar.k, iJ2);
            dge.p(dgeVar.n, iMin);
            dge.p(dgeVar.h, iHeight);
        }
        dge.p(dgeVar.f, rect.height());
        List listF = dgeVar.d.f();
        if (listF.isEmpty()) {
            dgeVar.p.clear();
            dgeVar.o.notifyDataSetChanged();
            return;
        }
        if (new HashSet(dgeVar.p).equals(new HashSet(listF))) {
            dgeVar.o.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = dgeVar.n;
            dgd dgdVar = dgeVar.o;
            map = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                Object item = dgdVar.getItem(firstVisiblePosition + i2);
                View childAt = overlayListView.getChildAt(i2);
                map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            map = null;
        }
        if (z) {
            Context context = dgeVar.e;
            OverlayListView overlayListView2 = dgeVar.n;
            dgd dgdVar2 = dgeVar.o;
            map2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                Object item2 = dgdVar2.getItem(firstVisiblePosition2 + i3);
                View childAt2 = overlayListView2.getChildAt(i3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(bitmapCreateBitmap));
                map2.put(item2, new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
            }
        } else {
            map2 = null;
        }
        List list = dgeVar.p;
        HashSet hashSet = new HashSet(listF);
        hashSet.removeAll(list);
        dgeVar.q = hashSet;
        HashSet hashSet2 = new HashSet(dgeVar.p);
        hashSet2.removeAll(listF);
        dgeVar.r = hashSet2;
        dgeVar.p.addAll(0, dgeVar.q);
        dgeVar.p.removeAll(dgeVar.r);
        dgeVar.o.notifyDataSetChanged();
        if (z && dgeVar.M && dgeVar.q.size() + dgeVar.r.size() > 0) {
            dgeVar.n.setEnabled(false);
            dgeVar.n.requestLayout();
            dgeVar.N = true;
            dgeVar.n.getViewTreeObserver().addOnGlobalLayoutListener(new mnx(dgeVar, map, map2, 1));
        } else {
            dgeVar.q = null;
            dgeVar.r = null;
        }
    }
}
