package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agfk implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ agfm b;

    public agfk(agfm agfmVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = agfmVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.g(this.a);
    }

    public final String toString() {
        ager agerVar = new ager(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        agerVar.i(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
