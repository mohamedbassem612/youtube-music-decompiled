package defpackage;

import com.google.android.libraries.youtube.media.interfaces.BufferManager;
import com.google.android.libraries.youtube.media.interfaces.MediaCache;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector;
import com.google.android.libraries.youtube.media.interfaces.OnesieVideoData;
import com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$$ExternalSyntheticLambda3;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$$ExternalSyntheticLambda5;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser$Factory$$ExternalSyntheticLambda0;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ytb extends PlatformOnesieCallbacks {
    public final avmm a = new avmm();
    private final PlatformOnesieCallbacks b;

    public ytb(PlatformOnesieCallbacks platformOnesieCallbacks) {
        this.b = platformOnesieCallbacks;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final BufferManager createBufferManager(String str) {
        str.getClass();
        PlatformOnesieCallbacks platformOnesieCallbacks = this.b;
        try {
            yrr yrrVar = ((yqo) platformOnesieCallbacks).a;
            ytf ytfVar = ((yqo) platformOnesieCallbacks).n;
            MediaParser$Factory$$ExternalSyntheticLambda0 mediaParser$Factory$$ExternalSyntheticLambda0 = new MediaParser$Factory$$ExternalSyntheticLambda0();
            dwv dwvVar = new dwv(platformOnesieCallbacks, 4);
            xeu xeuVar = ((yqo) platformOnesieCallbacks).p;
            zjr zjrVar = ((yqo) platformOnesieCallbacks).e;
            abxv abxvVar = ((yqo) platformOnesieCallbacks).s;
            ahey aheyVar = ((yqo) platformOnesieCallbacks).d;
            Optional optionalOfNullable = Optional.ofNullable(yrrVar.j);
            BufferManagerImpl$$ExternalSyntheticLambda3 bufferManagerImpl$$ExternalSyntheticLambda3 = new BufferManagerImpl$$ExternalSyntheticLambda3(str, yrrVar);
            if (true == optionalOfNullable.isPresent()) {
                if (true != bufferManagerImpl$$ExternalSyntheticLambda3.a.equals(bufferManagerImpl$$ExternalSyntheticLambda3.b.h)) {
                    optionalOfNullable = Optional.empty();
                }
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Long.valueOf(Math.max(ahbt.a((Duration) optionalOfNullable.get()), 0L)));
            }
            return new BufferManagerImpl(null, new aae(), new BufferManagerImpl$$ExternalSyntheticLambda5(ytfVar), mediaParser$Factory$$ExternalSyntheticLambda0, ((Long) optionalOfNullable.orElse(0L)).longValue(), 0L, dwvVar, str, null, xeuVar, zjrVar, abxvVar, aheyVar, null, null, false);
        } catch (Throwable th) {
            ((yqo) platformOnesieCallbacks).g(th);
            return null;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final MediaCache createCache(String str) {
        str.getClass();
        PlatformOnesieCallbacks platformOnesieCallbacks = this.b;
        try {
            return ((yqo) platformOnesieCallbacks).i.a(str, ((yqo) platformOnesieCallbacks).e.l.m(44, 45701814L) ? ywn.b : ((yqo) platformOnesieCallbacks).n.a(), null);
        } catch (Throwable th) {
            ((yqo) platformOnesieCallbacks).g(th);
            return null;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void onDecryptedPlayerResponseBytes(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        PlatformOnesieCallbacks platformOnesieCallbacks = this.b;
        try {
            yqq yqqVarG = ((yqo) platformOnesieCallbacks).r.g(byteBuffer);
            if (((yqo) platformOnesieCallbacks).e.l.m(41, 45691318L)) {
                ((yqo) platformOnesieCallbacks).e(yqqVarG);
            } else {
                yno.S(((yqo) platformOnesieCallbacks).q, new xoy(platformOnesieCallbacks, yqqVarG, 16), 0L, ((yqo) platformOnesieCallbacks).n.a(), ((yqo) platformOnesieCallbacks).p, "Failed to deliver player response.");
            }
        } catch (Throwable th) {
            ((yqo) platformOnesieCallbacks).g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void onDecryptedStreamingWatchBytes(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        PlatformOnesieCallbacks platformOnesieCallbacks = this.b;
        try {
            avls avlsVar = ((yqo) platformOnesieCallbacks).m;
            if (avlsVar != null) {
                avlsVar.c(((yqo) platformOnesieCallbacks).r.g(byteBuffer));
            }
        } catch (Throwable th) {
            ((yqo) platformOnesieCallbacks).g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void onOnesieRequestDone(QoeError qoeError) {
        this.a.dispose();
        PlatformOnesieCallbacks platformOnesieCallbacks = this.b;
        try {
            if (((yqo) platformOnesieCallbacks).f) {
                ((yqo) platformOnesieCallbacks).f(qoeError);
            } else {
                yno.S(((yqo) platformOnesieCallbacks).q, new xoy(platformOnesieCallbacks, qoeError, 15, null), 0L, ((yqo) platformOnesieCallbacks).n.a(), ((yqo) platformOnesieCallbacks).p, "Failed to call onOnesieRequestDoneInternal.");
            }
        } catch (Throwable th) {
            ((yqo) platformOnesieCallbacks).g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void setOnesieResponseSelector(String str, OnesieResponseSelector onesieResponseSelector) {
        str.getClass();
        PlatformOnesieCallbacks platformOnesieCallbacks = this.b;
        try {
            yqy yqyVar = ((yqo) platformOnesieCallbacks).g;
            onesieResponseSelector.getClass();
            yqyVar.g(str, new yrf(new ysi(onesieResponseSelector), (yqo) platformOnesieCallbacks, str));
        } catch (Throwable th) {
            ((yqo) platformOnesieCallbacks).g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void setOnesieVideoData(String str, OnesieVideoData onesieVideoData) {
        str.getClass();
        PlatformOnesieCallbacks platformOnesieCallbacks = this.b;
        if (onesieVideoData == null) {
            ((yqo) platformOnesieCallbacks).h(new IOException("OnesieVideoData is null."));
        } else {
            try {
                ((yqo) platformOnesieCallbacks).g.g(str, new yrf(new ysj(onesieVideoData), (yqo) platformOnesieCallbacks, str));
            } catch (Throwable th) {
                ((yqo) platformOnesieCallbacks).g(th);
            }
        }
    }
}
