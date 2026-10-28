package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agoc extends agoe {
    final /* synthetic */ agod a;

    public agoc(agod agodVar) {
        this.a = agodVar;
    }

    @Override // defpackage.agoe
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        agod agodVar = this.a;
        return new agnz(agodVar.a.iterator(), agodVar.b);
    }
}
