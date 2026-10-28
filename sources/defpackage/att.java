package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class att {
    static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
        return callStyle.setAnswerButtonColorHint(i);
    }

    static Notification.CallStyle e(Notification.CallStyle callStyle, int i) {
        return callStyle.setDeclineButtonColorHint(i);
    }

    static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z) {
        return callStyle.setIsVideo(z);
    }

    static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }

    public static float i(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return bwp.a(f * (f >= 0.0f ? 32767 : 32768), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s >= 0 ? 32767 : 32768);
    }

    public static boolean j(bug bugVar) {
        if (bugVar.b == -1 || bugVar.c == -1) {
            return false;
        }
        int i = bugVar.d;
        return i == 2 || i == 4;
    }
}
