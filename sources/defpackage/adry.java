package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.ScaleXSpan;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adry extends adsc {
    private final aduv f;

    public adry(Context context, aduv aduvVar, adsa adsaVar, boolean z, adsd adsdVar, boolean z2) {
        super(context, adsaVar, z, adsdVar, z2);
        aduvVar.getClass();
        this.f = aduvVar;
    }

    private final void g(String str, StringBuilder sb) {
        if (!this.c || sb == null) {
            return;
        }
        sb.append(str);
    }

    public final void a(String str, aqmh aqmhVar, float f, Object obj, int i, SpannableStringBuilder spannableStringBuilder, StringBuilder sb) {
        e(obj, i, spannableStringBuilder);
        adrw adrwVar = new adrw();
        adrwVar.a = obj;
        adrwVar.b = i;
        int length = spannableStringBuilder.length();
        adrwVar.c = length;
        adrwVar.d = length + str.length();
        adrwVar.e = f;
        spannableStringBuilder.append((CharSequence) str);
        g(c(aqmhVar), sb);
        g(" ", sb);
        this.e.a(adrwVar, aqmhVar, Math.round(f), this);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final void b(SpannableStringBuilder spannableStringBuilder, StringBuilder sb, List list, float f, Object obj, int i, boolean z) {
        Object obj2;
        Object obj3 = obj;
        int i2 = i;
        e(obj3, i2, spannableStringBuilder);
        if (list == null || list.isEmpty()) {
            return;
        }
        Context context = this.a;
        float dimension = context.getResources().getDimension(R.dimen.badge_height);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            adrx adrxVar = (adrx) it.next();
            if (!z || ((obj2 = adrxVar.b) != aliz.VERIFIED && obj2 != aliz.OWNER)) {
                if (f != 0.0f) {
                    spannableStringBuilder.append(" ");
                    if (f != 1.0f) {
                        spannableStringBuilder.setSpan(new ScaleXSpan(f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                }
                Object obj4 = adrxVar.a;
                if (obj4 != null) {
                    a(" ", (aqmh) obj4, dimension, obj3, i2, spannableStringBuilder, sb);
                } else {
                    Object obj5 = adrxVar.b;
                    if (obj5 != aliz.UNKNOWN) {
                        int iA = this.f.a((aliz) obj5);
                        if (iA != 0) {
                            Drawable drawableMutate = context.getDrawable(iA).mutate();
                            int intrinsicHeight = drawableMutate.getIntrinsicHeight();
                            int intrinsicWidth = drawableMutate.getIntrinsicWidth();
                            float f2 = adrxVar.b == aliz.MODERATOR ? 0.875f * dimension : dimension;
                            if (intrinsicHeight <= 0 || intrinsicWidth <= 0) {
                                drawableMutate.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                            } else {
                                drawableMutate.setBounds(0, 0, Math.round(intrinsicWidth * (f2 / intrinsicHeight)), Math.round(f2));
                            }
                            Object obj6 = adrxVar.d;
                            if (obj6 != null) {
                                drawableMutate.setTint(((Integer) obj6).intValue());
                            }
                            Object adsbVar = this.b ? new adsb(drawableMutate) : new ImageSpan(drawableMutate);
                            spannableStringBuilder.append(" ");
                            spannableStringBuilder.setSpan(adsbVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        }
                        if (!TextUtils.isEmpty(adrxVar.c)) {
                            g((String) adrxVar.c, sb);
                            g(" ", sb);
                        }
                    }
                }
                obj3 = obj;
                i2 = i;
            }
        }
    }
}
