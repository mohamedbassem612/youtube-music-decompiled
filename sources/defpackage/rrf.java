package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrf {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/adaptive/animation/AdaptiveAnimationHintHelperImpl");
    private final vyo b;

    public rrf(vyo vyoVar) {
        this.b = vyoVar;
    }

    public final aiwh a(rrg rrgVar) {
        String str;
        if ((rrgVar.b & 1) == 0) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/adaptive/animation/AdaptiveAnimationHintHelperImpl", "getAnimationDecisionForCategory", 99, "AdaptiveAnimationHintHelperImpl.java")).t("#getAnimationDecisionForCategory: no category provided");
            return aiwh.ANIMATION_DECISION_UNKNOWN;
        }
        int iBh = a.bh(rrgVar.c);
        int i = iBh != 0 ? iBh : 1;
        amve amveVar = this.b.b().f;
        if (amveVar == null) {
            amveVar = amve.a;
        }
        aiip aiipVar = amveVar.j;
        aihz aihzVar = amve.m;
        if (DesugarCollections.unmodifiableMap(new aiid(aiipVar, aihzVar)).isEmpty()) {
            return aiwh.ANIMATION_DECISION_UNKNOWN;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new aiid(amveVar.j, aihzVar));
        switch (i) {
            case 1:
                str = "ANIMATION_CATEGORY_UNKNOWN";
                break;
            case 2:
                str = "ANIMATION_CATEGORY_WATCH_TRANSITION";
                break;
            case 3:
                str = "ANIMATION_CATEGORY_PROGRESS_INDICATOR";
                break;
            case 4:
                str = "ANIMATION_CATEGORY_PAGE_TRANSITION";
                break;
            case 5:
                str = "ANIMATION_CATEGORY_ANIMATED_IMAGES";
                break;
            case 6:
                str = "ANIMATION_CATEGORY_ANIMATED_INTERACTION";
                break;
            case 7:
                str = "ANIMATION_CATEGORY_ENGAGEMENT_PANEL_TRANSITION";
                break;
            case 8:
                str = "ANIMATION_CATEGORY_ANIMATED_SUBSCRIBE_BUTTON";
                break;
            default:
                str = "ANIMATION_CATEGORY_LIGHT_TOUCH_RESPONSE";
                break;
        }
        return (aiwh) j$.util.Map.EL.getOrDefault(mapUnmodifiableMap, str, aiwh.ANIMATION_DECISION_UNKNOWN);
    }
}
