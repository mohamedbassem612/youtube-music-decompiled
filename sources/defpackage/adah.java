package defpackage;

import com.google.android.apps.youtube.music.blocks.QueryEngineContainer;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.ClientCreatorProxy;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Queries;
import com.google.android.libraries.elements.interfaces.QueriesSubscriptionProcessorRegistrar;
import com.google.android.libraries.youtube.blocks.BlocksLogger;
import com.google.android.libraries.youtube.blocks.BlocksRuntimeProxy;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adah {
    private final awmd a;
    private final Optional b;
    private final wco d;
    private final zwb e;
    private zwa h;
    private final awmd i;
    private final vxz j;
    private Optional c = Optional.empty();
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();

    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [awmd, java.lang.Object] */
    public adah(awmd awmdVar, awmd awmdVar2, vxz vxzVar, Optional optional, wco wcoVar, zwb zwbVar, alol alolVar, awmd awmdVar3, awmd awmdVar4) {
        this.a = awmdVar;
        this.j = vxzVar;
        this.d = wcoVar;
        this.i = awmdVar2;
        this.e = zwbVar;
        if (alolVar != alol.ANDROID_MUSIC && !vxzVar.l(10, 45363848L, false)) {
            this.b = Optional.empty();
            return;
        }
        optional.isPresent();
        meg.a();
        aihh aihhVar = (aihh) asbq.a.createBuilder();
        aihl aihlVar = asbx.b;
        aihh aihhVar2 = (aihh) asbx.a.createBuilder();
        boolean zL = vxzVar.l(57, 45383400L, false);
        aihhVar2.copyOnWrite();
        asbx asbxVar = (asbx) aihhVar2.instance;
        asbxVar.c |= 1;
        asbxVar.d = zL;
        boolean zL2 = vxzVar.l(58, 45383401L, false);
        aihhVar2.copyOnWrite();
        asbx asbxVar2 = (asbx) aihhVar2.instance;
        asbxVar2.c |= 2;
        asbxVar2.e = zL2;
        long jC = vxzVar.c(8, 45383402L, 0L);
        aihhVar2.copyOnWrite();
        asbx asbxVar3 = (asbx) aihhVar2.instance;
        asbxVar3.c |= 4;
        asbxVar3.f = jC;
        aihl aihlVar2 = asby.b;
        aihh aihhVar3 = (aihh) asby.a.createBuilder();
        aihhVar3.copyOnWrite();
        asby asbyVar = (asby) aihhVar3.instance;
        asbyVar.e |= 1;
        asbyVar.f = 391428752;
        aihhVar2.e(aihlVar2, (asby) aihhVar3.build());
        aihhVar.e(aihlVar, (asbx) aihhVar2.build());
        asbq asbqVar = (asbq) aihhVar.build();
        if (vxzVar.l(22, 45367089L, false)) {
            this.b = Optional.of(new aher(((QueryEngineContainer) optional.get().io()).d(asbqVar, (asbr) ((wag) awmdVar4.io()).c(391428752).io(), null)));
        } else {
            BlocksRuntimeProxy.setLogger((BlocksLogger) awmdVar3.io());
            this.b = Optional.of(new aher(((QueryEngineContainer) optional.get().io()).c(asbqVar, null)));
            c();
        }
    }

    private final synchronized agct b(Container container, ByteStore byteStore, wcn wcnVar) {
        byte[] byteArray;
        ClientCreatorProxy clientCreatorProxy;
        byte[] bArr = (byte[]) Queries.createByteStoreBlock(container, byteStore).a(new miu(2));
        aihf aihfVarCreateBuilder = asuh.a.createBuilder();
        try {
            astv astvVar = (astv) aihn.parseFrom(astv.a, bArr, ExtensionRegistryLite.a);
            aihfVarCreateBuilder.copyOnWrite();
            asuh asuhVar = (asuh) aihfVarCreateBuilder.instance;
            astvVar.getClass();
            asuhVar.c = astvVar;
            asuhVar.b = 2;
            agcr agcrVar = (agcr) container.b(new agcq(), new hpc(wcnVar, 10));
            aihf aihfVarCreateBuilder2 = asua.a.createBuilder();
            String strH = agcrVar.h();
            aihfVarCreateBuilder2.copyOnWrite();
            asua asuaVar = (asua) aihfVarCreateBuilder2.instance;
            strH.getClass();
            asuaVar.b |= 4;
            asuaVar.d = strH;
            String strG = agcrVar.g();
            aihfVarCreateBuilder2.copyOnWrite();
            asua asuaVar2 = (asua) aihfVarCreateBuilder2.instance;
            strG.getClass();
            asuaVar2.b |= 2;
            asuaVar2.c = strG;
            asua asuaVar3 = (asua) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asuh asuhVar2 = (asuh) aihfVarCreateBuilder.instance;
            asuaVar3.getClass();
            asuhVar2.g = asuaVar3;
            asuhVar2.f = 6;
            try {
                asue asueVar = (asue) aihn.parseFrom(asue.a, (byte[]) Queries.createEnvironmentDataBlock(container, new mlg(((mrl) this.i.io()).e(nsl.b().a(), new omj((Iterable) agpi.a)))).a(new miu(3)), ExtensionRegistryLite.a);
                aihfVarCreateBuilder.copyOnWrite();
                asuh asuhVar3 = (asuh) aihfVarCreateBuilder.instance;
                asueVar.getClass();
                asuhVar3.e = asueVar;
                asuhVar3.d = 4;
                agcu agcuVar = (agcu) container.a(new afyw(3));
                asuh asuhVar4 = (asuh) aihfVarCreateBuilder.build();
                InstanceProxy instanceProxyD = agcuVar.d();
                if (instanceProxyD instanceof agcw) {
                    agcv agcvVar = ((agcw) instanceProxyD).a;
                }
                asui asuiVar = asui.a;
                aihf aihfVarCreateBuilder3 = asug.a.createBuilder();
                aihf aihfVarCreateBuilder4 = asty.a.createBuilder();
                String strH2 = agcuVar.h();
                aihfVarCreateBuilder4.copyOnWrite();
                asty astyVar = (asty) aihfVarCreateBuilder4.instance;
                strH2.getClass();
                astyVar.b |= 4;
                astyVar.d = strH2;
                String strG2 = agcuVar.g();
                aihfVarCreateBuilder4.copyOnWrite();
                asty astyVar2 = (asty) aihfVarCreateBuilder4.instance;
                strG2.getClass();
                astyVar2.b |= 2;
                astyVar2.c = strG2;
                asty astyVar3 = (asty) aihfVarCreateBuilder4.build();
                aihfVarCreateBuilder3.copyOnWrite();
                asug asugVar = (asug) aihfVarCreateBuilder3.instance;
                astyVar3.getClass();
                asugVar.c = astyVar3;
                asugVar.b = 4;
                byteArray = ((asug) aihfVarCreateBuilder3.build()).toByteArray();
                clientCreatorProxy = container.a;
            } catch (aiik e) {
                throw new IllegalStateException(e);
            }
        } catch (aiik e2) {
            throw new IllegalStateException(e2);
        }
        return new agct(clientCreatorProxy.nativeCreateBlockWithArgs(clientCreatorProxy.a, 378026398, byteArray));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Future] */
    private final synchronized void c() {
        Optional optional = this.b;
        if (!optional.isEmpty()) {
            zwa zwaVarE = this.e.e();
            zwa zwaVar = this.h;
            if (zwaVar == null || !zik.cq(zwaVar, zwaVarE)) {
                this.h = zwaVarE;
                if (optional.isEmpty()) {
                    throw new IllegalStateException("Should not be called when container is empty.");
                }
                Container container = (Container) taf.b(optional.get(), new abzy(5));
                if (this.f.isPresent()) {
                    ((BaseClient) this.f.get()).close();
                }
                Optional optionalOf = Optional.of(b(container, (ByteStore) this.a.io(), this.d.b(zwaVarE)));
                this.f = optionalOf;
                Object obj = optionalOf.get();
                aihf aihfVarCreateBuilder = asuj.a.createBuilder();
                String strH = ((BaseClient) obj).h();
                aihfVarCreateBuilder.copyOnWrite();
                asuj asujVar = (asuj) aihfVarCreateBuilder.instance;
                strH.getClass();
                asujVar.b |= 1;
                asujVar.c = strH;
                this.g = Optional.of((QueriesSubscriptionProcessorRegistrar) QueriesSubscriptionProcessorRegistrar.create(container, ((asuj) aihfVarCreateBuilder.build()).toByteArray()).a(new miu(4)));
                if (this.j.l(555, 478844625L, false)) {
                    if (this.c.isPresent()) {
                        ((BaseClient) this.c.get()).close();
                    }
                    this.c = Optional.of((agcn) container.a(new afyq(18)));
                }
            }
        }
    }

    public final Optional a() {
        Optional optional;
        if (this.b.isEmpty()) {
            return Optional.empty();
        }
        synchronized (this) {
            c();
            optional = this.g;
        }
        return optional;
    }
}
