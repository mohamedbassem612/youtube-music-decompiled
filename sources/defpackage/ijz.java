package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.playlist.customthumbnail.CustomThumbnailCreationActivity;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijz implements afgr {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ijz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.afgr
    public final void F(ahud ahudVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        if (this.$cid != 0) {
            agrf agrfVar = gfb.a;
            agrx agrxVar = agso.a;
            ((gfb) this.a).m.k(13, 2, 2);
            return;
        }
        ika ikaVar = (ika) this.a;
        if (ikaVar.d.l(244, 45802803L, false)) {
            ikaVar.e.a(ahudVar.X());
        }
        affd affdVarX = ahudVar.X();
        CustomThumbnailCreationActivity customThumbnailCreationActivity = ikaVar.a;
        dd supportFragmentManager = customThumbnailCreationActivity.getSupportFragmentManager();
        if (!(supportFragmentManager.f(R.id.custom_thumbnail_creation_music_container) instanceof vdy)) {
            Intent intent = customThumbnailCreationActivity.getIntent();
            ajwo ajwoVar = ajwo.a;
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            try {
                Parcelable parcelableExtra = intent.getParcelableExtra("navigation_endpoint");
                if (parcelableExtra instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelableExtra;
                    bundle.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle.getParcelable("protoparsers");
                } else {
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
                }
                ajwo ajwoVar2 = (ajwo) ahng.az(protoParsers$InternalDontUse, ajwoVar, generatedRegistry);
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aras.b);
                ajwoVar2.c(aihlVarCheckIsLite);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
                vdy vdyVarD = vea.d(affdVarX, (aras) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
                av avVar = new av(supportFragmentManager);
                avVar.q(R.id.custom_thumbnail_creation_music_container, vdyVarD, "custom_thumbnail_creation_fragment");
                avVar.e();
            } catch (aiik e) {
                throw new RuntimeException(e);
            }
        }
        ikaVar.f.k(43, 2, 2);
    }

    @Override // defpackage.afgr
    public final void n(affx affxVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            gfb gfbVar = (gfb) obj;
            gfbVar.n.m("MusicPicker", affxVar, gfbVar.c, 13);
        } else {
            ika ikaVar = (ika) obj;
            ikaVar.g.l(ika.class.getName(), affxVar, 43);
            ikaVar.a.finish();
        }
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void k() {
    }
}
