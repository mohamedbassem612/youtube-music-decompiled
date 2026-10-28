package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ere {
    public Object a;
    public final /* synthetic */ Object b;

    public ere(Context context) {
        this.b = context;
        this.a = null;
    }

    public final File a() {
        if (this.a == null) {
            this.a = new File(((Context) this.b).getCacheDir(), "volley");
        }
        return (File) this.a;
    }

    public ere(Object obj) {
        this.b = obj;
    }
}
