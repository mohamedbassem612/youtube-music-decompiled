package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abdb {
    public abce a;
    public abde b;
    public abde c;
    public abdd d;
    public abdd e;
    public abdd f;
    public abdd g;
    private final abdh h;
    private abcv i;
    private abdf j;
    private abdf k;

    public abdb(abdh abdhVar, abce abceVar) {
        this.h = abdhVar;
        this.a = abceVar;
        a();
    }

    public final void a() {
        abdh abdhVar = this.h;
        this.i = new abcv(abdhVar);
        this.j = new abdf(abdhVar.a(R.raw.gl_fixed_texture_program_vert), abdhVar.a(R.raw.gl_fixed_texture_program_frag));
        this.k = new abdf(abdhVar);
        this.c = new abde(abdhVar, true, this.a.a());
        this.b = new abde(abdhVar, false, this.a.a());
        this.d = new abdd(abdhVar, false, this.a.a());
        this.e = new abdd(abdhVar, true, this.a.a());
        this.f = new abdd(abdhVar, false, this.a.a(), null);
        this.g = new abdd(abdhVar, true, this.a.a(), null);
    }

    public final void b() {
        this.i.g();
        this.j.g();
        this.k.g();
        this.b.g();
        this.c.g();
        this.d.g();
        this.e.g();
        this.f.g();
        this.g.g();
    }
}
