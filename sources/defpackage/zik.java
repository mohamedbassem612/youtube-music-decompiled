package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.streaming.BufferedRangeOuterClass$BufferedRange;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper;
import com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper;
import com.google.android.libraries.youtube.media.player.exo2.platypus.ExecutorImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.MetadataStoreImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackNetFetchFactory;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.net.URLDecoder;
import j$.time.Duration;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zik {
    public zik(aaev aaevVar) {
        aaevVar.getClass();
    }

    public static zne aA(String str) {
        zlt zltVar = zlt.a;
        if (awrc.c(str, zltVar.b)) {
            return zltVar;
        }
        zlu zluVar = zlu.a;
        if (awrc.c(str, zluVar.b)) {
            return zluVar;
        }
        zlv zlvVar = zlv.a;
        if (awrc.c(str, zlvVar.b)) {
            return zlvVar;
        }
        zlw zlwVar = zlw.a;
        if (awrc.c(str, zlwVar.b)) {
            return zlwVar;
        }
        zlx zlxVar = zlx.a;
        if (awrc.c(str, zlxVar.b)) {
            return zlxVar;
        }
        zly zlyVar = zly.a;
        if (awrc.c(str, zlyVar.b)) {
            return zlyVar;
        }
        zlz zlzVar = zlz.a;
        if (awrc.c(str, zlzVar.b)) {
            return zlzVar;
        }
        zma zmaVar = zma.a;
        if (awrc.c(str, zmaVar.b)) {
            return zmaVar;
        }
        zmb zmbVar = zmb.a;
        if (awrc.c(str, zmbVar.b)) {
            return zmbVar;
        }
        zmc zmcVar = zmc.a;
        if (awrc.c(str, zmcVar.b)) {
            return zmcVar;
        }
        zmd zmdVar = zmd.a;
        if (awrc.c(str, zmdVar.b)) {
            return zmdVar;
        }
        zme zmeVar = zme.a;
        if (awrc.c(str, zmeVar.b)) {
            return zmeVar;
        }
        zmf zmfVar = zmf.a;
        if (awrc.c(str, zmfVar.b)) {
            return zmfVar;
        }
        zmg zmgVar = zmg.a;
        if (awrc.c(str, zmgVar.b)) {
            return zmgVar;
        }
        zmh zmhVar = zmh.a;
        if (awrc.c(str, zmhVar.b)) {
            return zmhVar;
        }
        zmi zmiVar = zmi.a;
        if (awrc.c(str, zmiVar.b)) {
            return zmiVar;
        }
        zmj zmjVar = zmj.a;
        if (awrc.c(str, zmjVar.b)) {
            return zmjVar;
        }
        zmk zmkVar = zmk.a;
        if (awrc.c(str, zmkVar.b)) {
            return zmkVar;
        }
        zml zmlVar = zml.a;
        if (awrc.c(str, zmlVar.b)) {
            return zmlVar;
        }
        zmm zmmVar = zmm.a;
        if (awrc.c(str, zmmVar.b)) {
            return zmmVar;
        }
        zmn zmnVar = zmn.a;
        if (awrc.c(str, zmnVar.b)) {
            return zmnVar;
        }
        zmo zmoVar = zmo.a;
        if (awrc.c(str, zmoVar.b)) {
            return zmoVar;
        }
        zmp zmpVar = zmp.a;
        if (awrc.c(str, zmpVar.b)) {
            return zmpVar;
        }
        zmq zmqVar = zmq.a;
        if (awrc.c(str, zmqVar.b)) {
            return zmqVar;
        }
        zmr zmrVar = zmr.a;
        if (awrc.c(str, zmrVar.b)) {
            return zmrVar;
        }
        zms zmsVar = zms.a;
        if (awrc.c(str, zmsVar.b)) {
            return zmsVar;
        }
        zmt zmtVar = zmt.a;
        if (awrc.c(str, zmtVar.b)) {
            return zmtVar;
        }
        zmu zmuVar = zmu.a;
        if (awrc.c(str, zmuVar.b)) {
            return zmuVar;
        }
        zmv zmvVar = zmv.a;
        if (awrc.c(str, zmvVar.b)) {
            return zmvVar;
        }
        zmw zmwVar = zmw.a;
        if (awrc.c(str, zmwVar.b)) {
            return zmwVar;
        }
        zmx zmxVar = zmx.a;
        if (awrc.c(str, zmxVar.b)) {
            return zmxVar;
        }
        zmy zmyVar = zmy.a;
        if (awrc.c(str, zmyVar.b)) {
            return zmyVar;
        }
        zmz zmzVar = zmz.a;
        if (awrc.c(str, zmzVar.b)) {
            return zmzVar;
        }
        zne zneVar = zna.a;
        if (!awrc.c(str, zneVar.b)) {
            zneVar = znb.a;
            if (!awrc.c(str, zneVar.b)) {
                zneVar = znc.a;
                if (!awrc.c(str, zneVar.b)) {
                    zneVar = znd.a;
                    if (!awrc.c(str, zneVar.b)) {
                        return (awrc.c(str, "") || str == null) ? zmzVar : new zne(str);
                    }
                }
            }
        }
        return zneVar;
    }

    public static int aB(apbm apbmVar, int i, zjh zjhVar) {
        int i2 = apbmVar.b;
        if ((i2 & SemanticState.LiveRegion) == 0) {
            if ((i2 & 8) != 0) {
                return (int) Duration.ofSeconds(apbmVar.d).toMillis();
            }
            return 43200000;
        }
        if (i != 0) {
            return zjhVar.a(i);
        }
        akxc akxcVar = apbmVar.i;
        if (akxcVar == null) {
            akxcVar = akxc.a;
        }
        return akxcVar.e;
    }

    public static int aC(zfe zfeVar) {
        return zfeVar.b + (-1) != 1 ? 0 : 2;
    }

    public static String aD(zfe zfeVar) {
        if (zfeVar.b - 1 != 1) {
            return null;
        }
        return zfeVar.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    public static void aE(xeu xeuVar, Throwable th, int i, boolean z, int i2) {
        int i3;
        if (th instanceof TimeoutException) {
            i3 = 3;
        } else if (th instanceof zfq) {
            i3 = 4;
        } else if (!(th instanceof ExecutionException)) {
            i3 = 1;
        } else if (th.getCause() instanceof kmw) {
            i3 = 2;
        } else if (th.getCause() instanceof kmu) {
            i3 = 5;
        } else {
            i3 = 1;
        }
        apbn apbnVar = (apbn) ahno.ad(apbn.a(i), apbn.PROOF_OF_ORIGIN_TOKEN_SCOPE_UNKNOWN);
        aihf aihfVarCreateBuilder = apbo.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apbo apboVar = (apbo) aihfVarCreateBuilder.instance;
        apboVar.d = i3 - 1;
        apboVar.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        apbo apboVar2 = (apbo) aihfVarCreateBuilder.instance;
        apboVar2.c = apbnVar.d;
        apboVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        apbo apboVar3 = (apbo) aihfVarCreateBuilder.instance;
        apboVar3.b |= 16;
        apboVar3.f = z;
        aihfVarCreateBuilder.copyOnWrite();
        apbo apboVar4 = (apbo) aihfVarCreateBuilder.instance;
        apboVar4.b |= 32;
        apboVar4.g = i2;
        if ((th instanceof ExecutionException) && (th.getCause() instanceof kmu)) {
            kmu kmuVar = (kmu) th.getCause();
            aihf aihfVarCreateBuilder2 = apbp.a.createBuilder();
            int iA = kmuVar.a();
            aihfVarCreateBuilder2.copyOnWrite();
            apbp apbpVar = (apbp) aihfVarCreateBuilder2.instance;
            apbpVar.b |= 1;
            apbpVar.c = iA;
            apbp apbpVar2 = (apbp) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            apbo apboVar5 = (apbo) aihfVarCreateBuilder.instance;
            apbpVar2.getClass();
            apboVar5.e = apbpVar2;
            apboVar5.b |= 8;
        }
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.PROOF_OF_ORIGIN_TOKEN_ERROR);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        apbo apboVar6 = (apbo) aihfVarCreateBuilder.build();
        apboVar6.getClass();
        alouVar.d = apboVar6;
        alouVar.c = 365;
        xeuVar.b((alou) alosVar.build());
    }

    public static int aF(int i) {
        return i == 3 ? 2 : 1;
    }

    public static /* synthetic */ String aG(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "ALBUM" : "STATEFUL";
        }
        return "TRACK";
    }

    public static yvr aH() {
        yvr yvrVar = new yvr();
        yvrVar.l(1);
        yvrVar.g(1.0f);
        yvrVar.c(1.0f);
        yvrVar.e(1.0f);
        return yvrVar;
    }

    public static Uri aI(Context context) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("net");
        qpqVar.d("delayed_event.pb");
        return qpqVar.a();
    }

    public static tgg aJ(tqj tqjVar, int i, aunn aunnVar, aunn aunnVar2) {
        return tqjVar.k(i) ? (tgg) aunnVar2.io() : (tgg) aunnVar.io();
    }

    public static tpq aK(Context context, ahex ahexVar, rrq rrqVar) {
        Uri uriAI = aI(context);
        tpr tprVar = new tpr(new glj(context, 12), new idn(6), new wvk(10), new yns(2), new wql(11), ahexVar);
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriAI);
        atpn atpnVar = atpn.a;
        qrlVarA.e(atpnVar);
        qrlVarA.b(tprVar);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), atpnVar);
    }

    public static taw aL(Context context, String str, vxz vxzVar) {
        tbh tbhVar = tbb.a;
        agke agkeVarAM = aM(agke.s(tbhVar, new tba("OfflineHttpRequestProto"), tbhVar), "OfflineHttpRequestProto", vxzVar);
        Integer num = 0;
        num.getClass();
        return new taw(context, str, agkeVarAM, false);
    }

    static agke aM(agke agkeVar, String str, vxz vxzVar) {
        long jC = vxzVar.c(10, 45460290L, 0L);
        if (jC == 0) {
            return agkeVar;
        }
        agjz agjzVar = new agjz(4);
        agjzVar.j(agkeVar);
        if (jC == 1) {
            agjzVar.h(new taz(str, 1));
        } else if (jC == 2) {
            agjzVar.h(new taz(str, 0));
        }
        return agjzVar.g();
    }

    public static tbc aN(Context context, String str, vxz vxzVar) {
        Object[] objArr = {new tba("DelayedEventProto")};
        aguu.j(objArr, 1);
        agke agkeVarAM = aM(new agpi(objArr, 1), "DelayedEventProto", vxzVar);
        Integer num = 0;
        num.getClass();
        return vxzVar.l(129, 45637377L, false) ? new taw(context, str, agkeVarAM, true) : new taw(context, str, agkeVarAM, false);
    }

    public static zot aO(String str) {
        znh znhVar = znh.a;
        if (awrc.c(str, znhVar.b)) {
            return znhVar;
        }
        zni zniVar = zni.a;
        if (awrc.c(str, zniVar.b)) {
            return zniVar;
        }
        znj znjVar = znj.a;
        if (awrc.c(str, znjVar.b)) {
            return znjVar;
        }
        znk znkVar = znk.a;
        if (awrc.c(str, znkVar.b)) {
            return znkVar;
        }
        znl znlVar = znl.a;
        if (awrc.c(str, znlVar.b)) {
            return znlVar;
        }
        znm znmVar = znm.a;
        if (awrc.c(str, znmVar.b)) {
            return znmVar;
        }
        znn znnVar = znn.a;
        if (awrc.c(str, znnVar.b)) {
            return znnVar;
        }
        zno znoVar = zno.a;
        if (awrc.c(str, znoVar.b)) {
            return znoVar;
        }
        znp znpVar = znp.a;
        if (awrc.c(str, znpVar.b)) {
            return znpVar;
        }
        znq znqVar = znq.a;
        if (awrc.c(str, znqVar.b)) {
            return znqVar;
        }
        znr znrVar = znr.a;
        if (awrc.c(str, znrVar.b)) {
            return znrVar;
        }
        zns znsVar = zns.a;
        if (awrc.c(str, znsVar.b)) {
            return znsVar;
        }
        znt zntVar = znt.a;
        if (awrc.c(str, zntVar.b)) {
            return zntVar;
        }
        znu znuVar = znu.a;
        if (awrc.c(str, znuVar.b)) {
            return znuVar;
        }
        znv znvVar = znv.a;
        if (awrc.c(str, znvVar.b)) {
            return znvVar;
        }
        znw znwVar = znw.a;
        if (awrc.c(str, znwVar.b)) {
            return znwVar;
        }
        znx znxVar = znx.a;
        if (awrc.c(str, znxVar.b)) {
            return znxVar;
        }
        zny znyVar = zny.a;
        if (awrc.c(str, znyVar.b)) {
            return znyVar;
        }
        znz znzVar = znz.a;
        if (awrc.c(str, znzVar.b)) {
            return znzVar;
        }
        zoa zoaVar = zoa.a;
        if (awrc.c(str, zoaVar.b)) {
            return zoaVar;
        }
        zob zobVar = zob.a;
        if (awrc.c(str, zobVar.b)) {
            return zobVar;
        }
        zoc zocVar = zoc.a;
        if (awrc.c(str, zocVar.b)) {
            return zocVar;
        }
        zod zodVar = zod.a;
        if (awrc.c(str, zodVar.b)) {
            return zodVar;
        }
        zoe zoeVar = zoe.a;
        if (awrc.c(str, zoeVar.b)) {
            return zoeVar;
        }
        zof zofVar = zof.a;
        if (awrc.c(str, zofVar.b)) {
            return zofVar;
        }
        zog zogVar = zog.a;
        if (awrc.c(str, zogVar.b)) {
            return zogVar;
        }
        zoh zohVar = zoh.a;
        if (awrc.c(str, zohVar.b)) {
            return zohVar;
        }
        zoi zoiVar = zoi.a;
        if (awrc.c(str, zoiVar.b)) {
            return zoiVar;
        }
        zoj zojVar = zoj.a;
        if (awrc.c(str, zojVar.b)) {
            return zojVar;
        }
        zok zokVar = zok.a;
        if (awrc.c(str, zokVar.b)) {
            return zokVar;
        }
        zol zolVar = zol.a;
        if (awrc.c(str, zolVar.b)) {
            return zolVar;
        }
        zot zotVar = zom.a;
        if (!awrc.c(str, zotVar.b)) {
            zotVar = zon.a;
            if (!awrc.c(str, zotVar.b)) {
                zotVar = zoo.a;
                if (!awrc.c(str, zotVar.b)) {
                    zotVar = zop.a;
                    if (!awrc.c(str, zotVar.b)) {
                        zotVar = zoq.a;
                        if (!awrc.c(str, zotVar.b)) {
                            zotVar = zor.a;
                            if (!awrc.c(str, zotVar.b)) {
                                zotVar = zos.a;
                                if (!awrc.c(str, zotVar.b)) {
                                    return (awrc.c(str, "") || str == null) ? zolVar : new zot(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        return zotVar;
    }

    public static boolean aP(String str) {
        return !aO(str).b();
    }

    public static aaci aQ(ScheduledExecutorService scheduledExecutorService, Executor executor, aabz aabzVar, zhg zhgVar, awmd awmdVar, vyo vyoVar) {
        return new aaci(aabzVar, zhgVar, scheduledExecutorService, new ahfg(executor), awmdVar, vyoVar);
    }

    public static zsu aR(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, zwb zwbVar, tbt tbtVar, tqv tqvVar, awmd awmdVar6, mbc mbcVar, awmd awmdVar7, twh twhVar, abxu abxuVar, tqj tqjVar) {
        int i = tqr.a;
        zsu zsuVar = new zsu(awmdVar, awmdVar2, awmdVar3, awmdVar4, awmdVar5, zwbVar, tbtVar, tqvVar, tqjVar.t(512L) ? null : (zus) awmdVar6.io(), mbcVar, tqjVar, awmdVar7, twhVar, abxuVar);
        zsuVar.o();
        return zsuVar;
    }

    public static /* synthetic */ xir aS(xit xitVar, abmt abmtVar) {
        aoqb aoqbVarCn = abmt.cn(abmtVar.c);
        if (aoqbVarCn == null || !aoqbVarCn.h) {
            return new xjb();
        }
        xir xirVarO = xitVar.o(4);
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
        amjr amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
        aihfVarCreateBuilder2.copyOnWrite();
        amiw amiwVar = (amiw) aihfVarCreateBuilder2.instance;
        amiwVar.e = amjrVar.o;
        amiwVar.b |= 8;
        amiw amiwVar2 = (amiw) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiwVar2.getClass();
        amiuVar.N = amiwVar2;
        amiuVar.d |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
        amiuVar2.b |= SemanticState.Focused;
        amiuVar2.j = "warm";
        xirVarO.h((amiu) aihfVarCreateBuilder.build());
        return xirVarO;
    }

    public static tpn aT(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("offline");
        qpqVar.d("offline_settings.schema.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        atpt atptVar = atpt.a;
        qrlVarA.e(atptVar);
        qrlVarA.f(uriA);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), atptVar);
    }

    public static aadb aU(yha yhaVar, yho yhoVar) {
        aadb aadbVar = new aadb();
        zkf.d(aadbVar);
        yhaVar.c = aadbVar;
        yhoVar.a = aadbVar;
        return aadbVar;
    }

    public static avmb aV(Executor executor) {
        return new awir(new ahfg(executor));
    }

    public static tyw aW(Context context, aunn aunnVar, xgl xglVar, Executor executor, vxz vxzVar, agev agevVar) {
        return new tyw(context, (Handler) aunnVar.io(), xglVar, executor, vxzVar);
    }

    public static wjf aX(Cursor cursor, int i, tqj tqjVar) {
        if (cursor.isNull(i)) {
            return null;
        }
        byte[] blob = cursor.getBlob(i);
        int i2 = tqr.a;
        return tqjVar.k(1073828980) ? wji.ak(blob, 0L) : wji.aj(blob, 0L);
    }

    public static aamq aY(Cursor cursor, int i, int i2, int i3) {
        return new aamq(cursor.getString(i), cursor.getInt(i2), cursor.getInt(i3));
    }

    public static List aZ(Cursor cursor, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(aY(cursor, i, i2, i3));
        }
        return arrayList;
    }

    public static void bA(TreeSet treeSet, yfr yfrVar) {
        long j = yfrVar.a;
        long j2 = yfrVar.b;
        TreeSet treeSet2 = new TreeSet((SortedSet) treeSet.subSet(new yfr(j, j2), true, new yfr(j2, j2), true));
        if (!treeSet2.isEmpty() && ((yfr) treeSet2.last()).b > yfrVar.b) {
            treeSet2.remove(treeSet2.last());
        }
        treeSet.removeAll(treeSet2);
        yfr yfrVar2 = (yfr) treeSet.floor(yfrVar);
        yfr yfrVar3 = (yfr) treeSet.ceiling(yfrVar);
        boolean z = yfrVar2 != null && yfrVar2.a(yfrVar);
        boolean zA = yfrVar.a(yfrVar3);
        if (yfrVar2 != null && z) {
            long j3 = yfrVar2.b;
            long j4 = yfrVar.b;
            if (j3 > j4) {
                treeSet.add(new yfr(j4, j3));
            }
            yfrVar2.b = Math.min(yfrVar2.b, yfrVar.a);
        }
        if (yfrVar3 == null || !zA) {
            return;
        }
        yfrVar3.a = Math.max(yfrVar3.a, yfrVar.b);
    }

    public static void bB(xeu xeuVar, int i, Exception exc) {
        aihf aihfVarCreateBuilder = aorb.a.createBuilder();
        aihfVarCreateBuilder.ca(i);
        String strB = zhf.b(exc, true, 5, 100);
        aihfVarCreateBuilder.copyOnWrite();
        aorb aorbVar = (aorb) aihfVarCreateBuilder.instance;
        strB.getClass();
        aorbVar.b |= 1;
        aorbVar.d = strB;
        ajtx ajtxVar = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
        aorb aorbVar2 = (aorb) aihfVarCreateBuilder.build();
        aorbVar2.getClass();
        clientErrorOuterClass$ErrorMetaData.f = aorbVar2;
        clientErrorOuterClass$ErrorMetaData.b |= 8;
        ajtxVar.copyOnWrite();
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.build();
        clientErrorOuterClass$ErrorMetaData2.getClass();
        clientErrorOuterClass$ClientError.c = clientErrorOuterClass$ErrorMetaData2;
        clientErrorOuterClass$ClientError.b |= 1;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(ajtxVar, alot.CLIENT_ERROR);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) ajtxVar.build();
        clientErrorOuterClass$ClientError2.getClass();
        alouVar.d = clientErrorOuterClass$ClientError2;
        alouVar.c = 163;
        xeuVar.b((alou) alosVar.build());
    }

    public static Handler bC() {
        HandlerThread handlerThread = new HandlerThread("MediaGlRenderer");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static wjb bD() {
        return wjb.a;
    }

    public static zjg bE(mbc mbcVar, wis wisVar, tqj tqjVar) {
        int i = tqr.a;
        if (tqjVar.k(1073830526)) {
            return new zjg(mbcVar, wisVar);
        }
        wiu wiuVarB = wisVar.io();
        return new zjg(mbcVar, wiuVarB.c(), wiuVarB.ah());
    }

    public static lpo bF(Context context) {
        return lps.a(context);
    }

    public static ytp bG(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, zjr zjrVar, awmd awmdVar13, awmd awmdVar14, awmd awmdVar15, awmd awmdVar16, awmd awmdVar17, awmd awmdVar18, awmd awmdVar19, aunn aunnVar, awmd awmdVar20, awmd awmdVar21) {
        if (!zjrVar.bz()) {
            return null;
        }
        if (zjrVar.dK()) {
            zcj zcjVar = (zcj) awmdVar10.io();
            Handler handler = (Handler) awmdVar.io();
            xeu xeuVar = (xeu) awmdVar2.io();
            zeh zehVar = (zeh) awmdVar4.io();
            PlaybackNetFetchFactory playbackNetFetchFactory = (PlaybackNetFetchFactory) awmdVar5.io();
            ahey aheyVar = (ahey) awmdVar6.io();
            ahey aheyVar2 = (ahey) awmdVar7.io();
            avmb avmbVar = (avmb) awmdVar8.io();
            AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = new AsyncMediaFetchControllerWrapper(zcjVar, handler, xeuVar, zehVar, playbackNetFetchFactory, aheyVar, aheyVar2, avmbVar, (tgr) awmdVar11.io(), (zkk) awmdVar12.io(), zjrVar, (agfr) awmdVar13.io(), (yho) awmdVar14.io(), (avlh) awmdVar15.io(), (zfs) awmdVar16.io(), (abxv) awmdVar17.io(), (tgr) awmdVar18.io(), (MetadataStoreImpl) awmdVar19.io(), aunnVar, (String) awmdVar20.io(), (ExecutorImpl) awmdVar21.io());
            asyncMediaFetchControllerWrapper.g((zeh) awmdVar4.io());
            return asyncMediaFetchControllerWrapper;
        }
        zcj zcjVar2 = (zcj) awmdVar10.io();
        Handler handler2 = (Handler) awmdVar.io();
        xeu xeuVar2 = (xeu) awmdVar2.io();
        zeh zehVar2 = (zeh) awmdVar4.io();
        PlaybackNetFetchFactory playbackNetFetchFactory2 = (PlaybackNetFetchFactory) awmdVar5.io();
        ahey aheyVar3 = (ahey) awmdVar6.io();
        ahey aheyVar4 = (ahey) awmdVar7.io();
        avmb avmbVar2 = (avmb) awmdVar8.io();
        DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = new DefaultMediaFetchControllerWrapper(zcjVar2, handler2, xeuVar2, zehVar2, playbackNetFetchFactory2, aheyVar3, aheyVar4, avmbVar2, (tgr) awmdVar11.io(), (zkk) awmdVar12.io(), zjrVar, (agfr) awmdVar13.io(), (yho) awmdVar14.io(), (avlh) awmdVar15.io(), (zfs) awmdVar16.io(), (abxv) awmdVar17.io(), (tgr) awmdVar18.io(), (MetadataStoreImpl) awmdVar19.io(), aunnVar, (String) awmdVar20.io(), (ExecutorImpl) awmdVar21.io());
        defaultMediaFetchControllerWrapper.g((zeh) awmdVar4.io());
        return defaultMediaFetchControllerWrapper;
    }

    public static ytv bH(Context context, zjr zjrVar, xeu xeuVar, yha yhaVar, mbc mbcVar, yoq yoqVar, zgm zgmVar, zdx zdxVar) {
        zhq zhqVar = zhq.ABR;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jC = mbcVar.c() / 1000;
        zdxVar.U();
        ytv ytvVar = new ytv(zdxVar, new zei(context, zjrVar), zjrVar, yhaVar, yoqVar, zgmVar);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jC2 = mbcVar.c() / 1000;
        zic.k(8, jC - zjrVar.A, xeuVar);
        zic.k(14, jC2 - jC, xeuVar);
        return ytvVar;
    }

    public static File bI(zjr zjrVar, Context context, Optional optional) {
        File externalCacheDir;
        if (zjrVar.D != zrv.ANDROID_EMBEDDED_PLAYER) {
            externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                optional.isPresent();
            }
        } else {
            externalCacheDir = null;
        }
        if (externalCacheDir != null) {
            try {
                externalCacheDir.mkdirs();
                File.createTempFile("cache", "probe", externalCacheDir).delete();
            } catch (IOException unused) {
                zvp.h(zvn.a, zvm.f, "Cannot write to the cache dir.", 0.1d);
                return null;
            }
        }
        return externalCacheDir;
    }

    public static yfk bJ(zjr zjrVar, awmd awmdVar, vxu vxuVar, mbc mbcVar) {
        anhb anhbVar = vxuVar.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        akwj akwjVar = anhbVar.k;
        if (akwjVar == null) {
            akwjVar = akwj.a;
        }
        int iBc = a.bc(akwjVar.d);
        if (iBc == 0) {
            iBc = 1;
        }
        if (iBc - 1 != 3) {
            long j = akwjVar.c;
            long j2 = j != 0 ? j : 67108864L;
            if (j == 0) {
                j = 268435456;
            }
            if (tym.E() * 0.1d > j) {
                j2 = j;
            }
            return new yfl(j2);
        }
        tar tarVar = awmdVar != null ? new tar(awmdVar, 12) : null;
        akwi akwiVar = akwjVar.e;
        if (akwiVar == null) {
            akwiVar = akwi.a;
        }
        akwi akwiVar2 = akwiVar;
        akwi akwiVar3 = akwjVar.f;
        if (akwiVar3 == null) {
            akwiVar3 = akwi.a;
        }
        return new yfn(tarVar, akwiVar2, akwiVar3, mbcVar, zjrVar.j.d(27, 45426951L));
    }

    public static yuw bK(zjr zjrVar, yuz yuzVar, mbc mbcVar) {
        return new yuv(mbcVar, wiu.c, zjrVar, yuzVar);
    }

    public static xlb bL() {
        return xlb.b;
    }

    public static dij bM(Context context) {
        taq.d();
        return dij.b(context);
    }

    public static tfu bN(int i, int i2) {
        tex texVarA = tfu.a();
        texVarA.b(i);
        texVarA.d(i2);
        texVarA.c(false);
        return texVarA.a();
    }

    public static xzj bO(tun tunVar, xla xlaVar, Optional optional) {
        optional.isPresent();
        optional.isPresent();
        return new xzj(tunVar, Executors.newSingleThreadScheduledExecutor(new szw(10, "mdxPresence")), xlaVar);
    }

    public static String bR(xla xlaVar, xmr xmrVar, vxz vxzVar) {
        agkz agkzVarU = xlaVar.U();
        HashSet hashSet = !agkzVarU.isEmpty() ? new HashSet(agkzVarU) : new HashSet();
        if (!xlaVar.aJ()) {
            hashSet.remove("ska");
        }
        boolean z = xmrVar.g;
        hashSet.add("que");
        boolean z2 = xmrVar.i;
        hashSet.add("mlm");
        if (vxzVar.l(14, 45361021L, false)) {
            agrx agrxVar = agso.a;
            hashSet.add("dsdtr");
        }
        if (vxzVar.l(56, 45399729L, false)) {
            hashSet.add("scn");
        }
        if (vxzVar.l(62, 45410750L, false)) {
            hashSet.add("rpe");
        }
        if (vxzVar.l(58, 45400591L, false)) {
            hashSet.add("vsp");
        }
        if (vxzVar.l(99, 45461656L, false)) {
            hashSet.add("pas");
        }
        if (vxzVar.l(R.styleable.AppCompatTheme_windowNoTitle, 45630215L, false)) {
            hashSet.add("mvp");
        }
        if (vxzVar.l(154, 45652192L, false)) {
            hashSet.add("pap");
        }
        if (vxzVar.l(182, 45708069L, false)) {
            hashSet.add("asw");
        }
        if (vxzVar.l(183, 45708070L, false)) {
            hashSet.add("apw");
        }
        if (vxzVar.l(192, 45729679L, false)) {
            hashSet.add("ndt");
        }
        if (vxzVar.l(193, 45729680L, false)) {
            hashSet.add("ctops");
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(",", hashSet);
    }

    public static boolean bS(abvn abvnVar) {
        acfw acfwVarI;
        abvk abvkVarO = abvnVar.o();
        return abvkVarO == null || (acfwVarI = abvkVarO.i()) == null || acfwVarI.c() == null;
    }

    public static boolean bT(List list, xvq xvqVar, xvq xvqVar2) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if ((next instanceof xvq) && ((xvq) next).equals(xvqVar)) {
                listIterator.set(xvqVar2);
                return true;
            }
        }
        return false;
    }

    public static int bU(int i) {
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 4;
    }

    public static xvq bV() {
        xvq xvqVarD;
        dij.c();
        dii diiVar = dij.a().s;
        if (diiVar == null) {
            xvqVarD = null;
        } else {
            afha afhaVarO = xvq.o();
            afhaVarO.g(diiVar);
            xvqVarD = afhaVarO.d();
        }
        if (xvqVarD == null) {
            afha afhaVarO2 = xvq.o();
            dij.c();
            afhaVarO2.g(dij.a().e());
            return afhaVarO2.d();
        }
        afha afhaVarO3 = xvq.o();
        dij.c();
        afhaVarO3.g(dij.a().e());
        afhaVarO3.e(xvqVarD.c);
        return afhaVarO3.d();
    }

    public static xvq bW() {
        dij.c();
        dii diiVarF = dij.a().f();
        if (diiVarF.j()) {
            return bV();
        }
        afha afhaVarO = xvq.o();
        afhaVarO.g(diiVarF);
        return afhaVarO.d();
    }

    public static tpn bX(Context context, String str, abxu abxuVar, rrq rrqVar) {
        ahex ahexVarS = abxuVar.s();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("mdx");
        qpqVar.d("mdx_profile.pb");
        Uri uriA = qpqVar.a();
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVarS);
        qrnVar.b();
        qrnVar.c = str;
        qrnVar.d("user-stats-timestamp", "mdx-last-connection-timestamp", "mdx-profile-creation-timestamp", "mdx-connection-count", "cast-available-session-count");
        qrnVar.e(new tpi(4));
        qrp qrpVarA = qrnVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        atpi atpiVar = atpi.a;
        qrlVarA.e(atpiVar);
        qrlVarA.b(qrpVarA);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), atpiVar);
    }

    public static ArrayList bY(agkz agkzVar, int i, String str, abxv abxvVar, zjr zjrVar) {
        elq elqVarG;
        agkz agkzVar2 = agkzVar;
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        agqr agqrVarK = agkzVar2.iterator();
        while (agqrVarK.hasNext()) {
            hashSet.addAll(((jsk) agqrVarK.next()).h());
        }
        for (String str2 : hashSet) {
            if (bx(str2).equals(str) && (elqVarG = elq.G(abxvVar.A(agkzVar2, str2, false))) != null) {
                for (yfr yfrVar : cC(agkzVar2, str2, (elr) elqVarG.a, zjrVar)) {
                    int iO = elqVarG.o(yfrVar.a);
                    int iO2 = elqVarG.o(yfrVar.b);
                    while (iO <= iO2 && (iO <= 0 || !ct(agkzVar2, elqVarG, str2, iO))) {
                        iO++;
                    }
                    while (iO2 >= iO) {
                        if (ct(agkzVar2, elqVarG, str2, iO2)) {
                            aihf aihfVarCreateBuilder = BufferedRangeOuterClass$BufferedRange.a.createBuilder();
                            aihf aihfVarCreateBuilder2 = FormatIdOuterClass$FormatId.a.createBuilder();
                            int iBp = bp(str2);
                            aihfVarCreateBuilder2.copyOnWrite();
                            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                            formatIdOuterClass$FormatId.b |= 1;
                            formatIdOuterClass$FormatId.c = iBp;
                            String strBy = by(str2);
                            aihfVarCreateBuilder2.copyOnWrite();
                            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                            strBy.getClass();
                            formatIdOuterClass$FormatId2.b |= 4;
                            formatIdOuterClass$FormatId2.e = strBy;
                            long jBq = bq(str2);
                            aihfVarCreateBuilder2.copyOnWrite();
                            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId3 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.instance;
                            formatIdOuterClass$FormatId3.b |= 2;
                            formatIdOuterClass$FormatId3.d = jBq;
                            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId4 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder2.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                            formatIdOuterClass$FormatId4.getClass();
                            bufferedRangeOuterClass$BufferedRange.c = formatIdOuterClass$FormatId4;
                            bufferedRangeOuterClass$BufferedRange.b |= 1;
                            aihfVarCreateBuilder.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange2 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                            bufferedRangeOuterClass$BufferedRange2.b |= 8;
                            bufferedRangeOuterClass$BufferedRange2.d = iO;
                            aihfVarCreateBuilder.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange3 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                            bufferedRangeOuterClass$BufferedRange3.b |= 16;
                            bufferedRangeOuterClass$BufferedRange3.e = iO2;
                            aihfVarCreateBuilder.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange4 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                            bufferedRangeOuterClass$BufferedRange4.g = i - 1;
                            bufferedRangeOuterClass$BufferedRange4.b |= 64;
                            aihf aihfVarCreateBuilder3 = TimeRangeOuterClass$TimeRange.a.createBuilder();
                            long jT = elqVarG.t(iO);
                            aihfVarCreateBuilder3.copyOnWrite();
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.instance;
                            timeRangeOuterClass$TimeRange.b |= 1;
                            timeRangeOuterClass$TimeRange.c = jT;
                            long jT2 = (elqVarG.t(iO2) + elqVarG.r(iO2)) - elqVarG.t(iO);
                            aihfVarCreateBuilder3.copyOnWrite();
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.instance;
                            timeRangeOuterClass$TimeRange2.b |= 2;
                            timeRangeOuterClass$TimeRange2.d = jT2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.instance;
                            timeRangeOuterClass$TimeRange3.b |= 4;
                            timeRangeOuterClass$TimeRange3.e = 1000000;
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange4 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange5 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                            timeRangeOuterClass$TimeRange4.getClass();
                            bufferedRangeOuterClass$BufferedRange5.f = timeRangeOuterClass$TimeRange4;
                            bufferedRangeOuterClass$BufferedRange5.b |= 32;
                            if (zjrVar.ea()) {
                                long jQ = 0;
                                while (iO <= iO2) {
                                    jQ += (long) elqVarG.q(iO);
                                    iO++;
                                }
                                aihfVarCreateBuilder.copyOnWrite();
                                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange6 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                                bufferedRangeOuterClass$BufferedRange6.b |= SemanticState.Obscured;
                                bufferedRangeOuterClass$BufferedRange6.h = jQ;
                            }
                            arrayList.add((BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.build());
                            break;
                        }
                        iO2--;
                    }
                    agkzVar2 = agkzVar;
                }
            }
            agkzVar2 = agkzVar;
        }
        return arrayList;
    }

    public static xkd bZ(awmd awmdVar, awmd awmdVar2, Optional optional, vxu vxuVar) {
        xke xkeVar = (xke) awmdVar.io();
        agfr agfrVarAl = aguu.al(new wkw(vxuVar, 18));
        boolean zBooleanValue = ((Boolean) optional.orElse(Boolean.FALSE)).booleanValue();
        tbt tbtVar = xkeVar.a;
        mbc mbcVar = xkeVar.b;
        agfr agfrVarAl2 = aguu.al(new qlb(xkeVar, awmdVar2, agfrVarAl, 3));
        awmd awmdVar3 = xkeVar.f;
        awmd awmdVar4 = xkeVar.h;
        vyo vyoVar = xkeVar.i;
        tqj tqjVar = xkeVar.j;
        awmd awmdVar5 = xkeVar.k;
        Executor executor = xkeVar.l;
        return new xkd(tbtVar, mbcVar, agfrVarAl2, awmdVar3, awmdVar4, vyoVar, tqjVar, zBooleanValue);
    }

    public static ListenableFuture ba(ListenableFuture listenableFuture, Callable callable, Object obj, Executor executor) {
        return afxd.f(listenableFuture).h(new thc(callable, 14), executor).b(aais.class, new vzs(obj, 8), MoreExecutors.directExecutor());
    }

    public static Executor bb(Executor executor, Executor executor2, aauk aaukVar) {
        if (true == aaukVar.A()) {
            executor = executor2;
        }
        return new ahfg(executor);
    }

    public static ajwo bc(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !intent.hasExtra("navigation_endpoint")) {
            return null;
        }
        return vxg.b(extras.getByteArray("navigation_endpoint"));
    }

    @Deprecated
    public static void bd(Intent intent, ajwo ajwoVar, xgn xgnVar, boolean z) {
        if (ajwoVar != null) {
            if (xgnVar != null && z) {
                aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                String strI = xgnVar.i();
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                strI.getClass();
                aoarVar.b |= 1;
                aoarVar.c = strI;
                aoar aoarVar2 = (aoar) aihfVarCreateBuilder.build();
                aihh aihhVar = (aihh) ajwoVar.toBuilder();
                aihhVar.e(aoaq.b, aoarVar2);
                ajwoVar = (ajwo) aihhVar.build();
            }
            intent.putExtra("navigation_endpoint", ajwoVar.toByteArray());
        }
    }

    public static void be(Intent intent, ajwo ajwoVar, String str) {
        if (!ahno.aa(str)) {
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
            str.getClass();
            aoarVar.b |= 1;
            aoarVar.c = str;
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.build();
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihhVar.e(aoaq.b, aoarVar2);
            ajwoVar = (ajwo) aihhVar.build();
        }
        intent.putExtra("navigation_endpoint", ajwoVar.toByteArray());
    }

    public static ygn bf(aadb aadbVar, adgf adgfVar, zho zhoVar, vxz vxzVar, vxz vxzVar2) {
        aaoo aaooVar = new aaoo(aadbVar, adgfVar, zhoVar, vxzVar, vxzVar2);
        aaooVar.a = true;
        return new aaow(aaooVar);
    }

    public static ygn bg(aadb aadbVar, adgf adgfVar, zho zhoVar, vxz vxzVar, vxz vxzVar2) {
        return new aaov(new aaoo(aadbVar, adgfVar, zhoVar, vxzVar, vxzVar2));
    }

    public static abxv bh() {
        abxv abxvVar = new abxv(aknu.class, "QT__DRM_LICENSE_ENTITY");
        abxvVar.q(aagt.b, new wcu[0]);
        return abxvVar.D();
    }

    public static abxv bi() {
        abxv abxvVar = new abxv(aphh.class, "QT__REFRESH_ENTITY");
        abxvVar.q(aagt.c, new wcu[0]);
        return abxvVar.D();
    }

    public static abxv bj() {
        abxv abxvVar = new abxv(aqph.class, "QT__TRANSFER_ENTITY");
        abxvVar.q(aagt.d, new wcu[0]);
        return abxvVar.D();
    }

    public static abxv bk() {
        abxv abxvVar = new abxv(amtc.class, "QT__LOCAL_IMAGE_ENTITY");
        abxvVar.q(aagt.a, new wcu[0]);
        return abxvVar.D();
    }

    public static tpq bl(abxv abxvVar, zwb zwbVar) {
        return abxvVar.z(new vzs(zwbVar, 11), new wql(16), atpt.a);
    }

    public static ajcg bm(ajvu ajvuVar) {
        ajci ajciVarBn = bn(ajvuVar);
        if (ajciVarBn != null && (ajciVarBn.b & 4) != 0) {
            ajcf ajcfVar = ajciVarBn.d;
            if (ajcfVar == null) {
                ajcfVar = ajcf.a;
            }
            if ((ajcfVar.b & 2) != 0) {
                ajcf ajcfVar2 = ajciVarBn.d;
                if (ajcfVar2 == null) {
                    ajcfVar2 = ajcf.a;
                }
                ajcg ajcgVar = ajcfVar2.d;
                return ajcgVar == null ? ajcg.a : ajcgVar;
            }
        }
        return null;
    }

    public static ajci bn(ajvu ajvuVar) {
        if (ajvuVar != null) {
            ajby ajbyVar = ajvuVar.e;
            if (ajbyVar == null) {
                ajbyVar = ajby.a;
            }
            ajca ajcaVar = ajbyVar.c;
            if (ajcaVar == null) {
                ajcaVar = ajca.a;
            }
            if ((ajcaVar.b & 1) != 0) {
                ajby ajbyVar2 = ajvuVar.e;
                if (ajbyVar2 == null) {
                    ajbyVar2 = ajby.a;
                }
                ajca ajcaVar2 = ajbyVar2.c;
                if (ajcaVar2 == null) {
                    ajcaVar2 = ajca.a;
                }
                ajci ajciVar = ajcaVar2.c;
                return ajciVar == null ? ajci.a : ajciVar;
            }
        }
        return null;
    }

    public static tpq bo(tpn tpnVar) {
        return new ynq(tpnVar, atpl.a);
    }

    public static int bp(String str) {
        return cn(bw(str));
    }

    public static long bq(String str) {
        return Long.parseLong(str.substring(str.lastIndexOf(46) + 1));
    }

    public static FormatInitializationMetadataOuterClass$FormatInitializationMetadata br(Set set, String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataS;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jsk jskVar = (jsk) it.next();
                if ((jskVar instanceof ygu) && (formatInitializationMetadataOuterClass$FormatInitializationMetadataS = ((ygu) jskVar).s(str, formatIdOuterClass$FormatId)) != null) {
                    return formatInitializationMetadataOuterClass$FormatInitializationMetadataS;
                }
            }
        }
        return null;
    }

    public static TimeRangeOuterClass$TimeRange bs(TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange, TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2) {
        long j = timeRangeOuterClass$TimeRange.c;
        long j2 = timeRangeOuterClass$TimeRange2.c;
        if (j < j2) {
            return g(timeRangeOuterClass$TimeRange, timeRangeOuterClass$TimeRange2);
        }
        if (j > j2) {
            return g(timeRangeOuterClass$TimeRange2, timeRangeOuterClass$TimeRange);
        }
        aihf aihfVarCreateBuilder = TimeRangeOuterClass$TimeRange.a.createBuilder();
        long j3 = timeRangeOuterClass$TimeRange.c;
        aihfVarCreateBuilder.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
        timeRangeOuterClass$TimeRange3.b |= 1;
        timeRangeOuterClass$TimeRange3.c = j3;
        long jMax = Math.max(timeRangeOuterClass$TimeRange.d, timeRangeOuterClass$TimeRange2.d);
        aihfVarCreateBuilder.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange4 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
        timeRangeOuterClass$TimeRange4.b |= 2;
        timeRangeOuterClass$TimeRange4.d = jMax;
        int i = timeRangeOuterClass$TimeRange.e;
        aihfVarCreateBuilder.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange5 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
        timeRangeOuterClass$TimeRange5.b |= 4;
        timeRangeOuterClass$TimeRange5.e = i;
        return (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.build();
    }

    public static String bt(String str, String str2, long j) {
        return str + '.' + str2 + '.' + j;
    }

    public static String bu(String str, int i, String str2, long j) {
        return bt(str, co(i, str2), j);
    }

    public static String bv(String str, int i, String str2, long j, boolean z) {
        return bt(str, co(i, str2), j).concat(true != z ? "" : ".1");
    }

    public static String bw(String str) {
        if (str == null) {
            zvp.h(zvn.a, zvm.f, "null cacheKey in getFormatId.", 0.01d);
            return "";
        }
        int iIndexOf = str.indexOf(46);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, i);
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            return str.substring(i, iIndexOf2);
        }
        zvp.h(zvn.a, zvm.f, "Invalid formatId in cacheKey: ".concat(str), 0.01d);
        return "";
    }

    public static String bx(String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf(46)) >= 0) {
            return str.substring(0, iIndexOf);
        }
        zvp.h(zvn.a, zvm.f, "Invalid videoId in cacheKey: ".concat(String.valueOf(str)), 0.01d);
        return "";
    }

    public static String by(String str) {
        return cp(bw(str));
    }

    public static void bz(TreeSet treeSet, yfr yfrVar) {
        long j = yfrVar.a;
        long j2 = yfrVar.b;
        TreeSet treeSet2 = new TreeSet((SortedSet) treeSet.subSet(new yfr(j, j2), true, new yfr(j2, j2), true));
        if (!treeSet2.isEmpty() && ((yfr) treeSet2.last()).b > yfrVar.b) {
            treeSet2.remove(treeSet2.last());
        }
        treeSet.removeAll(treeSet2);
        yfr yfrVar2 = (yfr) treeSet.floor(yfrVar);
        yfr yfrVar3 = (yfr) treeSet.ceiling(yfrVar);
        boolean z = yfrVar2 != null && yfrVar2.a(yfrVar);
        if (!yfrVar.a(yfrVar3) || yfrVar3 == null) {
            if (z) {
                yfrVar2.b = Math.max(yfrVar.b, yfrVar2.b);
                return;
            } else {
                treeSet.add(yfrVar);
                return;
            }
        }
        if (z) {
            yfrVar2.b = Math.max(yfrVar.b, yfrVar3.b);
            if (yfrVar2.equals(yfrVar3)) {
                return;
            }
            treeSet.remove(yfrVar3);
            return;
        }
        yfrVar.b = Math.max(yfrVar.b, yfrVar3.b);
        treeSet.add(yfrVar);
        if (yfrVar.equals(yfrVar3)) {
            return;
        }
        treeSet.remove(yfrVar3);
    }

    public static tft cA(ayq ayqVar, xla xlaVar) {
        int iY = xlaVar.y() > 0 ? xlaVar.y() : 60000;
        tex texVarA = tfu.a();
        texVarA.d(iY);
        texVarA.c(false);
        return ayqVar.N(texVarA.a());
    }

    public static long cB(elr elrVar, long j) {
        int iBinarySearch = Arrays.binarySearch(elrVar.H(), j);
        if (iBinarySearch == -1) {
            return -1L;
        }
        if (iBinarySearch < 0) {
            iBinarySearch = -(iBinarySearch + 2);
        }
        return elrVar.I()[iBinarySearch] + ((elrVar.G()[iBinarySearch] * (j - elrVar.H()[iBinarySearch])) / ((long) elrVar.F()[iBinarySearch]));
    }

    public static TreeSet cC(Set set, String str, elr elrVar, zjr zjrVar) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jsk jskVar = (jsk) it.next();
            if (jskVar instanceof ygu) {
                ygu yguVar = (ygu) jskVar;
                if (zjrVar.aT()) {
                    NavigableSet navigableSetW = yguVar.w(ygt.a(str));
                    if (treeSet.isEmpty()) {
                        treeSet.addAll(navigableSetW);
                    } else {
                        Iterator it2 = navigableSetW.iterator();
                        while (it2.hasNext()) {
                            bz(treeSet, (yfr) it2.next());
                        }
                    }
                }
            }
            jsp jspVar = null;
            for (jsp jspVar2 : jskVar.g(str)) {
                if (jspVar != null) {
                    long j = jspVar2.b;
                    long j2 = jspVar.b;
                    long j3 = jspVar.c;
                    if (j2 + j3 == j) {
                        jspVar = new jsp(jspVar.a, j2, jspVar2.c + j3, jspVar2.f, jspVar.e);
                    } else {
                        cD(treeSet, elrVar, jspVar);
                    }
                }
                jspVar = jspVar2;
            }
            if (jspVar != null) {
                cD(treeSet, elrVar, jspVar);
            }
        }
        return treeSet;
    }

    public static void cD(TreeSet treeSet, elr elrVar, jsp jspVar) {
        long j = jspVar.b;
        bz(treeSet, new yfr(cB(elrVar, j), cB(elrVar, jspVar.c + j)));
    }

    public static tpq cE(abxv abxvVar) {
        return abxvVar.z(new wvk(5), new wql(9), atpe.a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [awmd, java.lang.Object] */
    public static abuz cF(isi isiVar, dov dovVar, Context context, vxz vxzVar) {
        zru zruVar;
        if (txz.f(context)) {
            zruVar = zru.TV;
        } else {
            zruVar = twm.t(context) ? zru.TABLET : zru.MOBILE;
        }
        zru zruVar2 = zruVar;
        String packageName = context.getPackageName();
        String strB = txz.b(context);
        Object obj = isiVar.b;
        Object obj2 = isiVar.c;
        boolean zL = vxzVar.l(4, 45677082L, false);
        packageName.getClass();
        strB.getClass();
        Context context2 = (Context) dovVar.a.io();
        context2.getClass();
        return new abuz(packageName, strB, zruVar2, (zrv) obj, zL, context2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static acdx cG(ci ciVar) {
        return ciVar.a.y();
    }

    public static xsc cH(ci ciVar) {
        gil gilVar = (gil) ciVar.a;
        abwk abwkVar = (abwk) gilVar.t.io();
        ght ghtVar = gilVar.a;
        return new xsc(abwkVar, (awmd) ghtVar.DE, (awmd) ghtVar.dO);
    }

    public static yqg cI(final Context context, final Executor executor, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, final mbc mbcVar, tfq tfqVar, final String str, final hed hedVar, wis wisVar, final yup yupVar, final aojm aojmVar, aojo aojoVar, awmd awmdVar, tgr tgrVar, final vxz vxzVar, final wjr wjrVar, final zjr zjrVar, final tqj tqjVar, final hhb hhbVar, hhb hhbVar2, xeu xeuVar, avlh avlhVar) {
        if (aojmVar == null || aojmVar.f.isEmpty()) {
            return null;
        }
        if (zjrVar.k.m(4, 45812092L)) {
            return new yrd(hhbVar2, aojmVar, aojoVar, xeuVar, zjrVar, new yqu(scheduledExecutorService), wisVar, avlhVar, tgrVar);
        }
        final int iMax = Math.max(aojmVar.l, 0);
        final long j = aojmVar.g * 1000;
        HashSet hashSet = new HashSet();
        Iterator<E> it = new aihx(aojmVar.o, aojm.a).iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((ajuf) it.next()).p));
        }
        agfr agfrVar = new agfr() { // from class: yeo
            @Override // defpackage.agfr
            public final Object io() {
                return new jvf(zik.cJ(str, hedVar, executor, yupVar, aojmVar, vxzVar, wjrVar, zjrVar, tqjVar, hhbVar), iMax, j, new jvg());
            }
        };
        String str2 = aojmVar.f;
        List arrayList = aojoVar == null ? new ArrayList() : aojoVar.d;
        long j2 = aojmVar.h * 1000;
        ScheduledExecutorService scheduledExecutorService3 = true == aojmVar.p ? scheduledExecutorService2 : scheduledExecutorService;
        hed hedVar2 = (hed) awmdVar.io();
        int i = yqg.o;
        return new yqf(agfrVar, str2, arrayList, j2, aojmVar.m, aojmVar.n, mbcVar, scheduledExecutorService3, tfqVar, hedVar2, wisVar, tgrVar, hashSet, aojmVar.q, zjrVar, aojmVar.r);
    }

    public static byw cJ(String str, hed hedVar, Executor executor, yup yupVar, aojm aojmVar, vxz vxzVar, wjr wjrVar, zjr zjrVar, tqj tqjVar, hhb hhbVar) {
        cah cahVarK;
        bzg yvcVar;
        byw bywVarB;
        int i;
        int i2;
        int i3 = (aojmVar == null || (i2 = aojmVar.j) <= 0) ? 8000 : i2;
        int i4 = (aojmVar == null || (i = aojmVar.k) <= 0) ? 8000 : i;
        CronetEngine cronetEngineY = hedVar.y(aojmVar == null || aojmVar.i);
        if (cronetEngineY == null) {
            byl bylVar = new byl();
            bylVar.b = str;
            bylVar.c = i3;
            bylVar.d = i4;
            bywVarB = bylVar.a();
        } else {
            cahVarK = hhbVar.k(cronetEngineY, executor, byw.a, i3, i4, false, vxzVar.m(1, 45354923L));
            int i5 = tqr.a;
            if (!tqjVar.k(1073810998)) {
                if (zjrVar.j.m(R.styleable.AppCompatTheme_windowNoTitle, 45424150L)) {
                    bywVarB = cahVarK;
                    yvcVar = yupVar;
                    yvcVar = new yvc(yupVar);
                }
                bywVarB = cahVarK;
                yvcVar = yupVar;
                cahVarK.e(yvcVar);
                bywVarB = cahVarK;
            }
        }
        bywVarB = cahVarK;
        byw bywVar = bywVarB;
        vxz vxzVar2 = ((zhl) wjrVar.a).j;
        return vxzVar2.l(76, 45381045L, false) ? new ytd((tgr) wjrVar.b, bywVar, (int) vxzVar2.c(5, 45381046L, 0L), (int) vxzVar2.c(6, 45381047L, 0L), vxzVar2.l(77, 45381064L, false)) : bywVar;
    }

    public static tpm ca(Context context, String str, ahex ahexVar) {
        atox atoxVar = atox.a;
        bgt bgtVar = new bgt(new bgd(atoxVar, ExtensionRegistryLite.getGeneratedRegistry()), new fzs(context, 12));
        bgtVar.a(ahexVar);
        bgtVar.b.add(new bgx(context, str, agkz.s("foreground_heartbeat_index", "LastCrashTimestamp", "LastCrashException", "interaction_logging_client_side_ve_counter"), new jnk(2), new xea(0)));
        return new tpm(bgtVar.b(), atoxVar);
    }

    public static xgv cb(xgg xggVar) {
        return xggVar.a(xgu.a);
    }

    public static wvz cc(akuj akujVar) {
        aiie aiieVar;
        amgj amgjVar;
        wvz wvzVar;
        if (akujVar == null) {
            return null;
        }
        if ((akujVar.c & 4) == 0) {
            akujVar = null;
        }
        if (akujVar == null) {
            return null;
        }
        akuh akuhVar = akujVar.h;
        if (akuhVar == null) {
            akuhVar = akuh.a;
        }
        aiie aiieVar2 = (akuhVar.b == 49399797 ? (apoq) akuhVar.c : apoq.a).f;
        aiieVar2.getClass();
        apox apoxVar = (apox) atqq.Z(aiieVar2);
        if (apoxVar == null) {
            return null;
        }
        amgg amggVar = apoxVar.m;
        if (amggVar == null) {
            amggVar = amgg.a;
        }
        if (amggVar == null || (aiieVar = amggVar.e) == null || (amgjVar = (amgj) atqq.Z(aiieVar)) == null) {
            return null;
        }
        if ((amgjVar.h & SemanticState.Multiline) == 0) {
            amgjVar = null;
        }
        if (amgjVar == null) {
            return null;
        }
        amqm amqmVar = amgjVar.dn;
        if (amqmVar == null) {
            amqmVar = amqm.a;
        }
        if (amqmVar == null) {
            return null;
        }
        akui akuiVar = akujVar.g;
        if (akuiVar == null) {
            akuiVar = akui.a;
        }
        akuiVar.getClass();
        int i = akuiVar.b;
        if (i == 138681548) {
            wvzVar = new wvz((akuo) akuiVar.c, null, amqmVar);
        } else {
            if (i != 153515154) {
                return null;
            }
            wvzVar = new wvz(null, (akrn) akuiVar.c, amqmVar);
        }
        return wvzVar;
    }

    public static List cd(String str) {
        aihf aihfVarCreateBuilder = aise.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aise aiseVar = (aise) aihfVarCreateBuilder.instance;
        aiseVar.b |= 1;
        aiseVar.c = str;
        aise aiseVar2 = (aise) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = aisd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aisd aisdVar = (aisd) aihfVarCreateBuilder2.instance;
        aiseVar2.getClass();
        aisdVar.c = aiseVar2;
        aisdVar.b |= 1;
        return Arrays.asList((aisd) aihfVarCreateBuilder2.build());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite ce(String str, aiix aiixVar, ExtensionRegistryLite extensionRegistryLite) {
        try {
            return aiixVar.h(Base64.decode(str, 8), extensionRegistryLite);
        } catch (aiik unused) {
            return null;
        } catch (IllegalArgumentException e) {
            zvp.b(zvn.b, zvm.e, a.bU((byte) 46, str, "Unable to decode "), e);
            return null;
        }
    }

    public static MessageLite cf(String str, aiix aiixVar) {
        aiixVar.getClass();
        if (str == null) {
            return null;
        }
        return ce(cg(str), aiixVar, ExtensionRegistryLite.getGeneratedRegistry());
    }

    public static String cg(String str) {
        return URLDecoder.decode(str, StandardCharsets.UTF_8);
    }

    public static ListenableFuture ch(wnf wnfVar, wlu wluVar, wne wneVar) {
        return ape.f(new dzm(wnfVar, wluVar, wneVar, 2));
    }

    public static List ci(mbc mbcVar, Map map) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= mbcVar.b()) {
                hashSet.add((alyq) entry.getKey());
            } else {
                arrayList.add((alyq) entry.getKey());
            }
        }
        map.keySet().removeAll(hashSet);
        return arrayList;
    }

    public static void cj(mbc mbcVar, List list, List list2, Map map) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            alyq alyqVar = (alyq) it.next();
            if (alyqVar.d) {
                HashSet hashSet = new HashSet();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    alyq alyqVar2 = (alyq) it2.next();
                    if (alyqVar2.b == alyqVar.b) {
                        hashSet.add(alyqVar2);
                    }
                }
                map.keySet().removeAll(hashSet);
            } else {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    alyq alyqVar3 = (alyq) it3.next();
                    if (alyqVar.b == alyqVar3.b) {
                        map.remove(alyqVar3);
                    }
                }
                map.put(alyqVar, Long.valueOf(mbcVar.b() + TimeUnit.SECONDS.toMillis(alyqVar.c)));
            }
        }
    }

    public static ListenableFuture ck(wmd wmdVar, wmc wmcVar, Executor executor) {
        return ahno.ap(new wci(wmdVar, wmcVar, 6, null), executor);
    }

    public static InnertubeContext$InnerTubeContext cl(wmd wmdVar, wmc wmcVar) {
        aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
        wmdVar.h(aihfVarCreateBuilder, wmcVar.b);
        return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.build();
    }

    public static agfr cm(wkn wknVar) {
        wknVar.getClass();
        return new tpc(wknVar, 20);
    }

    public static int cn(String str) {
        boolean z;
        int i;
        int i2;
        tqj tqjVar = tqi.a;
        int i3 = 0;
        if (tqjVar != null) {
            int i4 = tqr.a;
            if (tqjVar.k(1073830487)) {
                if (str == null || str.isEmpty()) {
                    return -1;
                }
                int iIndexOf = str.indexOf(58);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                if (iIndexOf <= 0) {
                    return -1;
                }
                char cCharAt = str.charAt(0);
                if (cCharAt < '0') {
                    if (cCharAt == '-') {
                        z = true;
                    } else {
                        if (cCharAt != '+') {
                            return -1;
                        }
                        z = false;
                    }
                    if (iIndexOf == 1) {
                        return -1;
                    }
                    i = 1;
                } else {
                    z = false;
                    i = 0;
                }
                int i5 = true != z ? -2147483647 : Integer.MIN_VALUE;
                while (i < iIndexOf) {
                    int i6 = i + 1;
                    int iCharAt = str.charAt(i) - '0';
                    if (iCharAt < 0 || iCharAt > 9 || i3 < -214748364 || (i2 = i3 * 10) < i5 + iCharAt) {
                        return -1;
                    }
                    i3 = i2 - iCharAt;
                    i = i6;
                }
                return z ? i3 : -i3;
            }
        }
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split(":", 2);
        try {
            if (strArrSplit.length != 0) {
                return Integer.parseInt(strArrSplit[0]);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String co(int i, String str) {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i2 = tqr.a;
            if (tqjVar.k(1073830487)) {
                if (str == null || str.isEmpty()) {
                    return Integer.toString(i);
                }
                return i + ':' + str;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strValueOf = String.valueOf(i);
        if (zIsEmpty) {
            return strValueOf;
        }
        return strValueOf + ':' + str;
    }

    public static String cp(String str) {
        int iIndexOf;
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830487)) {
                return (str == null || (iIndexOf = str.indexOf(58)) < 0 || iIndexOf >= str.length() + (-1)) ? "" : str.substring(iIndexOf + 1);
            }
        }
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split(":", 2);
        return strArrSplit.length >= 2 ? strArrSplit[1] : "";
    }

    public static boolean cq(zwa zwaVar, zwa zwaVar2) {
        return zwaVar2.i().equals(zwaVar.i()) && zwaVar2.k().equals(zwaVar.k());
    }

    public static abhh cr(affd affdVar, Context context, int i) {
        afiz afizVarP = ((yet) aguu.aw(context, yet.class, affdVar)).p();
        return i == 2 ? afizVarP.b(afiz.b, "") : afizVarP.b(afiz.a, "");
    }

    public static FormatInitializationMetadataOuterClass$FormatInitializationMetadata cs(String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, wgs wgsVar, elq elqVar) {
        int iP = elqVar.p();
        long jT = elqVar.t(iP) + elqVar.r(iP);
        aihf aihfVarCreateBuilder = FormatInitializationMetadataOuterClass$FormatInitializationMetadata.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        str.getClass();
        formatInitializationMetadataOuterClass$FormatInitializationMetadata.b |= 1;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata2 = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        formatIdOuterClass$FormatId.getClass();
        formatInitializationMetadataOuterClass$FormatInitializationMetadata2.d = formatIdOuterClass$FormatId;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata2.b |= 2;
        long jP = elqVar.p();
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata3 = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata3.b |= 8;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata3.e = jP;
        String strZ = wgsVar.z();
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata4 = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        strZ.getClass();
        formatInitializationMetadataOuterClass$FormatInitializationMetadata4.b |= 16;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata4.f = strZ;
        aiow aiowVar = aiow.a;
        aihf aihfVarCreateBuilder2 = aiowVar.createBuilder();
        alaw alawVar = wgsVar.b;
        alax alaxVar = alawVar.n;
        if (alaxVar == null) {
            alaxVar = alax.a;
        }
        long j = alaxVar.b;
        aihfVarCreateBuilder2.copyOnWrite();
        aiow aiowVar2 = (aiow) aihfVarCreateBuilder2.instance;
        aiowVar2.b |= 1;
        aiowVar2.c = j;
        alax alaxVar2 = alawVar.n;
        if (alaxVar2 == null) {
            alaxVar2 = alax.a;
        }
        long j2 = alaxVar2.c;
        aihfVarCreateBuilder2.copyOnWrite();
        aiow aiowVar3 = (aiow) aihfVarCreateBuilder2.instance;
        aiowVar3.b |= 2;
        aiowVar3.d = j2;
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata5 = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        aiow aiowVar4 = (aiow) aihfVarCreateBuilder2.build();
        aiowVar4.getClass();
        formatInitializationMetadataOuterClass$FormatInitializationMetadata5.g = aiowVar4;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata5.b |= 32;
        aihf aihfVarCreateBuilder3 = aiowVar.createBuilder();
        alax alaxVar3 = alawVar.o;
        if (alaxVar3 == null) {
            alaxVar3 = alax.a;
        }
        long j3 = alaxVar3.b;
        aihfVarCreateBuilder3.copyOnWrite();
        aiow aiowVar5 = (aiow) aihfVarCreateBuilder3.instance;
        aiowVar5.b |= 1;
        aiowVar5.c = j3;
        alax alaxVar4 = alawVar.o;
        if (alaxVar4 == null) {
            alaxVar4 = alax.a;
        }
        long j4 = alaxVar4.c;
        aihfVarCreateBuilder3.copyOnWrite();
        aiow aiowVar6 = (aiow) aihfVarCreateBuilder3.instance;
        aiowVar6.b |= 2;
        aiowVar6.d = j4;
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata6 = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        aiow aiowVar7 = (aiow) aihfVarCreateBuilder3.build();
        aiowVar7.getClass();
        formatInitializationMetadataOuterClass$FormatInitializationMetadata6.h = aiowVar7;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata6.b |= 64;
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata7 = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata7.b |= SemanticState.Hidden;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata7.i = jT;
        aihfVarCreateBuilder.copyOnWrite();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata8 = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata8.b |= SemanticState.LiveRegion;
        formatInitializationMetadataOuterClass$FormatInitializationMetadata8.j = 1000000;
        return (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.build();
    }

    public static boolean ct(agkz agkzVar, elq elqVar, String str, int i) {
        zkf.a(i > 0 && i <= elqVar.p());
        long jS = elqVar.s(i);
        long jQ = elqVar.q(i);
        agqr agqrVarK = agkzVar.iterator();
        while (agqrVarK.hasNext()) {
            String str2 = str;
            if (((jsk) agqrVarK.next()).o(str2, jS, jQ)) {
                return true;
            }
            str = str2;
        }
        return false;
    }

    public static tft cu(ayq ayqVar) {
        return ayqVar.N(j(100000));
    }

    public static tft cv(ayq ayqVar) {
        return ayqVar.N(j(35000));
    }

    public static tft cw(ayq ayqVar) {
        tex texVarA = tfu.a();
        texVarA.d(3600);
        texVarA.c(false);
        return ayqVar.N(texVarA.a());
    }

    public static tft cx(ayq ayqVar, xla xlaVar) {
        int iV = xlaVar.v() > 0 ? xlaVar.v() : 8000;
        tex texVarA = tfu.a();
        texVarA.d(iV);
        texVarA.c(false);
        return ayqVar.N(texVarA.a());
    }

    public static tft cy(ayq ayqVar, xla xlaVar) {
        return ayqVar.N(j(xlaVar.w() > 0 ? xlaVar.w() : 62000));
    }

    public static tft cz(ayq ayqVar) {
        return ayqVar.N(bN(3000, 5000));
    }

    private static TimeRangeOuterClass$TimeRange g(TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange, TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2) {
        if (timeRangeOuterClass$TimeRange.c + timeRangeOuterClass$TimeRange.d == timeRangeOuterClass$TimeRange2.c) {
            aihf aihfVarCreateBuilder = TimeRangeOuterClass$TimeRange.a.createBuilder();
            long j = timeRangeOuterClass$TimeRange.c;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange3.b |= 1;
            timeRangeOuterClass$TimeRange3.c = j;
            long j2 = timeRangeOuterClass$TimeRange.d + timeRangeOuterClass$TimeRange2.d;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange4 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange4.b |= 2;
            timeRangeOuterClass$TimeRange4.d = j2;
            int i = timeRangeOuterClass$TimeRange.e;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange5 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange5.b |= 4;
            timeRangeOuterClass$TimeRange5.e = i;
            return (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.build();
        }
        aihf aihfVarCreateBuilder2 = TimeRangeOuterClass$TimeRange.a.createBuilder();
        long j3 = timeRangeOuterClass$TimeRange.c;
        aihfVarCreateBuilder2.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange6 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.instance;
        timeRangeOuterClass$TimeRange6.b |= 1;
        timeRangeOuterClass$TimeRange6.c = j3;
        long j4 = (timeRangeOuterClass$TimeRange2.c - timeRangeOuterClass$TimeRange.c) + timeRangeOuterClass$TimeRange2.d;
        aihfVarCreateBuilder2.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange7 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.instance;
        timeRangeOuterClass$TimeRange7.b |= 2;
        timeRangeOuterClass$TimeRange7.d = j4;
        int i2 = timeRangeOuterClass$TimeRange.e;
        aihfVarCreateBuilder2.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange8 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.instance;
        timeRangeOuterClass$TimeRange8.b |= 4;
        timeRangeOuterClass$TimeRange8.e = i2;
        return (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.build();
    }

    private static tfu j(int i) {
        tex texVarA = tfu.a();
        texVarA.d(i);
        texVarA.c(false);
        return texVarA.a();
    }

    public zik(byte[] bArr) {
    }

    private zik() {
    }

    public zik(Executor executor) {
        executor.getClass();
    }

    public void C() {
    }

    public void d() {
    }

    public void jr() {
    }

    public void D(String str) {
    }

    public void E(wgo wgoVar) {
    }

    public void F(List list) {
    }

    public void G(float f) {
    }

    public void gV(String str) {
    }

    public void gW(String str) {
    }

    public void js(zlm zlmVar) {
    }

    public void ju(int i) {
    }

    public void gX(String str, String str2) {
    }

    public void jt(cdy cdyVar, long j, long j2, int i) {
    }
}
