package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bau extends bbb {
    private static Field a = null;
    private static boolean e = false;
    private static Constructor f = null;
    private static boolean g = false;
    private WindowInsets h;
    private avw i;

    public bau() {
        this.h = j();
    }

    private static WindowInsets j() {
        if (!e) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            e = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!g) {
            try {
                f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            g = true;
        }
        Constructor constructor = f;
        if (constructor == null) {
            return null;
        }
        try {
            return (WindowInsets) constructor.newInstance(new Rect());
        } catch (ReflectiveOperationException unused4) {
            return null;
        }
    }

    @Override // defpackage.bbb
    public bbn a() {
        i();
        bbn bbnVarO = bbn.o(this.h, null);
        bbnVarO.r(this.b);
        bbnVarO.b.z(this.i);
        bbnVarO.q(null);
        bbnVarO.u(this.c);
        bbnVarO.v(this.d);
        return bbnVarO;
    }

    @Override // defpackage.bbb
    public void b(avw avwVar) {
        this.i = avwVar;
    }

    @Override // defpackage.bbb
    public void c(avw avwVar) {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            this.h = windowInsets.replaceSystemWindowInsets(avwVar.b, avwVar.c, avwVar.d, avwVar.e);
        }
    }

    public bau(bbn bbnVar) {
        super(bbnVar);
        this.h = bbnVar.e();
    }
}
