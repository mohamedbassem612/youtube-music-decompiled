package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vic {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final Object g;

    public vic(int i, int i2, float[] fArr, int[] iArr) {
        this.b = fArr;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.f = bitmapCreateBitmap;
        this.d = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-16777216);
        this.e = iArr;
        this.g = new Paint();
    }

    public static boolean c(Uri uri) {
        return uri.getLastPathSegment().endsWith(".png");
    }

    public static byte[] d(byte[] bArr, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        awpr awprVar = new awpr(null);
        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, awprVar);
        return awprVar.toByteArray();
    }

    private final void g(int i, float f) {
        Paint paint = (Paint) this.g;
        paint.setColor(i);
        Bitmap bitmap = (Bitmap) this.f;
        int height = bitmap.getHeight();
        int width = this.a % bitmap.getWidth();
        float f2 = height;
        float f3 = width;
        Canvas canvas = (Canvas) this.d;
        float f4 = (int) ((1.0f - f) * f2);
        float f5 = width + 1;
        canvas.drawRect(f3, f4, f5, f2, paint);
        canvas.drawRect(f3, 0.0f, f5, f4, (Paint) this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a(Uri uri, sxu sxuVar) {
        if (uri == null) {
            sxuVar.iT(Uri.EMPTY, new NullPointerException());
            return;
        }
        ?? r0 = this.g;
        if (!r0.containsKey(uri)) {
            sxw sxwVar = new sxw(sxuVar);
            this.b.put(uri, sxwVar);
            this.e.execute(new cdf(this, uri, this.a, sxwVar, sxuVar, 4));
            return;
        }
        try {
            sxuVar.b(uri, ((adhn) this.d).d((byte[]) r0.get(uri)));
        } catch (tzn e) {
            sxuVar.iT(uri, e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void b(Uri uri, byte[] bArr) {
        this.g.put(uri, bArr);
    }

    public final Bitmap e(float f) {
        float[] fArr = (float[]) this.b;
        int iBinarySearch = Arrays.binarySearch(fArr, f);
        if (iBinarySearch != -1) {
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            int[] iArr = (int[]) this.e;
            g(iArr[iBinarySearch], 1.0f);
            int i = iBinarySearch + 1;
            if (i != fArr.length) {
                float f2 = fArr[iBinarySearch];
                g(iArr[i], (f - f2) / (fArr[i] - f2));
            }
        }
        this.a++;
        return (Bitmap) this.f;
    }

    public final void f() {
        ((Bitmap) this.f).eraseColor(-16777216);
        this.a = 0;
    }

    public vic(Context context, adhv adhvVar, Executor executor, aeiv aeivVar) {
        this.g = DesugarCollections.synchronizedMap(new HashMap());
        this.b = DesugarCollections.synchronizedMap(new HashMap());
        this.a = 3;
        this.c = adhvVar;
        this.e = executor;
        this.f = aeivVar;
        this.d = new adho(context);
    }
}
