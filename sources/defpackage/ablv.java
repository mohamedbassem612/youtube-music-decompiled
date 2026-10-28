package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablv implements sxu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ablv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmapCreateScaledBitmap;
        int i = this.$cid;
        if (i == 0) {
            byte[] bArr = (byte[]) obj2;
            try {
                ((ablx) this.a).d.put((Uri) obj, BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, true));
                return;
            } catch (IOException unused) {
                return;
            }
        }
        if (i == 1) {
            List list = (List) obj2;
            Object obj3 = this.a;
            yar yarVar = (yar) obj3;
            yco ycoVar = ((ycp) yarVar.h.io()).e;
            CopyOnWriteArrayList<xvk> copyOnWriteArrayList = yarVar.e;
            if (copyOnWriteArrayList.size() == list.size()) {
                for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
                    if (((xvk) copyOnWriteArrayList.get(i2)).equals(list.get(i2))) {
                    }
                }
                return;
            }
            synchronized (obj3) {
                for (xvk xvkVar : copyOnWriteArrayList) {
                    if (ycoVar == null || !ycoVar.j().equals(xvkVar)) {
                        if (!list.contains(xvkVar)) {
                            ((yar) obj3).o(xvkVar);
                        }
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((yar) obj3).g((xvk) it.next());
                }
            }
            return;
        }
        if (i != 2) {
            axq axqVar = (axq) obj2;
            acdw acdwVar = (acdw) this.a;
            if (((Uri) obj).equals(acdwVar.c)) {
                acdwVar.b((Bitmap) axqVar.a, (Bitmap) axqVar.b);
                acdwVar.c = null;
                return;
            }
            return;
        }
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            acdw acdwVar2 = (acdw) this.a;
            float f = acdwVar2.a.getResources().getDisplayMetrics().density * 64.0f;
            if (acdwVar2.b.p.l(148, 45729396L, false)) {
                int i3 = fa.a;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width > i3 || height > i3) {
                    float f2 = width;
                    float f3 = i3;
                    float f4 = height;
                    float fMin = Math.min(f3 / f2, f3 / f4);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f2 * fMin), (int) (f4 * fMin), true);
                } else {
                    bitmapCreateScaledBitmap = bitmap;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    bitmapCreateScaledBitmap = bitmapCreateScaledBitmap.asShared();
                }
            } else {
                bitmapCreateScaledBitmap = bitmap;
            }
            sxu sxuVarA = acdwVar2.a();
            float f5 = (int) f;
            float fMin2 = Math.min(f5 / bitmap.getWidth(), f5 / bitmap.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * fMin2), (int) (bitmap.getHeight() * fMin2), Bitmap.Config.ARGB_8888);
            int width2 = bitmapCreateBitmap.getWidth();
            int height2 = bitmapCreateBitmap.getHeight();
            float width3 = bitmap.getWidth();
            float height3 = bitmap.getHeight();
            float f6 = width2;
            float f7 = height2;
            Matrix matrix = new Matrix();
            float f8 = f6 / width3;
            float f9 = f7 / height3;
            float f10 = f6 / 2.0f;
            float f11 = f7 / 2.0f;
            matrix.setScale(f8, f9, f10, f11);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.setMatrix(matrix);
            canvas.drawBitmap(bitmap, f10 - (width3 / 2.0f), f11 - (height3 / 2.0f), new Paint(2));
            sxuVarA.b(uri, new axq(bitmapCreateScaledBitmap, bitmapCreateBitmap));
        }
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        int i = this.$cid;
        if (i == 0) {
            ((agrc) ((agrc) ((agrc) ablx.a.c()).j(exc)).k("com/google/android/libraries/youtube/player/features/storyboard/StoryboardClient$1", "onError", 244, "StoryboardClient.java")).w("Failed to load video storyboard mosaic at: %s", (Uri) obj);
            return;
        }
        if (i == 1) {
            ((agrc) ((agrc) ((agrc) yar.a.b().i(agso.a, "MDX.remote")).j(exc)).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultMdxScreensMonitor$RequestCloudScreensCallback", "onError", (char) 942, "DefaultMdxScreensMonitor.java")).t("Error loading available screens");
            return;
        }
        Object obj2 = this.a;
        if (i == 2) {
            ((acdw) obj2).a().iT((Uri) obj, exc);
            return;
        }
        acdw acdwVar = (acdw) obj2;
        if (((Uri) obj).equals(acdwVar.c)) {
            acdwVar.b(null, null);
            acdwVar.c = null;
        }
    }
}
