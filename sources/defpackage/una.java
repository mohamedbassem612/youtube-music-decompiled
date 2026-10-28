package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class una {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/guidelines/GuidelineController");
    public static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private static final DashPathEffect n = new DashPathEffect(new float[]{10.0f, 20.0f}, 0.0f);
    public final ImageView c;
    public final Paint d;
    public final Paint e;
    public final Paint f = new Paint();
    public final Optional g;
    public final float[] h;
    public final xgn i;
    public final xgj j;
    public Canvas k;
    public long l;
    public int m;

    public una(ImageView imageView, Optional optional, int i, int i2, xgn xgnVar) {
        Optional.empty();
        int dimensionPixelOffset = imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.shorts_edit_guideline_stroke_width);
        this.l = 0L;
        this.m = 0;
        this.h = new float[4];
        this.c = imageView;
        this.i = xgnVar;
        optional.isPresent();
        this.g = Optional.empty();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(i);
        paint.setAntiAlias(true);
        float f = dimensionPixelOffset;
        paint.setStrokeWidth(f);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(i2);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(f);
        if (optional.isEmpty()) {
            paint2.setPathEffect(n);
        }
        this.j = new xgj(xhb.b(131528));
    }

    public static final boolean a(auak auakVar) {
        int iBg = a.bg(auakVar.e);
        if (iBg == 0) {
            iBg = 1;
        }
        if (iBg != 1) {
            auam auamVar = auakVar.c;
            if (auamVar == null) {
                auamVar = auam.a;
            }
            if (b(auamVar)) {
                auam auamVar2 = auakVar.d;
                if (auamVar2 == null) {
                    auamVar2 = auam.a;
                }
                if (b(auamVar2)) {
                    return true;
                }
            }
            agrc agrcVar = (agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/editor/guidelines/GuidelineController", "isValidGuideline", 340, "GuidelineController.java");
            int iBg2 = a.bg(auakVar.e);
            agrcVar.B("%sInvalid %% in line of type: %s", "[ShortsCreation][Android][Guidelines]", atxy.c(iBg2 != 0 ? iBg2 : 1));
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/editor/guidelines/GuidelineController", "isValidGuideline", 336, "GuidelineController.java")).B("%s%s", "[ShortsCreation][Android][Guidelines]", "Unspecified line type.");
        }
        return false;
    }

    private static final boolean b(auam auamVar) {
        int i = auamVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/editor/guidelines/GuidelineController", "isValidGuidelinePoint", 349, "GuidelineController.java")).B("%s%s", "[ShortsCreation][Android][Guidelines]", "X or Y coordinate not set.");
            return false;
        }
        float f = auamVar.c;
        if (f >= 0.0f && f <= 1.0f) {
            float f2 = auamVar.d;
            if (f2 >= 0.0f && f2 <= 1.0f) {
                return true;
            }
        }
        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/editor/guidelines/GuidelineController", "isValidGuidelinePoint", 357, "GuidelineController.java")).F("%s%s X: %f. Y: %f", "[ShortsCreation][Android][Guidelines]", "X or Y coordinates not valid percentage.", Float.valueOf(auamVar.c), Float.valueOf(auamVar.d));
        return false;
    }
}
