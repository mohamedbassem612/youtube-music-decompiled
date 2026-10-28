package defpackage;

import android.graphics.Rect;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gnw implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ gnw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                return (annv) ((weh) obj);
            case 1:
                return (weh) ((Optional) obj).get();
            case 2:
                return Boolean.FALSE;
            case 3:
                afcv afcvVar = (afcv) obj;
                agrf agrfVar = gpl.U;
                return Integer.valueOf(afcvVar.k() ? afcvVar.k.getHeight() : 0);
            case 4:
                aazn aaznVar = (aazn) obj;
                return Boolean.valueOf(aaznVar.c() || aaznVar.a());
            case 5:
                return obj;
            case 6:
                weh wehVar = ((weo) obj).c;
                wehVar.getClass();
                return wehVar;
            case 7:
                return Integer.valueOf(((Rect) obj).height());
            case 8:
                anpk anpkVar = ((alik) obj).h;
                return anpkVar == null ? anpk.a : anpkVar;
            case 9:
                return (weh) ((agev) obj).c();
            case 10:
                return (hte) ((Optional) obj).get();
            case 11:
                Duration duration = hia.a;
                aqph aqphVar = (aqph) ((weo) obj).c;
                aqphVar.getClass();
                return aqphVar;
            case 12:
                return (weh) ((Optional) obj).get();
            case 13:
                ((agrc) ((agrc) ((agrc) hlq.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/MusicOfflineVideoPlaybackPositionHelper", "getVideoStartTimeSecondsBlocking", '%', "MusicOfflineVideoPlaybackPositionHelper.java")).t("Failed to retrieve playback progress blocking");
                return 0L;
            case 14:
                agrf agrfVar2 = hob.a;
                String strAG = kro.aG();
                strAG.getClass();
                int i3 = 13;
                return ((hcc) obj).b(new ank(strAG, i3)).k(new hbr(new ank(strAG, 14), i3));
            case 15:
                Object[] objArr = (Object[]) obj;
                Optional optional = (Optional) objArr[0];
                return optional.isPresent() ? optional : (Optional) objArr[1];
            case 16:
                return Optional.of(hte.a((List) Collection.EL.stream((List) obj).map(new hpp(i)).filter(new hod(8)).collect(aghu.a)));
            case 17:
                return (weh) ((Optional) obj).get();
            case 18:
                return Optional.of(hte.a((List) Collection.EL.stream((List) obj).map(new hpp(i2)).collect(Collectors.toList())));
            case 19:
                Optional optionalOfNullable = (Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    annv annvVar = (annv) ((weh) optionalOfNullable.get());
                    agjz agjzVar = new agjz(4);
                    agjzVar.j(annvVar.h());
                    agjzVar.j(annvVar.f());
                    agjz agjzVar2 = new agjz(4);
                    agjzVar2.j(annvVar.g());
                    agjzVar2.j(annvVar.e());
                    optionalOfNullable = Optional.ofNullable(agke.r(agjzVar.g(), agjzVar2.g()));
                }
                agke agkeVar = agpi.a;
                return (agke) optionalOfNullable.orElse(agke.r(agkeVar, agkeVar));
            default:
                return wfs.h(((weo) obj).a);
        }
    }
}
