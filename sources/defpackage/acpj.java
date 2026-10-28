package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acpj extends tym {
    final /* synthetic */ acpl a;
    private final Rect b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acpj(acpl acplVar) {
        super(null);
        this.a = acplVar;
        this.b = new Rect();
    }

    /* JADX WARN: Code duplicated, block: B:93:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    public final void aN(ImageView imageView, Bitmap bitmap) {
        acvs acvsVar;
        Bitmap bitmapCreateBitmap;
        int i;
        int i2;
        ImageView.ScaleType scaleType;
        acpl acplVar = this.a;
        if (acplVar.k) {
            acvsVar = acvs.b;
        } else if (acplVar.j) {
            acvsVar = acvs.c;
        } else {
            acvsVar = acplVar.l ? acvs.b : acvs.a;
        }
        ImageView imageView2 = acplVar.f;
        aqmh aqmhVar = acplVar.i;
        boolean z = (imageView == imageView2 || (aqmhVar != null && aqmhVar.f)) ? false : true;
        Rect rect = this.b;
        imageView.getWindowVisibleDisplayFrame(rect);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        int iOrdinal = acvsVar.ordinal();
        if (iOrdinal == 0) {
            if (z) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Size size = acplVar.g;
                int width2 = size != null ? size.getWidth() : rect.width();
                Size size2 = acplVar.g;
                int height2 = size2 != null ? size2.getHeight() : rect.height();
                if (width <= 0 || width2 <= 0) {
                    i = width;
                    i2 = height;
                } else {
                    double d = height;
                    double d2 = width;
                    double d3 = d / d2;
                    double d4 = ((double) height2) / ((double) width2);
                    if (d3 < d4) {
                        i = (int) (d / d4);
                        i2 = height;
                    } else if (d3 <= d4 || d4 == 0.0d) {
                        i = width;
                        i2 = height;
                    } else {
                        i2 = (int) (d2 * d4);
                        i = width;
                    }
                }
                int i3 = width - i;
                int i4 = height - i2;
                if (i == width && i2 == height) {
                    bitmapCreateBitmap = bitmap;
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i3 / 2, i4 / 2, i, i2);
                }
            } else {
                bitmapCreateBitmap = bitmap;
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (iOrdinal == 1) {
            bitmapCreateBitmap = (!z || acplVar.k) ? bitmap : acpl.a(bitmap);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                bitmap.getWidth();
                bitmap.getHeight();
                Size size3 = acplVar.g;
                if (size3 != null) {
                    size3.getWidth();
                } else {
                    rect.width();
                }
                Size size4 = acplVar.g;
                if (size4 != null) {
                    size4.getHeight();
                } else {
                    rect.height();
                }
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            bitmapCreateBitmap = bitmap;
        } else {
            Size size5 = acplVar.g;
            Size size6 = (size5 == null || size5.getWidth() <= 0) ? new Size(rect.width(), rect.height()) : new Size(acplVar.g.getWidth(), acplVar.g.getHeight());
            Bitmap bitmapA = z ? acpl.a(bitmap) : bitmap;
            Context context = imageView.getContext();
            int width3 = bitmapA.getWidth();
            int height3 = bitmapA.getHeight();
            double height4 = size6.getHeight();
            double width4 = size6.getWidth();
            double d5 = ((double) height3) / ((double) width3);
            if (d5 > 1.5d || d5 >= height4 / width4) {
                int width5 = size6.getWidth();
                int height5 = size6.getHeight();
                double dK = acfz.K(width5, height5, width3, height3);
                double d6 = true != acfz.M(context, 2.01f) ? 0.10000000149011612d : 0.14000000059604645d;
                Size sizeL = acfz.L(width5, height5, width3, height3);
                scaleType = (dK <= d6 || !(sizeL.getWidth() >= width5 || sizeL.getHeight() >= height5)) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
            bitmapCreateBitmap = bitmapA;
        }
        imageView.setImageBitmap(bitmapCreateBitmap);
    }

    @Override // defpackage.tym
    public final void aa(ImageView imageView, Bitmap bitmap) {
        aN(imageView, bitmap);
    }
}
