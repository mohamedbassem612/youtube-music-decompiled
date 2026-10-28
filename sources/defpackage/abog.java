package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abog {
    public static final abof a = new abof();
    public final Context b;

    public abog(Context context) {
        this.b = context;
    }

    public final void a(aboe aboeVar, String str) {
        aboeVar.a(str, this.b.getString(R.string.cpn_msg_on_error));
    }
}
