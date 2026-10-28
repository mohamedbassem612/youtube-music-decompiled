package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pvt extends dma {
    @Override // defpackage.dma
    public final String a() {
        return "INSERT OR IGNORE INTO `gnp_experiments` (`id`,`account_name`,`experiment_id`,`experiment_type`,`insertion_time`,`experiment_source`) VALUES (nullif(?, 0),?,?,?,?,?)";
    }

    @Override // defpackage.dma
    public final /* synthetic */ void b(dpb dpbVar, Object obj) {
        ptk ptkVar = (ptk) obj;
        dpbVar.g(1, ptkVar.a);
        dpbVar.i(2, ptkVar.b);
        dpbVar.g(3, ptkVar.c);
        dpbVar.g(4, qnl.ai(ptkVar.d));
        dpbVar.g(5, ptkVar.e.toEpochMilli());
        dpbVar.g(6, qnl.al(ptkVar.f));
    }
}
