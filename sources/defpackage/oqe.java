package defpackage;

import com.google.android.libraries.multiplatform.elements.ElementsServices;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oqe implements awmd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ oqe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r9v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, zwb] */
    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        switch (this.$cid) {
            case 0:
                return ((ElementsServices) this.a).L().io().c();
            case 1:
                aimn aimnVar = iqe.a;
                ?? r9 = this.a;
                return r9.u() ? r9.e().k() : "signedout";
            case 2:
                int i = oqu.t;
                return this.a.k().L().io().c();
            case 3:
                boolean z = osu.a;
                return this.a;
            case 4:
                return ((tkr) this.a).q;
            case 5:
                return (aczl) this.a.io();
            case 6:
                return (uvz) this.a.io();
            case 7:
                return ((vrt) this.a).d;
            case 8:
                return (ElementsServices) ((vrt) this.a).e.io();
            case 9:
                return this.a.c();
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return this.a;
            case 15:
                yqo yqoVar = (yqo) this.a;
                ytf ytfVar = yqoVar.n;
                zjd zjdVar = yqoVar.o;
                byw bywVarB = yqoVar.b.a();
                axfd axfdVar = yqoVar.t;
                avmb avmbVar = (avmb) axfdVar.b;
                yra yraVar = new yra(bywVarB, ytfVar, zjdVar, axfdVar.e, (zjr) axfdVar.c, (avlh) axfdVar.a, (avlh) axfdVar.d, avmbVar);
                yraVar.l();
                for (Map.Entry entry : yqoVar.a.c.entrySet()) {
                    yraVar.m((String) entry.getKey(), (String) entry.getValue());
                }
                return yraVar;
            case 16:
            case 17:
                return ((abmt) this.a).h;
            case 18:
                return ((acer) this.a).c;
            case 19:
                return ((acfg) this.a).r;
            default:
                return Boolean.valueOf(((acho) this.a).a);
        }
    }
}
