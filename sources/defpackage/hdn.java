package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hdn implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hdn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 13;
        boolean z = false;
        z = false;
        int i2 = 2;
        switch (this.$cid) {
            case 0:
                aihf builder = ((ailf) obj).toBuilder();
                builder.copyOnWrite();
                ailf ailfVar = (ailf) builder.instance;
                ailfVar.b |= 1;
                ailfVar.c = true;
                return (ailf) builder.build();
            case 1:
                ((agrc) ((agrc) ((agrc) hcp.a.c()).j((Exception) obj)).k("com/google/android/apps/youtube/music/feedback/BaseFeedbackInitializer", "getScreenshotFuture", 123, "BaseFeedbackInitializer.java")).t("Exception when getting screenshot");
                return null;
            case 2:
                return Boolean.valueOf(((ailf) obj).c);
            case 3:
                ((agrc) ((agrc) ((agrc) hdp.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/generatedthumbnails/data/GeneratedThumbnailsPrefsStoreHelper", "getHasAcceptedCreationDisclaimer", ';', "GeneratedThumbnailsPrefsStoreHelper.java")).t("Could not get acceptance state of generated thumbnails disclaimer.");
                return Boolean.FALSE;
            case 4:
                ((agrc) ((agrc) ((agrc) hdp.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/generatedthumbnails/data/GeneratedThumbnailsPrefsStoreHelper", "updateHasAcceptedCreationDisclaimer", 'M', "GeneratedThumbnailsPrefsStoreHelper.java")).t("Could not update acceptance state of generated thumbnails disclaimer.");
                return null;
            case 5:
                return (Void) obj;
            case 6:
                Optional optionalOfNullable = (Optional) obj;
                int i3 = hin.c;
                if (optionalOfNullable != null) {
                    if (true == optionalOfNullable.isPresent()) {
                        annv annvVar = (annv) ((weh) optionalOfNullable.get());
                        optionalOfNullable = Optional.ofNullable(Boolean.valueOf((annvVar.h().isEmpty() && annvVar.f().isEmpty() && annvVar.g().isEmpty() && annvVar.e().isEmpty() && annvVar.j().isEmpty() && annvVar.i().isEmpty()) ? false : true));
                    }
                    if (((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                return (Optional) obj;
            case 8:
                Optional optional = (Optional) obj;
                return true == optional.isPresent() ? Optional.ofNullable((anuk) ((weh) optional.get())) : optional;
            case 9:
                Optional optional2 = (Optional) obj;
                return true == optional2.isPresent() ? Optional.ofNullable((ansx) ((weh) optional2.get())) : optional2;
            case 10:
                return hnl.e((List) obj, 2);
            case 11:
                agrf agrfVar = hnl.a;
                return (Serializable) Collection.EL.stream((List) obj).filter(new gqk(i)).map(new hnf(11)).collect(aghu.b(new hnf(i2), new hnf(3), new hnh(1)));
            case 12:
                return aakb.c((uc) obj);
            case 13:
                return hnl.e((List) obj, 1);
            case 14:
                agrf agrfVar2 = hnl.a;
                return (Serializable) Collection.EL.stream((List) obj).filter(new gqk(i)).map(new hnf(8)).collect(aghu.b(new hnf(9), new hnf(10), new hnh(2)));
            case 15:
                agrf agrfVar3 = hnl.a;
                return (List) Collection.EL.stream((List) obj).filter(new gqk(i)).map(new hnf(6)).collect(aghu.a);
            case 16:
                return (Boolean) obj;
            case 17:
                Optional optionalOfNullable2 = (Optional) obj;
                int i4 = hoe.d;
                if (true == optionalOfNullable2.isPresent()) {
                    annv annvVar2 = (annv) ((weh) optionalOfNullable2.get());
                    optionalOfNullable2 = Optional.ofNullable((agke) Stream.CC.concat(Collection.EL.stream(annvVar2.g()), Collection.EL.stream(annvVar2.e())).map(new hnv(4)).collect(aghu.a));
                }
                return (agke) optionalOfNullable2.orElse(agpi.a);
            case 18:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(z ? 1 : 0)).map(new hnv(i2)).collect(aghu.a);
            case 19:
                return (agke) Collection.EL.stream((List) obj).filter(new hod(i2)).map(new hnv(5)).collect(aghu.a);
            default:
                Optional optional3 = (Optional) obj;
                return true != optional3.isPresent() ? optional3 : Optional.ofNullable(((anqs) ((weh) optional3.get())).c);
        }
    }
}
