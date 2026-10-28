package defpackage;

import android.media.MediaCodecInfo;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yom implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yom(int i) {
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
        String str;
        int i = this.$cid;
        Float fValueOf = Float.valueOf(1.0f);
        switch (i) {
            case 0:
                yon yonVar = (yon) obj;
                wgs wgsVar = yonVar.b;
                return new wiw(wgsVar.f(), yonVar.c, wgsVar.A(), false, agkz.n(yonVar.a));
            case 1:
                return ((wgs) obj).o();
            case 2:
                return ((wgs) obj).o();
            case 3:
                yor yorVar = (yor) obj;
                agkz agkzVar = yos.a;
                return new wiw(yorVar.b, yorVar.c, agkz.n(yorVar.a));
            case 4:
                InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat = (InnertubeDrmService$AuthorizedFormat) obj;
                int i2 = yvq.a;
                akvr akvrVarA = akvr.a(innertubeDrmService$AuthorizedFormat.c);
                if (akvrVarA == null) {
                    akvrVarA = akvr.DRM_TRACK_TYPE_UNSPECIFIED;
                }
                if (akvr.DRM_TRACK_TYPE_AUDIO.equals(akvrVarA)) {
                    str = "AUDIO";
                } else if (akvr.DRM_TRACK_TYPE_SD.equals(akvrVarA)) {
                    str = "SD";
                } else if (akvr.DRM_TRACK_TYPE_HD.equals(akvrVarA)) {
                    str = "HD";
                } else if (akvr.DRM_TRACK_TYPE_UHD1.equals(akvrVarA)) {
                    str = "UHD1";
                } else {
                    str = akvr.DRM_TRACK_TYPE_UHD2.equals(akvrVarA) ? "UHD2" : "UNSPECIFIED";
                }
                String str2 = str;
                return innertubeDrmService$AuthorizedFormat.e ? str2.concat("_HDR") : str2;
            case 5:
                return ((wgs) obj).o();
            case 6:
                return ((wgs) obj).f;
            case 7:
                return ((wgs) obj).o();
            case 8:
                return ((wgs) obj).m();
            case 9:
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) obj;
                int i3 = zjo.a;
                return "_p." + Integer.toHexString(codecProfileLevel.profile) + "_l." + Integer.toHexString(codecProfileLevel.level);
            case 10:
                int i4 = zoy.a;
                return Integer.valueOf(((asku) obj).e);
            case 11:
                return new HashMap();
            case 12:
                return new ArrayList();
            case 13:
                return new ArrayList();
            case 14:
                return (aihf) obj;
            case 15:
                zvr zvrVar = zvp.a;
                return fValueOf;
            case 16:
                zvr zvrVar2 = zvp.a;
                return fValueOf;
            case 17:
                return fValueOf;
            case 18:
                return fValueOf;
            case 19:
                return fValueOf;
            default:
                Map.Entry entry = (Map.Entry) obj;
                aihf aihfVarCreateBuilder = atxm.a.createBuilder();
                String str3 = (String) entry.getKey();
                aihfVarCreateBuilder.copyOnWrite();
                atxm atxmVar = (atxm) aihfVarCreateBuilder.instance;
                str3.getClass();
                atxmVar.b = str3;
                String str4 = (String) entry.getValue();
                aihfVarCreateBuilder.copyOnWrite();
                atxm atxmVar2 = (atxm) aihfVarCreateBuilder.instance;
                str4.getClass();
                atxmVar2.c = str4;
                return (atxm) aihfVarCreateBuilder.build();
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
