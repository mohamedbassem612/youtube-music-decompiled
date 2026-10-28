package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tmi extends tmj {
    private final tmq a;

    public tmi(tmq tmqVar) {
        this.a = tmqVar;
    }

    @Override // defpackage.tmp
    public final int b() {
        return 2;
    }

    @Override // defpackage.tmj, defpackage.tmp
    public final tmq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tmp)) {
            return false;
        }
        tmp tmpVar = (tmp) obj;
        return tmpVar.b() == 2 && this.a.equals(tmpVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataOrParsed{parsed=" + this.a.toString() + '}';
    }
}
