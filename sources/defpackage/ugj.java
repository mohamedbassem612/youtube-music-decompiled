package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ugj extends uge {
    private final ugd a;
    private final agke b;

    private ugj(ugd ugdVar, agke agkeVar) {
        this.a = ugdVar;
        this.b = agkeVar;
    }

    @Override // defpackage.uge
    public final ugd a() {
        return this.a;
    }

    @Override // defpackage.uge
    public final agke b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uge) {
            uge ugeVar = (uge) obj;
            if (this.a.equals(ugeVar.a()) && aguu.v(this.b, ugeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.b;
        return "AudioDeviceChangeEvent{eventType=" + this.a.toString() + ", devices=" + agkeVar.toString() + '}';
    }

    public /* synthetic */ ugj(ugd ugdVar, agke agkeVar, ugi ugiVar) {
        this(ugdVar, agkeVar);
    }
}
