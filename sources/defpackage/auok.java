package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auok implements auph {
    private volatile Object a;
    private final Object b = new Object();
    private final hhb c;

    public auok(hhb hhbVar) {
        this.c = hhbVar;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    hhb hhbVar = this.c;
                    aupr auprVar = gjo.a;
                    this.a = new ght(new ahud(hhbVar.a, (byte[]) null), new isi(), new kjc((byte[]) null));
                }
            }
        }
        return this.a;
    }
}
