package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eei extends dma {
    @Override // defpackage.dma
    public final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.dma
    public final /* bridge */ /* synthetic */ void b(dpb dpbVar, Object obj) {
        eeg eegVar = (eeg) obj;
        dpbVar.i(1, eegVar.a);
        dpbVar.g(2, eegVar.b);
        dpbVar.g(3, eegVar.c);
    }
}
