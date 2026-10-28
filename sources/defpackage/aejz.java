package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejz {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder");
    public final mbc b;
    public boolean c;
    public boolean d;
    public aejy e;
    int f;
    public final aedi g;

    public aejz(mbc mbcVar) {
        aedi aediVar = new aedi();
        this.d = false;
        this.f = 1;
        this.b = mbcVar;
        this.g = aediVar;
    }

    public static MediaCodecInfo a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (ahno.ag(str2, str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    public static String d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return "";
        }
        if (i2 != 1) {
            return i2 != 2 ? "audio/opus" : "audio/flac";
        }
        return "audio/amr-wb";
    }

    public static int f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 3;
        }
        switch (i2) {
            case 6600:
            case 8850:
            case 12650:
            case 14250:
            case 15850:
            case 18250:
            case 19850:
            case 23050:
            case 23850:
                return 2;
            case 12000:
            case 16000:
            case 24000:
                return 4;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final FileDescriptor b() {
        if (!this.d) {
            return null;
        }
        aejy aejyVar = this.e;
        aejyVar.getClass();
        return aejyVar.b();
    }

    public final void c() {
        if (!(this.e instanceof aejx) || Build.VERSION.SDK_INT < 30) {
            return;
        }
        ((aejx) this.e).f();
    }

    public final aigj e(byte[] bArr, int i) {
        if (!this.d) {
            throw new IllegalStateException("You forgot to call init()!");
        }
        if (this.c) {
            throw new IllegalStateException("Cannot process more bytes after flushing.");
        }
        aejy aejyVar = this.e;
        aejyVar.getClass();
        return aejyVar.d(bArr, i);
    }
}
