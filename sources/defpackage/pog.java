package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pog implements awos {
    private final poh a;

    public pog(poh pohVar) {
        this.a = pohVar;
    }

    @Override // defpackage.awou
    public final /* bridge */ Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final /* bridge */ awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final /* synthetic */ awot getKey() {
        return this.a;
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
