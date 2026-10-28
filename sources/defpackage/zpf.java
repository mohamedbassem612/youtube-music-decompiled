package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zpf extends fky {

    @fmt(a = 13)
    AtomicInteger a;

    @fmt(a = 13)
    AtomicBoolean b;

    @fmt(a = 13)
    AtomicBoolean c;

    @fmt(a = 13)
    AtomicInteger d;

    @fmt(a = 13)
    AtomicInteger e;

    @fmt(a = 13)
    AtomicReference f;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        Object obj = aeroVar.b;
        int i = aeroVar.a;
        if (i != 0) {
            if (i == 1) {
                AtomicInteger atomicInteger = this.a;
                int i2 = zpk.a;
                this.a = new AtomicInteger(atomicInteger.get() + 1);
                return;
            }
            return;
        }
        AtomicInteger atomicInteger2 = this.e;
        AtomicInteger atomicInteger3 = this.d;
        Object[] objArr = (Object[]) obj;
        int iIntValue = ((Integer) objArr[0]).intValue();
        int iIntValue2 = ((Integer) objArr[1]).intValue();
        int i3 = zpk.a;
        if (atomicInteger2 == null || atomicInteger2.intValue() == 0 || iIntValue != 0) {
            atomicInteger2 = new AtomicInteger(iIntValue);
            atomicInteger3 = new AtomicInteger(iIntValue2);
        }
        this.e = atomicInteger2;
        this.d = atomicInteger3;
    }
}
