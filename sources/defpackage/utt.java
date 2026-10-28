package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utt implements utv {
    private final agke a;

    public utt(List list) {
        this.a = agke.n(list);
    }

    @Override // defpackage.utv
    public final String b() {
        return "CompositeCompositionMutation{" + ((String) Collection.EL.stream(this.a).map(new ush(9)).collect(Collectors.joining(","))) + '}';
    }

    @Override // defpackage.uub
    public final void c(urz urzVar) {
        agke agkeVar = this.a;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            ((utv) agkeVar.get(i)).c(urzVar);
        }
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        agke agkeVar = this.a;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            auhsVar = ((utv) agkeVar.get(i)).h(auhsVar);
        }
        return auhsVar;
    }

    public utt(agke agkeVar) {
        this.a = agkeVar;
    }
}
