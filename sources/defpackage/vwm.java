package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwm implements vwk {
    public static final Comparator a = new cru(9);
    private final Set b;
    private final Executor c;

    public vwm(Set set, Executor executor) {
        if (set.isEmpty()) {
            throw new IllegalStateException();
        }
        this.b = set;
        this.c = executor;
    }

    @Override // defpackage.vwk
    public final vwj a(tmr tmrVar) {
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        agqr it = ((agqj) this.b).iterator();
        while (it.hasNext()) {
            vwj vwjVarA = ((vwk) it.next()).a(tmrVar);
            arrayList.add(vwjVarA.b());
            arrayList2.add(vwjVarA.a());
        }
        ahdn ahdnVar = new ahdn(agke.j(arrayList), false);
        qmd qmdVar = new qmd(6);
        Executor executor = this.c;
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(ahdnVar, qmdVar);
        ahdnVar.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return new vwl(ahcrVar, (vwn) Collections.max(arrayList2, a));
    }
}
