package defpackage;

import androidx.car.app.model.CarColor;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ade {
    public static final ade a = new ade(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    private final HashSet b = new HashSet();

    static {
        new ade(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    private ade(int[] iArr) {
        for (int i : iArr) {
            this.b.add(Integer.valueOf(i));
        }
    }

    public final void a(CarColor carColor) {
        if (this.b.contains(Integer.valueOf(carColor.getType()))) {
            return;
        }
        Objects.toString(carColor);
        throw new IllegalArgumentException("Car color type is not allowed: ".concat(String.valueOf(carColor)));
    }
}
