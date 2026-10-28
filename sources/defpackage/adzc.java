package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzc {
    public final boolean a;
    public final amzi b;
    public final int c;

    public adzc(boolean z, int i, amzi amziVar) {
        this.a = z;
        this.c = i;
        this.b = amziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adzc) {
            adzc adzcVar = (adzc) obj;
            if (this.a == adzcVar.a && this.c == adzcVar.c && awrc.c(this.b, adzcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        amzi amziVar = this.b;
        return (((a.aj(this.a) * 31) + this.c) * 31) + (amziVar == null ? 0 : amziVar.hashCode());
    }

    public final String toString() {
        return "ContextualSheetOptions(inputMethodNotNeeded=" + this.a + ", surfaceStyle=" + ((Object) Integer.toString(this.c - 1)) + ", minWidth=" + this.b + ')';
    }

    public adzc() {
        throw null;
    }
}
