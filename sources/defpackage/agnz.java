package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agnz extends agqo {
    final /* synthetic */ agek a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnz(Iterator it, agek agekVar) {
        super(it);
        this.a = agekVar;
    }

    @Override // defpackage.agqo
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, this.a.apply(obj));
    }
}
