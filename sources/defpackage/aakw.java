package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakw implements aant {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final ScheduledExecutorService d;
    public final aanb e;
    public final vxz f;
    private final wco g;
    private aans h = null;
    private aans i = null;

    public aakw(aanb aanbVar, ScheduledExecutorService scheduledExecutorService, wco wcoVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar) {
        this.e = aanbVar;
        this.d = scheduledExecutorService;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.g = wcoVar;
        this.f = vxzVar;
    }

    public static final agke e(agke agkeVar, alub alubVar, aanp[] aanpVarArr) {
        Set set;
        aanp aanpVarA;
        int i = 0;
        if (alubVar != null) {
            aghn aghnVar = new aghn(null);
            for (aofh aofhVar : alubVar.c) {
                aghnVar.u(wfs.c(aofhVar.d), aofhVar);
            }
            Set<wfn> setQ = aghnVar.q();
            while (i < aanpVarArr.length) {
                if (aanpVarArr[i] != null) {
                    set = setQ;
                } else {
                    aofh aofhVar2 = (aofh) agkeVar.get(i);
                    wfn wfnVarC = wfs.c(aofhVar2.d);
                    ArrayList arrayList = new ArrayList();
                    for (wfn wfnVar : setQ) {
                        if (wfnVar.a.equals(wfnVarC.a)) {
                            for (aofh aofhVar3 : aghnVar.c(wfnVar)) {
                                if (wfnVar.b == 120) {
                                    aofg aofgVar = aofhVar2.e;
                                    if (aofgVar == null) {
                                        aofgVar = aofg.b;
                                    }
                                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
                                    aofgVar.c(aihlVarCheckIsLite);
                                    Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
                                    aoom aoomVar = (aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                                    aofg aofgVar2 = aofhVar3.e;
                                    if (aofgVar2 == null) {
                                        aofgVar2 = aofg.b;
                                    }
                                    aihh aihhVar = (aihh) aofgVar2.toBuilder();
                                    if ((aoomVar.c & SemanticState.Modal) != 0) {
                                        aihl aihlVar = aqpb.b;
                                        aihf builder = ((aqpb) aihhVar.b(aihlVar)).toBuilder();
                                        int iAS = a.aS(aoomVar.l);
                                        if (iAS == 0) {
                                            iAS = 1;
                                        }
                                        builder.copyOnWrite();
                                        aqpb aqpbVar = (aqpb) builder.instance;
                                        aqpbVar.j = iAS - 1;
                                        aqpbVar.c |= SemanticState.Hidden;
                                        aihhVar.e(aihlVar, (aqpb) builder.build());
                                    }
                                    aofg aofgVar3 = aofhVar2.e;
                                    if (((aofgVar3 == null ? aofg.b : aofgVar3).c & 2) != 0) {
                                        if (aofgVar3 == null) {
                                            aofgVar3 = aofg.b;
                                        }
                                        aofa aofaVar = aofgVar3.g;
                                        if (aofaVar == null) {
                                            aofaVar = aofa.a;
                                        }
                                        aihhVar.copyOnWrite();
                                        aofg aofgVar4 = (aofg) aihhVar.instance;
                                        aofaVar.getClass();
                                        aofgVar4.g = aofaVar;
                                        aofgVar4.c |= 2;
                                    }
                                    aihf builder2 = aofhVar3.toBuilder();
                                    builder2.copyOnWrite();
                                    aofh aofhVar4 = (aofh) builder2.instance;
                                    aofg aofgVar5 = (aofg) aihhVar.build();
                                    aofgVar5.getClass();
                                    aofhVar4.e = aofgVar5;
                                    aofhVar4.b |= 4;
                                    arrayList.add((aofh) builder2.build());
                                    setQ = setQ;
                                } else {
                                    arrayList.add(aofhVar3);
                                }
                            }
                        }
                    }
                    set = setQ;
                    if (arrayList.isEmpty()) {
                        aanpVarA = aanp.a;
                    } else {
                        aano aanoVar = new aano(aanp.a);
                        aanoVar.b(agke.n(arrayList));
                        aanpVarA = aanoVar.a();
                    }
                    aanpVarArr[i] = aanpVarA;
                }
                i++;
                setQ = set;
            }
        } else {
            aano aanoVar2 = new aano(aanp.c);
            aanoVar2.d = 4;
            aanp aanpVarA2 = aanoVar2.a();
            while (i < aanpVarArr.length) {
                if (aanpVarArr[i] == null) {
                    aanpVarArr[i] = aanpVarA2;
                }
                i++;
            }
        }
        return agke.p(aanpVarArr);
    }

    private final ListenableFuture f(final zwa zwaVar, final agke agkeVar) {
        final aanp[] aanpVarArr = new aanp[((agpi) agkeVar).d];
        ListenableFuture listenableFutureH = h(zwaVar, (agkz) Collection.EL.stream(agkeVar).map(new aakc(5)).collect(aghu.b));
        ahcy ahcyVar = new ahcy() { // from class: aaku
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                aakw aakwVar;
                Optional optionalEmpty;
                int i;
                aofb aofbVarD;
                aohk aohkVarE;
                agkj agkjVar = (agkj) obj;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                aigj aigjVar = null;
                while (true) {
                    agke agkeVar2 = agkeVar;
                    aakwVar = this.a;
                    if (i2 >= ((agpi) agkeVar2).d) {
                        break;
                    }
                    aofh aofhVar = (aofh) agkeVar2.get(i2);
                    String str = aofhVar.d;
                    aofg aofgVar = aofhVar.e;
                    if (aofgVar == null) {
                        aofgVar = aofg.b;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
                    aofgVar.c(aihlVarCheckIsLite);
                    Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
                    aoom aoomVar = (aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    aoop aoopVar = (aoop) agkjVar.get(str);
                    aqph aqphVarH = aoopVar != null ? aoopVar.h() : null;
                    if (aoopVar == null || aqphVarH == null || aqphVarH.getTransferState() == aqpc.TRANSFER_STATE_FAILED || aoomVar.g) {
                        aohx aohxVarA = aohx.a(aoomVar.e);
                        if (aohxVarA == null) {
                            aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
                        }
                        String str2 = aoomVar.f;
                        aihf aihfVarCreateBuilder = alud.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        alud aludVar = (alud) aihfVarCreateBuilder.instance;
                        aludVar.c = aohxVarA.l;
                        aludVar.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        alud aludVar2 = (alud) aihfVarCreateBuilder.instance;
                        str2.getClass();
                        aludVar2.b |= 2;
                        aludVar2.d = str2;
                        alud aludVar3 = (alud) aihfVarCreateBuilder.build();
                        aihf aihfVarCreateBuilder2 = aluc.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aluc alucVar = (aluc) aihfVarCreateBuilder2.instance;
                        str.getClass();
                        alucVar.b |= 1;
                        alucVar.e = str;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aluc alucVar2 = (aluc) aihfVarCreateBuilder2.instance;
                        aludVar3.getClass();
                        alucVar2.f = aludVar3;
                        alucVar2.b |= 2;
                        boolean z = aoomVar.g;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aluc alucVar3 = (aluc) aihfVarCreateBuilder2.instance;
                        alucVar3.b |= 4;
                        alucVar3.g = z;
                        ((abrd) aakwVar.b.io()).hY(aihfVarCreateBuilder2);
                        ((abrd) aakwVar.c.io()).hY(aihfVarCreateBuilder2);
                        if ((aoomVar.c & SemanticState.Obscured) != 0) {
                            aigj aigjVarX = aigj.x(aoomVar.m);
                            aihfVarCreateBuilder2.copyOnWrite();
                            aluc alucVar4 = (aluc) aihfVarCreateBuilder2.instance;
                            aigjVarX.getClass();
                            alucVar4.b |= SemanticState.Focused;
                            alucVar4.l = aigjVarX;
                        }
                        if (aoomVar.g && aoopVar != null && (aohkVarE = aoopVar.e()) != null) {
                            aihf aihfVarCreateBuilder3 = altz.a.createBuilder();
                            String offlineToken = aohkVarE.getOfflineToken();
                            aihfVarCreateBuilder3.copyOnWrite();
                            altz altzVar = (altz) aihfVarCreateBuilder3.instance;
                            offlineToken.getClass();
                            altzVar.b |= 1;
                            altzVar.c = offlineToken;
                            aihfVarCreateBuilder2.copyOnWrite();
                            aluc alucVar5 = (aluc) aihfVarCreateBuilder2.instance;
                            altz altzVar2 = (altz) aihfVarCreateBuilder3.build();
                            altzVar2.getClass();
                            alucVar5.d = altzVar2;
                            alucVar5.c = 11;
                        }
                        if ((aoomVar.c & 64) != 0) {
                            int i3 = aoomVar.i;
                            aihfVarCreateBuilder2.copyOnWrite();
                            aluc alucVar6 = (aluc) aihfVarCreateBuilder2.instance;
                            alucVar6.b |= 8;
                            alucVar6.h = i3;
                        }
                        aihf aihfVarCreateBuilder4 = aogm.a.createBuilder();
                        String str3 = aoomVar.h;
                        aihfVarCreateBuilder4.copyOnWrite();
                        aogm aogmVar = (aogm) aihfVarCreateBuilder4.instance;
                        str3.getClass();
                        aogmVar.b |= 2;
                        aogmVar.d = str3;
                        if ((aoomVar.c & SemanticState.ReadOnly) != 0) {
                            aofb aofbVarA = aofb.a(aoomVar.k);
                            if (aofbVarA == null) {
                                aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
                            }
                            aihfVarCreateBuilder4.copyOnWrite();
                            aogm aogmVar2 = (aogm) aihfVarCreateBuilder4.instance;
                            aogmVar2.c = aofbVarA.i;
                            aogmVar2.b |= 1;
                            i = i2;
                        } else {
                            i = i2;
                            if (aakwVar.f.l(68, 45414885L, false) && (aofbVarD = aakwVar.d(zwaVar, str)) != aofb.OFFLINE_TYPE_UNKNOWN) {
                                aihfVarCreateBuilder4.copyOnWrite();
                                aogm aogmVar3 = (aogm) aihfVarCreateBuilder4.instance;
                                aogmVar3.c = aofbVarD.i;
                                aogmVar3.b |= 1;
                            }
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        aluc alucVar7 = (aluc) aihfVarCreateBuilder2.instance;
                        aogm aogmVar4 = (aogm) aihfVarCreateBuilder4.build();
                        aogmVar4.getClass();
                        alucVar7.i = aogmVar4;
                        alucVar7.b |= 16;
                        arrayList.add((aluc) aihfVarCreateBuilder2.build());
                        if (aigjVar == null) {
                            aigjVar = aoomVar.d;
                        }
                    } else {
                        aanpVarArr[i2] = aanp.a;
                        i = i2;
                    }
                    i2 = i + 1;
                }
                if (arrayList.isEmpty()) {
                    optionalEmpty = Optional.empty();
                } else {
                    aaqe aaqeVarA = ((aaqf) aakwVar.a.io()).a();
                    aaqeVarA.e(arrayList);
                    if (aigjVar == null) {
                        aigjVar = aigj.d;
                    }
                    aaqeVarA.n(aigjVar);
                    optionalEmpty = Optional.of(aaqeVarA);
                }
                vre vreVar = new vre(aakwVar, 10);
                if (true == optionalEmpty.isPresent()) {
                    Object obj2 = optionalEmpty.get();
                    aakw aakwVar2 = (aakw) vreVar.a;
                    optionalEmpty = Optional.ofNullable(((aaqf) aakwVar2.a.io()).b((aaqe) obj2, aakwVar2.d));
                }
                return (ListenableFuture) optionalEmpty.orElse(ahng.n(alub.a));
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.d;
        int i = 8;
        return afxd.f(ahno.as(listenableFutureH, ahcyVar, scheduledExecutorService)).g(new aaat(agkeVar, aanpVarArr, i, null), scheduledExecutorService).b(toe.class, new aagw(agkeVar, i), scheduledExecutorService);
    }

    private final ListenableFuture g(final zwa zwaVar, final agke agkeVar) {
        final aanp[] aanpVarArr = new aanp[((agpi) agkeVar).d];
        ListenableFuture listenableFutureH = h(zwaVar, (agkz) Collection.EL.stream(agkeVar).map(new aakc(5)).collect(aghu.b));
        agek agekVar = new agek() { // from class: aaks
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                int i;
                aanp[] aanpVarArr2;
                Optional optionalEmpty;
                boolean z;
                int i2;
                aofb aofbVarD;
                int i3;
                aanp aanpVarA;
                aaks aaksVar = this;
                aakw aakwVar = aaksVar.a;
                aanb aanbVar = aakwVar.e;
                zwa zwaVar2 = zwaVar;
                agkj agkjVar = (agkj) obj;
                Optional optionalOfNullable = Optional.ofNullable(aanbVar.h(zwaVar2));
                int i4 = 1;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((aaqn) optionalOfNullable.get()).c());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((aadc) optionalOfNullable.get()).i());
                }
                List list = (List) optionalOfNullable.orElse(agpi.a);
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                int i5 = 0;
                while (true) {
                    agke agkeVar2 = agkeVar;
                    if (i5 >= ((agpi) agkeVar2).d) {
                        break;
                    }
                    aanp[] aanpVarArr3 = aanpVarArr;
                    aofh aofhVar = (aofh) agkeVar2.get(i5);
                    String str = aofhVar.d;
                    aoop aoopVar = (aoop) agkjVar.get(str);
                    if (aoopVar == null) {
                        if (aakwVar.f.l(188, 45725418L, z2)) {
                            aanpVarA = aanp.a;
                        } else {
                            aano aanoVar = new aano(aanp.c);
                            aanoVar.d = 26;
                            aanpVarA = aanoVar.a();
                        }
                        aanpVarArr3[i5] = aanpVarA;
                        agkjVar = agkjVar;
                        i2 = i4;
                        z = z2;
                        i = i5;
                    } else {
                        aqph aqphVarH = aoopVar.h();
                        aohk aohkVarE = aoopVar.e();
                        if (aohkVarE == null || (aohkVarE.c.b & SemanticState.Hidden) == 0) {
                            i = i5;
                            aanpVarArr2 = aanpVarArr3;
                            optionalEmpty = Optional.empty();
                        } else {
                            aihf aihfVarCreateBuilder = alty.a.createBuilder();
                            int i6 = i4;
                            long jLongValue = aoopVar.getPlayerResponseTimestamp().longValue();
                            aihfVarCreateBuilder.copyOnWrite();
                            alty altyVar = (alty) aihfVarCreateBuilder.instance;
                            altyVar.b |= 1;
                            altyVar.c = jLongValue;
                            long jLongValue2 = aoopVar.getStreamDownloadTimestampSeconds().longValue();
                            aihfVarCreateBuilder.copyOnWrite();
                            alty altyVar2 = (alty) aihfVarCreateBuilder.instance;
                            altyVar2.b |= 4;
                            altyVar2.e = jLongValue2;
                            String offlineToken = aohkVarE.getOfflineToken();
                            aihfVarCreateBuilder.copyOnWrite();
                            alty altyVar3 = (alty) aihfVarCreateBuilder.instance;
                            offlineToken.getClass();
                            altyVar3.b |= 2;
                            altyVar3.d = offlineToken;
                            boolean z3 = aqphVarH == null ? i6 : 0;
                            aihfVarCreateBuilder.copyOnWrite();
                            alty altyVar4 = (alty) aihfVarCreateBuilder.instance;
                            altyVar4.b |= 16;
                            altyVar4.h = z3;
                            if (aqphVarH != null) {
                                aqpc transferState = aqphVarH.getTransferState();
                                aihfVarCreateBuilder.copyOnWrite();
                                alty altyVar5 = (alty) aihfVarCreateBuilder.instance;
                                int i7 = transferState.i;
                                altyVar5.i = i7;
                                altyVar5.b |= 32;
                                aqpc aqpcVarA = aqpc.a(i7);
                                if (aqpcVarA == null) {
                                    aqpcVarA = aqpc.TRANSFER_STATE_UNKNOWN;
                                }
                                if (aqpcVarA == aqpc.TRANSFER_STATE_FAILED) {
                                    aqpe failureReason = aqphVarH.getFailureReason();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    alty altyVar6 = (alty) aihfVarCreateBuilder.instance;
                                    altyVar6.j = failureReason.o;
                                    altyVar6.b |= 64;
                                }
                                agke agkeVarE = aqphVarH.e();
                                vxz vxzVar = aakwVar.f;
                                int i8 = i5;
                                if (vxzVar.l(244, 45852707L, false)) {
                                    int i9 = ((agpi) agkeVarE).d;
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        Iterator it = ((aohq) agkeVarE.get(i10)).getStreamsProgress().iterator();
                                        while (true) {
                                            i3 = i10 + 1;
                                            if (it.hasNext()) {
                                                aqdp aqdpVar = (aqdp) it.next();
                                                int i11 = i9;
                                                aihf aihfVarCreateBuilder2 = FormatIdOuterClass$FormatId.a.createBuilder();
                                                int i12 = i10;
                                                int i13 = aqdpVar.h;
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                Iterator it2 = it;
                                                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                                                aanp[] aanpVarArr4 = aanpVarArr3;
                                                formatIdOuterClass$FormatId.b |= 1;
                                                formatIdOuterClass$FormatId.c = i13;
                                                long j = aqdpVar.j;
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                                                int i14 = i8;
                                                formatIdOuterClass$FormatId2.b |= 2;
                                                formatIdOuterClass$FormatId2.d = j;
                                                String str2 = aqdpVar.i;
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId3 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                                                str2.getClass();
                                                formatIdOuterClass$FormatId3.b |= 4;
                                                formatIdOuterClass$FormatId3.e = str2;
                                                aihfVarCreateBuilder.copyOnWrite();
                                                alty altyVar7 = (alty) aihfVarCreateBuilder.instance;
                                                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId4 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.build();
                                                formatIdOuterClass$FormatId4.getClass();
                                                aiie aiieVar = altyVar7.g;
                                                if (!aiieVar.c()) {
                                                    altyVar7.g = aihn.mutableCopy(aiieVar);
                                                }
                                                altyVar7.g.add(formatIdOuterClass$FormatId4);
                                                i9 = i11;
                                                i10 = i12;
                                                it = it2;
                                                aanpVarArr3 = aanpVarArr4;
                                                i8 = i14;
                                            }
                                        }
                                        i10 = i3;
                                    }
                                }
                                aanpVarArr2 = aanpVarArr3;
                                i = i8;
                                if (vxzVar.l(167, 45677567L, false) && aqphVarH.getTransferState() == aqpc.TRANSFER_STATE_COMPLETE) {
                                    String strH = wfs.h(aqphVarH.b());
                                    boolean zBooleanValue = aqphVarH.getIsExternalMedia().booleanValue();
                                    boolean zBooleanValue2 = false;
                                    if (!agkeVarE.isEmpty()) {
                                        Optional optionalOfNullable2 = Optional.ofNullable(aamm.e(strH, (aohq) agkeVarE.get(0)));
                                        aaur aaurVar = new aaur(list, zBooleanValue, i6);
                                        if (i6 == optionalOfNullable2.isPresent()) {
                                            Object obj2 = optionalOfNullable2.get();
                                            List list2 = aaurVar.a;
                                            boolean z4 = aaurVar.b;
                                            aamm aammVar = (aamm) obj2;
                                            aaml aamlVar = aammVar.a;
                                            aaml aamlVar2 = aammVar.b;
                                            Optional optionalOfNullable3 = Optional.ofNullable(aamlVar);
                                            aaur aaurVar2 = new aaur(list2, z4, 0);
                                            if (i6 == optionalOfNullable3.isPresent()) {
                                                optionalOfNullable3 = Optional.ofNullable(Boolean.valueOf(((aaml) optionalOfNullable3.get()).c(aaurVar2.a, aaurVar2.b) != null));
                                            }
                                            Boolean bool = Boolean.TRUE;
                                            boolean zBooleanValue3 = ((Boolean) optionalOfNullable3.orElse(bool)).booleanValue();
                                            Optional optionalOfNullable4 = Optional.ofNullable(aamlVar2);
                                            aaur aaurVar3 = new aaur(list2, z4, 2);
                                            if (true == optionalOfNullable4.isPresent()) {
                                                optionalOfNullable4 = Optional.ofNullable(Boolean.valueOf(((aaml) optionalOfNullable4.get()).c(aaurVar3.a, aaurVar3.b) != null));
                                            }
                                            optionalOfNullable2 = Optional.ofNullable(Boolean.valueOf(!(zBooleanValue3 && ((Boolean) optionalOfNullable4.orElse(bool)).booleanValue())));
                                        }
                                        zBooleanValue2 = ((Boolean) optionalOfNullable2.orElse(Boolean.FALSE)).booleanValue();
                                    }
                                    aihfVarCreateBuilder.copyOnWrite();
                                    alty altyVar8 = (alty) aihfVarCreateBuilder.instance;
                                    altyVar8.b |= 8;
                                    altyVar8.f = zBooleanValue2;
                                }
                            } else {
                                i = i5;
                                aanpVarArr2 = aanpVarArr3;
                            }
                            optionalEmpty = Optional.of((alty) aihfVarCreateBuilder.build());
                        }
                        if (optionalEmpty.isEmpty()) {
                            aano aanoVar2 = new aano(aanp.c);
                            aanoVar2.d = 26;
                            aanpVarArr2[i] = aanoVar2.a();
                            z = false;
                            i2 = 1;
                        } else {
                            aihf aihfVarCreateBuilder3 = aluc.a.createBuilder();
                            String str3 = aofhVar.d;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aluc alucVar = (aluc) aihfVarCreateBuilder3.instance;
                            str3.getClass();
                            alucVar.b |= 1;
                            alucVar.e = str3;
                            Object obj3 = optionalEmpty.get();
                            aihfVarCreateBuilder3.copyOnWrite();
                            aluc alucVar2 = (aluc) aihfVarCreateBuilder3.instance;
                            alucVar2.d = obj3;
                            alucVar2.c = 2;
                            aofg aofgVar = aofhVar.e;
                            if (aofgVar == null) {
                                aofgVar = aofg.b;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
                            aofgVar.c(aihlVarCheckIsLite);
                            Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
                            aoom aoomVar = (aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                            ((abrd) aakwVar.c.io()).hY(aihfVarCreateBuilder3);
                            if ((aoomVar.c & 64) != 0) {
                                int i15 = aoomVar.i;
                                aihfVarCreateBuilder3.copyOnWrite();
                                aluc alucVar3 = (aluc) aihfVarCreateBuilder3.instance;
                                alucVar3.b |= 8;
                                alucVar3.h = i15;
                            }
                            aihf aihfVarCreateBuilder4 = aogm.a.createBuilder();
                            String str4 = aoomVar.h;
                            aihfVarCreateBuilder4.copyOnWrite();
                            aogm aogmVar = (aogm) aihfVarCreateBuilder4.instance;
                            str4.getClass();
                            aogmVar.b |= 2;
                            aogmVar.d = str4;
                            z = false;
                            if (!aakwVar.f.l(68, 45414885L, false) || (aofbVarD = aakwVar.d(zwaVar2, str)) == aofb.OFFLINE_TYPE_UNKNOWN) {
                                i2 = 1;
                            } else {
                                aihfVarCreateBuilder4.copyOnWrite();
                                aogm aogmVar2 = (aogm) aihfVarCreateBuilder4.instance;
                                aogmVar2.c = aofbVarD.i;
                                i2 = 1;
                                aogmVar2.b |= 1;
                            }
                            aihfVarCreateBuilder3.copyOnWrite();
                            aluc alucVar4 = (aluc) aihfVarCreateBuilder3.instance;
                            aogm aogmVar3 = (aogm) aihfVarCreateBuilder4.build();
                            aogmVar3.getClass();
                            alucVar4.i = aogmVar3;
                            alucVar4.b |= 16;
                            arrayList.add((aluc) aihfVarCreateBuilder3.build());
                        }
                    }
                    i5 = i + 1;
                    aaksVar = this;
                    z2 = z;
                    agkjVar = agkjVar;
                    i4 = i2;
                }
                if (arrayList.isEmpty()) {
                    return Optional.empty();
                }
                aaqe aaqeVarA = ((aaqf) aakwVar.a.io()).a();
                aaqeVarA.e(arrayList);
                aaqeVarA.n(aigj.d);
                return Optional.of(aaqeVarA);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.d;
        return ahno.ar(ahno.as(ahno.ar(listenableFutureH, agekVar, scheduledExecutorService), new aajs(this, 2), scheduledExecutorService), new aaat(agkeVar, aanpVarArr, 7, null), scheduledExecutorService);
    }

    private final ListenableFuture h(zwa zwaVar, agkz agkzVar) {
        return tzk.b(this.g.b(zwaVar).n(agkzVar).u(new xdx(17)));
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        int iBc = a.bc(aofhVar.c);
        if (iBc != 0 && iBc == 4 && this.f.l(66, 45414357L, false)) {
            if (this.i == null) {
                this.i = new aakv(this, 2);
            }
            return this.i;
        }
        int iBc2 = a.bc(aofhVar.c);
        if (iBc2 == 0 || iBc2 != 2 || !this.f.l(71, 45417002L, false)) {
            return aans.c;
        }
        if (this.h == null) {
            this.h = new aakv(this, 0);
        }
        return this.h;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 1) {
            return ahno.ar(f(zwaVar, agke.q(aofhVar)), new aakt(0), this.d);
        }
        if (i == 3) {
            return ahno.ar(g(zwaVar, agke.q(aofhVar)), new aakt(2), this.d);
        }
        aano aanoVar = new aano(aanp.c);
        aanoVar.d = 23;
        return ahng.n(aanoVar.a());
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return ahng.n(agpi.a);
        }
        int iBc = a.bc(((aofh) agkeVar.get(0)).c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 1) {
            return f(zwaVar, agkeVar);
        }
        if (i == 3) {
            return g(zwaVar, agkeVar);
        }
        aano aanoVar = new aano(aanp.c);
        aanoVar.d = 23;
        return ahng.n((agke) Collection.EL.stream(agkeVar).map(new woi(aanoVar.a(), 16)).collect(aghu.a));
    }

    public final aofb d(zwa zwaVar, String str) {
        ardd arddVar = (ardd) this.g.b(zwaVar).g(wfs.g(461, wfs.h(str))).g(ardd.class).E();
        return arddVar == null ? aofb.OFFLINE_TYPE_UNKNOWN : arddVar.getOfflineModeType();
    }
}
