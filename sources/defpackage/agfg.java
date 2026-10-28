package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class agfg implements agfl {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ agfg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.agfl
    public final Iterator a(agfm agfmVar, CharSequence charSequence) {
        int i = this.$cid;
        Object obj = this.a;
        return i != 0 ? new agfi(agfmVar, charSequence, (String) obj) : new agfj(agfmVar, charSequence, ((agdx) obj).a(charSequence));
    }
}
