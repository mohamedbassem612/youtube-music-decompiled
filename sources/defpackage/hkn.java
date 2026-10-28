package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hkn implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hkn(Object obj, int i) {
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
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        abnl abnlVarB;
        switch (this.$cid) {
            case 0:
                return ((String) this.a).startsWith(((aonl) obj).e);
            case 1:
                return ((hfx) ((hfy) this.a).b.io()).h((zne) ((Map.Entry) obj).getKey());
            case 2:
                if (!((agkz) this.a).contains(wfs.h((String) obj))) {
                    return true;
                }
                break;
            case 3:
                aamo aamoVar = (aamo) obj;
                Object obj2 = this.a;
                aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
                hfn hfnVar = (hfn) ((jnm) obj2).a;
                if (!aogfVar.equals(hfnVar.i(aamoVar)) && hfnVar.g(aamoVar) != anzw.MUSIC_VIDEO_TYPE_PODCAST_EPISODE) {
                    return true;
                }
                break;
            case 4:
                aamo aamoVar2 = (aamo) obj;
                hfn hfnVar2 = (hfn) ((jnm) this.a).a;
                if (!Objects.equals(hfnVar2.i(aamoVar2), aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE) && hfnVar2.g(aamoVar2) == anzw.MUSIC_VIDEO_TYPE_PODCAST_EPISODE) {
                    return true;
                }
                break;
            case 5:
                return aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE.equals(((hfn) ((jnm) this.a).a).i((aamo) obj));
            case 6:
                hyz hyzVar = (hyz) obj;
                agrf agrfVar = idr.a;
                abnl abnlVarN = hyzVar.n();
                if (abnlVarN == null || !abnlVarN.J() || this.a.contains(hyzVar.t())) {
                    return true;
                }
                break;
            case 7:
                abun abunVar = (abun) obj;
                abunVar.getClass();
                ify ifyVar = (ify) this.a;
                if (!ifyVar.e.l(133, 45848920L, false)) {
                    return ifyVar.c.test(abunVar);
                }
                igb igbVar = ifyVar.c;
                abnl abnlVar = igbVar.a;
                if (abnlVar != null && (abnlVarB = igb.b(abunVar)) != null) {
                    String strC = igb.c(abnlVarB);
                    if (strC.length() <= 0 || !awrc.c(strC, igb.c(abnlVar))) {
                        return igbVar.test(abunVar);
                    }
                    return true;
                }
                break;
            case 8:
                if (!Collection.EL.stream(this.a).anyMatch(new hkn(((afhq) obj).c, 9))) {
                    return true;
                }
                break;
            case 9:
                return ((afhq) obj).c.equals(this.a);
            case 10:
                asji asjiVar = (asji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite((aigw) this.a);
                asjiVar.c(aihlVarCheckIsLite);
                return asjiVar.j.n(aihlVarCheckIsLite.d);
            case 11:
                asji asjiVar2 = (asji) obj;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite((aigw) this.a);
                asjiVar2.c(aihlVarCheckIsLite2);
                return asjiVar2.j.n(aihlVarCheckIsLite2.d);
            case 12:
                xsj xsjVar = (xsj) this.a;
                xvq xvqVar = (xvq) obj;
                if (xvqVar.g(xsjVar.m) && !xsjVar.p(xvqVar)) {
                    return true;
                }
                break;
            case 13:
                xtj xtjVar = xsj.a;
                if (!((agke) this.a).contains((xvq) obj)) {
                    return true;
                }
                break;
            case 14:
                if (!((xsj) this.a).p((xvq) obj)) {
                    return true;
                }
                break;
            case 15:
                return ((Enum) this.a).equals((abnv) obj);
            case 16:
                return ((String) this.a).startsWith((String) obj);
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                if (!this.a.contains(entry.getKey())) {
                    ((aecf) entry.getValue()).c();
                    return true;
                }
                break;
            default:
                if (!((afry) this.a).m()) {
                    return true;
                }
                break;
        }
        return false;
    }
}
