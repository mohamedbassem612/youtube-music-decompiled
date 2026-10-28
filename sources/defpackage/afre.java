package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afre {
    public final afsv a;

    public afre(afsv afsvVar) {
        this.a = afsvVar;
    }

    public static afre a(String str) {
        aihf aihfVarCreateBuilder = afsv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        afsv afsvVar = (afsv) aihfVarCreateBuilder.instance;
        str.getClass();
        afsvVar.b |= 1;
        afsvVar.c = str;
        return new afre((afsv) aihfVarCreateBuilder.build());
    }

    public final String b() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afre) && this.a.c.equals(((afre) obj).a.c);
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", b());
    }
}
