package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cmb implements cli {
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    @Override // defpackage.cli
    public final clk b(gmj gmjVar) throws Throwable {
        MediaCodec mediaCodecCreateByCodecName;
        try {
            Object obj = gmjVar.f;
            obj.getClass();
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(((clo) obj).b);
            try {
                Object obj2 = gmjVar.c;
                int i = 0;
                if (obj2 == null && ((clo) obj).l && Build.VERSION.SDK_INT >= 35) {
                    i = 8;
                }
                mediaCodecCreateByCodecName.configure((MediaFormat) gmjVar.d, (Surface) obj2, (MediaCrypto) gmjVar.b, i);
                mediaCodecCreateByCodecName.start();
                return new cmc(mediaCodecCreateByCodecName, (mgk) gmjVar.e);
            } catch (IOException e) {
                e = e;
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (IOException | RuntimeException e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }
}
