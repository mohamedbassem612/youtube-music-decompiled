package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qik {
    public static volatile agev a;
    private static volatile agev b;

    public static agev a() {
        agev agfaVar;
        agev agfaVar2;
        long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        long j = 0;
        agev agfaVar3 = jSysconf > 0 ? new agfa(Long.valueOf(jSysconf)) : agdf.a;
        if (agfaVar3.g()) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            byte[] bArr = new byte[440];
            boolean z = false;
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                    try {
                        int i = fileInputStream.read(bArr);
                        fileInputStream.close();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
                        byteBufferWrap.getClass();
                        agfaVar = new agfa(byteBufferWrap);
                        if (agfaVar.g()) {
                            Object objC = agfaVar.c();
                            long jLongValue = ((Long) agfaVar3.c()).longValue();
                            while (true) {
                                ByteBuffer byteBuffer = (ByteBuffer) objC;
                                if (byteBuffer.remaining() > 17) {
                                    if (byteBuffer.get() == 40) {
                                        int i2 = 16;
                                        while (true) {
                                            if (i2 >= 0) {
                                                if (byteBuffer.get(byteBuffer.position() + i2) == 41) {
                                                    byteBuffer.position(byteBuffer.position() + i2 + 1);
                                                    if (byteBuffer.get() != 32 || !b(byteBuffer, 1) || !b(byteBuffer, 18)) {
                                                        break;
                                                    }
                                                    while (true) {
                                                        if (byteBuffer.hasRemaining()) {
                                                            byte b2 = byteBuffer.get();
                                                            if (b2 == 32) {
                                                                if (z) {
                                                                    agfaVar2 = new agfa(Long.valueOf(j));
                                                                    break;
                                                                }
                                                            } else if (b2 >= 48 && b2 <= 57 && j <= 922337203685477580L) {
                                                                j = (j * 10) + ((long) (b2 - 48));
                                                                z = true;
                                                            }
                                                        }
                                                        agfaVar2 = agdf.a;
                                                        break;
                                                    }
                                                }
                                                i2--;
                                            }
                                        }
                                    }
                                }
                                agfaVar2 = agdf.a;
                                break;
                            }
                            return !agfaVar2.g() ? agdf.a : new agfa(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) agfaVar2.c()).longValue()) / jLongValue));
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    agfaVar = agdf.a;
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        }
        return agdf.a;
    }

    private static boolean b(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i > 0) {
                if (byteBuffer.get() == 32) {
                    i--;
                }
            }
        }
        return i == 0;
    }
}
