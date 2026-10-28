package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.dgi;
import defpackage.mqd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class OverlayListView extends ListView {
    public final List a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List list = this.a;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dgi dgiVar = (dgi) it.next();
            BitmapDrawable bitmapDrawable = dgiVar.a;
            if (bitmapDrawable != null) {
                bitmapDrawable.draw(canvas);
            }
            long drawingTime = getDrawingTime();
            if (!dgiVar.l) {
                float fMax = true == dgiVar.k ? Math.max(0.0f, Math.min(1.0f, (drawingTime - dgiVar.j) / dgiVar.e)) : 0.0f;
                Interpolator interpolator = dgiVar.d;
                float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
                float f = dgiVar.g;
                Rect rect = dgiVar.c;
                Rect rect2 = dgiVar.f;
                int i = (int) (f * interpolation);
                rect.top = rect2.top + i;
                rect.bottom = rect2.bottom + i;
                float f2 = dgiVar.h;
                float f3 = f2 + ((dgiVar.i - f2) * interpolation);
                dgiVar.b = f3;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (f3 * 255.0f));
                    bitmapDrawable.setBounds(rect);
                }
                if (dgiVar.k && fMax >= 1.0f) {
                    dgiVar.l = true;
                    mqd mqdVar = dgiVar.m;
                    if (mqdVar != null) {
                        mqdVar.b();
                    }
                }
                if (dgiVar.l) {
                }
            }
            it.remove();
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
    }
}
