package defpackage;

import android.util.Pair;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableAudioFormat;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableVideoFormat;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xjh implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xjh(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return amjo.a(((Integer) obj).intValue());
            case 1:
                return amjq.a(((Integer) obj).intValue());
            case 2:
                return ajvs.a(((Integer) obj).intValue());
            case 3:
                return ajvt.a(((Integer) obj).intValue());
            case 4:
                return ((akjb) obj).b;
            case 5:
                return ((akjb) obj).b;
            case 6:
                return ((xvq) obj).a;
            case 7:
                agrf agrfVar = xqw.a;
                afha afhaVarO = xvq.o();
                afhaVarO.g((dii) obj);
                return afhaVarO.d();
            case 8:
                try {
                    return (Pair) ahng.v((ListenableFuture) obj);
                } catch (ExecutionException e) {
                    ((agrc) ((agrc) ((agrc) xrx.a.b().i(agso.a, "MDX.MediaRoutes")).j(e)).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRoutes", "createRouteToCastDeviceMap", (char) 192, "MediaRoutes.java")).t("Future to get CastDevice from route bundle failed.");
                    return null;
                }
            case 9:
                return (dii) ((Pair) obj).first;
            case 10:
                return (Optional) ((Pair) obj).second;
            case 11:
                return (dii) obj;
            case 12:
                return Optional.ofNullable(((dii) obj).s);
            case 13:
                return ((xvh) obj).b;
            case 14:
                return (xvh) obj;
            case 15:
                return ((xvk) obj).a;
            case 16:
                return Long.valueOf(((ygu) obj).r());
            case 17:
                return Long.valueOf(((yez) obj).f);
            case 18:
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = ((SelectableFormatsOuterClass$SelectableAudioFormat) obj).b;
                return formatIdOuterClass$FormatId == null ? FormatIdOuterClass$FormatId.getDefaultInstance() : formatIdOuterClass$FormatId;
            case 19:
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = ((SelectableFormatsOuterClass$SelectableVideoFormat) obj).b;
                return formatIdOuterClass$FormatId2 == null ? FormatIdOuterClass$FormatId.getDefaultInstance() : formatIdOuterClass$FormatId2;
            default:
                return ((wgs) obj).o();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
