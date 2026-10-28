package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzy extends azt {
    @Override // defpackage.azt
    public final void f(dpd dpdVar) {
        dpdVar.b();
        try {
            dpdVar.e(a.cf(System.currentTimeMillis() - eaz.a, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ", " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"));
            dpdVar.f();
        } finally {
            dpdVar.d();
        }
    }
}
