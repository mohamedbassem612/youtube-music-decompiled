package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.playlist.customthumbnail.CustomThumbnailCreationActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyp extends gut {
    private final cf a;
    private final dd b;
    private final affd c;
    private final vxz d;
    private final kyr e;

    public gyp(cf cfVar, kyr kyrVar, affd affdVar, vxz vxzVar) {
        this.a = cfVar;
        this.e = kyrVar;
        this.b = cfVar.getSupportFragmentManager();
        this.c = affdVar;
        this.d = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        if (!this.d.l(16, 45680787L, false)) {
            cf cfVar = this.a;
            kyr kyrVar = this.e;
            Intent intent = new Intent((Context) kyrVar.a, (Class<?>) CustomThumbnailCreationActivity.class);
            ahng.aF(intent, "navigation_endpoint", ajwoVar);
            afgf.a(intent, (affd) kyrVar.b);
            afwl.m(cfVar, intent);
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aras.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        vdy vdyVarD = vea.d(this.c, (aras) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        this.a.findViewById(R.id.custom_thumbnail_container).setVisibility(0);
        dd ddVar = this.b;
        av avVar = new av(ddVar);
        avVar.g(R.id.custom_thumbnail_container, vdyVarD, "custom_thumbnail_creation_fragment", 1);
        avVar.o(null);
        avVar.a(false, true);
        ddVar.ah();
    }
}
