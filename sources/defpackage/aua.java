package defpackage;

import android.app.Notification;
import android.app.Person;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aua {
    static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }

    static avc c(Bundle bundle, String str) {
        Parcelable parcelable = bundle.getParcelable("android.messagingUser");
        if (fd$$ExternalSyntheticApiModelOutline0.m785m((Object) parcelable)) {
            return ats.c(fd$$ExternalSyntheticApiModelOutline0.m((Object) parcelable));
        }
        return null;
    }

    public static void d(bye byeVar) {
        if (byeVar != null) {
            try {
                byeVar.f();
            } catch (IOException unused) {
            }
        }
    }

    public static int e(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static boolean f(int i, bwb bwbVar, boolean z) throws bsz {
        if (bwbVar.d() < 7) {
            if (z) {
                return false;
            }
            throw new bsz("too short header: " + bwbVar.d(), null, true, 1);
        }
        if (bwbVar.n() != i) {
            if (z) {
                return false;
            }
            throw new bsz("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null, true, 1);
        }
        if (bwbVar.n() == 118 && bwbVar.n() == 111 && bwbVar.n() == 114 && bwbVar.n() == 98 && bwbVar.n() == 105 && bwbVar.n() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new bsz("expected characters 'vorbis'", null, true, 1);
    }

    public static zf g(bwb bwbVar, boolean z, boolean z2) throws bsz {
        if (z) {
            f(3, bwbVar, false);
        }
        bwbVar.C((int) bwbVar.u());
        long jU = bwbVar.u();
        String[] strArr = new String[(int) jU];
        for (int i = 0; i < jU; i++) {
            strArr[i] = bwbVar.C((int) bwbVar.u());
        }
        if (z2 && (bwbVar.n() & 1) == 0) {
            throw new bsz("framing bit expected to be set", null, true, 1);
        }
        return new zf(strArr);
    }
}
