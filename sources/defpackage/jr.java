package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jr extends View {
    public jr(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        return 0;
    }
}
