package defpackage;

import android.app.Notification;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aub {
    static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }

    public static List c(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(g(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(g(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void d(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static boolean e(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static long f(cdp cdpVar) {
        if (cdpVar.i() == 1) {
            return (cdpVar.ah() || cdpVar.ag()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    private static List g(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
