package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abdd extends abcz implements abcy {
    public final int a;
    public final abdc b;
    public final abdg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abdd(abdh abdhVar, String str, String str2, boolean z, boolean z2) {
        super(abdhVar.a(R.raw.gl_rgb_and_yuv_program_ext_vert).concat(str), abdc.a(abdhVar, z) + abdg.a(abdhVar, z2) + str2);
        int i = abdc.a;
        this.a = c("aVertPos");
        this.b = new abdc(this, z);
        this.c = new abdg(this, z2);
    }

    @Override // defpackage.abcy
    public final void a(yia yiaVar, yib yibVar, int i, yib yibVar2) {
        this.b.c(yiaVar, yibVar, i, yibVar2);
    }

    @Override // defpackage.abcy
    public final void b(boolean z, byte[] bArr, long j, long j2) {
        this.b.d(z, bArr, j, j2);
    }

    @Override // defpackage.abcz
    public final void g() {
        this.b.b();
        super.g();
    }

    public abdd(abdh abdhVar, boolean z, boolean z2) {
        this(abdhVar, abdhVar.a(R.raw.gl_no_op_program_vert), abdhVar.a(R.raw.gl_no_op_program_frag), z, z2);
    }

    public abdd(abdh abdhVar, boolean z, boolean z2, byte[] bArr) {
        this(abdhVar, abdhVar.a(R.raw.gl_stereo_3d_program_vert), abdhVar.a(R.raw.gl_stereo_3d_program_frag), z, z2);
    }
}
