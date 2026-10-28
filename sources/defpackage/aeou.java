package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeou extends agm {
    final /* synthetic */ ahgb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeou(ahgb ahgbVar) {
        super(50);
        this.c = ahgbVar;
    }

    @Override // defpackage.agm
    protected final /* bridge */ /* synthetic */ void f(boolean z, Object obj, Object obj2, Object obj3) {
        aeov aeovVar = (aeov) obj2;
        super.f(z, obj, aeovVar, (aeov) obj3);
        ((AtomicInteger) this.c.a).addAndGet(-aeovVar.c);
    }
}
