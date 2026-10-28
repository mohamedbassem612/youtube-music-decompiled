package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import java.util.Arrays;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adsj {
    private static boolean a = false;
    private static final agke b;

    static {
        agjz agjzVar = new agjz(4);
        agjzVar.h(35);
        agjzVar.h(42);
        for (int i = 0; i <= 9; i++) {
            agjzVar.h(Integer.valueOf(i + 48));
        }
        b = agjzVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static CharSequence a(CharSequence charSequence, int i, int i2, float f, int i3) {
        if (a) {
            if (bll.b().a() == 1) {
                charSequence = bll.b().f(charSequence, i, i2, Alert.DURATION_SHOW_INDEFINITELY);
                if ((f != 0.0f || i3 != 0) && (charSequence instanceof Spannable)) {
                    Spannable spannable = (Spannable) charSequence;
                    for (blp blpVar : (blp[]) spannable.getSpans(i, i2, blp.class)) {
                        spannable.setSpan(new adxe(f, i3), spannable.getSpanStart(blpVar), spannable.getSpanEnd(blpVar), 33);
                    }
                }
            }
            return charSequence;
        }
        Log.e("UnicodeEmojiUtils", "Try to use EmojiCompat before EmojiCompat.init() is called.");
        if (f != 0.0f || i3 != 0) {
            Matcher matcher = adsi.a.matcher(charSequence.subSequence(i, i2));
            if (matcher.find()) {
                charSequence = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                matcher.reset();
                while (matcher.find()) {
                    charSequence.setSpan(new adxe(f, i3), matcher.start() + i, matcher.end() + i, 33);
                }
            }
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context) {
        blu bluVar = new blu(context, new awy("Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs));
        bluVar.a();
        bluVar.c(new blt(2000L));
        agke agkeVar = b;
        bluVar.b = true;
        if (agkeVar != null) {
            bluVar.c = new int[((agpi) agkeVar).d];
            int i = 0;
            agqs agqsVarListIterator = agkeVar.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                bluVar.c[i] = ((Integer) agqsVarListIterator.next()).intValue();
                i++;
            }
            Arrays.sort(bluVar.c);
        } else {
            bluVar.c = null;
        }
        bll.e(bluVar);
        a = true;
        bll bllVarB = bll.b();
        bllVarB.h(new adsh(bllVarB));
    }
}
