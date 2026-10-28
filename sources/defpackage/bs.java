package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bs extends ca {
    final /* synthetic */ vx a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ rj c;
    final /* synthetic */ rb d;
    final /* synthetic */ cc e;

    public bs(cc ccVar, vx vxVar, AtomicReference atomicReference, rj rjVar, rb rbVar) {
        this.e = ccVar;
        this.a = vxVar;
        this.b = atomicReference;
        this.c = rjVar;
        this.d = rbVar;
    }

    @Override // defpackage.ca
    public final void a() {
        vx vxVar = this.a;
        cc ccVar = this.e;
        this.b.set(((rg) vxVar.a(null)).b(ccVar.generateActivityResultKey(), ccVar, this.c, this.d));
    }
}
