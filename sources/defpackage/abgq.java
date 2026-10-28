package defpackage;

import android.content.Context;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgq {
    final zho a;
    final twf b;
    final tpq c;
    final Function d;
    final zkk e;
    final tfq f;
    final yyp g;
    final abuz h;
    final xgl i;

    public abgq(zho zhoVar, abuz abuzVar, tfq tfqVar, twf twfVar, yyp yypVar, tpq tpqVar, Function function, zkk zkkVar, xgl xglVar) {
        this.a = zhoVar;
        this.h = abuzVar;
        this.f = tfqVar;
        this.b = twfVar;
        this.g = yypVar;
        this.c = tpqVar;
        this.d = function;
        this.e = zkkVar;
        this.i = xglVar;
    }

    public final abgp a(Context context, abgm abgmVar, abvn abvnVar) {
        tpq tpqVar = this.c;
        tpqVar.getClass();
        agfa agfaVar = new agfa(tpqVar);
        tfq tfqVar = this.f;
        tte tteVar = new tte(context, tfqVar, null);
        twf twfVar = this.b;
        zkk zkkVar = this.e;
        return new abgp(abgmVar, context, agfaVar, this.a, this.h, tfqVar, twfVar, zkkVar, this.d, this.g, tteVar, abvnVar, this.i);
    }
}
