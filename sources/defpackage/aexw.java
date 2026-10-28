package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexw extends ViewOutlineProvider {
    final /* synthetic */ ShapeableImageView a;
    private final Rect b = new Rect();

    public aexw(ShapeableImageView shapeableImageView) {
        this.a = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.a;
        if (shapeableImageView.c != null) {
            if (shapeableImageView.b == null) {
                shapeableImageView.b = new afbe(shapeableImageView.c);
            }
            RectF rectF = shapeableImageView.a;
            Rect rect = this.b;
            rectF.round(rect);
            shapeableImageView.b.setBounds(rect);
            shapeableImageView.b.getOutline(outline);
        }
    }
}
