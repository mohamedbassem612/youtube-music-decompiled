package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wcf implements wcg, zwg {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/entities/inmemory/impl/InMemoryEntityStoreWeakRefFactoryImpl");
    public Throwable b;
    private final wfd c;

    public wcf(awmd awmdVar, wfc wfcVar, tbt tbtVar) {
        this.c = wfcVar.a(new wce(this, awmdVar, 0));
        tbtVar.f(this);
    }

    @Override // defpackage.zwg
    public final synchronized void a(zwa zwaVar) {
        this.c.c(zwaVar);
    }

    @Override // defpackage.wel
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized wby e(zwa zwaVar) {
        return (wby) this.c.b(zwaVar);
    }

    @Override // defpackage.wbz
    @Deprecated
    public final wby c() {
        return (wby) this.c.a();
    }

    @Override // defpackage.wcg
    public final ByteStore d() {
        return ((wcd) this.c.a()).a.a;
    }

    @tcc
    public synchronized void handleSignOutEvent(zwu zwuVar) {
        this.c.d();
    }
}
