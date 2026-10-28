package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elg extends ele {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final ehn m;
    private eix n;
    private eix o;

    public elg(ehm ehmVar, elh elhVar) {
        super(ehmVar, elhVar);
        this.j = new ehy(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = elhVar.f;
        egy egyVar = ehmVar.a;
        this.m = egyVar == null ? null : (ehn) egyVar.d().get(str);
    }

    @Override // defpackage.ele, defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        super.a(obj, enpVar);
        if (obj == ehr.K) {
            this.n = new ejo(enpVar, null);
        } else if (obj == ehr.N) {
            this.o = new ejo(enpVar, null);
        }
    }

    @Override // defpackage.ele, defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        ehn ehnVar = this.m;
        if (ehnVar != null) {
            float f = ehnVar.a;
            float fA = enm.a();
            rectF.set(0.0f, 0.0f, f * fA, ehnVar.b * fA);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    @Override // defpackage.ele
    public final void j(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap;
        Bitmap bitmapC;
        eix eixVar = this.o;
        if (eixVar == null || (bitmap = (Bitmap) eixVar.e()) == null) {
            elh elhVar = this.c;
            ehm ehmVar = this.b;
            ejq ejqVar = ehmVar.e;
            if (ejqVar != null) {
                Drawable.Callback callback = ehmVar.getCallback();
                Context context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                Context context2 = ejqVar.a;
                if (context2 instanceof Application) {
                    context = context.getApplicationContext();
                }
                if (context != context2) {
                    ehmVar.e = null;
                }
            }
            if (ehmVar.e == null) {
                ehmVar.e = new ejq(ehmVar.getCallback(), ehmVar.f, ehmVar.g, ehmVar.a.d());
            }
            ejq ejqVar2 = ehmVar.e;
            if (ejqVar2 != null) {
                String str = elhVar.f;
                ehn ehnVar = (ehn) ejqVar2.d.get(str);
                if (ehnVar == null) {
                    bitmap = null;
                } else {
                    Bitmap bitmap2 = ehnVar.f;
                    if (bitmap2 != null) {
                        bitmap = bitmap2;
                    } else {
                        egr egrVar = ejqVar2.c;
                        if (egrVar != null) {
                            bitmapC = egrVar.a(ehnVar);
                            if (bitmapC != null) {
                                ejqVar2.a(str, bitmapC);
                            }
                        } else {
                            Context context3 = ejqVar2.a;
                            if (context3 != null) {
                                String str2 = ehnVar.d;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inScaled = true;
                                options.inDensity = 160;
                                if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
                                    try {
                                        String str3 = ejqVar2.b;
                                        if (TextUtils.isEmpty(str3)) {
                                            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                        }
                                        try {
                                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context3.getAssets().open(str3 + str2), null, options);
                                            if (bitmapDecodeStream == null) {
                                                ene.a(a.bT(str, "Decoded image `", "` is null."));
                                            } else {
                                                bitmapC = enm.c(bitmapDecodeStream, ehnVar.a, ehnVar.b);
                                                ejqVar2.a(str, bitmapC);
                                            }
                                        } catch (IllegalArgumentException e) {
                                            ene.b(a.bT(str, "Unable to decode image `", "`."), e);
                                        }
                                    } catch (IOException e2) {
                                        ene.b("Unable to open asset.", e2);
                                    }
                                } else {
                                    try {
                                        byte[] bArrDecode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                                        bitmapC = enm.c(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), ehnVar.a, ehnVar.b);
                                        ejqVar2.a(str, bitmapC);
                                    } catch (IllegalArgumentException e3) {
                                        ene.b("data URL did not have correct base64 format.", e3);
                                        bitmap = null;
                                    }
                                }
                            }
                            bitmap = null;
                        }
                        bitmap = bitmapC;
                    }
                }
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                ehn ehnVar2 = this.m;
                bitmap = ehnVar2 != null ? ehnVar2.f : null;
            }
        }
        if (bitmap == null || bitmap.isRecycled() || this.m == null) {
            return;
        }
        ThreadLocal threadLocal = enm.a;
        float f = Resources.getSystem().getDisplayMetrics().density;
        Paint paint = this.j;
        paint.setAlpha(i);
        eix eixVar2 = this.n;
        if (eixVar2 != null) {
            paint.setColorFilter((ColorFilter) eixVar2.e());
        }
        canvas.save();
        canvas.concat(matrix);
        Rect rect = this.k;
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = this.l;
        rect2.set(0, 0, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        canvas.restore();
    }
}
