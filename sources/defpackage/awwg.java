package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awwg extends axdp implements awvk, awvz {
    public awwk d;

    public abstract void a(Throwable th);

    public abstract boolean b();

    public final awwk e() {
        awwk awwkVar = this.d;
        if (awwkVar != null) {
            return awwkVar;
        }
        awrc.b("job");
        return null;
    }

    @Override // defpackage.awvz
    public final awwp ku() {
        return null;
    }

    @Override // defpackage.awvk
    public final void kv() {
        Object objZ;
        awwk awwkVarE = e();
        do {
            objZ = awwkVarE.z();
            Objects.checkIndex(0, 4);
            if (objZ == null) {
                return;
            }
            if (objZ instanceof awwg) {
                if (objZ != this) {
                    return;
                }
            } else {
                if (!(objZ instanceof awwj)) {
                    if (!(objZ instanceof awvz) || ((awvz) objZ).ku() == null) {
                        return;
                    }
                    m();
                    return;
                }
                if (!awwl.a) {
                    m();
                    return;
                }
                while (true) {
                    Object objF = f();
                    if ((objF instanceof axdt) || awrc.c(objF, this)) {
                        return;
                    }
                    if (objF instanceof axdp) {
                        if (this.e.d(objF, ((axdp) objF).i())) {
                            return;
                        }
                    }
                }
            }
        } while (!awwkVarE.e.d(objZ, awwl.h));
    }

    @Override // defpackage.awvz
    public final boolean kw() {
        return true;
    }

    @Override // defpackage.axdp
    public final String toString() {
        return awuw.a(this) + '@' + awuw.b(this) + "[job@" + awuw.b(e()) + ']';
    }
}
