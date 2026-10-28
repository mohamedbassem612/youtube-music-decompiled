package defpackage;

import android.content.res.Resources;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abhx implements abhw {
    protected final hyt a;
    private final Resources b;
    private final abvk c;

    public abhx(Resources resources, abvk abvkVar, hyt hytVar) {
        resources.getClass();
        this.b = resources;
        this.c = abvkVar;
        hytVar.getClass();
        this.a = hytVar;
        hytVar.b = this;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [abwy, java.lang.Object] */
    @Override // defpackage.abhw
    public final void b(int i) {
        abvk abvkVar = this.c;
        if (abvkVar.i.bb()) {
            abvkVar.v.a.f(new abxl(i, awnq.a, aipc.QUALITY_ORDINAL_UNKNOWN));
            return;
        }
        ?? r3 = abvkVar.o.d;
        if (r3 != 0) {
            r3.X(i);
        }
    }

    @tcc
    public void handleFormatStreamChangeEvent(yvu yvuVar) {
        wgs wgsVar = yvuVar.c;
        if (wgsVar != null) {
            hyt hytVar = this.a;
            hytVar.c(yvuVar.a());
            if (yvuVar.a()) {
                wiw[] wiwVarArr = yvuVar.g;
                int length = wiwVarArr.length;
                int i = length + 1;
                wiw[] wiwVarArr2 = new wiw[i];
                wiwVarArr2[0] = new wiw(-2, aipc.QUALITY_ORDINAL_UNKNOWN, this.b.getString(R.string.quality_auto), false);
                System.arraycopy(wiwVarArr, 0, wiwVarArr2, 1, length);
                int iF = wgsVar.f();
                int iE = wgsVar.e();
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        i2 = -1;
                        break;
                    } else if (wiwVarArr2[i2].a == iF) {
                        break;
                    } else {
                        i2++;
                    }
                }
                for (int i3 = 0; i3 < i; i3++) {
                    if (!wiwVarArr2[i3].d.isEmpty() && wiwVarArr2[i3].d.contains(Integer.valueOf(iE))) {
                        i2 = i3;
                        break;
                    }
                }
                hytVar.d(wiwVarArr2, i2, !yvuVar.i.e());
            }
        }
    }
}
