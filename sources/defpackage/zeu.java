package defpackage;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zeu {
    private final Executor a;
    public ywn c = ywn.b;
    public final yha d;

    public zeu(yha yhaVar, ExecutorService executorService) {
        this.d = yhaVar;
        this.a = new ahfg(executorService);
    }

    public static boolean e(wgs wgsVar, yha yhaVar) {
        agkz agkzVarN;
        String strB;
        elr elrVarA;
        return (!wgsVar.W() || (strB = yhaVar.b((agkzVarN = agkz.n((Collection) yhaVar.c.io())), wgsVar.c, wgsVar.f)) == null || (elrVarA = yhaVar.g.A(agkzVarN, strB, false)) == null || elrVarA.F() == null || elrVarA.F().length == 0 || !yha.g(agkzVarN, strB, 0L, (long) elrVarA.F()[0]) || yhaVar.f(wgsVar)) ? false : true;
    }

    public final void d(ywn ywnVar, wja wjaVar) {
        this.c = ywnVar;
        this.a.execute(afwl.i(new gqc(this, wjaVar, wjaVar.E(), ywnVar, 3)));
    }
}
