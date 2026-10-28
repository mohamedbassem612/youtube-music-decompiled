package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vre implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vre(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v52, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, vob] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object vouVar;
        switch (this.$cid) {
            case 0:
                return (View) ((Class) this.a).cast(obj);
            case 1:
                xpl xplVar = (xpl) obj;
                vouVar = new vou((vov) this.a, (String) xplVar.a, xplVar.b);
                break;
            case 2:
                return Collection.EL.stream(((vsw) obj).b).filter(new uso(this.a, 16)).findFirst();
            case 3:
                vouVar = new xpl((vsv) obj, this.a, (short[]) null);
                break;
            case 4:
                dii diiVar = (dii) obj;
                Bundle bundle = diiVar.s;
                return bundle == null ? Optional.empty() : Optional.ofNullable(((xpc) this.a).k.c(bundle)).or(new vnn(diiVar, 9));
            case 5:
                return nra.b(agke.q((Intent) obj), (Bundle) this.a);
            case 6:
                return aamm.e((String) this.a, (aohq) obj);
            case 7:
                return ((aaew) obj).f((String) this.a);
            case 8:
                return Boolean.valueOf(((aaew) obj).f((String) this.a) != null);
            case 9:
                aakw aakwVar = (aakw) this.a;
                return ((aaqf) aakwVar.a.io()).b((aaqe) obj, aakwVar.d);
            case 10:
                aakw aakwVar2 = (aakw) this.a;
                return ((aaqf) aakwVar2.a.io()).b((aaqe) obj, aakwVar2.d);
            case 11:
                return ((kyr) obj).A(this.a);
            case 12:
                return ((ahgb) obj).ae(this.a);
            case 13:
                return ((aaoa) obj).a((aanq) this.a);
            case 14:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((acfg) this.a).s.e());
            case 15:
                return this.a.invoke(obj);
            case 16:
                return ((acoi) this.a).C((ajwo) obj);
            case 17:
                return ((acoi) this.a).y((acra) obj);
            case 18:
                return ((acoi) this.a).E((alqc) obj);
            case 19:
                acra acraVar = (acra) obj;
                return ((acoi) this.a).D(acraVar.h, acraVar.f);
            default:
                return ((acoi) this.a).y((acra) obj);
        }
        return vouVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
