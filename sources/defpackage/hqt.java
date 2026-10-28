package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqt implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hqt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 4;
        boolean z = false;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                return agke.q((Optional) obj);
            case 1:
                return agke.n((List) obj);
            case 2:
                return (aanp) ((agke) obj).get(0);
            case 3:
                return (aanp) ((agke) obj).get(0);
            case 4:
                return agke.n((List) obj);
            case 5:
                Optional optional = (Optional) obj;
                if (optional.isPresent() && ((ansx) optional.get()).getAutoSyncType() != aofs.OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_UNSPECIFIED) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                Optional optional2 = (Optional) obj;
                return optional2.isPresent() ? Optional.of((ansx) optional2.get()) : Optional.empty();
            case 7:
                agkh agkhVar = new agkh(4);
                for (Optional optionalOfNullable : (List) obj) {
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable((anuk) ((weh) optionalOfNullable.get()));
                    }
                    if (optionalOfNullable.isPresent() && hlz.n((anuk) optionalOfNullable.get())) {
                        aihf aihfVarCreateBuilder = aody.a.createBuilder();
                        aihf aihfVarCreateBuilder2 = aoea.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoea aoeaVar = (aoea) aihfVarCreateBuilder2.instance;
                        aoeaVar.b |= 1;
                        aoeaVar.c = true;
                        aihfVarCreateBuilder.copyOnWrite();
                        aody aodyVar = (aody) aihfVarCreateBuilder.instance;
                        aoea aoeaVar2 = (aoea) aihfVarCreateBuilder2.build();
                        aoeaVar2.getClass();
                        aodyVar.c = aoeaVar2;
                        aodyVar.b |= 1;
                        agkhVar.e(((anuk) optionalOfNullable.get()).getPlaylistId(), (aody) aihfVarCreateBuilder.build());
                    }
                }
                return agkhVar.d(true);
            case 8:
                List list = (List) obj;
                return list == null ? agpi.a : (List) Collection.EL.stream(list).filter(new hod(20)).map(new hsw(i)).collect(Collectors.toList());
            case 9:
                return Optional.of((hte) obj);
            case 10:
                agrf agrfVar = hur.a;
                aihf aihfVarCreateBuilder3 = alfu.a.createBuilder();
                obj.getClass();
                aihfVarCreateBuilder3.copyOnWrite();
                alfu alfuVar = (alfu) aihfVarCreateBuilder3.instance;
                alfuVar.c = (anzn) obj;
                alfuVar.b |= SemanticState.Hidden;
                return (alfu) aihfVarCreateBuilder3.build();
            case 11:
                agrf agrfVar2 = hur.a;
                aihf aihfVarCreateBuilder4 = anwv.a.createBuilder();
                obj.getClass();
                aihfVarCreateBuilder4.copyOnWrite();
                anwv anwvVar = (anwv) aihfVarCreateBuilder4.instance;
                anwvVar.d = (anzi) obj;
                anwvVar.b |= 262144;
                return (anwv) aihfVarCreateBuilder4.build();
            case 12:
                Optional optionalOfNullable2 = (Optional) obj;
                if (true == optionalOfNullable2.isPresent()) {
                    weh wehVar = (weh) optionalOfNullable2.get();
                    optionalOfNullable2 = Optional.ofNullable(wehVar instanceof anjx ? (agke) Collection.EL.stream(((anjx) wehVar).e()).map(new iaa(i2)).collect(aghu.a) : wehVar instanceof anuk ? (agke) Collection.EL.stream(((anuk) wehVar).j()).map(new iaa(i2)).collect(aghu.a) : new agjz(4).g());
                }
                return (agke) optionalOfNullable2.orElse(agpi.a);
            case 13:
                return ((abvn) obj).H();
            case 14:
                return ((acip) obj).ap();
            case 15:
                return ((acip) obj).ad();
            case 16:
                hzw hzwVar = (hzw) obj;
                return Long.valueOf((long) aajg.c(hzwVar.a, hzwVar.b));
            case 17:
                Optional optional3 = (Optional) obj;
                if (optional3.isEmpty()) {
                    return agpi.a;
                }
                weh wehVar2 = (weh) optional3.get();
                if (wehVar2 instanceof anjx) {
                    return iad.c(((anjx) wehVar2).e());
                }
                return wehVar2 instanceof anuk ? iad.c(((anuk) wehVar2).j()) : agpi.a;
            case 18:
                return null;
            case 19:
                return new ian((wgi) obj, true);
            default:
                return new ian((wgi) obj, true);
        }
    }
}
