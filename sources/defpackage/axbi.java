package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axbi implements axbx {
    public final awou a;
    public final int b;
    public final int c;

    public axbi(awou awouVar, int i, int i2) {
        this.a = awouVar;
        this.b = i;
        this.c = i2;
        boolean z = awuv.a;
    }

    public static /* synthetic */ Object d(axbi axbiVar, awzd awzdVar, awoq awoqVar) throws Throwable {
        Object objJ = awrc.J(new axbh(awzdVar, axbiVar, (awoq) null, 0), awoqVar);
        return objJ != awox.a ? awmy.a : objJ;
    }

    public abstract Object a(awyp awypVar, awoq awoqVar);

    protected abstract axbi b(awou awouVar, int i, int i2);

    @Override // defpackage.awzc
    public Object collect(awzd awzdVar, awoq awoqVar) {
        return d(this, awzdVar, awoqVar);
    }

    public awyr e(awut awutVar) {
        bhg bhgVar = new bhg(this, (awoq) null, 2);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        return awqx.A(awutVar, this.a, i, i2, 3, bhgVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f A[PHI: r5
      0x001f: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:6:0x0010, B:9:0x0015, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.axbx
    public final awzc kK(awou awouVar, int i, int i2) {
        boolean z = awuv.a;
        awou awouVar2 = this.a;
        awou awouVarPlus = awouVar.plus(awouVar2);
        if (i2 == 1) {
            int i3 = this.b;
            if (i3 != -3) {
                if (i == -3) {
                    i = i3;
                } else if (i3 != -2) {
                    if (i != -2 && (i3 = i3 + i) < 0) {
                        i = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        i = i3;
                    }
                }
            }
            i2 = this.c;
        }
        return (awrc.c(awouVarPlus, awouVar2) && i == this.b && i2 == this.c) ? this : b(awouVarPlus, i, i2);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        awou awouVar = this.a;
        if (awouVar != awov.a) {
            Objects.toString(awouVar);
            arrayList.add("context=".concat(String.valueOf(awouVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.bR(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            awuw.i(i2);
            arrayList.add("onBufferOverflow=".concat(awuw.i(i2)));
        }
        return awuw.a(this) + '[' + atqq.aD(arrayList, ", ", null, null, null, 62) + ']';
    }
}
