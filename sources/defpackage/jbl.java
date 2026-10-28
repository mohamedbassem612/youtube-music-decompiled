package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jbl implements Consumer {
    public final /* synthetic */ Context a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ jbl(Context context, int i, int i2) {
        this.a = context;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i;
        int i2;
        TextView textView = (TextView) obj;
        int i3 = jbm.f;
        textView.setAllCaps(false);
        int i4 = this.c - 1;
        if (i4 == 2) {
            i = R.dimen.button_icon_padding_small;
            i2 = R.dimen.button_text_size_small;
        } else if (i4 == 3) {
            i = R.dimen.button_icon_padding_large;
            i2 = R.dimen.button_text_size_large;
        } else if (i4 == 4) {
            i = R.dimen.button_icon_padding_extra_large;
            i2 = R.dimen.button_text_size_extra_large;
        } else if (i4 != 5) {
            i = R.dimen.button_icon_padding_medium;
            i2 = R.dimen.button_text_size_medium;
        } else {
            i = R.dimen.button_icon_padding_extra_small;
            i2 = R.dimen.button_text_size_extra_small;
        }
        int i5 = this.b;
        Context context = this.a;
        textView.setTextSize(0, context.getResources().getDimension(i2));
        textView.setTypeface(ackm.ROBOTO_MEDIUM.c(context, 0));
        textView.setTextColor(jkl.b(i5));
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(i));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
