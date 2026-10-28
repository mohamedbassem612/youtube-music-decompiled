package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwp extends agjd {
    private final agfr a;
    private final Set b;
    private final agfr c;

    public agwp(Set set, agfr agfrVar, agfr agfrVar2) {
        this.b = set;
        this.a = agfrVar;
        this.c = agfrVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agjd, defpackage.agiy
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set b() {
        if (((Boolean) this.a.io()).booleanValue()) {
            return this.b;
        }
        throw new IllegalStateException((String) this.c.io());
    }

    @Override // defpackage.agjd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.hashCode();
    }
}
