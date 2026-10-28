package defpackage;

import android.content.Context;
import android.util.Pair;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hsd implements aant {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController");
    public final aari b;
    public final Integer c;
    public final hpy d;
    public final wel e;
    public final Executor f;
    public final Executor g;
    public final hpb h;
    public final ahbw i;
    public final Context j;
    public final avmb k;
    public final huz l;
    public final vxz m;
    public final ikg n;
    public final hef o;
    public final syn p;
    private final hsv q;
    private final hsv r;
    private final hsv s;
    private final tbt t;
    private final huy u;

    public hsd(ikg ikgVar, hsq hsqVar, hsr hsrVar, hsu hsuVar, tbt tbtVar, huy huyVar, aari aariVar, huz huzVar, Integer num, hpy hpyVar, wbz wbzVar, hef hefVar, Executor executor, Executor executor2, hpb hpbVar, ahbw ahbwVar, syn synVar, Context context, vxz vxzVar, avmb avmbVar) {
        this.n = ikgVar;
        this.q = hsqVar;
        this.r = hsrVar;
        this.s = hsuVar;
        this.t = tbtVar;
        this.u = huyVar;
        this.b = aariVar;
        this.l = huzVar;
        this.c = num;
        this.d = hpyVar;
        this.e = wbzVar;
        this.o = hefVar;
        this.f = true == vxzVar.m(21, 45659204L) ? executor2 : executor;
        this.g = executor2;
        this.h = hpbVar;
        this.i = ahbwVar;
        this.p = synVar;
        this.j = context;
        this.m = vxzVar;
        this.k = avmbVar;
    }

    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    private final ListenableFuture i(final zwa zwaVar, final agke agkeVar, agkj agkjVar, agkj agkjVar2) {
        int i;
        ListenableFuture listenableFutureD;
        final ?? r9;
        Optional optionalFindFirst = Collection.EL.stream(agkjVar2.values()).findFirst();
        if (true == optionalFindFirst.isPresent()) {
            optionalFindFirst = Optional.ofNullable(Boolean.valueOf(((anue) optionalFindFirst.get()).l));
        }
        Boolean bool = Boolean.FALSE;
        final boolean zBooleanValue = ((Boolean) optionalFindFirst.orElse(bool)).booleanValue();
        Optional optionalFindFirst2 = Collection.EL.stream(agkjVar2.values()).findFirst();
        if (true == optionalFindFirst2.isPresent()) {
            optionalFindFirst2 = Optional.ofNullable(Boolean.valueOf(((anue) optionalFindFirst2.get()).m));
        }
        final boolean zBooleanValue2 = ((Boolean) optionalFindFirst2.orElse(bool)).booleanValue();
        ikg ikgVar = this.n;
        final aaqn aaqnVarA = ikgVar.a(zwaVar);
        if (aaqnVarA == null) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 15;
            return ahng.n(j(agkeVar, aanoVar.a()));
        }
        final aaew aaewVarD = aaqnVarA.d();
        if (aaewVarD == null) {
            aano aanoVar2 = new aano(aanp.c);
            aanoVar2.d = 15;
            return ahng.n(j(agkeVar, aanoVar2.a()));
        }
        if (zBooleanValue) {
            i = 2;
        } else {
            i = 0;
        }
        final hry hryVar = new hry();
        hryVar.b = agkjVar2;
        hryVar.a = agkjVar;
        if (this.m.l(20, 45651451L, false)) {
            ListenableFuture listenableFutureK = kro.K();
            final int i2 = i;
            ahcy ahcyVar = new ahcy() { // from class: hrp
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj) {
                    return this.a.d(hryVar, agkeVar, zBooleanValue, zBooleanValue2, i2, zwaVar, Optional.of((anvi) obj));
                }
            };
            r9 = zBooleanValue;
            listenableFutureD = ahno.as(listenableFutureK, ahcyVar, this.g);
        } else {
            listenableFutureD = d(hryVar, agkeVar, zBooleanValue, zBooleanValue2, i, zwaVar, Optional.empty());
            r9 = zBooleanValue;
        }
        return afxd.f(listenableFutureD).h(new ahcy() { // from class: hru
            /* JADX WARN: Code duplicated, block: B:115:0x0648  */
            /* JADX WARN: Code duplicated, block: B:32:0x011c A[Catch: ExecutionException -> 0x029d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {ExecutionException -> 0x029d, blocks: (B:22:0x00e5, B:32:0x011c), top: B:123:0x00e5 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v18, types: [agke, java.util.List] */
            /* JADX WARN: Type inference failed for: r15v2 */
            /* JADX WARN: Type inference failed for: r15v3, types: [int] */
            /* JADX WARN: Type inference failed for: r15v8 */
            /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r8v12, types: [aunn, java.lang.Object] */
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
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                final aaew aaewVar;
                zwa zwaVar2;
                final hsd hsdVar;
                aalf aalfVar;
                agkh agkhVar;
                agkh agkhVar2;
                boolean z;
                int i3;
                long j;
                agkh agkhVar3;
                aogf aogfVar;
                aofa aofaVar;
                agjz agjzVar;
                agkh agkhVar4;
                agkh agkhVar5;
                int i4;
                aaqn aaqnVar;
                ExecutionException executionException;
                aaqn aaqnVar2;
                String str;
                aazo aazoVarP;
                hru hruVar = this;
                hrz hrzVar = (hrz) obj;
                aaqn aaqnVar3 = aaqnVarA;
                aalf aalfVarG = aaqnVar3.g();
                int i5 = 2;
                if (aalfVarG == null) {
                    pkt pktVar = new pkt();
                    pktVar.d(hrzVar.e);
                    pktVar.e((agkj) Collection.EL.stream(hrzVar.a).collect(aghu.a(new hrn(i5), new hrn(3))));
                    return ahng.n(pktVar.c());
                }
                agjz agjzVar2 = new agjz(4);
                agkh agkhVar6 = new agkh(4);
                agkh agkhVar7 = new agkh(4);
                agkh agkhVar8 = new agkh(4);
                agkh agkhVar9 = new agkh(4);
                agkh agkhVar10 = new agkh(4);
                agke agkeVar2 = hrzVar.a;
                int i6 = ((agpi) agkeVar2).d;
                int i7 = 4;
                int i8 = 0;
                while (true) {
                    aaewVar = aaewVarD;
                    zwaVar2 = zwaVar;
                    hsdVar = hruVar.a;
                    aalfVar = aalfVarG;
                    agkhVar = agkhVar9;
                    agkhVar2 = agkhVar10;
                    if (i8 >= i6) {
                        break;
                    }
                    String str2 = (String) agkeVar2.get(i8);
                    int i9 = i8;
                    aamj aamjVarE = aaewVar.e(str2);
                    agke agkeVar3 = agkeVar2;
                    Pair pairB = aaewVar.b(str2);
                    if (aamjVarE == null || pairB == null) {
                        agjzVar = agjzVar2;
                        agkhVar4 = agkhVar6;
                        agkhVar5 = agkhVar8;
                        i4 = i6;
                        agkhVar = agkhVar;
                        aaqnVar = aaqnVar3;
                        agkhVar2 = agkhVar2;
                        hsdVar.e(str2);
                        agkhVar7.e(str2, aanp.a);
                    } else {
                        i4 = i6;
                        aohx aohxVarAm = aaewVar.am(str2);
                        anue anueVar = (anue) hrzVar.d.get(str2);
                        agjzVar = agjzVar2;
                        int iIntValue = ((Integer) tym.R(hrzVar.b, str2, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
                        String str3 = "LegacyCascadeMusicPlaylistEntityController.java";
                        agkhVar4 = agkhVar6;
                        if (anueVar == null || (anueVar.c & SemanticState.Hidden) == 0) {
                            try {
                                aaqnVar2 = aaqnVar3;
                                str = "com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController";
                                agkhVar5 = agkhVar8;
                                try {
                                    if (hsdVar.m.l(20, 45651451L, false)) {
                                        try {
                                            if (hlz.m(aamjVarE.a)) {
                                                Optional optional = hrzVar.f;
                                                if (optional.isPresent()) {
                                                    aazoVarP = hsdVar.n.p(zwaVar2, str2, iIntValue, (anvi) optional.get());
                                                } else {
                                                    aazoVarP = hsdVar.n.q(str2, iIntValue);
                                                }
                                            } else {
                                                aazoVarP = hsdVar.n.q(str2, iIntValue);
                                            }
                                        } catch (ExecutionException e) {
                                            executionException = e;
                                            str2 = str2;
                                            str3 = "LegacyCascadeMusicPlaylistEntityController.java";
                                            agkhVar = agkhVar;
                                            agkhVar2 = agkhVar2;
                                            agjzVar = agjzVar;
                                            agkhVar4 = agkhVar4;
                                            agkhVar5 = agkhVar5;
                                            aaqnVar = aaqnVar2;
                                            ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j(executionException)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "requestPlaylistMetadataAndPrepareForRefresh", (char) 773, str3)).w("[Offline] Failed requesting playlist %s for offline", str2);
                                            hsdVar.e(str2);
                                            aano aanoVar3 = new aano(aanp.b);
                                            aanoVar3.d = 2;
                                            agkhVar7.e(str2, aanoVar3.a());
                                        }
                                    } else {
                                        aazoVarP = hsdVar.n.q(str2, iIntValue);
                                    }
                                } catch (ExecutionException e2) {
                                    e = e2;
                                    agkhVar5 = agkhVar5;
                                    aaqnVar = aaqnVar2;
                                    executionException = e;
                                    ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j(executionException)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "requestPlaylistMetadataAndPrepareForRefresh", (char) 773, str3)).w("[Offline] Failed requesting playlist %s for offline", str2);
                                    hsdVar.e(str2);
                                    aano aanoVar4 = new aano(aanp.b);
                                    aanoVar4.d = 2;
                                    agkhVar7.e(str2, aanoVar4.a());
                                    agkhVar10 = agkhVar2;
                                    aaqnVar3 = aaqnVar;
                                    agkhVar8 = agkhVar5;
                                    agkhVar9 = agkhVar;
                                    agkeVar2 = agkeVar3;
                                    i6 = i4;
                                    aalfVarG = aalfVar;
                                    i8 = i9 + 1;
                                    agkhVar6 = agkhVar4;
                                    agjzVar2 = agjzVar;
                                    hruVar = this;
                                }
                            } catch (ExecutionException e3) {
                                e = e3;
                                aaqnVar = aaqnVar3;
                                agkhVar5 = agkhVar8;
                            }
                        } else {
                            aofu aofuVar = anueVar.n;
                            if (aofuVar == null) {
                                aofuVar = aofu.a;
                            }
                            aazoVarP = ikg.r(aofuVar, iIntValue);
                            aaqnVar2 = aaqnVar3;
                            str = "com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController";
                            agkhVar5 = agkhVar8;
                        }
                        if (aazoVarP == null) {
                            aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                            aofhVar.c = 2;
                            aofhVar.b |= 1;
                            String strE = wfs.e(hsdVar.c.intValue(), str2);
                            aihfVarCreateBuilder.copyOnWrite();
                            aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                            strE.getClass();
                            aofhVar2.b |= 2;
                            aofhVar2.d = strE;
                            agke agkeVarQ = agke.q((aofh) aihfVarCreateBuilder.build());
                            aano aanoVarA = aanp.a();
                            aanoVarA.c = 2;
                            aanoVarA.b(agkeVarQ);
                            agkhVar7.e(str2, aanoVarA.a());
                            agkhVar = agkhVar;
                            agkhVar2 = agkhVar2;
                            agjzVar = agjzVar;
                            agkhVar4 = agkhVar4;
                            agkhVar5 = agkhVar5;
                            aaqnVar = aaqnVar2;
                        } else {
                            List list = (List) pairB.second;
                            ikg ikgVar2 = hsdVar.n;
                            float fA = ((hlp) ikgVar2.a.io()).a(str2);
                            if (fA > 0.0f) {
                                agrx agrxVar = agso.a;
                            }
                            List listB = aasc.b(aazoVarP.a, list, fA, new hrk(aaewVar, 0));
                            Object aamhVar = aazoVarP.b;
                            aamh aamhVar2 = (aamh) aamhVar;
                            if (aamhVar2.d != listB.size()) {
                                ((agrc) ((agrc) hsd.a.c().i(agso.a, "LegacyCascadeMusicPlayl")).k(str, "requestPlaylistMetadataAndPrepareForRefresh", 820, "LegacyCascadeMusicPlaylistEntityController.java")).t("[Offline] Playlist size doesn't match number of playlist videos");
                                aamhVar = new aamh(aamhVar2, listB.size());
                            }
                            try {
                                aaqnVar = aaqnVar2;
                                try {
                                    agkz agkzVar = (agkz) Collection.EL.stream((Set) ikgVar2.c(aaqnVar, (aamh) aamhVar, listB).get()).map(new hrn(0)).collect(aghu.b);
                                    Integer num = (Integer) hrzVar.c.get(str2);
                                    if (num != null && num.intValue() != 2 && aaewVar.a(str2) > 0) {
                                        num = 1;
                                    }
                                    agkhVar5 = agkhVar5;
                                    agkhVar5.e(str2, aamhVar);
                                    agkhVar4 = agkhVar4;
                                    agkhVar4.e(str2, listB);
                                    agkhVar2 = agkhVar2;
                                    agkhVar2.e(str2, aohxVarAm);
                                    if (num == null || !(num.intValue() == 0 || num.intValue() == 2)) {
                                        agkhVar = agkhVar;
                                        agjzVar = agjzVar;
                                    } else {
                                        agjzVar = agjzVar;
                                        agjzVar.h(str2);
                                        agkhVar = agkhVar;
                                        agkhVar.e(str2, agkzVar);
                                    }
                                } catch (InterruptedException | ExecutionException e4) {
                                    e = e4;
                                    ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j(e)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "requestPlaylistMetadataAndPrepareForRefresh", (char) 835, "LegacyCascadeMusicPlaylistEntityController.java")).w("[Offline] Failed preparing videos to download for playlist %s", str2);
                                    hsdVar.e(str2);
                                    aano aanoVar5 = new aano(aanp.c);
                                    aanoVar5.d = 17;
                                    agkhVar7.e(str2, aanoVar5.a());
                                }
                            } catch (InterruptedException | ExecutionException e5) {
                                e = e5;
                                aaqnVar = aaqnVar2;
                            }
                        }
                    }
                    agkhVar10 = agkhVar2;
                    aaqnVar3 = aaqnVar;
                    agkhVar8 = agkhVar5;
                    agkhVar9 = agkhVar;
                    agkeVar2 = agkeVar3;
                    i6 = i4;
                    aalfVarG = aalfVar;
                    i8 = i9 + 1;
                    agkhVar6 = agkhVar4;
                    agjzVar2 = agjzVar;
                    hruVar = this;
                }
                agjz agjzVar3 = agjzVar2;
                agkh agkhVar11 = agkhVar6;
                agkh agkhVar12 = agkhVar8;
                aaqn aaqnVar4 = aaqnVar3;
                agke agkeVarG = agjzVar3.g();
                if (agkeVarG == null) {
                    throw new NullPointerException("Null playlistIdsToDownload");
                }
                Object obj2 = "LegacyCascadeMusicPlayl";
                String str4 = "com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController";
                zwa zwaVar3 = zwaVar2;
                hrx hrxVar = new hrx(agkhVar7, agkeVarG, agkhVar11.d(false), agkhVar12.d(false), agkhVar.d(false), agkhVar2.d(false));
                agkj agkjVar3 = hrxVar.d;
                agkj agkjVar4 = hrxVar.c;
                agqs agqsVarListIterator = ((agke) agkjVar4.values()).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    int i10 = r9;
                    final aamh aamhVar3 = (aamh) agqsVarListIterator.next();
                    agkj agkjVar5 = hrxVar.e;
                    String str5 = aamhVar3.a;
                    zwaVar3 = zwaVar3;
                    aohx aohxVar = (aohx) tym.R(agkjVar5, str5, aohx.UNKNOWN_FORMAT_TYPE);
                    anue anueVar2 = (anue) tym.R(hrzVar.d, str5, anue.a);
                    ikg ikgVar3 = hsdVar.n;
                    aodp aodpVarK = ikgVar3.k();
                    if (i10 != 0) {
                        aogf aogfVar2 = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
                        aihf aihfVarCreateBuilder2 = aofa.a.createBuilder();
                        aogfVar = aogfVar2;
                        aofb aofbVar = aofb.OFFLINE_MODE_TYPE_AUTO_OFFLINE;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aofa aofaVar2 = (aofa) aihfVarCreateBuilder2.instance;
                        aofaVar2.d = aofbVar.i;
                        aofaVar2.b |= 4;
                        aofaVar = (aofa) aihfVarCreateBuilder2.build();
                    } else {
                        aogf aogfVar3 = aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
                        aihf aihfVarCreateBuilder3 = aofa.a.createBuilder();
                        aofb aofbVar2 = aofb.OFFLINE_NOW;
                        aihfVarCreateBuilder3.copyOnWrite();
                        aogfVar = aogfVar3;
                        aofa aofaVar3 = (aofa) aihfVarCreateBuilder3.instance;
                        aofaVar3.d = aofbVar2.i;
                        aofaVar3.b |= 4;
                        aofaVar = (aofa) aihfVarCreateBuilder3.build();
                    }
                    aofa aofaVar4 = aofaVar;
                    final aogf aogfVar4 = aogfVar;
                    byte[] bArrAt = aaewVar.at(str5);
                    List list2 = (List) tym.R(hrxVar.b, str5, agpi.a);
                    Set set = (Set) tym.R(agkjVar3, str5, agpr.a);
                    java.util.Collection collectionH = aaewVar.h(str5, list2);
                    agkjVar3 = agkjVar3;
                    aamh aamhVarAi = aaewVar.ai(str5);
                    aaew aaewVar2 = aaewVar;
                    boolean zD = aaewVar2.D(aamhVar3, list2, aohxVar, aodpVarK, set, aamn.a(anueVar2.i), aaewVar.ad(str5), bArrAt, false);
                    aaewVar = aaewVar2;
                    agqsVarListIterator = agqsVarListIterator;
                    if (zD) {
                        String str6 = str4;
                        aalfVar.m(str5);
                        aaewVar.T(str5);
                        Object obj3 = obj2;
                        agjz agjzVar4 = new agjz(i7);
                        agjzVar4.j(aaje.b(aamhVarAi != null ? aamhVarAi.k.l() : aqmh.a, aamhVar3.k.l()));
                        agjzVar4.j((Iterable) Collection.EL.stream(collectionH).map(new Function() { // from class: hrt
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public final /* synthetic */ Function mo840andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj4) {
                                hsd hsdVar2 = hsdVar;
                                vxz vxzVar = hsdVar2.m;
                                aamh aamhVar4 = aamhVar3;
                                aamo aamoVar = (aamo) obj4;
                                if (vxzVar.l(20, 45651451L, false) && hlz.m(aamhVar4)) {
                                    aaew aaewVar3 = aaewVar;
                                    String strD = aamoVar.d();
                                    aihf aihfVarCreateBuilder4 = aoen.a.createBuilder();
                                    String strD2 = aamoVar.d();
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    aoen aoenVar = (aoen) aihfVarCreateBuilder4.instance;
                                    strD2.getClass();
                                    aoenVar.b |= 1;
                                    aoenVar.c = strD2;
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    aoen aoenVar2 = (aoen) aihfVarCreateBuilder4.instance;
                                    aoenVar2.e = 5;
                                    aoenVar2.b |= 4;
                                    aaewVar3.A(strD, false, (aoen) aihfVarCreateBuilder4.build());
                                }
                                return hsdVar2.n.m(aamoVar.d(), aamhVar4.a, null, aogfVar4, 6);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(aghu.a));
                        ikg.n(aaewVar, list2);
                        ikg.l(aaqnVar4, aamhVar3, set);
                        agjzVar4.j(ikgVar3.f(aamhVar3, list2, aohxVar, set, aamn.a(anueVar2.i), aogfVar4, bArrAt, aofaVar4));
                        agkh agkhVar13 = hrxVar.a;
                        aano aanoVarA2 = aanp.a();
                        aanoVarA2.c = 2;
                        aanoVarA2.b(agjzVar4.g());
                        agkhVar13.e(str5, aanoVarA2.a());
                        str4 = str6;
                        obj2 = obj3;
                        i7 = 4;
                    } else {
                        ((agrc) ((agrc) hsd.a.b().i(agso.a, obj2)).k(str4, "refreshPlaylistMetadataAndChainActionsForTrackUpdates", 1069, "LegacyCascadeMusicPlaylistEntityController.java")).w("[Offline] Failed syncing playlist %s to database", str5);
                        hsdVar.e(str5);
                        agkh agkhVar14 = hrxVar.a;
                        aano aanoVar6 = new aano(aanp.c);
                        aanoVar6.d = 6;
                        agkhVar14.e(str5, aanoVar6.a());
                    }
                }
                zwa zwaVar4 = zwaVar3;
                agkj agkjVar6 = agkjVar4;
                aaew aaewVar3 = aaewVar;
                agjw agjwVarValues = agkjVar6.values();
                vxz vxzVar = hsdVar.m;
                int i11 = 11;
                if (vxzVar.l(20, 45651451L, false)) {
                    Stream streamFilter = Collection.EL.stream(agjwVarValues).filter(new hod(12));
                    Collector collector = aghu.a;
                    agke agkeVar4 = (agke) streamFilter.collect(collector);
                    if (agkeVar4.isEmpty()) {
                        z = false;
                    } else {
                        agkj agkjVar7 = (agkj) Collection.EL.stream(agkeVar4).collect(aghu.b(new hpp(19), new hpp(20), new hnh(7)));
                        ikg ikgVar4 = hsdVar.n;
                        agke agkeVarG2 = agkjVar7.keySet().g();
                        z = false;
                        tzk.c(ahno.ar(((hpy) ikgVar4.j.io()).b((agke) Collection.EL.stream(agkeVarG2).map(new hrn(13)).collect(collector)), new hrk(agkeVarG2, 4), ikgVar4.m)).c(new mkc(hsdVar, agkjVar7, zwaVar4, 1)).v(hsdVar.k).F(new hrj(0), new hmd(11));
                    }
                    i3 = 20;
                    j = 45651451;
                } else {
                    i3 = 20;
                    j = 45651451;
                    z = false;
                }
                if (vxzVar.l(i3, j, z)) {
                    pkt pktVar2 = new pkt();
                    pktVar2.d(hrzVar.e);
                    pktVar2.e(hrxVar.a.d(z));
                    return ahng.n(pktVar2.c());
                }
                ?? r0 = agkeVar;
                agkh agkhVar15 = hrxVar.a;
                agjz agjzVar5 = new agjz(4);
                for (?? r15 = z; r15 < ((agpi) r0).d; r15++) {
                    String str7 = (String) r0.get(r15);
                    aamj aamjVarE2 = aaewVar3.e(str7);
                    if (aamjVarE2 == null || !hlz.m(aamjVarE2.a)) {
                        agkhVar3 = agkhVar15;
                    } else {
                        agke agkeVar5 = (agke) Collection.EL.stream(aamjVarE2.b).map(new hqs(aaewVar3, 8)).filter(new hod(i11)).collect(aghu.a);
                        if (agkeVar5.isEmpty()) {
                            agkhVar3 = agkhVar15;
                        } else {
                            agkhVar3 = agkhVar15;
                            agjzVar5.h(ahno.ar(kro.K(), new hro(hsdVar, str7, agkeVar5, agkhVar3, 0), hsdVar.f));
                        }
                    }
                    agkhVar15 = agkhVar3;
                }
                return ahno.aw(agjzVar5.g()).k(new uf(hrzVar, hrxVar, 15), hsdVar.f);
            }
        }, this.g).g(new agek() { // from class: hrv
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                hsa hsaVar = (hsa) obj;
                long j = hsaVar.b;
                agke agkeVar2 = agkeVar;
                boolean z = false;
                if (((agpi) agkeVar2).d == 1 && aaewVarD.al((String) agkeVar2.get(0)) == aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE) {
                    z = true;
                }
                if (r9 && !z) {
                    hsd hsdVar = this.a;
                    if (j > 0) {
                        aaqn aaqnVar = aaqnVarA;
                        zwa zwaVar2 = zwaVar;
                        syn synVar = hsdVar.p;
                        String strS = aaqnVar.s();
                        afxd afxdVarG = afxd.f(synVar.n(zwaVar2)).g(new hrk(hsdVar, 2), hsdVar.g);
                        afxd afxdVarF = afxd.f(afxdVarG);
                        gpr gprVar = new gpr(6);
                        Executor executor = hsdVar.f;
                        taf.i(afxdVarF.h(gprVar, executor), executor, new hou(3), new aejm(hsdVar, j, afxdVarG, strS, 1), null);
                    } else {
                        hsdVar.b.d();
                    }
                }
                return (agke) Collection.EL.stream(agkeVar2).map(new hqs(hsaVar, 9)).collect(aghu.a);
            }
        }, this.f);
    }

    private static final agke j(List list, aanp aanpVar) {
        return (agke) Collection.EL.stream(list).map(new hqs(aanpVar, 10)).collect(aghu.a);
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        int iBc = a.bc(aofhVar.c);
        return (iBc == 0 || iBc != 4) ? aans.c : new hsc(aofhVar);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0229  */
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
    @Override // defpackage.aant
    public final ListenableFuture b(final zwa zwaVar, aofh aofhVar) {
        aanp aanpVarA;
        aanp aanpVarA2;
        boolean z;
        aamj aamjVarE;
        aamj aamjVarE2;
        String strH = wfs.h(aofhVar.d);
        if (strH.isEmpty()) {
            ((agrc) ((agrc) a.b().i(agso.a, "LegacyCascadeMusicPlayl")).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "handleAction", 214, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failure handle OfflineOrchestrationAction for MusicPlaylistEntity, empty playlistId.");
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 27;
            return ahng.n(aanoVar.a());
        }
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVar = anue.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        anue anueVar = (anue) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i = aofhVar.c;
        int iBc = a.bc(i);
        if (iBc == 0) {
            iBc = 1;
        }
        int i2 = iBc - 1;
        int i3 = 2;
        if (i2 == 1) {
            hsv hsvVar = this.q;
            int iBc2 = a.bc(i);
            if (iBc2 == 0 || iBc2 != 2) {
                int iBc3 = a.bc(i);
                int i4 = iBc3 == 0 ? 1 : iBc3;
                StringBuilder sb = new StringBuilder("unexpected action: ");
                sb.append(i4 - 1);
                throw new UnsupportedOperationException(sb.toString());
            }
            final String strH2 = wfs.h(aofhVar.d);
            aofg aofgVar2 = aofhVar.e;
            if (aofgVar2 == null) {
                aofgVar2 = aofg.b;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            aofgVar2.c(aihlVarCheckIsLite2);
            Object objK2 = aofgVar2.j.k(aihlVarCheckIsLite2.d);
            final anue anueVar2 = (anue) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            aofg aofgVar3 = aofhVar.e;
            if (aofgVar3 == null) {
                aofgVar3 = aofg.b;
            }
            final hsq hsqVar = (hsq) hsvVar;
            final ListenableFuture listenableFutureAr = hsqVar.g.l(20, 45651451L, false) ? ahno.ar(hsqVar.h.b(strH2), new hqt(5), hsqVar.d) : ahng.n(Boolean.FALSE);
            final ListenableFuture listenableFutureK = kro.K();
            final aofg aofgVar4 = aofgVar3;
            return ahno.ax(listenableFutureAr, listenableFutureK).l(new ahcx() { // from class: hso
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
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
                @Override // defpackage.ahcx
                public final ListenableFuture a() {
                    ExecutionException executionException;
                    aazo aazoVarP;
                    boolean zBooleanValue = ((Boolean) ahng.v(listenableFutureAr)).booleanValue();
                    anvi anviVar = (anvi) ahng.v(listenableFutureK);
                    anue anueVar3 = anueVar2;
                    int i5 = anueVar3.h;
                    aohx aohxVarA = aohx.a(anueVar3.g);
                    if (aohxVarA == null) {
                        aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
                    }
                    final aohx aohxVar = aohxVarA;
                    final aamn aamnVarA = aamn.a(anueVar3.i);
                    final byte[] bArrG = anueVar3.f.G();
                    aogf aogfVarA = aogf.a(anueVar3.j);
                    if (aogfVarA == null) {
                        aogfVarA = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
                    }
                    final aogf aogfVar = aogfVarA;
                    zwa zwaVar2 = zwaVar;
                    final hsq hsqVar2 = hsqVar;
                    ikg ikgVar = hsqVar2.h;
                    final aaqn aaqnVarA = ikgVar.a(zwaVar2);
                    if (aaqnVarA == null) {
                        aano aanoVar2 = new aano(aanp.c);
                        aanoVar2.d = 15;
                        return ahng.n(aanoVar2.a());
                    }
                    final aaew aaewVarD = aaqnVarA.d();
                    aadc aadcVarC = aaqnVarA.c();
                    final aalf aalfVarG = aaqnVarA.g();
                    if (aaewVarD == null || aadcVarC == null) {
                        aano aanoVar3 = new aano(aanp.c);
                        aanoVar3.d = 15;
                        return ahng.n(aanoVar3.a());
                    }
                    final String str = strH2;
                    hsqVar2.i.q(true);
                    if (aaewVarD.e(str) != null) {
                        agrx agrxVar = agso.a;
                        ((tbt) ikgVar.g).e(new aahl(str));
                        return ahng.n(aanp.a);
                    }
                    if (!((aada) aadcVarC).m()) {
                        hsqVar2.h.g(str, 0);
                        aano aanoVar4 = new aano(aanp.c);
                        aanoVar4.d = 32;
                        return ahng.n(aanoVar4.a());
                    }
                    if ((anueVar3.c & SemanticState.Hidden) != 0) {
                        aofu aofuVar = anueVar3.n;
                        if (aofuVar == null) {
                            aofuVar = aofu.a;
                        }
                        aazoVarP = ikg.r(aofuVar, i5);
                    } else if (zBooleanValue) {
                        try {
                            aazoVarP = ikgVar.p(zwaVar2, str, i5, anviVar);
                        } catch (ExecutionException e) {
                            executionException = e;
                            ((agrc) ((agrc) ((agrc) hsq.a.b().i(agso.a, "LegacyAddMusicPlaylistE")).j(executionException)).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyAddMusicPlaylistEntityActionHandler", "add", (char) 242, "LegacyAddMusicPlaylistEntityActionHandler.java")).w("[Offline] Failed requesting playlist %s for offline", str);
                            hsqVar2.h.g(str, 1);
                            aano aanoVar5 = new aano(aanp.b);
                            aanoVar5.d = 2;
                            return ahng.n(aanoVar5.a());
                        }
                    } else {
                        try {
                            aazoVarP = ikgVar.q(str, i5);
                        } catch (ExecutionException e2) {
                            executionException = e2;
                            ((agrc) ((agrc) ((agrc) hsq.a.b().i(agso.a, "LegacyAddMusicPlaylistE")).j(executionException)).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyAddMusicPlaylistEntityActionHandler", "add", (char) 242, "LegacyAddMusicPlaylistEntityActionHandler.java")).w("[Offline] Failed requesting playlist %s for offline", str);
                            hsqVar2.h.g(str, 1);
                            aano aanoVar6 = new aano(aanp.b);
                            aanoVar6.d = 2;
                            return ahng.n(aanoVar6.a());
                        }
                    }
                    if (aazoVarP == null) {
                        agrx agrxVar2 = agso.a;
                        hsqVar2.h.g(str, 3);
                        aano aanoVar7 = new aano(aanp.c);
                        aanoVar7.d = 4;
                        return ahng.n(aanoVar7.a());
                    }
                    ikg ikgVar2 = hsqVar2.h;
                    mbc mbcVar = hsqVar2.c;
                    final aodp aodpVarK = ikgVar2.k();
                    long epochMilli = mbcVar.f().toEpochMilli();
                    final aamh aamhVar = (aamh) aazoVarP.b;
                    if (!aaewVarD.Y(aamhVar, aohxVar, aodpVarK, bArrG, epochMilli, aogfVar)) {
                        ((agrc) ((agrc) hsq.a.b().i(agso.a, "LegacyAddMusicPlaylistE")).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyAddMusicPlaylistEntityActionHandler", "add", 280, "LegacyAddMusicPlaylistEntityActionHandler.java")).w("[Offline] Failed inserting playlist %s to database", str);
                        ikgVar2.g(str, 2);
                        aano aanoVar8 = new aano(aanp.c);
                        aanoVar8.d = 6;
                        return ahng.n(aanoVar8.a());
                    }
                    final ?? r1 = aazoVarP.a;
                    if (txz.g(hsqVar2.b)) {
                        hsqVar2.e.c(new aahj(str));
                        hsqVar2.f.j();
                    }
                    aaok aaokVar = aamhVar.l;
                    if (aaokVar != null) {
                        ikg.o(aaewVarD, aaokVar);
                    }
                    final aofg aofgVar5 = aofgVar4;
                    return ahno.ar(ikgVar2.c(aaqnVarA, aamhVar, r1), new agek() { // from class: hsp
                        @Override // defpackage.agek
                        public final Object apply(Object obj) {
                            Set set = (Set) Collection.EL.stream((Set) obj).map(new hrn(12)).collect(Collectors.toSet());
                            byte[] bArr = bArrG;
                            aamn aamnVar = aamnVarA;
                            aaew aaewVar = aaewVarD;
                            aamh aamhVar2 = aamhVar;
                            List list = r1;
                            aohx aohxVar2 = aohxVar;
                            boolean zD = aaewVar.D(aamhVar2, list, aohxVar2, aodpVarK, set, aamnVar, -1, bArr, false);
                            String str2 = str;
                            hsq hsqVar3 = hsqVar2;
                            if (!zD) {
                                ((agrc) ((agrc) hsq.a.b().i(agso.a, "LegacyAddMusicPlaylistE")).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyAddMusicPlaylistEntityActionHandler", "add", 328, "LegacyAddMusicPlaylistEntityActionHandler.java")).w("[Offline] Failed updating videos in playlist %s to database", str2);
                                ikg ikgVar3 = hsqVar3.h;
                                ikgVar3.i(str2);
                                aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
                                aoenVar.b |= 2;
                                aoenVar.d = str2;
                                aihfVarCreateBuilder.copyOnWrite();
                                aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                                aoenVar2.e = 10;
                                aoenVar2.b |= 4;
                                aaewVar.v(str2, (aoen) aihfVarCreateBuilder.build());
                                ikgVar3.h(str2);
                                aano aanoVar9 = new aano(aanp.c);
                                aanoVar9.d = 6;
                                return aanoVar9.a();
                            }
                            aalf aalfVar = aalfVarG;
                            agrx agrxVar3 = agso.a;
                            if (aalfVar != null) {
                                aalfVar.m(str2);
                            }
                            aofg aofgVar6 = aofgVar5;
                            aaqn aaqnVar = aaqnVarA;
                            ikg ikgVar4 = hsqVar3.h;
                            ikg.n(aaewVar, list);
                            ikg.l(aaqnVar, aamhVar2, set);
                            agjz agjzVar = new agjz(4);
                            agjzVar.j(aaje.c(aamhVar2.k.l()));
                            aano aanoVarA = aanp.a();
                            aanoVarA.c = 2;
                            aofa aofaVar = aofgVar6.g;
                            if (aofaVar == null) {
                                aofaVar = aofa.a;
                            }
                            agjzVar.j(ikgVar4.f(aamhVar2, list, aohxVar2, set, aamnVar, aogfVar, bArr, aofaVar));
                            aanoVarA.b(agjzVar.g());
                            return aanoVarA.a();
                        }
                    }, hsqVar2.d);
                }
            }, hsqVar.d);
        }
        int i5 = 16;
        int i6 = 15;
        int i7 = 4;
        if (i2 == 2) {
            hsv hsvVar2 = this.r;
            int iBc4 = a.bc(i);
            if (iBc4 == 0 || iBc4 != 3) {
                int iBc5 = a.bc(i);
                int i8 = iBc5 == 0 ? 1 : iBc5;
                StringBuilder sb2 = new StringBuilder("unexpected action: ");
                sb2.append(i8 - 1);
                throw new UnsupportedOperationException(sb2.toString());
            }
            String strH3 = wfs.h(aofhVar.d);
            aofg aofgVar5 = aofhVar.e;
            if (aofgVar5 == null) {
                aofgVar5 = aofg.b;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            aofgVar5.c(aihlVarCheckIsLite3);
            Object objK3 = aofgVar5.j.k(aihlVarCheckIsLite3.d);
            aogf aogfVarA = aogf.a(((anue) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).j);
            if (aogfVarA == null) {
                aogfVarA = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
            }
            aogf aogfVar = aogfVarA;
            ikg ikgVar = ((hsr) hsvVar2).a;
            aaqn aaqnVarA = ikgVar.a(zwaVar);
            if (aaqnVarA == null) {
                aano aanoVar2 = new aano(aanp.c);
                aanoVar2.d = 15;
                aanpVarA = aanoVar2.a();
            } else {
                aaew aaewVarD = aaqnVarA.d();
                if (aaewVarD == null) {
                    aano aanoVar3 = new aano(aanp.c);
                    aanoVar3.d = 15;
                    aanpVarA = aanoVar3.a();
                } else {
                    ikgVar.i(strH3);
                    aamh aamhVarAi = aaewVarD.ai(strH3);
                    if (aamhVarAi == null) {
                        aanpVarA = aanp.a;
                    } else {
                        List listI = aaewVarD.i(strH3, false, null);
                        if (listI == null) {
                            aano aanoVar4 = new aano(aanp.c);
                            aanoVar4.d = 6;
                            aanpVarA = aanoVar4.a();
                        } else {
                            ikgVar.h(strH3);
                            agjz agjzVar = new agjz(4);
                            agjzVar.j((Iterable) Collection.EL.stream(listI).map(new hpm(hsvVar2, strH3, aogfVar, 3, null)).collect(Collectors.toCollection(new hcd(16))));
                            agjzVar.j(aaje.d(aamhVarAi.k.l()));
                            agke agkeVarG = agjzVar.g();
                            aano aanoVarA = aanp.a();
                            aanoVarA.c = 2;
                            aanoVarA.b(agkeVarG);
                            aanpVarA = aanoVarA.a();
                        }
                    }
                }
            }
            return ahng.n(aanpVarA);
        }
        if (i2 == 3) {
            return ahno.ar(i(zwaVar, agke.q(strH), agkj.j(strH, Integer.valueOf((anueVar.c & 4) != 0 ? anueVar.h : Alert.DURATION_SHOW_INDEFINITELY)), agkj.j(strH, anueVar)), new hqt(i3), this.f);
        }
        if (i2 != 4) {
            aano aanoVar5 = new aano(aanp.c);
            aanoVar5.d = 23;
            return ahng.n(aanoVar5.a());
        }
        hsv hsvVar3 = this.s;
        int iBc6 = a.bc(i);
        if (iBc6 == 0 || iBc6 != 5) {
            int iBc7 = a.bc(i);
            int i9 = iBc7 == 0 ? 1 : iBc7;
            StringBuilder sb3 = new StringBuilder("unexpected action: ");
            sb3.append(i9 - 1);
            throw new UnsupportedOperationException(sb3.toString());
        }
        aofg aofgVar6 = aofhVar.e;
        if (aofgVar6 == null) {
            aofgVar6 = aofg.b;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
        aofgVar6.c(aihlVarCheckIsLite4);
        Object objK4 = aofgVar6.j.k(aihlVarCheckIsLite4.d);
        anue anueVar3 = (anue) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4));
        String strH4 = wfs.h(aofhVar.d);
        aofg aofgVar7 = aofhVar.e;
        if (aofgVar7 == null) {
            aofgVar7 = aofg.b;
        }
        aofa aofaVar = aofgVar7.g;
        if (aofaVar == null) {
            aofaVar = aofa.a;
        }
        aofa aofaVar2 = aofaVar;
        hsu hsuVar = (hsu) hsvVar3;
        ikg ikgVar2 = hsuVar.c;
        aaqn aaqnVarA2 = ikgVar2.a(zwaVar);
        if (aaqnVarA2 == null) {
            aano aanoVar6 = new aano(aanp.c);
            aanoVar6.d = 15;
            aanpVarA2 = aanoVar6.a();
        } else {
            aaew aaewVarD2 = aaqnVarA2.d();
            if (aaewVarD2 == null) {
                aano aanoVar7 = new aano(aanp.c);
                aanoVar7.d = 15;
                aanpVarA2 = aanoVar7.a();
            } else if (!"PPSDST".equals(strH4) && (anueVar3.c & 16) != 0) {
                aogf aogfVarA2 = aogf.a(anueVar3.j);
                if (aogfVarA2 == null) {
                    aogfVarA2 = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
                }
                if (aaewVarD2.C(strH4, aogfVarA2)) {
                    ((tbt) ikgVar2.g).e(new aahp(strH4, aogfVarA2));
                    aanpVarA2 = aanp.a;
                } else {
                    aano aanoVar8 = new aano(aanp.c);
                    aanoVar8.d = 6;
                    aanpVarA2 = aanoVar8.a();
                }
            } else if ("PPSV".equals(strH4) || "PPSE".equals(strH4) || "PPSDST".equals(strH4)) {
                int i10 = anueVar3.d;
                if (i10 == 6) {
                    String str = (String) anueVar3.e;
                    if (aaewVarD2.u(str)) {
                        aano aanoVarA2 = aanp.a();
                        aanoVarA2.c = 2;
                        boolean zN = hfn.n(aaewVarD2, str);
                        aihf aihfVarCreateBuilder = aofa.a.createBuilder();
                        aofb aofbVar = aofb.OFFLINE_NOW;
                        aihfVarCreateBuilder.copyOnWrite();
                        aofa aofaVar3 = (aofa) aihfVarCreateBuilder.instance;
                        aofaVar3.d = aofbVar.i;
                        aofaVar3.b |= 4;
                        aofa aofaVar4 = (aofa) aihfVarCreateBuilder.build();
                        aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
                        aofhVar2.c = 1;
                        aofhVar2.b |= 1;
                        String strAH = kro.aH(str);
                        aihfVarCreateBuilder2.copyOnWrite();
                        aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
                        strAH.getClass();
                        aofhVar3.b |= 2;
                        aofhVar3.d = strAH;
                        aihh aihhVar = (aihh) aofg.b.createBuilder();
                        ((Integer) ikgVar2.k).intValue();
                        int iK = hmy.k(2, 28, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE);
                        aihhVar.copyOnWrite();
                        aofg aofgVar8 = (aofg) aihhVar.instance;
                        aofgVar8.c |= 1;
                        aofgVar8.d = iK;
                        aihhVar.copyOnWrite();
                        aofg aofgVar9 = (aofg) aihhVar.instance;
                        aofaVar4.getClass();
                        aofgVar9.g = aofaVar4;
                        aofgVar9.c |= 2;
                        aihl aihlVar2 = anyr.b;
                        aihf aihfVarCreateBuilder3 = anyr.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        anyr anyrVar = (anyr) aihfVarCreateBuilder3.instance;
                        anyrVar.c |= 32;
                        anyrVar.i = strH4;
                        int i11 = anueVar3.i;
                        aihfVarCreateBuilder3.copyOnWrite();
                        anyr anyrVar2 = (anyr) aihfVarCreateBuilder3.instance;
                        anyrVar2.c |= 64;
                        anyrVar2.j = i11;
                        aigj aigjVar = anueVar3.f;
                        aihfVarCreateBuilder3.copyOnWrite();
                        anyr anyrVar3 = (anyr) aihfVarCreateBuilder3.instance;
                        aigjVar.getClass();
                        anyrVar3.c |= 1;
                        anyrVar3.d = aigjVar;
                        aihfVarCreateBuilder3.copyOnWrite();
                        anyr anyrVar4 = (anyr) aihfVarCreateBuilder3.instance;
                        anyrVar4.c |= SemanticState.Hidden;
                        anyrVar4.k = zN;
                        aihhVar.e(aihlVar2, (anyr) aihfVarCreateBuilder3.build());
                        aofg aofgVar10 = (aofg) aihhVar.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aofh aofhVar4 = (aofh) aihfVarCreateBuilder2.instance;
                        aofgVar10.getClass();
                        aofhVar4.e = aofgVar10;
                        aofhVar4.b |= 4;
                        aanoVarA2.b(agke.q((aofh) aihfVarCreateBuilder2.build()));
                        aanpVarA2 = aanoVarA2.a();
                    } else {
                        aano aanoVar9 = new aano(aanp.c);
                        aanoVar9.d = 6;
                        aanpVarA2 = aanoVar9.a();
                    }
                } else if (i10 == 7) {
                    String str2 = (String) anueVar3.e;
                    if (hsuVar.b.l(20, 45651451L, false)) {
                        aamt aamtVarF = aaewVarD2.f(str2);
                        if (aamtVarF == null) {
                            ((agrc) ((agrc) hsu.a.c()).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyUpdateMusicPlaylistEntityActionHandler", "maybeRemoveSingleTrackVideoFromPodcastShow", 428, "LegacyUpdateMusicPlaylistEntityActionHandler.java")).t("Trying to remove video from a podcast show, but the video is not downloaded.");
                        } else {
                            String strJ = hfn.j(aamtVarF.a);
                            if (!ahno.aa(strJ) && (aamjVarE = aaewVarD2.e(strJ)) != null) {
                                ArrayList arrayList = new ArrayList(aaewVarD2.ar(strJ));
                                if (Collection.EL.removeIf(arrayList, new gnh(str2, i5))) {
                                    if (aaewVarD2.D(aamjVarE.a, arrayList, aamjVarE.c, aaewVarD2.ak(strJ), agpr.a, aamn.OFFLINE_IMMEDIATELY, aamjVarE.d, aaewVarD2.at(strJ), false)) {
                                        z = true;
                                    } else {
                                        ((agrc) ((agrc) hsu.a.c()).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyUpdateMusicPlaylistEntityActionHandler", "maybeRemoveSingleTrackVideoFromPodcastShow", 463, "LegacyUpdateMusicPlaylistEntityActionHandler.java")).t("Failed to update the podcast show playlist with an episode removed.");
                                    }
                                }
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    aihf aihfVarCreateBuilder4 = aoen.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aoen aoenVar = (aoen) aihfVarCreateBuilder4.instance;
                    str2.getClass();
                    aoenVar.b |= 1;
                    aoenVar.c = str2;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aoen aoenVar2 = (aoen) aihfVarCreateBuilder4.instance;
                    aoenVar2.e = 5;
                    aoenVar2.b |= 4;
                    boolean zA = aaewVarD2.A(str2, false, (aoen) aihfVarCreateBuilder4.build());
                    if (z || zA) {
                        aano aanoVarA3 = aanp.a();
                        aanoVarA3.c = 2;
                        aanoVarA3.b(agke.q(ikgVar2.m(str2, strH4, null, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, 6)));
                        aanpVarA2 = aanoVarA3.a();
                    } else {
                        aanpVarA2 = aanp.a;
                    }
                } else if (!strH4.equals("PPSDST") || (anueVar3.c & SemanticState.Hidden) == 0) {
                    aano aanoVar10 = new aano(aanp.c);
                    aanoVar10.d = 27;
                    aanpVarA2 = aanoVar10.a();
                } else {
                    aofu aofuVar = anueVar3.n;
                    if (aofuVar == null) {
                        aofuVar = aofu.a;
                    }
                    aamh aamhVarA = aamh.a(aofuVar);
                    aano aanoVarA4 = aanp.a();
                    aanoVarA4.c = 2;
                    aofu aofuVar2 = anueVar3.n;
                    if (aofuVar2 == null) {
                        aofuVar2 = aofu.a;
                    }
                    aanoVarA4.b((agke) Collection.EL.stream(aofuVar2.f).filter(new gnh(aaewVarD2, i6)).map(new hst(hsuVar, aamhVarA, anueVar3, aaewVarD2, aofaVar2, 1)).collect(aghu.a));
                    aanpVarA2 = aanoVarA4.a();
                }
            } else if ("PPOM".equals(strH4)) {
                int i12 = anueVar3.d;
                if (i12 != 7) {
                    aano aanoVar11 = new aano(aanp.c);
                    aanoVar11.d = 26;
                    aanpVarA2 = aanoVar11.a();
                } else {
                    String str3 = i12 == 7 ? (String) anueVar3.e : "";
                    Pair pairB = aaewVarD2.b("PPOM");
                    if (pairB == null) {
                        aano aanoVar12 = new aano(aanp.c);
                        aanoVar12.d = 26;
                        aanpVarA2 = aanoVar12.a();
                    } else {
                        List list = (List) Collection.EL.stream((List) pairB.second).filter(new gnh(str3, 17)).collect(Collectors.toList());
                        Set set = (Set) Collection.EL.stream(list).map(new hrn(i6)).collect(Collectors.toCollection(new hcd(18)));
                        aamh aamhVar = new aamh((aamh) pairB.first, set.size());
                        aohx aohxVarE = ((hlp) ikgVar2.a.io()).e();
                        String str4 = aamhVar.a;
                        byte[] bArrAt = aaewVarD2.at(str4);
                        java.util.Collection collectionH = aaewVarD2.h(str4, list);
                        if (aaewVarD2.D(aamhVar, list, aohxVarE, aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN, set, aamn.AUTO_OFFLINE, -1, bArrAt, false)) {
                            agjz agjzVar2 = new agjz(4);
                            agjzVar2.j((Iterable) Collection.EL.stream(collectionH).map(new hph(hsvVar3, anueVar3, i7)).collect(Collectors.toList()));
                            agjzVar2.j((Iterable) Collection.EL.stream(list).map(new hst(hsuVar, aamhVar, aohxVarE, set, bArrAt, 0)).collect(Collectors.toList()));
                            aano aanoVarA5 = aanp.a();
                            aanoVarA5.c = 2;
                            aanoVarA5.b(agjzVar2.g());
                            aanpVarA2 = aanoVarA5.a();
                        } else {
                            aano aanoVar13 = new aano(aanp.c);
                            aanoVar13.d = 26;
                            aanpVarA2 = aanoVar13.a();
                        }
                    }
                }
            } else if (hsuVar.b.l(20, 45651451L, false) && (aamjVarE2 = aaewVarD2.e(strH4)) != null && hlz.m(aamjVarE2.a)) {
                int i13 = anueVar3.d;
                if (i13 == 6) {
                    aamt aamtVarF2 = aaewVarD2.f(i13 == 6 ? (String) anueVar3.e : "");
                    if (aamtVarF2 == null) {
                        ((agrc) ((agrc) hsu.a.c()).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyUpdateMusicPlaylistEntityActionHandler", "handlePodcastShowPlaylistUpdateSingleVideoAdd", 366, "LegacyUpdateMusicPlaylistEntityActionHandler.java")).t("Trying to add video to a podcast show, but the video has not been offlined yet.");
                        aano aanoVar14 = new aano(aanp.c);
                        aanoVar14.d = 27;
                        aanpVarA2 = aanoVar14.a();
                    } else {
                        aamo aamoVar = aamtVarF2.a;
                        String strJ2 = hfn.j(aamoVar);
                        if (strH4.equals(strJ2)) {
                            aamj aamjVarE3 = aaewVarD2.e(strJ2);
                            if (aamjVarE3 == null || aamjVarE3.b.contains(aamtVarF2.b())) {
                                aanpVarA2 = aanp.a;
                            } else {
                                ArrayList arrayList2 = new ArrayList(aaewVarD2.ar(strJ2));
                                arrayList2.add(aamoVar);
                                if (aaewVarD2.D(aamjVarE3.a, arrayList2, aamjVarE3.c, aaewVarD2.ak(strJ2), new agqj(aamtVarF2.b()), aamn.OFFLINE_IMMEDIATELY, aamjVarE3.d, aaewVarD2.at(strJ2), false)) {
                                    aanpVarA2 = aanp.a;
                                } else {
                                    ((agrc) ((agrc) hsu.a.c()).k("com/google/android/apps/youtube/music/offline/entitycontroller/actionhandler/LegacyUpdateMusicPlaylistEntityActionHandler", "handlePodcastShowPlaylistUpdateSingleVideoAdd", 416, "LegacyUpdateMusicPlaylistEntityActionHandler.java")).t("Failed to add video to podcast show");
                                    aano aanoVar15 = new aano(aanp.c);
                                    aanoVar15.d = 27;
                                    aanpVarA2 = aanoVar15.a();
                                }
                            }
                        } else {
                            aano aanoVar16 = new aano(aanp.c);
                            aanoVar16.d = 27;
                            aanpVarA2 = aanoVar16.a();
                        }
                    }
                } else {
                    aano aanoVar17 = new aano(aanp.c);
                    aanoVar17.d = 27;
                    aanpVarA2 = aanoVar17.a();
                }
            } else {
                aanpVarA2 = aanp.a;
            }
        }
        return ahng.n(aanpVarA2);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return ahng.n(agpi.a);
        }
        int i = 0;
        int iBc = a.bc(((aofh) agkeVar.get(0)).c);
        if (iBc == 0 || iBc != 4) {
            throw new UnsupportedOperationException();
        }
        agjz agjzVar = new agjz(4);
        agkh agkhVar = new agkh(4);
        agkh agkhVar2 = new agkh(4);
        Collection.EL.stream(agkeVar).forEach(new hrr(agjzVar, agkhVar, agkhVar2, i));
        return i(zwaVar, agjzVar.g(), agkhVar.d(false), agkhVar2.d(false));
    }

    public final ListenableFuture d(final hry hryVar, final agke agkeVar, boolean z, boolean z2, final int i, final zwa zwaVar, Optional optional) {
        int i2 = 13;
        hge hgeVar = new hge(hryVar, i2);
        int i3 = 1;
        if (true == optional.isPresent()) {
            ((hry) hgeVar.a).b((anvi) optional.get());
        }
        if (!z2) {
            huy huyVar = this.u;
            List list = (List) Collection.EL.stream(agkz.n(agkeVar)).map(new hqs(huyVar, i2)).collect(Collectors.toCollection(new hcd(20)));
            return ahno.ar(ahno.au(agke.n(list)).l(new ial(huyVar, list, z, i3), MoreExecutors.directExecutor()), new agek() { // from class: hrm
                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    final alts altsVar = (alts) obj;
                    final agjz agjzVar = new agjz(4);
                    final agkh agkhVar = new agkh(4);
                    final zwa zwaVar2 = zwaVar;
                    agke agkeVar2 = agkeVar;
                    final hsd hsdVar = this.a;
                    final Instant instantA = hsdVar.i.a();
                    long jOrElse = Collection.EL.stream(agkeVar2).mapToLong(new ToLongFunction() { // from class: hrq
                        @Override // java.util.function.ToLongFunction
                        public final long applyAsLong(Object obj2) {
                            int i4;
                            int i5;
                            final String str = (String) obj2;
                            altq altqVarD = aajg.d(altsVar, str);
                            final long j = 86400;
                            if (altqVarD != null && (i5 = altqVarD.e) > 0) {
                                j = i5;
                            }
                            final Instant instant = instantA;
                            hsdVar.o.k(zwaVar2).c(new avnn() { // from class: hrl
                                @Override // defpackage.avnn
                                public final Object a(Object obj3) {
                                    aphf aphfVarE = aphh.e(kro.aB(str));
                                    aphfVarE.am(Long.valueOf(instant.plusSeconds(j).getEpochSecond()));
                                    return ((hcc) obj3).d(aphfVarE);
                                }
                            }).F(new hrj(2), new hmd(12));
                            if (altqVarD == null || (i4 = altqVarD.e) <= 0) {
                                return Long.MAX_VALUE;
                            }
                            return i4;
                        }
                    }).min().orElse(86400L);
                    if (jOrElse == Long.MAX_VALUE) {
                        jOrElse = 0;
                    }
                    Stream stream = Collection.EL.stream(agkeVar2);
                    final int i4 = i;
                    stream.forEach(new Consumer() { // from class: hrs
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void r(Object obj2) {
                            String str = (String) obj2;
                            altq altqVarD = aajg.d(altsVar, str);
                            int i5 = 2;
                            if (altqVarD == null) {
                                aihf aihfVarCreateBuilder = altq.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                altq altqVar = (altq) aihfVarCreateBuilder.instance;
                                str.getClass();
                                altqVar.b |= 1;
                                altqVar.c = str;
                                aihfVarCreateBuilder.copyOnWrite();
                                altq altqVar2 = (altq) aihfVarCreateBuilder.instance;
                                altqVar2.b |= 2;
                                altqVar2.d = false;
                                aihfVarCreateBuilder.copyOnWrite();
                                altq altqVar3 = (altq) aihfVarCreateBuilder.instance;
                                altqVar3.b |= 32;
                                altqVar3.g = true;
                                aihfVarCreateBuilder.copyOnWrite();
                                altq altqVar4 = (altq) aihfVarCreateBuilder.instance;
                                altqVar4.b |= 16;
                                altqVar4.f = true;
                                altqVarD = (altq) aihfVarCreateBuilder.build();
                            }
                            hsd hsdVar2 = hsdVar;
                            if (!altqVarD.d) {
                                taf.j(afxd.f(hsdVar2.h.j(hsdVar2.d, str)).g(new gqa(hsdVar2, zwaVar2, 13), hsdVar2.f), new hou(i5));
                            }
                            if (altqVarD.d || !altqVarD.g) {
                                hsdVar2.l.a("PlaylistId: %s is up to date", str);
                                return;
                            }
                            agkh agkhVar2 = agkhVar;
                            agjz agjzVar2 = agjzVar;
                            int i6 = i4;
                            if (true != altqVarD.f) {
                                i6 = 1;
                            }
                            agjzVar2.h(str);
                            Integer numValueOf = Integer.valueOf(i6);
                            agkhVar2.e(str, numValueOf);
                            hsdVar2.l.a("Scheduled sync for playlistId: %s , downloadVideoStreamParam:%s", str, numValueOf);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    agke agkeVarG = agjzVar.g();
                    hry hryVar2 = hryVar;
                    hryVar2.d(agkeVarG);
                    hryVar2.e(agkhVar.d(false));
                    hryVar2.c(jOrElse);
                    return hryVar2.a();
                }
            }, this.g);
        }
        hryVar.d(agkeVar);
        hryVar.e((agkj) Collection.EL.stream(agkeVar).collect(aghu.a(new hrn(i3), new ccf(i, 2))));
        hryVar.c(-1L);
        return ahng.n(hryVar.a());
    }

    public final void e(String str) {
        agrx agrxVar = agso.a;
        this.t.e(new aahs(str));
    }

    public final void h(zwa zwaVar, weh wehVar) {
        wer werVarE = this.e.e(zwaVar).e();
        werVarE.e(wehVar);
        werVarE.b().k(new hmd(13)).s().D();
    }
}
