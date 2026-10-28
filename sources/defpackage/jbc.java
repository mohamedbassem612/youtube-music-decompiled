package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jbc extends xhh {
    final /* synthetic */ jbd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbc(jbd jbdVar, vxe vxeVar, ajwo ajwoVar, String str) {
        super(vxeVar, ajwoVar, false, str);
        this.a = jbdVar;
    }

    @Override // defpackage.vxj, defpackage.tuc, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.a.a.getResources().getColor(R.color.corrected_query_link_color));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
    }
}
