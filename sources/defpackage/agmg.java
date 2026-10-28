package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agmg extends agqp {
    final /* synthetic */ agmh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmg(agmh agmhVar, ListIterator listIterator) {
        super(listIterator);
        this.a = agmhVar;
    }

    @Override // defpackage.agqo
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
