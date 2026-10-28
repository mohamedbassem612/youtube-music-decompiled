package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.ResourceMetadata;
import com.google.android.libraries.elements.interfaces.ResourceSource;
import com.google.android.libraries.elements.interfaces.ResourceType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wjr {
    public static wjr c;
    public final Object a;
    public final Object b;

    public wjr(vuz... vuzVarArr) {
        if (vuzVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        ArrayList arrayList = new ArrayList();
        for (vuz vuzVar : vuzVarArr) {
            arrayList.add(vuzVar.r().H(new vvb(vuzVar, 1)));
        }
        int i = avlh.a;
        avue avueVar = new avue(arrayList);
        avnn avnnVar = atqp.j;
        int i2 = 7;
        avlh avlhVarI = avueVar.y(avoi.a).R(agdf.a, new idi(20)).i(new vqh(i2));
        this.a = avlhVarI.H(new vup(4)).p().i(new vqh(i2));
        vuz vuzVar2 = vuzVarArr[0];
        vuzVar2.getClass();
        avuu avuuVar = new avuu(vuzVar2);
        avnn avnnVar2 = atqp.j;
        this.b = avuuVar.k(avlhVarI.x(new jna(19)).H(new vup(5))).p().i(new vqh(i2));
    }

    public static MessageLite E(Parcel parcel, MessageLite messageLite) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray == null) {
            return messageLite;
        }
        wjr wjrVar = c;
        if (wjrVar != null) {
            wjrVar.D(bArrCreateByteArray, messageLite);
        }
        try {
            return messageLite.toBuilder().mergeFrom(bArrCreateByteArray, ExtensionRegistryLite.getGeneratedRegistry()).build();
        } catch (aiik e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static MessageLite F(byte[] bArr, MessageLite messageLite) {
        wjr wjrVar = c;
        return wjrVar != null ? wjrVar.D(bArr, messageLite) : G(bArr, messageLite);
    }

    public static MessageLite G(byte[] bArr, MessageLite messageLite) {
        try {
            return messageLite.toBuilder().mergeFrom(bArr, ExtensionRegistryLite.getGeneratedRegistry()).build();
        } catch (aiik e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String K(zwa zwaVar) {
        String strI = zwaVar.i();
        return TextUtils.isEmpty(strI) ? "default.entitystore" : strI.concat(".entitystore");
    }

    public static int g(String str) {
        try {
            return Integer.parseInt(str.substring(0, 3));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }

    public static int h(String str) {
        try {
            return Integer.parseInt(str.substring(3));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }

    public static String q(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean r(String str) {
        int length;
        return str != null && (length = str.length()) >= 5 && length <= 6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final void A(alos alosVar, xie xieVar) {
        if (((xic) this.a.io()).a()) {
            aebc aebcVar = (aebc) this.b.io();
            ?? r0 = aebcVar.g;
            int i = tqr.a;
            if (r0.k(1073828807)) {
                ((elq) aebcVar.b.io()).l(alot.a(((alou) alosVar.instance).c));
            }
            if (aebcVar.b(alot.a(((alou) alosVar.instance).c), xieVar)) {
                aihf aihfVarC = aebcVar.c(alosVar, xieVar);
                alot alotVarA = alot.a(((alou) alosVar.instance).c);
                if (aebcVar.a) {
                    ((ztf) aebcVar.e.io()).u(aebcVar.a(xieVar, alotVarA), aihfVarC, false, (zsz) aebcVar.c);
                } else {
                    ((ztf) aebcVar.e.io()).t(aebcVar.a(xieVar, alotVarA), aihfVarC);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awmd, java.lang.Object] */
    public final void B(alos alosVar, xie xieVar) {
        if (((xic) this.a.io()).a()) {
            aebc aebcVar = (aebc) this.b.io();
            ?? r0 = aebcVar.g;
            int i = tqr.a;
            if (r0.k(1073828807)) {
                ((elq) aebcVar.b.io()).l(alot.a(((alou) alosVar.instance).c));
            }
            if (aebcVar.b(alot.a(((alou) alosVar.instance).c), xieVar)) {
                aihf aihfVarC = aebcVar.c(alosVar, xieVar);
                if (!aebcVar.a) {
                    ((ztf) aebcVar.e.io()).v(aihfVarC);
                    return;
                }
                ztf ztfVar = (ztf) aebcVar.e.io();
                akku akkuVarA = akku.a(((jrc) aihfVarC.instance).l);
                if (akkuVarA == null) {
                    akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                }
                ztfVar.u(akkuVarA, aihfVarC, true, (zsz) aebcVar.c);
            }
        }
    }

    public final void C(Function function, xie xieVar) {
        A((alos) function.apply((alos) alou.a.createBuilder()), xieVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zwb] */
    @Deprecated
    public final MessageLite D(byte[] bArr, MessageLite messageLite) {
        bArr.getClass();
        messageLite.getClass();
        try {
            ?? H = messageLite.getParserForType().h(bArr, ExtensionRegistryLite.getGeneratedRegistry());
            ((dov) this.b.io()).W(this.a.e(), messageLite.getClass(), bArr);
            return H;
        } catch (aiik e) {
            twu.d(twu.a, 6, "Exception while parsing InnerTube response", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    public final void H(aihf aihfVar, alop alopVar) {
        if (alopVar == null || (alopVar.b & 524288) == 0) {
            return;
        }
        if (aihfVar != null) {
            aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
            if (alooVar == null) {
                alooVar = aloo.a;
            }
            if (alooVar.d.size() != 0) {
                Set setKeySet = this.b.keySet();
                aloo alooVar2 = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
                if (alooVar2 == null) {
                    alooVar2 = aloo.a;
                }
                setKeySet.removeAll(alooVar2.d);
            }
        }
        ?? r6 = this.b;
        akdv akdvVar = alopVar.h;
        if (akdvVar == null) {
            akdvVar = akdv.a;
        }
        long jB = this.a.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        akdv akdvVar2 = alopVar.h;
        if (akdvVar2 == null) {
            akdvVar2 = akdv.a;
        }
        r6.put(akdvVar, Long.valueOf(jB + timeUnit.toMillis(akdvVar2.b)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mbc] */
    public final void I(aihf aihfVar) {
        ?? r0 = this.b;
        if (r0.isEmpty() || aihfVar == null) {
            return;
        }
        aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
        if (alooVar == null) {
            alooVar = aloo.a;
        }
        aihf builder = alooVar.toBuilder();
        builder.copyOnWrite();
        ((aloo) builder.instance).d = aloo.emptyProtobufList();
        Iterator it = r0.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Long) entry.getValue()).longValue() <= this.a.b()) {
                it.remove();
            } else {
                akdv akdvVar = (akdv) entry.getKey();
                builder.copyOnWrite();
                aloo alooVar2 = (aloo) builder.instance;
                akdvVar.getClass();
                aiie aiieVar = alooVar2.d;
                if (!aiieVar.c()) {
                    alooVar2.d = aihn.mutableCopy(aiieVar);
                }
                alooVar2.d.add(akdvVar);
            }
        }
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        aloo alooVar3 = (aloo) builder.build();
        alooVar3.getClass();
        innertubeContext$InnerTubeContext.f = alooVar3;
        innertubeContext$InnerTubeContext.b |= 16;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    public final synchronized omj J(zwa zwaVar, syn synVar) {
        omj omjVarAg;
        ?? r0 = this.b;
        String strK = K(zwaVar);
        omjVarAg = (omj) r0.get(strK);
        if (omjVarAg == null) {
            omjVarAg = ((ayq) this.a.io()).ag(strK, synVar);
            r0.put(strK, omjVarAg);
        }
        return omjVarAg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wek] */
    public final weh a(String str, byte[] bArr) {
        return ((hed) this.a.io()).L(str, bArr).I(this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final Class b(String str) {
        hed hedVar = (hed) this.a.io();
        weq weqVarE = hedVar.E(((wfr) hedVar.b).a(str));
        return weqVarE == null ? weu.class : weqVarE.c();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    public final void c(Context context, zwa zwaVar) {
        final String strK = K(zwaVar);
        final int i = 1;
        final FileFilter fileFilter = new FileFilter() { // from class: wcx
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileFilter, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                if (i != 0) {
                    return file.getName().contains(strK);
                }
                if (strK.accept(file)) {
                    file.delete();
                }
                return false;
            }
        };
        File parentFile = context.getDatabasePath("ignore").getParentFile();
        parentFile.getClass();
        final int i2 = 0;
        parentFile.listFiles(new FileFilter() { // from class: wcx
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileFilter, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                if (i2 != 0) {
                    return file.getName().contains(fileFilter);
                }
                if (fileFilter.accept(file)) {
                    file.delete();
                }
                return false;
            }
        });
        synchronized (this) {
            omj omjVar = (omj) this.b.get(strK);
            if (omjVar != null) {
                ((qso) omjVar.a).onTrimMemory(80);
            }
        }
    }

    public final ResourceEntry d() {
        ResourceType resourceType;
        String str;
        asjk asjkVar = (asjk) this.b;
        String str2 = asjkVar.b;
        int iBc = a.bc(asjkVar.d);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 1) {
            resourceType = ResourceType.EKO_TEMPLATE;
        } else if (i == 2) {
            resourceType = ResourceType.JAVASCRIPT_MODULE;
        } else if (i == 3) {
            resourceType = ResourceType.CERTIFICATE;
        } else {
            if (i != 4) {
                if (iBc == 1) {
                    str = "RESOURCE_TYPE_UNKNOWN";
                } else if (iBc == 2) {
                    str = "RESOURCE_TYPE_EML_TEMPLATE";
                } else if (iBc != 3) {
                    str = iBc != 4 ? "RESOURCE_TYPE_BLOCKS_CONTAINER_MANIFEST" : "RESOURCE_TYPE_CERTIFICATE";
                } else {
                    str = "RESOURCE_TYPE_JAVASCRIPT_MODULE";
                }
                throw new IllegalArgumentException("Unsupported resource type: ".concat(str));
            }
            resourceType = ResourceType.BLOCKS_CONTAINER_MANIFEST;
        }
        ArrayList arrayList = new ArrayList(asjkVar.e);
        int iBc2 = a.bc(asjkVar.d);
        return new ResourceEntry(new ResourceMetadata(str2, resourceType, null, arrayList, (iBc2 != 0 ? iBc2 : 1) == 3 ? "datapush" : null, false, ResourceSource.DATAPUSH), ((vzz) this.a).a(asjkVar.c.isEmpty() ? asjkVar.b.replace('|', '_') : asjkVar.c));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    public final /* synthetic */ void e(ojr ojrVar) {
        qrx qrxVar = (qrx) this.b.io();
        final String str = ojrVar.a;
        final long j = ojrVar.b;
        final int i = ojrVar.d;
        final agev agevVar = ojrVar.c;
        ListenableFuture listenableFutureA = qrxVar.a(new agek() { // from class: wad
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                String str2 = str;
                ooj oojVar = (ooj) obj;
                str2.getClass();
                Long l = (Long) oojVar.b.get(str2);
                long jLongValue = l != null ? l.longValue() : -1L;
                agev agevVar2 = agevVar;
                int i2 = i;
                long j2 = jLongValue;
                long j3 = j;
                wjr wjrVar = this.e;
                boolean z = j3 != j2;
                wjrVar.f(str2, j3, i2, z, agevVar2);
                if (!z) {
                    return oojVar;
                }
                aihf builder = oojVar.toBuilder();
                str2.getClass();
                builder.copyOnWrite();
                ((ooj) builder.instance).a().remove(str2);
                str2.getClass();
                builder.copyOnWrite();
                ((ooj) builder.instance).a().put(str2, Long.valueOf(j3));
                return (ooj) builder.build();
            }
        }, MoreExecutors.directExecutor());
        tab tabVar = new tab() { // from class: wae
            @Override // defpackage.twi
            /* JADX INFO: renamed from: b */
            public final void a(Throwable th) {
                this.e.f(str, j, i, false, agevVar);
            }
        };
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(taf.c, null, tabVar);
        long j2 = afwl.a;
        listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [awmd, java.lang.Object] */
    public final void f(String str, long j, int i, boolean z, agev agevVar) {
        ojp ojpVar = (ojp) agevVar.e(ojp.a().g());
        Bundle bundle = new Bundle();
        bundle.putString("MDD_TASK_TAG_KEY", str);
        syn synVar = (syn) this.a.io();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
        }
        synVar.c(str, j, j, z, i2, ojpVar.a, bundle, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @tcc
    public void handleECatcherParamsReceivedEvent(wjp wjpVar) {
        if (wjpVar.a == null) {
            ((zvr) this.b).g();
        } else {
            this.a.execute(new wdd(this, wjpVar, 3, (char[]) null));
        }
    }

    public final twr i() {
        return j((twq) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mbc] */
    public final twr j(twq twqVar) {
        return new twr(twqVar, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final agcl k() {
        ?? Io = this.b.io();
        Io.getClass();
        Object objIo = this.a.io();
        objIo.getClass();
        return new agcl((aunn) Io, objIo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final agcl l() {
        wud wudVar = (wud) this.b.io();
        wudVar.getClass();
        vxe vxeVar = (vxe) this.a.io();
        vxeVar.getClass();
        return new agcl(wudVar, vxeVar);
    }

    public final synchronized zgj m(String str) {
        Object obj = this.a;
        if (obj != null) {
            return (zgj) ((agm) obj).b(str);
        }
        Object obj2 = this.b;
        if (obj2 == null) {
            return null;
        }
        return (zgj) ((ConcurrentHashMap) obj2).get(str);
    }

    public final synchronized zgj n(String str, zgj zgjVar) {
        Object obj = this.a;
        if (obj == null) {
            Object obj2 = this.b;
            return obj2 != null ? (zgj) ((ConcurrentHashMap) obj2).putIfAbsent(str, zgjVar) : null;
        }
        zgj zgjVar2 = (zgj) ((agm) obj).b(str);
        if (zgjVar2 != null) {
            return zgjVar2;
        }
        ((agm) obj).c(str, zgjVar);
        return null;
    }

    public final synchronized void o(String str, zgj zgjVar) {
        Object obj = this.a;
        if (obj != null) {
            return;
        }
        Object obj2 = this.b;
        if (obj2 != null) {
        }
    }

    public final synchronized void p(String str) {
        Object obj = this.a;
        if (obj != null) {
            return;
        }
        Object obj2 = this.b;
        if (obj2 != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aunn, java.lang.Object] */
    public final jrt s(String str) {
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) this.b.io();
        if (innertubeContext$ClientInfo != null) {
            zjr.fJ();
        }
        aihf aihfVarCreateBuilder = jrt.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        jrt jrtVar = (jrt) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo.getClass();
        jrtVar.c = innertubeContext$ClientInfo;
        jrtVar.b |= 1;
        zfs zfsVar = (zfs) this.a.io();
        zh zhVar = new zh((byte[]) null, (char[]) null);
        zhVar.m(str);
        zfp zfpVarB = zfsVar.b(zhVar.l());
        if (zfpVarB != null) {
            aigj aigjVarV = aigj.v(zfpVarB.b);
            aihfVarCreateBuilder.copyOnWrite();
            jrt jrtVar2 = (jrt) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            jrtVar2.b |= 2;
            jrtVar2.d = aigjVarV;
        }
        return (jrt) aihfVarCreateBuilder.build();
    }

    public final zcy t(agfr agfrVar, agfr agfrVar2) {
        return new zcy((tfq) this.b, (hed) this.a, agfrVar, agfrVar2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final yqp u(yqy yqyVar, bye byeVar, zha zhaVar, String str, String str2) {
        vxz vxzVar = (vxz) this.a.io();
        vxzVar.getClass();
        yqyVar.getClass();
        zjr zjrVar = (zjr) this.b.io();
        zjrVar.getClass();
        return new yqp(vxzVar, yqyVar, byeVar, zhaVar, str, str2, zjrVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xit] */
    public final void v(int i) {
        this.b.put(Integer.valueOf(i - 1), this.a.n(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void w(int i, String str) {
        ?? r0 = this.b;
        Integer numValueOf = Integer.valueOf(i - 1);
        if (!r0.containsKey(numValueOf)) {
            v(i);
        }
        ((xir) r0.get(numValueOf)).n(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void x() {
        this.b.put(120, new xjb());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final void y(amiz amizVar) {
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amizVar.getClass();
        amiuVar.O = amizVar;
        amiuVar.d |= 32;
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.build();
        ?? r0 = this.b;
        if (!r0.containsKey(190)) {
            v(191);
        }
        ((xir) r0.get(190)).h(amiuVar2);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [aunn, java.lang.Object] */
    public final void z(int i, Integer num, boolean z) {
        aihf aihfVarCreateBuilder = amxl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amxl amxlVar = (amxl) aihfVarCreateBuilder.instance;
        amxlVar.c = i - 1;
        amxlVar.b |= 1;
        if (num != null) {
            int iIntValue = num.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            amxl amxlVar2 = (amxl) aihfVarCreateBuilder.instance;
            amxlVar2.b |= 2;
            amxlVar2.d = iIntValue;
            aihfVarCreateBuilder.copyOnWrite();
            amxl amxlVar3 = (amxl) aihfVarCreateBuilder.instance;
            amxlVar3.b |= 8;
            amxlVar3.f = z;
        }
        yco ycoVar = ((ycp) this.b.io()).e;
        if (ycoVar != null) {
            boolean zAv = ycoVar.av();
            aihfVarCreateBuilder.copyOnWrite();
            amxl amxlVar4 = (amxl) aihfVarCreateBuilder.instance;
            amxlVar4.b |= 4;
            amxlVar4.e = zAv;
        }
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MDX_SESSION_CAST_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amxl amxlVar5 = (amxl) aihfVarCreateBuilder.build();
        amxlVar5.getClass();
        alouVar.d = amxlVar5;
        alouVar.c = 350;
        xeuVar.b((alou) alosVar.build());
    }

    public wjr(Context context, syn synVar) {
        this.a = context;
        this.b = synVar;
    }

    public wjr(awmd awmdVar, zwb zwbVar) {
        this.b = awmdVar;
        this.a = zwbVar;
        c = this;
    }

    public wjr(dov dovVar) {
        this.a = dovVar;
        this.b = dovVar;
    }

    public wjr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public wjr(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public wjr() {
        this.a = new ArrayList();
        this.b = new HashSet();
    }

    public wjr(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        this.b = telephonyManager;
        this.a = context;
    }

    public wjr(awmd awmdVar, tqj tqjVar) {
        awmdVar.getClass();
        tqjVar.getClass();
        this.b = awmdVar;
        this.a = tqjVar;
    }

    public wjr(mbc mbcVar) {
        this.a = mbcVar;
        this.b = new ConcurrentHashMap();
    }

    public wjr(mbc mbcVar, byte[] bArr) {
        this.a = mbcVar;
        this.b = new ConcurrentHashMap();
    }

    public wjr(tyz tyzVar, Collection collection) {
        collection.getClass();
        if (!collection.contains(null)) {
            this.a = new dov(collection);
            this.b = tyzVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    public wjr(hno hnoVar, Executor executor) {
        int iC = (int) ((zhl) hnoVar.j).i.c(54, 45800805L, 0L);
        if (iC > 0) {
            this.a = new zgl(iC, executor);
            this.b = null;
        } else {
            this.a = null;
            this.b = new ConcurrentHashMap();
        }
    }

    public wjr(xit xitVar) {
        xitVar.getClass();
        this.a = xitVar;
        this.b = new HashMap();
    }

    public wjr(awmd awmdVar, awmd awmdVar2, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public wjr(Container container, vwt vwtVar) {
        mav mavVar = new mav(container);
        this.a = mavVar;
        this.b = vwtVar;
        mavVar.b((BaseClient) vwtVar.a);
    }

    public wjr(zjr zjrVar) {
        this.b = zjrVar;
        int iE = (int) zjrVar.E();
        this.a = DesugarCollections.synchronizedMap(new ywa(iE, iE));
    }

    public wjr(agfr agfrVar, aunn aunnVar) {
        this.b = agfrVar;
        this.a = aunnVar;
    }

    public wjr(awmd awmdVar, awmd awmdVar2, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public wjr(bec becVar, bec becVar2) {
        becVar.getClass();
        becVar2.getClass();
        this.b = becVar;
        this.a = becVar2;
    }

    public wjr(awmd awmdVar) {
        this.b = new HashMap();
        this.a = awmdVar;
    }

    public wjr(Executor executor, zvr zvrVar) {
        executor.getClass();
        this.a = executor;
        zvrVar.getClass();
        this.b = zvrVar;
    }
}
