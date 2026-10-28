package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hxu extends qny {
    public final boolean a;
    public final Duration b;
    public final igk c;

    public hxu(Context context, boolean z, Duration duration, String str, igk igkVar) {
        super(str);
        d(context.getColor(R.color.ytm_text_color_primary));
        this.a = z;
        this.b = duration;
        this.c = igkVar;
    }
}
