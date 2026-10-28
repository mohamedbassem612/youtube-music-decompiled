package defpackage;

import j$.util.Optional;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abpz implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abpz(abqc abqcVar, boolean z, int i) {
        this.$cid = i;
        this.b = abqcVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [hpy, java.lang.Object] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            boolean z = this.a;
            return ((abqc) this.b).a((Optional) obj, z);
        }
        if (i != 1) {
            boolean z2 = this.a;
            return ((abqc) this.b).a((Optional) obj, z2);
        }
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return avlr.J(Optional.empty());
        }
        weh wehVar = (weh) optional.get();
        agke agkeVarC = hpb.c(wehVar);
        if (agkeVarC.isEmpty()) {
            return avlr.J(Optional.of(hte.a(Collections.nCopies(hpb.a(wehVar), Optional.empty()))));
        }
        ?? r1 = this.b;
        if (!this.a) {
            return gzj.at(new hpm((Object) r1, wehVar, agkeVarC, 2), r1.f(aqph.class).B(new hhw(agkeVarC, 4)), r1);
        }
        return gzj.at(new hpm((Object) r1, wehVar, agkeVarC, 0), r1.f(aqph.class).B(new hhw(agkz.n(agkeVarC), 3)), r1);
    }

    public /* synthetic */ abpz(boolean z, hpy hpyVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = hpyVar;
    }
}
