package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wys extends aeaj {
    private final ArrayList i;

    public wys(Context context, axlj axljVar, advb advbVar, aeiv aeivVar, aduv aduvVar, adsa adsaVar, xgv xgvVar) {
        super(context, advbVar, aeivVar, aduvVar, adsaVar, new wyr(axljVar, xgvVar, 0));
        this.i = new ArrayList();
    }

    private final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aihf aihfVarCreateBuilder = amqx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amqx amqxVar = (amqx) aihfVarCreateBuilder.instance;
        str.getClass();
        amqxVar.b = 2;
        amqxVar.c = str;
        this.i.add((amqx) aihfVarCreateBuilder.build());
    }

    private final void h(String str) {
        aihf aihfVarCreateBuilder = amqx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amqx amqxVar = (amqx) aihfVarCreateBuilder.instance;
        str.getClass();
        amqxVar.b = 1;
        amqxVar.c = str;
        this.i.add((amqx) aihfVarCreateBuilder.build());
    }

    private final void i(Editable editable, int i, int i2) {
        aeiv aeivVar;
        Pattern patternI;
        char[] cArr = new char[Math.abs(i2 - i)];
        boolean z = false;
        editable.getChars(i, i2, cArr, 0);
        String strTrim = new String(cArr).trim();
        if (TextUtils.isEmpty(strTrim) || (patternI = (aeivVar = this.h).i()) == null) {
            return;
        }
        Matcher matcher = patternI.matcher(strTrim);
        int length = strTrim.length();
        int iStart = 0;
        while (matcher.find()) {
            if (matcher.start() > iStart) {
                aihf aihfVarCreateBuilder = amqx.a.createBuilder();
                if (z) {
                    String strJ = j(strTrim, length, matcher.start());
                    aihfVarCreateBuilder.copyOnWrite();
                    amqx amqxVar = (amqx) aihfVarCreateBuilder.instance;
                    strJ.getClass();
                    amqxVar.b = 1;
                    amqxVar.c = strJ;
                } else {
                    String strJ2 = j(strTrim, iStart, matcher.start());
                    aihfVarCreateBuilder.copyOnWrite();
                    amqx amqxVar2 = (amqx) aihfVarCreateBuilder.instance;
                    strJ2.getClass();
                    amqxVar2.b = 1;
                    amqxVar2.c = strJ2;
                }
                this.i.add((amqx) aihfVarCreateBuilder.build());
                iStart = matcher.start();
            }
            g(aeivVar.g(matcher.group()));
            length = matcher.end();
            z = true;
        }
        if (!z) {
            h(strTrim);
        } else if (length < strTrim.length()) {
            h(j(strTrim, length, strTrim.length()));
        }
    }

    private static final String j(String str, int i, int i2) {
        return i < i2 ? str.substring(i, i2) : "";
    }

    public final amqw a(Editable editable) {
        aihf aihfVarCreateBuilder = amqw.a.createBuilder();
        View view = this.f;
        if (view != null) {
            int i = bac.a;
            if (view.getLayoutDirection() == 1) {
                aihfVarCreateBuilder.copyOnWrite();
                amqw amqwVar = (amqw) aihfVarCreateBuilder.instance;
                amqwVar.b |= 1;
                amqwVar.d = true;
            }
        }
        ArrayList arrayList = this.i;
        arrayList.clear();
        ImageSpan[] imageSpanArr = (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class);
        aeiv aeivVar = this.h;
        if (!aeivVar.k() || (imageSpanArr.length) <= 0) {
            i(editable, 0, editable.length());
        } else {
            Arrays.sort(imageSpanArr, new fui(editable, 8, null));
            int spanEnd = 0;
            for (ImageSpan imageSpan : imageSpanArr) {
                int spanStart = editable.getSpanStart(imageSpan);
                if (spanStart > spanEnd) {
                    i(editable, spanEnd, spanStart);
                }
                spanEnd = editable.getSpanEnd(imageSpan);
                if (spanEnd > spanStart) {
                    int i2 = spanEnd - spanStart;
                    char[] cArr = new char[i2];
                    editable.getChars(spanStart, spanEnd, cArr, 0);
                    if (i2 > 0) {
                        g(aeivVar.g(new String(cArr)));
                    }
                }
            }
            if (spanEnd != editable.length()) {
                i(editable, spanEnd, editable.length());
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        amqw amqwVar2 = (amqw) aihfVarCreateBuilder.instance;
        aiie aiieVar = amqwVar2.c;
        if (!aiieVar.c()) {
            amqwVar2.c = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(arrayList, amqwVar2.c);
        return (amqw) aihfVarCreateBuilder.build();
    }
}
