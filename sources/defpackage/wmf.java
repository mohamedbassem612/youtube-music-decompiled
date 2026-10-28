package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmf implements zyg {
    private final vyt A;
    private final vxu B;
    private final vxz C;
    private final vxz D;
    public final wlu a;
    public final MessageLite b;
    public final vyo c;
    public final tqj d;
    private final Set e;
    private final Set f;
    private final String h;
    private final boolean i;
    private final awmd j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final sya n;
    private final wkr o;
    private final awmd p;
    private final zzm q;
    private final long r;
    private final agfr s;
    private final boolean t;
    private volatile boolean u;
    private byte[] v;
    private Map w;
    private String x;
    private boolean y;
    private boolean z = true;
    private final String g = "AIzaSyAOghZGza2MQSZkY_zfZ370N-PUdXEo8AI";

    public wmf(Set set, Set set2, vyt vytVar, agev agevVar, vyo vyoVar, vxu vxuVar, tqj tqjVar, awmd awmdVar, zzm zzmVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar, vxz vxzVar2, wkr wkrVar, awmd awmdVar4, awmd awmdVar5, wlu wluVar, MessageLite messageLite, sya syaVar, boolean z) {
        boolean z2 = true;
        this.a = wluVar;
        this.b = messageLite;
        this.e = set;
        this.f = set2;
        this.A = vytVar;
        this.h = (String) agevVar.e("");
        this.c = vyoVar;
        this.B = vxuVar;
        this.d = tqjVar;
        this.i = z;
        this.n = syaVar;
        this.q = zzmVar;
        this.C = vxzVar;
        this.D = vxzVar2;
        int i = tqr.a;
        this.t = tqjVar.k(1073815035);
        if (!wluVar.l && !vxzVar.m(74, 45427814L)) {
            z2 = false;
        }
        this.y = z2;
        this.r = tqjVar.k(1073808352) ? tqjVar.c(2103744) : vxzVar.d(7, 45412999L);
        this.o = wkrVar;
        this.j = awmdVar;
        this.k = awmdVar3;
        this.l = awmdVar2;
        this.m = awmdVar4;
        this.p = awmdVar5;
        this.s = aguu.al(new jxq(this, wluVar, 14, null));
    }

    private final Uri.Builder l() {
        Uri uri;
        boolean z = this.i;
        vyt vytVar = this.A;
        int i = 10;
        if (z) {
            uri = (Uri) ahng.w(ahno.as(hed.C(), new uzh(vytVar, 12), MoreExecutors.directExecutor()));
        } else {
            uri = (Uri) ahng.w(afxd.f(afxd.f(new aher("")).g(new qmd(9), MoreExecutors.directExecutor()).b(Exception.class, new qmd(i), MoreExecutors.directExecutor())).h(new thc(vytVar, 5), MoreExecutors.directExecutor()));
        }
        wlu wluVar = this.a;
        Uri.Builder builderAppendEncodedPath = uri.buildUpon().appendEncodedPath("youtubei/v1").appendEncodedPath(wluVar.t);
        if (!this.D.m(10, 45616823L)) {
            builderAppendEncodedPath.appendQueryParameter("key", this.g);
        }
        String str = this.h;
        if (!TextUtils.isEmpty(str)) {
            builderAppendEncodedPath.appendQueryParameter("asig", str);
        }
        for (zyf zyfVar : this.f) {
            wluVar.k();
            zyfVar.a();
        }
        for (Map.Entry entry : wluVar.k().entrySet()) {
            builderAppendEncodedPath.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderAppendEncodedPath;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awut, java.lang.Object] */
    private final synchronized Map m() {
        Map map;
        if (o()) {
            p();
        }
        map = this.w;
        if (map == null) {
            map = new HashMap();
            map.put("Content-Type", "application/x-protobuf");
            map.put("X-GOOG-API-FORMAT-VERSION", "2");
            if (!W()) {
                this.q.a(d(), P());
            }
            if (o() && this.u) {
                map.put("Content-Encoding", "gzip");
            }
            if (this.z) {
                vyo vyoVar = this.c;
                vxu vxuVar = this.B;
                String strE = vyoVar.e();
                String strE2 = vxuVar.e();
                String str = vxuVar.c().d;
                if (!TextUtils.isEmpty(str)) {
                    map.put("X-Youtube-Cold-Config-Data", str);
                }
                if (!TextUtils.isEmpty(strE2)) {
                    map.put("X-Youtube-Cold-Hash-Data", strE2);
                }
                if (!TextUtils.isEmpty(strE)) {
                    map.put("X-Youtube-Hot-Hash-Data", strE);
                }
                abxv abxvVar = (abxv) this.p.io();
                wlu wluVar = this.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) abxvVar.c;
                zwa zwaVar = wluVar.u;
                vyv vyvVar = (vyv) concurrentHashMap.get(zwaVar);
                if (vyvVar == null) {
                    ?? r4 = abxvVar.b;
                    vyw vywVar = new vyw(abxvVar, zwaVar, null);
                    awov awovVar = awov.a;
                    afws.b(r4);
                    aftx aftxVar = afty.d;
                    afvh afvhVar = (afvh) aftxVar.get();
                    afvl afvlVar = afvhVar.c;
                    if (afvlVar == null || awrc.c(afvlVar, afur.a)) {
                        afvl afvlVar2 = ((afvh) aftxVar.get()).c;
                        afty.e((afvh) aftxVar.get(), afur.a);
                        aftb aftbVar = new aftb(afvlVar2, 2);
                        try {
                            awro.s(r4, awovVar, 1, new afth(vywVar, null));
                            aftbVar.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    aftbVar.close();
                                } catch (Throwable th3) {
                                    avkz.d(th, th3);
                                }
                                throw th2;
                            }
                        }
                    } else {
                        afvl afvlVar3 = afvhVar.d;
                        afvhVar.d = afvhVar.c;
                        try {
                            aftx aftxVar2 = afty.d;
                            afvl afvlVar4 = ((afvh) aftxVar2.get()).c;
                            afty.e((afvh) aftxVar2.get(), afur.a);
                            aftb aftbVar2 = new aftb(afvlVar4, 2);
                            try {
                                awro.s(r4, awovVar, 1, new afth(vywVar, null));
                                aftbVar2.close();
                                afvhVar.d = afvlVar3;
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    try {
                                        aftbVar2.close();
                                    } catch (Throwable th6) {
                                        avkz.d(th4, th6);
                                    }
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            afvhVar.d = afvlVar3;
                            throw th7;
                        }
                    }
                }
                if (vyvVar != null) {
                    String str2 = vyvVar.a;
                    if (!TextUtils.isEmpty(str2)) {
                        map.put("X-Youtube-Account-Static-Hash-Data", str2);
                    }
                    String str3 = vyvVar.b;
                    if (!TextUtils.isEmpty(str3)) {
                        map.put("X-Youtube-Account-Dynamic-Hash-Data", str3);
                    }
                    String str4 = vyvVar.c;
                    if (!TextUtils.isEmpty(str4)) {
                        map.put("X-Youtube-Account-Static-Config-Data", str4);
                    }
                }
            }
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((zxy) it.next()).b(map, this);
            }
            this.w = map;
        }
        return map;
    }

    private final synchronized void n() {
        if (this.t) {
            boolean z = true;
            if (!this.a.l && !this.C.m(74, 45427814L)) {
                z = false;
            }
            if (this.y != z) {
                this.y = z;
                this.v = null;
            }
        }
    }

    private final synchronized boolean o() {
        return this.y && this.o.a;
    }

    private final synchronized byte[] p() {
        byte[] byteArray;
        GZIPOutputStream gZIPOutputStream;
        byteArray = this.v;
        if (byteArray == null) {
            wlu wluVar = this.a;
            wluVar.t();
            byteArray = a(wluVar.a()).toByteArray();
            if (o()) {
                this.u = false;
                int length = byteArray.length;
                if (length >= this.r) {
                    try {
                        aigj aigjVar = aigj.d;
                        aigi aigiVar = new aigi(length);
                        try {
                            int iD = (int) this.C.d(12, 45478148L);
                            if (iD == 0) {
                                gZIPOutputStream = new GZIPOutputStream(aigiVar);
                            } else {
                                if (iD < -1 || iD > 9) {
                                    throw new IllegalArgumentException();
                                }
                                gZIPOutputStream = new wme(aigiVar, iD);
                            }
                            try {
                                gZIPOutputStream.write(byteArray);
                                gZIPOutputStream.finish();
                                byte[] bArrG = aigiVar.b().G();
                                if (length <= bArrG.length) {
                                    throw new IllegalArgumentException("Compressed request body size is larger than uncompressed request");
                                }
                                this.u = true;
                                gZIPOutputStream.close();
                                aigiVar.close();
                                byteArray = bArrG;
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                aigiVar.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException | IllegalArgumentException e) {
                        twu.d(twu.a, 5, "Failed to compress request using Gzip, falling back to uncompressed.", null);
                        zvp.e(zvn.a, zvm.e, "Failed to compress request using Gzip", e);
                    }
                }
            }
            this.v = byteArray;
        }
        return byteArray;
    }

    @Override // defpackage.zyg
    public final zwa P() {
        return this.a.h();
    }

    @Override // defpackage.zyg
    public final zwa Q() {
        throw null;
    }

    @Override // defpackage.zyg
    public final String R() {
        return this.a.s;
    }

    @Override // defpackage.zyg
    public final boolean W() {
        return this.a.u();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, mbc] */
    public final synchronized MessageLite a(aiir aiirVar) {
        aihf aihfVarB;
        aihf aihfVar;
        affd affdVarM;
        wlu wluVar = this.a;
        aihfVarB = wluVar.B();
        if (!this.z) {
            vyo vyoVar = this.c;
            vxu vxuVar = this.B;
            String strE = vyoVar.e();
            String strE2 = vxuVar.e();
            String str = vxuVar.c().d;
            InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVarB.instance).c;
            if (defaultInstance == null) {
                defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
            }
            alom alomVar = defaultInstance.z;
            if (alomVar == null) {
                alomVar = alom.a;
            }
            aihf builder = alomVar.toBuilder();
            if (!TextUtils.isEmpty(str)) {
                builder.copyOnWrite();
                alom alomVar2 = (alom) builder.instance;
                str.getClass();
                alomVar2.b |= 1;
                alomVar2.c = str;
            }
            if (!TextUtils.isEmpty(strE2)) {
                builder.copyOnWrite();
                alom alomVar3 = (alom) builder.instance;
                strE2.getClass();
                alomVar3.b |= 16;
                alomVar3.d = strE2;
            }
            if (!TextUtils.isEmpty(strE)) {
                builder.copyOnWrite();
                alom alomVar4 = (alom) builder.instance;
                strE.getClass();
                alomVar4.b |= 32;
                alomVar4.e = strE;
            }
            InnertubeContext$ClientInfo defaultInstance2 = ((InnertubeContext$InnerTubeContext) aihfVarB.instance).c;
            if (defaultInstance2 == null) {
                defaultInstance2 = InnertubeContext$ClientInfo.getDefaultInstance();
            }
            aihf builder2 = defaultInstance2.toBuilder();
            builder2.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder2.instance;
            alom alomVar5 = (alom) builder.build();
            alomVar5.getClass();
            innertubeContext$ClientInfo.z = alomVar5;
            innertubeContext$ClientInfo.c |= 32768;
            aihfVarB.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarB.instance;
            InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) builder2.build();
            innertubeContext$ClientInfo2.getClass();
            innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
            innertubeContext$InnerTubeContext.b |= 1;
        }
        ((wjr) this.j.io()).I(aihfVarB);
        aihf aihfVarA = ((wkd) this.k.io()).a(aihfVarB);
        if (aihfVarA != null) {
            aihfVarB = aihfVarA;
        }
        wmy wmyVar = (wmy) this.l.io();
        zwa zwaVar = wluVar.u;
        if (wmyVar.a) {
            if (((vxz) wmyVar.d).l(84, 45845664L, false)) {
                try {
                    affdVarM = ((syn) wmyVar.c).m(zwaVar);
                } catch (IllegalStateException e) {
                    if (!zwaVar.m()) {
                        throw e;
                    }
                }
            } else {
                affdVarM = ((syn) wmyVar.c).m(zwaVar);
            }
            wjr wjrVarK = ((wmx) aguu.aw((Context) wmyVar.b, wmx.class, affdVarM)).K();
            if (aihfVarB == null) {
                aihfVar = null;
            } else {
                aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVarB.instance).f;
                if (alooVar == null) {
                    alooVar = aloo.a;
                }
                alyr alyrVar = alooVar.f;
                if (alyrVar == null) {
                    alyrVar = alyr.a;
                }
                aihf builder3 = alyrVar.toBuilder();
                builder3.copyOnWrite();
                ((alyr) builder3.instance).c = alyr.emptyProtobufList();
                List listCi = zik.ci(wjrVarK.a, wjrVarK.b);
                builder3.copyOnWrite();
                alyr alyrVar2 = (alyr) builder3.instance;
                aiie aiieVar = alyrVar2.c;
                if (!aiieVar.c()) {
                    alyrVar2.c = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(listCi, alyrVar2.c);
                aloo alooVar2 = ((InnertubeContext$InnerTubeContext) aihfVarB.instance).f;
                if (alooVar2 == null) {
                    alooVar2 = aloo.a;
                }
                aihf builder4 = alooVar2.toBuilder();
                builder4.copyOnWrite();
                aloo alooVar3 = (aloo) builder4.instance;
                alyr alyrVar3 = (alyr) builder3.build();
                alyrVar3.getClass();
                alooVar3.f = alyrVar3;
                alooVar3.b |= 1048576;
                aihfVarB.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) aihfVarB.instance;
                aloo alooVar4 = (aloo) builder4.build();
                alooVar4.getClass();
                innertubeContext$InnerTubeContext2.f = alooVar4;
                innertubeContext$InnerTubeContext2.b |= 16;
                aihfVar = aihfVarB;
            }
        } else {
            aihfVar = aihfVarB;
        }
        String strA = ((wnb) ((dov) this.m.io()).a).a();
        if (aihfVar != null) {
            aihfVarB = aihfVar;
        }
        if (aihfVarB != null && strA != null && !strA.isEmpty()) {
            InnertubeContext$ClientInfo defaultInstance3 = ((InnertubeContext$InnerTubeContext) aihfVarB.instance).c;
            if (defaultInstance3 == null) {
                defaultInstance3 = InnertubeContext$ClientInfo.getDefaultInstance();
            }
            aihf builder5 = defaultInstance3.toBuilder();
            builder5.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) builder5.instance;
            innertubeContext$ClientInfo3.b |= 131072;
            innertubeContext$ClientInfo3.k = strA;
            aihfVarB.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext3 = (InnertubeContext$InnerTubeContext) aihfVarB.instance;
            InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) builder5.build();
            innertubeContext$ClientInfo4.getClass();
            innertubeContext$InnerTubeContext3.c = innertubeContext$ClientInfo4;
            innertubeContext$InnerTubeContext3.b |= 1;
        }
        return ((aiir) this.n.a(aiirVar, aihfVarB)).build();
    }

    public final String b() {
        return (String) this.s.io();
    }

    @Override // defpackage.zyg
    public final String c() {
        return d();
    }

    public final synchronized String d() {
        String string;
        try {
            string = this.x;
            if (string == null) {
                string = l().build().toString();
                this.x = string;
            }
        } catch (Throwable th) {
            throw th;
        }
        return string;
    }

    public final synchronized Map e() {
        if (this.t && !this.z) {
            this.z = true;
            this.w = null;
        }
        n();
        return m();
    }

    public final synchronized void f(twi twiVar) {
        try {
            Uri.Builder builderL = l();
            twiVar.a(builderL);
            this.x = builderL.build().toString();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public final synchronized void g() {
        ahno.F(!this.t);
        this.y = false;
    }

    @Deprecated
    public final synchronized void h() {
        ahno.F(!this.t);
        this.z = false;
    }

    public final synchronized void i() {
        this.v = null;
    }

    public final synchronized void j() {
        this.x = null;
        this.w = null;
        this.v = null;
    }

    public final synchronized byte[] k() {
        n();
        return p();
    }
}
