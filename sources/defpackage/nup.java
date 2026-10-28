package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import java.nio.ByteBuffer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nup {
    public static agev a(atiq atiqVar) {
        int iAS = atiqVar.aS();
        for (int i = 0; i < iAS; i++) {
            ativ ativVarAY = atiqVar.aY(i);
            long j = ativVarAY.c;
            byte bPeekByte = Memory.peekByte(j + 20);
            byte bPeekByte2 = Memory.peekByte(j + 21);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 2) {
                if (ativVarAY.h == null) {
                    long j2 = ativVarAY.c;
                    byte bPeekByte3 = Memory.peekByte(20 + j2);
                    byte bPeekByte4 = Memory.peekByte(j2 + 21);
                    byte b2 = true != z ? bPeekByte4 : bPeekByte3;
                    if (true == z) {
                        bPeekByte3 = bPeekByte4;
                    }
                    if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 2) {
                        ativVarAY.h = ativVarAY.cr(ativ.f.b);
                    } else {
                        ativVarAY.h = ByteBuffer.allocate(0);
                    }
                }
                ByteBuffer byteBufferAsReadOnlyBuffer = ativVarAY.h.asReadOnlyBuffer();
                byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.remaining()];
                byteBufferAsReadOnlyBuffer.get(bArr);
                return agev.i(bArr);
            }
        }
        return agdf.a;
    }
}
