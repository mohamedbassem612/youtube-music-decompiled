package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axej implements awoq {
    final /* synthetic */ awou a;
    final /* synthetic */ axel b;

    public axej(awou awouVar, axel axelVar) {
        this.a = awouVar;
        this.b = axelVar;
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return this.a;
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) throws Throwable {
        axel axelVar = this.b;
        try {
            axdb.a(JniZero.q(JniZero.o(new acqe(axelVar, 11, (boolean[][]) null), axelVar)), awmy.a);
        } catch (Throwable th) {
            awrc.V(axelVar, th);
        }
    }
}
