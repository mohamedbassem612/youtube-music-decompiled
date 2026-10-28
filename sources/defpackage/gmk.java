package defpackage;

import android.bluetooth.BluetoothSocket;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.bluetooth.BluetoothA2dpService;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gmk implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gmk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        byte b;
        String str;
        switch (this.$cid) {
            case 0:
                BluetoothSocket bluetoothSocket = (BluetoothSocket) obj;
                Object obj2 = this.a;
                InputStream inputStream = null;
                try {
                    InputStream inputStream2 = bluetoothSocket.getInputStream();
                    try {
                        if (inputStream2 == null) {
                            throw new IOException("InputStream cannot be null.");
                        }
                        OutputStream outputStream = bluetoothSocket.getOutputStream();
                        if (outputStream == null) {
                            throw new IOException("OutputStream cannot be null.");
                        }
                        byte[] bArr = new byte[SemanticState.ReadOnly];
                        while (true) {
                            BluetoothA2dpService bluetoothA2dpService = (BluetoothA2dpService) obj2;
                            if (!bluetoothA2dpService.j || !bluetoothSocket.isConnected()) {
                                bluetoothA2dpService.a(bluetoothSocket, inputStream2, outputStream);
                                return;
                            }
                            try {
                                int i = inputStream2.read(bArr);
                                if (i < 0) {
                                    bluetoothA2dpService.a(bluetoothSocket, inputStream2, outputStream);
                                    return;
                                }
                                if (i != 0) {
                                    byte b2 = bArr[0];
                                    boolean zC = ((jnm) bluetoothA2dpService.e.io()).C();
                                    if (b2 == 0 || b2 == 1 || b2 == 2) {
                                        if (zC) {
                                            agrc agrcVar = (agrc) ((agrc) BluetoothA2dpService.a.c()).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService", "listenForMessages", 228, "BluetoothA2dpService.java");
                                            if (b2 == 0) {
                                                str = "QUICKACCESS_INPUT";
                                            } else if (b2 != 1) {
                                                str = b2 != 2 ? "UNKNOWN" : "AUTOPLAY_PLAYLIST_INPUT";
                                            } else {
                                                str = "AUTOPLAY_INPUT";
                                            }
                                            agrcVar.w("Playing Supermix, messageId: %s", str);
                                            Uri uri = Uri.parse("https://music.youtube.com/watch?list=RDTMAK5uy_kset8DisdE7LSD4TNjEVvrKRTmG7a56sY&shuffle=1");
                                            ((abi) bluetoothA2dpService.f.io()).b(uri, "YouTube Music", "BluetoothA2dpService", new gml(obj2, uri, 0));
                                        }
                                        if (b2 == 0) {
                                            b = -128;
                                        } else if (b2 != 1) {
                                            if (b2 != 2) {
                                                throw new IllegalArgumentException(a.bR(b2, "Unknown message ID: "));
                                            }
                                            b = -126;
                                            bluetoothA2dpService.a(bluetoothSocket, inputStream2, outputStream);
                                        } else {
                                            b = -127;
                                        }
                                        try {
                                            outputStream.write(new byte[]{b, 0, 1, !zC ? 1 : 0});
                                        } catch (IOException unused) {
                                            bluetoothA2dpService.a(bluetoothSocket, inputStream2, outputStream);
                                        }
                                    } else {
                                        ((agrc) ((agrc) BluetoothA2dpService.a.c()).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService", "listenForMessages", 239, "BluetoothA2dpService.java")).t("Received unknown byte: null");
                                    }
                                }
                            } catch (IOException unused2) {
                                bluetoothA2dpService.a(bluetoothSocket, inputStream2, outputStream);
                                return;
                            }
                        }
                    } catch (IOException unused3) {
                        inputStream = inputStream2;
                        ((BluetoothA2dpService) obj2).a(bluetoothSocket, inputStream, null);
                        return;
                    }
                } catch (IOException unused4) {
                }
                break;
            case 1:
                awka.f((AtomicReference) this.a);
                return;
            case 2:
                aihf aihfVar = (aihf) obj;
                agrf agrfVar = gmy.a;
                aihf aihfVarCreateBuilder = anqd.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                anqd anqdVar = (anqd) aihfVarCreateBuilder.instance;
                anqdVar.c = ((anqm) this.a).d;
                anqdVar.b |= 1;
                anqd anqdVar2 = (anqd) aihfVarCreateBuilder.build();
                aihfVar.copyOnWrite();
                almc almcVar = (almc) aihfVar.instance;
                almc almcVar2 = almc.a;
                anqdVar2.getClass();
                almcVar.d = anqdVar2;
                almcVar.b |= 64;
                return;
            case 3:
                aihf aihfVar2 = (aihf) obj;
                aihfVar2.copyOnWrite();
                almc almcVar3 = (almc) aihfVar2.instance;
                almc almcVar4 = almc.a;
                Object obj3 = this.a;
                obj3.getClass();
                almcVar3.c = (aoih) obj3;
                almcVar3.b |= 1;
                return;
            case 4:
                ((ArrayList) this.a).add((String) obj);
                return;
            case 5:
                ((hfx) this.a).b((agkz) obj);
                return;
            case 6:
                ((hfx) this.a).c((agkz) obj);
                return;
            case 7:
                ((hfx) this.a).d((agkz) obj);
                return;
            case 8:
                ((hfx) this.a).e((agkz) obj);
                return;
            case 9:
                ((isw) ((hgk) this.a).d.io()).h(((zne) obj).a());
                return;
            case 10:
                ((isw) ((hgk) this.a).d.io()).h(((zne) obj).a());
                return;
            case 11:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                ((hkq) this.a).e.add((ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
                return;
            case 12:
                yw ywVar = new yw();
                ywVar.b((anyx) obj);
                ((hng) this.a).c.kk(ywVar.a());
                return;
            case 13:
                anjx anjxVar = (anjx) ((weh) obj);
                yw ywVar2 = new yw();
                ywVar2.b(anjxVar);
                hmw hmwVarA = ywVar2.a();
                hng hngVar = (hng) this.a;
                hngVar.c.kk(hmwVarA);
                hngVar.c(anjxVar.e());
                return;
            case 14:
                anuk anukVar = (anuk) ((weh) obj);
                yw ywVar3 = new yw();
                ywVar3.b(anukVar);
                hmw hmwVarA2 = ywVar3.a();
                hng hngVar2 = (hng) this.a;
                hngVar2.c.kk(hmwVarA2);
                hngVar2.c(anukVar.j());
                return;
            case 15:
                aihf aihfVarCreateBuilder2 = aoie.a.createBuilder();
                aihf aihfVarCreateBuilder3 = aoid.a.createBuilder();
                String strH = wfs.h((String) obj);
                aihfVarCreateBuilder3.copyOnWrite();
                aoid aoidVar = (aoid) aihfVarCreateBuilder3.instance;
                aoidVar.b |= 1;
                aoidVar.c = strH;
                aoid aoidVar2 = (aoid) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                aoie aoieVar = (aoie) aihfVarCreateBuilder2.instance;
                aoidVar2.getClass();
                aoieVar.c = aoidVar2;
                aoieVar.b |= 1;
                ((wog) this.a).e((aoie) aihfVarCreateBuilder2.build());
                return;
            case 16:
                rpi.R((wog) this.a, (String) obj);
                return;
            case 17:
                rpi.S((wog) this.a, (String) obj);
                return;
            case 18:
                avnr.b((AtomicReference) ((hnz) this.a).g.a((String) obj, "PPSDST").ae());
                return;
            case 19:
                Object obj4 = this.a;
                taf.j(ahno.ao(new fuc(obj4, (almd) obj, 19), ((hot) obj4).af), new gtq(obj4, 17));
                return;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    Object obj5 = this.a;
                    taf.j(ahno.ao(new fuc(obj5, th, 20), ((hot) obj5).af), new gou(obj5, th, 11));
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
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
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
