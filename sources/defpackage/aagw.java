package defpackage;

import app.rive.semantics.SemanticState;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.IntStream;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aagw implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aagw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 12;
        int i2 = 11;
        int i3 = 6;
        int i4 = 0;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        int i5 = 0;
        switch (this.$cid) {
            case 0:
                agev agevVar = (agev) obj;
                if (agevVar.g()) {
                    return ((aagy) this.a).h((aamt) agevVar.c());
                }
                return Optional.empty();
            case 1:
                Optional optional = (Optional) obj;
                vre vreVar = new vre(this.a, i3);
                if (true != optional.isPresent()) {
                    return optional;
                }
                return Optional.ofNullable(aamm.e((String) vreVar.a, (aohq) optional.get()));
            case 2:
                return aagy.j(this.a.size());
            case 3:
                agke agkeVar = (agke) obj;
                ?? r8 = this.a;
                return (agkj) IntStream.CC.range(0, r8.size()).filter(new aagx(agkeVar, i4)).boxed().collect(aghu.b(new woi(r8, i2), new woi(agkeVar, i), new hnh(9)));
            case 4:
                return (agkj) Collection.EL.stream((agkz) obj).map(new woi(this.a, 13)).collect(aghu.a(new aaeq(i2), new aaeq(i)));
            case 5:
                tk tkVar = new tk();
                tkVar.e(((aajk) this.a).e.y());
                tkVar.c(500);
                tkVar.d(2);
                return ((ug) obj).g("", tkVar.a());
            case 6:
                agke agkeVar2 = (agke) obj;
                agjz agjzVar = new agjz(4);
                while (true) {
                    ?? r1 = this.a;
                    if (i4 >= r1.size()) {
                        return agjzVar.g();
                    }
                    ahgr ahgrVar = new ahgr();
                    ahgrVar.l((aajy) agkeVar2.get(i4));
                    ahgrVar.m(aajp.e(((aamo) r1.get(i4)).d()));
                    agjzVar.h(ahgrVar.k());
                    i4++;
                }
                break;
            case 7:
                agke agkeVar3 = (agke) obj;
                agjz agjzVar2 = new agjz(4);
                while (true) {
                    ?? r2 = this.a;
                    if (i5 >= r2.size()) {
                        return agjzVar2.g();
                    }
                    ahgr ahgrVar2 = new ahgr();
                    ahgrVar2.l((aajy) agkeVar3.get(i5));
                    ahgrVar2.m(aajp.d(((aamh) r2.get(i5)).a));
                    agjzVar2.h(ahgrVar2.k());
                    i5++;
                }
                break;
            case 8:
                twu.c(6, "Error calling GetPlaybackDataEntity endpoint.", (toe) obj);
                aano aanoVar = new aano(aanp.b);
                aanoVar.d = 4;
                return (agke) Collection.EL.stream(this.a).map(new woi(aanoVar.a(), 17)).collect(aghu.a);
            case 9:
                return ((aald) this.a).a.b((aamt) ((agev) obj).f());
            case 10:
                return aald.e(this.a.size());
            case 11:
                return ((aald) this.a).a.b((aamt) ((agev) obj).f());
            case 12:
                agjz agjzVar3 = new agjz(4);
                Iterator it = ((java.util.Collection) obj).iterator();
                while (it.hasNext()) {
                    Optional optionalB = ((aald) this.a).a.b((aamt) it.next());
                    yyk yykVar = new yyk(agjzVar3, i2);
                    if (true == optionalB.isPresent()) {
                        ((agjz) yykVar.a).h(optionalB.get());
                    }
                }
                return agjzVar3.g();
            case 13:
                agkj agkjVar = (agkj) obj;
                ?? r9 = this.a;
                int size = r9.size();
                for (int i6 = 0; i6 < size; i6++) {
                    aihf aihfVar = (aihf) r9.get(i6);
                    ardd arddVar = (ardd) agkjVar.get(((aoei) aihfVar.instance).c);
                    if (arddVar != null) {
                        aofb offlineModeType = arddVar.getOfflineModeType();
                        aihfVar.copyOnWrite();
                        aoei aoeiVar = (aoei) aihfVar.instance;
                        aoeiVar.i = offlineModeType.i;
                        aoeiVar.b |= 64;
                    }
                }
                return null;
            case 14:
                Object obj2 = this.a;
                obj2.getClass();
                Iterable$EL.forEach((agke) obj, new aaer(obj2, i3));
                return obj2;
            case 15:
                agkj agkjVar2 = (agkj) obj;
                ?? r10 = this.a;
                int size2 = r10.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    aihf aihfVar2 = (aihf) r10.get(i7);
                    aody aodyVar = (aody) agkjVar2.get(((aoeg) aihfVar2.instance).c);
                    if (aodyVar != null) {
                        aihfVar2.copyOnWrite();
                        aoeg aoegVar = (aoeg) aihfVar2.instance;
                        aoegVar.n = aodyVar;
                        aoegVar.b |= SemanticState.Modal;
                    }
                }
                return null;
            case 16:
                return this.a;
            case 17:
                Object obj3 = this.a;
                obj3.getClass();
                Iterable$EL.forEach((agke) obj, new aaer(obj3, 8));
                return obj3;
            case 18:
                agkj agkjVar3 = (agkj) obj;
                ?? r11 = this.a;
                int size3 = r11.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    aihf aihfVar3 = (aihf) r11.get(i8);
                    aodz aodzVar = (aodz) agkjVar3.get(((aoei) aihfVar3.instance).c);
                    if (aodzVar != null) {
                        aihfVar3.copyOnWrite();
                        aoei aoeiVar2 = (aoei) aihfVar3.instance;
                        aoeiVar2.t = aodzVar;
                        aoeiVar2.b |= 1048576;
                    }
                }
                return null;
            case 19:
                Boolean bool = (Boolean) obj;
                Object[] objArr = bool != null && bool.booleanValue();
                aamt aamtVar = (aamt) this.a;
                if (!aamtVar.p() && !aamtVar.r() && !aamtVar.j() && (aamtVar.n() || aamtVar.m() || !aamtVar.c() || aamtVar.a() || objArr != false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                abpx abpxVar = (abpx) obj;
                return ((aapa) this.a).e(abpxVar.a, abpxVar.b);
        }
    }
}
