package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hhw implements avno {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hhw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v34, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v39, types: [awqg, java.lang.Object] */
    @Override // defpackage.avno
    public final boolean a(Object obj) {
        boolean zRemove;
        int i = 0;
        switch (this.$cid) {
            case 0:
                aqph aqphVar = (aqph) obj;
                String strH = wfs.h(aqphVar.b());
                Object obj2 = this.a;
                hia hiaVar = (hia) obj2;
                synchronized (hiaVar.t) {
                    zRemove = ((hia) obj2).u.remove(strH);
                    break;
                }
                if (!Objects.equals(aqphVar.getTransferState(), aqpc.TRANSFER_STATE_COMPLETE) && !Objects.equals(aqphVar.getTransferState(), aqpc.TRANSFER_STATE_FAILED)) {
                    synchronized (hiaVar.t) {
                        ((hia) obj2).u.add(strH);
                        break;
                    }
                } else if (zRemove) {
                    Optional optional = hiaVar.D;
                    agpr agprVar = agpr.a;
                    if (((agkz) optional.orElse(agprVar)).contains(kro.aH(strH)) || ((agkz) hiaVar.E.orElse(agprVar)).contains(kro.aH(strH))) {
                        return true;
                    }
                }
                break;
            case 1:
                return a.n(this.a, obj);
            case 2:
                aanv aanvVar = (aanv) obj;
                if (aanvVar.a() || aanvVar.b == aanu.c || txz.g(((hmt) this.a).b.getApplicationContext())) {
                    return true;
                }
                break;
            case 3:
                return ((agkz) this.a).contains(((weo) obj).a);
            case 4:
                return ((agke) this.a).contains(((weo) obj).a);
            case 5:
                weo weoVar = (weo) obj;
                if (((agke) ((agke) this.a).get(1)).contains(weoVar.a) && !gzj.an(weoVar.b).equals(gzj.an(weoVar.c))) {
                    return true;
                }
                break;
            case 6:
                return a.n(this.a, obj);
            case 7:
                return a.n(this.a, obj);
            case 8:
                return a.n(this.a, obj);
            case 9:
                return a.n(this.a, obj);
            case 10:
                return a.n(this.a, obj);
            case 11:
                return a.n(this.a, obj);
            case 12:
                return a.n(this.a, obj);
            case 13:
                return a.n(this.a, obj);
            case 14:
                String str = ((gvk) obj).a;
                if (!str.isEmpty()) {
                    advj advjVar = (advj) this.a;
                    if (str.equals(advjVar.i) || str.equals(advjVar.j)) {
                        return true;
                    }
                }
                break;
            case 15:
                if (((jgs) this.a).e != ((iwl) obj)) {
                    return true;
                }
                break;
            case 16:
                if (((jgu) this.a).a != ((iwl) obj)) {
                    return true;
                }
                break;
            case 17:
                return ((rts) this.a).l((aaxa) obj);
            case 18:
                yvs yvsVar = ((aaxa) obj).a;
                rts rtsVar = (rts) this.a;
                if (rts.m(rtsVar.G, yvsVar)) {
                    rtsVar.G = yvsVar;
                    return true;
                }
                break;
            case 19:
                return Collection.EL.stream((agke) obj).anyMatch(new uso(this.a, i));
            default:
                return ((String) this.a).equals(((vqc) obj).a);
        }
        return false;
    }
}
