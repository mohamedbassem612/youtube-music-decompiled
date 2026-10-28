package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.libraries.youtube.media.interfaces.AutocropCalculator;
import com.google.android.libraries.youtube.media.interfaces.AutocropFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdj {
    public final Object a;
    public Object b;

    public zdj(int i, oml omlVar, View view, ofe ofeVar) {
        omlVar.getClass();
        this.a = new ofj(i, omlVar, view, new rsc(this), ofeVar);
    }

    public final aqsj a() {
        aqsu aqsuVar = (aqsu) this.a;
        aqsk aqskVar = aqsuVar.c;
        if (aqskVar == null) {
            aqskVar = aqsk.a;
        }
        if ((aqskVar.b & 1) == 0) {
            return null;
        }
        aqsk aqskVar2 = aqsuVar.c;
        if (aqskVar2 == null) {
            aqskVar2 = aqsk.a;
        }
        aqsj aqsjVar = aqskVar2.c;
        return aqsjVar == null ? aqsj.a : aqsjVar;
    }

    public final void b() {
        aqsu aqsuVar = (aqsu) this.a;
        if ((aqsuVar.b & 32) != 0) {
            aqrz aqrzVar = aqsuVar.f;
            if (aqrzVar == null) {
                aqrzVar = aqrz.a;
            }
            if (aqrzVar.b == null) {
                akdd akddVar = akdd.a;
            }
        }
    }

    public final void c() {
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, vxe] */
    public final void d() {
        HashMap map = new HashMap();
        Object obj = this.b;
        if (obj != null) {
            Bitmap.Config config = ((Bitmap) obj).getConfig();
            if (config != null) {
                map.put("dialog_bitmap", ((Bitmap) this.b).copy(config, true));
            }
            c();
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(arbc.a, araz.a);
        this.a.c((ajwo) aihhVar.build(), map);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final awly e() {
        if (this.b == null) {
            this.b = ((vxz) this.a.io()).l(23, 45798642L, false) ? new awli().az() : new awlo().az();
        }
        return (awly) this.b;
    }

    public final void f(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            tuk.l((View) this.a, false);
            return;
        }
        if (this.b == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.b = gradientDrawable;
            ((View) this.a).setBackground(gradientDrawable);
        }
        if (length == 1) {
            iArr = new int[]{iArr[0], iArr[0]};
        }
        ((GradientDrawable) this.b).setColors(iArr);
        tuk.l((View) this.a, true);
    }

    public final File g() {
        File file = (File) this.a;
        return new File(file.getParentFile(), String.valueOf(file.getName()).concat(".tmp"));
    }

    public final void h(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        Object objG = this.b;
        if (objG == null) {
            objG = g();
        }
        File file = (File) objG;
        if (file.exists()) {
            file.delete();
        }
        this.b = null;
    }

    public final ofg i() {
        return ((ofj) this.a).a(ogj.ABANDON);
    }

    public final ofg j() {
        return ((ofj) this.a).a(ogj.COMPLETE);
    }

    public final ofg k() {
        return ((ofj) this.a).a(ogj.EXIT_FULLSCREEN);
    }

    public final ofg l() {
        return ((ofj) this.a).a(ogj.FULLSCREEN);
    }

    public final ofg m() {
        return ((ofj) this.a).a(ogj.START);
    }

    public final ofg n() {
        return ((ofj) this.a).a(ogj.PAUSE);
    }

    public final ofg o() {
        return ((ofj) this.a).a(ogj.RESUME);
    }

    public final ofg p(int i) {
        if (i == 1) {
            return ((ofj) this.a).a(ogj.FIRST_QUARTILE);
        }
        if (i == 2) {
            return ((ofj) this.a).a(ogj.MIDPOINT);
        }
        if (i != 3) {
            return null;
        }
        return ((ofj) this.a).a(ogj.THIRD_QUARTILE);
    }

    public final ofg q() {
        return ((ofj) this.a).a(ogj.SKIP);
    }

    public final void r() {
        ogh oghVar = ((ofj) this.a).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    public final void s() {
        Application applicationA;
        ?? r2 = this.a;
        ofj ofjVar = (ofj) r2;
        ofjVar.b.c();
        oml omlVar = ofjVar.c;
        if (omlVar == null || (applicationA = omlVar.a()) == 0) {
            return;
        }
        applicationA.unregisterActivityLifecycleCallbacks(r2);
    }

    public final void t() {
        ((ofj) this.a).a(ogj.SUSPEND);
    }

    public zdj(File file) {
        this.a = file;
    }

    public zdj(Object obj) {
        this.a = obj;
    }

    public zdj(twp twpVar, zcf zcfVar) {
        this.b = twpVar;
        this.a = zcfVar;
    }

    public zdj() {
        meg.a();
        this.a = AutocropCalculator.create();
        this.b = new AutocropFormat(0, 0);
    }

    public zdj(Context context) {
        this.b = null;
        this.a = context;
    }

    public zdj(Context context, aaok aaokVar) {
        context.getClass();
        aaokVar.getClass();
        this.a = aaokVar;
    }

    public zdj(aqsu aqsuVar) {
        aqsuVar.getClass();
        this.a = aqsuVar;
    }

    public zdj(int i, ofe ofeVar) {
        this.a = new ofj(i, new rsc(this), ofeVar);
    }
}
