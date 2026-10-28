package app.rive.runtime.kotlin.core;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Helpers {
    public static final int $stable = 0;
    public static final Helpers INSTANCE = new Helpers();

    private Helpers() {
    }

    public static /* synthetic */ PointF convertToArtboardSpace$default(Helpers helpers, RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f, int i, Object obj) {
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        return helpers.convertToArtboardSpace(rectF, pointF, fit, alignment, rectF2, f);
    }

    private final native PointF cppConvertToArtboardSpace(RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f);

    public final PointF convertToArtboardSpace(RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f) {
        rectF.getClass();
        pointF.getClass();
        fit.getClass();
        alignment.getClass();
        rectF2.getClass();
        return cppConvertToArtboardSpace(rectF, pointF, fit, alignment, rectF2, f);
    }
}
