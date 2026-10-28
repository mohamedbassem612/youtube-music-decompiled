package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edx extends dma {
    @Override // defpackage.dma
    public final String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.dma
    public final /* bridge */ /* synthetic */ void b(dpb dpbVar, Object obj) {
        eol eolVar = (eol) obj;
        dpbVar.i(1, (String) eolVar.b);
        dpbVar.i(2, (String) eolVar.a);
    }
}
