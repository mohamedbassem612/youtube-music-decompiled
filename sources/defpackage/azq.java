package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class azq {
    static WindowInsets c(View view, WindowInsets windowInsets) {
        int i = bae.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static boolean d(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static void e(ByteBuffer byteBuffer, boolean z) {
        for (aami aamiVar : atz.g(byteBuffer.asReadOnlyBuffer())) {
            if (aamiVar.a == 5) {
                try {
                    aami aamiVarE = aami.e(aamiVar);
                    if (aamiVarE.a == 4) {
                        if (z) {
                            Object obj = aamiVarE.b;
                            byte[] bArr = bvf.a;
                            ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                            if (!bvf.j(byteBuffer2, byteBuffer2.position(), byteBuffer2.limit())) {
                            }
                        }
                        byteBuffer.put(((ByteBuffer) aamiVar.b).position(), (byte) 31);
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }

    public static byte[] f(ByteBuffer byteBuffer) {
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            bArr = null;
            for (aami aamiVar : atz.g(byteBuffer)) {
                if (aamiVar.a == 5) {
                    try {
                        aami aamiVarE = aami.e(aamiVar);
                        if (aamiVarE.a == 4) {
                            arrayList.add(Integer.valueOf(((ByteBuffer) aamiVar.b).position()));
                            ByteBuffer byteBuffer2 = (ByteBuffer) aamiVarE.b;
                            if (!bvf.h(byteBuffer2)) {
                                continue;
                            } else if (bArr != null) {
                                bvx.e("Av1ObuUtil", "Found multiple HAGC metadata OBUs in the same temporal unit. Using the first.");
                            } else {
                                int iPosition = byteBuffer2.position() + bvf.b;
                                int iLimit = byteBuffer2.limit();
                                do {
                                    iLimit--;
                                    if (iLimit < iPosition) {
                                        break;
                                    }
                                } while (byteBuffer2.get(iLimit) == 0);
                                int i = iLimit - iPosition;
                                if (i > 0 && (byteBuffer2.get(iLimit) & 255) == 128) {
                                    byte[] bArr2 = new byte[i];
                                    byteBuffer2.position(iPosition);
                                    byteBuffer2.get(bArr2);
                                    bArr = bArr2;
                                }
                            }
                        } else {
                            continue;
                        }
                    } catch (BufferUnderflowException unused) {
                        continue;
                    }
                }
            }
            break loop0;
        }
        if (bArr == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            byteBuffer.put(((Integer) arrayList.get(i2)).intValue(), (byte) 31);
        }
        return bArr;
    }

    public void a() {
    }

    public void b() {
    }
}
