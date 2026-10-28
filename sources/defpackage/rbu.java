package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rbu implements cli {
    private final cli a;
    private final Set b;

    public rbu(cli cliVar, Set set) {
        this.a = cliVar;
        this.b = set;
    }

    @Override // defpackage.cli
    public final clk b(gmj gmjVar) {
        clk clkVarB = this.a.b(gmjVar);
        Set set = this.b;
        rbt rbtVar = new rbt(clkVarB, set);
        set.add(rbtVar);
        return rbtVar;
    }
}
