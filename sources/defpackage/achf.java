package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class achf implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ achf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                awml awmlVar = (awml) obj;
                awmlVar.getClass();
                return Boolean.valueOf(((Optional) awmlVar.b).isPresent());
            case 1:
                twu.c(6, "PlayerSettingsEventHandler:Error in handleActiveSingleVideoChangedEvent", (Throwable) obj);
                return awmy.a;
            case 2:
                awml awmlVar2 = (awml) obj;
                Object obj2 = awmlVar2.a;
                obj2.getClass();
                Optional optional = (Optional) obj2;
                abyv abyvVar = (abyv) ((Optional) awmlVar2.b).get();
                abyvVar.h = optional;
                abzc abzcVar = abyvVar.b;
                if (abzcVar != null && abyvVar.f) {
                    abzcVar.R = optional;
                }
                abzh abzhVar = abyvVar.c;
                if (abzhVar != null) {
                    abzhVar.w = optional;
                }
                return awmy.a;
            case 3:
                return awmy.a;
            case 4:
                twu.d(acjr.a, 6, "Error in playbackSuspendedEventSink forwarding", (Throwable) obj);
                return awmy.a;
            case 5:
                twu.d(acjr.a, 6, "Error in videoTimeEventSink forwarding", (Throwable) obj);
                return awmy.a;
            case 6:
                twu.d(acjr.a, 6, "Error in localVideoTimeEventSink forwarding", (Throwable) obj);
                return awmy.a;
            case 7:
                twu.d(acjr.a, 6, "Error in youtubePlayerStateEventSink forwarding", (Throwable) obj);
                return awmy.a;
            case 8:
                acvm acvmVar = (acvm) obj;
                acvmVar.getClass();
                return Boolean.valueOf(acvmVar instanceof acvh);
            case 9:
                Throwable th = (Throwable) obj;
                th.getClass();
                twu.d("ReelAutoAdvanceController", 6, "Error in auto advance timer", th);
                return awmy.a;
            case 10:
                twu.d("ReelAutoAdvanceController", 6, "Error in auto advance state flowable", (Throwable) obj);
                return awmy.a;
            case 11:
                agev agevVar = (agev) obj;
                agevVar.getClass();
                if (agevVar.g()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                acvn acvnVar = (acvn) obj;
                acvnVar.getClass();
                return Boolean.valueOf(acvnVar == acvn.a || acvnVar == acvn.b);
            case 13:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                twu.d("ReelAutoAdvanceController", 6, "Error seeding default-on auto advance entity", th2);
                return Boolean.TRUE;
            case 14:
                return awmy.a;
            case 15:
                alqg alqgVar = (alqg) obj;
                alqgVar.getClass();
                return Integer.valueOf(alqgVar.b.size());
            case 16:
                aayt aaytVar = (aayt) obj;
                aaytVar.getClass();
                return Boolean.valueOf(aaytVar.a == abnv.f);
            case 17:
                twu.d("ReelCaptionOnMute", 6, "Error in state management stream", (Throwable) obj);
                return awmy.a;
            case 18:
                aayt aaytVar2 = (aayt) obj;
                aaytVar2.getClass();
                return new acsg(aaytVar2.b);
            case 19:
                aazq aazqVar = (aazq) obj;
                aazqVar.getClass();
                acip acipVar = aazqVar.b;
                return acipVar != null ? acipVar.aj() : avlh.w();
            default:
                aazb aazbVar = (aazb) obj;
                aazbVar.getClass();
                return new acsf(aazbVar);
        }
    }
}
