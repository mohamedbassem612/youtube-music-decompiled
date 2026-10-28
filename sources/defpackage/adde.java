package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adde implements nvq {
    public static final /* synthetic */ int b = 0;
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/rendering/elements/converters/properties/LoggingPropertiesConverterFlat");
    private static final String d = "adde";
    public final vxz a;
    private final tqj e;
    private final nuc f;
    private final AtomicInteger g = new AtomicInteger();
    private final boolean h;
    private final boolean i;
    private Optional j;

    public adde(vxz vxzVar, tqj tqjVar, Map map, nuc nucVar, Optional optional, Optional optional2) {
        this.a = vxzVar;
        this.e = tqjVar;
        this.f = nucVar;
        this.j = Optional.empty();
        Boolean bool = Boolean.FALSE;
        this.h = ((Boolean) optional.orElse(bool)).booleanValue();
        this.i = ((Boolean) optional2.orElse(bool)).booleanValue();
        this.j = Collection.EL.stream(((agpn) map).values()).map(new ygi(9)).filter(new ztt(2)).findFirst();
    }

    private final void b(adau adauVar, xgz xgzVar) {
        adauVar.s(new addc(this, adauVar, xgzVar));
    }

    private static boolean f(long j, amec amecVar) {
        return (j & ((long) amecVar.i)) > 0;
    }

    private static void g(amud amudVar, int i) {
        aldf aldfVar = amudVar.f;
        if (aldfVar == null) {
            aldfVar = aldf.a;
        }
        long j = aldfVar.b;
    }

    @Override // defpackage.nvq
    public final aigw a() {
        return amuj.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, nti] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, ntp] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, nti] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, ntp] */
    @Override // defpackage.nvs
    public final /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        amud amudVar;
        long j;
        adau adauVar;
        long j2;
        Optional optionalOf;
        Optional optionalEmpty;
        boolean z;
        boolean z2 = ntqVar instanceof adau;
        amuj amujVar = (amuj) obj;
        if (!z2) {
            ((agrc) ((agrc) c.c()).k("com/google/android/libraries/youtube/rendering/elements/converters/properties/LoggingPropertiesConverterFlat", "apply", 127, "LoggingPropertiesConverterFlat.java")).t("Missing YouTube element builder!");
            return;
        }
        adau adauVar2 = (adau) ntqVar;
        aihl aihlVar = amui.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        amujVar.c(aihlVarCheckIsLite);
        boolean zN = amujVar.j.n(aihlVarCheckIsLite.d);
        if (zN) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            amujVar.c(aihlVarCheckIsLite2);
            Object objK = amujVar.j.k(aihlVarCheckIsLite2.d);
            amudVar = (amud) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            amudVar = amud.b;
        }
        if (this.a.l(158, 45751127L, false)) {
            asnu asnuVarD = nslVar.d();
            String str = "";
            if (asnuVarD != null && (asnuVarD.b & 1) != 0) {
                asnw asnwVar = asnuVarD.c;
                if (asnwVar == null) {
                    asnwVar = asnw.a;
                }
                if ((asnwVar.c & 1) != 0) {
                    asnw asnwVar2 = asnuVarD.c;
                    if (asnwVar2 == null) {
                        asnwVar2 = asnw.a;
                    }
                    str = asnwVar2.d;
                }
            }
            aihh aihhVar = (aihh) asnw.a.createBuilder();
            if (!str.isEmpty()) {
                aihhVar.copyOnWrite();
                asnw asnwVar3 = (asnw) aihhVar.instance;
                str.getClass();
                asnwVar3.c |= 1;
                asnwVar3.d = str;
            }
            aihf aihfVarCreateBuilder = arns.a.createBuilder();
            if (zN) {
                aihfVarCreateBuilder.copyOnWrite();
                arns arnsVar = (arns) aihfVarCreateBuilder.instance;
                amudVar.getClass();
                arnsVar.e = amudVar;
                arnsVar.c |= 2;
            }
            aihhVar.e(arns.b, (arns) aihfVarCreateBuilder.build());
            asnu asnuVarAH = ksy.aH((asnw) aihhVar.build(), null, nslVar, null);
            if (asnuVarAH != null) {
                ntqVar.d(asnuVarAH);
                adfx adfxVarI = nslVar.i();
                if (adfxVarI != null) {
                    Object[] objArr = {asnuVarAH};
                    aguu.j(objArr, 1);
                    adfxVarI.e(new agpi(objArr, 1));
                    return;
                }
                return;
            }
            return;
        }
        if (!z2) {
            ((agrc) ((agrc) c.c()).k("com/google/android/libraries/youtube/rendering/elements/converters/properties/LoggingPropertiesConverterFlat", "apply", 197, "LoggingPropertiesConverterFlat.java")).t("Missing YouTube element builder!");
            return;
        }
        xgj xgjVar = zN ? new xgj(amudVar) : new xgj(amujVar.c, (amud) null);
        if (!zN) {
            b(adauVar2, xgjVar);
            return;
        }
        if ((amudVar.c & 2) != 0) {
            argh arghVar = amudVar.e;
            if (arghVar == null) {
                arghVar = argh.a;
            }
            j = arghVar.c;
        } else {
            j = 0;
        }
        if ((amudVar.c & 64) != 0) {
            if (this.j.isEmpty()) {
                optionalOf = Optional.empty();
                adauVar = adauVar2;
                j2 = j;
            } else {
                j2 = j;
                AtomicReference atomicReference = nslVar.A;
                if (atomicReference == null) {
                    optionalEmpty = Optional.empty();
                    adauVar = adauVar2;
                } else {
                    nrt nrtVarD = nrv.d();
                    nrtVarD.f = adauVar2;
                    nrtVarD.b(nslVar);
                    nrtVarD.g = nslVar.x;
                    nrv nrvVarA = nrtVarD.a();
                    abfv abfvVar = (abfv) this.j.get();
                    aihf aihfVarCreateBuilder2 = albl.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    albl alblVar = (albl) aihfVarCreateBuilder2.instance;
                    amudVar.getClass();
                    alblVar.d = amudVar;
                    alblVar.c |= 1;
                    mnl mnlVarE = abfvVar.e(aihfVarCreateBuilder2.build(), nrvVarA);
                    if (mnlVarE == null) {
                        optionalEmpty = Optional.empty();
                        adauVar = adauVar2;
                    } else {
                        AtomicInteger atomicInteger = this.g;
                        adauVar = adauVar2;
                        j2 = j2;
                        optionalOf = Optional.of(new mpt(atomicReference, Arrays.asList(mnlVarE), d + atomicInteger.incrementAndGet(), this.f, nslVar, 431803212, false, this.i));
                    }
                }
                optionalOf = optionalEmpty;
            }
            int i = 9;
            if (j2 > 0) {
                if (f(j2, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN)) {
                    acrj acrjVar = new acrj(adauVar, i);
                    if (true == optionalOf.isPresent()) {
                        ((ntg) acrjVar.a).s(optionalOf.get());
                    }
                }
                if (f(j2, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN)) {
                    z = true;
                    addb addbVar = new addb(adauVar, 1);
                    if (true == optionalOf.isPresent()) {
                        ((ntg) addbVar.a).l(optionalOf.get());
                    }
                } else {
                    z = true;
                }
                addb addbVar2 = new addb(adauVar, 0);
                if (z == optionalOf.isPresent()) {
                    ((ntg) addbVar2.a).j((mpt) optionalOf.get());
                }
            } else {
                acrj acrjVar2 = new acrj(adauVar, i);
                if (true == optionalOf.isPresent()) {
                    ((ntg) acrjVar2.a).s(optionalOf.get());
                }
                addb addbVar3 = new addb(adauVar, 1);
                if (true == optionalOf.isPresent()) {
                    ((ntg) addbVar3.a).l(optionalOf.get());
                }
                addb addbVar4 = new addb(adauVar, 0);
                if (true == optionalOf.isPresent()) {
                    ((ntg) addbVar4.a).j((mpt) optionalOf.get());
                }
            }
        } else {
            adauVar = adauVar2;
            j2 = j;
        }
        if (this.h) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            amujVar.c(aihlVarCheckIsLite3);
            Object objK2 = amujVar.j.k(aihlVarCheckIsLite3.d);
            amud amudVar2 = (amud) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
            g(amudVar2, 2);
            g(amudVar2, SemanticState.ReadOnly);
            g(amudVar2, 64);
        }
        tqj tqjVar = this.e;
        int i2 = tqr.a;
        if (tqjVar.k(1073828948) || j2 <= 0) {
            b(adauVar, xgjVar);
            adauVar.l(new addd(adauVar, xgjVar));
            return;
        }
        if (f(j2, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN)) {
            b(adauVar, xgjVar);
        }
        if (f(j2, amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN)) {
            adauVar.l(new addd(adauVar, xgjVar));
        }
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        throw null;
    }
}
