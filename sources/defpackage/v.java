package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class v implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final p b;
    public final s c;
    public final s d;

    public v(String str, p pVar, s sVar, s sVar2) {
        this.a = str;
        this.b = pVar;
        this.c = sVar;
        this.d = sVar2;
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        s sVar = this.c;
        String string = this.b.toString();
        String strConcat = sVar == null ? "" : " ".concat(sVar.toString());
        s sVar2 = this.d;
        String strConcat2 = sVar2 != null ? " ".concat(sVar2.toString()) : "";
        return this.a + ": " + string + strConcat + strConcat2;
    }
}
