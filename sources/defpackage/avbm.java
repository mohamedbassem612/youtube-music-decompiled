package defpackage;

import com.google.research.xeno.effect.Effect;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avbm {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public avbm(ajis ajisVar, agek agekVar) {
        ajisVar.getClass();
        Iterator it = ajisVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                for (ajir ajirVar : ajisVar.c) {
                    int iAX = a.aX(ajirVar.c);
                    int i = (iAX == 0 ? 1 : iAX) - 1;
                    if (i == 1) {
                        this.d = new wfx(ajirVar, agekVar);
                    } else if (i == 2) {
                        this.i = new wfx(ajirVar, agekVar);
                    } else if (i == 3) {
                        this.f = new wfx(ajirVar, agekVar);
                    } else if (i == 4) {
                        this.h = new wfx(ajirVar, agekVar);
                    }
                }
                return;
            }
            ajir ajirVar2 = (ajir) it.next();
            int iAX2 = a.aX(ajirVar2.c);
            switch ((iAX2 != 0 ? iAX2 : 1) - 1) {
                case 1:
                case 5:
                    this.g = new wfx(ajirVar2, agekVar);
                    break;
                case 2:
                    this.e = new wfx(ajirVar2, agekVar);
                    break;
                case 3:
                    this.b = new wfx(ajirVar2, agekVar);
                    break;
                case 4:
                    this.a = new wfx(ajirVar2, agekVar);
                    break;
                case 6:
                    this.c = new wfx(ajirVar2, agekVar);
                    break;
            }
        }
    }

    public final uzj a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.c;
        if (obj4 != null && (obj = this.h) != null && (obj2 = this.e) != null && (obj3 = this.f) != null) {
            Object obj5 = this.g;
            Object obj6 = this.i;
            return new uzj((Effect) obj5, (asjv) obj4, (ajhv) obj6, (ajht) this.d, (agke) obj, (atte) obj2, (atso) this.a, (uzi) obj3, (apvy) this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" qosEffectChosenRequest");
        }
        if (this.h == null) {
            sb.append(" assetParallelData");
        }
        if (this.e == null) {
            sb.append(" xenoEffectProto");
        }
        if (this.f == null) {
            sb.append(" additionalEffectInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null assetParallelData");
        }
        this.h = agkeVar;
    }

    public final void c(asjv asjvVar) {
        if (asjvVar == null) {
            throw new NullPointerException("Null qosEffectChosenRequest");
        }
        this.c = asjvVar;
    }

    public final void d(atte atteVar) {
        if (atteVar == null) {
            throw new NullPointerException("Null xenoEffectProto");
        }
        this.e = atteVar;
    }
}
