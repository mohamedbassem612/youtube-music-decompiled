package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ifm extends awpg {
    int a;
    Object b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ ifn e;
    int f;
    abtu g;
    Duration h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifm(ifn ifnVar, awoq awoqVar) {
        super(awoqVar);
        this.e = ifnVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(0, null, false, this);
    }
}
