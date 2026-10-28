package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class fia extends Drawable {
    private static final long a = 587137024;
    private static final long b = 570490624;
    private static final int c = 1442775040;
    private static final int d = 1426128640;
    private static final Map e = new ConcurrentHashMap();
    private final List f = DesugarCollections.synchronizedList(new ArrayList());
    private final Paint g;
    private final Paint h;
    private final int i;
    private final int j;

    private fia(Context context) {
        Paint paint = new Paint();
        this.g = paint;
        this.h = new Paint();
        ci.I(context.getResources().getConfiguration());
        ayq ayqVar = new ayq(context);
        int iZ = ayqVar.z(20.0f);
        this.i = ayqVar.z(16.0f);
        this.j = ayqVar.z(8.0f);
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(iZ);
        paint.setTextAlign(Paint.Align.LEFT);
    }

    public static fia a(int i, Context context) {
        Map map = e;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return (fia) map.get(numValueOf);
        }
        fia fiaVar = new fia(context);
        map.put(numValueOf, fiaVar);
        return fiaVar;
    }

    public static void b(int i, Context context) {
        a(i, context).f.add(Boolean.valueOf(Looper.getMainLooper().getThread() == Thread.currentThread()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long j;
        String string;
        List list = this.f;
        int size = list.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(size);
            sb.append('x');
            string = sb.toString();
            j = ((Boolean) list.get(size + (-1))).booleanValue() ? a : b;
        } else {
            j = 0;
            string = "";
        }
        Paint paint = this.h;
        paint.setColor(j);
        Rect bounds = getBounds();
        canvas.drawRect(bounds, paint);
        int size2 = list.size();
        int i = bounds.left;
        int i2 = bounds.right;
        int i3 = bounds.top;
        int iMin = Math.min(this.i + i3, bounds.bottom);
        for (int i4 = 0; i4 < size2; i4++) {
            int i5 = this.j;
            int i6 = (i4 * i5) + i;
            int i7 = i5 + i6;
            if (i7 >= i2) {
                break;
            }
            if (((Boolean) list.get(i4)).booleanValue()) {
                paint.setColor(c);
            } else {
                paint.setColor(d);
            }
            canvas.drawRect(i6, i3, i7, iMin, paint);
        }
        canvas.drawText(string, i, i3 + 20, this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
