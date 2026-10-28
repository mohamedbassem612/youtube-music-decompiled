package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgp implements awos {
    private final bgp a;
    private final bfp b;

    public bgp(bgp bgpVar, bfp bfpVar) {
        this.a = bgpVar;
        this.b = bfpVar;
    }

    public final void a(bec becVar) {
        if (this.b == becVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        bgp bgpVar = this.a;
        if (bgpVar != null) {
            bgpVar.a(becVar);
        }
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
    public final awot getKey() {
        return ahx.b;
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
