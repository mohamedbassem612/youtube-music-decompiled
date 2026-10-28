package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avic {
    public final avaq a;
    public auzd b;
    public boolean c = false;
    public auze d = auze.a(auzd.d);

    public avic(avaq avaqVar, auzd auzdVar) {
        this.a = avaqVar;
        this.b = auzdVar;
    }

    public final auzd a() {
        return this.d.a;
    }

    public final void b(auzd auzdVar) {
        boolean z;
        this.b = auzdVar;
        if (auzdVar == auzd.b || auzdVar == auzd.c) {
            z = true;
        } else if (auzdVar != auzd.d) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
