package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ugm implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ugm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, vtm] */
    /* JADX WARN: Type inference failed for: r12v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v54, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v67, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v69, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v85, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, zvl] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        asjv asjvVar;
        agev agevVarI;
        Object objInvoke;
        switch (this.$cid) {
            case 0:
                obj.getClass();
                return this.a.invoke(obj);
            case 1:
                return a.m(this.a, obj);
            case 2:
                agke agkeVar = (agke) obj;
                agkeVar.getClass();
                agjz agjzVar = new agjz(4);
                agqs agqsVarListIterator = agkeVar.listIterator(0);
                agqsVarListIterator.getClass();
                while (agqsVarListIterator.hasNext()) {
                    E next = agqsVarListIterator.next();
                    next.getClass();
                    uzj uzjVar = (uzj) next;
                    if (uzjVar.a != null) {
                        aiie<apsr> aiieVar = uzjVar.b.d;
                        aiieVar.getClass();
                        if (!aiieVar.isEmpty()) {
                            for (apsr apsrVar : aiieVar) {
                                qvk qvkVarFt = yno.ft(uzjVar);
                                if (qvkVarFt != null) {
                                    aaok aaokVar = (aaok) this.a;
                                    agjzVar.h(aaokVar.an(aaokVar.am(apsrVar, uzjVar, qvkVarFt)));
                                }
                            }
                        }
                    }
                }
                agke agkeVarG = agjzVar.g();
                agkeVarG.getClass();
                return agkeVarG;
            case 3:
                agke agkeVar2 = (agke) obj;
                if (agkeVar2.isEmpty()) {
                    return Optional.empty();
                }
                Object obj2 = this.a;
                uzj uzjVar2 = (uzj) agkeVar2.get(0);
                if (uzjVar2 == null || uzjVar2.a == null || (asjvVar = uzjVar2.b) == null) {
                    return Optional.empty();
                }
                aiie aiieVar2 = asjvVar.d;
                aiieVar2.getClass();
                if (aiieVar2.isEmpty()) {
                    return Optional.empty();
                }
                aaok aaokVar2 = ((ulp) obj2).O;
                if (aiieVar2.size() > 1) {
                    ?? r1 = aaokVar2.b;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                    zvjVarA.j = 40;
                    zvjVarA.d("[ShortsCreation][Android][Edit] Resolved AppliedEffectInfo had more than one effect ID. Ignoring all except first.");
                    r1.a(zvjVarA.a());
                }
                apsr apsrVar2 = (apsr) aiieVar2.get(0);
                qvk qvkVarFt2 = yno.ft(uzjVar2);
                if (qvkVarFt2 != null) {
                    return Optional.of(aaokVar2.an(aaokVar2.am(apsrVar2, uzjVar2, qvkVarFt2)));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 4:
                Optional optionalOfNullable = (Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((ukq) optionalOfNullable.get()).a);
                }
                Optional optional = optionalOfNullable;
                umf umfVar = (umf) this.a;
                ume umeVar = umfVar.f;
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional optional2 = umeVar.a;
                Optional optional3 = umeVar.b;
                Optional optional4 = umeVar.c;
                Optional optional5 = umeVar.d;
                Optional optional6 = umeVar.f;
                if (optional != null) {
                    return Boolean.valueOf(umfVar.n(new ume(optional2, optional3, optional4, optional5, optional, optional6)));
                }
                throw new NullPointerException("Null mediaCompositionManager");
            case 5:
                zvp.a(zvn.b, zvm.M, "[ShortsCreation][Android][Effect]Error restoring xeno AAS effect selection for entity " + ((Throwable) obj).getMessage() + '.');
                return Integer.valueOf(((AtomicInteger) this.a).decrementAndGet());
            case 6:
                vat vatVar = (vat) this.a;
                return Boolean.valueOf(vatVar.f.b((agkz) obj, ((vbf) vatVar.e.io()).a()));
            case 7:
                axfd axfdVar = (axfd) this.a;
                ?? r0 = axfdVar.e;
                vun vunVar = (vun) obj;
                agkz agkzVarA = r0.a();
                vun vunVar2 = vun.d;
                if (vunVar != vunVar2) {
                    agev agevVarK = axfd.K(r0.f(), agkzVarA);
                    if (agevVarK.g()) {
                        return agevVarK.c();
                    }
                }
                int iOrdinal = vunVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return vun.c;
                }
                if (iOrdinal != 2) {
                    return vunVar2;
                }
                return axfdVar.J(agkzVarA) ? vun.b : vun.a;
            case 8:
                Object[] objArr = (Object[]) obj;
                vus vusVar = (vus) objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                int iIntValue2 = ((Integer) objArr[2]).intValue();
                int iIntValue3 = ((Integer) objArr[3]).intValue();
                int iIntValue4 = ((Integer) objArr[4]).intValue();
                Object obj3 = objArr[5];
                if (obj3 instanceof agev) {
                    agev agevVar = (agev) obj3;
                    if (agevVar.g() && (agevVar.c() instanceof Boolean)) {
                        agevVarI = agev.i((Boolean) agevVar.c());
                    } else {
                        agevVarI = agdf.a;
                    }
                } else {
                    agevVarI = agdf.a;
                }
                return vuk.d((vua) this.a, vusVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, agevVarI);
            case 9:
                int i = vuu.h;
                return ((Boolean) obj).booleanValue() ? this.a : avlh.w();
            case 10:
                akww akwwVar = ((alik) obj).v;
                Object obj4 = this.a;
                if (akwwVar == null) {
                    akwwVar = akww.a;
                }
                akwwVar.getClass();
                akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(45384884L);
                aigj aigjVar = akwxVar != null ? akwxVar.b == 5 ? (aigj) akwxVar.c : aigj.d : null;
                vye vyeVar = vye.a;
                aink ainkVar = aink.a;
                if (aigjVar != null) {
                    try {
                        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                        generatedRegistry.getClass();
                        objInvoke = vyeVar.invoke(aigjVar, generatedRegistry);
                    } catch (aiik e) {
                        twu.d("ExperimentFlagUtil", 6, "Unable to parse proto typed experiment flag: ".concat(String.valueOf(e.getMessage())), null);
                        try {
                            aigj aigjVarV = aigj.v((byte[]) obj4);
                            aigjVarV.getClass();
                            ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                            generatedRegistry2.getClass();
                            objInvoke = vyeVar.invoke(aigjVarV, generatedRegistry2);
                        } catch (aiik e2) {
                            twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e2.getMessage())), null);
                            objInvoke = ainkVar;
                        }
                    }
                    break;
                } else {
                    aigj aigjVarV2 = aigj.v((byte[]) obj4);
                    aigjVarV2.getClass();
                    ExtensionRegistryLite generatedRegistry3 = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry3.getClass();
                    objInvoke = vyeVar.invoke(aigjVarV2, generatedRegistry3);
                    break;
                }
                objInvoke.getClass();
                return objInvoke;
            case 11:
                obj.getClass();
                return this.a.invoke(obj);
            case 12:
                obj.getClass();
                return this.a.invoke(obj);
            case 13:
                wff wffVar = (wff) obj;
                aaun aaunVar = new aaun();
                aaunVar.d((String) this.a);
                aaunVar.b = wffVar.b;
                aaunVar.c(wffVar.c);
                return aaunVar.b();
            case 14:
                Throwable th = (Throwable) obj;
                boolean z = th instanceof ExecutionException;
                Object obj5 = this.a;
                if (z) {
                    ((wvn) obj5).d(22);
                } else if (th instanceof InterruptedException) {
                    ((wvn) obj5).d(21);
                }
                return agdf.a;
            case 15:
                obj.getClass();
                return this.a.invoke(obj);
            case 16:
                int i2 = xll.p;
                obj.getClass();
                return this.a.invoke(obj);
            case 17:
                agev agevVar2 = (agev) obj;
                if (agevVar2.g()) {
                    Object objC = agevVar2.c();
                    if (objC instanceof ajoz) {
                        xun xunVar = (xun) this.a;
                        ajpb ajpbVar = xunVar.h.a;
                        ajpb awarenessState = ((ajoz) objC).getAwarenessState();
                        if (xunVar.l.l(181, 45707413L, false)) {
                            Optional optional7 = (Optional) xunVar.k.getAndSet(Optional.empty());
                            if (!optional7.isEmpty() && Duration.between((Instant) optional7.get(), xunVar.f.f()).compareTo(xun.b) < 0) {
                                ((qtf) xunVar.e.h.io()).b(1L, ajpbVar.name(), awarenessState.name());
                            }
                        }
                        return avlh.G(awarenessState);
                    }
                }
                return avlh.G(ajpb.CAST_ICON_AWARENESS_STATE_UNSPECIFIED);
            case 18:
                return Boolean.valueOf(((xun) this.a).d.p());
            case 19:
                int i3 = ybk.f;
                obj.getClass();
                return this.a.invoke(obj);
            default:
                return tzk.c(((yqo) this.a).r.h((alup) obj)).k();
        }
    }
}
