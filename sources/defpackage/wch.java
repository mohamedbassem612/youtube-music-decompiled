package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wch implements wcg, zwg {
    public Throwable a;
    private final wfd b;

    public wch(awmd awmdVar, wfc wfcVar, tbt tbtVar) {
        awmdVar.getClass();
        wfcVar.getClass();
        tbtVar.getClass();
        tbtVar.f(this);
        this.b = wfcVar.a(new hph(this, awmdVar, 18));
    }

    @Override // defpackage.zwg
    public final synchronized void a(zwa zwaVar) {
        zwaVar.getClass();
        this.b.c(zwaVar);
    }

    @Override // defpackage.wel
    /* JADX INFO: renamed from: b */
    public final synchronized wby e(zwa zwaVar) {
        zwaVar.getClass();
        return (wby) this.b.b(zwaVar);
    }

    @Override // defpackage.wbz
    public final wby c() {
        return (wby) this.b.a();
    }

    @Override // defpackage.wcg
    public final ByteStore d() {
        return ((wck) this.b.a()).b.a;
    }

    @tcc
    public final synchronized void handleSignOutEvent(zwu zwuVar) {
        zwuVar.getClass();
        this.b.d();
    }
}
