package androidx.media3.decoder.opus;

import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import defpackage.bwp;
import defpackage.caj;
import defpackage.cak;
import defpackage.can;
import defpackage.cap;
import defpackage.caq;
import defpackage.cas;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class OpusDecoder extends cas {
    public final boolean a;
    public final int b;
    private final CryptoConfig c;
    private final int d;
    private final int e;
    private final long f;
    private int g;

    public OpusDecoder(int i, List list, CryptoConfig cryptoConfig, boolean z) throws OpusDecoderException {
        int i2;
        int i3;
        super(new DecoderInputBuffer[16], new SimpleDecoderOutputBuffer[16]);
        if (!OpusLibrary.a()) {
            throw new OpusDecoderException("Failed to load decoder native libraries");
        }
        this.c = cryptoConfig;
        if (cryptoConfig != null && !OpusLibrary.opusIsSecureDecodeSupported()) {
            throw new OpusDecoderException("Opus decoder does not support secure decode");
        }
        int size = list.size();
        int i4 = 1;
        if (size != 1) {
            if (size != 3) {
                throw new OpusDecoderException("Invalid initialization data size");
            }
            if (((byte[]) list.get(1)).length != 8 || ((byte[]) list.get(2)).length != 8) {
                throw new OpusDecoderException("Invalid pre-skip or seek pre-roll");
            }
        }
        if (list.size() == 3) {
            i2 = (int) ((ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000);
        } else {
            byte[] bArr = (byte[]) list.get(0);
            i2 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
        }
        this.d = i2;
        this.e = list.size() == 3 ? (int) ((ByteBuffer.wrap((byte[]) list.get(2)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000) : 3840;
        this.g = i2;
        byte[] bArr2 = (byte[]) list.get(0);
        int length = bArr2.length;
        if (length < 19) {
            throw new OpusDecoderException("Invalid header length");
        }
        int i5 = bArr2[9] & 255;
        this.b = i5;
        int i6 = bArr2[16] & 255;
        int i7 = bArr2[17] & 255;
        byte[] bArr3 = new byte[Math.max(i5, 8)];
        if (bArr2[18] == 0) {
            if (i5 > 2) {
                throw new OpusDecoderException("Invalid header, missing stream map");
            }
            int i8 = i5 == 2 ? 1 : 0;
            bArr3[0] = 0;
            bArr3[1] = 1;
            i3 = i8;
        } else {
            if (length < i5 + 21) {
                throw new OpusDecoderException("Invalid header length");
            }
            i4 = bArr2[19] & 255;
            int i9 = bArr2[20] & 255;
            System.arraycopy(bArr2, 21, bArr3, 0, i5);
            i3 = i9;
        }
        long jOpusInit = opusInit(48000, i5, i4, i3, (short) (i6 | (i7 << 8)), bArr3);
        this.f = jOpusInit;
        if (jOpusInit == 0) {
            throw new OpusDecoderException("Failed to initialize decoder");
        }
        i(i);
        this.a = z;
        if (z) {
            opusSetFloatOutput(jOpusInit);
        }
    }

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    private native int opusSecureDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i2, CryptoConfig cryptoConfig, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput(long j);

    @Override // defpackage.cas
    protected final /* synthetic */ can a(Throwable th) {
        return new OpusDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.cas
    protected final /* bridge */ /* synthetic */ can b(DecoderInputBuffer decoderInputBuffer, caq caqVar, boolean z) {
        DecoderInputBuffer decoderInputBuffer2;
        OpusDecoder opusDecoder;
        int iOpusDecode;
        int i;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) caqVar;
        if (z) {
            opusReset(this.f);
            this.g = decoderInputBuffer.timeUs == 0 ? this.d : this.e;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        int i2 = bwp.a;
        cak cakVar = decoderInputBuffer.cryptoInfo;
        boolean zIsEncrypted = decoderInputBuffer.isEncrypted();
        long j = this.f;
        if (zIsEncrypted) {
            long j2 = decoderInputBuffer.timeUs;
            int iLimit = byteBuffer.limit();
            CryptoConfig cryptoConfig = this.c;
            int i3 = cakVar.c;
            byte[] bArr = cakVar.b;
            bArr.getClass();
            byte[] bArr2 = cakVar.a;
            bArr2.getClass();
            iOpusDecode = opusSecureDecode(j, j2, byteBuffer, iLimit, simpleDecoderOutputBuffer, 48000, cryptoConfig, i3, bArr, bArr2, cakVar.f, cakVar.d, cakVar.e);
            decoderInputBuffer2 = decoderInputBuffer;
            opusDecoder = this;
        } else {
            decoderInputBuffer2 = decoderInputBuffer;
            opusDecoder = this;
            iOpusDecode = opusDecoder.opusDecode(j, decoderInputBuffer.timeUs, byteBuffer, byteBuffer.limit(), simpleDecoderOutputBuffer);
        }
        if (iOpusDecode < 0) {
            long j3 = opusDecoder.f;
            if (iOpusDecode != -2) {
                simpleDecoderOutputBuffer = simpleDecoderOutputBuffer;
                return new OpusDecoderException("Decode error: ".concat(String.valueOf(opusDecoder.opusGetErrorMessage(j3))));
            }
            simpleDecoderOutputBuffer = simpleDecoderOutputBuffer;
            String strValueOf = String.valueOf(opusDecoder.opusGetErrorMessage(j3));
            opusDecoder.opusGetErrorCode(j3);
            String strConcat = "Drm error: ".concat(strValueOf);
            return new OpusDecoderException(strConcat, new caj(strConcat));
        }
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.data;
        int i4 = 0;
        byteBuffer2.position(0);
        byteBuffer2.limit(iOpusDecode);
        int i5 = opusDecoder.g;
        if (i5 > 0) {
            int i6 = opusDecoder.b;
            if (true != opusDecoder.a) {
                simpleDecoderOutputBuffer = simpleDecoderOutputBuffer;
                i = 2;
            } else {
                simpleDecoderOutputBuffer = simpleDecoderOutputBuffer;
                i = 4;
            }
            int i7 = i6 * i;
            int i8 = i5 * i7;
            if (iOpusDecode <= i8) {
                opusDecoder.g = i5 - (iOpusDecode / i7);
                simpleDecoderOutputBuffer.shouldBeSkipped = true;
                byteBuffer2.position(iOpusDecode);
            } else {
                opusDecoder.g = 0;
                byteBuffer2.position(i8);
            }
        }
        simpleDecoderOutputBuffer = simpleDecoderOutputBuffer;
        if (decoderInputBuffer2.hasSupplementalData()) {
            ByteBuffer byteBuffer3 = decoderInputBuffer2.supplementalData;
            if (byteBuffer3 != null && byteBuffer3.remaining() == 8) {
                long j4 = byteBuffer3.order(ByteOrder.LITTLE_ENDIAN).getLong();
                if (j4 >= 0) {
                    i4 = (int) ((j4 * 48000) / 1000000000);
                }
            }
            if (i4 > 0) {
                int i9 = opusDecoder.b;
                boolean z2 = opusDecoder.a;
                int iRemaining = byteBuffer2.remaining();
                int i10 = i4 * i9 * (true == z2 ? 4 : 2);
                if (iRemaining <= i10) {
                    simpleDecoderOutputBuffer.shouldBeSkipped = true;
                    byteBuffer2.limit(byteBuffer2.position());
                } else {
                    byteBuffer2.limit(iOpusDecode - i10);
                }
            }
        }
        return null;
    }

    @Override // defpackage.cas
    protected final DecoderInputBuffer c() {
        return new DecoderInputBuffer(2);
    }

    @Override // defpackage.cas
    protected final /* bridge */ /* synthetic */ caq e() {
        return new SimpleDecoderOutputBuffer(new cap() { // from class: androidx.media3.decoder.opus.OpusDecoder$$ExternalSyntheticLambda0
            @Override // defpackage.cap
            public final void a(caq caqVar) {
                this.a.h((SimpleDecoderOutputBuffer) caqVar);
            }
        });
    }

    @Override // defpackage.cam
    public final String getName() {
        return "libopus".concat(String.valueOf(OpusLibrary.a() ? OpusLibrary.opusGetVersion() : null));
    }

    @Override // defpackage.cas, defpackage.cam
    public final void release() {
        super.release();
        opusClose(this.f);
    }
}
