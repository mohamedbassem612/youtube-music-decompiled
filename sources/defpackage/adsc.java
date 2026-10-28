package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class adsc {
    final Context a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    final adsa e;
    private SpannableStringBuilder f;
    private final adsd g;
    private Object h = null;
    private int i;

    public adsc(Context context, adsa adsaVar, boolean z, adsd adsdVar, boolean z2) {
        context.getClass();
        this.a = context;
        adsaVar.getClass();
        this.e = adsaVar;
        this.b = z;
        adsdVar.getClass();
        this.g = adsdVar;
        this.d = z2;
        this.c = twb.c(context);
    }

    public static String c(aqmh aqmhVar) {
        if (aqmhVar != null && (aqmhVar.b & 8) != 0) {
            aiqe aiqeVar = aqmhVar.e;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            if ((aiqeVar.b & 1) != 0) {
                aiqe aiqeVar2 = aqmhVar.e;
                if (aiqeVar2 == null) {
                    aiqeVar2 = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar2.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                if ((aiqdVar.b & 2) != 0) {
                    aiqe aiqeVar3 = aqmhVar.e;
                    if (aiqeVar3 == null) {
                        aiqeVar3 = aiqe.a;
                    }
                    aiqd aiqdVar2 = aiqeVar3.c;
                    if (aiqdVar2 == null) {
                        aiqdVar2 = aiqd.a;
                    }
                    return aiqdVar2.c;
                }
            }
        }
        return "";
    }

    public final void d(adrw adrwVar, Bitmap bitmap) {
        int i;
        ImageSpan imageSpan;
        adsb adsbVar;
        taq.d();
        if (bitmap != null) {
            Object obj = adrwVar.a;
            if ((obj == null || obj.equals(this.h)) && (i = adrwVar.b) != 0 && i == this.i) {
                boolean z = this.b;
                Context context = this.a;
                if (z) {
                    adsbVar = new adsb(context, bitmap);
                    if (this.d) {
                        imageSpan = adsbVar;
                        adsbVar.a = context.getResources().getDimensionPixelOffset(R.dimen.emoji_padding);
                        imageSpan = adsbVar;
                    }
                } else {
                    imageSpan = new ImageSpan(context, bitmap);
                }
                imageSpan = adsbVar;
                float f = adrwVar.e;
                Rect bounds = imageSpan.getDrawable().getBounds();
                bounds.right = bounds.left + ((int) (((bounds.right - bounds.left) * f) / (bounds.bottom - bounds.top)));
                bounds.bottom = bounds.top + ((int) f);
                imageSpan.getDrawable().setBounds(bounds);
                SpannableStringBuilder spannableStringBuilder = this.f;
                if (spannableStringBuilder != null) {
                    int length = spannableStringBuilder.length();
                    int i2 = adrwVar.d;
                    if (length >= i2) {
                        this.f.setSpan(imageSpan, adrwVar.c, i2, 33);
                    }
                }
                this.g.a(this.f, adrwVar.b);
            }
        }
    }

    public final void e(Object obj, int i, SpannableStringBuilder spannableStringBuilder) {
        this.h = obj;
        this.i = i;
        this.f = spannableStringBuilder;
    }

    public final void f(alay alayVar, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, StringBuilder sb, Object obj, int i) {
        int length;
        float dimension = this.a.getResources().getDimension(R.dimen.emoji_height);
        if (alayVar == null || alayVar.c.size() <= 0) {
            return;
        }
        e(obj, i, spannableStringBuilder);
        int iMax = Math.max(spannableStringBuilder.length() - charSequence.length(), 0);
        int iMax2 = Math.max(sb.length() - charSequence.length(), 0);
        for (alba albaVar : alayVar.c) {
            aihl aihlVar = aktj.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            albaVar.c(aihlVarCheckIsLite);
            if (albaVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                albaVar.c(aihlVarCheckIsLite2);
                Object objK = albaVar.j.k(aihlVarCheckIsLite2.d);
                aktj aktjVar = (aktj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                albaVar.c(aihlVarCheckIsLite3);
                Object objK2 = albaVar.j.k(aihlVarCheckIsLite3.d);
                aqmh aqmhVar = ((aktj) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).f;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
                if ((aktjVar.c & 4) != 0 && aqmhVar.c.size() > 0) {
                    spannableStringBuilder.delete(iMax, albaVar.c.length() + iMax);
                    spannableStringBuilder.insert(iMax, "□");
                    adrw adrwVar = new adrw();
                    adrwVar.a = obj;
                    adrwVar.b = i;
                    adrwVar.e = dimension;
                    adrwVar.c = iMax;
                    iMax++;
                    adrwVar.d = iMax;
                    this.e.a(adrwVar, aqmhVar, Math.round(dimension), this);
                    if (this.c) {
                        String strC = c(aqmhVar);
                        if (!TextUtils.isEmpty(strC)) {
                            sb.insert(iMax2, " " + strC + ' ');
                            length = strC.length() + 2;
                            iMax2 += length;
                        }
                    }
                }
            }
            if (!albaVar.c.isEmpty()) {
                length = albaVar.c.length();
                iMax += length;
                if (this.c) {
                    iMax2 += length;
                }
            }
        }
    }
}
