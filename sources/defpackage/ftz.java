package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ftz extends fky {

    @fmt(a = 13)
    Integer a;

    @fmt(a = 13)
    AtomicReference b;

    @fmt(a = 13)
    AtomicReference c;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        Object obj = aeroVar.b;
        if (aeroVar.a == 0) {
            Integer num = this.a;
            int i = fuh.i;
            this.a = Integer.valueOf(num.intValue() + 1);
        }
    }
}
