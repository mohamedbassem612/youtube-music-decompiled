package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeig {
    final aeii a;
    final aeif b;
    final aeie c;
    final boolean d = true;
    final boolean e;

    public aeig(aeii aeiiVar, aeif aeifVar, aeie aeieVar) {
        this.a = aeiiVar;
        this.b = aeifVar;
        this.c = aeieVar;
        this.e = aeiiVar == null;
    }

    public final String toString() {
        aeii aeiiVar = this.a;
        return String.format("EventTarget(target=%s, guard=%s, action=%s, local=%s)", aeiiVar != null ? aeiiVar.toString() : "internal", Boolean.valueOf(this.b != null), Boolean.valueOf(this.c != null), Boolean.TRUE);
    }
}
