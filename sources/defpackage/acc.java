package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Metadata;
import androidx.car.app.model.Row;
import androidx.car.app.model.Toggle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class acc {
    public CarText b;
    public CarIcon d;
    public CarIcon e;
    public Toggle h;
    public abn i;
    public boolean k;
    public CarProgressBar o;
    public final boolean a = true;
    public final List c = new ArrayList();
    public final List f = new ArrayList();
    public final int g = -1;
    public final Metadata j = Metadata.EMPTY_METADATA;
    public final int l = 1;
    public final int m = 1;
    public final boolean n = true;

    public final Row a() {
        if (this.b == null) {
            throw new IllegalStateException("A title must be set on the row");
        }
        if (this.h == null || this.f.isEmpty()) {
            return new Row(this);
        }
        throw new IllegalStateException("If a row contains a toggle, it must not have a secondary action set");
    }

    public final void b(CharSequence charSequence) {
        charSequence.getClass();
        adg.f.a(CarText.create(charSequence));
        this.c.add(CarText.create(charSequence));
    }

    public final void c(CharSequence charSequence) {
        charSequence.getClass();
        CarText carTextCreate = CarText.create(charSequence);
        if (carTextCreate.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
        adg.e.a(carTextCreate);
        this.b = carTextCreate;
    }
}
