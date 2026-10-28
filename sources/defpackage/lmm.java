package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lmm extends kmz implements knd {
    public lmm(Context context, char[] cArr) {
        super(context, null, kvj.a, kms.f, kmy.a);
        ltg.a = context.getApplicationContext().getContentResolver();
    }

    public static Bitmap e(View view) {
        Bitmap bitmapCreateBitmap;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
                canvasBeginRecording.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new Paint());
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(bitmapCreateBitmap2));
                bitmapCreateBitmap = bitmapCreateBitmap2;
            }
            return bitmapCreateBitmap;
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public final lpa a() {
        kpj kpjVar = new kpj();
        kpjVar.a = new kah(7);
        kpjVar.c = 3901;
        return super.A(0, kpjVar.a());
    }

    public final lpa b(Uri uri) {
        lkh lkhVar = new lkh(uri);
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(lkhVar, 9);
        kpjVar.b = new klq[]{kxy.c};
        kpjVar.c = 7802;
        return super.A(0, kpjVar.a());
    }

    public final lpa c(Uri uri, int i) {
        lks lksVar = new lks(uri, i);
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(lksVar, 10);
        kpjVar.b = i == 1 ? new klq[]{kxy.c} : null;
        kpjVar.c = 7801;
        return super.A(0, kpjVar.a());
    }

    public final lpa d(Uri uri, Uri uri2) {
        lku lkuVar = new lku(uri, uri2);
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(lkuVar, 8);
        kpjVar.b = new klq[]{kxy.d};
        kpjVar.b();
        kpjVar.c = 7803;
        return super.A(0, kpjVar.a());
    }

    public final void f(final kvn kvnVar, final Bundle bundle, final long j) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kpe() { // from class: kvk
            @Override // defpackage.kpe
            public final void a(Object obj, Object obj2) {
                kvn kvnVar2 = kvnVar;
                Bundle bundle2 = bundle;
                long j2 = j;
                kvw kvwVar = (kvw) obj;
                try {
                    ixt.ad(bundle2);
                    ixt.ae(kvnVar2);
                    kvy kvyVar = (kvy) kvwVar.C();
                    Parcel parcelC = kvyVar.c();
                    gdc.c(parcelC, kvnVar2);
                    gdc.c(parcelC, bundle2);
                    parcelC.writeLong(j2);
                    kvyVar.e(5, parcelC);
                    ((kjc) obj2).x(null);
                } catch (Exception e) {
                    Log.e("gF_FeedbackClient", "Requesting to save the async feedback psbd failed!", e);
                    ((kjc) obj2).w(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        kpjVar.c = 6011;
        super.A(1, kpjVar.a());
    }

    public final void g(Bundle bundle, long j) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kvl(bundle, j, 1);
        kpjVar.c = 6010;
        super.A(1, kpjVar.a());
    }

    public final void h(kvn kvnVar) {
        long jNanoTime = System.nanoTime();
        kpj kpjVar = new kpj();
        kpjVar.a = new kvl(kvnVar, jNanoTime, 0);
        kpjVar.c = 6005;
        super.A(1, kpjVar.a());
    }

    public final lpa i() {
        kpj kpjVar = new kpj();
        kpjVar.a = new kah(1);
        kpjVar.c = 1520;
        return super.A(0, kpjVar.a());
    }

    public lmm(Context context, jze jzeVar) {
        super(context, null, jzd.a, jzeVar, kmy.a);
    }

    public lmm(Context context, byte[] bArr) {
        super(context, null, lko.a, kms.f, kmy.a);
    }

    public lmm(Context context) {
        super(context, null, lmk.a, kms.f, kmy.a);
    }
}
