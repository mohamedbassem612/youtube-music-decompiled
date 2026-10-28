package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zit extends ziu {
    private final wja a;

    public zit(wja wjaVar) {
        this.a = wjaVar;
    }

    @Override // defpackage.zjl
    public final int a() {
        return 2;
    }

    @Override // defpackage.ziu, defpackage.zjl
    public final wja b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zjl)) {
            return false;
        }
        zjl zjlVar = (zjl) obj;
        return zjlVar.a() == 2 && this.a.equals(zjlVar.b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CapabilitiesContext{sabr=" + this.a.toString() + '}';
    }
}
