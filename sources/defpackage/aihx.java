package defpackage;

import java.util.AbstractList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aihx extends AbstractList {
    private final aihv a;
    private final aihw b;

    public aihx(aihv aihvVar, aihw aihwVar) {
        this.a = aihvVar;
        this.b = aihwVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.d(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
