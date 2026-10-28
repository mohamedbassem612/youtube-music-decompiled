package defpackage;

import android.app.Notification;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aty {
    static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    static Notification.MessagingStyle b(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }

    public static long d(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public static String e(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String f(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf != -1 ? str.substring(iIndexOf + 1) : str;
    }

    public static boolean g(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return g(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean i(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return i(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static int k(int i) {
        if (i == 0) {
            return -1;
        }
        return i << 2;
    }

    public static boolean l(int i, int i2) {
        if ((i >> 18) == 0) {
            return i == 0 || Integer.bitCount(i) == i2;
        }
        return false;
    }
}
