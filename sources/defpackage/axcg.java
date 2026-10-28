package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class axcg extends axak implements axat {
    public axcg(int i) {
        super(1, Alert.DURATION_SHOW_INDEFINITELY, 2);
        b(Integer.valueOf(i));
    }

    @Override // defpackage.axat
    public final /* bridge */ /* synthetic */ Object c() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) f()).intValue());
        }
        return numValueOf;
    }

    public final void m(int i) {
        synchronized (this) {
            b(Integer.valueOf(((Number) f()).intValue() + i));
        }
    }
}
