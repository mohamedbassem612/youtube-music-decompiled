package defpackage;

import android.graphics.Point;
import android.util.Size;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class urj implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ aihn d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ urj(hsj hsjVar, String str, anyr anyrVar, aofh aofhVar, aaqn aaqnVar, aaew aaewVar, int i) {
        this.$cid = i;
        this.c = hsjVar;
        this.f = str;
        this.d = anyrVar;
        this.e = aofhVar;
        this.a = aaqnVar;
        this.b = aaewVar;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [aaqn, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid != 0) {
            aamo aamoVar = (aamo) obj;
            aofg aofgVar = ((aofh) this.e).e;
            if (aofgVar == null) {
                aofgVar = aofg.b;
            }
            aofa aofaVar = aofgVar.g;
            if (aofaVar == null) {
                aofaVar = aofa.a;
            }
            aofa aofaVar2 = aofaVar;
            Object obj2 = this.b;
            ?? r5 = this.a;
            aihn aihnVar = this.d;
            return ((hsj) this.c).d((String) this.f, aamoVar, (anyr) aihnVar, aofaVar2, r5, (aaew) obj2);
        }
        Double d = (Double) obj;
        agkx agkxVar = new agkx();
        url urlVar = (url) this.b;
        agkxVar.k(Collection.EL.stream(urlVar.a).map(new uri()).iterator());
        agkxVar.k(Collection.EL.stream(urlVar.b).map(new uri()).iterator());
        double dDoubleValue = d.doubleValue();
        Object obj3 = this.c;
        agkxVar.c(xsc.O((Size) ((xsc) this.a).b, dDoubleValue, (Point) obj3, Optional.ofNullable(this.d)));
        Optional optionalOf = Optional.of(d);
        agkz agkzVarG = agkxVar.g();
        return new urm((Optional) this.e, (Optional) this.f, optionalOf, agkzVarG);
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ urj(xsc xscVar, url urlVar, Point point, akgw akgwVar, Optional optional, Optional optional2, int i) {
        this.$cid = i;
        this.a = xscVar;
        this.b = urlVar;
        this.c = point;
        this.d = akgwVar;
        this.e = optional;
        this.f = optional2;
    }
}
