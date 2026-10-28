package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agfh extends agdg {
    final /* synthetic */ agdw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agfh(agfm agfmVar, CharSequence charSequence, agdw agdwVar) {
        super(agfmVar, charSequence);
        this.g = agdwVar;
    }

    @Override // defpackage.agdg
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.agdg
    public final int b(int i) {
        return this.g.d(this.b, i);
    }
}
