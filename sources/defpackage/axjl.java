package defpackage;

import java.util.regex.Pattern;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axjl {
    public static final Pattern a = Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");
    public static final Pattern b = Pattern.compile("^(?:Caused by: )?java\\.lang\\.(?:ClassNotFoundException|NoClassDefFoundError):|(?:[\"' ]/(?:apex|data|mnt|proc|sdcard|storage|system))/");
    public static final String[] c;
    public static final String[] d;

    static {
        Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
        c = new String[]{"org.chromium.", "com.google.", "com.chrome."};
        d = new String[]{"android.", "c2.", "com.android.", "dalvik.", "java.", "javax.", "omx.", "OMX.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull.", "System."};
    }

    public static boolean a(String str) {
        try {
            Class.forName(str, false, JniAndroid.a.getClassLoader());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
