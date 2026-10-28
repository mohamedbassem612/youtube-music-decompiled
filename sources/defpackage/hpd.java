package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hpd {
    static final Duration a = Duration.ofHours(12);
    public static final /* synthetic */ int b = 0;
    private final Context c;
    private final hpy d;
    private final mbc e;
    private final Executor f;

    public hpd(Context context, hpy hpyVar, mbc mbcVar, Executor executor) {
        this.c = context;
        this.d = hpyVar;
        this.e = mbcVar;
        this.f = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(Optional optional) {
        if (!optional.isPresent()) {
            return 0;
        }
        agqs agqsVarListIterator = ((agke) ((aohq) optional.get()).getStreamsProgressModels()).listIterator(0);
        long jLongValue = 0;
        long jLongValue2 = 0;
        while (agqsVarListIterator.hasNext()) {
            aqdo aqdoVar = (aqdo) agqsVarListIterator.next();
            jLongValue += aqdoVar.b().longValue();
            jLongValue2 += aqdoVar.a().longValue();
        }
        if (jLongValue != 0) {
            return Math.min(100, (int) ((jLongValue2 * 100) / jLongValue));
        }
        return 0;
    }

    public static long b(agke agkeVar) {
        if (agkeVar != null) {
            return ((Long) Collection.EL.stream(agkeVar).map(new hpa(2)).max(Comparator$CC.naturalOrder()).orElse(0L)).longValue();
        }
        return 0L;
    }

    public static aogq l(aohk aohkVar) {
        try {
            return (aogq) aihn.parseFrom(aogq.a, aohkVar.getOfflineStateBytes(), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            return aogq.a;
        }
    }

    public static aqpc m(Optional optional) {
        if (true == optional.isPresent()) {
            optional = Optional.ofNullable(((aqph) optional.get()).getTransferState());
        }
        return (aqpc) optional.orElse(aqpc.TRANSFER_STATE_UNKNOWN);
    }

    public static boolean t(aamp aampVar) {
        return aampVar == aamp.PLAYABLE;
    }

    public static final aony w(hth hthVar) {
        return aaje.h((aoop) hthVar.e().orElse(null), new qf(hthVar, 19));
    }

    private static ListenableFuture x(agke agkeVar) {
        int i = 5;
        Iterable iterable = (Iterable) Collection.EL.stream(agkeVar).map(new hds(4)).map(new hds(i)).collect(aghu.a);
        iterable.getClass();
        awcy awcyVar = new awcy(iterable);
        avnn avnnVar = atqp.l;
        avmc avmcVarAn = awcyVar.D(avoi.a, true, Alert.DURATION_SHOW_INDEFINITELY).B(new hgu(i)).an(Boolean.FALSE);
        tzj tzjVar = new tzj();
        avmcVarAn.F(new tzi(tzjVar));
        return tzjVar;
    }

    private static boolean y(aony aonyVar) {
        return !aaje.r(aonyVar);
    }

    private static boolean z(aqpc aqpcVar) {
        return aqpc.TRANSFER_STATE_UNKNOWN.equals(aqpcVar) || aqpc.TRANSFER_STATE_FAILED.equals(aqpcVar);
    }

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
    public final aamp c(hth hthVar) {
        aqpc aqpcVarM = m(hthVar.f());
        Optional optionalF = hthVar.f();
        if (true == optionalF.isPresent()) {
            optionalF = Optional.ofNullable(((aqph) optionalF.get()).getFailureReason());
        }
        aqpe aqpeVar = (aqpe) optionalF.orElse(aqpe.TRANSFER_FAILURE_REASON_UNKNOWN);
        Optional optionalF2 = hthVar.f();
        if (true == optionalF2.isPresent()) {
            optionalF2 = Optional.ofNullable(((aqph) optionalF2.get()).getTransferStatusReason());
        }
        List list = (List) optionalF2.orElse(agpi.a);
        if (q(hthVar)) {
            aony aonyVarW = w(hthVar);
            if (y(aonyVarW) && aaje.t(aonyVarW)) {
                return aamp.ERROR_PENDING_PLAYABILITY_ACTION;
            }
            if (y(aonyVarW)) {
                return aamp.ERROR_NOT_PLAYABLE;
            }
            if (u(hthVar.c())) {
                return p(hthVar.c()) ? aamp.ERROR_EXPIRED : aamp.ERROR_POLICY;
            }
            if (!o(hthVar.d())) {
                return aamp.ERROR_STREAMS_MISSING;
            }
            if (aqpc.TRANSFER_STATE_FAILED.equals(aqpcVarM) && aqpe.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE.equals(aqpeVar)) {
                return aamp.ERROR_DISK;
            }
            if (z(aqpcVarM)) {
                return aamp.ERROR_GENERIC;
            }
        }
        if (aqpcVarM.equals(aqpc.TRANSFER_STATE_COMPLETE)) {
            return aamp.PLAYABLE;
        }
        if (aqpcVarM.equals(aqpc.TRANSFER_STATE_PAUSED_BY_USER)) {
            return aamp.TRANSFER_PAUSED;
        }
        aqpc aqpcVar = aqpc.TRANSFER_STATE_TRANSFERRING;
        if (aqpcVarM.equals(aqpcVar)) {
            return (aqpcVar.equals(aqpcVarM) && aqpe.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE.equals(aqpeVar)) ? aamp.ERROR_DISK_SD_CARD : aamp.TRANSFER_IN_PROGRESS;
        }
        if (aqpcVarM.equals(aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE)) {
            if (list.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_NETWORK)) {
                return aamp.TRANSFER_PENDING_NETWORK;
            }
            if (list.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_WIFI)) {
                return aamp.TRANSFER_PENDING_WIFI;
            }
            if (list.contains(aqpd.TRANSFER_STATUS_REASON_PENDING_STORAGE)) {
                return aamp.TRANSFER_PENDING_STORAGE;
            }
        }
        return aamp.TRANSFER_WAITING_IN_QUEUE;
    }

    public final aamp d(Optional optional, Optional optional2, Optional optional3) {
        htg htgVar = new htg();
        htgVar.d(optional);
        htgVar.b(optional2);
        htgVar.c(optional3);
        return c(htgVar.a());
    }

    public final ListenableFuture e(String str) {
        return ahno.ar(g(str), new hnd(this, 8), MoreExecutors.directExecutor());
    }

    public final ListenableFuture f(anyx anyxVar, boolean z) {
        hpy hpyVar = this.d;
        return z ? afxd.f(hpyVar.d(anyxVar.g())).g(afwl.a(new hnd(anyxVar, 9)), this.f) : afxd.f(hpyVar.a(anyxVar.g())).g(afwl.a(new hnd(anyxVar, 10)), this.f);
    }

    public final ListenableFuture g(String str) {
        hpy hpyVar = this.d;
        ListenableFuture listenableFutureA = hpyVar.a(kro.aH(str));
        ListenableFuture listenableFutureA2 = hpyVar.a(kro.aI(str));
        ListenableFuture listenableFutureA3 = hpyVar.a(kro.ax(str));
        ListenableFuture listenableFutureA4 = hpyVar.a(kro.aJ(str));
        ListenableFuture listenableFutureA5 = hpyVar.a(kro.av(str));
        ListenableFuture listenableFutureA6 = hpyVar.a(kro.aw(str));
        return ahno.av(listenableFutureA, listenableFutureA2, listenableFutureA3, listenableFutureA4, listenableFutureA5, listenableFutureA6).k(afwl.j(new hog(listenableFutureA, listenableFutureA2, listenableFutureA3, listenableFutureA4, listenableFutureA5, listenableFutureA6, 2)), MoreExecutors.directExecutor());
    }

    public final ListenableFuture h(List list) {
        int i = 15;
        List list2 = (List) Collection.EL.stream(list).map(new hfw(this, i)).collect(Collectors.toList());
        return ahno.au(list2).k(afwl.j(new ub(list2, i)), MoreExecutors.directExecutor());
    }

    public final ListenableFuture i(java.util.Collection collection) {
        return x((agke) Collection.EL.stream(collection).map(new hfw(this, 14)).collect(aghu.a));
    }

    public final ListenableFuture j(java.util.Collection collection) {
        return x((agke) Collection.EL.stream(collection).map(new hpc(this, 0)).collect(aghu.a));
    }

    public final ListenableFuture k(String str) {
        return ahno.ar(e(wfs.h(str)), new hoh(9), MoreExecutors.directExecutor());
    }

    public final String n(hth hthVar) {
        aamp aampVarC = c(hthVar);
        aams aamsVarA = null;
        aofo aofoVarG = aaje.g((aoop) hthVar.e().orElse(null), new qf(hthVar, 18));
        Optional optionalC = hthVar.c();
        if (!optionalC.isEmpty()) {
            aohk aohkVar = (aohk) optionalC.get();
            aamr aamrVar = new aamr();
            aamrVar.a = wfs.h(aohkVar.b());
            aamrVar.b = l(aohkVar);
            aamrVar.d = TimeUnit.SECONDS.toMillis(aohkVar.getLastUpdatedTimestampSeconds().longValue());
            aamrVar.e = this.e;
            aamsVarA = aamrVar.a();
        }
        int iA = a(hthVar.d());
        Context context = this.c;
        aamg aamgVar = aamg.DELETED;
        switch (aampVarC) {
            case DELETED:
                return context.getString(R.string.offline_video_deleted);
            case PLAYABLE:
            case CANDIDATE:
                return "";
            case TRANSFER_IN_PROGRESS:
                return context.getString(R.string.offline_adding_progress, Integer.valueOf(iA));
            case TRANSFER_WAITING_IN_QUEUE:
                return context.getString(R.string.offline_waiting, Integer.valueOf(iA));
            case TRANSFER_PENDING_USER_APPROVAL:
                return context.getString(R.string.offline_stream_pending);
            case TRANSFER_PENDING_NETWORK:
                return context.getString(R.string.offline_waiting_for_network);
            case TRANSFER_PENDING_WIFI:
                return context.getString(R.string.offline_waiting_for_wifi);
            case TRANSFER_PENDING_TOOTHFAIRY:
            case OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE:
            case ERROR_EXPIRED_RENTAL:
            default:
                return context.getString(R.string.offline_failed);
            case TRANSFER_PENDING_STORAGE:
                return context.getString(R.string.offline_waiting_for_space);
            case TRANSFER_PAUSED:
                return context.getString(R.string.offline_paused, Integer.valueOf(iA));
            case ERROR_PENDING_PLAYABILITY_ACTION:
                return aofoVarG != null ? aofoVarG.d : context.getString(R.string.offline_failed);
            case ERROR_STREAMS_MISSING:
                return context.getString(R.string.offline_failed_file_not_found);
            case ERROR_NOT_PLAYABLE:
                if (aamsVarA != null) {
                    aogq aogqVar = aamsVarA.c;
                    if ((aogqVar.b & 16) != 0) {
                        return aogqVar.i;
                    }
                }
                return (aofoVarG == null || (aofoVarG.b & 2) == 0 || aofoVarG.d.isEmpty()) ? context.getString(R.string.offline_video_not_playable) : aofoVarG.d;
            case ERROR_POLICY:
                if (aamsVarA != null) {
                    aogq aogqVar2 = aamsVarA.c;
                    if ((aogqVar2.b & 16) != 0) {
                        return aogqVar2.i;
                    }
                }
                return context.getString(R.string.offline_failed);
            case ERROR_EXPIRED:
                return context.getString(R.string.offline_expired);
            case ERROR_NETWORK:
                return context.getString(R.string.offline_failed_network_error);
            case ERROR_DISK:
                return context.getString(R.string.offline_failed_disk_error);
            case ERROR_DISK_SD_CARD:
                return context.getString(R.string.offline_temp_disk_error_sd_card);
        }
    }

    public final boolean o(Optional optional) {
        int iAV;
        if (optional.isEmpty()) {
            return false;
        }
        List streamsProgress = ((aohq) optional.get()).getStreamsProgress();
        if (streamsProgress.isEmpty()) {
            return false;
        }
        Iterator it = streamsProgress.iterator();
        do {
            if (!it.hasNext()) {
                return true;
            }
            iAV = a.aV(((aqdp) it.next()).f);
        } while ((iAV != 0 ? iAV : 1) != 4);
        return false;
    }

    public final boolean p(Optional optional) {
        if (!optional.isPresent() || !aohh.OFFLINE_VIDEO_POLICY_ACTION_OK.equals(((aohk) optional.get()).getAction())) {
            return false;
        }
        long epochMilli = this.e.f().toEpochMilli();
        return epochMilli > TimeUnit.SECONDS.toMillis(((aohk) optional.get()).getExpirationTimestamp().longValue()) || epochMilli < Duration.ofSeconds(((aohk) optional.get()).getLastUpdatedTimestampSeconds().longValue()).toMillis() - a.toMillis();
    }

    public final boolean q(hth hthVar) {
        return r(hthVar.f(), hthVar.c(), hthVar.d());
    }

    public final boolean r(Optional optional, Optional optional2, Optional optional3) {
        if (true == optional.isPresent()) {
            optional = Optional.ofNullable(((aqph) optional.get()).getTransferState());
        }
        aqpc aqpcVar = aqpc.TRANSFER_STATE_UNKNOWN;
        aqpc aqpcVar2 = (aqpc) optional.orElse(aqpcVar);
        return ((aqpcVar2.equals(aqpcVar) && optional2.isEmpty()) || aqpcVar2.equals(aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE) || aqpcVar2.equals(aqpc.TRANSFER_STATE_TRANSFERRING) || aqpcVar2.equals(aqpc.TRANSFER_STATE_PAUSED_BY_USER) || (!aqpcVar2.equals(aqpc.TRANSFER_STATE_FAILED) && !u(optional2) && o(optional3))) ? false : true;
    }

    public final boolean s(hth hthVar) {
        return t(c(hthVar));
    }

    public final boolean u(Optional optional) {
        if (optional.isPresent()) {
            return !aohh.OFFLINE_VIDEO_POLICY_ACTION_OK.equals(((aohk) optional.get()).getAction()) || p(optional);
        }
        return false;
    }

    public final boolean v(Optional optional, Optional optional2) {
        int iOrdinal;
        if (optional2.isPresent() && ((iOrdinal = ((aohk) optional2.get()).getAction().ordinal()) == 0 || iOrdinal == 2)) {
            return false;
        }
        return z(m(optional));
    }
}
