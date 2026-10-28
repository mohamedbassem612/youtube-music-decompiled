package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxr extends gut {
    private final Context a;
    private final hlp b;

    public gxr(Context context, hlp hlpVar) {
        this.a = context;
        this.b = hlpVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ish.d);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        this.b.h(true);
        Context context = this.a;
        if (isi.a(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:".concat(String.valueOf(context.getPackageName()))));
        afwl.m(context, intent);
    }
}
