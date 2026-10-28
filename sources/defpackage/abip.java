package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abip extends tal {
    public boolean d;
    public boolean e;
    public avbm f;
    private final ajwo g;
    private final abix h;
    private final abvn i;
    private final avmm j = new avmm();

    public abip(ajwo ajwoVar, abix abixVar, abvn abvnVar) {
        this.g = ajwoVar;
        this.h = abixVar;
        this.i = abvnVar;
    }

    @Override // defpackage.tal
    public final void b() {
        this.j.b();
    }

    public final void c() {
        abvn abvnVar = this.i;
        this.j.e(abvnVar.O().i(aawb.y(abvnVar.X(), 16777216L)).i(new abwr(1)).al(new abid(this, 11), new xuk(13)), abvnVar.P().i(aawb.y(abvnVar.X(), 16777216L)).i(new abwr(1)).al(new abid(this, 12), new xuk(13)));
    }

    public final void d() {
        Object obj;
        avbm avbmVar = this.f;
        if (avbmVar != null) {
            boolean z = this.d;
            boolean z2 = this.e && avbmVar.c != null;
            boolean z3 = z && avbmVar.b != null;
            if (z2) {
                obj = avbmVar.c;
            } else {
                obj = !z3 ? avbmVar.g : avbmVar.b;
            }
            if (obj != null) {
                ajwo ajwoVar = this.g;
                wfx wfxVar = (wfx) obj;
                if (wfxVar.c == null) {
                    ajir ajirVar = wfxVar.a;
                    if ((ajirVar.b & 2) != 0) {
                        ajwo ajwoVar2 = ajirVar.d;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        wfxVar.c = ajwoVar2;
                    } else {
                        ajiq ajiqVar = ajirVar.e;
                        if (ajiqVar == null) {
                            ajiqVar = ajiq.a;
                        }
                        if (((ajiqVar.b == 84996305 ? (ajip) ajiqVar.c : ajip.a).b & 1) != 0) {
                            ajiq ajiqVar2 = ajirVar.e;
                            if (ajiqVar2 == null) {
                                ajiqVar2 = ajiq.a;
                            }
                            ajwo ajwoVar3 = (ajiqVar2.b == 84996305 ? (ajip) ajiqVar2.c : ajip.a).c;
                            if (ajwoVar3 == null) {
                                ajwoVar3 = ajwo.a;
                            }
                            wfxVar.c = ajwoVar3;
                        }
                    }
                    wfxVar.c = (ajwo) wfxVar.b.apply(wfxVar.c);
                }
                if (!aajc.h(ajwoVar, wfxVar.c)) {
                    if (wfxVar.d == null) {
                        ajir ajirVar2 = wfxVar.a;
                        ajiq ajiqVar3 = ajirVar2.e;
                        if (ajiqVar3 == null) {
                            ajiqVar3 = ajiq.a;
                        }
                        if (((ajiqVar3.b == 111631903 ? (ajio) ajiqVar3.c : ajio.a).b & 1) != 0) {
                            ajiq ajiqVar4 = ajirVar2.e;
                            if (ajiqVar4 == null) {
                                ajiqVar4 = ajiq.a;
                            }
                            ajwo ajwoVar4 = (ajiqVar4.b == 111631903 ? (ajio) ajiqVar4.c : ajio.a).c;
                            if (ajwoVar4 == null) {
                                ajwoVar4 = ajwo.a;
                            }
                            wfxVar.d = ajwoVar4;
                        }
                        wfxVar.d = (ajwo) wfxVar.b.apply(wfxVar.d);
                    }
                    if (!aajc.h(ajwoVar, wfxVar.d) || !this.h.a) {
                        this.b = false;
                        return;
                    }
                }
                this.b = true;
                a();
                return;
            }
        }
        this.b = false;
    }
}
