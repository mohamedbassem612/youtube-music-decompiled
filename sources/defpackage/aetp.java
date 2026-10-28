package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetp implements aeto {
    public final awku a = awku.aC(Boolean.FALSE);
    public aeto b;
    public avmn c;

    @Override // defpackage.aeto
    public final avlh a() {
        return this.a.p();
    }

    @Override // defpackage.aeto
    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        aeto aetoVar = this.b;
        if (aetoVar != null) {
            aetoVar.b();
        }
    }
}
