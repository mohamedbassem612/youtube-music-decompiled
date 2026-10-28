package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ahg implements awos {
    public static final ahx a = new ahx();

    @Override // defpackage.awou
    public final /* bridge */ Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final /* bridge */ awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final awot getKey() {
        return a;
    }

    @Override // defpackage.awou
    public final /* bridge */ awou minusKey(awot awotVar) {
        return JniZero.t(this, awotVar);
    }

    @Override // defpackage.awou
    public final /* bridge */ awou plus(awou awouVar) {
        return JniZero.u(this, awouVar);
    }
}
