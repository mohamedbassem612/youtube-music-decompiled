package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.ComponentState;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.HybridElement;
import com.google.android.libraries.elements.interfaces.LegacyMaterializationResult;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import com.google.android.libraries.elements.interfaces.SubscriptionObserverConfig;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorResolver;
import com.google.common.util.concurrent.ListenableFuture;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hog implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hog(aakk aakkVar, wcn wcnVar, amsz amszVar, String str, String str2, File file, int i) {
        this.$cid = i;
        this.f = aakkVar;
        this.a = wcnVar;
        this.c = amszVar;
        this.e = str;
        this.b = str2;
        this.d = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, mzt] */
    /* JADX WARN: Type inference failed for: r13v4, types: [hoj] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, nxa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, nds] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v17, types: [aajv] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.Future] */
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
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strA;
        Object obj;
        mlg mlgVar;
        int i = this.$cid;
        int i2 = 16;
        ?? r5 = 0;
        int i3 = 1;
        if (i == 0) {
            agke agkeVar = (agke) ahng.v(this.c);
            boolean zBooleanValue = ((Boolean) ahng.v(this.d)).booleanValue();
            Optional optional = (Optional) ahng.v(this.e);
            aihf aihfVarCreateBuilder = asce.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asce asceVar = (asce) aihfVarCreateBuilder.instance;
            ?? r11 = this.b;
            ankd ankdVar = ((anjx) r11).c;
            ankdVar.getClass();
            asceVar.c = ankdVar;
            asceVar.b |= 1;
            Iterable iterable = (Iterable) Collection.EL.stream(agkeVar).map(new hnv(7)).collect(Collectors.toCollection(new hcd(9)));
            aihfVarCreateBuilder.copyOnWrite();
            asce asceVar2 = (asce) aihfVarCreateBuilder.instance;
            aiie aiieVar = asceVar2.d;
            if (!aiieVar.c()) {
                asceVar2.d = aihn.mutableCopy(aiieVar);
            }
            Object obj2 = this.a;
            aifs.addAll(iterable, asceVar2.d);
            ?? r13 = (hoj) obj2;
            ascf ascfVarE = r13.e(r11, agkeVar);
            aihfVarCreateBuilder.copyOnWrite();
            asce asceVar3 = (asce) aihfVarCreateBuilder.instance;
            ascfVarE.getClass();
            asceVar3.e = ascfVarE;
            asceVar3.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            asce asceVar4 = (asce) aihfVarCreateBuilder.instance;
            asceVar4.b |= 4;
            asceVar4.f = zBooleanValue;
            boolean zI = r13.j.i();
            aihfVarCreateBuilder.copyOnWrite();
            asce asceVar5 = (asce) aihfVarCreateBuilder.instance;
            asceVar5.b |= 8;
            asceVar5.g = zI;
            aihfVarCreateBuilder.copyOnWrite();
            asce asceVar6 = (asce) aihfVarCreateBuilder.instance;
            asceVar6.h = 1;
            asceVar6.b |= 16;
            float f = r13.e.getResources().getConfiguration().fontScale;
            aihfVarCreateBuilder.copyOnWrite();
            asce asceVar7 = (asce) aihfVarCreateBuilder.instance;
            asceVar7.b |= 64;
            asceVar7.j = f;
            hge hgeVar = new hge(aihfVarCreateBuilder, 6);
            if (true == optional.isPresent()) {
                Object obj3 = optional.get();
                aihf aihfVar = (aihf) hgeVar.a;
                aihfVar.copyOnWrite();
                asce asceVar8 = (asce) aihfVar.instance;
                asceVar8.i = (anqt) obj3;
                asceVar8.b |= 32;
            }
            ?? r0 = this.f;
            Object objIo = r13.d.io();
            asce asceVar9 = (asce) aihfVarCreateBuilder.build();
            ((afzv) objIo).i();
            almd almdVar = almd.a;
            r0.d((almd) ((BaseClient) objIo).f(399280626, asceVar9, aihn.getParserForClass(almd.class)));
        } else {
            if (i == 1) {
                ug ugVar = (ug) ahng.v(this.f);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((java.util.Collection) ahng.v(this.c));
                arrayList.addAll((java.util.Collection) ahng.v(this.d));
                arrayList.addAll((java.util.Collection) ahng.v(this.e));
                ((hng) this.a).f.f(4, this.b);
                atwh atwhVar = new atwh(null);
                atwhVar.a(arrayList);
                return (rv) ugVar.i(atwhVar.b()).get();
            }
            if (i == 2) {
                ?? r1 = this.a;
                int i4 = hpd.b;
                htg htgVar = new htg();
                Optional optional2 = (Optional) ahng.v(r1);
                if (optional2 == null) {
                    throw new NullPointerException("Null backingModel");
                }
                ?? r3 = this.f;
                htgVar.a = optional2;
                Optional optional3 = (Optional) ahng.v(r3);
                if (optional3 == null) {
                    throw new NullPointerException("Null downloadMetadata");
                }
                ?? r4 = this.c;
                htgVar.b = optional3;
                Optional optional4 = (Optional) ahng.v(r4);
                if (optional4 == null) {
                    throw new NullPointerException("Null playbackData");
                }
                ?? r6 = this.b;
                ?? r7 = this.e;
                ?? r2 = this.d;
                htgVar.c = optional4;
                htgVar.d((Optional) ahng.v(r2));
                htgVar.b((Optional) ahng.v(r7));
                htgVar.c((Optional) ahng.v(r6));
                return htgVar.a();
            }
            if (i != 3) {
                if (i != 4) {
                    String str = ((amsz) this.c).f;
                    String absolutePath = ((File) this.d).getAbsolutePath();
                    amta amtaVarE = amtc.e((String) this.e);
                    amtaVarE.an((String) this.b);
                    amtaVarE.am(absolutePath);
                    wej wejVarA = aaje.a(new agqj(str), wej.a);
                    wer werVarE = this.a.e();
                    werVarE.n(amtaVarE, wejVarA);
                    return werVarE.b().r(((aakk) this.f).a).B(avmc.t(amtaVarE.ao()));
                }
                final mmv mmvVar = (mmv) this.f;
                final String strE = mmvVar.h.a() ? npi.e(this.d) : null;
                final ?? r12 = this.c;
                Object obj4 = this.e;
                agev agevVar = mmvVar.a;
                boolean zN = r12.n();
                ByteStore byteStore = (ByteStore) ((awmd) ((agfa) agevVar).a).io();
                if (zN) {
                    mrl mrlVar = mmvVar.c;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < r12.h(); i5++) {
                        arrayList2.add(Integer.valueOf(r12.g(i5)));
                    }
                    mlgVar = new mlg(mrlVar.e((nsl) obj4, new omj((Iterable) arrayList2)));
                } else {
                    mlgVar = null;
                }
                SubscriptionObserverConfig subscriptionObserverConfig = new SubscriptionObserverConfig(mmvVar.f, mmvVar.i ? Integer.valueOf(((nsl) obj4).z) : null, false, r12.m() && mmvVar.m, mmvVar.n, mmvVar.p);
                final nsl nslVar = (nsl) obj4;
                final SubscriptionProcessorResolver subscriptionProcessorResolver = (SubscriptionProcessorResolver) SubscriptionProcessorResolver.create(byteStore, mlgVar, nslVar.F, subscriptionObserverConfig).a(new mmr(2));
                awmd awmdVar = (awmd) mmvVar.e.f();
                SubscriptionProcessorRegistrar subscriptionProcessorRegistrar = awmdVar != null ? (SubscriptionProcessorRegistrar) awmdVar.io() : null;
                if (subscriptionProcessorRegistrar != null) {
                    subscriptionProcessorRegistrar.registerProcessors(subscriptionProcessorResolver, subscriptionObserverConfig, nslVar.G, nslVar.H);
                }
                final ?? r14 = this.b;
                final fhd fhdVar = (fhd) this.a;
                return avlr.o(new avlt() { // from class: mmt
                    /* JADX WARN: Code duplicated, block: B:106:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:74:0x0277 A[Catch: all -> 0x0320, TryCatch #0 {, blocks: (B:72:0x0273, B:74:0x0277, B:75:0x0283), top: B:106:0x0273 }] */
                    /* JADX WARN: Failed to calculate best type for var: r17v0 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: mmq
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r17v0 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: mmq
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r17v0 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: mmq
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r17v0 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: mmq
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v1 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v1 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v1 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v1 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v11 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v11 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v11 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v11 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v11 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v11 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v11 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v11 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v12 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v12 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v12 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v12 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v13 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v13 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v13 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v13 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v14 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v14 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v14 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v14 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v15 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v15 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v15 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v15 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v5 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v5 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v5 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v5 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v6 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v6 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v6 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v6 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v6 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v6 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v6 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v6 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v8 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v8 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v8 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v8 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v8 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v8 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v8 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v8 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r19v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v40 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v40 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v40 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v40 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r4v9 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v9 ??, new type: assc
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r15v0 ??
                    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
                    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
                    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
                    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
                    	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:280)
                    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
                    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
                    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
                    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
                    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
                    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /* JADX WARN: Type inference failed for: r17v0, types: [com.google.android.libraries.elements.interfaces.ComponentObserver, mmq] */
                    /* JADX WARN: Type inference failed for: r19v0 */
                    /* JADX WARN: Type inference failed for: r19v1 */
                    /* JADX WARN: Type inference failed for: r19v10 */
                    /* JADX WARN: Type inference failed for: r19v11 */
                    /* JADX WARN: Type inference failed for: r19v12 */
                    /* JADX WARN: Type inference failed for: r19v13 */
                    /* JADX WARN: Type inference failed for: r19v14 */
                    /* JADX WARN: Type inference failed for: r19v15 */
                    /* JADX WARN: Type inference failed for: r19v2, types: [assc] */
                    /* JADX WARN: Type inference failed for: r19v5 */
                    /* JADX WARN: Type inference failed for: r19v6, types: [assc] */
                    /* JADX WARN: Type inference failed for: r19v8, types: [assc] */
                    /* JADX WARN: Type inference failed for: r19v9, types: [assc] */
                    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.libraries.elements.interfaces.Component] */
                    /* JADX WARN: Type inference failed for: r4v10, types: [assc] */
                    /* JADX WARN: Type inference failed for: r4v40 */
                    /* JADX WARN: Type inference failed for: r4v9 */
                    @Override // defpackage.avlt
                    public final void a(avls avlsVar) throws Throwable {
                        ComponentState componentState;
                        HybridElement hybridElementCopyFromNative;
                        ?? r19;
                        mus musVar;
                        ?? r110;
                        int materializationNumber;
                        mus musVar2;
                        MaterializationResult materializationResult;
                        Status statusB;
                        nay nayVar;
                        nxa nxaVar;
                        Component component;
                        nsl nslVar2;
                        ?? r111;
                        ?? r112;
                        npg npgVar;
                        mma mmaVar;
                        asrl asrlVarC;
                        fhd fhdVar2 = fhdVar;
                        mlf mlfVar = (mlf) fhdVar2.l(mlf.class);
                        SubscriptionProcessorResolver subscriptionProcessorResolver2 = subscriptionProcessorResolver;
                        mzt mztVar = r12;
                        nsl nslVar3 = nslVar;
                        final mmv mmvVar2 = mmvVar;
                        if (mlfVar != null) {
                            ComponentState componentStateB = mlfVar.b(nslVar3.n);
                            if (componentStateB == null) {
                                componentStateB = ComponentState.create(mmvVar2.o);
                            }
                            componentState = componentStateB;
                        } else {
                            componentState = null;
                        }
                        try {
                            if (mztVar.i() == 0) {
                                hybridElementCopyFromNative = HybridElement.create(mztVar.k());
                            } else {
                                long jI = mztVar.i();
                                MaterializationResult materializationResult2 = nslVar3.B;
                                hybridElementCopyFromNative = materializationResult2 == null ? HybridElement.copyFromNative(jI) : HybridElement.createFromNative(jI, materializationResult2);
                            }
                            if (hybridElementCopyFromNative != null) {
                                final ?? r8 = (Component) Component.createWithElement(hybridElementCopyFromNative, subscriptionProcessorResolver2, (ComponentSharedResources) mmvVar2.k.io(), mmvVar2.d, componentState, null).a(new mmr(0));
                                if (mlfVar != null && componentState != null && !componentState.isEmpty()) {
                                    mlfVar.c(nslVar3.n, componentState);
                                }
                                nsu nsuVar = mmvVar2.h;
                                final npg npgVar2 = nsuVar.a() ? new npg(strE, r8) : null;
                                nxa nxaVar2 = r14;
                                String templateUri = r8.getTemplateUri();
                                nxaVar2.f(templateUri);
                                if (!TextUtils.isEmpty(templateUri)) {
                                    nslVar3.g(templateUri, "|");
                                }
                                ?? mmqVar = new mmq(nxaVar2, r8, nslVar3, avlsVar, npgVar2, nsuVar, mmvVar2.g, mmvVar2.j, templateUri, mmvVar2.l, fhdVar2);
                                r8.setObserver(mmqVar);
                                nsu nsuVar2 = mmqVar.f;
                                ?? D = nsuVar2.b() ? npi.d((DebuggerClient) mmqVar.g.io(), mmqVar.c) : 0;
                                String str2 = mmqVar.i;
                                String strConcat = "templateResolve:".concat(String.valueOf(str2));
                                if (strConcat.length() > 127) {
                                    strConcat.substring(0, 127);
                                }
                                try {
                                    nxa nxaVar3 = mmqVar.a;
                                    nxaVar3.h();
                                    if (D != 0) {
                                        aihf aihfVarCreateBuilder2 = assg.a.createBuilder();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        assg assgVar = (assg) aihfVarCreateBuilder2.instance;
                                        assgVar.c = D;
                                        assgVar.b |= 1;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        assg assgVar2 = (assg) aihfVarCreateBuilder2.instance;
                                        str2.getClass();
                                        assgVar2.b |= 2;
                                        assgVar2.d = str2;
                                        assg assgVar3 = (assg) aihfVarCreateBuilder2.build();
                                        DebuggerClient debuggerClient = (DebuggerClient) mmqVar.g.io();
                                        aihf aihfVarCreateBuilder3 = assh.a.createBuilder();
                                        aijp aijpVarB = npi.b();
                                        aihfVarCreateBuilder3.copyOnWrite();
                                        assh asshVar = (assh) aihfVarCreateBuilder3.instance;
                                        aijpVarB.getClass();
                                        asshVar.e = aijpVarB;
                                        asshVar.b |= 1;
                                        aihfVarCreateBuilder3.copyOnWrite();
                                        assh asshVar2 = (assh) aihfVarCreateBuilder3.instance;
                                        assgVar3.getClass();
                                        asshVar2.d = assgVar3;
                                        asshVar2.c = 2;
                                        debuggerClient.sendTimelineEvent(((assh) aihfVarCreateBuilder3.build()).toByteArray());
                                    }
                                    boolean z = mmqVar.h;
                                    Component component2 = mmqVar.b;
                                    try {
                                        if (z) {
                                            StatusOr statusOrMaterializeWithResult = component2.materializeWithResult(true);
                                            if (statusOrMaterializeWithResult.hasValue) {
                                                MaterializationResult materializationResult3 = (MaterializationResult) statusOrMaterializeWithResult.value;
                                                if (materializationResult3 == null || materializationResult3.size() == 0) {
                                                    nud nudVar = new nud("Error materializing SharedComponentType: No FBS result.");
                                                    mmqVar.d.g(nudVar);
                                                    statusB = Status.b(nudVar);
                                                    nayVar = null;
                                                    r111 = D;
                                                    nslVar2 = mmqVar.c;
                                                    nxaVar = nxaVar3;
                                                    component = component2;
                                                    mmqVar.a(nxaVar, r111, component, nayVar, nslVar2);
                                                } else {
                                                    materializationNumber = materializationResult3.materializationNumber();
                                                    musVar2 = new mus(ahuj.q(ByteBuffer.wrap(materializationResult3.getElement())));
                                                    r112 = D;
                                                    materializationResult = materializationResult3;
                                                    try {
                                                        Component component3 = mmqVar.b;
                                                        npgVar = mmqVar.e;
                                                        if (nsuVar2.a() && npgVar != null && (asrlVarC = npi.c(musVar2, nwl.a(component3.debugLatestModel()), component3.latestSubscriptionConfig(), npgVar.c, mmqVar.j)) != null) {
                                                            npgVar.c(asrlVarC);
                                                        }
                                                        mmaVar = new mma(musVar2, materializationResult, npgVar);
                                                        mmqVar.a(mmqVar.a, r112, mmqVar.b, musVar2, mmqVar.c);
                                                        synchronized (mmqVar) {
                                                            if (materializationNumber > mmqVar.l) {
                                                                mmqVar.l = materializationNumber;
                                                                mmqVar.k.q();
                                                                mmqVar.d.c(mmaVar);
                                                            }
                                                        }
                                                        statusB = Status.OK;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        musVar = musVar2;
                                                        r110 = r112;
                                                        mmqVar.a(mmqVar.a, r110, mmqVar.b, musVar, mmqVar.c);
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                ?? r113 = D;
                                                nud nudVar2 = new nud(a.cp(statusOrMaterializeWithResult.status, "Error materializing SharedComponentType: "), statusOrMaterializeWithResult.status.asException());
                                                mmqVar.d.g(nudVar2);
                                                Status statusB2 = Status.b(nudVar2);
                                                mmqVar.a(nxaVar3, r113, component2, null, mmqVar.c);
                                                statusB = statusB2;
                                            }
                                        } else {
                                            ?? r114 = D;
                                            StatusOr statusOrMaterialize = component2.materialize(true);
                                            LegacyMaterializationResult legacyMaterializationResult = (LegacyMaterializationResult) statusOrMaterialize.value;
                                            if (legacyMaterializationResult == null) {
                                                nud nudVar3 = new nud(a.cp(statusOrMaterialize.status, "Error materializing SharedComponentType: "), statusOrMaterialize.status.asException());
                                                mmqVar.d.g(nudVar3);
                                                statusB = Status.b(nudVar3);
                                                nayVar = null;
                                                nxaVar = nxaVar3;
                                                component = component2;
                                                nslVar2 = mmqVar.c;
                                                r111 = r114;
                                                mmqVar.a(nxaVar, r111, component, nayVar, nslVar2);
                                            } else {
                                                materializationNumber = legacyMaterializationResult.getMaterializationNumber();
                                                musVar2 = new mus(ahuj.q(ByteBuffer.wrap(legacyMaterializationResult.getElement())));
                                                materializationResult = null;
                                                r112 = r114;
                                                Component component4 = mmqVar.b;
                                                npgVar = mmqVar.e;
                                                if (nsuVar2.a()) {
                                                    npgVar.c(asrlVarC);
                                                }
                                                mmaVar = new mma(musVar2, materializationResult, npgVar);
                                                mmqVar.a(mmqVar.a, r112, mmqVar.b, musVar2, mmqVar.c);
                                                synchronized (mmqVar) {
                                                    if (materializationNumber > mmqVar.l) {
                                                        mmqVar.l = materializationNumber;
                                                        mmqVar.k.q();
                                                        mmqVar.d.c(mmaVar);
                                                    }
                                                    statusB = Status.OK;
                                                }
                                            }
                                        }
                                        final nsl nslVar4 = nslVar;
                                        if (!statusB.e()) {
                                            aihf aihfVarCreateBuilder4 = asnb.a.createBuilder();
                                            int iValue = statusB.getCode().value();
                                            aihfVarCreateBuilder4.copyOnWrite();
                                            asnb asnbVar = (asnb) aihfVarCreateBuilder4.instance;
                                            asnbVar.b |= 1;
                                            asnbVar.c = iValue;
                                            if (!ahno.aa(statusB.getDescription())) {
                                                String description = statusB.getDescription();
                                                aihfVarCreateBuilder4.copyOnWrite();
                                                asnb asnbVar2 = (asnb) aihfVarCreateBuilder4.instance;
                                                description.getClass();
                                                asnbVar2.b |= 2;
                                                asnbVar2.d = description;
                                            }
                                            aihf aihfVarCreateBuilder5 = asnc.a.createBuilder();
                                            aslh aslhVar = aslh.LOG_TYPE_INTERNAL_ERROR;
                                            aihfVarCreateBuilder5.copyOnWrite();
                                            asnc asncVar = (asnc) aihfVarCreateBuilder5.instance;
                                            asncVar.d = aslhVar.I;
                                            asncVar.b |= 2;
                                            aihfVarCreateBuilder5.copyOnWrite();
                                            asnc asncVar2 = (asnc) aihfVarCreateBuilder5.instance;
                                            asnb asnbVar3 = (asnb) aihfVarCreateBuilder4.build();
                                            asnbVar3.getClass();
                                            asncVar2.j = asnbVar3;
                                            asncVar2.b |= 64;
                                            mmvVar2.b.g((asnc) aihfVarCreateBuilder5.build(), nslVar4, statusB.p, "componentDidUpdate error.", new Object[0]);
                                        }
                                        avlsVar.d(new avnh() { // from class: mms
                                            @Override // defpackage.avnh
                                            public final void a() {
                                                Component component5 = r8;
                                                component5.setObserver(null);
                                                npg npgVar3 = npgVar2;
                                                if (npgVar3 != null) {
                                                    npgVar3.b();
                                                }
                                                Status statusDispose = component5.dispose();
                                                if (statusDispose.e()) {
                                                    return;
                                                }
                                                aihf aihfVarCreateBuilder6 = asnb.a.createBuilder();
                                                int iValue2 = statusDispose.getCode().value();
                                                aihfVarCreateBuilder6.copyOnWrite();
                                                asnb asnbVar4 = (asnb) aihfVarCreateBuilder6.instance;
                                                asnbVar4.b |= 1;
                                                asnbVar4.c = iValue2;
                                                if (!ahno.aa(statusDispose.getDescription())) {
                                                    String description2 = statusDispose.getDescription();
                                                    aihfVarCreateBuilder6.copyOnWrite();
                                                    asnb asnbVar5 = (asnb) aihfVarCreateBuilder6.instance;
                                                    description2.getClass();
                                                    asnbVar5.b |= 2;
                                                    asnbVar5.d = description2;
                                                }
                                                nsl nslVar5 = nslVar4;
                                                mmv mmvVar3 = mmvVar2;
                                                aihf aihfVarCreateBuilder7 = asnc.a.createBuilder();
                                                aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_ERROR;
                                                aihfVarCreateBuilder7.copyOnWrite();
                                                asnc asncVar3 = (asnc) aihfVarCreateBuilder7.instance;
                                                asncVar3.d = aslhVar2.I;
                                                asncVar3.b |= 2;
                                                aihfVarCreateBuilder7.copyOnWrite();
                                                asnc asncVar4 = (asnc) aihfVarCreateBuilder7.instance;
                                                asnb asnbVar6 = (asnb) aihfVarCreateBuilder6.build();
                                                asnbVar6.getClass();
                                                asncVar4.j = asnbVar6;
                                                asncVar4.b |= 64;
                                                mmvVar3.b.g((asnc) aihfVarCreateBuilder7.build(), nslVar5, statusDispose.p, "Error disposing Component.", new Object[0]);
                                            }
                                        });
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        musVar = null;
                                        r110 = r19;
                                        mmqVar.a(mmqVar.a, r110, mmqVar.b, musVar, mmqVar.c);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r19 = D;
                                }
                            } else {
                                try {
                                    throw new nud("Failed to create C++ Component");
                                } catch (nud e) {
                                    e = e;
                                }
                            }
                        } catch (nud e2) {
                            e = e2;
                        }
                        avlsVar.b(e);
                    }
                }).y(new jgq(r14, 15)).l(new tzg(new jgq(r14, i2), i3)).v(new hoi(r14, 10));
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) ahng.v(this.a);
            ?? r8 = this.e;
            if (mediaBrowserCompat$MediaItem != null) {
                r8.add(mediaBrowserCompat$MediaItem);
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) ahng.v(this.f);
            if (mediaBrowserCompat$MediaItem2 != null) {
                r8.add(mediaBrowserCompat$MediaItem2);
            }
            ?? r9 = this.b;
            kyr kyrVar = (kyr) ahng.v(this.c);
            if (kyrVar != null && (obj = kyrVar.b) != null) {
                r8.add(obj);
                String strA2 = ((MediaBrowserCompat$MediaItem) obj).a();
                if (strA2 != null) {
                    r9.put(strA2, kyrVar.a);
                }
            }
            for (Pair pair : (List) ahng.v(this.d)) {
                r8.add((MediaBrowserCompat$MediaItem) pair.first);
                if (((MediaBrowserCompat$MediaItem) pair.first).b() && (strA = ((MediaBrowserCompat$MediaItem) pair.first).a()) != null) {
                    r9.put(strA, (List) pair.second);
                }
            }
            r5 = r9;
            if (!r8.isEmpty()) {
                r9.put(gzl.a, r8);
                return r9;
            }
        }
        return r5;
    }

    public /* synthetic */ hog(ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, Map map, ListenableFuture listenableFuture4, int i) {
        this.$cid = i;
        this.a = listenableFuture;
        this.e = list;
        this.f = listenableFuture2;
        this.c = listenableFuture3;
        this.b = map;
        this.d = listenableFuture4;
    }

    public /* synthetic */ hog(hoj hojVar, anjx anjxVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, mbb mbbVar, int i) {
        this.$cid = i;
        this.a = hojVar;
        this.b = anjxVar;
        this.c = listenableFuture;
        this.d = listenableFuture2;
        this.e = listenableFuture3;
        this.f = mbbVar;
    }

    public /* synthetic */ hog(Object obj, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.f = listenableFuture;
        this.c = listenableFuture2;
        this.d = listenableFuture3;
        this.e = listenableFuture4;
        this.b = obj2;
    }

    public /* synthetic */ hog(mmv mmvVar, fhd fhdVar, nsl nslVar, mzt mztVar, nds ndsVar, nxa nxaVar, int i) {
        this.$cid = i;
        this.f = mmvVar;
        this.a = fhdVar;
        this.e = nslVar;
        this.c = mztVar;
        this.d = ndsVar;
        this.b = nxaVar;
    }
}
