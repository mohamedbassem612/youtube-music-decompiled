package defpackage;

import app.rive.core.CommandQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpz extends awpg {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    public CommandQueue e;
    final /* synthetic */ acfz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpz(acfz acfzVar, awoq awoqVar) {
        super(awoqVar);
        this.f = acfzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.ag(null, null, null, null, this);
    }
}
