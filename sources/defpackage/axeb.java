package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axeb implements awxg {
    private final Object a;
    private final ThreadLocal b;
    private final awot c;

    public axeb(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new axec(threadLocal);
    }

    @Override // defpackage.awxg
    public final Object a(awou awouVar) {
        ThreadLocal threadLocal = this.b;
        Object obj = this.a;
        Object obj2 = threadLocal.get();
        threadLocal.set(obj);
        return obj2;
    }

    @Override // defpackage.awxg
    public final void c(awou awouVar, Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final awos get(awot awotVar) {
        if (awrc.c(this.c, awotVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.awos
    public final awot getKey() {
        return this.c;
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return awrc.c(this.c, awotVar) ? awov.a : this;
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        return JniZero.u(this, awouVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
