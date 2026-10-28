package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xdo implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xdo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
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
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
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
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
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
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        CastDevice castDeviceK;
        switch (this.$cid) {
            case 0:
                return Objects.equals(((xdm) obj).b, this.a);
            case 1:
                return ((xdh) this.a).h(((xdm) obj).a);
            case 2:
                if (!((xvq) obj).c().equals(((xql) this.a).e.c())) {
                    return true;
                }
                break;
            case 3:
                dii diiVar = (dii) obj;
                if (xrx.n(diiVar) && (castDeviceK = xrx.k(diiVar)) != null) {
                    return ((String) this.a).equals(castDeviceK.n);
                }
                break;
            case 4:
                xtq xtqVar = (xtq) obj;
                if (xtqVar instanceof xvq) {
                    return ((xvq) xtqVar).c().equals(((xvq) this.a).c());
                }
                break;
            case 5:
                xtq xtqVar2 = (xtq) obj;
                if (xtqVar2 instanceof xvq) {
                    return ((xvq) xtqVar2).c().equals(this.a);
                }
                break;
            case 6:
                xsj xsjVar = (xsj) this.a;
                xvq xvqVar = (xvq) obj;
                if (xvqVar.g(xsjVar.m) && !xsjVar.p(xvqVar)) {
                    return true;
                }
                break;
            case 7:
                return ((ygt) obj).a.equals(this.a);
            case 8:
                yop yopVar = (yop) this.a;
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = (FormatIdOuterClass$FormatId) obj;
                if (!yopVar.o || zic.c(formatIdOuterClass$FormatId, yopVar.d) != null) {
                    return true;
                }
                break;
            case 9:
                yop yopVar2 = (yop) this.a;
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = (FormatIdOuterClass$FormatId) obj;
                if (!yopVar2.o || zic.c(formatIdOuterClass$FormatId2, yopVar2.d) != null) {
                    return true;
                }
                break;
            case 10:
                wgs wgsVar = (wgs) obj;
                if (wgsVar.P()) {
                    if (wgsVar.f.equals(((bse) this.a).a)) {
                        return true;
                    }
                }
                break;
            case 11:
                return TextUtils.equals(((wgs) obj).f, ((acca) this.a).n);
            case 12:
                return this.a.equals(((xsc) obj).a);
            case 13:
                zez zezVar = (zez) this.a;
                return yno.s(zezVar.e, zezVar.d, zezVar.c, ((zed) obj).c());
            case 14:
                zez zezVar2 = (zez) this.a;
                if (!yno.s(zezVar2.e, zezVar2.d, zezVar2.c, ((zed) obj).c())) {
                    return true;
                }
                break;
            case 15:
                return ((Enum) this.a).equals((zgi) obj);
            case 16:
                return ((Class) this.a).isInstance(obj);
            case 17:
                return ((String) this.a).contains((String) obj);
            case 18:
                if (!((String) obj).equals(this.a)) {
                    return true;
                }
                break;
            case 19:
                if (!this.a.contains((String) obj)) {
                    return true;
                }
                break;
            default:
                return ((String) this.a).equals(((aamc) obj).a);
        }
        return false;
    }
}
