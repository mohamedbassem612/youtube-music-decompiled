package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eeb extends dma {
    @Override // defpackage.dma
    public final String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.dma
    public final /* bridge */ /* synthetic */ void b(dpb dpbVar, Object obj) {
        edz edzVar = (edz) obj;
        dpbVar.i(1, edzVar.a);
        dpbVar.g(2, edzVar.b.longValue());
    }
}
