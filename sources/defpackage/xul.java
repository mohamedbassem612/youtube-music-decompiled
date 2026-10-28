package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xul implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xul(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v56, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v57, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v58, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v60, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v61, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        xuo xuoVar;
        char c = 2;
        int i = 1;
        switch (this.$cid) {
            case 0:
                xum xumVar = (xum) obj;
                xun xunVar = (xun) this.a;
                xunVar.h = xumVar;
                xunVar.i.kk(xumVar);
                xum xumVar2 = xunVar.h;
                int i2 = xumVar2.b;
                if (i2 == 1) {
                    c = 1;
                } else if (xumVar2.c || i2 == 0) {
                    c = 0;
                }
                xuo xuoVar2 = xunVar.j;
                xum xumVar3 = xunVar.h;
                if (c == 1) {
                    xuoVar = xuo.f;
                } else if (c == 0) {
                    xuoVar = xuo.e;
                } else {
                    ajpb ajpbVar = xumVar3.a;
                    xuoVar = ajpbVar == ajpb.CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE_WITH_PLAYBACK ? xuo.d : ajpbVar == ajpb.CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE ? xuo.c : xuo.b;
                }
                xunVar.j = xuoVar;
                if (!xuoVar2.equals(xunVar.j)) {
                    xunVar.c.kk(xunVar.j);
                }
                break;
            case 1:
                ((awku) this.a).kk((Boolean) obj);
                break;
            case 2:
                aazj aazjVar = (aazj) obj;
                RemotePlaybackControlsService remotePlaybackControlsService = (RemotePlaybackControlsService) ((xxj) this.a).a;
                if (((ycp) remotePlaybackControlsService.i.io()).e != null) {
                    aazjVar.a.h();
                    remotePlaybackControlsService.b();
                }
                break;
            case 3:
                aazn aaznVar = (aazn) obj;
                RemotePlaybackControlsService remotePlaybackControlsService2 = (RemotePlaybackControlsService) ((xxj) this.a).a;
                if (((ycp) remotePlaybackControlsService2.i.io()).e != null) {
                    int i3 = aaznVar.a;
                    if (i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6 || i3 == 7 || i3 == 8) {
                        remotePlaybackControlsService2.b();
                    }
                }
                break;
            case 4:
                String str = ((wul) obj).a().c;
                if (str != null) {
                    ((xxd) this.a).j.i(str);
                }
                break;
            case 5:
                aazb aazbVar = (aazb) obj;
                xxd xxdVar = (xxd) ((xxj) this.a).a;
                if (xxdVar.ah() && aazbVar.f) {
                    xxdVar.c.ae(aazbVar.b);
                    break;
                }
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xxj xxjVar = (xxj) this.a;
                ((xxd) xxjVar.a).d.f(new xxb(xxjVar, zBooleanValue));
                break;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                xxj xxjVar2 = (xxj) this.a;
                ((xxd) xxjVar2.a).d.e(new xxc(xxjVar2, zBooleanValue2));
                break;
            case 8:
                ((xxd) ((xxj) this.a).a).i = (aazk) obj;
                break;
            case 9:
                abvk abvkVarG = ((xxk) ((xxj) this.a).a).g();
                abvkVarG.getClass();
                acca accaVar = (acca) ((Optional) obj).orElse(null);
                if (!Objects.equals(accaVar, abvkVarG.g())) {
                    abvkVarG.K(accaVar);
                }
                break;
            case 10:
                ((Integer) obj).intValue();
                yab yabVar = (yab) this.a;
                if (yabVar.l.ar() && yabVar.f == 1) {
                    agrx agrxVar = agso.a;
                    Handler handler = yabVar.c;
                    handler.removeMessages(1);
                    handler.sendEmptyMessage(1);
                    break;
                }
                break;
            case 11:
                agrx agrxVar2 = agso.a;
                ((yar) this.a).q();
                break;
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    yfo yfoVar = (yfo) this.a;
                    List list = yfoVar.a;
                    if (!list.isEmpty()) {
                        Collection.EL.stream(list).forEach(new aavj(i));
                        list.clear();
                        yfoVar.b.clear();
                        zhr.d(zhq.CACHE, "All YoutubeMediaCaches released.");
                    }
                }
                break;
            case 13:
                ((yra) this.a).b.h();
                break;
            case 14:
                ((yra) this.a).b.h();
                break;
            case 15:
                int i4 = yrd.c;
                this.a.invoke(obj);
                break;
            case 16:
                int i5 = yrd.c;
                this.a.invoke(obj);
                break;
            case 17:
                this.a.invoke(obj);
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
                this.a.invoke(obj);
                break;
        }
    }
}
