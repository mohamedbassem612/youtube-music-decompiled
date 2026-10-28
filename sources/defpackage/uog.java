package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uog implements uoi {
    private final apgs a;
    private final alay b;

    public uog(apgs apgsVar, alay alayVar) {
        apgsVar.getClass();
        alayVar.getClass();
        this.a = apgsVar;
        this.b = alayVar;
    }

    @Override // defpackage.uoi
    public final alay a() {
        return this.b;
    }

    @Override // defpackage.uoi
    public final String b() {
        return null;
    }

    @Override // defpackage.uoi
    public final void c(ahub ahubVar) {
        aihf aihfVar = (aihf) ahubVar.a;
        aihfVar.copyOnWrite();
        apgv apgvVar = (apgv) aihfVar.instance;
        apgv apgvVar2 = apgv.a;
        apgvVar.d = this.a;
        apgvVar.c = 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uog) {
            uog uogVar = (uog) obj;
            if (awrc.c(this.a, uogVar.a) && awrc.c(this.b, uogVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FixedIdPrompt(fixedIdPromptAction=" + this.a + ", loadingText=" + this.b + ')';
    }
}
