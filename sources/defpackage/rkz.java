package defpackage;

import android.content.Intent;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rkz implements vxc, sxt {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver");
    private final cf b;
    private final vxe c;
    private final vyo d;
    private final aunn e;
    private final aunn f;
    private final rpy g;
    private final mgk h;

    public rkz(cf cfVar, vxe vxeVar, mgk mgkVar, rpy rpyVar, vyo vyoVar, aunn aunnVar, aunn aunnVar2) {
        this.b = cfVar;
        this.c = vxeVar;
        this.h = mgkVar;
        this.g = rpyVar;
        this.d = vyoVar;
        this.e = aunnVar;
        this.f = aunnVar2;
    }

    private static final ajwo f(ajwo ajwoVar, String str) {
        ajml ajmlVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        ajmk ajmkVar = ajmk.a;
        aihf aihfVarCreateBuilder = ajmkVar.createBuilder();
        if (!ajmfVar.d.isEmpty()) {
            try {
                aihfVarCreateBuilder = ((ajmk) aihn.parseFrom(ajmkVar, Base64.decode(ajmfVar.d, 8), ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            } catch (aiik | IllegalArgumentException e) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver", "injectParentLinkPayloadToChildOnboardingCommand", (char) 275, "StartModularOnboardingCommandResolver.java")).t("injectParentLinkPayloadToChildOnboardingCommand: failed to parse BrowseEndpointParams");
            }
        }
        ajmk ajmkVar2 = (ajmk) aihfVarCreateBuilder.instance;
        if ((ajmkVar2.b & SemanticState.LiveRegion) == 0 || (ajmlVar = ajmkVar2.c) == null) {
            ajmlVar = ajml.a;
        }
        aihf builder = ajmlVar.toBuilder();
        builder.copyOnWrite();
        ajml ajmlVar2 = (ajml) builder.instance;
        ajmlVar2.b |= 16;
        ajmlVar2.c = str;
        ajml ajmlVar3 = (ajml) builder.build();
        aihfVarCreateBuilder.copyOnWrite();
        ajmk ajmkVar3 = (ajmk) aihfVarCreateBuilder.instance;
        ajmlVar3.getClass();
        ajmkVar3.c = ajmlVar3;
        ajmkVar3.b |= SemanticState.LiveRegion;
        String strEncodeToString = Base64.encodeToString(((ajmk) aihfVarCreateBuilder.build()).toByteArray(), 10);
        aihf builder2 = ajmfVar.toBuilder();
        builder2.copyOnWrite();
        ajmf ajmfVar2 = (ajmf) builder2.instance;
        strEncodeToString.getClass();
        ajmfVar2.b |= 4;
        ajmfVar2.d = strEncodeToString;
        ajmf ajmfVar3 = (ajmf) builder2.build();
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihhVar.e(ajmj.a, ajmfVar3);
        return (ajwo) aihhVar.build();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean z;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqch.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqch.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                aqch aqchVar = (aqch) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if (aqchVar.i) {
                    rpy rpyVar = this.g;
                    rpyVar.b.execute(afwl.i(new rno(rpyVar, 4)));
                    return;
                }
                alik alikVarB = this.d.b();
                if ((alikVarB.b & 64) == 0) {
                    z = false;
                } else {
                    amve amveVar = alikVarB.f;
                    if (amveVar == null) {
                        amveVar = amve.a;
                    }
                    if (amveVar.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                cf cfVar = this.b;
                qbw qbwVarB = ParentToolsActivity.b(cfVar);
                qbwVarB.b = e();
                qbwVarB.c = txz.b(cfVar);
                qbwVarB.f = aqchVar.e;
                qbwVarB.g = aqchVar.f;
                qbwVarB.i = aqchVar.h;
                ajue ajueVar = aqchVar.d;
                if (ajueVar == null) {
                    ajueVar = ajue.b;
                }
                qbwVarB.d = ajueVar.i;
                qbwVarB.h = aqchVar.toByteArray();
                qbwVarB.j = qby.b;
                qbwVarB.k = z;
                if (((vxz) this.e.io()).l(24, 45751269L, false)) {
                    qbwVarB.n = true;
                    qbwVarB.e = "dark";
                }
                this.h.b(qbwVarB.a(), 9406, this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[Catch: aiik -> 0x0116, TryCatch #0 {aiik -> 0x0116, blocks: (B:25:0x0057, B:27:0x0067, B:28:0x0069, B:30:0x006f, B:32:0x0073, B:34:0x0079, B:36:0x008c, B:38:0x009f, B:40:0x00a6, B:42:0x00ad, B:44:0x00b1, B:45:0x00b3, B:39:0x00a2, B:46:0x00e5, B:47:0x00e9, B:49:0x00fb), top: B:69:0x0057 }] */
    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        qcg qcgVar;
        if (i2 != -1) {
            if (i != 9406) {
                return false;
            }
            this.b.finishAffinity();
            return true;
        }
        if (intent != null && intent.getExtras() != null && (qcgVar = (qcg) intent.getExtras().getParcelable("parent_tools_result")) != null) {
            int i3 = qcgVar.c;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 2) {
                byte[] bArr = qcgVar.a;
                if (bArr == null) {
                    ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver", "handleOnboarded", 173, "StartModularOnboardingCommandResolver.java")).t("handleOnboarded: hostClientData is null, launching modular onboarding automatically");
                    this.g.a();
                } else {
                    try {
                        aqch aqchVar = (aqch) aihn.parseFrom(aqch.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                        if ((aqchVar.c & 8) != 0) {
                            vxe vxeVar = this.c;
                            ajwo ajwoVar = aqchVar.g;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            vxeVar.a(ajwoVar);
                        } else {
                            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver", "handleOnboarded", 186, "StartModularOnboardingCommandResolver.java")).t("handleOnboarded: missing expected PostSuccessCommand");
                            this.g.a();
                        }
                    } catch (aiik e) {
                        ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver", "handleOnboarded", (char) 190, "StartModularOnboardingCommandResolver.java")).t("handleOnboarded: failed to parse hostClientData");
                        this.g.a();
                    }
                }
            } else if (i4 == 3) {
                byte[] bArr2 = qcgVar.a;
                if (bArr2 == null) {
                    ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver", "handleRedirectToChildOnboarding", 199, "StartModularOnboardingCommandResolver.java")).t("handleRedirectToChildOnboarding: hostClientData is null, launching modular onboarding automatically");
                    this.g.a();
                    return true;
                }
                try {
                    aqch aqchVar2 = (aqch) aihn.parseFrom(aqch.a, bArr2, ExtensionRegistryLite.getGeneratedRegistry());
                    ajwo ajwoVarF = aqchVar2.j;
                    if (ajwoVarF == null) {
                        ajwoVarF = ajwo.a;
                    }
                    if ((aqchVar2.c & 64) == 0) {
                        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver", "handleRedirectToChildOnboarding", 213, "StartModularOnboardingCommandResolver.java")).t("handleRedirectToChildOnboarding: missing expected redirectToChildOnboarding command");
                        this.g.a();
                        return true;
                    }
                    String str = qcgVar.b;
                    if (str != null && !str.isEmpty()) {
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
                        ajwoVarF.c(aihlVarCheckIsLite);
                        if (ajwoVarF.j.n(aihlVarCheckIsLite.d)) {
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apzi.a);
                            ajwoVarF.c(aihlVarCheckIsLite2);
                            Object objK = ajwoVarF.j.k(aihlVarCheckIsLite2.d);
                            apzh apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                            if ((apzhVar.b & 2) != 0) {
                                ajwo ajwoVar2 = apzhVar.c;
                                if (ajwoVar2 == null) {
                                    ajwoVar2 = ajwo.a;
                                }
                                ajwo ajwoVarF2 = f(ajwoVar2, str);
                                aihf builder = apzhVar.toBuilder();
                                builder.copyOnWrite();
                                apzh apzhVar2 = (apzh) builder.instance;
                                ajwoVarF2.getClass();
                                apzhVar2.c = ajwoVarF2;
                                apzhVar2.b |= 2;
                                apzh apzhVar3 = (apzh) builder.build();
                                aihh aihhVar = (aihh) ajwoVarF.toBuilder();
                                aihhVar.e(apzi.a, apzhVar3);
                                ajwoVarF = (ajwo) aihhVar.build();
                            } else {
                                ajwoVarF = f(ajwoVarF, str);
                            }
                        } else {
                            ajwoVarF = f(ajwoVarF, str);
                        }
                    }
                    ((acfd) this.g.g.io()).a = true;
                    this.c.a(ajwoVarF);
                    return true;
                } catch (aiik e2) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/account/command/StartModularOnboardingCommandResolver", "handleRedirectToChildOnboarding", (char) 227, "StartModularOnboardingCommandResolver.java")).t("handleRedirectToChildOnboarding: failed to parse hostClientData, launching modular onboarding automatically");
                    this.g.a();
                }
            }
        }
        return true;
    }

    protected String e() {
        return qbz.a;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
