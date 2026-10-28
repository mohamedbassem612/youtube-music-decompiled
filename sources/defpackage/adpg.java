package defpackage;

import app.rive.core.CommandQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adpg extends awpg {
    Object a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ adpi d;
    int e;
    adpi f;
    CommandQueue g;
    String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpg(adpi adpiVar, awoq awoqVar) {
        super(awoqVar);
        this.d = adpiVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return adpi.a(this.d, null, this);
    }
}
