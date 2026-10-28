package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ooh implements qqz {
    public final Context a;
    public final Object b;
    public final HashMap c;
    public final HashMap d;
    public final omj e;

    public ooh(Context context) {
        omj omjVar = new omj(new tyq(1));
        this.b = new Object();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = context;
        this.e = omjVar;
    }

    @Override // defpackage.qqz
    public final qqy a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.qqz
    public final qqy b(Uri uri) {
        qqy qqyVar;
        synchronized (this.b) {
            qqyVar = (qqy) this.d.get(uri);
        }
        return qqyVar;
    }

    @Override // defpackage.qqz
    public final void f() {
    }
}
