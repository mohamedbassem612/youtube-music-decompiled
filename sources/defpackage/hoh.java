package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hoh implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hoh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 10;
        int i2 = 11;
        int i3 = 5;
        int i4 = 7;
        int i5 = 2;
        switch (this.$cid) {
            case 0:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(i5)).map(new hnv(i2)).collect(aghu.a);
            case 1:
                Optional optional = (Optional) obj;
                return Boolean.valueOf(optional.isPresent() && ((anjq) optional.get()).f());
            case 2:
                return (agke) Collection.EL.stream((agke) obj).map(new hnv(i)).collect(aghu.a);
            case 3:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(i5)).map(new hnv(6)).collect(aghu.a);
            case 4:
                Optional optional2 = (Optional) obj;
                return Boolean.valueOf(optional2.isPresent() && ((anuc) optional2.get()).f());
            case 5:
                akrn akrnVar = (akrn) obj;
                aihh aihhVar = (aihh) almd.a.createBuilder();
                aihf aihfVarCreateBuilder = alme.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                alme almeVar = (alme) aihfVarCreateBuilder.instance;
                akrnVar.getClass();
                almeVar.c = akrnVar;
                almeVar.b = 153515154;
                aihhVar.copyOnWrite();
                almd almdVar = (almd) aihhVar.instance;
                alme almeVar2 = (alme) aihfVarCreateBuilder.build();
                almeVar2.getClass();
                almdVar.f = almeVar2;
                almdVar.b |= 64;
                return new wfy((almd) aihhVar.build());
            case 6:
                aigj aigjVar = hpb.a;
                return (List) Collection.EL.stream((List) obj).filter(new hod(3)).map(new hnv(19)).collect(aghu.a);
            case 7:
                return agke.n((List) obj);
            case 8:
                aigj aigjVar2 = hpb.a;
                return hte.a((List) Collection.EL.stream((List) obj).map(new hnv(20)).collect(Collectors.toList()));
            case 9:
                return Boolean.valueOf(hpd.t((aamp) obj));
            case 10:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(i4)).map(new hpa(16)).collect(aghu.a);
            case 11:
                Optional optional3 = (Optional) obj;
                if (optional3.isEmpty()) {
                    return agpi.a;
                }
                annv annvVar = (annv) optional3.get();
                return (agke) Stream.CC.of((Object[]) new List[]{annvVar.g(), annvVar.j()}).flatMap(new hpa(i3)).collect(aghu.a);
            case 12:
                return (agke) Collection.EL.stream((agke) obj).map(new hpa(8)).map(new hpa(9)).collect(aghu.a);
            case 13:
                Optional optional4 = (Optional) obj;
                if (optional4.isEmpty()) {
                    return agpi.a;
                }
                annv annvVar2 = (annv) optional4.get();
                return (agke) Stream.CC.of((Object[]) new List[]{annvVar2.e(), annvVar2.i()}).flatMap(new hpa(i3)).collect(aghu.a);
            case 14:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(i4)).map(new hpa(17)).collect(aghu.a);
            case 15:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(i4)).map(new hpa(18)).collect(aghu.a);
            case 16:
                Optional optional5 = (Optional) obj;
                if (optional5.isEmpty()) {
                    throw new IllegalStateException("MusicDownloadsLibraryEntity not found");
                }
                return (annv) optional5.get();
            case 17:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(i4)).map(new hpa(i2)).collect(aghu.a);
            case 18:
                return (agke) Collection.EL.stream((agke) obj).filter(new hod(i3)).map(new hpa(15)).collect(aghu.a);
            case 19:
                return (agke) Collection.EL.stream((agke) obj).map(new hpa(i)).collect(aghu.a);
            default:
                Optional optional6 = (Optional) obj;
                return true != optional6.isPresent() ? optional6 : Optional.ofNullable(((ansx) optional6.get()).d());
        }
    }
}
