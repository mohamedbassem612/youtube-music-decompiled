package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import app.rive.semantics.SemanticState;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nsi {
    public static /* synthetic */ String a(int i) {
        if (i != 1) {
            return i != 2 ? "DOWNLOADED_GROUP" : "IN_PROGRESS_FUTURE";
        }
        return "PENDING_GROUP";
    }

    public static final int b(byte[] bArr, int i) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, i);
        return (int) crc32.getValue();
    }

    public static final void c(InputStream inputStream, byte[] bArr, int i, File file) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException("Premature end of file reading " + file + " at " + i2 + '/' + i);
            }
            i2 += i3;
        }
    }

    public static final boolean d(Context context) {
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return false;
        }
        try {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            historicalProcessStartReasons.getClass();
            if (historicalProcessStartReasons.isEmpty()) {
                return false;
            }
            int reason = qe$$ExternalSyntheticApiModelOutline1.m(historicalProcessStartReasons.get(0)).getReason();
            return reason == 0 || reason == 1 || reason == 2 || reason == 3 || reason == 4 || reason == 5 || reason == 9 || reason == 10;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:233:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:237:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:239:0x02e5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0202, code lost:
    
        if (r0.equals("com.google.android.gms.phenotype.UPDATE") != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x020c, code lost:
    
        if (r0.equals("android.intent.action.MEDIA_BUTTON") != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0216, code lost:
    
        if (r0.equals("android.intent.action.MY_PACKAGE_REPLACED") != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x022b, code lost:
    
        if (r0.equals("com.google.android.youtube.action.developer.COMMAND") != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0235, code lost:
    
        if (r0.equals("android.intent.action.CONFIG_ENDPOINT") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x023f, code lost:
    
        if (r0.equals("android.intent.action.MY_PACKAGE_SUSPENDED") != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x025e, code lost:
    
        if (r0.equals("androidx.profileinstaller.action.BENCHMARK_OPERATION") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0267, code lost:
    
        if (r0.equals("com.google.android.c2dm.intent.RECEIVE") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0271, code lost:
    
        if (r0.equals("androidx.profileinstaller.action.INSTALL_PROFILE") == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0285, code lost:
    
        if (r0.equals("android.intent.action.LOCALE_CHANGED") != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x029a, code lost:
    
        if (r0.equals("android.accounts.LOGIN_ACCOUNTS_CHANGED") != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02b9, code lost:
    
        if (r0.equals("androidx.profileinstaller.action.SAVE_PROFILE") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02c3, code lost:
    
        if (r0.equals("android.accounts.action.ACCOUNT_REMOVED") != false) goto L227;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(android.content.Intent r17) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsi.e(android.content.Intent):int");
    }

    public static tme f(tmf tmfVar) {
        int iA = tmfVar.a();
        if (iA == 0) {
            return null;
        }
        return tme.a(iA);
    }

    @Deprecated
    public static avlr g(tgg tggVar, tns tnsVar) {
        return avlr.o(new tgx(tggVar, tnsVar, 0));
    }

    public static avlr h(tgg tggVar, tns tnsVar) {
        return avlr.o(new tgx(tggVar, tnsVar, 2));
    }

    public static final aigm i(Iterable iterable) {
        iterable.getClass();
        ByteBuffer byteBuffer = (ByteBuffer) atqq.ae(iterable);
        return (byteBuffer == null || !byteBuffer.hasArray()) ? aigm.N(new tfa(iterable), SemanticState.Obscured) : aigm.O(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
    }

    public static final Iterable j(Iterable iterable, int i, int i2) {
        if (i2 == 0 || atqq.Y(iterable) == null) {
            return awno.a;
        }
        awoa awoaVar = new awoa(10);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            int iRemaining = byteBuffer.remaining();
            if (iRemaining > i) {
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.getClass();
                byteBufferDuplicate.position(byteBufferDuplicate.position() + i);
                byteBufferDuplicate.limit(Math.min(byteBufferDuplicate.limit(), byteBufferDuplicate.position() + i2));
                awoaVar.add(byteBufferDuplicate);
                i2 -= byteBufferDuplicate.remaining();
                if (i2 == 0) {
                    break;
                }
                i = 0;
            } else {
                i -= iRemaining;
            }
        }
        return awoaVar.f();
    }

    public static final int k(Iterable iterable) {
        Iterator it = iterable.iterator();
        int iRemaining = 0;
        while (it.hasNext()) {
            iRemaining += ((ByteBuffer) it.next()).remaining();
        }
        return iRemaining;
    }

    public static /* synthetic */ Object l(tdz tdzVar) {
        tdzVar.jz();
        return awmy.a;
    }

    public static void m(tdk tdkVar) {
        tdkVar.onStart(tdk.f);
    }

    public static void n(tdk tdkVar) {
        tdkVar.onStop(tdk.f);
    }
}
