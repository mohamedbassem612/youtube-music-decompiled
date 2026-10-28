package defpackage;

import android.util.Size;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nsz {
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    public static Size a(int i, int i2, float f) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (f <= 0.0f || Float.isNaN(f) || !yno.G(f)) {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            return new Size(size, size2);
        }
        int iCeil = (int) Math.ceil(size / f);
        int iCeil2 = (int) Math.ceil(size2 * f);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (iCeil > size2) {
                size = iCeil2;
            } else {
                size2 = iCeil;
            }
        } else if (mode == 1073741824) {
            if (mode2 == 0 || iCeil <= size2) {
                size2 = iCeil;
            }
        } else if (mode2 == 1073741824) {
            if (mode == 0 || iCeil2 <= size) {
                size = iCeil2;
            }
        } else if (mode == Integer.MIN_VALUE) {
            size2 = iCeil;
        } else if (mode2 == Integer.MIN_VALUE) {
            size = iCeil2;
        } else {
            size = 0;
            size2 = 0;
        }
        return new Size(size, size2);
    }
}
