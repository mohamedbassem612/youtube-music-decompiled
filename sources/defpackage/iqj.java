package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iqj implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iqj(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return Long.valueOf(((ailq) obj).f);
            case 1:
                return Boolean.valueOf(((ailq) obj).c);
            case 2:
                return Long.valueOf(((ailq) obj).h);
            case 3:
                return Long.valueOf(((ailq) obj).g);
            case 4:
                ails ailsVar = (ails) obj;
                if ((ailsVar.b & 1) == 0) {
                    return Optional.empty();
                }
                ajwo ajwoVar = ailsVar.c;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                return Optional.of(ajwoVar);
            case 5:
                return Boolean.valueOf(((ails) obj).d);
            case 6:
                return Boolean.valueOf(((ails) obj).e);
            case 7:
                return Boolean.valueOf(((ailu) obj).d);
            case 8:
                return Boolean.valueOf(((ailu) obj).c);
            case 9:
                return Boolean.valueOf(((aimb) obj).d);
            case 10:
                return (Boolean) obj;
            case 11:
                ((agrc) ((agrc) ((agrc) iqv.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/MusicPlaybackPrefsStoreHelper", "getShowFirstTimeSeeingSwipeableMiniPlayer", '9', "MusicPlaybackPrefsStoreHelper.java")).t("Failed to get the first seeing swipeable mini player preference.");
                return Boolean.FALSE;
            case 12:
                ((agrc) ((agrc) ((agrc) iqv.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/MusicPlaybackPrefsStoreHelper", "getShowFirstTimeSeeingDoubleTapToLikeTooltip", 'H', "MusicPlaybackPrefsStoreHelper.java")).t("Failed to get the first seeing double tap to like tooltip preference.");
                return Boolean.FALSE;
            case 13:
                return (Boolean) obj;
            case 14:
                ((agrc) ((agrc) ((agrc) ire.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/PodcastsPrefsStoreHelper", "getDontPlayPodcastVideos", '9', "PodcastsPrefsStoreHelper.java")).t("Failed to get don't play nma video preference");
                return Boolean.FALSE;
            case 15:
                return Boolean.valueOf(((aimq) obj).d < 3);
            case 16:
                aihf builder = ((aimq) obj).toBuilder();
                aimp aimpVar = aimp.FAILED;
                builder.copyOnWrite();
                aimq aimqVar = (aimq) builder.instance;
                aimqVar.c = aimpVar.e;
                aimqVar.b |= 1;
                builder.copyOnWrite();
                aimq aimqVar2 = (aimq) builder.instance;
                aimqVar2.b |= 2;
                aimqVar2.d = 4;
                return (aimq) builder.build();
            case 17:
                return Boolean.valueOf(((aimp) obj) == aimp.IN_PROGRESS);
            case 18:
                aimq aimqVar3 = (aimq) obj;
                aihf builder2 = aimqVar3.toBuilder();
                int i = aimqVar3.d + 1;
                builder2.copyOnWrite();
                aimq aimqVar4 = (aimq) builder2.instance;
                aimqVar4.b |= 2;
                aimqVar4.d = i;
                return (aimq) builder2.build();
            case 19:
                aihf builder3 = ((aimq) obj).toBuilder();
                aimp aimpVar2 = aimp.NOT_SET;
                builder3.copyOnWrite();
                aimq aimqVar5 = (aimq) builder3.instance;
                aimqVar5.c = aimpVar2.e;
                aimqVar5.b |= 1;
                builder3.copyOnWrite();
                aimq aimqVar6 = (aimq) builder3.instance;
                aimqVar6.b |= 2;
                aimqVar6.d = 0;
                builder3.copyOnWrite();
                aimq aimqVar7 = (aimq) builder3.instance;
                aimqVar7.b |= 4;
                aimqVar7.e = 1;
                return (aimq) builder3.build();
            default:
                return Boolean.valueOf(((Integer) obj).intValue() <= 0);
        }
    }
}
