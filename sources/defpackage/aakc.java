package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aakc implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aakc(int i) {
        this.$cid = i;
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        aihf aihfVarCreateBuilder;
        switch (this.$cid) {
            case 0:
                int i = aake.b;
                return wfs.h(((aofh) obj).d);
            case 1:
                String str = (String) obj;
                int iMatch = aaka.a.match(tyu.b(str));
                if (iMatch == 1) {
                    aihf aihfVarCreateBuilder2 = akne.a.createBuilder();
                    String strC = aaka.c(str);
                    aihfVarCreateBuilder2.copyOnWrite();
                    akne akneVar = (akne) aihfVarCreateBuilder2.instance;
                    akneVar.b = 1;
                    akneVar.c = strC;
                    return (akne) aihfVarCreateBuilder2.build();
                }
                if (iMatch != 2) {
                    ((agrc) ((agrc) aaju.a.b()).k("com/google/android/libraries/youtube/offline/features/appsearch/logging/DefaultAppSearchLogger", "toDownloadsSearchDocument", 232, "DefaultAppSearchLogger.java")).w("Unsupported uri: %s", str);
                    return akne.a;
                }
                aihf aihfVarCreateBuilder3 = akne.a.createBuilder();
                String strC2 = aaka.c(str);
                aihfVarCreateBuilder3.copyOnWrite();
                akne akneVar2 = (akne) aihfVarCreateBuilder3.instance;
                akneVar2.b = 2;
                akneVar2.c = strC2;
                return (akne) aihfVarCreateBuilder3.build();
            case 2:
                return ((aqmg) obj).c;
            case 3:
                return (amtc) ((weh) obj);
            case 4:
                return ((aoop) obj).b();
            case 5:
                return ((aofh) obj).d;
            case 6:
                return wfs.h(((weh) obj).b());
            case 7:
                return ((aamt) obj).b();
            case 8:
                return (aamt) obj;
            case 9:
                aanq aanqVar = (aanq) obj;
                aihf aihfVarCreateBuilder4 = aoef.a.createBuilder();
                String str2 = aanqVar.a;
                aihfVarCreateBuilder4.copyOnWrite();
                aoef aoefVar = (aoef) aihfVarCreateBuilder4.instance;
                str2.getClass();
                aoefVar.b |= 1;
                aoefVar.c = str2;
                long seconds = Duration.ofNanos(aanqVar.d).toSeconds();
                aihfVarCreateBuilder4.copyOnWrite();
                aoef aoefVar2 = (aoef) aihfVarCreateBuilder4.instance;
                aoefVar2.b |= 2;
                aoefVar2.d = seconds;
                return (aoef) aihfVarCreateBuilder4.build();
            case 10:
                aamj aamjVar = (aamj) obj;
                aihfVarCreateBuilder = aoeg.a.createBuilder();
                String str3 = aamjVar.a.a;
                aihfVarCreateBuilder.copyOnWrite();
                aoeg aoegVar = (aoeg) aihfVarCreateBuilder.instance;
                aoegVar.b |= 1;
                aoegVar.c = str3;
                List list = aamjVar.b;
                aihfVarCreateBuilder.bW(list);
                int size = list.size();
                aihfVarCreateBuilder.copyOnWrite();
                aoeg aoegVar2 = (aoeg) aihfVarCreateBuilder.instance;
                aoegVar2.b |= 2;
                aoegVar2.e = size;
                aohx aohxVar = aamjVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                aoeg aoegVar3 = (aoeg) aihfVarCreateBuilder.instance;
                aoegVar3.k = aohxVar.l;
                aoegVar3.b |= SemanticState.Focused;
                aogf aogfVar = aamjVar.h;
                aihfVarCreateBuilder.copyOnWrite();
                aoeg aoegVar4 = (aoeg) aihfVarCreateBuilder.instance;
                aoegVar4.m = aogfVar.e;
                aoegVar4.b |= SemanticState.ReadOnly;
                long j = aamjVar.g;
                aihfVarCreateBuilder.copyOnWrite();
                aoeg aoegVar5 = (aoeg) aihfVarCreateBuilder.instance;
                aoegVar5.b |= SemanticState.LiveRegion;
                aoegVar5.l = j;
                break;
            case 11:
                aamt aamtVar = (aamt) obj;
                aihfVarCreateBuilder = aoei.a.createBuilder();
                String strB = aamtVar.b();
                aihfVarCreateBuilder.copyOnWrite();
                aoei aoeiVar = (aoei) aihfVarCreateBuilder.instance;
                strB.getClass();
                aoeiVar.b |= 1;
                aoeiVar.c = strB;
                aihf aihfVarCreateBuilder5 = aoeh.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                aoeh aoehVar = (aoeh) aihfVarCreateBuilder5.instance;
                aoehVar.b |= 1;
                aoehVar.c = true;
                boolean zG = aamtVar.g();
                aihfVarCreateBuilder5.copyOnWrite();
                aoeh aoehVar2 = (aoeh) aihfVarCreateBuilder5.instance;
                aoehVar2.b |= 8;
                aoehVar2.e = zG;
                aamw aamwVar = aamtVar.q;
                aihfVarCreateBuilder5.copyOnWrite();
                aoeh aoehVar3 = (aoeh) aihfVarCreateBuilder5.instance;
                aoehVar3.b |= 64;
                aoehVar3.g = aamwVar != null;
                aihfVarCreateBuilder.copyOnWrite();
                aoei aoeiVar2 = (aoei) aihfVarCreateBuilder.instance;
                aoeh aoehVar4 = (aoeh) aihfVarCreateBuilder5.build();
                aoehVar4.getClass();
                aoeiVar2.u = aoehVar4;
                aoeiVar2.b |= 2097152;
                break;
            case 12:
                return (aqph) ((weh) obj);
            case 13:
                return ((aoei) obj).c;
            case 14:
                return (aoei) obj;
            case 15:
                return wfs.h(((aqph) obj).b());
            case 16:
                return ((aamt) obj).b();
            case 17:
                return (aqph) obj;
            case 18:
                return aarq.e(((aaro) obj).e);
            case 19:
                return (aaro) obj;
            default:
                return (aohq) ((weh) obj);
        }
        return aihfVarCreateBuilder;
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
