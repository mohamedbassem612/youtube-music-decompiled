package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yfo implements zgf {
    public final yfk c;
    public final zjr d;
    public final xeu e;
    public final awmd f;
    public final ahey g;
    public final Context h;
    public File j;
    public final wjr k;
    public final zik l;
    private final aunn m;
    private final SharedPreferences n;
    private final ahey o;
    private final mbc p;
    private final vxu r;
    private xxy s;
    private final xxy t;
    private final syn u;
    private final abxv v;
    public final List a = new CopyOnWriteArrayList();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final AtomicBoolean q = new AtomicBoolean();
    public final AtomicBoolean i = new AtomicBoolean(false);

    public yfo(zjr zjrVar, yfk yfkVar, aunn aunnVar, xeu xeuVar, SharedPreferences sharedPreferences, vxu vxuVar, awmd awmdVar, ahey aheyVar, ahey aheyVar2, Context context, wjr wjrVar, xxy xxyVar, mbc mbcVar, Optional optional, abxv abxvVar, syn synVar) {
        this.d = zjrVar;
        this.c = yfkVar;
        this.m = aunnVar;
        this.e = xeuVar;
        this.n = sharedPreferences;
        this.r = vxuVar;
        this.f = awmdVar;
        this.g = aheyVar2;
        this.o = aheyVar;
        this.h = context;
        this.p = mbcVar;
        this.k = wjrVar;
        this.t = xxyVar;
        this.l = (zik) optional.orElse(null);
        this.u = synVar;
        this.v = abxvVar;
    }

    public static final void e(ywb ywbVar, long j, long j2, int i, long j3) {
        ywbVar.w("cevict", "end." + j2 + '.' + j + '.' + i + '.' + j3);
    }

    private static final String g(jsk jskVar) {
        if (jskVar instanceof ygu) {
            return "ytm";
        }
        if (jskVar instanceof ygd) {
            return "nooppytm";
        }
        return jskVar instanceof jtc ? "simple" : "unknown";
    }

    private final void h(affd affdVar, xxy xxyVar) {
        anhb anhbVar = this.r.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        akwj akwjVar = anhbVar.k;
        if (akwjVar == null) {
            akwjVar = akwj.a;
        }
        int iBc = a.bc(akwjVar.d);
        if (iBc != 0 && iBc == 2) {
            zik.bB(this.e, 11, new Exception());
            return;
        }
        int i = 12;
        if (this.l == null) {
            zik.bB(this.e, 12, new Exception());
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        synchronized (concurrentHashMap) {
            if (!concurrentHashMap.containsKey(affdVar)) {
                concurrentHashMap.put(affdVar, new ygd());
                taf.i(zik.cr(affdVar, this.h, 2).p(), this.g, new xfa(this, affdVar, 4), new rjy(this, affdVar, xxyVar, 13), null);
                this.d.ad().af(new xul(this, i));
            }
        }
    }

    public final long a() {
        return Collection.EL.stream(this.a).mapToLong(new cpt(13)).sum();
    }

    public final jsk b(zwa zwaVar) {
        if (this.d.aF() && zwaVar != null) {
            try {
                affd affdVarM = this.u.m(zwaVar);
                ConcurrentHashMap concurrentHashMap = this.b;
                if (concurrentHashMap.containsKey(affdVarM)) {
                    return (jsk) concurrentHashMap.get(affdVarM);
                }
                h(affdVarM, this.s);
                if (concurrentHashMap.containsKey(affdVarM)) {
                    jsk jskVar = (jsk) concurrentHashMap.get(affdVarM);
                    zik.bB(this.e, 10, new Exception(g(jskVar)));
                    return jskVar;
                }
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aunn, java.lang.Object] */
    public final ygu c(File file, File file2) {
        aunn aunnVar = this.m;
        dov dovVar = (dov) aunnVar.io();
        SharedPreferences sharedPreferences = this.n;
        byte[] encoded = dovVar.ai(sharedPreferences).getEncoded();
        dov dovVar2 = (dov) aunnVar.io();
        if (!sharedPreferences.contains("media_cache_initialization_vector")) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            byte[] bArr = new byte[16];
            ((SecureRandom) dovVar2.a.io()).nextBytes(bArr);
            editorEdit.putString("media_cache_initialization_vector", Base64.encodeToString(bArr, 0)).apply();
        }
        xeu xeuVar = this.e;
        zjr zjrVar = this.d;
        final ygx ygxVar = new ygx(xeuVar, this.o, this.g, this.p, this, new yfz(zjrVar, xeuVar, file.getAbsolutePath(), file2.getAbsolutePath(), encoded, Base64.decode(sharedPreferences.getString("media_cache_initialization_vector", null), 0)), zjrVar, this.t, this.v);
        if (ygxVar.h.j.m(155, 45477256L)) {
            ygxVar.c.execute(afwl.i(new Runnable() { // from class: ygv
                @Override // java.lang.Runnable
                public final void run() {
                    yfo yfoVar;
                    awmd awmdVar;
                    zjr zjrVar2;
                    mbc mbcVar;
                    long j;
                    ygx ygxVar2 = ygxVar;
                    ygxVar2.g.lock();
                    try {
                        zjr zjrVar3 = ygxVar2.h;
                        ygxVar2.o = zjrVar3.J() > 0 ? zjrVar3.J() : 5000L;
                        mbc mbcVar2 = ygxVar2.a;
                        long jD = mbcVar2.d();
                        yfz yfzVar = ygxVar2.q;
                        File file3 = yfzVar.c;
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        agkz<String> agkzVarB = yfzVar.b();
                        agkz<String> agkzVarC = yfzVar.c();
                        for (String str : agkzVarC) {
                            if (agkzVarB.contains(str)) {
                                try {
                                    yfx yfxVarA = yfzVar.a(str);
                                    zkf.c(str.equals(yfxVarA.c));
                                    ygl yglVar = new ygl(yfxVarA.c, yfzVar, mbcVar2, zjrVar3);
                                    long j2 = yfxVarA.d;
                                    Iterator it = yfxVarA.e.iterator();
                                    while (it.hasNext()) {
                                        yfv yfvVar = (yfv) it.next();
                                        int i = yfvVar.c;
                                        Iterator it2 = it;
                                        String str2 = yfvVar.d;
                                        zjrVar2 = zjrVar3;
                                        mbcVar = mbcVar2;
                                        try {
                                            long j3 = yfvVar.e;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            j = jD;
                                            try {
                                                ygk ygkVar = new ygk(i, str2, j3);
                                                if (zjrVar2.dX()) {
                                                    FormatInitializationMetadataOuterClass$FormatInitializationMetadata defaultInstance = yfvVar.h;
                                                    if (defaultInstance == null) {
                                                        defaultInstance = FormatInitializationMetadataOuterClass$FormatInitializationMetadata.getDefaultInstance();
                                                    }
                                                    yglVar.m(ygkVar, defaultInstance);
                                                }
                                                Iterator it3 = yfvVar.f.iterator();
                                                while (it3.hasNext()) {
                                                    yglVar.i(ygkVar, (yez) it3.next(), yfvVar.g);
                                                }
                                                it = it2;
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            } catch (IOException e) {
                                                e = e;
                                                zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                                ygxVar2.q.j(str);
                                                zik.bB(ygxVar2.n, 2, e);
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            } catch (IllegalStateException e2) {
                                                e = e2;
                                                zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                                ygxVar2.q.j(str);
                                                zik.bB(ygxVar2.n, 2, e);
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            } catch (yga e3) {
                                                e = e3;
                                                zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                                ygxVar2.q.j(str);
                                                zik.bB(ygxVar2.n, 2, e);
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            }
                                        } catch (IOException e4) {
                                            e = e4;
                                            j = jD;
                                            zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                            ygxVar2.q.j(str);
                                            zik.bB(ygxVar2.n, 2, e);
                                            zjrVar3 = zjrVar2;
                                            mbcVar2 = mbcVar;
                                            jD = j;
                                        } catch (IllegalStateException e5) {
                                            e = e5;
                                            j = jD;
                                            zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                            ygxVar2.q.j(str);
                                            zik.bB(ygxVar2.n, 2, e);
                                            zjrVar3 = zjrVar2;
                                            mbcVar2 = mbcVar;
                                            jD = j;
                                        } catch (yga e6) {
                                            e = e6;
                                            j = jD;
                                            zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                            ygxVar2.q.j(str);
                                            zik.bB(ygxVar2.n, 2, e);
                                            zjrVar3 = zjrVar2;
                                            mbcVar2 = mbcVar;
                                            jD = j;
                                        }
                                    }
                                    zjrVar2 = zjrVar3;
                                    mbcVar = mbcVar2;
                                    j = jD;
                                    yglVar.e.set(j2);
                                    yglVar.d = true;
                                    ygxVar2.l.put(str, yglVar);
                                    ygxVar2.e += Collection.EL.stream(yglVar.f.values()).mapToLong(new ygh(2)).sum();
                                } catch (IOException | IllegalStateException | yga e7) {
                                    e = e7;
                                    zjrVar2 = zjrVar3;
                                    mbcVar = mbcVar2;
                                }
                                zjrVar3 = zjrVar2;
                                mbcVar2 = mbcVar;
                                jD = j;
                            } else {
                                yfzVar.j(str);
                            }
                        }
                        long j4 = jD;
                        for (String str3 : agkzVarB) {
                            if (!agkzVarC.contains(str3)) {
                                ygxVar2.q.j(str3);
                            }
                        }
                        Comparator comparatorComparing = Comparator$CC.comparing(new ygi(2));
                        Map map = ygxVar2.l;
                        java.util.Collection collectionValues = map.values();
                        comparatorComparing.getClass();
                        Object[] array = aguu.O(collectionValues).toArray();
                        int length = array.length;
                        aguu.j(array, length);
                        Arrays.sort(array, comparatorComparing);
                        agke agkeVarI = agke.i(array, length);
                        int i2 = ((agpi) agkeVarI).d;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ygxVar2.k.add(((ygl) agkeVarI.get(i3)).c);
                        }
                        ygxVar2.d.set(Collection.EL.stream(map.values()).mapToLong(new ygh(5)).sum());
                        ygx.B(ygxVar2.q.c);
                        ygxVar2.m.addAll((agkz) Collection.EL.stream(map.values()).flatMap(new ygi(3)).collect(aghu.b));
                        long jD2 = (ygxVar2.a.d() - j4) / 1000;
                        zhq zhqVar = zhq.ABR;
                        xhn xhnVar = new xhn(jD2);
                        Lock lock = ygxVar2.j;
                        lock.lock();
                        try {
                            if (a.av(ygxVar2.f, ygw.a, ygw.b)) {
                                ygxVar2.r = xhnVar;
                                xxy xxyVar = ygxVar2.s;
                                if (xxyVar != null) {
                                    ygxVar2.b.execute(afwl.i(new wdd(xxyVar, xhnVar, 12, (byte[]) null)));
                                } else if (ygxVar2.h.eg()) {
                                    zik.bB(ygxVar2.n, 15, new jsi("c.setCacheInitStats;m.nullListener"));
                                }
                                ygxVar2.j.unlock();
                            } else {
                                lock.unlock();
                                ygxVar2.C(true, true);
                            }
                            ygxVar2.g.unlock();
                            zjr zjrVar4 = ygxVar2.h;
                            if ((zjrVar4.en() || zjrVar4.em()) && (awmdVar = (yfoVar = ygxVar2.i).f) != null && yfoVar.i.compareAndSet(false, true)) {
                                File file4 = new File((File) awmdVar.io(), "exo");
                                File file5 = new File((File) awmdVar.io(), "media/cache");
                                zjr zjrVar5 = yfoVar.d;
                                if (zjrVar5.em() && file4.exists()) {
                                    yfz.i(file4);
                                }
                                if (zjrVar5.en() && file5.exists()) {
                                    yfz.i(file5);
                                }
                            }
                        } catch (Throwable th) {
                            ygxVar2.j.unlock();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ygxVar2.g.unlock();
                        throw th2;
                    }
                }
            }));
        } else {
            ygxVar.b.execute(afwl.i(new Runnable() { // from class: ygv
                @Override // java.lang.Runnable
                public final void run() {
                    yfo yfoVar;
                    awmd awmdVar;
                    zjr zjrVar2;
                    mbc mbcVar;
                    long j;
                    ygx ygxVar2 = ygxVar;
                    ygxVar2.g.lock();
                    try {
                        zjr zjrVar3 = ygxVar2.h;
                        ygxVar2.o = zjrVar3.J() > 0 ? zjrVar3.J() : 5000L;
                        mbc mbcVar2 = ygxVar2.a;
                        long jD = mbcVar2.d();
                        yfz yfzVar = ygxVar2.q;
                        File file3 = yfzVar.c;
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        agkz<String> agkzVarB = yfzVar.b();
                        agkz<String> agkzVarC = yfzVar.c();
                        for (String str : agkzVarC) {
                            if (agkzVarB.contains(str)) {
                                try {
                                    yfx yfxVarA = yfzVar.a(str);
                                    zkf.c(str.equals(yfxVarA.c));
                                    ygl yglVar = new ygl(yfxVarA.c, yfzVar, mbcVar2, zjrVar3);
                                    long j2 = yfxVarA.d;
                                    Iterator it = yfxVarA.e.iterator();
                                    while (it.hasNext()) {
                                        yfv yfvVar = (yfv) it.next();
                                        int i = yfvVar.c;
                                        Iterator it2 = it;
                                        String str2 = yfvVar.d;
                                        zjrVar2 = zjrVar3;
                                        mbcVar = mbcVar2;
                                        try {
                                            long j3 = yfvVar.e;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            j = jD;
                                            try {
                                                ygk ygkVar = new ygk(i, str2, j3);
                                                if (zjrVar2.dX()) {
                                                    FormatInitializationMetadataOuterClass$FormatInitializationMetadata defaultInstance = yfvVar.h;
                                                    if (defaultInstance == null) {
                                                        defaultInstance = FormatInitializationMetadataOuterClass$FormatInitializationMetadata.getDefaultInstance();
                                                    }
                                                    yglVar.m(ygkVar, defaultInstance);
                                                }
                                                Iterator it3 = yfvVar.f.iterator();
                                                while (it3.hasNext()) {
                                                    yglVar.i(ygkVar, (yez) it3.next(), yfvVar.g);
                                                }
                                                it = it2;
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            } catch (IOException e) {
                                                e = e;
                                                zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                                ygxVar2.q.j(str);
                                                zik.bB(ygxVar2.n, 2, e);
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            } catch (IllegalStateException e2) {
                                                e = e2;
                                                zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                                ygxVar2.q.j(str);
                                                zik.bB(ygxVar2.n, 2, e);
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            } catch (yga e3) {
                                                e = e3;
                                                zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                                ygxVar2.q.j(str);
                                                zik.bB(ygxVar2.n, 2, e);
                                                zjrVar3 = zjrVar2;
                                                mbcVar2 = mbcVar;
                                                jD = j;
                                            }
                                        } catch (IOException e4) {
                                            e = e4;
                                            j = jD;
                                            zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                            ygxVar2.q.j(str);
                                            zik.bB(ygxVar2.n, 2, e);
                                            zjrVar3 = zjrVar2;
                                            mbcVar2 = mbcVar;
                                            jD = j;
                                        } catch (IllegalStateException e5) {
                                            e = e5;
                                            j = jD;
                                            zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                            ygxVar2.q.j(str);
                                            zik.bB(ygxVar2.n, 2, e);
                                            zjrVar3 = zjrVar2;
                                            mbcVar2 = mbcVar;
                                            jD = j;
                                        } catch (yga e6) {
                                            e = e6;
                                            j = jD;
                                            zhr.a(zhq.CACHE, "Cannot read video metadata, deleting the video");
                                            ygxVar2.q.j(str);
                                            zik.bB(ygxVar2.n, 2, e);
                                            zjrVar3 = zjrVar2;
                                            mbcVar2 = mbcVar;
                                            jD = j;
                                        }
                                    }
                                    zjrVar2 = zjrVar3;
                                    mbcVar = mbcVar2;
                                    j = jD;
                                    yglVar.e.set(j2);
                                    yglVar.d = true;
                                    ygxVar2.l.put(str, yglVar);
                                    ygxVar2.e += Collection.EL.stream(yglVar.f.values()).mapToLong(new ygh(2)).sum();
                                } catch (IOException | IllegalStateException | yga e7) {
                                    e = e7;
                                    zjrVar2 = zjrVar3;
                                    mbcVar = mbcVar2;
                                }
                                zjrVar3 = zjrVar2;
                                mbcVar2 = mbcVar;
                                jD = j;
                            } else {
                                yfzVar.j(str);
                            }
                        }
                        long j4 = jD;
                        for (String str3 : agkzVarB) {
                            if (!agkzVarC.contains(str3)) {
                                ygxVar2.q.j(str3);
                            }
                        }
                        Comparator comparatorComparing = Comparator$CC.comparing(new ygi(2));
                        Map map = ygxVar2.l;
                        java.util.Collection collectionValues = map.values();
                        comparatorComparing.getClass();
                        Object[] array = aguu.O(collectionValues).toArray();
                        int length = array.length;
                        aguu.j(array, length);
                        Arrays.sort(array, comparatorComparing);
                        agke agkeVarI = agke.i(array, length);
                        int i2 = ((agpi) agkeVarI).d;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ygxVar2.k.add(((ygl) agkeVarI.get(i3)).c);
                        }
                        ygxVar2.d.set(Collection.EL.stream(map.values()).mapToLong(new ygh(5)).sum());
                        ygx.B(ygxVar2.q.c);
                        ygxVar2.m.addAll((agkz) Collection.EL.stream(map.values()).flatMap(new ygi(3)).collect(aghu.b));
                        long jD2 = (ygxVar2.a.d() - j4) / 1000;
                        zhq zhqVar = zhq.ABR;
                        xhn xhnVar = new xhn(jD2);
                        Lock lock = ygxVar2.j;
                        lock.lock();
                        try {
                            if (a.av(ygxVar2.f, ygw.a, ygw.b)) {
                                ygxVar2.r = xhnVar;
                                xxy xxyVar = ygxVar2.s;
                                if (xxyVar != null) {
                                    ygxVar2.b.execute(afwl.i(new wdd(xxyVar, xhnVar, 12, (byte[]) null)));
                                } else if (ygxVar2.h.eg()) {
                                    zik.bB(ygxVar2.n, 15, new jsi("c.setCacheInitStats;m.nullListener"));
                                }
                                ygxVar2.j.unlock();
                            } else {
                                lock.unlock();
                                ygxVar2.C(true, true);
                            }
                            ygxVar2.g.unlock();
                            zjr zjrVar4 = ygxVar2.h;
                            if ((zjrVar4.en() || zjrVar4.em()) && (awmdVar = (yfoVar = ygxVar2.i).f) != null && yfoVar.i.compareAndSet(false, true)) {
                                File file4 = new File((File) awmdVar.io(), "exo");
                                File file5 = new File((File) awmdVar.io(), "media/cache");
                                zjr zjrVar5 = yfoVar.d;
                                if (zjrVar5.em() && file4.exists()) {
                                    yfz.i(file4);
                                }
                                if (zjrVar5.en() && file5.exists()) {
                                    yfz.i(file5);
                                }
                            }
                        } catch (Throwable th) {
                            ygxVar2.j.unlock();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ygxVar2.g.unlock();
                        throw th2;
                    }
                }
            }));
        }
        return ygxVar;
    }

    @Override // defpackage.zgf
    public final zge d() {
        yfk yfkVar = this.c;
        long jA = a();
        long jA2 = yfkVar.a(jA);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap.isEmpty()) {
            return new zge(jA, jA2, -1L, -1L, "inst.null");
        }
        String str = "inst";
        for (jsk jskVar : concurrentHashMap.values()) {
            str = str + '.' + g(jskVar) + '.' + jskVar.a();
        }
        File file = this.j;
        return file == null ? new zge(jA, jA2, -1L, -1L, str) : new zge(jA, jA2, file.getFreeSpace(), file.getTotalSpace(), str);
    }

    public final void f(awmd awmdVar, xxy xxyVar, Set set) {
        if (!this.q.compareAndSet(false, true)) {
            zvp.a(zvn.b, zvm.f, "CacheSupervisor doInit called more than once");
            return;
        }
        this.s = xxyVar;
        if (this.d.aF()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                h((affd) it.next(), xxyVar);
            }
        } else {
            jsk jskVar = (jsk) ((agfr) awmdVar.io()).io();
            ygu ygdVar = jskVar instanceof ygu ? (ygu) jskVar : new ygd();
            ygdVar.A(xxyVar);
            this.a.add(ygdVar);
        }
    }
}
