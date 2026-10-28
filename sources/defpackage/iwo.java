package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwo implements nuw {
    public final wbz a;
    private final awmd b;
    private final Executor c;
    private final iwm d;

    public iwo(awmd awmdVar, Executor executor, wbz wbzVar, iwm iwmVar) {
        this.b = awmdVar;
        this.c = executor;
        this.a = wbzVar;
        this.d = iwmVar;
    }

    @Override // defpackage.nuw
    public final /* bridge */ /* synthetic */ Drawable a(Object obj, Bitmap bitmap, ImageView.ScaleType scaleType, nsl nslVar) {
        anmi anmiVar = (anmi) obj;
        if (this.a.c().g(anmiVar.c).E() != null) {
            return new mfj(bitmap, scaleType, (nuc) this.b.io());
        }
        iwn iwnVar = new iwn(bitmap, this.d);
        Executor executor = this.c;
        taf.n(ahno.aq(iwnVar, executor), executor, new itt(this, anmiVar, 2));
        return new mfj(bitmap, scaleType, (nuc) this.b.io());
    }

    @Override // defpackage.nuw
    public final /* synthetic */ Drawable b(Object obj, Drawable drawable, ImageView.ScaleType scaleType, nsl nslVar) {
        return nra.a(this, obj, drawable, scaleType, nslVar);
    }

    @Override // defpackage.nuw
    public final aigw c() {
        return anmi.b;
    }
}
