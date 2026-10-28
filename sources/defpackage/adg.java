package defpackage;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.TimerSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adg {
    public static final adg a = new adg(Collections.EMPTY_LIST);
    public static final adg b = new adg(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
    public static final adg c;
    public static final adg d;
    public static final adg e;
    public static final adg f;
    private final HashSet g;

    static {
        new adg(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        c = new adg(Arrays.asList(ForegroundCarColorSpan.class));
        d = new adg(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        e = new adg(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, CarIconSpan.class));
        new adg(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
        f = new adg(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    private adg(List list) {
        this.g = new HashSet(list);
    }

    private final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.g.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(String.valueOf(cls.getSimpleName())));
            }
        }
    }

    public final void a(CarText carText) {
        b(carText.getSpans());
        Iterator it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            b((List) it.next());
        }
    }
}
