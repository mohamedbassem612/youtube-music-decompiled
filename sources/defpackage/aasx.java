package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasx implements agfr {
    final /* synthetic */ aamw a;
    final /* synthetic */ aasy b;

    public aasx(aasy aasyVar, aamw aamwVar) {
        this.a = aamwVar;
        this.b = aasyVar;
    }

    @Override // defpackage.agfr
    public final /* bridge */ /* synthetic */ Object io() {
        long j = aarq.a;
        if (this.a.f.m("is_external_media_source", false)) {
            return null;
        }
        return (jsk) this.b.d.io();
    }
}
