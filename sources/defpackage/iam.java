package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iam implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iam(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        iex iexVar;
        switch (this.$cid) {
            case 0:
                return new ian((wgi) obj, false);
            case 1:
                return new ian((wgi) obj, false);
            case 2:
                return ((abvn) obj).H();
            case 3:
                return ((acip) obj).P();
            case 4:
                return ((acip) obj).ad();
            case 5:
                return ((acip) obj).af();
            case 6:
                iexVar = new iex((List) obj, null);
                break;
            case 7:
                return (List) Collection.EL.stream((List) obj).filter(new hud(12)).map(new iaa(16)).collect(Collectors.toCollection(new ieu(0)));
            case 8:
                iexVar = new iex((List) obj, null);
                break;
            case 9:
                Optional optional = (Optional) obj;
                return optional.isEmpty() ? agpi.a : ((hcg) optional.get()).c;
            case 10:
                abvn abvnVar = (abvn) obj;
                abvnVar.getClass();
                return abvnVar.H();
            case 11:
                acip acipVar = (acip) obj;
                acipVar.getClass();
                return acipVar.ap();
            case 12:
                kyr kyrVar = (kyr) obj;
                if (kyrVar != null) {
                    return kyrVar.a;
                }
                return null;
            case 13:
                return ((kyr) obj).a;
            case 14:
                ((agrc) ((agrc) ((agrc) igr.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/streamwifionly/StreamWifiOnlyController", "shouldAllowStartingMusicPlayback", (char) 239, "StreamWifiOnlyController.java")).t("Failed to decide allowing offline playback");
                return Boolean.FALSE;
            case 15:
                return ilo.a;
            case 16:
                arfb arfbVar = arfb.VIDEO_QUALITY_SETTING_DATA_SAVER;
                arfb arfbVarA = arfb.a(((atpl) obj).i);
                if (arfbVarA == null) {
                    arfbVarA = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                return Boolean.valueOf(arfbVar.equals(arfbVarA));
            case 17:
                return Boolean.valueOf(((aimn) obj).d);
            case 18:
                return Integer.valueOf(((ailq) obj).j);
            case 19:
                return Long.valueOf(((ailq) obj).i);
            default:
                return Boolean.valueOf(((ailq) obj).d);
        }
        return iexVar;
    }
}
