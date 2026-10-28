package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fcg extends fbx implements ewc {
    public fcg(fce fceVar) {
        super(fceVar);
    }

    @Override // defpackage.ewf
    public final int a() {
        fcj fcjVar = ((fce) this.a).a.a;
        ete eteVar = (ete) fcjVar.a;
        return eteVar.a.limit() + eteVar.c.length + (eteVar.d.length << 2) + fcjVar.j;
    }

    @Override // defpackage.ewf
    public final Class b() {
        return fce.class;
    }

    @Override // defpackage.fbx, defpackage.ewc
    public final void d() {
        ((fce) this.a).a().prepareToDraw();
    }

    @Override // defpackage.ewf
    public final void e() {
        Object obj;
        fce fceVar = (fce) this.a;
        fceVar.stop();
        fceVar.b = true;
        fcj fcjVar = fceVar.a.a;
        fcjVar.b.clear();
        fcjVar.d();
        fcjVar.f();
        fci fciVar = fcjVar.e;
        if (fciVar != null) {
            fcjVar.c.j(fciVar);
            fcjVar.e = null;
        }
        fci fciVar2 = fcjVar.g;
        if (fciVar2 != null) {
            fcjVar.c.j(fciVar2);
            fcjVar.g = null;
        }
        fci fciVar3 = fcjVar.i;
        if (fciVar3 != null) {
            fcjVar.c.j(fciVar3);
            fcjVar.i = null;
        }
        ete eteVar = (ete) fcjVar.a;
        eteVar.f = null;
        byte[] bArr = eteVar.c;
        if (bArr != null) {
            eteVar.j.N(bArr);
        }
        int[] iArr = eteVar.d;
        if (iArr != null && (obj = eteVar.j.a) != null) {
            ((ewv) obj).c(iArr);
        }
        Bitmap bitmap = eteVar.g;
        if (bitmap != null) {
            eteVar.j.M(bitmap);
        }
        eteVar.g = null;
        eteVar.a = null;
        eteVar.h = null;
        byte[] bArr2 = eteVar.b;
        if (bArr2 != null) {
            eteVar.j.N(bArr2);
        }
        fcjVar.f = true;
    }
}
