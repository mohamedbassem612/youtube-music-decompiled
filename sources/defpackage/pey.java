package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pey extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pfa c;
    int d;
    Bundle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pey(pfa pfaVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pfaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, null, null, this);
    }
}
