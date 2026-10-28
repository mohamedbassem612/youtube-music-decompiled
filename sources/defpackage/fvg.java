package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvg {
    public final List a;
    public final fkb b;
    public jnm c;

    public fvg(fkb fkbVar) {
        new agk(10);
        this.a = new ArrayList();
        new HashSet();
        this.b = fkbVar;
    }

    public final Object a(long j) {
        fvi fviVar = (fvi) this.b.a.e(j);
        if (fviVar == null) {
            return null;
        }
        return fviVar.a;
    }

    @Deprecated
    public final jnm b(fvv fvvVar) {
        jnm jnmVar = new jnm(fvvVar, this, fvvVar.b());
        if (fvvVar instanceof flx) {
            this.b.u = (flx) fvvVar;
            this.c = jnmVar;
        }
        this.a.add(jnmVar);
        return jnmVar;
    }
}
