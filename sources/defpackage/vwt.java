package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.libraries.blocks.Container;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwt {
    public final Object a;

    public vwt(ahto ahtoVar, abwk abwkVar, avlr avlrVar, tth tthVar, vxz vxzVar) {
        this.a = avlh.g(tzk.ae(abwkVar, avlrVar), tzk.X(avlrVar, (avlh) ahtoVar.b, tthVar, vxzVar.m(25, 45689881L)), avlrVar.g(avla.e), new vqp(4)).H(new vup(3)).U(1).p().ax().c();
    }

    public static void C(Runnable runnable) {
        if (a.x()) {
            runnable.run();
            return;
        }
        avmb avmbVar = avmh.a;
        JniZero.a(avmbVar);
        avmbVar.e(runnable);
    }

    public static aizk ae(smr smrVar, boolean z, boolean z2) {
        aixo aixoVarC = smrVar.c();
        int i = smrVar.c;
        agke agkeVar = smrVar.d;
        Optional optional = smrVar.k;
        aihf aihfVarAt = at(aixoVarC, i, agkeVar, optional, smrVar.a());
        if (z2) {
            aihf aihfVarCreateBuilder = aizj.a.createBuilder();
            String str = smrVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            aizj aizjVar = (aizj) aihfVarCreateBuilder.instance;
            aizjVar.b |= 1;
            aizjVar.c = str;
            if (((agpi) agkeVar).d > 0) {
                aizm aizmVarAf = af((snk) agkeVar.get(0));
                aihfVarCreateBuilder.copyOnWrite();
                aizj aizjVar2 = (aizj) aihfVarCreateBuilder.instance;
                aizmVarAf.getClass();
                aizjVar2.e = aizmVarAf;
                aizjVar2.b |= 4;
            }
            if (optional.isPresent()) {
                aizm aizmVarAg = ag((aizs) optional.get());
                aihfVarCreateBuilder.copyOnWrite();
                aizj aizjVar3 = (aizj) aihfVarCreateBuilder.instance;
                aizmVarAg.getClass();
                aizjVar3.e = aizmVarAg;
                aizjVar3.b |= 4;
            }
            agke agkeVar2 = smrVar.e;
            int i2 = ((agpi) agkeVar2).d;
            for (int i3 = 0; i3 < i2; i3++) {
                aizm aizmVarAf2 = af((snk) agkeVar2.get(i3));
                aihfVarCreateBuilder.copyOnWrite();
                aizj aizjVar4 = (aizj) aihfVarCreateBuilder.instance;
                aizmVarAf2.getClass();
                aiie aiieVar = aizjVar4.f;
                if (!aiieVar.c()) {
                    aizjVar4.f = aihn.mutableCopy(aiieVar);
                }
                aizjVar4.f.add(aizmVarAf2);
            }
            agke agkeVar3 = smrVar.f;
            int i4 = ((agpi) agkeVar3).d;
            for (int i5 = 0; i5 < i4; i5++) {
                aihfVarCreateBuilder.aJ(af((snk) agkeVar3.get(i5)));
            }
            agke agkeVar4 = smrVar.l;
            int size = agkeVar4.size();
            for (int i6 = 0; i6 < size; i6++) {
                aihfVarCreateBuilder.aJ(ag((aizs) agkeVar4.get(i6)));
            }
            aihfVarCreateBuilder.copyOnWrite();
            aizj aizjVar5 = (aizj) aihfVarCreateBuilder.instance;
            aizjVar5.b |= 2;
            aizjVar5.d = z;
            aizj aizjVar6 = (aizj) aihfVarCreateBuilder.build();
            aihfVarAt.copyOnWrite();
            aizk aizkVar = (aizk) aihfVarAt.instance;
            aizk aizkVar2 = aizk.a;
            aizjVar6.getClass();
            aizkVar.f = aizjVar6;
            aizkVar.b |= 8;
        }
        return (aizk) aihfVarAt.build();
    }

    public static aizm af(snk snkVar) {
        return al(snkVar, aizm.a.createBuilder());
    }

    public static aizm ag(aizs aizsVar) {
        return am(aizsVar, aizm.a.createBuilder());
    }

    public static aihf ak(aixg aixgVar, int i) {
        aihf aihfVarCreateBuilder = aiyr.a.createBuilder();
        if (aixgVar == null) {
            aixgVar = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aiyr aiyrVar = (aiyr) aihfVarCreateBuilder.instance;
        aiyrVar.c = aixgVar.bQ;
        aiyrVar.b |= 1;
        aixf aixfVar = (aixf) sdd.b.get(Integer.valueOf(i));
        aihfVarCreateBuilder.copyOnWrite();
        aiyr aiyrVar2 = (aiyr) aihfVarCreateBuilder.instance;
        aiyrVar2.e = aixfVar.f;
        aiyrVar2.b |= 4;
        return aihfVarCreateBuilder;
    }

    public static aizm al(snk snkVar, aihf aihfVar) {
        aixr aixrVarA = snkVar.a();
        aihfVar.copyOnWrite();
        aizm aizmVar = (aizm) aihfVar.instance;
        aizm aizmVar2 = aizm.a;
        aizmVar.e = aixrVarA.aT;
        aizmVar.b |= 1;
        if (snkVar.d()) {
            aihfVar.copyOnWrite();
            aizm aizmVar3 = (aizm) aihfVar.instance;
            aizmVar3.b |= 4;
            aizmVar3.g = true;
        }
        boolean z = snkVar instanceof skp;
        if (z || (snkVar instanceof sms)) {
            aihf aihfVarCreateBuilder = aizn.a.createBuilder();
            if (z) {
                String strC = ((skp) snkVar).c();
                aihfVarCreateBuilder.copyOnWrite();
                aizn aiznVar = (aizn) aihfVarCreateBuilder.instance;
                aiznVar.b = 2;
                aiznVar.c = strC;
            }
            if (snkVar instanceof sms) {
                String strE = ((sms) snkVar).e();
                aihfVarCreateBuilder.copyOnWrite();
                aizn aiznVar2 = (aizn) aihfVarCreateBuilder.instance;
                aiznVar2.b = 1;
                aiznVar2.c = strE;
            }
            aizn aiznVar3 = (aizn) aihfVarCreateBuilder.build();
            aihfVar.copyOnWrite();
            aizm aizmVar4 = (aizm) aihfVar.instance;
            aiznVar3.getClass();
            aizmVar4.d = aiznVar3;
            aizmVar4.c = 4;
        }
        return (aizm) aihfVar.build();
    }

    public static aizm am(aizs aizsVar, aihf aihfVar) {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        aihfVar.copyOnWrite();
        aizm aizmVar = (aizm) aihfVar.instance;
        aizm aizmVar2 = aizm.a;
        aizmVar.e = aixrVarA.aT;
        aizmVar.b |= 1;
        if (aizsVar.f) {
            aihfVar.copyOnWrite();
            aizm aizmVar3 = (aizm) aihfVar.instance;
            aizmVar3.b |= 4;
            aizmVar3.g = true;
        }
        return (aizm) aihfVar.build();
    }

    private final void ap(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, Function0 function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            try {
                ((tiz) this.a).c(urlResponseInfo, new tkj("UrlRequestScanner consumer threw", th));
                twu.c(6, "UrlRequestScanner threw", th);
                urlRequest.cancel();
            } catch (Throwable th2) {
                twu.c(6, "SafeConsumer onFailed threw after original consumer call threw", th2);
            }
        }
    }

    private final void aq(tdw tdwVar, Callable callable) {
        z(tdwVar).ak(new tds(callable));
    }

    private static aiyr ar(String str, aixg aixgVar, boolean z) {
        aihf aihfVarAk = ak(aixgVar, 1);
        if (z) {
            aihf aihfVarCreateBuilder = aiyq.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aiyq aiyqVar = (aiyq) aihfVarCreateBuilder.instance;
            str.getClass();
            aiyqVar.b |= 1;
            aiyqVar.c = str;
            aiyq aiyqVar2 = (aiyq) aihfVarCreateBuilder.build();
            aihfVarAk.copyOnWrite();
            aiyr aiyrVar = (aiyr) aihfVarAk.instance;
            aiyr aiyrVar2 = aiyr.a;
            aiyqVar2.getClass();
            aiyrVar.d = aiyqVar2;
            aiyrVar.b |= 2;
        }
        return (aiyr) aihfVarAk.build();
    }

    private static aizk as(String str, aixo aixoVar, int i, agke agkeVar, Optional optional, int i2, boolean z) {
        aihf aihfVarAt = at(aixoVar, i, agkeVar, optional, i2);
        if (z) {
            aihf aihfVarCreateBuilder = aizj.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aizj aizjVar = (aizj) aihfVarCreateBuilder.instance;
            str.getClass();
            aizjVar.b |= 1;
            aizjVar.c = str;
            aihfVarCreateBuilder.copyOnWrite();
            aizj aizjVar2 = (aizj) aihfVarCreateBuilder.instance;
            aizjVar2.b |= 2;
            aizjVar2.d = false;
            aizj aizjVar3 = (aizj) aihfVarCreateBuilder.build();
            aihfVarAt.copyOnWrite();
            aizk aizkVar = (aizk) aihfVarAt.instance;
            aizk aizkVar2 = aizk.a;
            aizjVar3.getClass();
            aizkVar.f = aizjVar3;
            aizkVar.b |= 8;
        }
        return (aizk) aihfVarAt.build();
    }

    private static aihf at(aixo aixoVar, int i, agke agkeVar, Optional optional, int i2) {
        aihf aihfVarCreateBuilder = aizk.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aizk aizkVar = (aizk) aihfVarCreateBuilder.instance;
        aizkVar.c = aixoVar.G;
        aizkVar.b |= 1;
        aixf aixfVar = (aixf) sdd.b.get(Integer.valueOf(i));
        aihfVarCreateBuilder.copyOnWrite();
        aizk aizkVar2 = (aizk) aihfVarCreateBuilder.instance;
        aizkVar2.g = aixfVar.f;
        aizkVar2.b |= 32;
        if (!agkeVar.isEmpty()) {
            aixr aixrVarA = aixr.a(af((snk) agkeVar.get(0)).e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            aihfVarCreateBuilder.copyOnWrite();
            aizk aizkVar3 = (aizk) aihfVarCreateBuilder.instance;
            aizkVar3.d = aixrVarA.aT;
            aizkVar3.b |= 2;
        }
        if (optional.isPresent()) {
            aixr aixrVarA2 = aixr.a(ag((aizs) optional.get()).e);
            if (aixrVarA2 == null) {
                aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            aihfVarCreateBuilder.copyOnWrite();
            aizk aizkVar4 = (aizk) aihfVarCreateBuilder.instance;
            aizkVar4.d = aixrVarA2.aT;
            aizkVar4.b |= 2;
        }
        if (i2 != 1) {
            aihfVarCreateBuilder.copyOnWrite();
            aizk aizkVar5 = (aizk) aihfVarCreateBuilder.instance;
            aizkVar5.b |= 4;
            aizkVar5.e = i2;
        }
        return aihfVarCreateBuilder;
    }

    public final avlr A() {
        return z(tdw.c);
    }

    public final avlr B() {
        awbl awblVar = new awbl(new tdu(this, 0));
        avnn avnnVar = atqp.l;
        return awblVar;
    }

    public final void D(Callable callable) {
        aq(tdw.a, callable);
    }

    public final void E(Callable callable) {
        aq(tdw.c, callable);
    }

    public final void F(Callable callable) {
        aq(tdw.b, callable);
    }

    public final void G(avnd avndVar) {
        y().F(avndVar, new jop(7));
    }

    public final boolean H(Class cls) {
        if (cls.isInstance(this.a)) {
            return cls != tcr.class ? true : true;
        }
        return false;
    }

    public final void I(int i) {
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).d(i, 1);
        }
    }

    public final void J(int i, int i2) {
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).jT(i, i2);
        }
    }

    public final void K(int i, int i2) {
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).d(i, i2);
        }
    }

    public final void L(int i, int i2) {
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).jU(i, i2);
        }
    }

    public final void M(tbj tbjVar) {
        ((HashSet) this.a).add(tbjVar);
    }

    public final void N(tbj tbjVar) {
        ((HashSet) this.a).remove(tbjVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void O() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((adky) it.next()).jS();
        }
    }

    public final void P(int i, int i2) {
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).k(i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void Q(szy szyVar) {
        ?? r1 = this.a;
        if (r1.contains(szyVar)) {
            return;
        }
        r1.add(szyVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void R(Runnable runnable) {
        ?? r0 = this.a;
        if (r0.isEmpty()) {
            return;
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((szy) it.next()).d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void S(Callable callable) {
        ?? r0 = this.a;
        if (r0.isEmpty()) {
            return;
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((szy) it.next()).e();
        }
    }

    public final void T(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    T(file2);
                }
            }
            file.delete();
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) sxf.a.b()).j(e)).k("com/google/android/libraries/youtube/common/CacheDirModule$FailoverCacheCleaner", "sloppilyRecursivelyDelete", (char) 140, "CacheDirModule.java")).w("Error attempting to delete %s", file.getPath());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void U() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((svp) it.next()).v();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    @Deprecated
    public final void V(amax amaxVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((svp) it.next()).x(amaxVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void W(svp svpVar) {
        this.a.add(svpVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void X(svp svpVar) {
        this.a.remove(svpVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final sni Y(String str) {
        return (sni) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final sni Z(String str) {
        return (sni) this.a.remove(str);
    }

    public final void a(affd affdVar) {
        taq.d();
        vwv vwvVar = new vwv();
        auom.f(vwvVar);
        afpu.d(vwvVar, affdVar.a);
        vwu vwuVar = (vwu) this.a;
        fx fxVar = vwuVar.a;
        av avVar = new av(fxVar.getSupportFragmentManager());
        avVar.g(0, vwvVar, "com.google.android.apps.youtube.app.endpoint.routers.AccountScopeCommandRouterFragment", 1);
        avVar.e();
        vwr vwrVarF = vwu.f(fxVar);
        vwrVarF.getClass();
        List<vws> list = vwuVar.c;
        for (vws vwsVar : list) {
            vwrVarF.a.c(vwsVar.a, vwsVar.b);
        }
        list.clear();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    public final List aa() {
        try {
            Collection collectionValues = this.a.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            arrayList.addAll(collectionValues);
            return arrayList;
        } catch (RuntimeException e) {
            zvn zvnVar = zvn.b;
            zvm zvmVar = zvm.a;
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            zvp.a(zvnVar, zvmVar, "[Control flow] failed to grab registered triggers. Is main thread? " + z + ", error: " + e.getMessage());
            return new ArrayList();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void ab(String str, sni sniVar) {
        this.a.put(str, sniVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean ac(String str) {
        return this.a.containsKey(str);
    }

    public final oap ad(ExecutorService executorService, oaq oaqVar) {
        oap oapVarA = oap.a((Context) this.a, executorService, oaqVar);
        oapVarA.getClass();
        return oapVarA;
    }

    public final boolean ah() {
        return taq.aU((vyo) this.a);
    }

    public final amco ai(smr smrVar, String str, aixg aixgVar, aiua aiuaVar) {
        boolean zAh = ah();
        aihf aihfVarCreateBuilder = amco.a.createBuilder();
        if (aiuaVar != null && (aiuaVar.b & 1) != 0) {
            aigj aigjVar = aiuaVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            amco amcoVar = (amco) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            amcoVar.b |= 4;
            amcoVar.f = aigjVar;
        }
        aihf aihfVarCreateBuilder2 = aixs.a.createBuilder();
        aizk aizkVarAs = as(smrVar.a, smrVar.c(), smrVar.c, smrVar.d, smrVar.k, smrVar.a(), zAh);
        aihfVarCreateBuilder2.copyOnWrite();
        aixs aixsVar = (aixs) aihfVarCreateBuilder2.instance;
        aizkVarAs.getClass();
        aixsVar.d = aizkVarAs;
        aixsVar.b |= 2;
        aiyr aiyrVarAr = ar(str, aixgVar, zAh);
        aihfVarCreateBuilder2.copyOnWrite();
        aixs aixsVar2 = (aixs) aihfVarCreateBuilder2.instance;
        aiyrVarAr.getClass();
        aixsVar2.e = aiyrVarAr;
        aixsVar2.b |= 4;
        aixs aixsVar3 = (aixs) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amco amcoVar2 = (amco) aihfVarCreateBuilder.instance;
        aixsVar3.getClass();
        amcoVar2.e = aixsVar3;
        amcoVar2.b |= 2;
        return (amco) aihfVarCreateBuilder.build();
    }

    public final amco aj(String str, aixo aixoVar, agke agkeVar, int i, String str2, aixg aixgVar, aiua aiuaVar) {
        boolean zAh = ah();
        aihf aihfVarCreateBuilder = amco.a.createBuilder();
        if (aiuaVar != null && (aiuaVar.b & 1) != 0) {
            aigj aigjVar = aiuaVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            amco amcoVar = (amco) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            amcoVar.b |= 4;
            amcoVar.f = aigjVar;
        }
        aihf aihfVarCreateBuilder2 = aixs.a.createBuilder();
        aizk aizkVarAs = as(str, aixoVar, 1, agkeVar, Optional.empty(), i, zAh);
        aihfVarCreateBuilder2.copyOnWrite();
        aixs aixsVar = (aixs) aihfVarCreateBuilder2.instance;
        aizkVarAs.getClass();
        aixsVar.d = aizkVarAs;
        aixsVar.b |= 2;
        aiyr aiyrVarAr = ar(str2, aixgVar, zAh);
        aihfVarCreateBuilder2.copyOnWrite();
        aixs aixsVar2 = (aixs) aihfVarCreateBuilder2.instance;
        aiyrVarAr.getClass();
        aixsVar2.e = aiyrVarAr;
        aixsVar2.b |= 4;
        aixs aixsVar3 = (aixs) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amco amcoVar2 = (amco) aihfVarCreateBuilder.instance;
        aixsVar3.getClass();
        amcoVar2.e = aixsVar3;
        amcoVar2.b |= 2;
        return (amco) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void an(rtg rtgVar) {
        this.a.add(rtgVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void ao(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rtg) it.next()).Y(z);
        }
    }

    public final wej b() {
        return new wej((akvf) ((aihf) this.a).build());
    }

    public final void c(String str, Object obj, aeow aeowVar) {
        try {
            ((aihf) this.a).aV(str, aigj.v(aeowVar.a(obj)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d(String str, String str2) {
        str2.getClass();
        ((aihf) this.a).aV(str, aigj.x(str2));
    }

    public final synchronized agke e() {
        return ((agjz) this.a).g();
    }

    public final synchronized void f(String str, wbc wbcVar, wbi wbiVar) {
        ((agjz) this.a).h(new wbf(str, wbcVar.b() + (-1) != 0 ? new wbe(wav.a, wbcVar.a(), wbiVar) : new wbe(wbcVar.c(), null, wbiVar)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final vzz g(waa waaVar, int i) {
        waaVar.getClass();
        return new vzz(waaVar, i, this.a);
    }

    public final vsa h(tbt tbtVar, xgn xgnVar) {
        Optional optional = (Optional) ((aupo) this.a).b;
        optional.getClass();
        xgnVar.getClass();
        return new vsa(optional, tbtVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void i(String str) {
        this.a.remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean j(String str) {
        return this.a.contains(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final tzk k(String str) {
        return (tzk) this.a.get(str);
    }

    public final void l(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ap(urlRequest, urlResponseInfo, new efi(this, urlResponseInfo, 3));
    }

    public final void m(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        try {
            ((tiz) this.a).c(urlResponseInfo, cronetException);
        } catch (Throwable th) {
            urlRequest.cancel();
            twu.c(6, "SafeConsumer.callConsumer onFailed threw", th);
            throw th;
        }
    }

    public final void n(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, Iterable iterable) {
        iterable.getClass();
        ap(urlRequest, urlResponseInfo, new bi(this, urlResponseInfo, iterable, 5, null));
    }

    public final void o(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr) {
        ap(urlRequest, urlResponseInfo, new bi(this, urlResponseInfo, bArr, 3));
    }

    public final void p(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ap(urlRequest, urlResponseInfo, new pbm(this, 3));
    }

    public final void q(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        ap(urlRequest, urlResponseInfo, new bi(this, urlRequest, str, 4, null));
    }

    public final void r(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ap(urlRequest, urlResponseInfo, new pbm(this, 4));
    }

    public final void s(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ap(urlRequest, urlResponseInfo, new efi(this, urlResponseInfo, 4));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final ListenableFuture t(String str) {
        aeiv aeivVar = (aeiv) ((ConcurrentHashMap) this.a).get(str);
        if (aeivVar != null) {
            return aeivVar.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final tfz u() {
        return new tfz(this.a);
    }

    public final boolean v(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.a;
            if (i >= arrayList.size()) {
                return false;
            }
            if (str.equalsIgnoreCase((String) ((Map.Entry) arrayList.get(i)).getKey())) {
                return true;
            }
            i++;
        }
    }

    public final void w(Collection collection) {
        ((ArrayList) this.a).addAll(collection);
    }

    public final void x(String str, String str2) {
        ((ArrayList) this.a).add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    public final avlb y() {
        awde awdeVar = new awde(B());
        avnn avnnVar = atqp.p;
        return awdeVar;
    }

    public final avlr z(tdw tdwVar) {
        return B().K(new hby(tdwVar, 11)).r();
    }

    public vwt(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public vwt(byte[] bArr, char[] cArr) {
        this.a = null;
    }

    public vwt(boc bocVar) {
        bocVar.getClass();
        this.a = bocVar;
    }

    public vwt(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }

    public vwt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new HashSet();
    }

    public vwt(char[] cArr) {
        this.a = new HashSet();
    }

    public vwt(adxj adxjVar) {
        adxjVar.getClass();
        this.a = adxjVar;
    }

    public vwt(Container container) {
        this.a = (afzg) container.a(new afyw(2));
    }

    public vwt(byte[] bArr, short[] sArr) {
        this.a = new ArrayList();
    }

    public vwt(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public vwt(Context context, byte[] bArr) {
        context.getClass();
        this.a = context;
    }

    public vwt(awmd awmdVar, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public vwt(short[] sArr) {
        this.a = new ConcurrentHashMap();
    }

    public vwt(Object obj) {
        this.a = obj;
    }

    public vwt(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public vwt(short[] sArr, byte[] bArr) {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }

    public vwt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new CopyOnWriteArrayList();
    }

    public vwt(char[] cArr, byte[] bArr) {
        this.a = new HashSet();
    }

    public vwt() {
        this.a = new awlx();
    }

    public vwt(vxe vxeVar) {
        if (vxeVar instanceof vxf) {
            this.a = ((vxf) vxeVar).f();
            return;
        }
        throw new IllegalStateException();
    }

    public vwt(vxe vxeVar, byte[] bArr) {
        if (!(vxeVar instanceof vxf)) {
            throw new IllegalStateException();
        }
        vxe vxeVarF = ((vxf) vxeVar).f();
        if (vxeVarF instanceof vwu) {
            this.a = (vwu) vxeVarF;
            return;
        }
        throw new IllegalStateException();
    }

    public vwt(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public vwt(byte[] bArr, byte[] bArr2) {
        this.a = new agjz(4);
    }

    public vwt(byte[] bArr) {
        this.a = akvf.a.createBuilder();
    }
}
