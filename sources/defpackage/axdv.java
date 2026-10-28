package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axdv extends awtt implements awph {
    public final awoq c;

    public axdv(awou awouVar, awoq awoqVar) {
        super(awouVar, true, true);
        this.c = awoqVar;
    }

    @Override // defpackage.awph
    public final awph getCallerFrame() {
        awoq awoqVar = this.c;
        if (awoqVar instanceof awph) {
            return (awph) awoqVar;
        }
        return null;
    }

    @Override // defpackage.awph
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.awwk
    protected final boolean k() {
        return true;
    }

    @Override // defpackage.awtt
    protected void kA(Object obj) {
        awoq awoqVar = this.c;
        awoqVar.resumeWith(awrc.R(obj, awoqVar));
    }

    @Override // defpackage.awwk
    protected void kH(Object obj) throws awve {
        awoq awoqVar = this.c;
        axdb.a(JniZero.q(awoqVar), awrc.R(obj, awoqVar));
    }

    public void c() {
    }
}
