package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mmh extends fky {

    @fmt(a = 13)
    nru a;

    @fmt(a = 13)
    mmf b;

    @fmt(a = 13)
    AtomicInteger c;

    @fmt(a = 13)
    AtomicInteger d;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        Object obj = aeroVar.b;
        if (aeroVar.a == 0) {
            this.d = new AtomicInteger(((Integer) ((Object[]) obj)[0]).intValue());
        }
    }
}
