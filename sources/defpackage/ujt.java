package defpackage;

import android.graphics.Matrix;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujt {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil");

    public static double a(Size size, double d) {
        if (size.getHeight() == 0) {
            return 0.0d;
        }
        return (d + d) / ((double) size.getHeight());
    }

    public static float b(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return (float) Math.toDegrees(Math.atan2(fArr[3], fArr[0]));
    }

    public static float c(Size size, int i) {
        return (float) a(size, i - (size.getWidth() / 2));
    }

    public static float d(Size size, int i) {
        return (float) a(size, i - (size.getHeight() / 2));
    }

    public static SizeF e(Matrix matrix) {
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
        matrix.mapPoints(fArr);
        return new SizeF((float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]), (float) Math.hypot(fArr[4] - fArr[0], fArr[5] - fArr[1]));
    }

    public static Optional f(aimy aimyVar) {
        if (aimyVar.e.size() != 9) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/common/util/VideoInteractionRegionMatrixUtil", "convertMatrixDataToMatrix", 298, "VideoInteractionRegionMatrixUtil.java")).t("Can not convert MatrixData unless it has exactly 9 values representing a 3x3 matrix.");
            return Optional.empty();
        }
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = aimyVar.e.d(i);
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return Optional.of(matrix);
    }

    public static void g(View view, float[] fArr) {
        view.setTranslationX(fArr[2]);
        view.setTranslationY(fArr[5]);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setRotation((float) (Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
        Size size = new Size(Math.round((float) Math.hypot(fArr[0], fArr[3])), Math.round((float) Math.hypot(fArr[4], fArr[1])));
        view.setLayoutParams(new FrameLayout.LayoutParams(size.getWidth(), size.getHeight()));
    }
}
