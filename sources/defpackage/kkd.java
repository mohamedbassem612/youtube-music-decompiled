package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kkd extends kid {
    private final agke b;

    public kkd(List list) {
        this.b = agke.n(list);
    }

    @Override // defpackage.kid
    public final ListenableFuture a(kiy kiyVar) {
        agke agkeVar = this.b;
        agjz agjzVarF = agke.f(agkeVar.size());
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            agjzVarF.h(((kid) agkeVar.get(i)).a(kiyVar));
        }
        return ahcs.e(ahng.k(agjzVarF.g()), new kke(1), MoreExecutors.directExecutor());
    }

    @Override // defpackage.kid
    public final auli b() {
        agke agkeVar = (agke) Collection.EL.stream(this.b).flatMap(new ixa(14)).collect(aghu.a);
        if (agkeVar.isEmpty()) {
            return null;
        }
        aihf aihfVarCreateBuilder = auli.a.createBuilder();
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            aihfVarCreateBuilder.mergeFrom((aihn) agkeVar.get(i));
        }
        return (auli) aihfVarCreateBuilder.build();
    }
}
