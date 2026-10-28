package defpackage;

import app.rive.RiveFile;
import app.rive.ViewModelInstance;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqe extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ adqh c;
    int d;
    adqh e;
    ViewModelInstance f;
    RiveFile g;
    awrm h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqe(adqh adqhVar, awoq awoqVar) {
        super(awoqVar);
        this.c = adqhVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return adqh.a(this.c, null, null, this);
    }
}
