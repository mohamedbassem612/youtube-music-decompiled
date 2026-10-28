package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xxu implements xyf {
    final /* synthetic */ abjl a;

    public xxu(abjl abjlVar) {
        this.a = abjlVar;
    }

    @Override // defpackage.xyf
    public final void b(List list) {
        abjl abjlVar = this.a;
        abjlVar.ha(1, 0, list);
        int size = list.size();
        abjlVar.hi(1, size, abjlVar.hc(1) - size);
    }

    @Override // defpackage.xyf
    public final void a() {
    }
}
