package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uhd implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uhd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.$cid) {
            case 0:
                ((yno) obj).getClass();
                return awmy.a;
            case 1:
                ((yno) obj).getClass();
                return awmy.a;
            case 2:
                ((uwo) obj).getClass();
                return new uwo(awno.a);
            case 3:
                uww uwwVar = uwv.b;
                ((uww) obj).getClass();
                return uwv.b;
            case 4:
                ((agrc) ((agrc) uzv.a.b()).j((Throwable) obj).k("com/google/android/libraries/youtube/creation/effects/selection/EditorMultiEffectApplicationDelegate", "onViewCreated$<anonymous>", 86, "EditorMultiEffectApplicationDelegate.kt")).t("Error observing composition");
                return awmy.a;
            case 5:
                long j = vcp.a;
                ((vcr) obj).getClass();
                return asdn.a;
            case 6:
                long j2 = vcp.a;
                ((vcr) obj).getClass();
                return asdn.a;
            case 7:
                long j3 = vcp.a;
                ((vcr) obj).getClass();
                return aigv.a;
            case 8:
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isEmpty()) {
                    throw new IllegalStateException("Failed to inflate new track");
                }
                vdn vdnVar = (vdn) optional.get();
                aihf aihfVarCreateBuilder = umo.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihf aihfVarCreateBuilder2 = umn.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                auey aueyVar = vdnVar.a;
                aihfVarCreateBuilder2.copyOnWrite();
                umn umnVar = (umn) aihfVarCreateBuilder2.instance;
                umnVar.c = aueyVar;
                umnVar.b |= 1;
                String string = vdnVar.c.e.toString();
                string.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                umn umnVar2 = (umn) aihfVarCreateBuilder2.instance;
                umnVar2.b |= 2;
                umnVar2.d = string;
                long j4 = vdnVar.b.g().h;
                if (j4 > 0) {
                    aigu aiguVarU = aext.u(ahng.C(j4));
                    aihfVarCreateBuilder2.copyOnWrite();
                    umn umnVar3 = (umn) aihfVarCreateBuilder2.instance;
                    umnVar3.e = aiguVarU;
                    umnVar3.b |= 4;
                }
                aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                aihnVarBuild.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                umo umoVar = (umo) aihfVarCreateBuilder.instance;
                umoVar.c = (umn) aihnVarBuild;
                umoVar.b = 1;
                return yno.gH(aihfVarCreateBuilder);
            case 9:
                twu.d("AddedSoundCmpListener", 6, "Error observing composition changes", (Throwable) obj);
                return awmy.a;
            case 10:
                ((agrc) ((agrc) vlu.a.c()).j((Throwable) obj).k("com/google/android/libraries/youtube/elementscomponents/riveanimation/RiveAnimationComponentSpec", "resolveAnimationCompleteCommand$<anonymous>", 182, "RiveAnimationComponentSpec.kt")).t("Failed to resolve Rive onAnimationComplete command");
                return awmy.a;
            case 11:
                ((agrc) ((agrc) vlu.a.c()).j((Throwable) obj).k("com/google/android/libraries/youtube/elementscomponents/riveanimation/RiveAnimationComponentSpec", "onBind$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 135, "RiveAnimationComponentSpec.kt")).t("Failed to resolve Rive onLoadComplete command");
                return awmy.a;
            case 12:
                twu.c(5, "EngagementPanelSavedState corrupted.", (bdu) obj);
                return vsw.a;
            case 13:
                ((Throwable) obj).getClass();
                return aiqj.a;
            case 14:
                weo weoVar = (weo) obj;
                weoVar.getClass();
                return agev.h(weoVar.c);
            case 15:
                alop alopVar = ((aoll) obj).c;
                if (alopVar == null) {
                    alopVar = alop.a;
                }
                return Boolean.valueOf(alopVar.m);
            case 16:
                albe albeVar = ((aoll) obj).h;
                return albeVar == null ? albe.a : albeVar;
            case 17:
                char cCharValue = ((Character) obj).charValue();
                agkz agkzVar = wte.a;
                if ((cCharValue < 'a' || cCharValue >= '{') && ((cCharValue < 'A' || cCharValue >= '[') && ((cCharValue < '0' || cCharValue >= ':') && !awrc.y("_+/-=", cCharValue)))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                alik alikVar = (alik) obj;
                alikVar.getClass();
                amuh amuhVar = alikVar.n;
                if (amuhVar == null) {
                    amuhVar = amuh.a;
                }
                akvx akvxVar = amuhVar.h;
                return akvxVar == null ? akvx.a : akvxVar;
            case 19:
                ((bdu) obj).getClass();
                aihf aihfVarCreateBuilder3 = xni.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                yno.dh(amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_NOT_ASKED, aihfVarCreateBuilder3);
                return yno.dg(aihfVarCreateBuilder3);
            default:
                tnw tnwVar = (tnw) obj;
                int i = ybk.f;
                tnwVar.getClass();
                alpn alpnVar = (alpn) tnwVar.a;
                if (alpnVar != null) {
                    return alpnVar;
                }
                alpn alpnVar2 = alpn.a;
                alpnVar2.getClass();
                return alpnVar2;
        }
    }
}
