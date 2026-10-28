package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awwq extends awom implements awwd {
    public static final awwq a = new awwq();

    private awwq() {
        super(awwd.d);
    }

    @Override // defpackage.awwd
    public final boolean kI() {
        throw null;
    }

    @Override // defpackage.awwd
    public final Object l(awoq awoqVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.awwd
    public final CancellationException m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.awwd
    public final awvk n(boolean z, boolean z2, awqg awqgVar) {
        return awwr.a;
    }

    @Override // defpackage.awwd
    public final awwd o() {
        return null;
    }

    @Override // defpackage.awwd
    public final boolean q() {
        return true;
    }

    @Override // defpackage.awwd
    public final boolean r() {
        return false;
    }

    @Override // defpackage.awwd
    public final awuh t(awwk awwkVar) {
        return awwr.a;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.awwd
    public final void v() {
    }

    @Override // defpackage.awwd
    public final void kJ(awqg awqgVar) {
    }

    @Override // defpackage.awwd
    public final void p(CancellationException cancellationException) {
    }
}
