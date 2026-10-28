package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.AssetDetail;
import com.google.research.xeno.effect.Control;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.MultiEffectSingleGraph;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gmf implements ahcx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public gmf(gmj gmjVar, zwa zwaVar, awqk awqkVar, int i) {
        this.$cid = i;
        this.a = gmjVar;
        this.b = zwaVar;
        this.c = awqkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, tng] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v133, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v2, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v5, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v52, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, ont] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, mbc] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() throws IOException {
        NetworkInfo activeNetworkInfo;
        agke agkeVar;
        int i;
        Optional optionalOf;
        int i2 = 3;
        int i3 = 15;
        int i4 = 12;
        int i5 = 5;
        int i6 = 4;
        int i7 = 19;
        int i8 = 20;
        int i9 = 2;
        ArrayList arrayList = null;
        int i10 = 0;
        switch (this.$cid) {
            case 0:
                ?? r3 = this.c;
                ?? r2 = this.b;
                gmj gmjVar = (gmj) this.a;
                return awrc.ag(gmjVar.c, awov.a, new gme(gmjVar, (zwa) r2, (awqk) r3, (awoq) null, 0));
            case 1:
                ?? r4 = this.c;
                ?? r5 = this.b;
                gmj gmjVar2 = (gmj) this.a;
                return awrc.ag(gmjVar2.c, awov.a, new gme(gmjVar2, r5, r4, null, 1, null));
            case 2:
                Bitmap bitmap = (Bitmap) ahng.v(this.b);
                List list = (List) ahng.v(this.c);
                Object obj = this.a;
                hcp hcpVar = (hcp) obj;
                return ahno.ar(ahno.am(hcpVar.c.a(), Throwable.class, new cbs(i7), MoreExecutors.directExecutor()), new hco(obj, (Object) bitmap, list, i10), hcpVar.e);
            case 3:
                List list2 = (List) ahng.v(this.b);
                agkj agkjVar = (agkj) Collection.EL.stream((agke) ahng.v(this.c)).collect(aghu.b(new hnf(i6), new hnf(i5), new hnh(i10)));
                Stream stream = Collection.EL.stream(list2);
                agkz agkzVarKeySet = agkjVar.keySet();
                agkzVarKeySet.getClass();
                agke agkeVar2 = (agke) stream.filter(new gnh(agkzVarKeySet, i4)).map(new hfw(agkjVar, 7)).collect(aghu.a);
                Object obj2 = this.a;
                hnl hnlVar = (hnl) obj2;
                afxd afxdVarF = afxd.f(hnlVar.c.b(agkeVar2));
                hdn hdnVar = new hdn(i3);
                Executor executor = hnlVar.d;
                return afxd.f(afxdVarF.g(hdnVar, executor)).h(new hba(obj2, 9), executor);
            case 4:
                List list3 = (List) ahng.v(this.b);
                List list4 = (List) ahng.v(this.c);
                ahno.F(list3.size() == list4.size());
                agjz agjzVar = new agjz(4);
                int i11 = 0;
                while (i10 < list3.size()) {
                    anyx anyxVar = (anyx) list3.get(i10);
                    if (((aamp) list4.get(i10)) == aamp.PLAYABLE) {
                        agjzVar.h(((iev) this.a).a(anyxVar, i11));
                        i11++;
                    }
                    i10++;
                }
                return afxd.f(ahng.t(agjzVar.g()));
            case 5:
                return ahng.n(Integer.valueOf(((iuo) this.c).e.update((Uri) this.b, (ContentValues) this.a, null, null)));
            case 6:
                Object obj3 = this.a;
                iuo iuoVar = (iuo) this.c;
                Uri uri = (Uri) obj3;
                int iA = iuoVar.a(uri);
                ContentValues contentValues = new ContentValues();
                contentValues.put("audio_id", ((Uri) this.b).getLastPathSegment());
                contentValues.put("play_order", Integer.valueOf(iA + 1));
                return ahng.n(iuoVar.e.insert(ixt.o(uri), contentValues));
            case 7:
                Object obj4 = this.b;
                Object obj5 = this.c;
                Object obj6 = this.a;
                try {
                    ?? r6 = ((syn) obj6).d;
                    ?? r15 = ((syn) obj6).c;
                    r6.a((String) obj5, r15.size() + 1);
                    r15.put(obj5, obj4);
                    return aher.a;
                } catch (Exception e) {
                    onb.g(e, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", obj5);
                    return ahng.m(e);
                }
            case 8:
                Object obj7 = this.c;
                Object obj8 = this.b;
                try {
                    int iBt = a.bt(((axhi) ((qib) obj8).e.io()).e);
                    Object obj9 = this.a;
                    if (iBt != 0 && iBt == 5) {
                        ((qhy) obj9).r = (qjj) obj7;
                    }
                    Context context = ((qib) obj8).a;
                    ((qhy) obj9).l = ((qib) obj8).h.d();
                    int type = -1;
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                            type = activeNetworkInfo.getType();
                        }
                        break;
                    } catch (SecurityException e2) {
                        ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e2)).k("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).t("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                    }
                    int iF = Callback.Helper.f(type);
                    ((qhy) obj9).s = iF != 0 ? iF : 1;
                    int i12 = ((qhx) ((qib) obj8).b.io()).a;
                    synchronized (((qib) obj8).c) {
                        ((qib) obj8).f.ensureCapacity(i12);
                        ((qib) obj8).f.add(obj9);
                        if (((qib) obj8).f.size() >= i12) {
                            arrayList = ((qib) obj8).f;
                            ((qib) obj8).f = new ArrayList(0);
                        }
                        break;
                    }
                    ListenableFuture listenableFutureB = arrayList == null ? aher.a : ((qib) obj8).b(((qhz) ((qib) obj8).d.io()).c(arrayList));
                    ((qib) obj8).g.decrementAndGet();
                    return listenableFutureB;
                } catch (Throwable th) {
                    ((qib) obj8).g.decrementAndGet();
                    throw th;
                }
            case 9:
                Object obj10 = this.a;
                qrg qrgVar = (qrg) obj10;
                Uri uri2 = (Uri) ahng.v(qrgVar.b);
                qqc qqcVar = new qqc((Closeable) qrgVar.h.X(uri2, new qqp(3)));
                ?? r1 = this.c;
                ?? r16 = this.b;
                try {
                    ListenableFuture listenableFutureC = ((qrg) obj10).c(uri2, new qrd((qrg) obj10, i10));
                    ListenableFuture listenableFutureF = ahcs.f(listenableFutureC, r16, r1);
                    ListenableFuture listenableFutureB2 = qrg.b(ahcs.f(listenableFutureF, afwl.d(new okx(obj10, listenableFutureC, listenableFutureF, i7)), MoreExecutors.directExecutor()), qqcVar.a());
                    qqcVar.close();
                    return listenableFutureB2;
                } catch (Throwable th2) {
                    try {
                        qqcVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 10:
                ?? r0 = this.b;
                Object obj11 = this.c;
                Object obj12 = this.a;
                rgw rgwVar = (rgw) obj12;
                synchronized (rgwVar.c) {
                    Stream map = Collection.EL.stream(r0).map(new iuk(obj11, i8));
                    Collector collector = aghu.a;
                    ((rgw) obj12).h = (agke) map.collect(collector);
                    agkeVar = (agke) Collection.EL.stream(((rgw) obj12).h).flatMap(new rcs(14)).collect(collector);
                    ahno.O(Collection.EL.stream(agkeVar).allMatch(new rej(i2)));
                    i = 13;
                    if (!((rgw) obj12).g.i) {
                        agke agkeVar3 = (agke) Collection.EL.stream(agkeVar).filter(new jor(i4)).map(new qzp(i10)).collect(collector);
                        if (agkeVar3.isEmpty()) {
                            optionalOf = Optional.empty();
                        } else if (agkeVar3.size() == 1) {
                            optionalOf = Optional.of((qvk) aguu.M(agkeVar3));
                        } else {
                            int size = agkeVar3.size();
                            final boolean[] zArr = new boolean[size];
                            Arrays.fill(zArr, true);
                            List list5 = (List) Collection.EL.stream(agkeVar3).map(new qzp(i9)).collect(collector);
                            if (list5 == null || list5.isEmpty()) {
                                throw new InvalidParameterException("Cannot create MultiEffectSingleGraph with null or empty effect list");
                            }
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                if (((Effect) it.next()) == null) {
                                    throw new InvalidParameterException("Cannot create MultiEffectSingleGraph with null effect(s)");
                                }
                            }
                            if (list5.size() != size) {
                                throw new InvalidParameterException("The number of effect activations must be equivalent to the number of effects");
                            }
                            final axle axleVar = new axle(null, null);
                            atqo.b(list5, new atvf() { // from class: atvd
                                @Override // defpackage.atvf
                                public final void a(long[] jArr) {
                                    String[] strArr = new String[1];
                                    long jNativeCreate = MultiEffectSingleGraph.nativeCreate(jArr, zArr, new Control[jArr.length], strArr);
                                    axle axleVar2 = axleVar;
                                    if (jNativeCreate != 0) {
                                        axleVar2.a = new MultiEffectSingleGraph(jNativeCreate);
                                    } else {
                                        axleVar2.a = null;
                                        axleVar2.b = strArr[0];
                                    }
                                }
                            });
                            Object obj13 = axleVar.b;
                            if (obj13 != null) {
                                throw new agfz((String) obj13);
                            }
                            Object obj14 = axleVar.a;
                            optionalOf = Collection.EL.stream(agkeVar3).anyMatch(new jor(i)) ? Optional.of(new qzj(((MultiEffectSingleGraph) obj14).a, agkeVar3)) : Optional.of(new qvk(((MultiEffectSingleGraph) obj14).a));
                        }
                        agkeVar = (agke) optionalOf.stream().collect(collector);
                    }
                }
                if (rgwVar.i == null) {
                    return aher.a;
                }
                Optional optional = rgwVar.d;
                hqc hqcVar = new hqc(r0, obj11, i7);
                if (true == optional.isPresent()) {
                    Object obj15 = optional.get();
                    ?? r7 = hqcVar.a;
                    Object obj16 = hqcVar.b;
                    Stream stream2 = Collection.EL.stream(r7);
                    obj16.getClass();
                    ((rbr) obj15).c(nqz.h((agke) stream2.filter(new jmy(obj16, i)).collect(aghu.a)));
                }
                return rgwVar.i.j(agkeVar);
            case 11:
                Object obj17 = this.b;
                Optional optional2 = (Optional) obj17;
                Object objC = obj17;
                if (true == optional2.isPresent()) {
                    objC = nrb.c(optional2.get());
                }
                Object obj18 = this.c;
                Object obj19 = this.a;
                rhg rhgVar = (rhg) obj19;
                rhgVar.h = (Optional) objC;
                hqc hqcVar2 = new hqc(obj19, obj18, i8);
                Optional optional3 = rhgVar.f;
                if (true == optional3.isPresent()) {
                    Object obj20 = optional3.get();
                    Object obj21 = hqcVar2.a;
                    Object obj22 = hqcVar2.b;
                    rbr rbrVar = (rbr) obj20;
                    Optional optionalOfNullable = ((rhg) obj21).h;
                    hlx hlxVar = new hlx(obj22, i8);
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable(((Optional) hlxVar.a).get());
                    }
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable(agke.q((qvc) optionalOfNullable.get()));
                    }
                    rbrVar.c(nqz.h((agke) optionalOfNullable.orElse(agpi.a)));
                }
                rht rhtVar = rhgVar.e;
                Optional optionalOfNullable2 = rhgVar.h;
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = Optional.ofNullable(agke.q((qvk) optionalOfNullable2.get()));
                }
                return rhtVar.j((agke) optionalOfNullable2.orElse(agpi.a));
            case 12:
                ((sbo) this.a).c = true;
                ArrayList arrayList2 = new ArrayList();
                sbp sbpVar = (sbp) this.b;
                for (sni sniVar : sbpVar.g.aa()) {
                    snk snkVar = sniVar.b;
                    if ((snkVar instanceof skg) && Objects.equals(((skg) snkVar).a, ((yvs) this.c).a)) {
                        arrayList2.add(sniVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ((rsk) sbpVar.a.io()).q(arrayList2);
                }
                return aher.a;
            case 13:
                ((sny) this.a).c((zxi) this.c, this.b);
                return aher.a;
            case 14:
                return ((vbk) this.b).a((AssetDetail) this.c, (uzz) this.a);
            case 15:
                Status statusK = ((xpl) this.a).k(((aigj) this.c).G(), (byte[]) ahng.v(this.b));
                return !statusK.e() ? ahng.m(statusK.asException()) : aher.a;
            case 16:
                wee weeVarF = ((hed) this.a).F(this.b, (akuz) this.c);
                afuu afuuVarC = afwt.c(71, "fut entity mutation in memory future");
                try {
                    ListenableFuture listenableFutureG = tzk.g(weeVarF.a);
                    afuuVarC.a(listenableFutureG);
                    afuuVarC.close();
                    afuu afuuVarC2 = afwt.c(72, "fut entity mutation persistent future");
                    try {
                        ListenableFuture listenableFutureG2 = tzk.g(weeVarF.b);
                        afuuVarC2.a(listenableFutureG2);
                        afuuVarC2.close();
                        return ahno.av(listenableFutureG, listenableFutureG2).k(new okp(i3), MoreExecutors.directExecutor());
                    } catch (Throwable th4) {
                        try {
                            afuuVarC2.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        afuuVarC.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            case 17:
                abqq abqqVar = (abqq) this.b;
                ajcs ajcsVar = (ajcs) ((elr) abqqVar.j).s((ozj) this.a).orElse(null);
                Object obj23 = this.c;
                if (ajcsVar == null || (ajcsVar.b & SemanticState.Focused) == 0) {
                    return ahng.m(new IllegalArgumentException());
                }
                atol atolVarA = atol.a(ajcsVar.c);
                if (atolVarA == null) {
                    atolVarA = atol.NOTIFICATION_TYPE_UNKNOWN;
                }
                if (atolVarA == atol.NOTIFICATION_TYPE_UNKNOWN) {
                    return ahng.m(new IllegalArgumentException());
                }
                awmd awmdVar = (awmd) abqqVar.c.get(atolVarA);
                if (awmdVar == null) {
                    return ahng.m(new IllegalArgumentException());
                }
                try {
                    elr elrVar = (elr) awmdVar.io();
                    aocx aocxVar = ajcsVar.l;
                    if (aocxVar == null) {
                        aocxVar = aocx.a;
                    }
                    String string = UUID.randomUUID().toString();
                    Object obj24 = elrVar.a;
                    aqed aqedVar = aocxVar.b;
                    if (aqedVar == null) {
                        aqedVar = aqed.a;
                    }
                    String str = aqedVar.e;
                    if (str.isEmpty()) {
                        return ahng.m(new IllegalArgumentException());
                    }
                    String strTrim = ((String) obj23).trim();
                    if (strTrim.isEmpty()) {
                        return ahng.m(new IllegalArgumentException());
                    }
                    Object obj25 = ((zhg) obj24).a;
                    wuc wucVarA = ((wud) obj25).a();
                    int i13 = 8;
                    if ((aqedVar.b & 8) != 0) {
                        wucVarA.n(aqedVar.f);
                    } else {
                        wucVarA.o(vzh.b);
                    }
                    int iAO = acfz.aO(aqedVar.c);
                    if (iAO == 0) {
                        iAO = 1;
                    }
                    wucVarA.d = iAO;
                    wucVarA.e(str);
                    aihf aihfVarCreateBuilder = aqec.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aqec aqecVar = (aqec) aihfVarCreateBuilder.instance;
                    aqecVar.e = 2;
                    aqecVar.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    aqec aqecVar2 = (aqec) aihfVarCreateBuilder.instance;
                    aqecVar2.c = 4;
                    aqecVar2.d = Boolean.TRUE;
                    wucVarA.b = (aqec) aihfVarCreateBuilder.build();
                    aihh aihhVar = (aihh) alap.a.createBuilder();
                    aihl aihlVar = aoch.b;
                    aihf aihfVarCreateBuilder2 = aoch.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoch aochVar = (aoch) aihfVarCreateBuilder2.instance;
                    strTrim.getClass();
                    aochVar.c |= 1;
                    aochVar.d = strTrim;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoch aochVar2 = (aoch) aihfVarCreateBuilder2.instance;
                    string.getClass();
                    aochVar2.c |= 2;
                    aochVar2.e = string;
                    aihhVar.e(aihlVar, (aoch) aihfVarCreateBuilder2.build());
                    wucVarA.c = (alap) aihhVar.build();
                    return ahcs.f(((wud) obj25).b(wucVarA, ((zhg) obj24).b), afwl.d(new oly(i13)), MoreExecutors.directExecutor());
                } catch (RuntimeException e3) {
                    return ahng.m(e3);
                }
            case 18:
                aczd aczdVar = (aczd) ((acyv) this.a).a.io();
                ?? r8 = this.c;
                return ahcs.e(aczdVar.b((OptionalInt) this.b, r8), afwl.a(new abzr(17)), r8);
            case 19:
                aeov aeovVar = new aeov();
                aeovVar.a = this.c;
                aeovVar.c = 1;
                ahgb ahgbVar = (ahgb) this.a;
                long epochMilli = ((aeot) ahgbVar.c).a.a.f().toEpochMilli() + 3600000;
                if (epochMilli > 0) {
                    ?? r9 = ahgbVar.d;
                    long jB = r9.b() + (epochMilli - r9.f().toEpochMilli());
                    if (jB <= 0) {
                        jB = -1;
                    }
                    aeovVar.b = jB;
                } else {
                    aeovVar.b = epochMilli;
                }
                Object obj26 = this.b;
                agm agmVar = (agm) ahgbVar.e;
                agmVar.c(obj26, aeovVar);
                AtomicInteger atomicInteger = (AtomicInteger) ahgbVar.a;
                atomicInteger.addAndGet(aeovVar.c);
                if (atomicInteger.get() > 50) {
                    Iterator it2 = agmVar.e().keySet().iterator();
                    while (atomicInteger.get() > 50) {
                        if (it2.hasNext()) {
                            agmVar.d(it2.next());
                        }
                    }
                }
                return ahng.n(null);
            default:
                aepd aepdVar = (aepd) this.b;
                mbc mbcVar = aepdVar.b;
                mbcVar.b();
                aend aendVar = aepdVar.e;
                Executor executor2 = aepdVar.a;
                ListenableFuture listenableFutureB3 = ((wnh) aendVar.d).b((wlu) this.a, executor2, null);
                listenableFutureB3.addListener(new aeia(i5), MoreExecutors.directExecutor());
                return ahng.o(ahcs.e(listenableFutureB3, new acpb(new axlj(this.c, mbcVar, aepdVar.c, (byte[]) null), i8), executor2));
        }
    }

    public /* synthetic */ gmf(iuo iuoVar, Uri uri, ContentValues contentValues, int i) {
        this.$cid = i;
        this.c = iuoVar;
        this.b = uri;
        this.a = contentValues;
    }

    public /* synthetic */ gmf(iuo iuoVar, Uri uri, Uri uri2, int i) {
        this.$cid = i;
        this.c = iuoVar;
        this.a = uri;
        this.b = uri2;
    }

    public /* synthetic */ gmf(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gmf(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gmf(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gmf(vbk vbkVar, AssetDetail assetDetail, uzz uzzVar, int i) {
        this.$cid = i;
        this.b = vbkVar;
        this.c = assetDetail;
        this.a = uzzVar;
    }
}
