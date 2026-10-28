package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.bluetooth.BluetoothA2dpService;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fuc implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public /* synthetic */ fuc(BluetoothA2dpService bluetoothA2dpService, BluetoothDevice bluetoothDevice, int i) {
        this.$cid = i;
        this.b = bluetoothA2dpService;
        this.a = bluetoothDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v93, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, vxe] */
    @Override // java.lang.Runnable
    public final void run() {
        Optional optionalEmpty;
        int i = 18;
        int i2 = 3;
        int i3 = 5;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                fue fueVar = (fue) obj;
                if (fueVar.m) {
                    ((InputMethodManager) this.a).showSoftInput((View) obj, 0);
                }
                fueVar.m = false;
                return;
            case 1:
                int i7 = ftx.q;
                ((ClickableSpan) this.a).onClick((View) this.b);
                return;
            case 2:
                Object obj2 = this.a;
                Object obj3 = this.b;
                try {
                    BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = ((BluetoothDevice) obj2).createRfcommSocketToServiceRecord(gmm.a);
                    bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
                    ((BluetoothA2dpService) obj3).j = true;
                    optionalEmpty = Optional.of(bluetoothSocketCreateRfcommSocketToServiceRecord);
                    break;
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) BluetoothA2dpService.a.c()).j(e)).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService", "connectToDevice", (char) 173, "BluetoothA2dpService.java")).w("Failed to connect RFCOMM socket to Device: %s", ((BluetoothDevice) obj2).getName());
                    BluetoothA2dpService bluetoothA2dpService = (BluetoothA2dpService) obj3;
                    bluetoothA2dpService.k.set(false);
                    bluetoothA2dpService.stopSelf();
                    optionalEmpty = Optional.empty();
                }
                optionalEmpty.ifPresentOrElse(new gmk(obj3, i6), new dxk(obj3, i));
                return;
            case 3:
                BluetoothA2dpService bluetoothA2dpService2 = (BluetoothA2dpService) ((gml) this.a).b;
                hgy hgyVar = (hgy) bluetoothA2dpService2.d.io();
                ajwo ajwoVar = (ajwo) this.b;
                if (!gzj.W(ajwoVar)) {
                    ((agrc) ((agrc) hgy.a.c().i(agso.a, "MediaSessionPlayerCtlr")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController", "startBackgroundPlaybackForWidget", 837, "MusicMediaSessionPlayerController.java")).t("startBackgroundPlaybackForWidget but command was not playable");
                } else if (hgyVar.l.u() && hgyVar.w.C()) {
                    yco ycoVar = ((ycp) hgyVar.i.io()).e;
                    ajwo ajwoVarO = gzj.O(ajwoVar, ycoVar);
                    abnk abnkVar = new abnk();
                    abnkVar.a = ajwoVarO;
                    abnl abnlVarA = abnkVar.a();
                    if (ycoVar != null) {
                        agrx agrxVar = agso.a;
                        ((ico) hgyVar.m.io()).f(abnlVarA);
                    } else {
                        hgyVar.s.b();
                        hgyVar.j();
                        ((agrc) ((agrc) hgy.a.c().i(agso.a, "MediaSessionPlayerCtlr")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController", "startBackgroundPlaybackForWidget", 860, "MusicMediaSessionPlayerController.java")).w("startBackgroundPlaybackForWidget: loading PSD %s", abnlVarA);
                        ((abvc) hgyVar.f.io()).g(abnlVarA);
                        if (!hgyVar.o()) {
                            ((abvk) hgyVar.e.io()).ah();
                        }
                    }
                } else {
                    ((agrc) ((agrc) hgy.a.c().i(agso.a, "MediaSessionPlayerCtlr")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController", "startBackgroundPlaybackForWidget", 841, "MusicMediaSessionPlayerController.java")).t("startBackgroundPlaybackForWidget but user is missing premium");
                }
                bluetoothA2dpService2.i.a(new hjz(5, BluetoothA2dpService.b, BluetoothA2dpService.c, null));
                return;
            case 4:
                Iterator it = ((gmy) this.a).f.iterator();
                while (it.hasNext()) {
                    ((gmz) it.next()).b((heh) this.b);
                }
                return;
            case 5:
                Iterator it2 = ((xsc) this.a).a.iterator();
                while (it2.hasNext()) {
                    ((gmz) it2.next()).c((String) this.b);
                }
                return;
            case 6:
                hct hctVar = (hct) ((gtz) this.a).a.io();
                TypedValue typedValue = new TypedValue();
                cf cfVar = hctVar.b;
                cfVar.getTheme().resolveAttribute(R.attr.tabHeaderColor, typedValue, true);
                ?? r1 = this.b;
                boolean zIsEmpty = TextUtils.isEmpty(r1);
                Object obj4 = r1;
                if (zIsEmpty) {
                    obj4 = hctVar.e;
                }
                taf.k(cfVar, hctVar.d.a(), new hcq(hctVar, obj4, i6), new hcq(hctVar, obj4, i4));
                return;
            case 7:
                ((gwl) this.a).a((alvy) this.b);
                return;
            case 8:
                ((gxn) this.a).a.d((amzh) this.b);
                return;
            case 9:
                vwx vwxVar = (vwx) ((gyk) this.a).a.io();
                ajwo ajwoVar2 = ((aqmw) this.b).d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vwxVar.a(ajwoVar2);
                return;
            case 10:
                agrx agrxVar2 = agso.a;
                Object obj5 = this.a;
                hgq hgqVar = (hgq) obj5;
                hgs hgsVar = hgqVar.e;
                int i8 = hgsVar.E;
                if (i8 == 1) {
                    hgy hgyVar2 = (hgy) hgsVar.f.io();
                    aazn aaznVar = hgyVar2.r;
                    anaf anafVarC = (aaznVar != null && aaznVar.c()) ? hgyVar2.c() : hgyVar2.d();
                    hgqVar.w((hjy) this.b, "togglePause", anafVarC, null);
                    hgsVar.E = 0;
                    return;
                }
                if (i8 == 2) {
                    hgsVar.B.postDelayed(new hgx(obj5, i5), 200L);
                    return;
                }
                if (i8 == 3) {
                    hgsVar.e();
                }
                hgsVar.E = 0;
                return;
            case 11:
                ((hhr) this.a).e((hjn) this.b);
                return;
            case 12:
                Object obj6 = this.a;
                ReentrantLock reentrantLock = ((hie) obj6).m;
                reentrantLock.lock();
                Object obj7 = this.b;
                try {
                    if (!((hie) obj6).o && (((zne) obj7).g() || ((zne) obj7).f())) {
                        ((hie) obj6).p = true;
                        avlh avlhVarN = avlh.n(new ub(obj6, 9));
                        aunn aunnVar = ((hie) obj6).j;
                        avlh avlhVarV = avlhVarN.V((avmb) aunnVar.io());
                        avmm avmmVar = ((hie) obj6).s;
                        avlh avlhVarO = avlhVarV.O();
                        znf znfVar = znf.a;
                        avmmVar.c(avlhVarO.U(znfVar).L((avmb) aunnVar.io()).X(new hbn(new ank(obj6, 19), 4)).L((avmb) aunnVar.io()).H(new hbn(new hhn(i4), i3)).al(new hib(new ank(obj6, 16), i5), new hib(hic.a, i6)));
                        afml afmlVar = new afml((hie) obj6, (afvq) ((hie) obj6).i.io(), ((hie) obj6).k);
                        ((hie) obj6).u = afmlVar;
                        ((Context) ((jij) ((hie) obj6).h.io()).c).getContentResolver().registerContentObserver(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, true, afmlVar);
                        avmmVar.c(((hie) obj6).t.O().U(znfVar).L((avmb) ((hie) obj6).l.io()).X(new hbn(new ank(obj6, 17), 6)).L((avmb) aunnVar.io()).al(new hib(new ank(obj6, i), i4), new hib(hid.a, i2)));
                        ((hie) obj6).o = true;
                        ((hie) obj6).p = false;
                        break;
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 13:
                Object obj8 = this.b;
                obj8.getClass();
                acip acipVar = ((aazq) obj8).b;
                String strAu = acipVar != null ? acipVar.au() : null;
                if (strAu == null || strAu.length() == 0) {
                    return;
                }
                Object obj9 = this.a;
                hix hixVar = (hix) obj9;
                ReentrantLock reentrantLock2 = hixVar.a;
                reentrantLock2.lock();
                try {
                    String str = ((hix) obj9).b;
                    if (str != null && awrc.c(str, strAu)) {
                        i5 = 0;
                    }
                    if (i5 != 0) {
                        ((hix) obj9).b = strAu;
                        break;
                    }
                    reentrantLock2.unlock();
                    if (i5 != 0) {
                        ReentrantLock reentrantLock3 = hixVar.a;
                        reentrantLock3.lock();
                        try {
                            List list = ((hix) obj9).c;
                            List listAp = atqq.ap(list);
                            list.clear();
                            reentrantLock3.unlock();
                            if (listAp.isEmpty()) {
                                return;
                            }
                            Iterator it3 = listAp.iterator();
                            while (it3.hasNext()) {
                                hixVar.b((hjz) it3.next(), strAu);
                            }
                            return;
                        } catch (Throwable th) {
                            reentrantLock3.unlock();
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            case 14:
                ((aczl) this.a).a.b(((ajcs) this.b).i);
                return;
            case 15:
                ajwo ajwoVar3 = ((ajji) this.b).c;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                ((aczl) this.a).a.a(ajwoVar3);
                return;
            case 16:
                Object obj10 = this.a;
                synchronized (obj10) {
                    try {
                        jri jriVar = (jri) ((aihf) this.b).build();
                        hfn hfnVar = ((hlu) obj10).e;
                        byte[] byteArray = jriVar.toByteArray();
                        Object obj11 = hfnVar.a;
                        agyo.b((File) obj11);
                        agyo.d(byteArray, (File) obj11);
                    } catch (IOException e2) {
                        ((agrc) ((agrc) ((agrc) hlv.a.c().i(agso.a, "OfflineInnerTubeRespons")).j(e2)).k("com/google/android/apps/youtube/music/offline/OfflineInnerTubeResponseStore$OfflineResponse$1", "run", 196, "OfflineInnerTubeResponseStore.java")).w("Failed to write offline response to %s", ((File) ((hlu) this.a).e.a).getAbsolutePath());
                    }
                    break;
                }
                return;
            case 17:
                ((aati) ((hmn) this.a).d.io()).h((String) this.b);
                return;
            case 18:
                ((aati) ((gmj) this.a).c.io()).i((String) this.b);
                return;
            case 19:
                wfy wfyVar = new wfy((almd) this.b);
                hot hotVar = (hot) this.a;
                xir xirVar = hotVar.an;
                if (xirVar != null) {
                    xirVar.f(tau.BROWSE_RESPONSE_RECEIVED);
                }
                cf activity = hotVar.getActivity();
                if (activity == null || !jku.c(activity)) {
                    return;
                }
                hotVar.i((heh) hotVar.H, wfyVar);
                return;
            default:
                ((hot) this.a).I((Throwable) this.b);
                return;
        }
    }

    public fuc(fue fueVar, InputMethodManager inputMethodManager, int i) {
        this.$cid = i;
        this.a = inputMethodManager;
        this.b = fueVar;
    }

    public fuc(hlu hluVar, aihf aihfVar, int i) {
        this.$cid = i;
        this.b = aihfVar;
        this.a = hluVar;
    }

    public /* synthetic */ fuc(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
