package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hsg implements Function {
    public final /* synthetic */ hsj a;
    public final /* synthetic */ aaew b;
    public final /* synthetic */ aohx c;
    public final /* synthetic */ anyr d;
    public final /* synthetic */ aaqn e;

    public /* synthetic */ hsg(hsj hsjVar, aaew aaewVar, aohx aohxVar, anyr anyrVar, aaqn aaqnVar) {
        this.a = hsjVar;
        this.b = aaewVar;
        this.c = aohxVar;
        this.d = anyrVar;
        this.e = aaqnVar;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        anyr anyrVar = this.d;
        aamo aamoVar = (aamo) obj;
        hsj hsjVar = this.a;
        aaqg aaqgVar = hsjVar.g;
        aohx aohxVar = this.c;
        aodp aodpVarD = aaqgVar.d(aohxVar);
        aamn aamnVarA = aamn.a(anyrVar.j);
        byte[] bArrG = anyrVar.d.G();
        aaew aaewVar = this.b;
        if (!aaewVar.M(aamoVar, aohxVar, aodpVarD, aamnVarA, bArrG, aamg.ACTIVE)) {
            hsjVar.e.e(new aahx(aamoVar.d(), 2));
            return Boolean.FALSE;
        }
        Object obj2 = aamoVar.b;
        if (obj2 != null) {
            axfd axfdVar = aaewVar.k;
            aaok aaokVar = (aaok) obj2;
            if (axfdVar.v((String) aaokVar.b) == null) {
                axfdVar.w(aaokVar);
            } else {
                axfdVar.x(aaokVar);
            }
        }
        this.e.l().p(aamoVar.d(), true);
        return Boolean.TRUE;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
