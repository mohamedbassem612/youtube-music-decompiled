package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aczl {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public aczl(ScheduledExecutorService scheduledExecutorService, vxz vxzVar, tqj tqjVar) {
        this.a = new HashSet();
        this.g = scheduledExecutorService;
        this.b = new wka(scheduledExecutorService);
        this.d = vxzVar;
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        int i = tqr.a;
        if (!tqjVar.k(1073814459)) {
            vxzVar.c(1, 45366267L, 0L);
        }
        if (tqjVar.k(1073814516)) {
            this.e = new PriorityQueue(1, new rit(5));
        } else {
            this.e = new PriorityQueue(1, Comparator$CC.comparingInt(new ddc(13)));
        }
        this.f = new AtomicReference(wkb.a);
        this.c = new AtomicInteger(1);
        new AtomicInteger(1);
    }

    private final long H() {
        Random random = (Random) this.g;
        long jNextLong = random.nextLong();
        while (true) {
            Object obj = this.e;
            Long lValueOf = Long.valueOf(jNextLong);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
            if (!concurrentHashMap.containsKey(lValueOf)) {
                concurrentHashMap.put(lValueOf, agpi.a);
                return jNextLong;
            }
            jNextLong = random.nextLong();
        }
    }

    private final rbq I(apsd apsdVar, Optional optional, long j, Optional optional2, Optional optional3, askh askhVar) {
        Object obj = this.f;
        if (obj == null) {
            return rbq.a;
        }
        String str = ((aepy) ((adbm) this.a).a).b;
        ufr ufrVar = new ufr((agbv) obj, apsdVar, optional, j, optional2, optional3, askhVar, this);
        ufrVar.k(new ufp(ufrVar, 1));
        return ufrVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, vxe] */
    private final void J(List list, Map map) {
        if (((vxz) this.g).m(8, 45661900L)) {
            fhz.u(list, new bym(11), map, this.f);
        }
    }

    public static final Bundle g(Optional optional) {
        if (optional.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        aabp.d(bundle, (xgt) optional.get());
        return bundle;
    }

    public static ascs j(tns tnsVar) {
        return (ascs) tnsVar.n().orElse(ascs.a);
    }

    public static Optional k(aqrv aqrvVar, aqmv aqmvVar, String str) {
        boolean z;
        if (!aqrvVar.c) {
            return Optional.empty();
        }
        aiie<aplf> aiieVar = aqrvVar.b;
        if (aiieVar.isEmpty()) {
            return Optional.empty();
        }
        String host = Uri.parse(str).getHost();
        for (aplf aplfVar : aiieVar) {
            aihv aihvVar = aplfVar.e;
            aihw aihwVar = aplf.a;
            boolean zIsEmpty = new aihx(aihvVar, aihwVar).isEmpty();
            boolean z2 = false;
            if (zIsEmpty) {
                z = true;
            } else {
                Iterator<E> it = new aihx(aplfVar.e, aihwVar).iterator();
                z = false;
                while (it.hasNext()) {
                    z |= !(aqmvVar != ((aqmv) it.next()));
                }
            }
            if (aplfVar.d.isEmpty()) {
                z2 = true;
            } else if (host != null) {
                for (String str2 : aplfVar.d) {
                    if (host.equals(str2) || host.endsWith(".".concat(String.valueOf(str2)))) {
                        z2 = true;
                    }
                }
            }
            if (z && z2) {
                return Optional.of(aplfVar);
            }
        }
        return Optional.empty();
    }

    public static obo t(int i) {
        aihf aihfVarCreateBuilder = obo.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        obo oboVar = (obo) aihfVarCreateBuilder.instance;
        oboVar.f = i - 1;
        oboVar.b |= 8;
        return (obo) aihfVarCreateBuilder.build();
    }

    public final void A(abkg abkgVar, boolean z) {
        agrx agrxVar = agso.a;
        abkgVar.s();
        Object obj = this.f;
        ajwo ajwoVarO = abkgVar.o();
        if (((ycp) obj).e != null) {
            if (!((vxz) this.a).l(79, 45418013L, false)) {
                return;
            }
        } else if (((isi) this.b).j() && z) {
            return;
        }
        if (ajwoVarO != null) {
            Object obj2 = this.e;
            aigj aigjVar = (aigj) ((jij) this.g).j().orElse(null);
            gww gwwVar = new gww(this, "DELETE", 2);
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aotf.b);
            ajwoVarO.c(aihlVarCheckIsLite);
            Object objK = ajwoVarO.j.k(aihlVarCheckIsLite.d);
            aotf aotfVar = (aotf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            wsl wslVar = (wsl) ((grj) obj2).a;
            wsi wsiVarA = wslVar.a();
            wsiVarA.a = aotfVar.d;
            wsiVarA.c = aotfVar.h;
            wsiVarA.d = aigjVar;
            if ((ajwoVarO.b & 1) != 0) {
                wsiVarA.n(ajwoVarO.c);
            } else {
                wsiVarA.m();
            }
            wsiVarA.e(aotfVar.e);
            wslVar.c(wsiVarA, gwwVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aunn, java.lang.Object] */
    public final void B() {
        int i = 8;
        avlh avlhVarH = ((abvn) this.b.io()).P().x(new hhw(new hhn(i), 7)).H(new ibj(new hhn(10), 2));
        boolean zN = ((jnj) this.g.io()).n();
        ?? r3 = this.d;
        avlh avlhVarB = zN ? ((ied) r3.io()).b() : ((ied) r3.io()).a();
        avlhVarB.getClass();
        ((avmm) this.e).c(avlh.I(avlhVarH, avlhVarB.x(new hhw(new hhn(11), i)).H(new ibj(new hhn(12), 3))).p().x(new hhw(new hhn(9), 6)).L((avmb) this.f).al(new ibr(new hho(this.c, 3, (short[]) null), 4), new ibr(icv.a, 5)));
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [abvc, java.lang.Object] */
    public final void C(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        J(((amla) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).h, map);
        ((tbt) this.c).c(new haz(true, null));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        amlh amlhVar = ((amla) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).g;
        if (amlhVar == null) {
            amlhVar = amlh.a;
        }
        if (amlhVar.c.equals(((abvk) this.b).n())) {
            ?? r4 = this.d;
            if (r4.n(abtu.a)) {
                r4.i(((hzi) this.a).c(abtt.NEXT, null, null));
            }
        }
    }

    public final void D(ajwo ajwoVar, Map map) {
        if (((vxz) this.g).m(8, 45661900L)) {
            ((jlh) this.e).b();
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        J(((amla) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).h, map);
        ((tbt) this.c).c(new haz(true, null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, vxe] */
    public final void E(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        J(((amla) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).h, map);
        if (!((vxz) this.g).m(8, 45661900L)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            fhz.u(((amla) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).h, new bym(10), map, this.f);
        }
        ((tbt) this.c).c(new haz(true, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bog, java.lang.Object] */
    public final ListenableFuture F() {
        return taf.a(this.f, ((syn) this.c).n(this.e.e()), new gmv(this, 3));
    }

    public final void G() {
        taf.g(F(), new gpq(1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tqj] */
    public final aczh a() {
        int i = tqr.a;
        this.c.k(1073815694);
        return acze.a;
    }

    public final aigj b() {
        a();
        return null;
    }

    public final File c() {
        return new File(((Context) this.a).getFilesDir(), "srs_serving_context.bin");
    }

    public final void d() {
        ((AtomicBoolean) this.g).set(false);
        if (c().exists()) {
            zdj zdjVar = new zdj(c());
            File fileG = zdjVar.g();
            if (fileG.exists()) {
                fileG.delete();
            }
            zdjVar.b = null;
            File file = (File) zdjVar.a;
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final Bundle e(ozj ozjVar) {
        return g(f(ozjVar.a));
    }

    public final Optional f(String str) {
        Optional optionalW = ((elr) this.f).w(str);
        if (optionalW.isEmpty()) {
            ((aaap) this.e).a("InteractionLoggingScreen missing for Bundle creation.");
        }
        return optionalW;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, tqj] */
    public final pzr h(List list) {
        ?? r0 = this.d;
        if (r0 == 0) {
            throw new IllegalStateException("The intent provider for opening the YouTube app is absent.");
        }
        Intent intent = new Intent((Intent) r0.io());
        ?? r1 = this.b;
        int i = tqr.a;
        if (r1.k(1073828559)) {
            intent.putExtra("notification_arrival_timestamp", this.a.f().toEpochMilli());
        }
        elr elrVar = (elr) this.g;
        Optional optionalT = elrVar.t(list);
        if (optionalT.isEmpty()) {
            return nra.b(agke.q(intent), null);
        }
        Optional optionalS = elrVar.s((ozj) optionalT.get());
        if (optionalS.isEmpty()) {
            return nra.b(agke.q(intent), null);
        }
        qze qzeVar = new qze(this, intent, optionalT, 10);
        if (true == optionalS.isPresent()) {
            Object obj = optionalS.get();
            Object obj2 = qzeVar.a;
            Object obj3 = qzeVar.b;
            ajcs ajcsVar = (ajcs) obj;
            String str = ((ozj) ((Optional) qzeVar.c).get()).a;
            int i2 = ajcsVar.b;
            if ((i2 & 2) != 0) {
                Optional optionalF = ((aczl) obj2).f(str);
                ajwo ajwoVar = ajcsVar.d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                Intent intent2 = (Intent) obj3;
                zik.be(intent2, ajwoVar, optionalF.isPresent() ? ((xgt) optionalF.get()).a : null);
                ajwo ajwoVar2 = ajcsVar.e;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                aabq.b(intent2, ajwoVar2);
                yno.U(intent2, "ytnchime");
                optionalS = Optional.of(obj3);
            } else {
                if ((i2 & 32) == 0) {
                    ((aaap) ((aczl) obj2).e).a("Payload does not have the required navigation endpoint.");
                }
                optionalS = Optional.empty();
            }
        }
        if (true == optionalS.isPresent()) {
            optionalS = Optional.ofNullable(nra.b(agke.q(optionalS.get()), null));
        }
        return (pzr) (true != optionalS.isPresent() ? nra.b(agke.q(new hly(intent, 15).a), null) : optionalS.get());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ahey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, mbc] */
    public final ListenableFuture i(boolean z, atxn atxnVar) {
        aihf aihfVarCreateBuilder = asft.a.createBuilder();
        if (!z || !((Boolean) this.c.io()).booleanValue()) {
            aihfVarCreateBuilder.copyOnWrite();
            asft asftVar = (asft) aihfVarCreateBuilder.instance;
            asftVar.c = 3;
            asftVar.b |= 1;
            return ahng.n((asft) aihfVarCreateBuilder.build());
        }
        long jLongValue = ((Long) this.b.io()).longValue();
        if (jLongValue == 0) {
            aihfVarCreateBuilder.copyOnWrite();
            asft asftVar2 = (asft) aihfVarCreateBuilder.instance;
            asftVar2.c = 3;
            asftVar2.b |= 1;
            return ahng.n((asft) aihfVarCreateBuilder.build());
        }
        zyo zyoVar = (zyo) this.f.io();
        int iIncrementAndGet = ((AtomicInteger) this.d).incrementAndGet();
        akxc akxcVar = zyoVar.b;
        double dMin = Math.min(akxcVar.e, ((double) akxcVar.c) * Math.pow(akxcVar.d, Math.max(0, iIncrementAndGet - 1)));
        float fNextFloat = akxcVar.f * (zyoVar.c.nextFloat() - 0.5f);
        long jMin = Math.min(akxcVar.e, (int) (dMin + Math.round(((double) (fNextFloat + fNextFloat)) * dMin)));
        long epochMilli = this.a.f().toEpochMilli() + jMin;
        if (jLongValue > 0 && epochMilli > jLongValue) {
            aihfVarCreateBuilder.copyOnWrite();
            asft asftVar3 = (asft) aihfVarCreateBuilder.instance;
            asftVar3.c = 2;
            asftVar3.b |= 1;
            return ahng.n((asft) aihfVarCreateBuilder.build());
        }
        aihfVarCreateBuilder.copyOnWrite();
        asft asftVar4 = (asft) aihfVarCreateBuilder.instance;
        asftVar4.c = 1;
        asftVar4.b |= 1;
        if (Uri.parse(atxnVar.c).getQueryParameters("retry").isEmpty()) {
            aihf aihfVarCreateBuilder2 = atxn.a.createBuilder();
            String string = Uri.parse(atxnVar.c).buildUpon().appendQueryParameter("retry", "1").build().toString();
            aihfVarCreateBuilder2.copyOnWrite();
            atxn atxnVar2 = (atxn) aihfVarCreateBuilder2.instance;
            string.getClass();
            atxnVar2.c = string;
            atxn atxnVar3 = (atxn) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asft asftVar5 = (asft) aihfVarCreateBuilder.instance;
            atxnVar3.getClass();
            asftVar5.d = atxnVar3;
            asftVar5.b |= 2;
        }
        ?? r0 = this.e;
        aihfVarCreateBuilder.getClass();
        return r0.schedule(new wko(aihfVarCreateBuilder, 15), jMin, TimeUnit.MILLISECONDS);
    }

    public final boolean l(ycv ycvVar) {
        xvu xvuVar;
        return ((vxz) this.a).l(23, 45368353L, false) && ycvVar.a() && (xvuVar = ycvVar.a) != null && xvuVar.equals(xvu.CONNECT_PARAMS);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    public final synchronized void m() {
        Object obj = this.f;
        if (((AtomicReference) obj).get() != wkb.a) {
            ?? r1 = this.a;
            synchronized (r1) {
                if (r1.size() >= ((vxz) this.d).c(1, 45366267L, 0L)) {
                    a.av((AtomicReference) obj, wkb.c, wkb.d);
                } else {
                    if (((yno) ((PriorityQueue) this.e).poll()) != null) {
                        throw null;
                    }
                    a.av((AtomicReference) this.f, wkb.c, wkb.b);
                }
            }
        }
    }

    public final void n() {
        ((AtomicReference) this.f).set(wkb.a);
        ((AtomicInteger) this.c).incrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, zwn] */
    public final ojo o(String str, Uri uri) {
        Uri uri2;
        String str2;
        ojv ojvVar;
        agke agkeVar;
        String str3;
        aifv aifvVar;
        ojn ojnVar = new ojn();
        ojnVar.e = -1;
        ojnVar.m = (byte) (ojnVar.m | 1);
        ojnVar.b(agpi.a);
        ojnVar.m = (byte) (ojnVar.m | 2);
        ojnVar.c(true);
        ojnVar.k = true;
        ojnVar.m = (byte) (ojnVar.m | 8);
        ojnVar.a(ojv.a);
        aifv aifvVar2 = aifv.a;
        if (aifvVar2 == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        ojnVar.l = aifvVar2;
        if (str == null) {
            throw new NullPointerException("Null urlToDownload");
        }
        ojnVar.b = str;
        ojnVar.a = uri;
        ojnVar.a(ojv.c);
        int i = 0;
        ojnVar.c(false);
        Object objOfNullable = this.a;
        Optional optional = (Optional) objOfNullable;
        if (optional.isPresent()) {
            wap wapVar = new wap(this, str, i);
            if (true == optional.isPresent()) {
                ?? r0 = optional.get();
                objOfNullable = Optional.ofNullable(((aczl) wapVar.a).e.a(r0).a(r0).b((String) wapVar.b));
            }
            Optional optional2 = (Optional) objOfNullable;
            if (true == optional2.isPresent() && true != ((Optional) optional2.get()).isPresent()) {
                objOfNullable = Optional.empty();
            }
            Optional optional3 = (Optional) objOfNullable;
            if (true == optional3.isPresent()) {
                objOfNullable = Optional.ofNullable((Pair) ((Optional) optional3.get()).get());
            }
            Optional optional4 = (Optional) objOfNullable;
            if (true == optional4.isPresent()) {
                objOfNullable = Optional.ofNullable(agke.q((Pair) optional4.get()));
            }
            vrl vrlVar = new vrl(ojnVar, 7);
            Optional optional5 = (Optional) objOfNullable;
            if (true == optional5.isPresent()) {
                ((ojn) vrlVar.a).b((agke) optional5.get());
            }
        }
        String str4 = ojnVar.g;
        if (!(str4 == null ? agdf.a : agev.i(str4)).g()) {
            String str5 = ojnVar.b;
            if (str5 == null) {
                throw new IllegalStateException("Property \"urlToDownload\" has not been set");
            }
            ojnVar.g = str5;
        }
        if (ojnVar.m == 15 && (uri2 = ojnVar.a) != null && (str2 = ojnVar.b) != null && (ojvVar = ojnVar.c) != null && (agkeVar = ojnVar.f) != null && (str3 = ojnVar.g) != null && (aifvVar = ojnVar.l) != null) {
            return new ojo(uri2, str2, ojvVar, ojnVar.d, ojnVar.e, agkeVar, str3, ojnVar.h, ojnVar.i, ojnVar.j, ojnVar.k, aifvVar);
        }
        StringBuilder sb = new StringBuilder();
        if (ojnVar.a == null) {
            sb.append(" destinationFileUri");
        }
        if (ojnVar.b == null) {
            sb.append(" urlToDownload");
        }
        if (ojnVar.c == null) {
            sb.append(" downloadConstraints");
        }
        if ((ojnVar.m & 1) == 0) {
            sb.append(" trafficTag");
        }
        if (ojnVar.f == null) {
            sb.append(" extraHttpHeaders");
        }
        if ((ojnVar.m & 2) == 0) {
            sb.append(" fileSizeBytes");
        }
        if (ojnVar.g == null) {
            sb.append(" notificationContentTitle");
        }
        if ((ojnVar.m & 4) == 0) {
            sb.append(" showDownloadedNotification");
        }
        if ((ojnVar.m & 8) == 0) {
            sb.append(" showFailureNotification");
        }
        if (ojnVar.l == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final rbs p(apsd apsdVar, Optional optional, Optional optional2, aske askeVar) {
        UUID uuid = new UUID(H(), H());
        long leastSignificantBits = uuid.getLeastSignificantBits();
        Optional optionalOf = Optional.of(uuid);
        aihf aihfVarCreateBuilder = askh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        askh askhVar = (askh) aihfVarCreateBuilder.instance;
        askeVar.getClass();
        askhVar.c = askeVar;
        askhVar.b = 2;
        return I(apsdVar, optional, leastSignificantBits, optionalOf, optional2, (askh) aihfVarCreateBuilder.build());
    }

    public final rbr q(apsd apsdVar, Optional optional, Optional optional2) {
        long jH = H();
        Optional optionalEmpty = Optional.empty();
        aihf aihfVarCreateBuilder = askh.a.createBuilder();
        aihf aihfVarCreateBuilder2 = askj.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        askj askjVar = (askj) aihfVarCreateBuilder2.instance;
        askjVar.c = 1;
        askjVar.b |= 1;
        askj askjVar2 = (askj) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        askh askhVar = (askh) aihfVarCreateBuilder.instance;
        askjVar2.getClass();
        askhVar.c = askjVar2;
        askhVar.b = 1;
        return I(apsdVar, optional, jH, optional2, optionalEmpty, (askh) aihfVarCreateBuilder.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(awoq awoqVar) throws Throwable {
        pdo pdoVar;
        if (awoqVar instanceof pdo) {
            pdoVar = (pdo) awoqVar;
            int i = pdoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdoVar.b = i - Integer.MIN_VALUE;
            } else {
                pdoVar = new pdo(this, awoqVar);
            }
        } else {
            pdoVar = new pdo(this, awoqVar);
        }
        Object objD = pdoVar.a;
        awox awoxVar = awox.a;
        int i2 = pdoVar.b;
        if (i2 == 0) {
            atqp.j(objD);
            Object obj = this.e;
            pdoVar.b = 1;
            objD = ((omm) obj).d(pdoVar);
            if (objD != awoxVar) {
            }
            return awoxVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objD);
            return objD;
        }
        atqp.j(objD);
        if (((CharSequence) objD).length() > 0) {
            String strC = auvj.a.io().c();
            if (awrc.c(strC, "CHIME")) {
                return pqk.CHIME;
            }
            if (awrc.c(strC, "GNP")) {
                return pqk.GNP;
            }
        }
        if (((pls) this.d).n == 0) {
            throw new awmj();
        }
        Object obj2 = this.e;
        pdoVar.b = 2;
        Object objK = ((omm) obj2).k(pdoVar);
        if (objK != awoxVar) {
            return objK;
        }
        return awoxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [awou, java.lang.Object] */
    public final Object s(aier aierVar, awoq awoqVar) throws Throwable {
        pdp pdpVar;
        if (awoqVar instanceof pdp) {
            pdpVar = (pdp) awoqVar;
            int i = pdpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdpVar.b = i - Integer.MIN_VALUE;
            } else {
                pdpVar = new pdp(this, awoqVar);
            }
        } else {
            pdpVar = new pdp(this, awoqVar);
        }
        Object obj = pdpVar.a;
        awox awoxVar = awox.a;
        int i2 = pdpVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            ?? r8 = this.b;
            gmc gmcVar = new gmc(this, aierVar, (awoq) null, 14);
            pdpVar.b = 1;
            if (awro.p(r8, gmcVar, pdpVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    public final ListenableFuture u() {
        int i = 10;
        return ((aheo) ahbz.e(aheo.p(((xsc) this.c).aj()), Throwable.class, new kke(i), MoreExecutors.directExecutor())).q(new iun(this, 9), MoreExecutors.directExecutor()).r(new ods(this, 3), MoreExecutors.directExecutor()).q(new iun(this, i), MoreExecutors.directExecutor()).q(new kke(11), MoreExecutors.directExecutor());
    }

    public final void v(List list, aigj aigjVar, xgn xgnVar, aigj aigjVar2) {
        if (!((tfq) this.f).i()) {
            Object obj = this.d;
            Object obj2 = this.c;
            jio jioVarE = jin.e();
            ((jik) jioVarE).k(((cf) obj2).getString(R.string.common_no_network));
            ((jin) obj).d(jioVarE.b());
            return;
        }
        wsc wscVarH = ((wsg) this.g).h();
        wscVarH.a.addAll(list);
        wscVarH.e();
        if (aigjVar != null) {
            wscVarH.n(aigjVar);
        } else {
            wscVarH.m();
        }
        if (aigjVar2 != null) {
            wscVarH.c = aigjVar2;
        }
        w(wscVarH, xgnVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [bog, java.lang.Object] */
    public final void w(final wsc wscVar, final xgn xgnVar) {
        wsg wsgVar = (wsg) this.g;
        taf.l(this.c, wsgVar.f.b(wscVar, wsgVar.d, null), new glm(this, 19), new twi() { // from class: ijw
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0 */
            /* JADX WARN: Type inference failed for: r10v1, types: [xgn] */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARN: Type inference failed for: r14v2, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v0, types: [acxx] */
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
            @Override // defpackage.twi
            public final void a(Object obj) {
                akrn akrnVar;
                alwm alwmVar = (alwm) obj;
                if (alwmVar != null) {
                    xgn xgnVar2 = xgnVar;
                    wsc wscVar2 = wscVar;
                    iix iixVar = (iix) this.c.b.io();
                    int i = alwmVar.b;
                    if ((i & 2) == 0) {
                        Iterator it = alwmVar.d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                akrnVar = null;
                                break;
                            }
                            alwn alwnVar = (alwn) it.next();
                            int i2 = alwnVar.b;
                            if (i2 == 153515154) {
                                if (i2 == 153515154) {
                                    akrnVar = (akrn) alwnVar.c;
                                    break;
                                } else {
                                    akrnVar = akrn.a;
                                    break;
                                }
                            }
                        }
                        if (akrnVar == null) {
                            iixVar.a(alwmVar, xgnVar2, new iit());
                            return;
                        }
                        byte[] bArr = iixVar.e.c(akrnVar).c;
                        if (xgnVar2 == null) {
                            try {
                                xgnVar2 = iixVar.i;
                            } catch (aiik unused) {
                                return;
                            }
                        }
                        iixVar.i = xgnVar2;
                        if ((alwmVar.b & 16) != 0) {
                            iixVar.j = new xgj(alwmVar.f, (amud) null);
                            byte[] bArr2 = wscVar2.g;
                            if (bArr2 == null || bArr2.length == 0) {
                                iixVar.i.l(iixVar.j);
                            } else {
                                iixVar.i.m(iixVar.j, new xgj(bArr2));
                            }
                        }
                        asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                        mfr mfrVar = new mfr(iixVar.i, akrnVar);
                        ?? r5 = iixVar.d;
                        assl asslVar = assl.DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_UNKNOWN;
                        iiv iivVar = new iiv(iixVar);
                        Object obj2 = mfrVar.a;
                        ?? r10 = true != (obj2 instanceof xgn) ? 0 : obj2;
                        Object obj3 = mfrVar.b;
                        r5.l(asmvVar, 2, asslVar, null, r10, 0, (akrn) (true == (obj3 instanceof akrn) ? obj3 : null), iivVar);
                        return;
                    }
                    if (xgnVar2 == null) {
                        xgnVar2 = iixVar.i;
                    }
                    iixVar.i = xgnVar2;
                    if ((i & 16) != 0) {
                        xgj xgjVar = new xgj(alwmVar.f, (amud) null);
                        byte[] bArr3 = wscVar2.g;
                        if (bArr3 == null || bArr3.length == 0) {
                            iixVar.i.l(xgjVar);
                        } else {
                            iixVar.i.m(xgjVar, new xgj(bArr3));
                        }
                        if ((alwmVar.b & 2) != 0) {
                            ajwo ajwoVar = alwmVar.e;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajwm.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                ajwo ajwoVar2 = alwmVar.e;
                                if (ajwoVar2 == null) {
                                    ajwoVar2 = ajwo.a;
                                }
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajwm.b);
                                ajwoVar2.c(aihlVarCheckIsLite2);
                                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                                for (ajwo ajwoVar3 : ((ajwm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c) {
                                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aiwz.b);
                                    ajwoVar3.c(aihlVarCheckIsLite3);
                                    if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aiwz.b);
                                        ajwoVar3.c(aihlVarCheckIsLite4);
                                        Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite4.d);
                                        aiwz aiwzVar = (aiwz) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                                        aixa aixaVar = aiwzVar.d;
                                        if (aixaVar == null) {
                                            aixaVar = aixa.a;
                                        }
                                        if ((aixaVar.b & 2) != 0) {
                                            aixa aixaVar2 = aiwzVar.d;
                                            if (aixaVar2 == null) {
                                                aixaVar2 = aixa.a;
                                            }
                                            aocd aocdVar = aixaVar2.d;
                                            if (aocdVar == null) {
                                                aocdVar = aocd.a;
                                            }
                                            xgj xgjVar2 = new xgj(aocdVar.e, (amud) null);
                                            iixVar.i.m(xgjVar2, xgjVar);
                                            if ((aocdVar.b & 4) != 0) {
                                                ajng ajngVar = aocdVar.d;
                                                if (ajngVar == null) {
                                                    ajngVar = ajng.a;
                                                }
                                                ajnf ajnfVar = ajngVar.c;
                                                if (ajnfVar == null) {
                                                    ajnfVar = ajnf.a;
                                                }
                                                iixVar.i.m(new xgj(ajnfVar.y, (amud) null), xgjVar2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    vxe vxeVar = iixVar.b;
                    ajwo ajwoVar4 = alwmVar.e;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    vxeVar.a(ajwoVar4);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, vwx] */
    public final void x(abkf abkfVar) {
        ajwo ajwoVarP;
        agrx agrxVar = agso.a;
        abkfVar.m();
        if (((isi) this.b).j() || (ajwoVarP = abkfVar.p()) == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("local_queue_item_uid", Long.valueOf(abkfVar.m()));
        this.d.c(ajwoVarP, map);
    }

    public final void y(String str, boolean z) {
        ((aerv) this.c).d(str, z);
    }

    public final void z(abkg abkgVar, abkg abkgVar2) {
        agrx agrxVar = agso.a;
        abkgVar.s();
        if (abkgVar2 != null) {
            abkgVar2.s();
        }
        if (((ycp) this.f).e != null) {
            if (!((vxz) this.a).l(81, 45418016L, false)) {
                return;
            }
        } else if (((isi) this.b).j()) {
            return;
        }
        Object obj = this.e;
        String strC = typ.c(abkgVar.r());
        String strC2 = typ.c(abkgVar.s());
        String strS = abkgVar2 == null ? null : abkgVar2.s();
        String strQ = abkgVar.q();
        aigj aigjVar = (aigj) ((jij) this.g).j().orElse(null);
        gww gwwVar = new gww(this, "REORDER", 2);
        wsl wslVar = (wsl) ((grj) obj).a;
        wsi wsiVarA = wslVar.a();
        wsiVarA.a = strC;
        aihf aihfVarCreateBuilder = aote.a.createBuilder();
        aotd aotdVar = aotd.ACTION_MOVE_VIDEO_AFTER;
        aihfVarCreateBuilder.copyOnWrite();
        aote aoteVar = (aote) aihfVarCreateBuilder.instance;
        aoteVar.d = aotdVar.an;
        aoteVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aote aoteVar2 = (aote) aihfVarCreateBuilder.instance;
        aoteVar2.b |= 32;
        aoteVar2.f = strC2;
        if (strS != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aote aoteVar3 = (aote) aihfVarCreateBuilder.instance;
            aoteVar3.b |= SemanticState.Focused;
            aoteVar3.g = strS;
        }
        wsiVarA.b.add((aote) aihfVarCreateBuilder.build());
        wsiVarA.c = strQ;
        wsiVarA.d = aigjVar;
        wsiVarA.m();
        wslVar.c(wsiVarA, gwwVar);
    }

    public aczl(Context context, aunn aunnVar, xsc xscVar, omj omjVar, ExecutorService executorService, xsc xscVar2, kwc kwcVar) {
        this.d = context;
        this.a = aunnVar;
        this.g = xscVar;
        this.b = omjVar;
        this.f = executorService;
        this.e = xscVar2;
        this.c = kwcVar;
    }

    public aczl(Context context, cf cfVar, aefv aefvVar, syn synVar, zwb zwbVar, vxz vxzVar, Executor executor) {
        this.d = context;
        this.f = cfVar;
        this.b = aefvVar;
        this.c = synVar;
        this.e = zwbVar;
        this.g = vxzVar;
        this.a = executor;
    }

    public aczl(awmd awmdVar, elr elrVar, elr elrVar2, aaap aaapVar, mbc mbcVar, tqj tqjVar, vxz vxzVar) {
        this.d = awmdVar;
        this.g = elrVar;
        this.f = elrVar2;
        this.e = aaapVar;
        this.a = mbcVar;
        this.b = tqjVar;
        this.c = vxzVar;
    }

    public aczl(grj grjVar, isi isiVar, vwx vwxVar, aerv aervVar, ycp ycpVar, jij jijVar, vxz vxzVar) {
        this.e = grjVar;
        this.b = isiVar;
        this.d = vwxVar;
        this.c = aervVar;
        this.f = ycpVar;
        this.g = jijVar;
        this.a = vxzVar;
    }

    public aczl(vxe vxeVar, Executor executor, elr elrVar, zzt zztVar, elr elrVar2, elr elrVar3, xgn xgnVar) {
        this.a = vxeVar;
        this.b = executor;
        this.g = elrVar;
        this.c = zztVar;
        this.d = elrVar2;
        this.f = elrVar3;
        this.e = xgnVar;
    }

    public aczl(abk abkVar, pqp pqpVar, omm ommVar, awou awouVar, agev agevVar, awmd awmdVar, pls plsVar) {
        abkVar.getClass();
        pqpVar.getClass();
        ommVar.getClass();
        awouVar.getClass();
        awmdVar.getClass();
        plsVar.getClass();
        this.g = abkVar;
        this.a = pqpVar;
        this.e = ommVar;
        this.b = awouVar;
        this.f = agevVar;
        this.c = awmdVar;
        this.d = plsVar;
    }

    public aczl(Context context, aunn aunnVar, avmb avmbVar, aunn aunnVar2, aunn aunnVar3) {
        context.getClass();
        aunnVar.getClass();
        avmbVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        this.b = aunnVar;
        this.f = avmbVar;
        this.d = aunnVar2;
        this.g = aunnVar3;
        awku awkuVar = new awku();
        this.c = awkuVar;
        this.a = awkuVar.P();
        this.e = new avmm();
    }

    public aczl(Context context, nuc nucVar, tqj tqjVar, mbc mbcVar) {
        context.getClass();
        nucVar.getClass();
        tqjVar.getClass();
        mbcVar.getClass();
        this.a = context;
        this.b = nucVar;
        this.c = tqjVar;
        this.d = mbcVar;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
    }

    public aczl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, byte[] bArr, char[] cArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.g = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.a = awmdVar7;
    }

    public aczl(cf cfVar, wsg wsgVar, tfq tfqVar, awmd awmdVar, tbt tbtVar, ttm ttmVar, jin jinVar) {
        this.c = cfVar;
        this.g = wsgVar;
        tfqVar.getClass();
        this.f = tfqVar;
        awmdVar.getClass();
        this.b = awmdVar;
        this.a = tbtVar;
        this.e = ttmVar;
        this.d = jinVar;
    }

    public aczl(tbt tbtVar, abps abpsVar, abrg abrgVar, Executor executor, Executor executor2, Set set, txp txpVar) {
        tbtVar.getClass();
        this.d = tbtVar;
        abpsVar.getClass();
        this.e = abpsVar;
        abrgVar.getClass();
        this.g = abrgVar;
        executor.getClass();
        this.c = executor;
        executor2.getClass();
        this.b = executor2;
        this.f = set;
        txpVar.getClass();
        this.a = txpVar;
    }

    public aczl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, char[] cArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        this.e = awmdVar2;
        this.g = awmdVar3;
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.d = awmdVar7;
    }

    public aczl(kwv kwvVar, xsc xscVar, ablj abljVar, omj omjVar, ExecutorService executorService, oaq oaqVar) {
        this.f = new AtomicReference("2.975916745.-1");
        this.d = kwvVar;
        this.c = xscVar;
        this.e = abljVar;
        this.g = omjVar;
        this.a = executorService;
        this.b = oaqVar.A ? new ahfg(executorService) : executorService;
    }

    public aczl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        this.f = awmdVar3;
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.c = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
    }

    public aczl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.g = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.c = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
    }

    public aczl(rbm rbmVar, adbm adbmVar, mbc mbcVar, Random random, Executor executor) {
        this.e = new ConcurrentHashMap();
        this.a = adbmVar;
        this.c = mbcVar;
        this.g = random;
        this.b = new ahfg(executor);
        Object obj = adbmVar.a;
        obj.getClass();
        this.d = new qcb(obj, null);
        if (((vxz) ((aaok) adbmVar.b).b).m(7, 45363691L)) {
            this.f = (agbv) ((Optional) rbmVar.b).orElse(null);
        } else {
            this.f = null;
        }
    }

    public aczl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, byte[] bArr) {
        this.e = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.f = awmdVar3;
        this.a = awmdVar4;
        this.g = awmdVar5;
        this.d = awmdVar6;
        this.c = awmdVar7;
    }

    public aczl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
    }

    public aczl(zpw zpwVar, Executor executor, hed hedVar, tld tldVar, zwn zwnVar, vzu vzuVar) {
        this.f = zpwVar;
        this.c = executor;
        this.g = hedVar;
        this.d = tldVar;
        this.e = zwnVar;
        this.a = vzuVar.c;
        this.b = new wao(vzuVar.a, vzuVar.b, executor);
    }

    public aczl(abvk abvkVar, abvc abvcVar, hzi hziVar, jlh jlhVar, tbt tbtVar, vxz vxzVar, vxe vxeVar) {
        this.b = abvkVar;
        this.d = abvcVar;
        this.a = hziVar;
        this.e = jlhVar;
        this.c = tbtVar;
        this.g = vxzVar;
        this.f = vxeVar;
    }

    public aczl(awmd awmdVar, tft tftVar, tft tftVar2, awmd awmdVar2, vxu vxuVar, vxz vxzVar, vxz vxzVar2) {
        this.c = awmdVar;
        this.e = tftVar;
        this.d = tftVar2;
        this.f = awmdVar2;
        amya amyaVar = vxuVar.c().m;
        this.g = amyaVar == null ? amya.a : amyaVar;
        this.b = vxzVar;
        this.a = vxzVar2;
    }

    public aczl(ahey aheyVar, elr elrVar, mbc mbcVar, tns tnsVar) {
        this.e = aheyVar;
        this.d = new AtomicInteger(0);
        this.a = mbcVar;
        this.g = aguu.al(new zaz(tnsVar, 12));
        this.f = aguu.al(new cmw(this, elrVar, 8));
        this.b = aguu.al(new ovf(this, tnsVar, mbcVar, 5));
        this.c = aguu.al(new cmw(this, tnsVar, 9));
    }

    public aczl(ahey aheyVar, elr elrVar, mbc mbcVar, ascs ascsVar, aqrv aqrvVar, String str) {
        this.e = aheyVar;
        this.d = new AtomicInteger(0);
        this.a = mbcVar;
        this.g = aguu.al(new ovf(aqrvVar, ascsVar, str, 6, (char[]) null));
        this.f = aguu.al(new cmw(this, elrVar, 10));
        this.b = aguu.al(new rrw(this, ascsVar, aqrvVar, mbcVar, 2));
        this.c = aguu.al(new ovf(this, aqrvVar, ascsVar, 7, (char[]) null));
    }
}
