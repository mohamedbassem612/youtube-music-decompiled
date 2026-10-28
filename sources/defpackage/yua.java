package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yua extends yuf {
    private final agke a;

    public yua(agke agkeVar) {
        agkeVar.getClass();
        this.a = agkeVar;
    }

    @Override // defpackage.yuf
    public final yty a(List list) {
        list.getClass();
        return new yty(true, this.a, null, null);
    }

    @Override // defpackage.yuf
    public final agke b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof yua) && awrc.c(this.a, ((yua) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplaceList(videosToQueue=" + this.a + ')';
    }
}
