package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxn implements awos, awot {
    private final /* synthetic */ int $cid;
    public static final awxn b = new awxn(1);
    public static final awxn a = new awxn(0);

    private awxn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return this.$cid != 0 ? JniZero.r(this, obj, awqkVar) : JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final awos get(awot awotVar) {
        return this.$cid != 0 ? JniZero.s(this, awotVar) : JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final awot getKey() {
        return this.$cid != 0 ? b : this;
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return this.$cid != 0 ? JniZero.t(this, awotVar) : JniZero.t(this, awotVar);
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        return this.$cid != 0 ? JniZero.u(this, awouVar) : JniZero.u(this, awouVar);
    }
}
