package defpackage;

import android.content.Intent;
import internal.org.jni_zero.JniZero;
import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gwe extends gut {
    private final cf a;
    private final zwb b;

    public gwe(cf cfVar, zwb zwbVar) {
        this.a = cfVar;
        this.b = zwbVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aojy.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aojy aojyVar = (aojy) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        Intent intent = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(aojyVar.e).entrySet()) {
            intent.putExtra("extra.screen.".concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        if ((aojyVar.c & 1) != 0) {
            intent.putExtra("extra.screenId", aojyVar.d);
        }
        if ((aojyVar.c & 4) != 0) {
            intent.putExtra("extra.anchor", aojyVar.f);
        }
        intent.putExtra("extra.themeChoice", 2);
        zwa zwaVarE = this.b.e();
        if (zwaVarE instanceof rlt) {
            intent.putExtra("extra.accountName", ((rlt) zwaVarE).b);
        }
        cf cfVar = this.a;
        long j = afwl.a;
        cfVar.getClass();
        Intent intent2 = new Intent(intent);
        afwg afwgVarO = afwl.o(intent2);
        try {
            cfVar.startActivityForResult(intent2, 0);
            JniZero.l(afwgVarO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afwgVarO, th);
                throw th2;
            }
        }
    }
}
