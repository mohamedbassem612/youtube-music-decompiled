package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awom implements awos {
    private final awot key;

    public awom(awot awotVar) {
        awotVar.getClass();
        this.key = awotVar;
    }

    @Override // defpackage.awou
    public /* bridge */ Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public /* bridge */ awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public awot getKey() {
        return this.key;
    }

    @Override // defpackage.awou
    public /* bridge */ awou minusKey(awot awotVar) {
        return JniZero.t(this, awotVar);
    }

    @Override // defpackage.awou
    public awou plus(awou awouVar) {
        awouVar.getClass();
        return atqq.e(this, awouVar);
    }
}
