package defpackage;

import android.os.Bundle;
import internal.org.jni_zero.JniZero;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cbs implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cbs(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) throws Exception {
        switch (this.$cid) {
            case 0:
                return new ces((bvd) obj);
            case 1:
                bsg bsgVar = (bsg) obj;
                int i = bse.T;
                return bsgVar.a + ": " + bsgVar.b;
            case 2:
                int i2 = chs.k;
                return agke.q(Integer.valueOf(((cpk) obj).a));
            case 3:
                cvi cviVar = (cvi) obj;
                cviVar.f();
                return cviVar.getClass().getSimpleName();
            case 4:
                return agke.n(aguu.u(((cnk) obj).i().c, new cbs(5)));
            case 5:
                coy coyVar = coy.a;
                return Integer.valueOf(((bto) obj).c);
            case 6:
                Boolean bool = (Boolean) obj;
                int i3 = gox.aq;
                if (bool == null || !bool.booleanValue()) {
                    throw new gow();
                }
                return null;
            case 7:
                return (Boolean) obj;
            case 8:
                return (Boolean) obj;
            case 9:
                agab agabVar = (agab) obj;
                agabVar.getClass();
                try {
                    aihf aihfVarCreateBuilder = ases.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                    aihnVarBuild.getClass();
                    agabVar.i();
                    almd almdVar = almd.a;
                    wfy wfyVar = new wfy((almd) agabVar.f(375487958, (ases) aihnVarBuild, aihn.getParserForClass(almd.class)));
                    JniZero.j(agabVar, null);
                    return wfyVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        JniZero.j(agabVar, th);
                        throw th2;
                    }
                }
            case 10:
                obj.getClass();
                return (String) obj;
            case 11:
                obj.getClass();
                return (String) obj;
            case 12:
                Optional optionalOfNullable = (Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((anyx) ((weh) optionalOfNullable.get())).getEligibleForResumption());
                }
                return (Boolean) optionalOfNullable.orElse(Boolean.FALSE);
            case 13:
                ((agrc) ((agrc) ((agrc) gys.a.c().i(agso.a, "UserFeedbackCmd")).j((Exception) obj)).k("com/google/android/apps/youtube/music/command/UserFeedbackCommandResolver", "startFeedbackReport", 150, "UserFeedbackCommandResolver.java")).t("Exception when getting screenshot");
                return null;
            case 14:
                ((agrc) ((agrc) ((agrc) gzd.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/utils/MusicIterateCommandsCommandHistoryStoreHelper", "getAndUpdate", ':', "MusicIterateCommandsCommandHistoryStoreHelper.java")).t("Failed to get and update index.");
                return 0;
            case 15:
                return ((aimo) obj).b;
            case 16:
                ((agrc) ((agrc) ((agrc) hbc.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/disclaimers/onetimedisclaimer/data/OneTimeDisclaimerPrefsStoreHelper", "hasAcceptedDisclaimer", '<', "OneTimeDisclaimerPrefsStoreHelper.java")).t("Could not get acceptance state of one time disclaimer.");
                return Boolean.FALSE;
            case 17:
                ((agrc) ((agrc) ((agrc) hbc.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/disclaimers/onetimedisclaimer/data/OneTimeDisclaimerPrefsStoreHelper", "addAcceptedDisclaimerKey", 'M', "OneTimeDisclaimerPrefsStoreHelper.java")).t("Could not update acceptance state of one time disclaimer.");
                return null;
            case 18:
                return (Void) obj;
            case 19:
                ((agrc) ((agrc) ((agrc) hcp.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/feedback/BaseFeedbackInitializer", "startFeedback", 'U', "BaseFeedbackInitializer.java")).t("getFeedbackDataAsync failed, using empty bundle for feedback.");
                return new Bundle();
            default:
                ((agrc) ((agrc) ((agrc) hcp.a.c()).j((Exception) obj)).k("com/google/android/apps/youtube/music/feedback/BaseFeedbackInitializer", "getBinaryDataFuture", 134, "BaseFeedbackInitializer.java")).t("Exception when getting ProductSpecificBinaryDataModel");
                return agpi.a;
        }
    }
}
