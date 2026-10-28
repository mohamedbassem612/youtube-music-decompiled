package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abef implements abei {
    public final wjf a;

    public abef(wjf wjfVar) {
        this.a = wjfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abef) && awrc.c(this.a, ((abef) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerResponseLoaded(response=" + this.a + ')';
    }
}
