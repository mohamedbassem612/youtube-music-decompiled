package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hnd implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hnd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [awqg, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        boolean z = true;
        int i = 0;
        switch (this.$cid) {
            case 0:
                agke agkeVar = (agke) obj;
                agjz agjzVar = new agjz(4);
                while (true) {
                    ?? r1 = this.a;
                    if (i >= r1.size()) {
                        return agjzVar.g();
                    }
                    ahgr ahgrVar = new ahgr();
                    ahgrVar.l((aajy) agkeVar.get(i));
                    ahgrVar.m(hne.d(((anjx) r1.get(i)).getAudioPlaylistId()));
                    agjzVar.h(ahgrVar.k());
                    i++;
                }
                break;
            case 1:
                agke agkeVar2 = (agke) obj;
                agjz agjzVar2 = new agjz(4);
                while (true) {
                    ?? r2 = this.a;
                    if (i >= r2.size()) {
                        return agjzVar2.g();
                    }
                    ahgr ahgrVar2 = new ahgr();
                    ahgrVar2.l((aajy) agkeVar2.get(i));
                    ahgrVar2.m(hne.d(((anuk) r2.get(i)).getPlaylistId()));
                    agjzVar2.h(ahgrVar2.k());
                    i++;
                }
                break;
            case 2:
                return ((hns) aguu.aw(((hnt) this.a).b, hns.class, (affd) obj)).f();
            case 3:
                return this.a.invoke(obj);
            case 4:
                Optional optional = (Optional) obj;
                aigj aigjVar = hpb.a;
                if (optional.isEmpty()) {
                    throw new IllegalStateException("Downloads Library entity was absent");
                }
                Object obj2 = this.a;
                annv annvVar = (annv) optional.get();
                String str = (String) obj2;
                if (!hpb.r(annvVar, str) && !hpb.t(annvVar, str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                Optional optional2 = (Optional) obj;
                aigj aigjVar2 = hpb.a;
                if (optional2.isEmpty()) {
                    throw new IllegalStateException("Downloads Library entity was absent");
                }
                return Boolean.valueOf(hpb.r((annv) optional2.get(), (String) this.a));
            case 6:
                Optional optional3 = (Optional) obj;
                aigj aigjVar3 = hpb.a;
                if (optional3.isEmpty()) {
                    throw new IllegalStateException("Downloads Library entity was absent");
                }
                return Boolean.valueOf(hpb.t((annv) optional3.get(), (String) this.a));
            case 7:
                hth hthVar = (hth) obj;
                return Boolean.valueOf(!(!hthVar.a().isEmpty() && (hthVar.a().get() instanceof anyx) && igs.c(((anyx) hthVar.a().get()).getMusicVideoType())) && ((hpd) this.a).s(hthVar));
            case 8:
                return ((hpd) this.a).c((hth) obj);
            case 9:
                Object obj3 = this.a;
                int i2 = hpd.b;
                return hcg.b((anyx) obj3, (anyo) ((Optional) obj).orElse(null));
            case 10:
                Object obj4 = this.a;
                int i3 = hpd.b;
                return hcg.b((anyx) obj4, (anyo) ((Optional) obj).orElse(null));
            case 11:
                Stream streamFilter = Collection.EL.stream((List) obj).filter(new hod(6));
                hpd hpdVar = ((hpk) this.a).c;
                hpdVar.getClass();
                return (agke) streamFilter.filter(new gnh(hpdVar, 13)).collect(aghu.a);
            case 12:
                agev agevVar = (agev) obj;
                if (agevVar.g()) {
                    jan janVar = (jan) this.a;
                    if (!((hlz) janVar.g).k(((aamj) agevVar.c()).a)) {
                        return Optional.of(((jnm) janVar.b).t((aamj) agevVar.c()));
                    }
                }
                return Optional.empty();
            case 13:
                agev agevVar2 = (agev) obj;
                if (agevVar2.g()) {
                    jan janVar2 = (jan) this.a;
                    if (!((hlz) janVar2.g).k(((aamj) agevVar2.c()).a)) {
                        return Optional.of(((jnm) janVar2.b).v((aamj) agevVar2.c()));
                    }
                }
                return Optional.empty();
            case 14:
                agev agevVar3 = (agev) obj;
                if (agevVar3.g()) {
                    jan janVar3 = (jan) this.a;
                    if (((hlz) janVar3.g).k(((aamj) agevVar3.c()).a)) {
                        return Optional.of(((hef) janVar3.c).e((aamj) agevVar3.c()));
                    }
                }
                return Optional.empty();
            case 15:
                agev agevVar4 = (agev) obj;
                if (!agevVar4.g() || ((aamt) agevVar4.c()).m == null) {
                    return Optional.empty();
                }
                return Optional.of(((jnm) ((jan) this.a).e).p(((aamt) agevVar4.c()).m));
            case 16:
                agev agevVar5 = (agev) obj;
                if (!agevVar5.g()) {
                    return Optional.empty();
                }
                return Optional.of(((jnm) ((jan) this.a).e).m((aamt) agevVar5.c()));
            case 17:
                agev agevVar6 = (agev) obj;
                if (!agevVar6.g()) {
                    return Optional.empty();
                }
                return Optional.of(((jnm) ((jan) this.a).e).r((aamt) agevVar6.c()));
            case 18:
                agev agevVar7 = (agev) obj;
                if (!agevVar7.g()) {
                    return Optional.empty();
                }
                return Optional.of(((jnm) ((jan) this.a).e).q((aamt) agevVar7.c()));
            case 19:
                agev agevVar8 = (agev) obj;
                if (!agevVar8.g()) {
                    return Optional.empty();
                }
                return Optional.of(((jnm) ((jan) this.a).e).o((aamt) agevVar8.c()));
            default:
                agev agevVar9 = (agev) obj;
                if (!agevVar9.g()) {
                    return Optional.empty();
                }
                return Optional.of(((jnm) ((jan) this.a).e).s((aamt) agevVar9.c()));
        }
    }
}
