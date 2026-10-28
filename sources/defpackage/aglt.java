package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aglt extends agqo {
    final /* synthetic */ agek a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aglt(Iterator it, agek agekVar) {
        super(it);
        this.a = agekVar;
    }

    @Override // defpackage.agqo
    public final Object a(Object obj) {
        return this.a.apply(obj);
    }
}
