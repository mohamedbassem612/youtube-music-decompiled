package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adf {
    public static final adf a = new adf(new int[]{1, 2, 4});
    public static final adf b = new adf(new int[]{1, 2});
    private final int[] c;

    private adf(int[] iArr) {
        this.c = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        b(icon);
    }

    public final void b(IconCompat iconCompat) {
        int iB = iconCompat.b();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                throw new IllegalArgumentException(a.bR(iB, "Custom icon type is not allowed: "));
            }
            if (iB == iArr[i]) {
                if (iB != 4 || "content".equalsIgnoreCase(iconCompat.c().getScheme())) {
                    return;
                }
                Objects.toString(iconCompat);
                throw new IllegalArgumentException("Unsupported URI scheme for: ".concat(iconCompat.toString()));
            }
            i++;
        }
    }
}
