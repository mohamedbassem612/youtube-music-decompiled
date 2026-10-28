package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezl implements eyw {
    private final Context a;
    private final Class b;

    public ezl(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        Class cls = this.b;
        return new ezn(this.a, ezaVar.a(File.class, cls), ezaVar.a(Uri.class, cls), cls);
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
