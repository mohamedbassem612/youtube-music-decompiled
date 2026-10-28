package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbl implements pbk {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pls c;
    private final awmd d;

    public pbl(Context context, pls plsVar, awmd awmdVar) {
        context.getClass();
        plsVar.getClass();
        awmdVar.getClass();
        this.b = context;
        this.c = plsVar;
        this.d = awmdVar;
    }

    private static final Rect c(Bitmap bitmap, float f) {
        Rect rect;
        int width = bitmap.getWidth();
        float f2 = width;
        int height = bitmap.getHeight();
        float f3 = height;
        float f4 = f2 / f3;
        if (f4 == f) {
            return new Rect(0, 0, width, height);
        }
        if (f4 > f) {
            int i = (int) (f * f3);
            int i2 = (width - i) / 2;
            rect = new Rect(i2, 0, i + i2, height);
        } else {
            int i3 = (height - ((int) (f2 * f))) / 2;
            rect = new Rect(0, i3, width, i3 + width);
        }
        return rect;
    }

    private static final void d(Canvas canvas, List list) {
        Paint paint = new Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        int size = list.size();
        if (size == 0) {
            ((agsj) a.b()).t("Got empty list of avatars to merge.");
            return;
        }
        if (size == 1) {
            canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 1.0f), new Rect(0, 0, width, width), paint);
            return;
        }
        if (size == 2) {
            canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), c((Bitmap) list.get(1), 0.5f), new Rect(i, 0, width, width), paint);
            return;
        }
        if (size == 3) {
            canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), c((Bitmap) list.get(1), 1.0f), new Rect(i, 0, width, i), paint);
            canvas.drawBitmap((Bitmap) list.get(2), c((Bitmap) list.get(2), 1.0f), new Rect(i, i, width, width), paint);
            return;
        }
        canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 1.0f), new Rect(0, 0, i, i), paint);
        canvas.drawBitmap((Bitmap) list.get(1), c((Bitmap) list.get(1), 1.0f), new Rect(i, 0, width, i), paint);
        canvas.drawBitmap((Bitmap) list.get(2), c((Bitmap) list.get(2), 1.0f), new Rect(0, i, i, width), paint);
        canvas.drawBitmap((Bitmap) list.get(3), c((Bitmap) list.get(3), 1.0f), new Rect(i, i, width, width), paint);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x007b  */
    /* JADX WARN: Code duplicated, block: B:11:0x007d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0080  */
    /* JADX WARN: Code duplicated, block: B:15:0x0085 A[Catch: Exception -> 0x00af, OutOfMemoryError -> 0x00bd, TryCatch #2 {Exception -> 0x00af, OutOfMemoryError -> 0x00bd, blocks: (B:8:0x003a, B:15:0x0085, B:16:0x0090, B:17:0x009a, B:18:0x00a0), top: B:26:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0090 A[Catch: Exception -> 0x00af, OutOfMemoryError -> 0x00bd, TryCatch #2 {Exception -> 0x00af, OutOfMemoryError -> 0x00bd, blocks: (B:8:0x003a, B:15:0x0085, B:16:0x0090, B:17:0x009a, B:18:0x00a0), top: B:26:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:17:0x009a A[Catch: Exception -> 0x00af, OutOfMemoryError -> 0x00bd, TryCatch #2 {Exception -> 0x00af, OutOfMemoryError -> 0x00bd, blocks: (B:8:0x003a, B:15:0x0085, B:16:0x0090, B:17:0x009a, B:18:0x00a0), top: B:26:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a0 A[Catch: Exception -> 0x00af, OutOfMemoryError -> 0x00bd, TRY_LEAVE, TryCatch #2 {Exception -> 0x00af, OutOfMemoryError -> 0x00bd, blocks: (B:8:0x003a, B:15:0x0085, B:16:0x0090, B:17:0x009a, B:18:0x00a0), top: B:26:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.pbk
    public final Bitmap a(int i, List list) {
        Bitmap bitmapCreateBitmap;
        Canvas canvas;
        Paint paint;
        float width;
        int size;
        float f;
        if (list.isEmpty()) {
            return null;
        }
        pwf pwfVar = (pwf) this.d.io();
        Context context = this.b;
        pwfVar.l(context.getPackageName(), this.c.a, list.size(), "SQUARE");
        if (list.size() == 1) {
            bitmapCreateBitmap = (Bitmap) list.get(0);
            if (bitmapCreateBitmap.getWidth() != bitmapCreateBitmap.getHeight()) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawARGB(0, 0, 0, 0);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.notifications_avatar_separator_stroke_width);
                    d(canvas, list);
                    paint = new Paint();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(dimensionPixelSize);
                    paint.setColor(-16777216);
                    width = canvas.getWidth();
                    size = list.size();
                    f = width / 2.0f;
                    if (size != 0) {
                        ((agsj) a.b()).t("Got empty list of images to draw separator on.");
                    } else if (size != 1) {
                        if (size != 2) {
                            canvas.drawLine(f, 0.0f, f, width, paint);
                        } else if (size != 3) {
                            canvas.drawLine(f, 0.0f, f, width, paint);
                            canvas.drawLine(0.0f, f, width, f, paint);
                        } else {
                            canvas.drawLine(f, 0.0f, f, width, paint);
                            canvas.drawLine(f, f, width, f, paint);
                        }
                    }
                } catch (Exception e) {
                    ((agsj) ((agsj) a.b()).j(e)).t("Failed to create square avatar.");
                    return null;
                } catch (OutOfMemoryError e2) {
                    ((agsj) ((agsj) a.b()).j(e2)).t("Failed to allocate memory.");
                    return null;
                }
            }
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.notifications_avatar_separator_stroke_width);
            d(canvas, list);
            paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimensionPixelSize2);
            paint.setColor(-16777216);
            width = canvas.getWidth();
            size = list.size();
            f = width / 2.0f;
            if (size != 0) {
                ((agsj) a.b()).t("Got empty list of images to draw separator on.");
            } else if (size != 1) {
                if (size != 2) {
                    canvas.drawLine(f, 0.0f, f, width, paint);
                } else if (size != 3) {
                    canvas.drawLine(f, 0.0f, f, width, paint);
                    canvas.drawLine(0.0f, f, width, f, paint);
                } else {
                    canvas.drawLine(f, 0.0f, f, width, paint);
                    canvas.drawLine(f, f, width, f, paint);
                }
            }
        }
        return bitmapCreateBitmap;
    }

    @Override // defpackage.pbk
    public final Bitmap b(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ((pwf) this.d.io()).l(this.b.getPackageName(), this.c.a, list.size(), "CIRCLE");
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            d(canvas, list);
            float width = canvas.getWidth();
            float f = width / 2.0f;
            float f2 = width / 4.0f;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f2);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            canvas.drawCircle(f, f, (f2 / 2.0f) + f, paint);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed to create circular avatar.");
            return null;
        } catch (OutOfMemoryError e2) {
            ((agsj) ((agsj) a.b()).j(e2)).t("Failed to allocate memory.");
            return null;
        }
    }
}
