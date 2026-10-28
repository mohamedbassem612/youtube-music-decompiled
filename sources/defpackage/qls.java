package defpackage;

import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class qls extends qlz {
    private final qln d;
    private volatile Object e;

    public qls(String str, String str2, qmj qmjVar, qln qlnVar) {
        super(str, str2, qmjVar);
        this.d = qlnVar;
    }

    @Override // defpackage.qlj
    protected final Object b(Object obj) {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.qlj
    protected final Object c(String str) {
        return this.d.a(Base64.decode(str, 3));
    }

    @Override // defpackage.qlm
    public final Object d() {
        return this.e;
    }

    @Override // defpackage.qlm
    public final void g(Object obj) {
        this.e = obj;
    }
}
