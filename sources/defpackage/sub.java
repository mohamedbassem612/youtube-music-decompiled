package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sub implements svj {
    final /* synthetic */ alem a;
    final /* synthetic */ ssj b;

    public sub(ssj ssjVar, alem alemVar) {
        this.a = alemVar;
        this.b = ssjVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, vxe] */
    @Override // defpackage.svj
    public final void a() {
        alem alemVar = this.a;
        if ((alemVar.c & 4) != 0) {
            ssj ssjVar = this.b;
            ajwo ajwoVar = alemVar.f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            ssjVar.a.a(ajwoVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, vxe] */
    @Override // defpackage.svj
    public final void b(String str) {
        alem alemVar = this.a;
        if ((alemVar.c & 8) != 0) {
            ssj ssjVar = this.b;
            ajwo ajwoVar = alemVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            ssjVar.a.a(ajwoVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, vxe] */
    @Override // defpackage.svj
    public final void c(Intent intent) {
        alem alemVar = this.a;
        if ((alemVar.c & 16) != 0) {
            ssj ssjVar = this.b;
            ajwo ajwoVar = alemVar.h;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            ssjVar.a.a(ajwoVar);
        }
    }
}
