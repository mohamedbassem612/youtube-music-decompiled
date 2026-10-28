package defpackage;

import app.rive.ViewModelInstance;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqg extends awpg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ adqh c;
    int d;
    adqh e;
    ViewModelInstance f;
    String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqg(adqh adqhVar, awoq awoqVar) {
        super(awoqVar);
        this.c = adqhVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return adqh.b(this.c, null, null, 0, this);
    }
}
