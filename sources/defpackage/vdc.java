package defpackage;

import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Size;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vdc implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vdc(Object obj, Object obj2, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bitmap thumbnail;
        int i = this.$cid;
        Object obj = this.b;
        if (i != 0) {
            return ((lkt) mda.n(((lmm) ((lkk) obj).a.io()).c((Uri) this.c, this.a))).a;
        }
        xsc xscVar = (xsc) obj;
        boolean zL = ((vxz) ((aaok) xscVar.a).b).l(SemanticState.LiveRegion, 45777820L, false);
        Object obj2 = xscVar.b;
        ContentResolver contentResolver = ((Context) obj2).getContentResolver();
        Object obj3 = this.c;
        int i2 = Build.VERSION.SDK_INT;
        uji ujiVar = (uji) obj3;
        Uri uri = ujiVar.b;
        final int i3 = this.a;
        if (i2 >= 29) {
            thumbnail = null;
            try {
                thumbnail = contentResolver.loadThumbnail(uri, new Size(i3, i3), null);
            } catch (IOException | SecurityException unused) {
                if (zL && Build.VERSION.SDK_INT >= 29) {
                    try {
                        AssetFileDescriptor assetFileDescriptorA = qol.a((Context) obj2, uri, "r", qok.a);
                        if (assetFileDescriptorA != null) {
                            try {
                                Bitmap bitmapB = ugi.b(ImageDecoder.decodeBitmap(ImageDecoder.createSource((Callable<AssetFileDescriptor>) new tsp(assetFileDescriptorA, 5)), new ImageDecoder$OnHeaderDecodedListener() { // from class: ugq
                                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                                        int width = imageInfo.getSize().getWidth();
                                        int height = imageInfo.getSize().getHeight();
                                        int iMin = Math.min(width, height);
                                        int i4 = i3;
                                        if (iMin > i4) {
                                            float f = i4 / iMin;
                                            imageDecoder.setTargetSize(Math.round(width * f), Math.round(height * f));
                                        }
                                        imageDecoder.setAllocator(1);
                                    }
                                }));
                                if (bitmapB != null) {
                                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapB, i3, i3, false);
                                    assetFileDescriptorA.close();
                                    thumbnail = bitmapCreateScaledBitmap;
                                } else {
                                    assetFileDescriptorA.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    assetFileDescriptorA.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    } catch (IOException | SecurityException unused2) {
                    }
                }
            } catch (Exception e) {
                if (!(e instanceof OperationCanceledException)) {
                    zvp.b(zvn.a, zvm.f, "[ShortsCreation][Android][Camera]Failed loading thumbnail", e);
                }
            }
        } else {
            long j = ujiVar.a;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outWidth = i3;
            options.outHeight = i3;
            thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, j, 1, options);
        }
        return Optional.ofNullable(ugi.b(thumbnail));
    }
}
