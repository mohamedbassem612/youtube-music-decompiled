package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.music.mediabrowser.MusicBrowserService;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hgl implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hgl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v33, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        amlh amlhVar;
        switch (this.$cid) {
            case 0:
                ((hgk) ((MusicBrowserService) this.a).j.io()).c((hjn) obj);
                return;
            case 1:
                ((hgk) this.a).e((zne) obj);
                return;
            case 2:
                ((hgk) ((MusicBrowserService) this.a).j.io()).d((hjo) obj);
                return;
            case 3:
                ((MusicBrowserService) this.a).j();
                return;
            case 4:
                ((MusicBrowserService) this.a).j();
                return;
            case 5:
                znf znfVar = (znf) obj;
                if (znfVar == null || znfVar.d()) {
                    return;
                }
                Object obj2 = this.a;
                String str = znfVar.l;
                bqs bqsVar = ((bre) obj2).g;
                bqsVar.b.notifyChildrenChanged(str);
                bqsVar.d.e.post(new blq(bqsVar, str, 5));
                return;
            case 6:
                MusicBrowserService musicBrowserService = (MusicBrowserService) this.a;
                ((hgb) musicBrowserService.o.io()).d(musicBrowserService);
                return;
            case 7:
                hgy hgyVar = (hgy) this.a;
                if (hgyVar.q.getMode() == 2) {
                    ((abvk) hgyVar.e.io()).ap(false, 19);
                    return;
                }
                return;
            case 8:
                amld amldVar = (amld) obj;
                String strH = wfs.h(amldVar.b());
                hhd hhdVar = (hhd) ((hhc) this.a).a;
                hgz hgzVar = hhdVar.e;
                if (hgzVar == null || !hgzVar.b || (amlhVar = hgzVar.c) == null || !TextUtils.equals(strH, amlhVar.c)) {
                    return;
                }
                hhdVar.e.a = amldVar.getLikeStatus();
                hhdVar.f = hhdVar.e;
                Iterator it = hhdVar.c.iterator();
                while (it.hasNext()) {
                    ((hha) it.next()).a(hhdVar.e);
                }
                return;
            case 9:
                this.a.invoke(obj);
                return;
            case 10:
                this.a.invoke(obj);
                return;
            case 11:
                this.a.invoke(obj);
                return;
            case 12:
                this.a.invoke(obj);
                return;
            case 13:
                ((hia) this.a).o((hhz) obj);
                return;
            case 14:
                ((hia) this.a).o(hhz.c);
                return;
            case 15:
                hia hiaVar = (hia) this.a;
                hiaVar.D = hiaVar.b((List) obj, hiaVar.D);
                return;
            case 16:
                hia hiaVar2 = (hia) this.a;
                hiaVar2.E = hiaVar2.b((List) obj, hiaVar2.E);
                return;
            case 17:
                agkz agkzVarN = agkz.n((List) obj);
                Object obj3 = this.a;
                hia hiaVar3 = (hia) obj3;
                if (hiaVar3.F.isEmpty()) {
                    hiaVar3.F = Optional.of(agkzVarN);
                    if (txz.g(hiaVar3.c)) {
                        hiaVar3.j(agkzVarN);
                        return;
                    } else {
                        hiaVar3.i();
                        return;
                    }
                }
                Optional optional = hiaVar3.F;
                agpr agprVar = agpr.a;
                Set setF = hia.f((agkz) optional.orElse(agprVar), agkzVarN);
                Set setG = hia.g((agkz) hiaVar3.F.orElse(agprVar), agkzVarN);
                synchronized (hiaVar3.t) {
                    ((hia) obj3).u.removeAll(setG);
                    break;
                }
                if (!setF.isEmpty()) {
                    hiaVar3.o(hhz.c);
                } else if (!setG.isEmpty()) {
                    hiaVar3.A.kk(hhz.c);
                }
                hiaVar3.F = Optional.of(agkzVarN);
                if (txz.g(hiaVar3.c)) {
                    hiaVar3.j(setF);
                    return;
                } else {
                    hiaVar3.i();
                    return;
                }
            case 18:
                ((hia) this.a).o(hhz.b);
                return;
            case 19:
                ((hia) this.a).o(hhz.c);
                return;
            default:
                ((hia) this.a).m((zne) obj);
                return;
        }
    }
}
