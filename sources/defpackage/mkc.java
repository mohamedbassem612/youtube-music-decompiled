package defpackage;

import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.AutocropConfigOuterClass$AutocropConfig;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mkc implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mkc(abpd abpdVar, abri abriVar, yrr yrrVar, int i) {
        this.$cid = i;
        this.c = abpdVar;
        this.b = abriVar;
        this.a = yrrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r11v63, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, nsr] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = 2;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                Pair pair = (Pair) obj;
                String str = mkh.a;
                asms asmsVar = (asms) pair.first;
                omj omjVar = (omj) pair.second;
                Object obj2 = this.a;
                nrt nrtVarD = nrv.d();
                View view = (View) obj2;
                nrtVarD.d(view);
                nrtVarD.g = ((nsl) this.b).x;
                nrtVarD.k = 0;
                if (obj2 instanceof EditText) {
                    aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                    aihl aihlVar = asmt.b;
                    aihf aihfVarCreateBuilder = asmt.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    asmt asmtVar = (asmt) aihfVarCreateBuilder.instance;
                    asmsVar.getClass();
                    asmtVar.h = asmsVar;
                    asmtVar.c |= 32;
                    boolean zIsFocused = view.isFocused();
                    aihfVarCreateBuilder.copyOnWrite();
                    asmt asmtVar2 = (asmt) aihfVarCreateBuilder.instance;
                    asmtVar2.c |= 8;
                    asmtVar2.f = zIsFocused;
                    int selectionEnd = ((EditText) obj2).getSelectionEnd();
                    aihfVarCreateBuilder.copyOnWrite();
                    asmt asmtVar3 = (asmt) aihfVarCreateBuilder.instance;
                    asmtVar3.c |= 2;
                    asmtVar3.e = selectionEnd;
                    aihhVar.e(aihlVar, (asmt) aihfVarCreateBuilder.build());
                    nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
                }
                return this.c.a(omjVar.x(), nrtVarD.a());
            case 1:
                agke agkeVar = (agke) agyz.b((agkj) obj).a(new ito(this.b, 1)).map(new aegf(11)).filter(new acwb(7)).collect(aghu.a);
                return agkeVar.isEmpty() ? avlb.e() : ((hsd) this.a).o.k(this.c).c(new hbn(agkeVar, 18));
            case 2:
                nwl nwlVar = (nwl) obj;
                nry nryVar = (nry) ((mge) this.a).b.io();
                askm askmVar = ((asmr) this.b).d;
                if (askmVar == null) {
                    askmVar = askm.a;
                }
                try {
                    axoz axozVarA = EkoProcessor.a(askmVar.toByteArray(), mqx.a(nwlVar).a);
                    Object obj3 = axozVarA.b;
                    if (((Status) obj3).e()) {
                        Object obj4 = axozVarA.a;
                        obj4.getClass();
                        return nryVar.c((CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, (byte[]) obj4, ExtensionRegistryLite.getGeneratedRegistry()), (nrv) this.c, 1);
                    }
                    throw new nud("Eko processor error: " + ((Status) obj3).getDescription());
                } catch (IOException e) {
                    throw new nud("Invalid eko template in DynamicEntitiesCommandHandler", e);
                }
            case 3:
                aihh aihhVar2 = (aihh) asoq.a.createBuilder();
                aihl aihlVar2 = asmu.b;
                aihf aihfVarCreateBuilder2 = asmu.a.createBuilder();
                Object obj5 = this.b;
                asmr asmrVar = (asmr) obj5;
                askm askmVar2 = asmrVar.d;
                if (askmVar2 == null) {
                    askmVar2 = askm.a;
                }
                aigj byteString = askmVar2.toByteString();
                aihfVarCreateBuilder2.copyOnWrite();
                asmu asmuVar = (asmu) aihfVarCreateBuilder2.instance;
                asmuVar.c |= 1;
                asmuVar.d = byteString;
                aihhVar2.e(aihlVar2, (asmu) aihfVarCreateBuilder2.build());
                asoq asoqVar = (asoq) aihhVar2.build();
                asop asopVar = asmrVar.c;
                if (asopVar == null) {
                    asopVar = asop.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(asmg.b);
                asopVar.c(aihlVarCheckIsLite);
                Object objK = asopVar.j.k(aihlVarCheckIsLite.d);
                int i2 = ((asmg) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d;
                aihf aihfVarCreateBuilder3 = asma.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                asma asmaVar = (asma) aihfVarCreateBuilder3.instance;
                asoqVar.getClass();
                asmaVar.d = asoqVar;
                asmaVar.c |= 2;
                asop asopVar2 = asmrVar.c;
                if (asopVar2 == null) {
                    asopVar2 = asop.a;
                }
                aihfVarCreateBuilder3.copyOnWrite();
                asma asmaVar2 = (asma) aihfVarCreateBuilder3.instance;
                asopVar2.getClass();
                asmaVar2.f = asopVar2;
                asmaVar2.c |= 16;
                try {
                    byte[] bArr = new byte[6];
                    aigs aigsVarO = aigs.O(bArr);
                    ((aigo) aigsVarO).y((i2 << 3) | 2);
                    aigsVarO.y(0);
                    aigsVarO.d();
                    try {
                        asnx asnxVar = (asnx) aihn.parseFrom(asnx.a, bArr);
                        aihfVarCreateBuilder3.copyOnWrite();
                        asma asmaVar3 = (asma) aihfVarCreateBuilder3.instance;
                        asnxVar.getClass();
                        asmaVar3.e = asnxVar;
                        asmaVar3.c |= 8;
                        Object obj6 = this.c;
                        Object obj7 = this.a;
                        final asma asmaVar4 = (asma) aihfVarCreateBuilder3.build();
                        final ?? r1 = ((mge) obj7).a;
                        return avlr.q(new Callable() { // from class: mqv
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                asmg asmgVar;
                                int i3;
                                int i4;
                                int i5;
                                asma asmaVar5 = asmaVar4;
                                asnx asnxVar2 = asmaVar5.e;
                                if (asnxVar2 == null) {
                                    asnxVar2 = asnx.a;
                                }
                                nwl nwlVarB = nwl.b(asnxVar2);
                                if ((asmaVar5.c & 16) == 0) {
                                    return new awli(nwlVarB);
                                }
                                asop asopVar3 = asmaVar5.f;
                                if (asopVar3 == null) {
                                    asopVar3 = asop.a;
                                }
                                aihl aihlVar3 = asmg.b;
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar3);
                                asopVar3.c(aihlVarCheckIsLite2);
                                asnf asnfVar = null;
                                if (asopVar3.j.n(aihlVarCheckIsLite2.d)) {
                                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar3);
                                    asopVar3.c(aihlVarCheckIsLite3);
                                    Object objK2 = asopVar3.j.k(aihlVarCheckIsLite3.d);
                                    asmgVar = (asmg) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                                } else {
                                    asmgVar = null;
                                }
                                aihl aihlVar4 = asnf.b;
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar4);
                                asopVar3.c(aihlVarCheckIsLite4);
                                if (asopVar3.j.n(aihlVarCheckIsLite4.d)) {
                                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar4);
                                    asopVar3.c(aihlVarCheckIsLite5);
                                    Object objK3 = asopVar3.j.k(aihlVarCheckIsLite5.d);
                                    asnfVar = (asnf) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                                }
                                if (asmgVar == null) {
                                    if (asnfVar == null) {
                                        return new awli(nwlVarB);
                                    }
                                } else if (asnfVar != null && (i3 = asmgVar.d) != (i4 = asnfVar.c)) {
                                    throw new nud(a.bQ(i4, i3, "ComponentType dataStoreSubscriptionConfig.resultField=", ", environmentSubscriptionConfig.resultField="));
                                }
                                agkh agkhVar = new agkh(4);
                                if (asmgVar != null) {
                                    i5 = asmgVar.d;
                                    agkh agkhVar2 = new agkh(4);
                                    for (asmh asmhVar : asmgVar.c) {
                                        if ((asmhVar.b & 1) != 0) {
                                            agkhVar2.e(asmhVar.c, Integer.valueOf(asmhVar.d));
                                        }
                                    }
                                    agkhVar.i(agkhVar2.d(true));
                                } else {
                                    i5 = 0;
                                }
                                if (asnfVar != null) {
                                    i5 = asnfVar.c;
                                    agkhVar.i(agkj.j("/environment", Integer.valueOf(asnfVar.d)));
                                }
                                mqx mqxVarA = mqx.a(nwlVarB);
                                agkj agkjVarD = agkhVar.d(true);
                                if (agkjVarD.isEmpty()) {
                                    return new awli(mqxVarA.b(i5));
                                }
                                try {
                                    agkh agkhVar3 = new agkh(4);
                                    HashMap map = new HashMap();
                                    aigm aigmVarM = aigm.M(mqxVarA.a);
                                    while (!aigmVarM.D()) {
                                        int iN = aigmVarM.n();
                                        int i6 = iN >>> 3;
                                        if ((iN & 7) == 2) {
                                            map.put(Integer.valueOf(i6), aigmVarM.G());
                                        } else {
                                            aigmVarM.F(iN);
                                        }
                                    }
                                    agqr it = agkjVarD.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        String str2 = (String) entry.getKey();
                                        Integer num = (Integer) entry.getValue();
                                        num.intValue();
                                        byte[] bArr2 = (byte[]) map.get(num);
                                        if (bArr2 == null) {
                                            bArr2 = nty.a;
                                        }
                                        agkhVar3.e(str2, bArr2);
                                    }
                                    agkj agkjVarD2 = agkhVar3.d(true);
                                    agkz agkzVarKeySet = agkjVarD.keySet();
                                    ArrayList arrayList = new ArrayList(agkzVarKeySet.size());
                                    agqr it2 = ((agpl) agkzVarKeySet).iterator();
                                    while (it2.hasNext()) {
                                        nsr nsrVar = r1;
                                        String str3 = (String) it2.next();
                                        arrayList.add(nsrVar.a(str3).K(new ibj(str3, 15)));
                                    }
                                    return avlr.i(arrayList, new avnz(agkjVarD2, 1)).K(new mqw(i5, agkjVarD, mqxVarA));
                                } catch (IOException e2) {
                                    throw new nud("Failed to process default model", e2);
                                }
                            }
                        }).an(nwl.b).c(new mkc(obj7, obj5, obj6, i));
                    } catch (aiik e2) {
                        throw new nud("Invalid model in DynamicEntitiesCommandHandler", e2);
                    }
                } catch (IOException e3) {
                    throw new nud("Invalid model creation in DynamicEntitiesCommandHandler", e3);
                }
            case 4:
                avlq avlqVar = (avlq) obj;
                Object obj8 = avlqVar.b;
                Object obj9 = this.b;
                ?? r2 = this.c;
                Object objA = this.a;
                if (obj8 == null) {
                    asny asnyVar = (asny) obj9;
                    if ((asnyVar.c & 4) == 0) {
                        return avlb.e();
                    }
                    CommandOuterClass$Command defaultInstance = asnyVar.f;
                    if (defaultInstance == null) {
                        defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                    }
                    return r2.c(defaultInstance, (nrv) objA, 1);
                }
                asny asnyVar2 = (asny) obj9;
                if ((asnyVar2.c & 8) == 0) {
                    return avlb.e();
                }
                CommandOuterClass$Command defaultInstance2 = asnyVar2.g;
                if (defaultInstance2 == null) {
                    defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
                }
                Throwable thC = avlqVar.c();
                if (thC != null) {
                    nrt nrtVarE = ((nrv) objA).e();
                    SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nrtVarE.e;
                    aihh aihhVar3 = senderStateOuterClass$SenderState != null ? (aihh) senderStateOuterClass$SenderState.toBuilder() : (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                    boolean z2 = thC instanceof nrs;
                    aihl aihlVar3 = asln.b;
                    Throwable cause = thC.getCause();
                    if (z2 && cause != null) {
                        thC = cause;
                    }
                    aihf aihfVarCreateBuilder4 = asln.a.createBuilder();
                    aihfVarCreateBuilder4.getClass();
                    int iHashCode = thC.getClass().getName().hashCode();
                    aihfVarCreateBuilder4.copyOnWrite();
                    asln aslnVar = (asln) aihfVarCreateBuilder4.instance;
                    aslnVar.c |= 1;
                    aslnVar.d = iHashCode;
                    aihn aihnVarBuild = aihfVarCreateBuilder4.build();
                    aihnVarBuild.getClass();
                    aihhVar3.e(aihlVar3, (asln) aihnVarBuild);
                    nrtVarE.e = (SenderStateOuterClass$SenderState) aihhVar3.build();
                    objA = nrtVarE.a();
                }
                return r2.c(defaultInstance2, (nrv) objA, 1);
            case 5:
                String str2 = rnf.a;
                ?? r11 = this.a;
                Object obj10 = this.b;
                Object obj11 = this.c;
                wer werVarE = r11.e();
                werVarE.k(rnf.a, (akvd) obj11, (byte[]) obj10);
                return werVarE.b();
            case 6:
                xos xosVar = (xos) obj;
                avmf avmfVarT = xosVar.a;
                algr algrVar = (algr) this.c;
                if (algrVar.b) {
                    Object obj12 = this.b;
                    agrx agrxVar = agso.a;
                    String str3 = (String) obj12;
                    if (str3.isEmpty()) {
                        avmfVarT = avmc.t(Boolean.FALSE);
                    } else {
                        xot xotVar = (xot) this.a;
                        if (xotVar.e.a(str3, xotVar.d).isPresent()) {
                            avmfVarT = avmc.t(Boolean.TRUE);
                        }
                    }
                } else {
                    avmfVarT = avmc.t(Boolean.TRUE);
                }
                avmf avmfVarT2 = xosVar.b;
                if (!algrVar.f) {
                    avmfVarT2 = avmc.t(Boolean.TRUE);
                }
                return avmc.f(avlh.A(avmfVarT, avmfVarT2)).ah(new sqj(20));
            case 7:
                wep wepVar = (wep) obj;
                amtc amtcVar = (amtc) wepVar.a;
                wej wejVar = wepVar.b;
                String str4 = ((amsz) this.b).f;
                Set setE = aaje.e(wejVar);
                if (setE.contains(str4)) {
                    return avlm.q(amtcVar);
                }
                ?? r3 = this.a;
                Object obj13 = this.c;
                setE.add(str4);
                wer werVarE2 = r3.e();
                werVarE2.i(amtcVar.b(), aaje.a(setE, wejVar));
                return werVarE2.d().v(((aakk) obj13).a).y(avlm.q(amtcVar));
            case 8:
                Optional optionalOfNullable = Optional.ofNullable(((aayw) obj).c);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((wjf) optionalOfNullable.get()).f());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((wiu) optionalOfNullable.get()).d);
                }
                if (true == optionalOfNullable.isPresent() && (((aoqd) optionalOfNullable.get()).c & Integer.MIN_VALUE) == 0) {
                    optionalOfNullable = Optional.empty();
                }
                if (true == optionalOfNullable.isPresent()) {
                    AutocropConfigOuterClass$AutocropConfig autocropConfigOuterClass$AutocropConfig = ((aoqd) optionalOfNullable.get()).K;
                    if (autocropConfigOuterClass$AutocropConfig == null) {
                        autocropConfigOuterClass$AutocropConfig = AutocropConfigOuterClass$AutocropConfig.a;
                    }
                    optionalOfNullable = Optional.ofNullable(autocropConfigOuterClass$AutocropConfig);
                }
                Optional optionalOfNullable2 = true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(Boolean.valueOf(((AutocropConfigOuterClass$AutocropConfig) optionalOfNullable.get()).c));
                Object obj14 = this.a;
                boolean zBooleanValue = ((Boolean) optionalOfNullable2.orElse(Boolean.FALSE)).booleanValue();
                if (!optionalOfNullable.isPresent()) {
                    z = zBooleanValue;
                } else if (!zBooleanValue) {
                    ((zkt) obj14).f = (aazu) this.c;
                    return (AutocropConfigOuterClass$AutocropConfig) optionalOfNullable.get();
                }
                Object obj15 = this.b;
                ((zkt) obj14).f = null;
                ((xsc) obj15).w(new aazt(null, z));
                return AutocropConfigOuterClass$AutocropConfig.a;
            default:
                return ((abpd) this.c).d((abri) this.b, (yrr) this.a, (wjf) obj, null);
        }
    }

    public /* synthetic */ mkc(asny asnyVar, nry nryVar, nrv nrvVar, int i) {
        this.$cid = i;
        this.b = asnyVar;
        this.c = nryVar;
        this.a = nrvVar;
    }

    public /* synthetic */ mkc(Object obj, aihn aihnVar, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = aihnVar;
        this.b = obj2;
    }

    public /* synthetic */ mkc(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mkc(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
