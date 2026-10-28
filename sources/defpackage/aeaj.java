package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aeaj {
    public final Context a;
    public final adry b;
    public final SpannableStringBuilder c;
    public EditText d;
    public boolean e;
    protected View f;
    public boolean g;
    public final aeiv h;
    private final advb i;
    private final adme j;
    private final adsd k;
    private aeam l;
    private TextWatcher m;

    public aeaj(Context context, advb advbVar, aeiv aeivVar, aduv aduvVar, adsa adsaVar, adme admeVar) {
        context.getClass();
        this.a = context;
        aeivVar.getClass();
        this.h = aeivVar;
        advbVar.getClass();
        this.i = advbVar;
        advbVar.b(aeam.class);
        this.j = admeVar;
        aeah aeahVar = new aeah(this, 0);
        this.k = aeahVar;
        this.b = new adry(context, aduvVar, adsaVar, true, aeahVar, true);
        this.c = new SpannableStringBuilder();
    }

    private static final int a(int i, int i2) {
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    public final int b(CharSequence charSequence, int i) {
        int iA;
        String strTrim = charSequence.toString().trim();
        if (!TextUtils.isEmpty(strTrim)) {
            aeiv aeivVar = this.h;
            if (aeivVar.k() && i > 0) {
                Matcher matcher = aeivVar.i().matcher(strTrim);
                int length = strTrim.length();
                boolean z = false;
                int iStart = 0;
                int i2 = 0;
                while (matcher.find()) {
                    if (matcher.start() > iStart) {
                        iA = i2 + (!z ? a(iStart, matcher.start()) : a(length, matcher.start()));
                        iStart = matcher.start();
                    } else {
                        iA = i2 + a(iStart, matcher.start());
                    }
                    length = matcher.end();
                    i2 = iA + i;
                    z = true;
                }
                if (z) {
                    return length < strTrim.length() ? i2 + a(length, strTrim.length()) : i2;
                }
                return strTrim.length();
            }
        }
        return strTrim.length();
    }

    public final TextWatcher c(EditText editText) {
        this.d = editText;
        if (this.m == null) {
            this.m = new aeai(this, this);
        }
        return this.m;
    }

    public final void d() {
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        this.e = false;
    }

    public final void e(Editable editable) {
        aeiv aeivVar = this.h;
        Pattern patternI = aeivVar.i();
        if (patternI == null || TextUtils.isEmpty(editable.toString())) {
            return;
        }
        Matcher matcher = patternI.matcher(editable.toString());
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            if (((ImageSpan[]) editable.getSpans(matcher.start(), matcher.end(), ImageSpan.class)).length == 0) {
                if (arrayList.contains(Integer.valueOf(matcher.start()))) {
                    return;
                }
                arrayList.add(Integer.valueOf(matcher.start()));
                String strG = aeivVar.g(matcher.group());
                SpannableStringBuilder spannableStringBuilder = this.c;
                spannableStringBuilder.clear();
                adry adryVar = this.b;
                adryVar.e(null, 0, null);
                adryVar.a(aeivVar.h(strG), aeivVar.e(strG), this.a.getResources().getDimension(R.dimen.emoji_height), strG, this.d.getId(), spannableStringBuilder, null);
            }
        }
    }

    public final void f(ViewGroup viewGroup, aktm aktmVar, EditText editText, aeal aealVar) {
        this.d = editText;
        editText.setOnTouchListener(new jfs(this, aealVar, 6, null));
        if (aktmVar == null) {
            d();
            return;
        }
        aeam aeamVar = (aeam) this.j.a(viewGroup);
        this.l = aeamVar;
        aeamVar.e = editText;
        aeamVar.d = aealVar;
        this.f = aeamVar.b;
        adly adlyVar = new adly();
        adlyVar.f("VIEW_POOL_KEY", (admh) this.i.io());
        adlyVar.f("CONTROLLER_KEY", this);
        this.l.hU(adlyVar, aktmVar);
        tuk.i(this.f);
        this.f.setVisibility(0);
        this.e = true;
    }
}
