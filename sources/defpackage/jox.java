package defpackage;

import android.graphics.drawable.GradientDrawable;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jox extends ggf {
    final /* synthetic */ Consumer f;

    public jox(Consumer consumer) {
        this.f = consumer;
    }

    @Override // defpackage.ggf
    public final void d(GradientDrawable gradientDrawable) {
        this.f.accept(gradientDrawable);
    }
}
