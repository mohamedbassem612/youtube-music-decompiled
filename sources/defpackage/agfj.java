package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agfj extends agdg {
    final /* synthetic */ ahub g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agfj(agfm agfmVar, CharSequence charSequence, ahub ahubVar) {
        super(agfmVar, charSequence);
        this.g = ahubVar;
    }

    @Override // defpackage.agdg
    public final int a(int i) {
        return ((Matcher) this.g.a).end();
    }

    @Override // defpackage.agdg
    public final int b(int i) {
        Matcher matcher = (Matcher) this.g.a;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
