package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class agff implements agfl {
    public final /* synthetic */ agdw a;

    public /* synthetic */ agff(agdw agdwVar) {
        this.a = agdwVar;
    }

    @Override // defpackage.agfl
    public final Iterator a(agfm agfmVar, CharSequence charSequence) {
        return new agfh(agfmVar, charSequence, this.a);
    }
}
