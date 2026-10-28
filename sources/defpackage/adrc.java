package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrc implements bog {
    final /* synthetic */ adrf a;

    public adrc(adrf adrfVar) {
        this.a = adrfVar;
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        adqm adqmVar = this.a.k;
        boh bohVar = adqmVar != null ? adqmVar.c : null;
        if (bohVar != null) {
            return bohVar;
        }
        throw new IllegalStateException("localRegistry must not be null");
    }
}
