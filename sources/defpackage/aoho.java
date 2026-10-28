package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoho extends tzk {
    public final aihf a;

    private aoho() {
        super(null);
        this.a = aohr.a.createBuilder();
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return ao();
    }

    public final void am(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.bZ((aqdp) it.next());
        }
    }

    public final void an() {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aohr aohrVar = (aohr) aihfVar.instance;
        aohr aohrVar2 = aohr.a;
        aohrVar.d = aohr.emptyProtobufList();
    }

    public final aohq ao() {
        return new aohq((aohr) this.a.build());
    }

    public aoho(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }
}
