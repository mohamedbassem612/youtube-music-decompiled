package defpackage;

import app.rive.core.CommandQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adrm extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ adro b;
    int c;
    CommandQueue d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adrm(adro adroVar, awoq awoqVar) {
        super(awoqVar);
        this.b = adroVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return adro.a(this.b, null, null, this);
    }
}
