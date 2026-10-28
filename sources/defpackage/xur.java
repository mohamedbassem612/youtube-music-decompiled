package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xur {
    public final Object a;
    public final Object b;

    public xur(xit xitVar, vyo vyoVar, tbt tbtVar) {
        amzd amzdVar = vyoVar.b().m;
        this.a = (amzdVar == null ? amzd.a : amzdVar).b ? xitVar : new xjc();
        this.b = tbtVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, xit] */
    public final void a(xvu xvuVar) {
        ((tbt) this.b).c(new xne(xvuVar));
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amiz.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder2.instance;
        amizVar.f = 1;
        amizVar.b |= 8;
        aihfVarCreateBuilder2.copyOnWrite();
        amiz amizVar2 = (amiz) aihfVarCreateBuilder2.instance;
        String str = xvuVar.aA;
        str.getClass();
        amizVar2.b |= 2;
        amizVar2.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiz amizVar3 = (amiz) aihfVarCreateBuilder2.build();
        amizVar3.getClass();
        amiuVar.O = amizVar3;
        amiuVar.d |= 32;
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.build();
        ?? r4 = this.a;
        r4.w(13, amiuVar2);
        r4.v("mdx_cr", 13);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, xit] */
    public final void b(xvu xvuVar) {
        ((tbt) this.b).c(new xnf(xvuVar));
        ?? r6 = this.a;
        r6.t(13);
        r6.u("mdx_cs", 13);
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amiz.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder2.instance;
        amizVar.e = 1;
        amizVar.b |= 4;
        aihfVarCreateBuilder2.copyOnWrite();
        amiz amizVar2 = (amiz) aihfVarCreateBuilder2.instance;
        String str = xvuVar.aA;
        str.getClass();
        amizVar2.b |= 1;
        amizVar2.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiz amizVar3 = (amiz) aihfVarCreateBuilder2.build();
        amizVar3.getClass();
        amiuVar.O = amizVar3;
        amiuVar.d |= 32;
        r6.w(13, (amiu) aihfVarCreateBuilder.build());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zaw] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, zaw] */
    public final void c(String str, String str2) {
        ?? r0 = this.a;
        if (r0.isEmpty() || r0.contains(str)) {
            try {
                HashMap map = new HashMap();
                Iterator it = agfm.d("[\\r\\n]+").f(str2).iterator();
                while (it.hasNext()) {
                    List listH = agfm.c(": ").h((String) it.next());
                    if (listH.size() >= 2) {
                        map.put((String) listH.get(0), (String) listH.get(1));
                    }
                }
                this.b.j(new ywx(str, map));
            } catch (IOException e) {
                this.b.k(e);
            }
        }
    }

    public xur(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public xur(Handler handler, List list) {
        this.b = handler;
        this.a = list;
    }
}
