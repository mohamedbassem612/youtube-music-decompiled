package defpackage;

import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$VideoRegion;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abae implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abae(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion = null;
        yxe yxeVar = null;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                return;
            case 1:
                ((aamo) this.a).p(Optional.of((Throwable) obj));
                return;
            case 2:
                ((abah) this.a).a = ((aazq) obj).b.au();
                return;
            case 3:
                this.a.invoke(obj);
                return;
            case 4:
                this.a.invoke(obj);
                return;
            case 5:
                ((abez) this.a).c = ((aazq) obj).b;
                return;
            case 6:
                wjf wjfVar = ((aayp) obj).a;
                if (wjfVar != null && wjfVar.M()) {
                    z = true;
                }
                ((abez) this.a).a.set(z);
                return;
            case 7:
                wgs wgsVar = ((yvu) obj).c;
                if (wgsVar != null) {
                    ((abez) this.a).b.set(wgsVar.A());
                    return;
                }
                return;
            case 8:
                ((abfa) this.a).a = ((aazq) obj).b;
                return;
            case 9:
                wjf wjfVar2 = ((aayp) obj).a;
                Object obj2 = this.a;
                if (wjfVar2 == null || !wjfVar2.O()) {
                    ((abfa) obj2).b.set(abfk.a.j);
                    return;
                }
                akfp akfpVarR = wjfVar2.r();
                yxd yxdVarA = abfk.g.j;
                if (akfpVarR != null) {
                    yxc yxcVar = new yxc(yxdVarA);
                    yxcVar.b = akfpVarR;
                    yxdVarA = yxcVar.a();
                }
                ((abfa) obj2).b.set(yxdVarA);
                return;
            case 10:
                long j = ((aaxw) obj).b;
                abfc abfcVar = (abfc) this.a;
                if (j != abfcVar.a.j()) {
                    AtomicLong atomicLong = abfcVar.g;
                    if (atomicLong.get() == -1 || j >= atomicLong.get()) {
                        return;
                    }
                    abfcVar.f();
                    return;
                }
                return;
            case 11:
                acip acipVar = ((aazq) obj).b;
                abfc abfcVar2 = (abfc) this.a;
                abfcVar2.i = acipVar;
                if (abfcVar2.a.ap()) {
                    abfcVar2.f();
                    abfcVar2.p = acipVar.bq();
                    return;
                }
                return;
            case 12:
                if (((aaxm) obj).a.a.isEmpty()) {
                    return;
                }
                ((abfc) this.a).f();
                return;
            case 13:
                abnr abnrVar = ((aaxo) obj).a;
                abfc abfcVar3 = (abfc) this.a;
                abfcVar3.h.set(abnrVar);
                if ((abnrVar == abnr.PICTURE_IN_PICTURE || abnrVar == abnr.MINIMIZED) && abfcVar3.d.get()) {
                    abfcVar3.l.set((abfk) abfcVar3.k.get());
                    return;
                }
                return;
            case 14:
                wgs wgsVar2 = ((yvu) obj).c;
                if (wgsVar2 != null) {
                    abfc abfcVar4 = (abfc) this.a;
                    abfcVar4.b.set(wgsVar2.i());
                    abfcVar4.c.set(wgsVar2.d());
                    abfcVar4.f.set(true);
                    if (abfcVar4.d.get()) {
                        AtomicReference atomicReference = abfcVar4.k;
                        atomicReference.set(abfc.e((abfk) atomicReference.get(), wgsVar2.d()));
                    }
                    if (abfcVar4.a.ap()) {
                        abfe abfeVar = abfcVar4.o;
                        synchronized (abfeVar) {
                            abfeVar.c(wgsVar2.i());
                            abfeVar.b(wgsVar2.d());
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList = ((aayz) obj).a;
                if (stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.getTrackType() != jqz.TRACK_TYPE_VIDEO || stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.getMetadataCount() == 0) {
                    return;
                }
                Object obj3 = this.a;
                abfc abfcVar5 = (abfc) obj3;
                acga acgaVar = abfcVar5.p;
                if (acgaVar != null) {
                    if (!abfcVar5.a.g.m(524, 45856296L) || (abfcVar5.b.get() > 0 && abfcVar5.c.get() > 0)) {
                        StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion2 = null;
                        for (StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion3 : stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.getMetadata(0).b) {
                            if ((stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion3.b & 1) != 0) {
                                abfk abfkVar = abfk.a;
                                StitchedSegmentsMetadataOuterClass$VideoRegion defaultInstance = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion3.c;
                                if (defaultInstance == null) {
                                    defaultInstance = StitchedSegmentsMetadataOuterClass$VideoRegion.getDefaultInstance();
                                }
                                int iBd = a.bd(defaultInstance.b);
                                if (iBd == 0) {
                                    iBd = 1;
                                }
                                int i = iBd - 2;
                                if (i == 1) {
                                    stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion2 = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion3;
                                } else if (i == 2) {
                                    stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion3;
                                }
                            }
                        }
                        if (stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion == null || stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion2 == null) {
                            return;
                        }
                        TimeRangeOuterClass$TimeRange defaultInstance2 = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion2.d;
                        if (defaultInstance2 == null) {
                            defaultInstance2 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                        }
                        ConcurrentHashMap concurrentHashMap = abfcVar5.j;
                        abfm abfmVar = (abfm) concurrentHashMap.get(stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.e);
                        if (abfmVar == null) {
                            String str = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.e;
                            AtomicInteger atomicInteger = abfcVar5.b;
                            AtomicInteger atomicInteger2 = abfcVar5.c;
                            int i2 = atomicInteger.get();
                            int i3 = atomicInteger2.get();
                            StitchedSegmentsMetadataOuterClass$VideoRegion defaultInstance3 = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.c;
                            if (defaultInstance3 == null) {
                                defaultInstance3 = StitchedSegmentsMetadataOuterClass$VideoRegion.getDefaultInstance();
                            }
                            StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion = defaultInstance3;
                            StitchedSegmentsMetadataOuterClass$VideoRegion defaultInstance4 = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion2.c;
                            if (defaultInstance4 == null) {
                                defaultInstance4 = StitchedSegmentsMetadataOuterClass$VideoRegion.getDefaultInstance();
                            }
                            StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion2 = defaultInstance4;
                            long j2 = defaultInstance2.c;
                            long j3 = defaultInstance2.e;
                            long jD = abfc.d(j2, j3);
                            long j4 = j2 + defaultInstance2.d;
                            str.getClass();
                            stitchedSegmentsMetadataOuterClass$VideoRegion.getClass();
                            stitchedSegmentsMetadataOuterClass$VideoRegion2.getClass();
                            abfm abfmVar2 = new abfm(str, i2, i3, abfd.b, stitchedSegmentsMetadataOuterClass$VideoRegion, stitchedSegmentsMetadataOuterClass$VideoRegion2, jD, abfc.d(j4, j3));
                            concurrentHashMap.put(stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.e, abfmVar2);
                            acgaVar.g(abfmVar2);
                            return;
                        }
                        long jMin = Math.min(abfmVar.l(), abfc.d(defaultInstance2.c, defaultInstance2.e));
                        long jMax = Math.max(abfmVar.k(), abfc.d(defaultInstance2.c + defaultInstance2.d, defaultInstance2.e));
                        abfe abfeVar2 = abfmVar.a;
                        synchronized (abfeVar2) {
                            abfeVar2.c(((abfc) obj3).b.get());
                            abfeVar2.b(((abfc) obj3).c.get());
                            StitchedSegmentsMetadataOuterClass$VideoRegion defaultInstance5 = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.c;
                            if (defaultInstance5 == null) {
                                defaultInstance5 = StitchedSegmentsMetadataOuterClass$VideoRegion.getDefaultInstance();
                            }
                            synchronized (abfeVar2) {
                                if (!awrc.c(abfeVar2.d, defaultInstance5)) {
                                    abfeVar2.d = defaultInstance5;
                                    abfeVar2.j = true;
                                }
                                throw th;
                            }
                            acgaVar.i(abfmVar, acgb.a(jMin, jMax));
                            return;
                        }
                        StitchedSegmentsMetadataOuterClass$VideoRegion defaultInstance6 = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion2.c;
                        if (defaultInstance6 == null) {
                            defaultInstance6 = StitchedSegmentsMetadataOuterClass$VideoRegion.getDefaultInstance();
                        }
                        synchronized (abfeVar2) {
                            if (!awrc.c(abfeVar2.e, defaultInstance6)) {
                                abfeVar2.e = defaultInstance6;
                                abfeVar2.j = true;
                            }
                            break;
                        }
                        acgaVar.i(abfmVar, acgb.a(jMin, jMax));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                wjf wjfVar3 = ((aayp) obj).a;
                boolean zU = wjfVar3.U();
                Object obj4 = this.a;
                if (zU) {
                    yxeVar = ((abfl) obj4).a;
                } else if (wjfVar3.M()) {
                    yxeVar = ((abfl) obj4).b;
                } else if (wjfVar3.O()) {
                    yxeVar = ((abfl) obj4).c;
                }
                abfl abflVar = (abfl) obj4;
                if (Objects.equals(abflVar.d, yxeVar)) {
                    return;
                }
                if (abflVar.d != null) {
                    abflVar.d.b();
                }
                abflVar.d = yxeVar;
                if (abflVar.d != null) {
                    abflVar.d.c();
                    return;
                }
                return;
            case 17:
                abob abobVar = ((aazj) obj).a;
                int iOrdinal = abobVar.ordinal();
                Object obj5 = this.a;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        abfp abfpVar = (abfp) obj5;
                        anhb anhbVar = abfpVar.c.c().j;
                        if (anhbVar == null) {
                            anhbVar = anhb.a;
                        }
                        if ((anhbVar.b & 536870912) == 0) {
                            abfpVar.a("vl");
                        }
                        abfpVar.b = abobVar;
                        return;
                    }
                    if (iOrdinal != 9) {
                        return;
                    }
                }
                abfp abfpVar2 = (abfp) obj5;
                if (!abfpVar2.a) {
                    abfpVar2.b();
                }
                abfpVar2.b = abobVar;
                return;
            case 18:
                if (((atpu) obj).d) {
                    return;
                }
                ((abgp) this.a).k();
                return;
            case 19:
                aazk aazkVar = (aazk) obj;
                long j5 = aazkVar.a;
                long j6 = 0;
                if (j5 >= 0) {
                    long j7 = aazkVar.e;
                    if (j7 >= j5) {
                        j6 = j7 - j5;
                    }
                }
                abgp abgpVar = (abgp) ((avgj) this.a).a;
                abgpVar.x = j6;
                abgm abgmVar = abgpVar.a;
                abgmVar.o(j6);
                abgpVar.n();
                abgmVar.d(abgpVar.i(), abgpVar.A);
                yve yveVar = (yve) abgpVar.f.io();
                abgmVar.g(yveVar.a - abgpVar.l, yveVar.b - abgpVar.k);
                abgmVar.i(((zia) abgpVar.e.apply(abgpVar.i)).f);
                abgpVar.l();
                return;
            default:
                ((abhe) this.a).f();
                return;
        }
    }
}
