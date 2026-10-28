package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xdx implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xdx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                int i = xdy.j;
                amuh amuhVar = ((alik) obj).n;
                if (amuhVar == null) {
                    amuhVar = amuh.a;
                }
                ajtl ajtlVar = amuhVar.g;
                return ajtlVar == null ? ajtl.a : ajtlVar;
            case 1:
                return ((weo) obj).c;
            case 2:
                long j = xjp.a;
                amuh amuhVar2 = ((alik) obj).n;
                if (amuhVar2 == null) {
                    amuhVar2 = amuh.a;
                }
                akja akjaVar = amuhVar2.e;
                return akjaVar == null ? akja.a : akjaVar;
            case 3:
                aazn aaznVar = (aazn) obj;
                return Boolean.valueOf((aaznVar.c() || aaznVar.a()) ? false : true);
            case 4:
                Duration duration = xun.b;
                return Boolean.valueOf(Collection.EL.stream((List) obj).anyMatch(new xdn(11)));
            case 5:
                Duration duration2 = xun.b;
                return Boolean.valueOf(((xum) obj).a == ajpb.CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE_WITH_PLAYBACK);
            case 6:
                Duration duration3 = xun.b;
                return Boolean.valueOf(((xum) obj).a == ajpb.CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE_WITH_PLAYBACK);
            case 7:
                yee yeeVar = (yee) obj;
                Duration duration4 = xun.b;
                return Boolean.valueOf(yeeVar == yee.b);
            case 8:
                return tzk.c(((yqq) obj).d()).k();
            case 9:
                return tzk.c(((yqq) obj).d()).k();
            case 10:
                akww akwwVar = ((alik) obj).v;
                return akwwVar == null ? akww.a : akwwVar;
            case 11:
                anew anewVar = ((alik) obj).j;
                if (anewVar == null) {
                    anewVar = anew.a;
                }
                MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig = anewVar.l;
                return mediaFetchHotConfigOuterClass$MediaFetchHotConfig == null ? MediaFetchHotConfigOuterClass$MediaFetchHotConfig.getDefaultInstance() : mediaFetchHotConfigOuterClass$MediaFetchHotConfig;
            case 12:
                return ((Bundle) obj).getString("authtoken");
            case 13:
                return ((aohk) obj).d();
            case 14:
                return ((aohq) obj).d();
            case 15:
                return ((aqph) obj).d();
            case 16:
                return Optional.of((wep) obj);
            case 17:
                return (agkj) Collection.EL.stream((agkz) obj).map(new woi(aoop.class, 15)).collect(aghu.a(new aakc(4), Function$CC.identity()));
            case 18:
                return avlr.G((agke) obj);
            case 19:
                return ((aret) obj).d();
            default:
                return a.J((weo) obj);
        }
    }
}
