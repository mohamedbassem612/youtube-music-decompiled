package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hzc {
    private final hyz a;

    public hzc(hyz hyzVar) {
        this.a = hyzVar;
    }

    private static abnl c(hyz hyzVar) {
        if (hyzVar != null) {
            return hyzVar.n();
        }
        return null;
    }

    public final Optional a() {
        return Optional.ofNullable(this.a);
    }

    public final boolean b(hyz hyzVar, boolean z) {
        hyz hyzVar2 = this.a;
        if (hyzVar2 != null && hyzVar.m() == hyzVar2.m()) {
            return true;
        }
        if (z) {
            return gzj.ad(c(hyzVar), c(hyzVar2));
        }
        return false;
    }
}
