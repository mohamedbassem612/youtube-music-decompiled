package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cij {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final agke g;

    public cij(long j, int i, List list, List list2, List list3, List list4, agke agkeVar) {
        this.a = j;
        this.b = i;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.e = DesugarCollections.unmodifiableList(list3);
        this.f = DesugarCollections.unmodifiableList(list4);
        this.g = agkeVar;
    }
}
