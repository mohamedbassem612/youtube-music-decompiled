package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hgw implements zza {
    public final awlx a = new awlx();
    final /* synthetic */ hgy b;
    private final Bundle c;
    private final byte[] d;

    public hgw(hgy hgyVar, Bundle bundle, byte[] bArr) {
        this.b = hgyVar;
        this.c = bundle;
        this.d = bArr;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alsv alsvVar = (alsv) obj;
        if ((alsvVar.b & 2) != 0) {
            ajwo ajwoVar = alsvVar.d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            byte[] bArr = this.d;
            if (bArr != null) {
                aihh aihhVar = (aihh) ajwoVar.toBuilder();
                aigj aigjVarV = aigj.v(bArr);
                aihhVar.copyOnWrite();
                ajwo ajwoVar2 = (ajwo) aihhVar.instance;
                aigjVarV.getClass();
                ajwoVar2.b |= 1;
                ajwoVar2.c = aigjVarV;
                ajwoVar = (ajwo) aihhVar.build();
            }
            this.b.n(this.a, ajwoVar, this.c);
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        String str = String.format("MediaServices onPlayFromSearch ResolveUrl failed: %s", toeVar.getMessage());
        zvp.a(zvn.b, zvm.n, str);
        ((agrc) ((agrc) hgy.a.b().i(agso.a, "MediaSessionPlayerCtlr")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController$ResolveUrlServiceListener", "onErrorResponse", 1402, "MusicMediaSessionPlayerController.java")).w("%s", str);
        this.a.ki(hgg.b);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
