package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agrz extends agsc {
    final /* synthetic */ agsc a;
    final /* synthetic */ agsc b;

    public agrz(agsc agscVar, agsc agscVar2) {
        this.a = agscVar;
        this.b = agscVar2;
    }

    @Override // defpackage.agsc
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
