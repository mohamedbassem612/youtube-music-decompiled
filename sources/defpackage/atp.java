package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atp extends auu {
    public IconCompat a;
    public boolean b;
    private IconCompat c;
    private boolean d;

    private static IconCompat g(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable instanceof Icon) {
                return aaj.g((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.f((Bitmap) parcelable);
            }
        }
        return null;
    }

    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.auu
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.c = g(bundle.getParcelable("android.largeIcon.big"));
            this.d = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.a = parcelable != null ? g(parcelable) : g(bundle.getParcelable("android.pictureIcon"));
        this.b = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public final void c(Bitmap bitmap) {
        this.c = bitmap == null ? null : IconCompat.f(bitmap);
        this.d = true;
    }

    public final void d(Bitmap bitmap) {
        this.a = bitmap == null ? null : IconCompat.f(bitmap);
    }

    public final void e(CharSequence charSequence) {
        this.i = atr.c(charSequence);
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) depVar.c).setBigContentTitle(this.i);
        if (this.a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                ato.a(bigContentTitle, aaj.e(this.a, (Context) depVar.b));
            } else if (this.a.b() == 1) {
                IconCompat iconCompat = this.a;
                int i = iconCompat.b;
                if (i == -1) {
                    Object obj = iconCompat.c;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat.c;
                } else {
                    if (i != 5) {
                        Objects.toString(iconCompat);
                        throw new IllegalStateException("called getBitmap() on ".concat(iconCompat.toString()));
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat.c;
                    int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    paint.setColor(0);
                    float f = iMin;
                    float f2 = 0.010416667f * f;
                    paint.setShadowLayer(f2, 0.0f, 0.020833334f * f, 1023410176);
                    float f3 = f * 0.5f;
                    float f4 = 0.9166667f * f3;
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.setShadowLayer(f2, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f3, f3, f4, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.d) {
            IconCompat iconCompat2 = this.c;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(aaj.e(iconCompat2, (Context) depVar.b));
            }
        }
        if (this.k) {
            bigContentTitle.setSummaryText(this.j);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            ato.c(bigContentTitle, this.b);
            ato.b(bigContentTitle, null);
        }
    }
}
