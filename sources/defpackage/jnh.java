package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnh {
    public final jnj a;
    public final aaug b;
    public final int c;
    public final auy d;
    public final xgn e;
    public final aunn f;
    public final aeba g;
    public ajjm h;
    public ajws i;
    public long j;
    public boolean k;
    public final jnm l;
    private final vxe m;

    public jnh(aaug aaugVar, jnj jnjVar, xgn xgnVar, aunn aunnVar, int i, auy auyVar, jnm jnmVar, aeba aebaVar, vxe vxeVar) {
        aaugVar.getClass();
        this.b = aaugVar;
        jnjVar.getClass();
        this.a = jnjVar;
        xgnVar.getClass();
        this.e = xgnVar;
        this.f = aunnVar;
        this.c = i;
        this.d = auyVar;
        this.l = jnmVar;
        this.g = aebaVar;
        this.m = vxeVar;
    }

    public static final boolean c(ajjm ajjmVar) {
        if (ajjmVar == null) {
            return false;
        }
        int i = ajjmVar.b;
        return ((i & 2) == 0 && (i & 4) == 0) ? false : true;
    }

    public final void a() {
        this.h = null;
        this.i = null;
    }

    public final void b(ajws ajwsVar) {
        aeba aebaVar = this.g;
        if (aebaVar.c(ajwsVar.f)) {
            int i = ajwsVar.b;
            if ((i & 1) != 0) {
                vxe vxeVar = this.m;
                ajwo ajwoVar = ajwsVar.c;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
                this.k = true;
            } else if ((i & 2) != 0) {
                vxe vxeVar2 = this.m;
                ajwo ajwoVar2 = ajwsVar.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar2.a(ajwoVar2);
                this.e.w(new xgj(ajwsVar.e, (amud) null), null);
            }
            aebaVar.a(ajwsVar.f);
            a();
        }
    }
}
