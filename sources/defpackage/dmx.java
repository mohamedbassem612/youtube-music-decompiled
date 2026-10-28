package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmx implements awos {
    public static final ahx b = new ahx();
    public final awor a;

    public dmx(awor aworVar) {
        this.a = aworVar;
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final awot getKey() {
        return b;
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return JniZero.t(this, awotVar);
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        return JniZero.u(this, awouVar);
    }
}
