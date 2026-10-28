package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vmx extends zsz {
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/engagement/like/LikeDelayedEventDispatcher");
    public final awmd a;
    public final Executor b;
    public final vxz c;
    private final awmd e;
    private final awmd f;
    private final zwb g;
    private final ahud h;

    public vmx(awmd awmdVar, awmd awmdVar2, Executor executor, awmd awmdVar3, zwb zwbVar, vxz vxzVar) {
        super(8);
        this.e = awmdVar;
        this.a = awmdVar2;
        this.b = executor;
        this.f = awmdVar3;
        this.g = zwbVar;
        this.c = vxzVar;
        this.h = new ahud((short[]) null);
    }

    public static final amlg g(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        amlg amlgVarA = amlg.a(((amla) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).f);
        return amlgVarA == null ? amlg.LIKE : amlgVarA;
    }

    public static final String h(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        amlh amlhVar = ((amla) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).g;
        if (amlhVar == null) {
            amlhVar = amlh.a;
        }
        return amlhVar.c;
    }

    @Override // defpackage.zsz
    public final zsa a() {
        return new zxm(this, 1);
    }

    public final ListenableFuture b(ajwo ajwoVar, zwa zwaVar, boolean z) {
        vmx vmxVar;
        ajwo ajwoVar2;
        int i;
        zwa zwaVar2;
        ListenableFuture listenableFutureAr;
        wqm wqmVar = (wqm) this.e.io();
        ListenableFuture listenableFutureM = ahng.m(new IllegalArgumentException("Missing LikeStatus."));
        int iOrdinal = g(ajwoVar).ordinal();
        if (iOrdinal == 0) {
            vmxVar = this;
            ajwoVar2 = ajwoVar;
            i = true != z ? 2 : 3;
            wqo wqoVar = new wqo(wqmVar.b, zwaVar);
            wqoVar.e(ajwoVar2);
            aihf aihfVarCreateBuilder = apkf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            apkf apkfVar = (apkf) aihfVarCreateBuilder.instance;
            apkfVar.c = i - 1;
            apkfVar.b |= 1;
            wqoVar.G((apkf) aihfVarCreateBuilder.build());
            zwaVar2 = zwaVar;
            listenableFutureAr = ahno.ar(wqmVar.g(wqoVar, MoreExecutors.directExecutor()), new hco(vmxVar, ajwoVar2, zwaVar2, 11, (char[]) null), vmxVar.b);
        } else if (iOrdinal == 1) {
            vmxVar = this;
            ajwoVar2 = ajwoVar;
            i = true != z ? 2 : 3;
            wqn wqnVar = new wqn(wqmVar.b, zwaVar);
            wqnVar.e(ajwoVar2);
            aihf aihfVarCreateBuilder2 = apkf.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            apkf apkfVar2 = (apkf) aihfVarCreateBuilder2.instance;
            apkfVar2.c = i - 1;
            apkfVar2.b |= 1;
            wqnVar.G((apkf) aihfVarCreateBuilder2.build());
            zwaVar2 = zwaVar;
            listenableFutureAr = ahno.ar(wqmVar.d(wqnVar, MoreExecutors.directExecutor()), new hco(vmxVar, ajwoVar2, zwaVar2, 12, (char[]) null), vmxVar.b);
        } else if (iOrdinal != 2) {
            ajwoVar2 = ajwoVar;
            zwaVar2 = zwaVar;
            listenableFutureAr = listenableFutureM;
            vmxVar = this;
        } else {
            i = true != z ? 2 : 3;
            wqp wqpVar = new wqp(wqmVar.b, zwaVar);
            wqpVar.e(ajwoVar);
            aihf aihfVarCreateBuilder3 = apkf.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            apkf apkfVar3 = (apkf) aihfVarCreateBuilder3.instance;
            apkfVar3.c = i - 1;
            apkfVar3.b |= 1;
            wqpVar.G((apkf) aihfVarCreateBuilder3.build());
            ListenableFuture listenableFutureH = wqmVar.h(wqpVar, MoreExecutors.directExecutor());
            vmxVar = this;
            ajwoVar2 = ajwoVar;
            zwaVar2 = zwaVar;
            listenableFutureAr = ahno.ar(listenableFutureH, new hco(vmxVar, ajwoVar2, zwaVar2, 13, (char[]) null), vmxVar.b);
        }
        taf.h(listenableFutureAr, vmxVar.b, new gwc(vmxVar, ajwoVar2, zwaVar2, 7));
        return listenableFutureAr;
    }

    @Override // defpackage.zsz
    public final String c() {
        return "likes";
    }

    @Override // defpackage.zsz
    public final void d(String str, zsr zsrVar, List list) {
        final zwa zwaVarF = this.g.f(str);
        if (zwaVarF != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aihf aihfVar = (aihf) it.next();
                try {
                    final ajwo ajwoVar = (ajwo) aihn.parseFrom(ajwo.a, ((jrc) aihfVar.instance).e, ExtensionRegistryLite.getGeneratedRegistry());
                    akku akkuVarA = akku.a(((jrc) aihfVar.instance).l);
                    if (akkuVarA == null) {
                        akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                    }
                    final boolean z = akkuVarA != akku.DELAYED_EVENT_TIER_IMMEDIATE;
                    final long jC = this.c.c(4, 45673319L, 0L);
                    this.h.T(new ahcx() { // from class: vmv
                        @Override // defpackage.ahcx
                        public final ListenableFuture a() {
                            vmx vmxVar = this.a;
                            ajwo ajwoVar2 = ajwoVar;
                            zwa zwaVar = zwaVarF;
                            boolean z2 = z;
                            if (z2) {
                                long j = jC;
                                if (j > 0) {
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    avmb avmbVarA = awlg.a();
                                    timeUnit.getClass();
                                    avmbVarA.getClass();
                                    awhw awhwVar = new awhw(j, timeUnit, avmbVarA);
                                    avnn avnnVar = atqp.o;
                                    return ahno.as(tzk.b(awhwVar), new qzc(vmxVar, ajwoVar2, zwaVar, 9, (char[]) null), vmxVar.b);
                                }
                            }
                            return vmxVar.b(ajwoVar2, zwaVar, z2);
                        }
                    }, this.b);
                } catch (aiik e) {
                    ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/engagement/like/LikeDelayedEventDispatcher", "dispatchEvents", 'p', "LikeDelayedEventDispatcher.java")).t("dispatchEvents cannot deserialize proto.");
                }
            }
        }
    }

    public final void e(agke agkeVar, zwa zwaVar) {
        hfp hfpVar = (hfp) this.f.io();
        HashMap map = new HashMap();
        Collection.EL.stream(agkeVar).filter(new uvm(10)).forEach(new usf(map, 19));
        hpy hpyVar = hfpVar.a;
        if (hpyVar.i()) {
            afxd afxdVarF = afxd.f(hpyVar.b((List) Collection.EL.stream(map.keySet()).map(new bwa(12)).collect(Collectors.toCollection(new hcd(2)))));
            hlk hlkVar = new hlk(hfpVar, zwaVar, map, 1);
            Executor executor = hfpVar.c;
            taf.i(afxdVarF.h(hlkVar, executor), executor, new glo(16), new gsu(hfpVar, zwaVar, map, 7), null);
        }
    }

    @Override // defpackage.zsz
    public final void f(String str, List list) {
        zwa zwaVarF = this.g.f(str);
        if (zwaVarF != null) {
            agjz agjzVar = new agjz(4);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    agjzVar.h((ajwo) aihn.parseFrom(ajwo.a, ((jrc) ((aihf) it.next()).instance).e, ExtensionRegistryLite.getGeneratedRegistry()));
                } catch (aiik e) {
                    ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/engagement/like/LikeDelayedEventDispatcher", "cleanUpExpiredEvents", (char) 131, "LikeDelayedEventDispatcher.java")).t("cleanupExpiredEvents cannot deserialize proto.");
                }
            }
            e(agjzVar.g(), zwaVarF);
        }
    }
}
