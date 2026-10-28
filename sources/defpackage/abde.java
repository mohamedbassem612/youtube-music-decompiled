package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abde extends abdf implements abcy {
    public final abdc e;
    public final abdg f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abde(abdh abdhVar, boolean z, boolean z2) {
        super(abdhVar.a(R.raw.gl_rgb_and_yuv_program_ext_vert).concat(abdhVar.a(R.raw.gl_streaming_video_texture_program_vert)), abdc.a(abdhVar, z) + abdg.a(abdhVar, z2) + abdhVar.a(R.raw.gl_streaming_video_texture_program_frag));
        int i = abdc.a;
        this.g = d("uTexMultiplier");
        this.h = d("uTexOffset");
        this.i = d("uTextureMatrix");
        this.e = new abdc(this, z);
        this.f = new abdg(this, z2);
    }

    @Override // defpackage.abcy
    public final void a(yia yiaVar, yib yibVar, int i, yib yibVar2) {
        this.e.c(yiaVar, yibVar, i, yibVar2);
    }

    @Override // defpackage.abcy
    public final void b(boolean z, byte[] bArr, long j, long j2) {
        this.e.d(z, bArr, j, j2);
    }

    @Override // defpackage.abcz
    public final void g() {
        this.e.b();
        super.g();
    }
}
