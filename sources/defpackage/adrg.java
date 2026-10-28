package defpackage;

import app.rive.core.CommandQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrg extends awpg {
    public /* synthetic */ Object a;
    public int b;
    public CommandQueue c;
    final /* synthetic */ aciz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adrg(aciz acizVar, awoq awoqVar) {
        super(awoqVar);
        this.d = acizVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return aciz.o(this.d, null, null, null, this);
    }
}
