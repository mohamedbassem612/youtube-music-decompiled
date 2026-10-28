package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vka implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vka(boolean z, boolean z2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.$cid != 0 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        return this.$cid != 0 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.$cid != 0 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.$cid != 0) {
            aigj aigjVar = hpb.a;
            boolean zC = igs.c(((anyx) obj).getMusicVideoType());
            if (this.a) {
                if (zC) {
                    zC = true;
                    return this.b ? false : false;
                }
            } else if (this.b || !zC) {
            }
        } else {
            augy augyVar = (augy) obj;
            if (!this.a) {
                auhv auhvVar = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
                ameh amehVar = (auhvVar.c == 2 ? (auih) auhvVar.d : auih.a).e;
                if (amehVar == null) {
                    amehVar = ameh.a;
                }
                apji apjiVar = amehVar.e;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apcj.b);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    return false;
                }
            }
            if (!this.b && yno.fe(augyVar)) {
                return false;
            }
        }
        return true;
    }
}
