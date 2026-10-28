package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agme extends agqp {
    final /* synthetic */ agmf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agme(agmf agmfVar, ListIterator listIterator) {
        super(listIterator);
        this.a = agmfVar;
    }

    @Override // defpackage.agqo
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
