package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaww {
    public final wjf a;
    public final akef b;

    public aaww(wjf wjfVar, akef akefVar) {
        this.a = wjfVar;
        this.b = akefVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aaww)) {
            return false;
        }
        aaww aawwVar = (aaww) obj;
        return Objects.equals(this.b, aawwVar.b) && Objects.equals(this.a, aawwVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
