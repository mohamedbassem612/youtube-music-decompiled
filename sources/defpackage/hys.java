package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hys implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hys(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((abvn) obj).C();
            case 1:
                return (Map) Collection.EL.stream((java.util.Collection) obj).collect(aghu.a(new hds(16), new hds(17)));
            case 2:
                return ((acip) obj).L();
            case 3:
                agrf agrfVar = idr.a;
                return (Set) Collection.EL.stream((List) obj).filter(new gqn(5)).map(new hds(18)).collect(Collectors.toCollection(new idl(false ? 1 : 0)));
            case 4:
                return Boolean.valueOf(((aimg) obj).d > 1);
            case 5:
                aihf aihfVarCreateBuilder = aild.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aild aildVar = (aild) aihfVarCreateBuilder.instance;
                aildVar.b |= 1;
                aildVar.c = 0;
                return (aild) aihfVarCreateBuilder.build();
            case 6:
                return Long.valueOf(((ailq) obj).e);
            case 7:
                return Boolean.valueOf(((ailu) obj).e);
            case 8:
                Duration duration = iqn.a;
                long jMax = Math.max(iqn.a.toSeconds(), Math.min(((ailu) obj).f, iqn.b.toSeconds()));
                int i = (int) jMax;
                if (jMax == i) {
                    return Integer.valueOf(i);
                }
                throw new ArithmeticException();
            case 9:
                return Boolean.valueOf(((ailv) obj).c > 0);
            case 10:
                ((agrc) ((agrc) ((agrc) iqv.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/MusicPlaybackPrefsStoreHelper", "getCrossfadeEnabled", (char) 129, "MusicPlaybackPrefsStoreHelper.java")).t("Failed to get crossfade enabled preference.");
                return Boolean.FALSE;
            case 11:
                ((agrc) ((agrc) ((agrc) iqv.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/MusicPlaybackPrefsStoreHelper", "getCrossfadeDurationSecs", (char) 142, "MusicPlaybackPrefsStoreHelper.java")).t("Failed to get crossfade duration secs.");
                return Integer.valueOf(a.p(iqn.c.toSeconds()));
            case 12:
                return Boolean.valueOf(((aimp) obj) == aimp.SUCCESSFUL);
            case 13:
                return null;
            case 14:
                return ((agjz) obj).g();
            case 15:
                return olp.f((oip) obj);
            case 16:
                boolean z = olp.a;
                int i2 = onb.a;
                return agev.i(-1);
            case 17:
                agev agevVar = (agev) obj;
                boolean z2 = olp.a;
                if (agevVar.g()) {
                    Integer num = (Integer) agevVar.c();
                    if (num.intValue() >= 0) {
                        return num;
                    }
                }
                return -1;
            case 18:
                boolean z3 = olp.a;
                ArrayList arrayList = new ArrayList();
                for (omh omhVar : (List) obj) {
                    oio oioVar = omhVar.b.c;
                    if (oioVar == null) {
                        oioVar = oio.a;
                    }
                    if (!oioVar.h) {
                        arrayList.add(omhVar);
                    }
                }
                return arrayList;
            case 19:
                olp.a = true;
                return null;
            default:
                oja ojaVar = (oja) obj;
                if (!omj.d(ojaVar.c)) {
                    return agdf.a;
                }
                aihf aihfVarCreateBuilder2 = ahaz.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                ahaz ahazVar = (ahaz) aihfVarCreateBuilder2.instance;
                ahazVar.b |= 1;
                ahazVar.c = true;
                aijp aijpVar = ojaVar.d;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                long jA = aikz.a(aijpVar);
                aihfVarCreateBuilder2.copyOnWrite();
                ahaz ahazVar2 = (ahaz) aihfVarCreateBuilder2.instance;
                ahazVar2.b |= 2;
                ahazVar2.d = jA;
                boolean zD = omj.d(ojaVar.c);
                aihfVarCreateBuilder2.copyOnWrite();
                ahaz ahazVar3 = (ahaz) aihfVarCreateBuilder2.instance;
                ahazVar3.b |= 4;
                ahazVar3.e = zD;
                aihfVarCreateBuilder2.copyOnWrite();
                ahaz ahazVar4 = (ahaz) aihfVarCreateBuilder2.instance;
                ahazVar4.b |= 8;
                ahazVar4.f = false;
                ahaz ahazVar5 = (ahaz) aihfVarCreateBuilder2.build();
                ahazVar5.getClass();
                return new agfa(ahazVar5);
        }
    }
}
