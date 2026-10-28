package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rmy {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/account/image/DefaultImageUploadController");
    public final vxe a;
    public final Set b;
    public boolean c;
    public boolean d;
    private final cf f;
    private rnf g;

    public rmy(cf cfVar, vxe vxeVar) {
        cfVar.getClass();
        this.f = cfVar;
        vxeVar.getClass();
        this.a = vxeVar;
        this.c = true;
        this.b = new HashSet();
    }

    private final void f(int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((rnd) it.next()).m(i);
        }
    }

    final rnf a() {
        rnf rnfVar = this.g;
        if (rnfVar == null) {
            rnfVar = (rnf) this.f.getSupportFragmentManager().g("update_image_fragment");
            this.g = rnfVar;
            if (rnfVar == null) {
                this.d = false;
            }
        }
        return rnfVar;
    }

    public final void b() {
        if (this.c) {
            this.d = true;
            return;
        }
        if (a() != null) {
            cf cfVar = this.f;
            if (tuk.s(cfVar.getSupportFragmentManager())) {
                av avVar = new av(cfVar.getSupportFragmentManager());
                avVar.l(this.g);
                avVar.e();
                this.g = null;
            }
        }
    }

    public final void c(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVar = arar.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            arar ararVar = (arar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            rnf rnfVarA = a();
            if (rnfVarA != null) {
                rnfVarA.i(ararVar);
                return;
            }
            return;
        }
        aihl aihlVar2 = akpf.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            rnf rnfVarA2 = a();
            if (rnfVarA2 != null) {
                rnfVarA2.j(3);
                return;
            }
            return;
        }
        aihl aihlVar3 = akpe.b;
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar3);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar3);
            ajwoVar.c(aihlVarCheckIsLite6);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
            rnf rnfVarA3 = a();
            if (rnfVarA3 != null) {
                rnfVarA3.j(2);
                return;
            }
            return;
        }
        aihl aihlVar4 = aldv.b;
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar4);
        ajwoVar.c(aihlVarCheckIsLite7);
        if (!ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
            e(new rne("Unknown command."));
            return;
        }
        if (this.c) {
            return;
        }
        av avVar = new av(this.f.getSupportFragmentManager());
        if (a() != null) {
            avVar.l(this.g);
            this.d = false;
        }
        f(1);
        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar4);
        ajwoVar.c(aihlVarCheckIsLite8);
        Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
        Object objC = objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4);
        String str = rnf.a;
        Bundle bundle = new Bundle();
        bundle.putByteArray("arg_get_photo_endpoint", ((aldv) objC).toByteArray());
        rnf rnfVar = new rnf();
        rnfVar.setArguments(bundle);
        this.g = rnfVar;
        avVar.g(0, rnfVar, "update_image_fragment", 1);
        avVar.e();
    }

    public final void d() {
        b();
        f(4);
    }

    public final void e(Throwable th) {
        zvp.b(zvn.b, zvm.z, "Editing channel image failed.", th);
        ((agrc) ((agrc) ((agrc) e.b()).j(th)).k("com/google/android/libraries/youtube/account/image/DefaultImageUploadController", "onImageUploadFailed", (char) 247, "DefaultImageUploadController.java")).t("Failed image upload.");
        b();
        f(3);
    }
}
