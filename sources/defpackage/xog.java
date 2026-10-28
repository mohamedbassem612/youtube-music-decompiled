package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xog {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/discovery/WakeOnLan");
    public final long b;
    public final yed c;
    public final String d;
    public final Handler e;
    public DatagramPacket f;
    public volatile boolean g;
    private final Runnable i = new xfd(this, 10, null);
    public final xof h = new xof();

    public xog(yed yedVar, String str, xla xlaVar) {
        this.c = yedVar;
        this.d = str;
        this.b = xlaVar.B() > 0 ? xlaVar.B() : 50L;
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 10);
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        synchronized (this) {
            if (this.g) {
                return;
            }
            agrx agrxVar = agso.a;
            String str = this.d;
            try {
                InetAddress byName = InetAddress.getByName("255.255.255.255");
                if (str.length() != 17) {
                    throw new NumberFormatException("Mac address should be 17 characters long");
                }
                int length = (str.length() - 2) / 5;
                byte[] bArr = new byte[6];
                for (int i = 0; i < 6; i++) {
                    int i2 = i * length;
                    bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
                }
                byte[] bArr2 = new byte[102];
                for (int i3 = 0; i3 < 6; i3++) {
                    bArr2[i3] = -1;
                }
                for (int i4 = 1; i4 <= 16; i4++) {
                    System.arraycopy(bArr, 0, bArr2, i4 * 6, 6);
                }
                this.f = new DatagramPacket(bArr2, 102, byName, 9);
                this.g = true;
                this.e.post(this.i);
            } catch (UnknownHostException e) {
                ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.WakeOnLan")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/WakeOnLan", "startBroadcasting", 107, "WakeOnLan.java")).t("Error creating magic packet");
            }
        }
    }

    public final void b() {
        agrx agrxVar = agso.a;
        synchronized (this) {
            this.g = false;
            this.e.removeCallbacks(this.i);
        }
    }
}
