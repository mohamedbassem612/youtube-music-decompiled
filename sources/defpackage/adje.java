package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adje extends esq {
    @Override // defpackage.esq
    public final /* bridge */ /* synthetic */ esn b() {
        return (adjd) super.b();
    }

    @Override // defpackage.esq
    public final /* bridge */ /* synthetic */ esn c() {
        return a(Drawable.class);
    }

    @Override // defpackage.esq
    public final /* bridge */ /* synthetic */ esn d(Drawable drawable) {
        return (adjd) super.d(drawable);
    }

    @Override // defpackage.esq
    public final /* bridge */ /* synthetic */ esn e(Integer num) {
        return (adjd) super.e(num);
    }

    @Override // defpackage.esq
    public final /* bridge */ /* synthetic */ esn f(Object obj) {
        return (adjd) super.f(obj);
    }

    @Override // defpackage.esq
    public final /* bridge */ /* synthetic */ esn g(byte[] bArr) {
        return (adjd) super.g(bArr);
    }

    @Override // defpackage.esq
    protected final void p(fec fecVar) {
        if (fecVar instanceof adjb) {
            super.p(fecVar);
        } else {
            super.p(new adjb().l(fecVar));
        }
    }

    @Override // defpackage.esq
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final adjd a(Class cls) {
        return new adjd(this.a, this, cls, this.b);
    }

    @Override // defpackage.esq
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final synchronized void s(fec fecVar) {
        super.s(fecVar);
    }
}
