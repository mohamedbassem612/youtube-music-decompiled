package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIconStyle;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aaf {
    public Object a;
    public final Object b;

    public aaf(CarIconStyle carIconStyle) {
        carIconStyle.getClass();
        this.a = carIconStyle.mTint;
        this.b = carIconStyle.mShape;
    }

    public final void a(CarColor carColor) {
        ade adeVar = ade.a;
        carColor.getClass();
        adeVar.a(carColor);
        this.a = carColor;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    public final void b(Exception exc, boolean z) {
        this.a = null;
        ?? r4 = this.b;
        agke agkeVarN = agke.n(r4);
        r4.clear();
        int size = agkeVarN.size();
        for (int i = 0; i < size; i++) {
            cjo cjoVar = (cjo) agkeVarN.get(i);
            int i2 = 1;
            if (true != z) {
                i2 = 3;
            }
            cjoVar.g(exc, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void c(cjo cjoVar) {
        this.b.add(cjoVar);
        if (this.a == null) {
            this.a = cjoVar;
            cjoVar.i();
        }
    }

    public final void d(cnd cndVar) {
        ((agjz) this.b).h(cndVar);
    }

    public aaf() {
        this.b = new HashSet();
    }

    public aaf(byte[] bArr) {
        this.b = new agjz(4);
    }
}
