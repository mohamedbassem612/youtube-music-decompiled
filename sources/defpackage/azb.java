package defpackage;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class azb implements azd {
    private final ScrollFeedbackProvider a;

    public azb(View view) {
        this.a = ScrollFeedbackProvider.createProvider(view);
    }

    @Override // defpackage.azd
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.azd
    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
