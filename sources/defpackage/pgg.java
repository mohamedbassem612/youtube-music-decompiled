package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pgg extends dlz {
    @Override // defpackage.dlz
    protected final String a() {
        return "UPDATE OR ABORT `chime_thread_states` SET `id` = ?,`thread_id` = ?,`last_updated_version` = ?,`read_state` = ?,`deletion_status` = ?,`count_behavior` = ?,`system_tray_behavior` = ?,`modified_timestamp` = ? WHERE `id` = ?";
    }

    @Override // defpackage.dlz
    protected final /* bridge */ /* synthetic */ void b(dpb dpbVar, Object obj) {
        pgc pgcVar = (pgc) obj;
        long j = pgcVar.a;
        dpbVar.g(1, j);
        dpbVar.i(2, pgcVar.b);
        dpbVar.g(3, pgcVar.c);
        dpbVar.g(4, pgcVar.h - 1);
        dpbVar.g(5, pgcVar.d.d);
        dpbVar.g(6, pgcVar.f - 1);
        dpbVar.g(7, pgcVar.g - 1);
        dpbVar.g(8, pgcVar.e);
        dpbVar.g(9, j);
    }
}
