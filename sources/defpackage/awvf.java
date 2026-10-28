package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awvf extends axdv {
    public final awtp b;

    public awvf(awou awouVar, awoq awoqVar) {
        super(awouVar, awoqVar);
        this.b = new awtp(0, awts.a);
    }

    @Override // defpackage.axdv, defpackage.awtt
    protected final void kA(Object obj) throws awve {
        awtp awtpVar;
        do {
            awtpVar = this.b;
            int i = awtpVar.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                awoq awoqVar = this.c;
                axdb.a(JniZero.q(awoqVar), awrc.R(obj, awoqVar));
                return;
            }
        } while (!awtpVar.c(0, 2));
    }

    @Override // defpackage.axdv, defpackage.awwk
    protected final void kH(Object obj) {
        kA(obj);
    }
}
