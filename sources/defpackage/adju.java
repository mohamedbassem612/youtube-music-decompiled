package defpackage;

import android.widget.ImageView;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adju implements adhu {
    public final adhv a;
    public int d;
    private final tbt f;
    public final Map b = new ConcurrentHashMap();
    public final Map c = new ConcurrentHashMap();
    public boolean e = false;

    public adju(adhv adhvVar, tbt tbtVar) {
        this.a = adhvVar;
        this.f = tbtVar;
    }

    private final void c(ImageView imageView) {
        Map map = this.b;
        map.remove(imageView);
        if (map.isEmpty() && this.c.isEmpty() && this.d > 0) {
            a();
        }
    }

    public final void a() {
        if (this.e) {
            b(new adkj());
            this.a.q(this);
            this.b.clear();
            this.c.clear();
            this.e = false;
        }
    }

    public final void b(tas tasVar) {
        this.f.c(tasVar);
    }

    @Override // defpackage.adhu
    public final void e(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
        Integer num = (Integer) this.b.get(imageView);
        if (num != null) {
            b(new adkm(num.intValue()));
            c(imageView);
        }
    }

    @Override // defpackage.adhu
    public final void f(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
        Integer num = (Integer) this.b.get(imageView);
        if (num != null) {
            b(new adkl(num.intValue()));
            c(imageView);
        }
    }

    @Override // defpackage.adhu
    public final void g(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
        if (!this.e || this.d > 0) {
            return;
        }
        int i = 0;
        aqmg aqmgVar = !aawb.O(aqmhVar) ? null : (aqmg) aqmhVar.c.get(0);
        if (aqmgVar != null) {
            int i2 = aqmgVar.d;
            int width = imageView.getWidth();
            imageView.getHeight();
            fkw fkwVar = (fkw) imageView.getTag(R.id.litho_size);
            if (fkwVar != null) {
                width = fkwVar.a;
            }
            if (i2 >= 50 || width >= 50) {
                this.b.put(imageView, Integer.valueOf(this.d));
                adhw adhwVar = adhrVar != null ? adhrVar.i : null;
                int i3 = this.d;
                if (adhrVar != null && adhwVar != null) {
                    i = 1;
                }
                b(new adko(i3, i));
                this.d++;
            }
        }
    }

    @Override // defpackage.adhu
    public final int h() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.adhu
    public final void i(adjc adjcVar) {
        Map map = this.b;
        ImageView imageViewI = adjcVar.i();
        Integer num = (Integer) map.get(imageViewI);
        if (num != null) {
            int iIntValue = num.intValue();
            imageViewI.getWidth();
            imageViewI.getHeight();
            b(new adkn(iIntValue));
            c(imageViewI);
        }
    }

    @Override // defpackage.adhu
    public final void j(ImageView imageView) {
        throw null;
    }
}
