package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aefi extends View {
    private static final Paint h;
    public final aefr a;
    public final RectF b;
    public final View c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public boolean g;
    private final int[] i;
    private final Paint j;
    private final float k;

    static {
        Paint paint = new Paint(1);
        h = paint;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
    }

    public aefi(Context context, aefr aefrVar, View view, boolean z, boolean z2) {
        super(context);
        this.a = aefrVar;
        this.d = z;
        this.e = z2;
        this.b = new RectF();
        this.i = new int[2];
        this.f = true;
        this.g = true;
        setClickable(false);
        setFocusable(false);
        setLayerType(2, null);
        this.c = view;
        a();
        Paint paint = new Paint(1);
        this.j = paint;
        paint.setColor(tzk.n(context, R.attr.ytOverlayBackgroundMedium).orElse(0));
        this.k = twm.c(getResources().getDisplayMetrics(), 2);
        setOnTouchListener(new jjx(this, 3));
    }

    private final void a() {
        View view = this.c;
        int[] iArr = this.i;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        this.b.set(i, iArr[1], i + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawPaint(this.j);
            RectF rectF = this.b;
            float f = this.k;
            canvas.drawRoundRect(rectF, f, f, h);
        }
    }
}
