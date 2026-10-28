package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eem extends dma {
    @Override // defpackage.dma
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.dma
    public final /* bridge */ /* synthetic */ void b(dpb dpbVar, Object obj) {
        qv qvVar = (qv) obj;
        dpbVar.i(1, (String) qvVar.b);
        dpbVar.i(2, (String) qvVar.a);
    }
}
