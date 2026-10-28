package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pgf extends dma {
    @Override // defpackage.dma
    public final String a() {
        return "INSERT OR IGNORE INTO `chime_thread_states` (`id`,`thread_id`,`last_updated_version`,`read_state`,`deletion_status`,`count_behavior`,`system_tray_behavior`,`modified_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
    }

    @Override // defpackage.dma
    public final /* bridge */ /* synthetic */ void b(dpb dpbVar, Object obj) {
        pgc pgcVar = (pgc) obj;
        dpbVar.g(1, pgcVar.a);
        dpbVar.i(2, pgcVar.b);
        dpbVar.g(3, pgcVar.c);
        dpbVar.g(4, pgcVar.h - 1);
        dpbVar.g(5, pgcVar.d.d);
        dpbVar.g(6, pgcVar.f - 1);
        dpbVar.g(7, pgcVar.g - 1);
        dpbVar.g(8, pgcVar.e);
    }
}
