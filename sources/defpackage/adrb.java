package defpackage;

import app.rive.RiveFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adrb extends awpg {
    Object a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ adrf e;
    int f;
    RiveFile g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adrb(adrf adrfVar, awoq awoqVar) {
        super(awoqVar);
        this.e = adrfVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, null, null, this);
    }
}
