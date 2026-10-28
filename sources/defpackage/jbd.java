package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jbd implements adma {
    public final Context a;
    private final vxe b;

    public jbd(Context context, vxe vxeVar) {
        context.getClass();
        this.a = context;
        vxeVar.getClass();
        this.b = vxeVar;
    }

    protected final CharSequence d(CharSequence charSequence, CharSequence charSequence2, ajwo ajwoVar, String str) {
        if (charSequence == null || charSequence2 == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        spannableString.setSpan(new jbc(this, this.b, ajwoVar, str), 0, charSequence2.length(), 33);
        return TextUtils.concat(charSequence, " ", spannableString);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
