package defpackage;

import android.util.Pair;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hbn implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hbn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v31, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v62, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v76, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v78, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v86, types: [awqg, java.lang.Object] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        ArrayList arrayList;
        int i = 5;
        int i2 = 4;
        switch (this.$cid) {
            case 0:
                boolean zE = ((hww) obj).e();
                Object obj2 = this.a;
                return zE ? (vor) ((hed) obj2).c.io() : (vor) ((hed) obj2).b.io();
            case 1:
                aihf aihfVarCreateBuilder = asfl.a.createBuilder();
                int iOrdinal = ((hww) obj).ordinal();
                Object obj3 = this.a;
                switch (iOrdinal) {
                    case 0:
                        i = 2;
                        break;
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        agad agadVar = (agad) obj3;
                        if (!agadVar.n.l(105, 45795183L, false) || !((kjc) agadVar.i.io()).n()) {
                            i = 4;
                        }
                        break;
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        i = 1;
                        break;
                    case 4:
                        if (((agad) obj3).n.l(40, 45677954L, false)) {
                            i = 1;
                        }
                        break;
                    case 5:
                        if (!((agad) obj3).n.l(40, 45677954L, false)) {
                            i = 1;
                        }
                        break;
                    default:
                        throw new RuntimeException(null, null);
                }
                aihfVarCreateBuilder.copyOnWrite();
                asfl asflVar = (asfl) aihfVarCreateBuilder.instance;
                asflVar.c = i - 1;
                asflVar.b |= 1;
                return (asfl) aihfVarCreateBuilder.build();
            case 2:
                String strG = wfs.g(194, (String) obj);
                hbs hbsVar = (hbs) this.a;
                return hbsVar.b.c().j(strG, true).B(new gkq(i2)).K(new gnw(6)).h(arge.class).O(hbsVar.a);
            case 3:
                obj.getClass();
                return this.a.invoke(obj);
            case 4:
                obj.getClass();
                return this.a.invoke(obj);
            case 5:
                obj.getClass();
                return this.a.invoke(obj);
            case 6:
                obj.getClass();
                return this.a.invoke(obj);
            case 7:
                obj.getClass();
                return this.a.invoke(obj);
            case 8:
                return ((hcc) obj).c(this.a);
            case 9:
                String str = (String) this.a;
                return ((hcc) obj).c(agke.r(kro.at(str), kro.aB(str)));
            case 10:
                return ((hcc) obj).d((tzk) this.a);
            case 11:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return avlr.A(new huj());
                }
                Object obj4 = this.a;
                anyx anyxVar = (anyx) optional.get();
                awcw awcwVar = new awcw(((hoj) obj4).a(ahng.n(agke.q(anyxVar))));
                avnn avnnVar = atqp.l;
                return awcwVar.K(new hbn(anyxVar, 12));
            case 12:
                agke agkeVar = (agke) obj;
                if (agkeVar.isEmpty()) {
                    throw new huj();
                }
                return Pair.create(this.a, (aret) agkeVar.get(0));
            case 13:
                obj.getClass();
                return this.a.invoke(obj);
            case 14:
                obj.getClass();
                return this.a.invoke(obj);
            case 15:
                weh wehVar = (weh) obj;
                arrayList = new ArrayList();
                hpu hpuVar = (hpu) this.a;
                if (hpuVar.b) {
                    arrayList.addAll(((annv) wehVar).h());
                }
                if (hpuVar.c) {
                    arrayList.addAll(((annv) wehVar).k());
                }
                if (hpuVar.a) {
                    arrayList.addAll(((annv) wehVar).f());
                }
                break;
            case 16:
                weh wehVar2 = (weh) obj;
                arrayList = new ArrayList();
                Optional optional2 = (Optional) this.a;
                if (optional2.isEmpty() || optional2.get() == anjx.class) {
                    annv annvVar = (annv) wehVar2;
                    arrayList.addAll(annvVar.e());
                    arrayList.addAll(annvVar.i());
                }
                if (optional2.isEmpty() || optional2.get() == anuk.class) {
                    annv annvVar2 = (annv) wehVar2;
                    arrayList.addAll(annvVar2.g());
                    arrayList.addAll(annvVar2.j());
                }
                break;
            case 17:
                int i3 = hps.c;
                agkj agkjVar = (agkj) Collection.EL.stream((agkz) obj).collect(aghu.a(new hpp(i2), new hpp(i)));
                arrayList = new ArrayList();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    arrayList.add(Optional.ofNullable((weh) agkjVar.get((String) it.next())));
                }
                break;
            case 18:
                return ((hcc) obj).a(this.a);
            case 19:
                aamo aamoVar = (aamo) this.a;
                return ((hcc) obj).c(agke.r(wfs.g(62, aamoVar.d()), wfs.g(557, aamoVar.d())));
            default:
                int i4 = hub.h;
                obj.getClass();
                return this.a.invoke(obj);
        }
        return arrayList;
    }
}
