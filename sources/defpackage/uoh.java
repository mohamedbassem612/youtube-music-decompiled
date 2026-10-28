package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uoh implements uoi {
    private final String a;
    private final alay b;

    public uoh(String str) {
        str.getClass();
        this.a = str;
        alay alayVarD = ackj.d(str);
        alayVarD.getClass();
        this.b = alayVarD;
    }

    @Override // defpackage.uoi
    public final alay a() {
        return this.b;
    }

    @Override // defpackage.uoi
    public final String b() {
        return this.a;
    }

    @Override // defpackage.uoi
    public final void c(ahub ahubVar) {
        aihf aihfVar = (aihf) ahubVar.a;
        aihfVar.copyOnWrite();
        apgv apgvVar = (apgv) aihfVar.instance;
        apgv apgvVar2 = apgv.a;
        apgvVar.c = 1;
        apgvVar.d = this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof uoh) && awrc.c(this.a, ((uoh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringEditPrompt(prompt=" + this.a + ')';
    }
}
