package defpackage;

import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import internal.org.jni_zero.CommonApis;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsv {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/player/ReelInlineResponseExtractor");
    public final acrz b;
    public final wjb c;
    public acqz d;
    public final hno e;
    private final mbc f;
    private final actv g;
    private final awmd h;
    private final zwb i;
    private final vxz j;
    private final wjr k;

    public acsv(acrz acrzVar, wjb wjbVar, mbc mbcVar, vxz vxzVar, actv actvVar, wjr wjrVar, zwb zwbVar, hno hnoVar, awmd awmdVar) {
        this.b = acrzVar;
        this.c = wjbVar;
        this.f = mbcVar;
        this.j = vxzVar;
        this.g = actvVar;
        this.k = wjrVar;
        this.i = zwbVar;
        this.e = hnoVar;
        this.h = awmdVar;
    }

    public static final MessageLite i(apfp apfpVar, aigw aigwVar) {
        int i = apfpVar.i;
        if (i == 49) {
            apfs apfsVar = i == 49 ? (apfs) apfpVar.k : apfs.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            apfsVar.c(aihlVarCheckIsLite);
            if (apfsVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aigwVar);
                apfsVar.c(aihlVarCheckIsLite2);
                Object objK = apfsVar.j.k(aihlVarCheckIsLite2.d);
                return (MessageLite) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public final Pair a(ajwo ajwoVar) {
        acra acraVarF;
        acqz acqzVar = this.d;
        if (acqzVar == null || (acraVarF = acqzVar.f(ajwoVar)) == null) {
            return null;
        }
        return new Pair(Long.valueOf(acraVarF.l), acraVarF.f);
    }

    public final zwa b() {
        zwb zwbVar = this.i;
        if (zwbVar == null) {
            return null;
        }
        return zwbVar.e();
    }

    public final abng c(ajwo ajwoVar, long j) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                alvt alvtVar = (alvt) i(apfpVar, alvu.b);
                zwa zwaVarB = b();
                if (alvtVar == null) {
                    if (((apfpVar.i == 44 ? (apfq) apfpVar.k : apfq.a).b & 1) != 0) {
                        try {
                            alvtVar = (alvt) d((apfpVar.i == 44 ? (apfq) apfpVar.k : apfq.a).c.G(), alvt.a, zwaVarB);
                        } catch (IllegalArgumentException e) {
                            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/reel/internal/player/ReelInlineResponseExtractor", "getCacheablePlayerResponse", (char) 298, "ReelInlineResponseExtractor.java")).t("Failed to generate PlayerResponseCache when creating CacheablePlayerResponse");
                        }
                    }
                } else if ((alvtVar.c & SemanticState.LiveRegion) != 0) {
                    h(alvtVar, zwaVarB);
                }
                if (alvtVar != null) {
                    wjg wjgVar = new wjg();
                    wjgVar.b = alvtVar;
                    wjgVar.b(j);
                    wjgVar.h = this.c;
                    wji wjiVarA = wjgVar.a();
                    wjiVarA.i.c("PLAYER_RESPONSE_SOURCE_KEY", 3L);
                    mbc mbcVar = this.f;
                    Instant instantMinusMillis = j > 0 ? Instant.now().minusMillis(mbcVar.b() - j) : mbcVar.f();
                    ahgr ahgrVar = new ahgr();
                    ahgrVar.a = wjiVarA;
                    ahgrVar.j(instantMinusMillis);
                    return ahgrVar.i();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    public final MessageLite d(byte[] bArr, MessageLite messageLite, zwa zwaVar) {
        if (zwaVar == null) {
            return wjr.F(bArr, messageLite);
        }
        wjr wjrVar = this.k;
        messageLite.getClass();
        try {
            ?? H = messageLite.getParserForType().h(bArr, ExtensionRegistryLite.getGeneratedRegistry());
            ((dov) wjrVar.b.io()).W(zwaVar, messageLite.getClass(), bArr);
            return H;
        } catch (aiik e) {
            twu.c(6, "Exception while parsing InnerTube response", e);
            return null;
        }
    }

    public final void e(ajwo ajwoVar) {
        Pair pairA;
        int iAX;
        apfp apfpVarAa;
        int iF;
        hno hnoVar = this.e;
        if (hnoVar.aO() || (pairA = a(ajwoVar)) == null) {
            return;
        }
        ajwo ajwoVar2 = (ajwo) pairA.second;
        if (!this.j.l(21, 45638126L, false) || ajwoVar2 == null) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar2.c(aihlVarCheckIsLite);
        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
            ajwoVar2.c(aihlVarCheckIsLite2);
            if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                return;
            }
            if (!aecm.aw(ajwoVar2) && !aecm.az(ajwoVar2) && (!hnoVar.aD() || (apfpVarAa = aecm.aa(ajwoVar2)) == null || (apfpVarAa.c & 1) == 0 || (iF = CommonApis.f(apfpVarAa.l)) == 0 || iF != 10)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                ajwoVar2.c(aihlVarCheckIsLite3);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                if (!aecm.am((apfp) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK)))) {
                    return;
                }
            }
            long jLongValue = ((Long) pairA.first).longValue();
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
            ajwoVar2.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
            apfp apfpVar = (apfp) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            alqc alqcVar = (alqc) i(apfpVar, alqe.b);
            if (alqcVar == null) {
                if (((apfpVar.i == 44 ? (apfq) apfpVar.k : apfq.a).b & 2) == 0) {
                    return;
                }
            }
            ajwo ajwoVarT = aecm.T(ajwoVar2);
            apfq apfqVar = apfpVar.i == 44 ? (apfq) apfpVar.k : apfq.a;
            zwa zwaVarB = b();
            if (alqcVar == null) {
                try {
                    alqcVar = (alqc) d(apfqVar.d.G(), alqc.a, zwaVarB);
                } catch (IllegalArgumentException e) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/reel/internal/player/ReelInlineResponseExtractor", "cacheInlineReelItemWatchResponseInCommand", (char) 194, "ReelInlineResponseExtractor.java")).t("Failed to store inline ReelItemWatchResponse in ReelWatchEndpoint");
                    alqcVar = null;
                }
            } else if ((alqcVar.b & SemanticState.LiveRegion) != 0) {
                g(alqcVar, zwaVarB);
            }
            if (alqcVar != null) {
                if ((alqcVar.b & 4) != 0) {
                    aihf builder = alqcVar.toBuilder();
                    builder.copyOnWrite();
                    alqc alqcVar2 = (alqc) builder.instance;
                    alqcVar2.e = null;
                    alqcVar2.b &= -5;
                    alqcVar = (alqc) builder.build();
                }
                if (alqcVar != null && (((alqcVar.b & 2) != 0 || (this.e.aD() && alqcVar.v.size() > 0)) && (alqcVar.b & 8) != 0 && (iAX = a.aX(alqcVar.f)) != 0 && iAX == 2)) {
                    this.b.f(ajwoVarT, alqcVar, jLongValue);
                }
            }
            f(ajwoVar2, false, true);
        }
    }

    public final void f(ajwo ajwoVar, boolean z, boolean z2) {
        this.g.E(new acsk(ajwoVar, z, z2));
    }

    public final void g(alqc alqcVar, zwa zwaVar) {
        if ((alqcVar.b & SemanticState.LiveRegion) == 0 || zwaVar == null) {
            return;
        }
        dov dovVar = (dov) this.h.io();
        albe albeVar = alqcVar.j;
        if (albeVar == null) {
            albeVar = albe.a;
        }
        dovVar.V(zwaVar, albeVar);
    }

    public final void h(alvt alvtVar, zwa zwaVar) {
        if ((alvtVar.c & SemanticState.LiveRegion) == 0 || zwaVar == null) {
            return;
        }
        dov dovVar = (dov) this.h.io();
        albe albeVar = alvtVar.I;
        if (albeVar == null) {
            albeVar = albe.a;
        }
        dovVar.V(zwaVar, albeVar);
    }
}
