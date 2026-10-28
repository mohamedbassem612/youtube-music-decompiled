package defpackage;

import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jfo implements adht {
    final /* synthetic */ aqmh a;
    final /* synthetic */ jfr b;

    public jfo(jfr jfrVar, aqmh aqmhVar) {
        this.a = aqmhVar;
        this.b = jfrVar;
    }

    @Override // defpackage.adht
    public final void a(ImageView imageView) {
        this.b.e(this.a);
    }

    @Override // defpackage.adht
    public final void b(ImageView imageView) {
        aiqe aiqeVar = this.a.e;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        aiqd aiqdVar = aiqeVar.c;
        if (aiqdVar == null) {
            aiqdVar = aiqd.a;
        }
        if ((aiqdVar.b & 2) != 0) {
            kro.aa(this.b.a, aiqeVar);
        }
    }

    @Override // defpackage.adht
    public final void c() {
        this.b.e(this.a);
    }

    @Override // defpackage.adht
    public final void d() {
    }
}
