package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adku extends adks {
    public final adkz a;
    public int b;

    public adku(adkz adkzVar) {
        adkzVar.getClass();
        this.a = adkzVar;
        this.b = Alert.DURATION_SHOW_INDEFINITELY;
        adkzVar.h(new xbl(this, 3));
    }

    @Override // defpackage.adkz
    public final int a() {
        return Math.min(this.b, this.a.a());
    }

    public final void b(int i) {
        taq.d();
        if (this.b != i) {
            int iA = this.a.a();
            int iMin = Math.min(this.b, iA);
            int iMin2 = Math.min(i, iA);
            this.b = i;
            if (iMin != iMin2) {
                if (iMin2 > iMin) {
                    z(iMin, iMin2 - iMin);
                } else {
                    A(iMin2, iMin - iMin2);
                }
            }
        }
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        if (i < 0 || i >= a()) {
            return 0L;
        }
        return this.a.c(i);
    }

    @Override // defpackage.adkz
    public final boolean contains(Object obj) {
        for (int i = 0; i < a(); i++) {
            Object objD = this.a.d(i);
            if (obj == null) {
                if (objD == null) {
                    return true;
                }
            } else {
                if (obj.equals(objD)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return this.a.d(i);
    }

    @Override // defpackage.adkz
    public final boolean isEmpty() {
        return a() == 0;
    }
}
