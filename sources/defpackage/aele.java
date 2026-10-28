package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aele implements vxc {
    private final /* synthetic */ int $cid;
    public final Object a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;

    public aele(Activity activity, Context context, vxe vxeVar, Optional optional, vxz vxzVar, int i) {
        this.$cid = i;
        this.a = activity;
        this.b = context;
        this.c = vxeVar;
        this.d = optional;
        this.e = vxzVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vxe] */
    private final void d(ajbg ajbgVar, Map map) {
        if ((ajbgVar.b & 4) == 0) {
            tuk.n((Context) this.a, R.string.common_error_generic, 0);
            return;
        }
        ?? r1 = this.c;
        ajwo ajwoVar = ajbgVar.f;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        r1.c(ajwoVar, map);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, wbz] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Optional optionalOf;
        if (this.$cid != 0) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akzq.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            akzq akzqVar = (akzq) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            if ((akzqVar.c & 1) != 0) {
                List<adhf> listF = ((aeod) this.e).f(akzqVar.d);
                if (listF != null) {
                    for (adhf adhfVar : listF) {
                        wby wbyVarE = this.b.e(this.c.e());
                        aele aeleVar = this;
                        wbyVarE.g(adhfVar.g).s((avmb) this.d).k(new usm(aeleVar, akzqVar, adhfVar, wbyVarE, 3)).H();
                        this = aeleVar;
                    }
                    return;
                }
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajbh.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite2.d));
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajbh.a);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        ajbg ajbgVar = (ajbg) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
        Intent intent = (ajbgVar.b & 8) != 0 ? new Intent(ajbgVar.g) : tym.c();
        ComponentName componentName = new ComponentName(ajbgVar.c, ajbgVar.d);
        Optional optional = (Optional) this.d;
        optional.isPresent();
        ComponentName componentName2 = (ComponentName) ((agkj) optional.get()).getOrDefault(componentName, componentName);
        intent.setClassName(componentName2.getPackageName(), componentName2.getClassName());
        for (amgu amguVar : ajbgVar.e) {
            intent.putExtra(amguVar.e, amguVar.c == 2 ? (String) amguVar.d : "");
        }
        if ((ajbgVar.b & 16) != 0) {
            int iAU = a.aU(ajbgVar.i);
            if (iAU == 0) {
                iAU = 1;
            }
            if (iAU - 1 != 1) {
                optionalOf = Optional.empty();
            } else {
                File file = new File(new File(((Context) this.b).getCacheDir(), "image_share"), ajbgVar.h);
                if (file.exists()) {
                    Context context = (Context) this.a;
                    intent.putExtra("android.intent.extra.STREAM", avh.a(context, nsj.n(context), file));
                    if (((vxz) this.e).l(2, 45854523L, false)) {
                        intent.addFlags(1);
                    }
                    if (ajbgVar.h.endsWith("jpg") || ajbgVar.h.endsWith("jpeg")) {
                        intent.setType("image/jpeg");
                    } else {
                        intent.setType("image/png");
                    }
                    optionalOf = Optional.of(intent);
                } else {
                    optionalOf = Optional.empty();
                }
            }
        } else {
            optionalOf = Optional.of(intent);
        }
        if (optionalOf.isEmpty()) {
            d(ajbgVar, map);
            return;
        }
        Object obj = optionalOf.get();
        Object obj2 = this.a;
        if (((Activity) obj2).getPackageManager().queryIntentActivities((Intent) obj, SemanticState.Focused).isEmpty()) {
            d(ajbgVar, map);
            return;
        }
        try {
            ((Activity) obj2).startActivity((Intent) obj);
        } catch (ActivityNotFoundException unused) {
            d(ajbgVar, map);
        }
    }

    public aele(wbz wbzVar, zwb zwbVar, avmb avmbVar, aeod aeodVar, vxe vxeVar, int i) {
        this.$cid = i;
        this.b = wbzVar;
        this.c = zwbVar;
        this.d = avmbVar;
        this.e = aeodVar;
        this.a = vxeVar;
    }
}
