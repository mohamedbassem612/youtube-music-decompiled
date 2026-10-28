package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.fingerprint.FingerprintManager;
import android.media.Rating;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ek {
    public final Object a;

    public ek(Context context) {
        Context context2;
        qkh.c(context);
        int i = 1;
        if (kts.a.compareAndSet(false, true)) {
            String strA = auqw.a(context);
            boolean zContains = auty.a.contains(qke.c(strA));
            qkh qkhVarA = qkh.a(context);
            if (qkhVarA == null) {
                qkh.d();
                ahno.O(false);
                ListenableFuture listenableFuture = aher.a;
                context2 = context;
            } else {
                kjc kjcVarE = qkhVarA.e();
                ahey aheyVarB = qkhVarA.b();
                qnf qnfVar = qkhVarA.f;
                context2 = context;
                ((aheo) ahbz.e(aheo.p(qnfVar.d(false)).q(new ukt(qnfVar, zContains, i), aheyVarB), Exception.class, new one(12), aheyVarB)).r(new qmw(kjcVarE, strA, (Executor) aheyVarB, context2, 2), aheyVarB).q(new one(13), aheyVarB);
            }
        } else {
            context2 = context;
        }
        this.a = new kyr((Object) context2, (Object) lqd.i(context2), (byte[]) null);
    }

    public final MediaMetadataCompat a() {
        return new MediaMetadataCompat((Bundle) this.a);
    }

    public final void b(String str, Bitmap bitmap) {
        afv afvVar = MediaMetadataCompat.a;
        if (afvVar.containsKey(str) && ((Integer) afvVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.bT(str, "The ", " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.a).putParcelable(str, bitmap);
    }

    public final void c(String str, long j) {
        afv afvVar = MediaMetadataCompat.a;
        if (afvVar.containsKey(str) && ((Integer) afvVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(a.bT(str, "The ", " key cannot be used to put a long"));
        }
        ((Bundle) this.a).putLong(str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void d(RatingCompat ratingCompat) {
        ?? r6;
        afv afvVar = MediaMetadataCompat.a;
        if (afvVar.containsKey("android.media.metadata.USER_RATING") && ((Integer) afvVar.get("android.media.metadata.USER_RATING")).intValue() != 3) {
            throw new IllegalArgumentException("The android.media.metadata.USER_RATING key cannot be used to put a Rating");
        }
        Object obj = this.a;
        if (ratingCompat.c != null) {
            r6 = ratingCompat.c;
        } else {
            if (ratingCompat.c()) {
                int i = ratingCompat.a;
                float f = -1.0f;
                switch (i) {
                    case 1:
                        boolean z = false;
                        if (i == 1 && ratingCompat.b == 1.0f) {
                            z = true;
                        }
                        ratingCompat.c = Rating.newHeartRating(z);
                        break;
                    case 2:
                        ratingCompat.c = Rating.newThumbRating(ratingCompat.d());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        if ((i == 3 || i == 4 || i == 5) && ratingCompat.c()) {
                            f = ratingCompat.b;
                        }
                        ratingCompat.c = Rating.newStarRating(i, f);
                        break;
                    case 6:
                        if (i == 6 && ratingCompat.c()) {
                            f = ratingCompat.b;
                        }
                        ratingCompat.c = Rating.newPercentageRating(f);
                        break;
                    default:
                        r6 = 0;
                        break;
                }
            } else {
                ratingCompat.c = Rating.newUnratedRating(ratingCompat.a);
            }
            r6 = ratingCompat.c;
        }
        ((Bundle) obj).putParcelable("android.media.metadata.USER_RATING", r6);
    }

    public final void e(String str, String str2) {
        afv afvVar = MediaMetadataCompat.a;
        if (afvVar.containsKey(str) && ((Integer) afvVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.bT(str, "The ", " key cannot be used to put a String"));
        }
        ((Bundle) this.a).putCharSequence(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(String str, final Map map, ktg ktgVar) {
        Object obj = this.a;
        ktv ktvVarC = kyr.c(null);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj2 = ((kyr) obj).a;
        final kwq kwqVar = (kwq) obj2;
        lpa lpaVarF = kwqVar.f(str, ktvVarC);
        loz lozVar = new loz() { // from class: kuf
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.loz
            public final lpa a(Object obj3) {
                kul kulVar = (kul) obj3;
                lpa lpaVarA = kulVar.a(map);
                lpaVarA.l(kwqVar.b, new kbr(kulVar, 7));
                return lpaVarA;
            }
        };
        ?? r11 = kwqVar.b;
        lpa lpaVarD = lpaVarF.d(r11, lozVar);
        lpaVarD.l(r11, new kuh(obj2, jElapsedRealtime, jCurrentTimeMillis, 1));
        kro.m(TimeUnit.MILLISECONDS, "TimeUnit must not be null");
        lqa lqaVar = new lqa((byte[]) null);
        kjc kjcVar = new kjc(lqaVar);
        afkg afkgVar = new afkg(Looper.getMainLooper(), (byte[]) null);
        afkgVar.postDelayed(new lei(kjcVar, 16), 60000L);
        lpaVarD.o(new lpg(afkgVar, kjcVar, lqaVar, 0));
        ((lpa) kjcVar.a).o(new ahsq(obj, ktgVar, 1));
    }

    public final boolean g() {
        FingerprintManager fingerprintManagerB = vz.b((Context) this.a);
        return fingerprintManagerB != null && fingerprintManagerB.hasEnrolledFingerprints();
    }

    public final boolean h() {
        FingerprintManager fingerprintManagerB = vz.b((Context) this.a);
        return fingerprintManagerB != null && fingerprintManagerB.isHardwareDetected();
    }

    public ek(Context context, byte[] bArr) {
        this.a = context;
    }

    public ek(Context context, ComponentName componentName, ei eiVar) {
        this.a = new ej(context, componentName, eiVar);
    }

    public ek() {
        this.a = new Bundle();
    }

    public ek(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.b);
        this.a = bundle;
        fg.d(bundle);
    }
}
