package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cky implements cli {
    public boolean a;
    private final agfr b;
    private final agfr c;

    public cky(int i) {
        ckx ckxVar = new ckx(i, 1);
        ckx ckxVar2 = new ckx(i, 0);
        this.b = ckxVar;
        this.c = ckxVar2;
        this.a = true;
    }

    @Override // defpackage.cli
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ckz b(gmj gmjVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        cll clcVar;
        int i;
        mgk mgkVar;
        Object obj = gmjVar.f;
        ckz ckzVar = null;
        try {
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(((clo) obj).b);
            try {
                if (!this.a || Build.VERSION.SDK_INT < 36) {
                    clcVar = new clc(mediaCodecCreateByCodecName, (HandlerThread) this.c.io());
                    i = 0;
                } else {
                    clcVar = new cmd(mediaCodecCreateByCodecName);
                    i = 4;
                }
                ckz ckzVar2 = new ckz(mediaCodecCreateByCodecName, (HandlerThread) this.b.io(), clcVar, (mgk) gmjVar.e);
                try {
                    Object obj2 = gmjVar.c;
                    if (obj2 == null && ((clo) obj).l && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    Object obj3 = gmjVar.d;
                    Object obj4 = gmjVar.b;
                    cld cldVar = ckzVar2.b;
                    MediaCodec mediaCodec = ckzVar2.a;
                    ahno.O(cldVar.c == null);
                    HandlerThread handlerThread = cldVar.b;
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    mediaCodec.setCallback(cldVar, handler);
                    cldVar.c = handler;
                    mediaCodec.configure((MediaFormat) obj3, (Surface) obj2, (MediaCrypto) obj4, i);
                    ckzVar2.c.e();
                    mediaCodec.start();
                    if (Build.VERSION.SDK_INT >= 35 && (mgkVar = ckzVar2.e) != null) {
                        mgkVar.e(mediaCodec);
                    }
                    ckzVar2.d = 1;
                    return ckzVar2;
                } catch (Exception e) {
                    e = e;
                    ckzVar = ckzVar2;
                    try {
                        if (ckzVar == null) {
                            if (mediaCodecCreateByCodecName != null) {
                                mediaCodecCreateByCodecName.release();
                            }
                            throw e;
                        }
                        ckzVar.i();
                    } catch (RuntimeException e2) {
                        e.addSuppressed(e2);
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodecCreateByCodecName = null;
        }
    }
}
