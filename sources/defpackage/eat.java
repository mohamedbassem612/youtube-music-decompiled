package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eat implements ear {
    public final ear a;
    public final Object b = new Object();

    public eat(ear earVar) {
        this.a = earVar;
    }

    @Override // defpackage.ear
    public final boolean a(eek eekVar) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = ((eas) this.a).a.containsKey(eekVar);
        }
        return zContainsKey;
    }

    @Override // defpackage.ear
    public final dov b(eek eekVar) {
        dov dovVarB;
        synchronized (this.b) {
            dovVarB = this.a.b(eekVar);
        }
        return dovVarB;
    }

    @Override // defpackage.ear
    public final dov c(eek eekVar) {
        dov dovVarC;
        synchronized (this.b) {
            dovVarC = this.a.c(eekVar);
        }
        return dovVarC;
    }
}
