package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class wqi extends wnn {
    private final zwb c;
    private final wnh d;

    public wqi(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = f(alus.a, wlpVar, new wpa(14), new wph(9));
    }

    public wqh a() {
        return new wqh(this.b, this.c.e());
    }

    public final alus b(wqh wqhVar) {
        return (alus) this.d.c(wqhVar);
    }

    protected wqi() {
        this.d = null;
        this.c = zwd.a;
    }
}
