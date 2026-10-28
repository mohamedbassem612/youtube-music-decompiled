package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class achm extends wqi {
    private final zwb c;

    public achm(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(wlpVar, abxvVar, zwbVar, tggVar);
        this.c = zwbVar;
    }

    @Override // defpackage.wqi
    public final wqh a() {
        return new achn(this.b, this.c.e());
    }
}
