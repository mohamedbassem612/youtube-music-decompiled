package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TtsSpan;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ackj {
    public static final /* synthetic */ int b = 0;
    static final CharSequence a = " · ";
    private static final CharSequence[] c = new CharSequence[0];
    private static final Spanned d = new SpannedString("");
    private static final agfr e = aguu.al(new xjr(10));

    public static Spanned a(ackh ackhVar) {
        return k(ackhVar.a, ackhVar.b, ackhVar.c, false);
    }

    public static Spanned b(alay alayVar, String str) {
        Spanned spannedK = k(null, alayVar, null, false);
        if (spannedK == null || str == null) {
            return spannedK;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedK.toString());
        spannableStringBuilder.setSpan(new TtsSpan.TextBuilder().setText(str).build(), 0, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }

    public static alay c(String... strArr) {
        aihh aihhVar = (aihh) alay.a.createBuilder();
        for (int i = 0; i < strArr.length; i = 1) {
            String str = strArr[0];
            aihh aihhVar2 = (aihh) alba.a.createBuilder();
            if (str == null) {
                str = "";
            }
            aihhVar2.copyOnWrite();
            alba albaVar = (alba) aihhVar2.instance;
            albaVar.b |= 1;
            albaVar.c = str;
            aihhVar.v(aihhVar2);
        }
        return (alay) aihhVar.build();
    }

    public static alay d(String str) {
        aihh aihhVar = (aihh) alay.a.createBuilder();
        if (str == null) {
            str = "";
        }
        aihhVar.copyOnWrite();
        alay alayVar = (alay) aihhVar.instance;
        alayVar.b |= 1;
        alayVar.d = str;
        return (alay) aihhVar.build();
    }

    public static CharSequence e(alay alayVar) {
        if (alayVar != null) {
            alaz alazVar = alayVar.f;
            if (alazVar == null) {
                alazVar = alaz.a;
            }
            if ((alazVar.b & 1) != 0) {
                alaz alazVar2 = alayVar.f;
                if (alazVar2 == null) {
                    alazVar2 = alaz.a;
                }
                aiqd aiqdVar = alazVar2.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                return aiqdVar.c;
            }
        }
        return null;
    }

    public static CharSequence f(CharSequence charSequence, List list) {
        return g(charSequence, (CharSequence[]) list.toArray(new CharSequence[list.size()]));
    }

    public static CharSequence g(CharSequence charSequence, CharSequence... charSequenceArr) {
        CharSequence charSequenceConcat = "";
        if (charSequenceArr != null && (charSequenceArr.length) > 0) {
            if (charSequence == null) {
                charSequence = a;
            }
            for (CharSequence charSequence2 : charSequenceArr) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequenceConcat = TextUtils.isEmpty(charSequenceConcat) ? charSequence2 : TextUtils.concat(charSequenceConcat, charSequence, charSequence2);
                }
            }
        }
        return charSequenceConcat;
    }

    public static List h(List list) {
        if (list == null || list.isEmpty()) {
            return Arrays.asList(c);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k(null, (alay) it.next(), null, false));
        }
        return arrayList;
    }

    public static boolean i(alay alayVar) {
        Iterator it = alayVar.c.iterator();
        while (it.hasNext()) {
            if ((((alba) it.next()).b & SemanticState.Modal) != 0) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence[] j(alay[] alayVarArr) {
        int length;
        if (alayVarArr == null || (length = alayVarArr.length) == 0) {
            return c;
        }
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < alayVarArr.length; i++) {
            charSequenceArr[i] = k(null, alayVarArr[i], null, false);
        }
        return charSequenceArr;
    }

    public static Spanned k(Context context, alay alayVar, ackf ackfVar, boolean z) {
        Typeface typefaceC;
        int iBe;
        if (alayVar == null) {
            return null;
        }
        if (!alayVar.d.isEmpty()) {
            return z ? new SpannedString(((axg) e.io()).b(alayVar.d)) : new SpannedString(alayVar.d);
        }
        if (alayVar.c.size() == 0) {
            return d;
        }
        if (alayVar.c.size() > 0 && alayVar.c.size() != 0 && alayVar.c.size() <= 1) {
            alba albaVar = (alba) alayVar.c.get(0);
            if (!albaVar.d && !albaVar.e && !albaVar.g && !albaVar.f && !albaVar.h && albaVar.i == 0 && (albaVar.b & SemanticState.Modal) == 0 && ((iBe = a.be(albaVar.k)) == 0 || iBe == 1)) {
                return new SpannedString(z ? ((axg) e.io()).b(((alba) alayVar.c.get(0)).c) : ((alba) alayVar.c.get(0)).c);
            }
        }
        int i = acki.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = 0;
        while (true) {
            int i2 = length;
            for (alba albaVar2 : alayVar.c) {
                if (!albaVar2.c.isEmpty() && !albaVar2.c.isEmpty()) {
                    length += albaVar2.c.length();
                    if (z) {
                        spannableStringBuilder.append((CharSequence) ((axg) e.io()).b(albaVar2.c));
                    } else {
                        spannableStringBuilder.append((CharSequence) albaVar2.c);
                    }
                    int i3 = (albaVar2.d ? 1 : 0) | (true != albaVar2.e ? 0 : 2);
                    if (i3 != 0) {
                        spannableStringBuilder.setSpan(new StyleSpan(i3), i2, length, 33);
                    }
                    if (albaVar2.g) {
                        spannableStringBuilder.setSpan(new acki(), i2, length, 33);
                    }
                    if (albaVar2.f) {
                        spannableStringBuilder.setSpan(new ackd(), i2, length, 33);
                    }
                    if (albaVar2.h) {
                        spannableStringBuilder.setSpan(new acke(), i2, length, 33);
                    }
                    int i4 = albaVar2.i;
                    if (i4 != 0) {
                        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i4), null), i2, length, 33);
                    }
                    if (context != null) {
                        int iBe2 = a.be(albaVar2.k);
                        if (iBe2 == 0) {
                            iBe2 = 1;
                        }
                        switch (iBe2 - 1) {
                            case 1:
                                typefaceC = ackm.YTSANS_MEDIUM.c(context, 0);
                                break;
                            case 2:
                                typefaceC = ackm.ROBOTO_MEDIUM.c(context, 0);
                                break;
                            case 3:
                                typefaceC = ackm.YOUTUBE_SANS_LIGHT.c(context, 0);
                                break;
                            case 4:
                                typefaceC = ackm.YOUTUBE_SANS_REGULAR.c(context, 0);
                                break;
                            case 5:
                                typefaceC = ackm.YOUTUBE_SANS_MEDIUM.c(context, 0);
                                break;
                            case 6:
                                typefaceC = ackm.YOUTUBE_SANS_SEMIBOLD.c(context, 0);
                                break;
                            case 7:
                                typefaceC = ackm.YOUTUBE_SANS_BOLD.c(context, 0);
                                break;
                            case 8:
                                typefaceC = ackm.YOUTUBE_SANS_EXTRABOLD.c(context, 0);
                                break;
                            case 9:
                                typefaceC = ackm.YOUTUBE_SANS_BLACK.c(context, 0);
                                break;
                            case 10:
                            default:
                                typefaceC = null;
                                break;
                            case 11:
                                typefaceC = ackm.ROBOTO_REGULAR.c(context, 0);
                                break;
                        }
                        if (typefaceC != null) {
                            spannableStringBuilder.setSpan(new ackg(typefaceC), i2, length, 33);
                        }
                    }
                    if (ackfVar != null && (albaVar2.b & SemanticState.Modal) != 0) {
                        ajwo ajwoVar = albaVar2.l;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        spannableStringBuilder.setSpan(ackfVar.a(ajwoVar), i2, length, 33);
                    }
                }
            }
            return spannableStringBuilder;
        }
    }
}
