package defpackage;

import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yed {
    public final SharedPreferences a;
    public final tfq b;

    static {
        twu.b("MDX.discoveryUtils");
    }

    public yed(tfq tfqVar, SharedPreferences sharedPreferences) {
        tfqVar.getClass();
        sharedPreferences.getClass();
        this.b = tfqVar;
        this.a = sharedPreferences;
    }

    public final String a() {
        String str;
        WifiInfo wifiInfoB;
        tfq tfqVar = this.b;
        if (tfqVar.j(1)) {
            String[] strArr = {"", "", ""};
            tof tofVar = tfqVar.c;
            NetworkInfo networkInfoA = tofVar.a();
            if (networkInfoA != null && networkInfoA.isConnected()) {
                strArr[0] = networkInfoA.getTypeName();
                strArr[1] = networkInfoA.getSubtypeName();
                if (networkInfoA.getType() == 1 && (wifiInfoB = tofVar.b()) != null) {
                    strArr[2] = wifiInfoB.getSSID();
                }
            }
            str = strArr[2];
        } else {
            str = "<unknown ssid>";
        }
        str.getClass();
        return str;
    }

    public final InetAddress b() {
        WifiInfo wifiInfo = (WifiInfo) agev.h(this.b.c.b()).f();
        if (wifiInfo == null) {
            return null;
        }
        int ipAddress = wifiInfo.getIpAddress();
        return InetAddress.getByAddress(new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >> 24)});
    }

    public final boolean c() {
        return this.b.i();
    }

    public final boolean d(int i) {
        int i2 = i - 1;
        if (i2 == 1 || i2 == 2) {
            tfq tfqVar = this.b;
            return tfqVar.i() && (tfqVar.j(1) || tfqVar.j(9));
        }
        if (i2 == 3 || i2 == 5) {
            return this.b.i();
        }
        throw new IllegalStateException(a.bR(i2, "illegal sessionType: "));
    }

    public final tgt e() {
        InetAddress inetAddressB = b();
        Object obj = null;
        if (inetAddressB == null) {
            return null;
        }
        List listE = this.b.e();
        listE.getClass();
        loop0: for (Object obj2 : listE) {
            tgt tgtVar = (tgt) obj2;
            tgtVar.getClass();
            awsr awsrVar = new awsr(new awss(new awta(new yec(tgtVar.d(), null), 1), true, awwu.b));
            while (awsrVar.hasNext()) {
                if (awrc.c(inetAddressB, (Inet4Address) awsrVar.next())) {
                    obj = obj2;
                    break loop0;
                }
            }
        }
        return (tgt) obj;
    }
}
