package defpackage;

import app.rive.RiveFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adop extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ adoq b;
    int c;
    adoq d;
    RiveFile e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adop(adoq adoqVar, awoq awoqVar) {
        super(awoqVar);
        this.b = adoqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
