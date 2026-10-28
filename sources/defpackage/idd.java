package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class idd {
    public abstract ieg a();

    public abstract wgi b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public final Optional f() {
        if (b() != null) {
            return hna.C(fhz.ah(b().a));
        }
        return a() != null ? a().s : Optional.empty();
    }

    public final boolean g() {
        aouj aoujVarAb;
        if (a() != null && !a().a.isEmpty()) {
            return true;
        }
        if (b() != null) {
            amae amaeVar = b().a;
            aoujVarAb = fhz.ab(b().a);
        } else {
            aoujVarAb = null;
        }
        if (c()) {
            if (aoujVarAb != null && aoujVarAb.g.size() > 0) {
                return true;
            }
        } else if (b() != null) {
            return true;
        }
        return false;
    }
}
