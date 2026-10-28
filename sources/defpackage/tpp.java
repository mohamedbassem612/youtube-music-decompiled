package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tpp extends sye {
    private final Set a;

    public tpp(Set set) {
        this.a = set;
    }

    @Override // defpackage.sye
    protected final void a() {
        Set set = this.a;
        if (set.isEmpty()) {
            return;
        }
        agpr agprVar = (agpr) set;
        ArrayList arrayList = new ArrayList(agprVar.e);
        agqr it = agprVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((afkb) it.next()).a());
        }
        ahng.w(new ahek(true, agke.j(arrayList)).c(new tpo(0), MoreExecutors.directExecutor()));
    }
}
