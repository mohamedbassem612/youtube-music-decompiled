package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tsx implements sxu {
    public final ImageView a;
    private final Animation b;
    private boolean c;
    private final tym d;
    private final qcb e;

    public tsx(ImageView imageView, tym tymVar, qcb qcbVar) {
        this.a = imageView;
        tymVar.getClass();
        this.d = tymVar;
        this.e = qcbVar;
        Animation animationA = tymVar.a();
        this.b = animationA;
        if (animationA != null) {
            animationA.setAnimationListener(new dfy(this, 7));
        }
        imageView.setTag(R.id.bitmap_loader_tag, this);
        this.c = false;
    }

    private final void d() {
        this.a.setTag(R.id.bitmap_loader_tag, null);
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Animation animation;
        ImageView imageView = this.a;
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (imageView.getTag(R.id.bitmap_loader_tag) == this) {
            bitmap.prepareToDraw();
            this.c = true;
            this.d.aa(imageView, bitmap);
            qcb qcbVar = this.e;
            if (qcbVar != null) {
                jdt jdtVar = (jdt) qcbVar.a;
                ImageView imageView2 = jdtVar.c;
                Matrix matrix = new Matrix(imageView2.getImageMatrix());
                float width = jdtVar.a.getResources().getDisplayMetrics().widthPixels / bitmap.getWidth();
                matrix.postScale(width, width);
                imageView2.setImageMatrix(matrix);
            }
            if (uri.equals(imageView.getTag(R.id.bitmap_source_tag)) || (animation = this.b) == null) {
                c();
                return;
            }
            imageView.setTag(R.id.bitmap_source_tag, uri);
            if (animation.hasStarted() && !animation.hasEnded()) {
                animation.cancel();
                animation.reset();
            }
            if (imageView.hasOverlappingRendering()) {
                imageView.setLayerType(2, null);
            }
            imageView.startAnimation(animation);
        }
    }

    public final void c() {
        if (!this.c) {
            ((agrc) ((agrc) tta.a.c()).k("com/google/android/libraries/youtube/common/ui/BitmapLoader$BitmapCallback", "onBitmapRendered", 282, "BitmapLoader.java")).t("Ignoring onBitmapRendered called before onResponse.");
            return;
        }
        ImageView imageView = this.a;
        if (imageView.getTag(R.id.bitmap_loader_tag) == this) {
            imageView.invalidate();
            d();
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        if (this.a.getTag(R.id.bitmap_loader_tag) == this) {
            d();
        }
    }
}
