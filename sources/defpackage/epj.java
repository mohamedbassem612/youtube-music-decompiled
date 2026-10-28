package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class epj extends epf {
    final /* synthetic */ epk g;

    public epj(epk epkVar) {
        this.g = epkVar;
    }

    @Override // defpackage.epf
    protected final String a() {
        epg epgVar = (epg) this.g.a.get();
        if (epgVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(epgVar.a) + ']';
    }
}
