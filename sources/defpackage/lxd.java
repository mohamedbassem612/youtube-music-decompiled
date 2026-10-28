package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lxd {
    private static volatile int a = 100;
    public static final /* synthetic */ int f = 0;

    public lxd() {
        int i = a;
    }

    public static lxd d(InputStream inputStream) {
        return inputStream == null ? e(lyf.a, 0) : new lxc(inputStream);
    }

    static lxd e(byte[] bArr, int i) {
        lxb lxbVar = new lxb(bArr, 0, null);
        try {
            int i2 = lxbVar.d;
            if (i2 < 0) {
                if (Alert.DURATION_SHOW_INDEFINITELY - i2 < 0) {
                    throw new lyh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                }
                i2 = Integer.MAX_VALUE;
            }
            if (i2 > lxbVar.e) {
                throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            lxbVar.e = i2;
            lxbVar.c = i2 <= 0 ? i2 : 0;
            return lxbVar;
        } catch (lyh e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract boolean a();

    public abstract byte[] b();
}
